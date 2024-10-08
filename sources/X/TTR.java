package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.util.List;

public final class TTR extends 0Yg implements C62320sa {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ SurfaceTexture A03;
    public final /* synthetic */ I09 A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTR(SurfaceTexture surfaceTexture, I09 i09, float f, int i, int i2) {
        super(0);
        this.A04 = i09;
        this.A03 = surfaceTexture;
        this.A00 = f;
        this.A02 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C345937uK r0;
        String str;
        C11443SVf sVf = this.A04.A00;
        if (sVf == null) {
            str = "framesHandler";
        } else {
            SurfaceTexture surfaceTexture = this.A03;
            float f = this.A00;
            int i = this.A02;
            int i2 = this.A01;
            if (sVf.A0O.get() == 5) {
                0KC.A0C("DecoderOutputSurfaceHandler", "gl resources already destroyed while trimming");
            } else {
                if (sVf.A05 == null || (r0 = sVf.A09) == null) {
                    Surface surface = new Surface(surfaceTexture);
                    sVf.A05 = surface;
                    C344587s6 r02 = sVf.A06;
                    if (r02 == null) {
                        str = "selfEGLCore";
                    } else {
                        r0 = r02.AMY(surface);
                        sVf.A09 = r0;
                    }
                }
                if (r0 != null) {
                    r0.A05();
                    List list = sVf.A0N;
                    C369008tg r7 = (C369008tg) list.get((int) (((float) C51966G9m.A06(list)) * Pxi.A01(f, 1.0f, 0.0f)));
                    double d = (double) i;
                    double d2 = (double) i2;
                    double d3 = ((double) r7.A02) / ((double) r7.A01);
                    if (d / d2 > d3) {
                        int i3 = (int) (d / d3);
                        GLES20.glViewport(0, -((i3 - i2) / 2), i, i3);
                    } else {
                        int i4 = (int) (d2 * d3);
                        GLES20.glViewport(-((i4 - i) / 2), 0, i4, i2);
                    }
                    AHA aha = sVf.A0D;
                    if (aha == null) {
                        str = "boomerangFramesGLRenderer";
                    } else {
                        C368538so r4 = sVf.A0K;
                        r4.A01(r7.A03, sVf.A0Q, 0);
                        aha.A04(r4);
                        C345937uK r03 = sVf.A09;
                        if (r03 != null) {
                            r03.A03();
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            return C60340gF.A00;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
