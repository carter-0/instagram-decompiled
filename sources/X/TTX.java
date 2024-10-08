package X;

import android.graphics.SurfaceTexture;
import android.graphics.drawable.GradientDrawable;
import android.opengl.GLES20;
import android.view.Surface;
import java.util.List;

public final class TTX extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTX(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        super(0);
        this.A00 = i4;
        this.A05 = obj;
        this.A04 = obj2;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C345937uK r0;
        String str;
        switch (this.A00) {
            case 0:
                C11443SVf sVf = ((I09) this.A05).A00;
                if (sVf != null) {
                    SurfaceTexture surfaceTexture = (SurfaceTexture) this.A04;
                    int i = this.A01;
                    int i2 = this.A03;
                    int i3 = this.A02;
                    0qQ.A0B(surfaceTexture, 0);
                    if (sVf.A0O.get() != 5) {
                        if (sVf.A04 == null || (r0 = sVf.A08) == null) {
                            Surface surface = new Surface(surfaceTexture);
                            C344587s6 r02 = sVf.A06;
                            if (r02 == null) {
                                str = "selfEGLCore";
                            } else {
                                r0 = r02.AMY(surface);
                                sVf.A08 = r0;
                                sVf.A04 = surface;
                            }
                        }
                        if (r0 != null) {
                            r0.A05();
                        }
                        int i4 = 0;
                        int i5 = 0;
                        while (i4 < i) {
                            float f = (float) i;
                            int i6 = i4 + 1;
                            int i7 = ((int) ((((float) i2) / f) * ((float) i6))) - i5;
                            GLES20.glViewport(i5, 0, i7, i3);
                            float f2 = ((float) i4) / f;
                            List list = sVf.A0N;
                            C369008tg r03 = (C369008tg) list.get(AnonymousClass7TE.A05(f2, (float) C51966G9m.A06(list)));
                            try {
                                AHA aha = sVf.A0D;
                                if (aha == null) {
                                    0qQ.A0F("boomerangFramesGLRenderer");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                C368538so r4 = sVf.A0K;
                                r4.A01(r03.A03, sVf.A0Q, 0);
                                aha.A04(r4);
                                i5 += i7;
                                i4 = i6;
                            } catch (C381259bR e) {
                                0KC.A0F("DecoderOutputSurfaceHandler", "renderThumbnailFrames() GlOutOfMemoryException", e);
                                break;
                            }
                        }
                        C345937uK r04 = sVf.A08;
                        if (r04 != null) {
                            r04.A03();
                            break;
                        }
                    } else {
                        0KC.A0C("DecoderOutputSurfaceHandler", "gl resources already destroyed while trimming");
                        break;
                    }
                } else {
                    str = "framesHandler";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 1:
                C3254772o r05 = (C3254772o) this.A05;
                C3254772o.A00(r05);
                C3254772o.A01(r05);
                break;
            default:
                AnonymousClass3Y5 r7 = (AnonymousClass3Y5) this.A04;
                int i8 = this.A01;
                int i9 = this.A03;
                int i10 = this.A02;
                Integer valueOf = Integer.valueOf(i10);
                GradientDrawable gradientDrawable = new GradientDrawable();
                int i11 = 0;
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(i8);
                int A002 = 2Wd.A00(r7.Bnf(), Double.doubleToRawLongBits(1.0d));
                if (valueOf != null) {
                    i11 = i10;
                }
                gradientDrawable.setStroke(A002, i11);
                gradientDrawable.setCornerRadius((float) 2Wd.A00(r7.Bnf(), Double.doubleToRawLongBits((double) i9)));
                return gradientDrawable;
        }
        return C60340gF.A00;
    }
}
