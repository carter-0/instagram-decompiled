package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.util.List;

/* renamed from: X.AqP  reason: case insensitive filesystem */
public final class C41227AqP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ SurfaceTexture A03;
    public final /* synthetic */ AJ3 A04;

    public C41227AqP(SurfaceTexture surfaceTexture, AJ3 aj3, int i, int i2, int i3) {
        this.A04 = aj3;
        this.A03 = surfaceTexture;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    public final void run() {
        C345937uK r0;
        AJ3 aj3 = this.A04;
        if (aj3.A08 == null || aj3.A0F == null) {
            0KC.A0C("BoomerangFramesHandlerImpl", "gl resources unavailable while trimming");
            return;
        }
        if (aj3.A06 == null || (r0 = aj3.A0A) == null) {
            Surface surface = new Surface(this.A03);
            aj3.A06 = surface;
            r0 = aj3.A08.AMY(surface);
            aj3.A0A = r0;
        }
        r0.A05();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.A00;
            if (i < i3) {
                float f = (float) i3;
                int i4 = i + 1;
                int i5 = ((int) ((((float) this.A02) / f) * ((float) i4))) - i2;
                GLES20.glViewport(i2, 0, i5, this.A01);
                float f2 = ((float) i) / f;
                List list = aj3.A0T;
                C369008tg r02 = (C369008tg) list.get(AnonymousClass7TE.A05(f2, (float) (list.size() - 1)));
                try {
                    AHA aha = aj3.A0F;
                    C368538so r4 = aj3.A0O;
                    r4.A01(r02.A03, aj3.A0X, 0);
                    aha.A04(r4);
                    i2 += i5;
                    i = i4;
                } catch (C381259bR unused) {
                    0KC.A0C("BoomerangFramesHandlerImplOOM", Pxd.A00(860));
                    return;
                }
            } else {
                aj3.A0A.A03();
                return;
            }
        }
    }
}
