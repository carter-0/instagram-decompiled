package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.util.List;

/* renamed from: X.AqO  reason: case insensitive filesystem */
public final class C41226AqO implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ SurfaceTexture A03;
    public final /* synthetic */ AJ3 A04;

    public C41226AqO(SurfaceTexture surfaceTexture, AJ3 aj3, float f, int i, int i2) {
        this.A04 = aj3;
        this.A03 = surfaceTexture;
        this.A00 = f;
        this.A02 = i;
        this.A01 = i2;
    }

    public final void run() {
        C345937uK r0;
        AJ3 aj3 = this.A04;
        if (aj3.A08 == null || aj3.A0F == null) {
            0KC.A0C("BoomerangFramesHandlerImpl", "gl resources unavailable while trimming");
            return;
        }
        if (aj3.A07 == null || (r0 = aj3.A0B) == null) {
            Surface surface = new Surface(this.A03);
            aj3.A07 = surface;
            r0 = aj3.A08.AMY(surface);
            aj3.A0B = r0;
        }
        r0.A05();
        List list = aj3.A0T;
        C369008tg r10 = (C369008tg) list.get((int) (((float) (list.size() - 1)) * Math.max(0.0f, Math.min(this.A00, 1.0f))));
        int i = this.A02;
        double d = (double) i;
        int i2 = this.A01;
        double d2 = (double) i2;
        double d3 = ((double) r10.A02) / ((double) r10.A01);
        if (d / d2 > d3) {
            int i3 = (int) (d / d3);
            GLES20.glViewport(0, -((i3 - i2) / 2), i, i3);
        } else {
            int i4 = (int) (d2 * d3);
            GLES20.glViewport(-((i4 - i) / 2), 0, i4, i2);
        }
        AHA aha = aj3.A0F;
        C368538so r4 = aj3.A0O;
        r4.A01(r10.A03, aj3.A0X, 0);
        aha.A04(r4);
        aj3.A0B.A03();
    }
}
