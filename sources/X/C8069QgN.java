package X;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: X.QgN  reason: case insensitive filesystem */
public final class C8069QgN extends C8115Qh7 {
    public 2Fk A00;
    public SUj A01 = SUj.A02();
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C13321TUu.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8069QgN(C319836rJ r2) {
        super(r2);
        0qQ.A0B(r2, 1);
    }

    public final void A0C(Bundle bundle) {
        this.A00 = AnonymousClass72Y.A01(AnonymousClass72Y.A02(this.A03, TY1.A00(this, 45)), TY1.A00(this, 46));
        super.A0C(bundle);
    }

    public static final void A02(C8069QgN qgN, String str, String str2, String str3) {
        String A0j;
        2FO A002 = C11426STk.A00();
        HashMap A003 = C9634ReE.A00(qgN.A0E());
        C250663lr A09 = C8115Qh7.A09(qgN);
        if (A09 == null || (A0j = Pxh.A0j(A09)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        A003.put("financial_entity_id", A0j);
        A003.put("view_name", "payouthub_payouts");
        if (str2 != null) {
            A003.put("batch_item_id", str2);
        }
        if (str3 != null) {
            A003.put("target_name", str3);
        }
        A002.Cgl(str, A003);
    }
}
