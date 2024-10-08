package X;

import android.content.DialogInterface;

public final class AL4 implements DialogInterface.OnShowListener {
    public final /* synthetic */ C358138aQ A00;

    public AL4(C358138aQ r1) {
        this.A00 = r1;
    }

    public final void onShow(DialogInterface dialogInterface) {
        0s0 r2;
        AnonymousClass0YZ[] r1;
        char c;
        C358138aQ r12 = this.A00;
        boolean z = r12 instanceof C342877pJ;
        1Av r4 = r12.A02;
        if (z) {
            r2 = r4.A56;
            r1 = 1Av.A8a;
            c = 323;
        } else {
            r2 = r4.A2e;
            r1 = 1Av.A8a;
            c = 322;
        }
        r2.Epx(r4, true, r1[c]);
    }
}
