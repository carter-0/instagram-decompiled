package X;

import android.view.View;

/* renamed from: X.Oio  reason: case insensitive filesystem */
public final class C71339Oio implements View.OnClickListener {
    public final /* synthetic */ 2bv A00;
    public final /* synthetic */ AnonymousClass4UC A01;
    public final /* synthetic */ C254103rw A02;

    public C71339Oio(2bv r1, AnonymousClass4UC r2, C254103rw r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(167545135);
        this.A02.itemView.setVisibility(8);
        2bv r1 = this.A00;
        if (r1 != null) {
            r1.DbJ(this.A01);
        }
        AnonymousClass0fD.A0C(1401035318, A05);
    }
}
