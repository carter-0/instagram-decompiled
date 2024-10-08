package X;

import android.view.View;

/* renamed from: X.7eA  reason: invalid class name and case insensitive filesystem */
public final class C336157eA implements View.OnClickListener {
    public final /* synthetic */ C52971GgO A00;
    public final /* synthetic */ 1Xj A01;

    public C336157eA(C52971GgO ggO, 1Xj r2) {
        this.A00 = ggO;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1097214393);
        C52971GgO ggO = this.A00;
        String id = this.A01.getId();
        if (id == null) {
            id = "";
        }
        ggO.A0P.Epw(new AXX(id));
        AnonymousClass0fD.A0C(1018426230, A05);
    }
}
