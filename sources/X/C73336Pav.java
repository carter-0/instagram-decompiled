package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Pav  reason: case insensitive filesystem */
public final class C73336Pav implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ PMR A01;
    public final /* synthetic */ 0rk A02;

    public C73336Pav(PMR pmr, 0rk r2, int i) {
        this.A01 = pmr;
        this.A02 = r2;
        this.A00 = i;
    }

    public final void run() {
        PMR pmr = this.A01;
        View A0c = AnonymousClass7TE.A0c(pmr.A0A);
        int i = this.A02.A00;
        int i2 = this.A00;
        ViewGroup.MarginLayoutParams A0G = DbX.A0G(A0c);
        if (!(A0G.topMargin == i && C66582MXn.A09(pmr.A07) == i2) && (A0c.getParent() instanceof ViewGroup)) {
            DbW.A1R(pmr.A07, i2);
            C67682MsK msK = new C67682MsK(A0c, A0G, A0G.topMargin, i, 2);
            msK.setAnimationListener(new C69200Ngy(pmr));
            msK.setDuration(300);
            A0c.startAnimation(msK);
        }
    }
}
