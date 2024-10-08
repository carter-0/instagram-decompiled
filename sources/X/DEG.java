package X;

import android.view.View;

public final class DEG implements View.OnClickListener {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C317116mk A01;

    public DEG(1Xj r1, C317116mk r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1544215729);
        C317116mk r1 = this.A01;
        1Xj r0 = this.A00;
        if (r0 != null) {
            r1.DRE(r0);
            AnonymousClass0fD.A0C(-998117997, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(1811711351, A05);
        throw A0y;
    }
}
