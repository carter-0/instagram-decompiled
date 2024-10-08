package X;

import android.view.View;

public final class AMC implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass86m A00;

    public AMC(AnonymousClass86m r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        AnonymousClass87G r1;
        int A05 = AnonymousClass0fD.A05(-1127668850);
        AnonymousClass86m r2 = this.A00;
        AnonymousClass876 r0 = r2.A08;
        if (r0 != null) {
            r1 = r0.A01();
        } else {
            r1 = null;
        }
        AnonymousClass871 r02 = r2.A09;
        if (!(r02 == null || r1 == null)) {
            r02.DBh(r1);
        }
        AnonymousClass0fD.A0C(353853111, A05);
    }
}
