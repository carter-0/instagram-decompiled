package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class SSS {
    public int A00 = -1;
    public MediaCodec A01;
    public MediaMuxer A02;
    public Surface A03;
    public C13772Tgl A04;
    public Q7n A05;
    public C343967r6 A06;
    public boolean A07 = false;
    public final MediaCodec.BufferInfo A08 = new MediaCodec.BufferInfo();
    public volatile boolean A09 = false;

    public static void A01(SSS sss, Exception exc, String str) {
        sss.A09 = false;
        0KC.A0F("BoomerangEncoder", str, exc);
        C13772Tgl tgl = sss.A04;
        if (tgl != null) {
            tgl.DC1(exc, str);
        }
    }

    public final synchronized void A04(String str) {
        if (this.A05 == null) {
            HandlerThread A0I = Pxf.A0I("BurstFramesEncoderThread");
            A0I.start();
            Looper looper = A0I.getLooper();
            looper.getClass();
            Q7n q7n = new Q7n(looper, this);
            this.A05 = q7n;
            Message obtainMessage = q7n.obtainMessage(1, str);
            obtainMessage.arg1 = 0;
            this.A05.sendMessage(obtainMessage);
        } else {
            throw AnonymousClass7TE.A0z("startVideoEncoding() is called more than once!");
        }
    }

    public final boolean A05(int i, int i2, int i3, int i4) {
        if (i4 < 1) {
            try {
                this.A01 = 0fX.A02("video/avc", -1994066217);
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
                createVideoFormat.setInteger(TraceFieldType.Bitrate, i3);
                createVideoFormat.setInteger("i-frame-interval", 1);
                createVideoFormat.setInteger("max-input-size", 0);
                createVideoFormat.setInteger("color-format", 2130708361);
                createVideoFormat.setInteger("frame-rate", 30);
                0fX.A07(this.A01, (MediaCrypto) null, createVideoFormat, (Surface) null, 1, -1726113650);
                this.A03 = this.A01.createInputSurface();
                return true;
            } catch (IOException e) {
                0KC.A0F("BoomerangEncoder", "Cannot create encoder!", e);
                if (!(this.A04 == null || e.getMessage() == null)) {
                    this.A04.DC1(e, e.getMessage());
                }
            } catch (IllegalStateException e2) {
                A02(this, e2);
                return false;
            } catch (IllegalArgumentException unused) {
                return A05(i, i2, i3, 1);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.SSS r3) {
        /*
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0051
            android.media.MediaCodec r0 = r3.A01
            if (r0 == 0) goto L_0x0051
            r2 = 0
            r0.signalEndOfInputStream()     // Catch:{ IllegalStateException -> 0x0016 }
            r0 = 1
            A03(r3, r0)     // Catch:{ IllegalStateException -> 0x0016 }
            android.media.MediaCodec r0 = r3.A01     // Catch:{ IllegalStateException -> 0x0016 }
            r0.flush()     // Catch:{ IllegalStateException -> 0x0016 }
            goto L_0x001a
        L_0x0016:
            r0 = move-exception
            A02(r3, r0)     // Catch:{ all -> 0x004d }
        L_0x001a:
            r3.A09 = r2
            X.7r6 r1 = r3.A06     // Catch:{ Exception -> 0x003a }
            if (r1 == 0) goto L_0x0031
            r0 = 120(0x78, float:1.68E-43)
            boolean r0 = r1.CTO(r0)     // Catch:{ Exception -> 0x003a }
            if (r0 == 0) goto L_0x0031
            android.media.MediaCodec r0 = r3.A01     // Catch:{ Exception -> 0x003a }
            java.lang.Exception r0 = X.C11292SKa.A01(r0)     // Catch:{ Exception -> 0x003a }
            if (r0 == 0) goto L_0x0040
            throw r0     // Catch:{ Exception -> 0x003a }
        L_0x0031:
            android.media.MediaCodec r1 = r3.A01     // Catch:{ Exception -> 0x003a }
            r0 = 1342025506(0x4ffdaf22, float:8.5122263E9)
            X.0fX.A06(r1, r0)     // Catch:{ Exception -> 0x003a }
            goto L_0x0040
        L_0x003a:
            r1 = move-exception
            java.lang.String r0 = "MediaCodec.stop() Error"
            A01(r3, r1, r0)
        L_0x0040:
            r3.A07 = r2
            r0 = -1
            r3.A00 = r0
            X.Tgl r0 = r3.A04
            if (r0 == 0) goto L_0x0051
            r0.DC2()
            return
        L_0x004d:
            r0 = move-exception
            r3.A09 = r2
            throw r0
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SSS.A00(X.SSS):void");
    }

    public static void A02(SSS sss, IllegalStateException illegalStateException) {
        String str;
        if (illegalStateException instanceof MediaCodec.CodecException) {
            str = "MediaCodec.CodecException Error";
        } else {
            str = "IllegalStateException Error";
        }
        A01(sss, illegalStateException, str);
    }

    public static void A03(SSS sss, boolean z) {
        RuntimeException runtimeException;
        if (sss.A09) {
            try {
                MediaCodec mediaCodec = sss.A01;
                if (mediaCodec != null && sss.A02 != null) {
                    loop0:
                    while (true) {
                        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
                        while (true) {
                            MediaCodec mediaCodec2 = sss.A01;
                            MediaCodec.BufferInfo bufferInfo = sss.A08;
                            int dequeueOutputBuffer = mediaCodec2.dequeueOutputBuffer(bufferInfo, 2500);
                            if (dequeueOutputBuffer == -1) {
                                if (!z) {
                                    return;
                                }
                            } else if (dequeueOutputBuffer == -3) {
                                break;
                            } else if (dequeueOutputBuffer == -2) {
                                if (sss.A07) {
                                    runtimeException = Pxg.A0k("video/avc", ": format changed twice");
                                    break loop0;
                                }
                                sss.A00 = sss.A02.addTrack(sss.A01.getOutputFormat());
                                sss.A02.start();
                                sss.A07 = true;
                            } else if (dequeueOutputBuffer < 0) {
                                0KC.A0P("BoomerangEncoder", "unexpected result from encoder.dequeueOutputBuffer: %d", new Object[]{Integer.valueOf(dequeueOutputBuffer)});
                            } else {
                                ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                                if ((bufferInfo.flags & 2) != 0) {
                                    bufferInfo.size = 0;
                                }
                                if (bufferInfo.size != 0) {
                                    if (!sss.A07) {
                                        runtimeException = Pxg.A0k("video/avc", ": muxer hasn't started");
                                        break loop0;
                                    } else {
                                        Pxg.A1D(bufferInfo, byteBuffer);
                                        sss.A02.writeSampleData(sss.A00, byteBuffer, bufferInfo);
                                    }
                                }
                                sss.A01.releaseOutputBuffer(dequeueOutputBuffer, false);
                                if ((bufferInfo.flags & 4) != 0) {
                                    if (!z) {
                                        0KC.A0P("BoomerangEncoder", "%s: reached end of stream unexpectedly", new Object[]{"video/avc"});
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        mediaCodec = sss.A01;
                    }
                    throw runtimeException;
                }
            } catch (IllegalStateException e) {
                A02(sss, e);
            }
        }
    }
}
