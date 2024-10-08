package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid;
import java.nio.ByteBuffer;

/* renamed from: X.WKt  reason: case insensitive filesystem */
public final class C19086WKt implements C20971X7b {
    public long A00;
    public final int A01;
    public final Object A02;

    public C19086WKt(Object obj, int i) {
        this.A01 = i;
        this.A02 = obj;
    }

    public final void D4I(ByteBuffer byteBuffer) {
        C18078Vl7 vl7;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (this.A01 != 0) {
            0qQ.A0B(byteBuffer2, 0);
            W1X w1x = (W1X) this.A02;
            if (w1x.A0F == AnonymousClass05K.A0C) {
                w1x.A0K = true;
                w1x.A0P.compareAndSet(false, true);
                AndroidPlatformVideoEncoderHybrid androidPlatformVideoEncoderHybrid = w1x.A0N;
                int position = byteBuffer2.position();
                int remaining = byteBuffer2.remaining();
                MediaFormat mediaFormat = w1x.A07;
                if (mediaFormat == null) {
                    MediaCodec mediaCodec = w1x.A06;
                    if (mediaCodec != null) {
                        mediaFormat = mediaCodec.getOutputFormat();
                    } else {
                        mediaFormat = null;
                    }
                }
                androidPlatformVideoEncoderHybrid.onEncoded(byteBuffer2, position, remaining, 0, 0, 2, mediaFormat, true, 0, 0, 0);
                return;
            }
            C18078Vl7 vl72 = w1x.A0D;
            if (vl72 != null) {
                vl72.A0I = byteBuffer2;
                return;
            }
            return;
        }
        0qQ.A0B(byteBuffer2, 0);
        C18759Vzu vzu = (C18759Vzu) this.A02;
        if (vzu.A04 == null || (vl7 = vzu.A07) == null || !vl7.A0B.Cea()) {
            C18078Vl7 vl73 = vzu.A07;
            if (vl73 != null) {
                vl73.A0H = byteBuffer2;
                return;
            }
            return;
        }
        vzu.A09 = true;
        C18759Vzu.A01(vzu, byteBuffer2, 2, 0);
    }

    public final void DGt(X0x x0x) {
        UMm uMm;
        long A0P;
        ByteBuffer byteBuffer;
        UMn uMn;
        X0x x0x2 = x0x;
        if (this.A01 != 0) {
            W1X w1x = (W1X) this.A02;
            if (w1x.A0F == AnonymousClass05K.A0C && w1x.A0K && (x0x2 instanceof UMn) && (uMn = (UMn) x0x2) != null) {
                A0P = uMn.A04;
                if (A0P > this.A00 || uMn.A00 != 0) {
                    C346057uW r3 = w1x.A0C;
                    if (r3 == null) {
                        r3 = new C346057uW();
                    }
                    w1x.A0C = r3;
                    if (A0P > 0) {
                        if (r3 != null) {
                            A0P = r3.A00(A0P);
                        }
                        A0P = AnonymousClass7TE.A0P(A0P);
                    }
                    ByteBuffer byteBuffer2 = uMn.A05;
                    int i = uMn.A00;
                    int i2 = uMn.A01;
                    int i3 = uMn.A03;
                    int i4 = uMn.A02;
                    AndroidPlatformVideoEncoderHybrid androidPlatformVideoEncoderHybrid = w1x.A0N;
                    int position = byteBuffer2.position();
                    int remaining = byteBuffer2.remaining();
                    MediaFormat mediaFormat = w1x.A07;
                    if (mediaFormat == null) {
                        MediaCodec mediaCodec = w1x.A06;
                        if (mediaCodec != null) {
                            mediaFormat = mediaCodec.getOutputFormat();
                        } else {
                            mediaFormat = null;
                        }
                    }
                    MediaFormat mediaFormat2 = mediaFormat;
                    androidPlatformVideoEncoderHybrid.onEncoded(byteBuffer2, position, remaining, A0P, A0P, i, mediaFormat2, true, i2, i3, i4);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            C18759Vzu vzu = (C18759Vzu) this.A02;
            C18078Vl7 vl7 = vzu.A07;
            if (vl7 != null && vl7.A0B.Cea()) {
                if (!vzu.A09 && (byteBuffer = vl7.A0H) != null) {
                    D4I(byteBuffer);
                }
                if ((x0x2 instanceof UMm) && (uMm = (UMm) x0x2) != null && vzu.A09) {
                    long j = uMm.A00;
                    if (j > this.A00) {
                        ByteBuffer byteBuffer3 = uMm.A01;
                        A0P = AnonymousClass7TE.A0P(j);
                        C18759Vzu.A01(vzu, byteBuffer3, 0, A0P);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.A00 = A0P;
    }

    public final void Dvz(0sP r1) {
    }
}
