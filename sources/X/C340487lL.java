package X;

import android.view.SurfaceHolder;

/* renamed from: X.7lL  reason: invalid class name and case insensitive filesystem */
public final class C340487lL implements SurfaceHolder.Callback {
    public final /* synthetic */ C340457lI A00;

    public C340487lL(C340457lI r1) {
        this.A00 = r1;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C340457lI r3 = this.A00;
        C340547lR r2 = r3.A01;
        if (!r2.A0G && r3.A03) {
            r2.A0R.A00(r2.A0S).Dh5(i2, i3);
            r3.A01.A05();
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C340457lI r4 = this.A00;
        C340547lR r2 = r4.A01;
        if (!r2.A0G) {
            if (!r4.A03) {
                r4.A03 = true;
                r2.A0R.A00(r2.A0S).Dh7(surfaceHolder.getSurface(), r4.A00.getWidth(), r4.A00.getHeight());
            }
            if (r4.A02) {
                r4.A02 = false;
                r4.A01.A03();
            }
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C340457lI r1 = this.A00;
        if (r1.A03) {
            r1.A03 = false;
            C340547lR r0 = r1.A01;
            r0.A0R.A00(r0.A0S).Dh9(surfaceHolder.getSurface());
        }
    }
}
