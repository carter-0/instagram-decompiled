package com.facebook.mediastreaming.opt.muxer;

import X.0KC;
import X.0dV;
import X.0qQ;
import X.17k;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C16591Uxl;
import X.C17412VUr;
import X.DbW;
import X.V1d;
import X.V1e;
import X.V1f;
import X.V63;
import X.W1Q;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import java.io.File;
import java.nio.ByteBuffer;

public final class AndroidPlatformMediaMuxerHybrid extends StreamingHybridClassBase {
    public static final V63 Companion = new Object();
    public W1Q impl;

    public final void muxAudioData(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j, MediaFormat mediaFormat) {
        ByteBuffer byteBuffer2 = byteBuffer;
        MediaFormat mediaFormat2 = mediaFormat;
        DbW.A1O(byteBuffer, 0, mediaFormat2);
        W1Q w1q = this.impl;
        if (w1q != null) {
            w1q.A03(mediaFormat2, AnonymousClass05K.A00, byteBuffer2, i, i2, i3, i4, j);
        }
    }

    public final void muxVideoData(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j, MediaFormat mediaFormat) {
        ByteBuffer byteBuffer2 = byteBuffer;
        MediaFormat mediaFormat2 = mediaFormat;
        DbW.A1O(byteBuffer, 0, mediaFormat2);
        W1Q w1q = this.impl;
        if (w1q != null) {
            w1q.A03(mediaFormat2, AnonymousClass05K.A01, byteBuffer2, i, i2, i3, i4, j);
        }
    }

    public native void requestRestartVideoEncoder();

    /* JADX WARNING: type inference failed for: r0v0, types: [X.V63, java.lang.Object] */
    static {
        0dV.A0C("mediastreaming");
    }

    public final void cleanOutputFile() {
        W1Q w1q = this.impl;
        if (w1q != null) {
            File file = w1q.A0F;
            if (file != null) {
                file.delete();
            }
            w1q.A0F = null;
        }
    }

    public final int getMuxState() {
        W1Q w1q = this.impl;
        if (w1q != null) {
            switch (w1q.A0H.intValue()) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                default:
                    return 0;
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }

    public final File getOutputFile() {
        File file;
        W1Q w1q = this.impl;
        if (w1q == null) {
            return null;
        }
        if (w1q.A0F != null && ((file = w1q.A0F) == null || file.length() != 0)) {
            return w1q.A0F;
        }
        0KC.A03(W1Q.class, "DVR file is not available or not created");
        return null;
    }

    public void onFailed(String str, Throwable th) {
        C16591Uxl uxl;
        if (th instanceof V1e) {
            uxl = C16591Uxl.DvrNoEnoughDiskSpaceError;
        } else if (th instanceof V1f) {
            uxl = C16591Uxl.DvrExceedMaxSizeError;
        } else if (th instanceof V1d) {
            uxl = C16591Uxl.DvrBigAVGapError;
        } else {
            uxl = C16591Uxl.MuxerError;
        }
        fireError(uxl, str, th);
    }

    public final void prepare(boolean z, int i, int i2, int i3) {
        W1Q w1q = this.impl;
        if (w1q != null) {
            w1q.A02 = (long) i;
            w1q.A03 = (long) i2;
            w1q.A00 = i3;
            try {
                if (w1q.A0F == null) {
                    w1q.A0F = w1q.A0D.createTempFile("video_transcode", ".mp4", z);
                }
                if (w1q.A0F != null) {
                    W1Q.A00(w1q);
                    w1q.A0H = AnonymousClass05K.A01;
                    boolean z2 = !w1q.A0K;
                    Exception exc = w1q.A0G;
                    if (!z2) {
                        w1q.A0B.onFailed("Failed to prepare muxer", exc);
                        return;
                    }
                    return;
                }
                throw new RuntimeException("Unable to create output file.");
            } catch (Exception e) {
                W1Q.A01(w1q, e);
            }
        }
    }

    public final void stop() {
        Integer num;
        IllegalStateException illegalStateException;
        W1Q w1q = this.impl;
        if (w1q != null) {
            synchronized (w1q) {
                if (w1q.A0J) {
                    try {
                        C17412VUr vUr = w1q.A0C;
                        MediaMuxer mediaMuxer = vUr.A02;
                        if (mediaMuxer != null) {
                            mediaMuxer.stop();
                            MediaMuxer mediaMuxer2 = vUr.A02;
                            if (mediaMuxer2 != null) {
                                mediaMuxer2.release();
                            } else {
                                illegalStateException = new IllegalStateException("Required value was null.");
                            }
                        } else {
                            illegalStateException = new IllegalStateException("Required value was null.");
                        }
                        throw illegalStateException;
                    } catch (Exception e) {
                        W1Q.A01(w1q, e);
                        0KC.A05(W1Q.class, "LiveStreamMux Error stopping muxer ", e);
                    }
                } else {
                    0KC.A03(W1Q.class, "LiveStreamMux Never started muxer...Nothing to stop ");
                }
                if (!w1q.A0K) {
                    num = AnonymousClass05K.A0Y;
                } else if (w1q.A0G instanceof V1e) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A0N;
                }
                w1q.A0H = num;
                w1q.A0I = false;
                w1q.A0M = false;
                w1q.A0J = false;
            }
        }
    }

    public final void configure(TempFileCreator tempFileCreator, CodecMuxerFactory codecMuxerFactory) {
        AnonymousClass7TG.A1N(tempFileCreator, codecMuxerFactory);
        17k.A0F(DbW.A1a(this.impl));
        C17412VUr createMuxer = codecMuxerFactory.createMuxer();
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        0qQ.A07(awakeTimeSinceBootClock);
        this.impl = new W1Q(awakeTimeSinceBootClock, this, createMuxer, tempFileCreator);
    }

    public AndroidPlatformMediaMuxerHybrid(HybridData hybridData) {
        super(hybridData);
    }
}
