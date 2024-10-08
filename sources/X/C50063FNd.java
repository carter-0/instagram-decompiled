package X;

import android.view.View;

/* renamed from: X.FNd  reason: case insensitive filesystem */
public final class C50063FNd implements View.OnClickListener {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ AnonymousClass3BQ A01;
    public final /* synthetic */ C317116mk A02;

    public C50063FNd(C255773uh r1, AnonymousClass3BQ r2, C317116mk r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1791380259);
        C255773uh r3 = this.A00;
        String A0R = r3.A0R();
        if (A0R != null) {
            this.A02.CuI(r3, this.A01, A0R);
            AnonymousClass0fD.A0C(-736838705, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(984395059, A05);
        throw A0y;
    }
}
