package X;

import android.view.View;

public final class PVB implements Runnable {
    public final /* synthetic */ P1D A00;

    public PVB(P1D p1d) {
        this.A00 = p1d;
    }

    public final void run() {
        P1D p1d = this.A00;
        AnonymousClass9IC r3 = p1d.A00;
        int i = 0;
        AnonymousClass7TH.A06(p1d.A0G).setVisibility(DbW.A01(r3.A05 ? 1 : 0));
        AnonymousClass7TH.A06(p1d.A0D).setVisibility(DbW.A01(r3.A03 ? 1 : 0));
        View A06 = AnonymousClass7TH.A06(p1d.A0A);
        if (!r3.A01) {
            i = 8;
        }
        A06.setVisibility(i);
    }
}
