package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.XyB  reason: case insensitive filesystem */
public final class C22253XyB implements B3V {
    public MediaCodec A00;
    public MediaFormat A01;
    public Surface A02;
    public boolean A03 = true;
    public String A04;
    public final Handler A05;
    public final StringBuilder A06;
    public final int A07;
    public final C341567nA A08;
    public final A9O A09;
    public final C39800A9v A0A;
    public volatile Integer A0B = AnonymousClass05K.A0N;
    public volatile boolean A0C;

    public static void A03(C22253XyB xyB, boolean z) {
        long j = 0;
        try {
            MediaCodec mediaCodec = xyB.A00;
            mediaCodec.getClass();
            ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (true) {
                if (xyB.A0B == AnonymousClass05K.A01 || (xyB.A0B == AnonymousClass05K.A0C && z)) {
                    int dequeueOutputBuffer = xyB.A00.dequeueOutputBuffer(bufferInfo, 1000);
                    if (bufferInfo.size > 0 || (bufferInfo.flags & 4) == 0) {
                        if (dequeueOutputBuffer != -1) {
                            if (dequeueOutputBuffer != -3) {
                                if (dequeueOutputBuffer != -2) {
                                    if (dequeueOutputBuffer >= 0) {
                                        ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                                        if (byteBuffer != null) {
                                            byteBuffer.position(bufferInfo.offset).limit(bufferInfo.size);
                                            if ((bufferInfo.flags & 2) != 0) {
                                                bufferInfo.flags = 2;
                                            }
                                            if (bufferInfo.size > 0) {
                                                xyB.A09.A00(bufferInfo, byteBuffer);
                                            }
                                            xyB.A00.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            if ((bufferInfo.flags & 4) != 0) {
                                                break;
                                            }
                                            j++;
                                        } else {
                                            if (z) {
                                                xyB.A03 = true;
                                            }
                                            xyB.A09.A01(C21053XCe.A0V("encoderOutputBuffer %d was null", (Locale) null, new Object[]{Integer.valueOf(dequeueOutputBuffer)}), (Map) null);
                                            return;
                                        }
                                    } else {
                                        if (z) {
                                            xyB.A03 = true;
                                        }
                                        xyB.A09.A01(C21053XCe.A0V("Unexpected result from encoder.dequeueOutputBuffer: %d", (Locale) null, new Object[]{Integer.valueOf(dequeueOutputBuffer)}), (Map) null);
                                        return;
                                    }
                                } else {
                                    xyB.A01 = xyB.A00.getOutputFormat();
                                }
                            } else {
                                outputBuffers = xyB.A00.getOutputBuffers();
                            }
                        }
                    } else {
                        xyB.A00.releaseOutputBuffer(dequeueOutputBuffer, false);
                        break;
                    }
                } else {
                    return;
                }
            }
            xyB.A03 = true;
        } catch (Exception e) {
            if (z) {
                xyB.A03 = true;
            }
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put(TraceFieldType.CurrentState, XVF.A00(xyB.A0B));
            A1E.put("is_end_of_stream", String.valueOf(z));
            A1E.put("frames_processed", String.valueOf(0));
            A1E.put("method_invocation", xyB.A06.toString());
            if (e instanceof MediaCodec.CodecException) {
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) e;
                A1E.put("isRecoverable", String.valueOf(codecException.isRecoverable()));
                A1E.put("isTransient", String.valueOf(codecException.isTransient()));
            }
            xyB.A09.A01(e, A1E);
        }
    }

    public final synchronized void Ey5(C341687nM r5, Handler handler) {
        this.A06.append("stop, ");
        this.A0C = AnonymousClass7TF.A1W(this.A0B, AnonymousClass05K.A01);
        this.A0B = AnonymousClass05K.A0C;
        this.A05.post(new Y2V(new C22252XyA(handler, new C391719tX(23001, "Timeout while stopping"), r5, this.A07), this));
    }

    public static MediaFormat A00(C39800A9v a9v, String str, boolean z, boolean z2, boolean z3) {
        int i;
        String str2;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, a9v.A05, a9v.A04);
        boolean A1a = C21055XCg.A1a(createVideoFormat, a9v);
        if ("video/av01".equals(str)) {
            if (Build.VERSION.SDK_INT >= 29) {
                createVideoFormat.setInteger("profile", A1a);
                i = 512;
            } else {
                throw new RuntimeException(002.A0c("Attempting to configure AV1 codec on API level ", " (<29)", 28));
            }
        } else if ("video/hevc".equals(str)) {
            C21055XCg.A0a(createVideoFormat, a9v, A1a);
            return createVideoFormat;
        } else {
            i = 256;
            if (z) {
                createVideoFormat.setInteger("profile", 8);
                createVideoFormat.setInteger("level", 256);
                if (z2) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        str2 = "max-bframes";
                    } else {
                        str2 = "latency";
                    }
                    createVideoFormat.setInteger(str2, A1a);
                    return createVideoFormat;
                }
            } else if (z3) {
                createVideoFormat.setInteger("profile", A1a ? 1 : 0);
            }
            return createVideoFormat;
        }
        createVideoFormat.setInteger("level", i);
        return createVideoFormat;
    }

    public static void A01(Handler handler, C341687nM r20, C22253XyB xyB, boolean z) {
        C391719tX r2;
        MediaCodec mediaCodec;
        String str;
        MediaFormat A002;
        String str2;
        C22253XyB xyB2 = xyB;
        StringBuilder sb = xyB2.A06;
        sb.append("(");
        boolean z2 = z;
        sb.append(z2);
        sb.append(",");
        sb.append(xyB2.A04);
        sb.append(")");
        sb.append("asyncPrepare, ");
        Handler handler2 = handler;
        C341687nM r9 = r20;
        if (xyB2.A0B != AnonymousClass05K.A0N) {
            Integer num = xyB2.A0B;
            if (num != null) {
                str2 = XVF.A00(num);
            } else {
                str2 = "null";
            }
            r2 = new C391719tX(23001, 002.A0R("Must only call prepare() on a stopped SurfaceVideoEncoder. Current state is: ", str2));
            r2.A00(TraceFieldType.CurrentState, XVF.A00(xyB2.A0B));
            r2.A00("method_invocation", sb.toString());
        } else {
            try {
                C39800A9v a9v = xyB2.A0A;
                C341567nA r14 = xyB2.A08;
                String str3 = xyB2.A04;
                if ("high".equalsIgnoreCase(a9v.A06)) {
                    try {
                        A002 = A00(a9v, str3, true, a9v.A07, a9v.A08);
                        mediaCodec = C9269RVu.A00((MediaCodec.Callback) null, A002, str3);
                    } catch (Exception e) {
                        0KC.A0H("SurfaceVideoEncoderImpl", "Error getting video encoder for high profile. Fall back to baseline", e);
                        C391719tX r15 = new C391719tX(002.A0R("Failed to create high profile encoder, mime=", str3), e, 23001);
                        r14.Ew8("SurfaceVideoEncoderImpl", r15, false);
                        HashMap A1E = AnonymousClass7TE.A1E();
                        A1E.put("recording_video_encoder_config", a9v.toString());
                        if (A002 == null) {
                            str = "null";
                        } else {
                            str = A002.toString();
                        }
                        A1E.put(AnonymousClass000.A00(1740), str);
                        r14.Cjv(r15, AnonymousClass000.A00(1699), "SurfaceVideoEncoderImpl", "", "createMediaCodec", A1E, (long) r14.hashCode());
                    }
                    xyB2.A00 = mediaCodec;
                    xyB2.A02 = mediaCodec.createInputSurface();
                    xyB2.A03 = true;
                    xyB2.A0B = AnonymousClass05K.A00;
                    sb.append("asyncPrepare end, ");
                    C18097VlR.A01(r9, handler2);
                    return;
                }
                mediaCodec = C9269RVu.A00((MediaCodec.Callback) null, A00(a9v, str3, false, false, a9v.A08), str3);
                xyB2.A00 = mediaCodec;
                xyB2.A02 = mediaCodec.createInputSurface();
                xyB2.A03 = true;
                xyB2.A0B = AnonymousClass05K.A00;
                sb.append("asyncPrepare end, ");
                C18097VlR.A01(r9, handler2);
                return;
            } catch (Exception e2) {
                if (z2) {
                    String str4 = xyB2.A04;
                    if ("video/av01".equals(str4)) {
                        xyB2.A04 = "video/hevc";
                        str4 = "video/hevc";
                    }
                    if ("video/hevc".equals(str4)) {
                        xyB2.A04 = "video/avc";
                    }
                    xyB2.A08.Ew8("SurfaceVideoEncoderImpl", new C391719tX("Failed to prepare, retrying", e2, 23001), false);
                    A01(handler2, r9, xyB2, !"video/avc".equals(xyB2.A04));
                    return;
                }
                r2 = new C391719tX(23001, (Throwable) e2);
                A02(r2, xyB2, e2);
            }
        }
        C18097VlR.A00(handler2, r2, r9);
    }

    public static void A02(C391719tX r2, C22253XyB xyB, Exception exc) {
        r2.A00(TraceFieldType.CurrentState, XVF.A00(xyB.A0B));
        r2.A00("method_invocation", xyB.A06.toString());
        C21056XCh.A0H(r2, xyB.A0A, exc);
    }

    public final void E3o(C341687nM r3, Handler handler) {
        this.A06.append("prepare, ");
        this.A05.post(new Y3G(handler, r3, this));
    }

    public final void EwJ(C341687nM r3, Handler handler) {
        this.A06.append("start, ");
        this.A05.post(new Y3H(handler, r3, this));
    }

    public C22253XyB(Handler handler, C341567nA r4, A9O a9o, C39800A9v a9v, String str, int i) {
        this.A0A = a9v;
        this.A09 = a9o;
        this.A05 = handler;
        this.A07 = i;
        this.A08 = r4;
        this.A04 = str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        this.A06 = A1A;
        A1A.append(hashCode());
        A1A.append(" ctor, ");
    }

    public final Surface BHX() {
        return this.A02;
    }

    public final MediaFormat BZV() {
        return this.A01;
    }
}
