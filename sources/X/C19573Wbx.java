package X;

import java.util.List;

/* renamed from: X.Wbx  reason: case insensitive filesystem */
public final class C19573Wbx implements C20924X4p {
    public final /* synthetic */ C15333Uai A00;

    public C19573Wbx(C15333Uai uai) {
        this.A00 = uai;
    }

    public final void DU9() {
        C15333Uai uai = this.A00;
        C16222Uql uql = (C16222Uql) uai.A06.getValue();
        C49798F7j.A00(uql.A00, uql.A01, uql.A04, uql.A03, (String) null);
        0eE r0 = AnonymousClass0t1.A01;
        AnonymousClass0eM r3 = uai.A09;
        List A0T = DbX.A0l(r0, r3).A0T();
        if (A0T != null && A0T.size() > 0) {
            C49143EqA.A00(AnonymousClass7TE.A0l(r3), DbS.A0t(uai.A0B), EWE.STORE_FRONT_MENU_MANAGE_PRODUCTS.toString());
        }
        C249713kF.A00.A0a(uai.requireActivity(), uai, AnonymousClass7TE.A0l(r3), DbS.A0t(uai.A0B), AnonymousClass000.A00(3976));
    }
}
