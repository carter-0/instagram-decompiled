package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;

/* renamed from: X.XyC  reason: case insensitive filesystem */
public final class C22254XyC implements B3V {
    public MediaCodec A00;
    public MediaFormat A01;
    public Handler A02;
    public C341687nM A03;
    public Surface A04;
    public String A05;
    public final A9O A06;
    public final StringBuilder A07;
    public final int A08;
    public final MediaCodec.Callback A09 = new C21129XFw(this);
    public final Handler A0A;
    public final C341567nA A0B;
    public final C39800A9v A0C;
    public volatile Integer A0D;

    public final synchronized void Ey5(C341687nM r5, Handler handler) {
        this.A07.append("stop, ");
        Integer num = this.A0D;
        Integer num2 = AnonymousClass05K.A0C;
        if (num == num2 || this.A0D == AnonymousClass05K.A0N) {
            C18097VlR.A01(r5, handler);
        } else if (this.A0D == AnonymousClass05K.A00) {
            A01(handler, r5, this);
        } else {
            this.A0D = num2;
            this.A0A.post(new Y2U(new C22252XyA(handler, new C391719tX(23001, "Timeout while stopping"), r5, this.A08), this));
        }
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

    public static void A01(Handler handler, C341687nM r5, C22254XyC xyC) {
        StringBuilder sb = xyC.A07;
        sb.append("handleFinishedEncoding, ");
        xyC.A03 = null;
        xyC.A02 = null;
        if (r5 != null && handler != null) {
            try {
                Surface surface = xyC.A04;
                if (surface != null) {
                    surface.release();
                }
                MediaCodec mediaCodec = xyC.A00;
                if (mediaCodec != null) {
                    0fX.A06(mediaCodec, 1116409503);
                    0fX.A03(xyC.A00, 420610723);
                }
                xyC.A0D = AnonymousClass05K.A0N;
                xyC.A00 = null;
                xyC.A04 = null;
                xyC.A01 = null;
                sb.append("asyncStop end, ");
                C18097VlR.A01(r5, handler);
            } catch (Exception e) {
                C391719tX r2 = new C391719tX(23001, (Throwable) e);
                A03(r2, xyC, e);
                MediaCodec mediaCodec2 = xyC.A00;
                if (mediaCodec2 != null) {
                    try {
                        0fX.A03(mediaCodec2, 157084351);
                    } catch (Exception unused) {
                    }
                }
                xyC.A0D = AnonymousClass05K.A0N;
                xyC.A00 = null;
                xyC.A04 = null;
                xyC.A01 = null;
                C18097VlR.A00(handler, r2, r5);
            }
        }
    }

    public static void A02(Handler handler, C341687nM r20, C22254XyC xyC, boolean z) {
        C391719tX r2;
        MediaCodec mediaCodec;
        String str;
        String str2;
        C22254XyC xyC2 = xyC;
        StringBuilder sb = xyC2.A07;
        sb.append("(");
        boolean z2 = z;
        sb.append(z2);
        sb.append(",");
        sb.append(xyC2.A05);
        sb.append(")");
        sb.append("asyncPrepare, ");
        Handler handler2 = handler;
        C341687nM r9 = r20;
        if (xyC2.A0D != AnonymousClass05K.A0N) {
            Integer num = xyC2.A0D;
            if (num != null) {
                str2 = XVF.A00(num);
            } else {
                str2 = "null";
            }
            r2 = new C391719tX(23001, 002.A0R("Must only call prepare() on a stopped SurfaceVideoEncoder. Current state is: ", str2));
            r2.A00(TraceFieldType.CurrentState, XVF.A00(xyC2.A0D));
            r2.A00("method_invocation", sb.toString());
        } else {
            try {
                C39800A9v a9v = xyC2.A0C;
                MediaCodec.Callback callback = xyC2.A09;
                C341567nA r14 = xyC2.A0B;
                String str3 = xyC2.A05;
                if ("high".equalsIgnoreCase(a9v.A06)) {
                    MediaFormat mediaFormat = null;
                    try {
                        mediaFormat = A00(a9v, str3, true, a9v.A07, a9v.A08);
                        mediaCodec = C9269RVu.A00(callback, mediaFormat, str3);
                    } catch (Exception e) {
                        0KC.A0H("AsyncSurfaceVideoEncoderImpl", "Error getting video encoder for high profile. Fall back to baseline", e);
                        C391719tX r15 = new C391719tX(002.A0R("Failed to create high profile encoder, mime=", str3), e, 23001);
                        r14.Ew8("AsyncSurfaceVideoEncoderImpl", r15, false);
                        HashMap A1E = AnonymousClass7TE.A1E();
                        A1E.put("recording_video_encoder_config", a9v.toString());
                        if (mediaFormat == null) {
                            str = "null";
                        } else {
                            str = mediaFormat.toString();
                        }
                        A1E.put(AnonymousClass000.A00(1740), str);
                        r14.Cjv(r15, AnonymousClass000.A00(1699), "AsyncSurfaceVideoEncoderImpl", "", "createMediaCodec", A1E, (long) r14.hashCode());
                    }
                    xyC2.A00 = mediaCodec;
                    xyC2.A04 = mediaCodec.createInputSurface();
                    xyC2.A0D = AnonymousClass05K.A00;
                    sb.append("asyncPrepare end, ");
                    C18097VlR.A01(r9, handler2);
                    return;
                }
                mediaCodec = C9269RVu.A00(callback, A00(a9v, str3, false, false, a9v.A08), str3);
                xyC2.A00 = mediaCodec;
                xyC2.A04 = mediaCodec.createInputSurface();
                xyC2.A0D = AnonymousClass05K.A00;
                sb.append("asyncPrepare end, ");
                C18097VlR.A01(r9, handler2);
                return;
            } catch (Exception e2) {
                if (z2) {
                    String str4 = xyC2.A05;
                    if ("video/av01".equals(str4)) {
                        xyC2.A05 = "video/hevc";
                        str4 = "video/hevc";
                    }
                    if ("video/hevc".equals(str4)) {
                        xyC2.A05 = "video/avc";
                    }
                    xyC2.A0B.Ew8("AsyncSurfaceVideoEncoderImpl", new C391719tX("Failed to prepare, retrying", e2, 23001), false);
                    A02(handler2, r9, xyC2, !"video/avc".equals(xyC2.A05));
                    return;
                }
                r2 = new C391719tX(23001, (Throwable) e2);
                A03(r2, xyC2, e2);
            }
        }
        C18097VlR.A00(handler2, r2, r9);
    }

    public static void A03(C391719tX r2, C22254XyC xyC, Exception exc) {
        r2.A00(TraceFieldType.CurrentState, XVF.A00(xyC.A0D));
        r2.A00("method_invocation", xyC.A07.toString());
        C21056XCh.A0H(r2, xyC.A0C, exc);
    }

    public final void E3o(C341687nM r3, Handler handler) {
        this.A07.append("prepare, ");
        this.A0A.post(new Y3F(handler, r3, this));
    }

    public final void EwJ(C341687nM r3, Handler handler) {
        this.A07.append("start, ");
        this.A0A.post(new Y3E(handler, r3, this));
    }

    public C22254XyC(Handler handler, C341567nA r4, A9O a9o, C39800A9v a9v, String str, int i) {
        this.A0C = a9v;
        this.A06 = a9o;
        this.A0A = handler;
        this.A08 = i;
        this.A0B = r4;
        this.A05 = str;
        this.A0D = AnonymousClass05K.A0N;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        this.A07 = A1A;
        A1A.append(hashCode());
        A1A.append(" ctor, ");
    }

    public final Surface BHX() {
        return this.A04;
    }

    public final MediaFormat BZV() {
        return this.A01;
    }
}
