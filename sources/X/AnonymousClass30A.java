package X;

import android.view.View;

/* renamed from: X.30A  reason: invalid class name */
public final class AnonymousClass30A extends C235412zs {
    public float A00;

    public final void ATF(AnonymousClass30Y r7, C252093oY r8) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(r8, 1);
        View view = (View) this.A00.get(r7.A03);
        if (view instanceof C267924cT) {
            C267924cT r4 = (C267924cT) view;
            float CFe = r8.CFe(r7);
            float f = this.A00;
            boolean z = false;
            if (f == 0.0f) {
                z = true;
            }
            if ((z || f == 1.0f) && 0.0f < CFe && CFe < 1.0f) {
                r4.DzB();
            } else if (f < 1.0f && CFe == 1.0f) {
                r4.Dyz();
            } else if (f > 0.0f && CFe == 0.0f) {
                r4.Dz8();
            }
            this.A00 = CFe;
        }
    }
}
