package X;

import android.view.View;

public final class FNS implements View.OnClickListener {
    public final /* synthetic */ 2bv A00;
    public final /* synthetic */ AnonymousClass4UC A01;
    public final /* synthetic */ C254113rx A02;

    public FNS(2bv r1, AnonymousClass4UC r2, C254113rx r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-933094593);
        this.A02.itemView.setVisibility(8);
        2bv r1 = this.A00;
        if (r1 != null) {
            r1.DbJ(this.A01);
        }
        AnonymousClass0fD.A0C(1365504209, A05);
    }
}
