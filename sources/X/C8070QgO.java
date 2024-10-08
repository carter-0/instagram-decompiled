package X;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: X.QgO  reason: case insensitive filesystem */
public final class C8070QgO extends C8115Qh7 {
    public 2Fk A00;
    public SUj A01 = SUj.A02();
    public boolean A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(C13308TUh.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8070QgO(C319836rJ r2) {
        super(r2);
        0qQ.A0B(r2, 1);
    }

    public final void A0C(Bundle bundle) {
        this.A00 = AnonymousClass72Y.A01(AnonymousClass72Y.A02(this.A03, TY1.A00(this, 30)), TY1.A00(this, 31));
        super.A0C(bundle);
    }

    public static final void A02(C8070QgO qgO, String str) {
        String A0j;
        2FO A002 = C11426STk.A00();
        HashMap A003 = C9634ReE.A00(qgO.A0E());
        C250663lr A09 = C8115Qh7.A09(qgO);
        if (A09 == null || (A0j = Pxh.A0j(A09)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        A003.put("financial_entity_id", A0j);
        A003.put("view_name", "payouthub_earnings");
        A002.Cgl(str, A003);
    }
}
