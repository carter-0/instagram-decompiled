package X;

import android.view.Surface;
import android.view.SurfaceHolder;

public final class ALq implements SurfaceHolder.Callback {
    public final /* synthetic */ C345847uB A00;

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public ALq(C345847uB r1) {
        this.A00 = r1;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C345847uB r3 = this.A00;
        Surface surface = surfaceHolder.getSurface();
        surface.getClass();
        synchronized (r3) {
            C346027uT r1 = r3.A08;
            if (r1 != null) {
                if (r1.A00() != surface) {
                    r1.A01();
                }
                r3.A06 = i2;
                r3.A05 = i3;
                C345847uB.A04(r3, r1, i2, i3);
            }
            r1 = new C346027uT(surface, false);
            r1.A08 = r3.A01;
            r1.A06 = r3.A00;
            r3.A08 = r1;
            C345847uB.A01(r3, r1);
            r3.A06 = i2;
            r3.A05 = i3;
            C345847uB.A04(r3, r1, i2, i3);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C345847uB r3 = this.A00;
        C346027uT r2 = r3.A08;
        if (r2 != null && r2.A00() == surfaceHolder.getSurface()) {
            r3.A08 = null;
            r3.A06 = 0;
            r3.A05 = 0;
            C345847uB.A03(r3, r2);
            r2.A01();
        }
    }
}
