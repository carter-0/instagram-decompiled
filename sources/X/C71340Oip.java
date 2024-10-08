package X;

import android.view.View;

/* renamed from: X.Oip  reason: case insensitive filesystem */
public final class C71340Oip implements View.OnClickListener {
    public final /* synthetic */ 2bv A00;
    public final /* synthetic */ AnonymousClass4UC A01;
    public final /* synthetic */ C254123ry A02;

    public C71340Oip(2bv r1, AnonymousClass4UC r2, C254123ry r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-786652617);
        this.A02.itemView.setVisibility(8);
        2bv r1 = this.A00;
        if (r1 != null) {
            r1.DbJ(this.A01);
        }
        AnonymousClass0fD.A0C(408755914, A05);
    }
}
