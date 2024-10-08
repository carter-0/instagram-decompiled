package X;

import android.view.View;

/* renamed from: X.W9a  reason: case insensitive filesystem */
public final class C18855W9a implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ VT1 A01;

    public C18855W9a(View view, VT1 vt1) {
        this.A01 = vt1;
        this.A00 = view;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1906170772);
        VT1 vt1 = this.A01;
        vt1.A00.A0L(vt1.A01, false);
        View view2 = this.A00;
        C51972G9s.A0I(view2).setDuration(200).withEndAction(new C20050WkA(view2));
        AnonymousClass0fD.A0C(-692156956, A05);
    }
}
