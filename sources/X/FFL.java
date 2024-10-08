package X;

import java.util.HashMap;
import java.util.Map;

public abstract class FFL {
    public static final void A00(C48152EZu eZu, 0lg r4, String str) {
        0qQ.A0B(r4, 0);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r4), "fx_upsells_product");
        if (A0e.isSampled()) {
            DbS.A1I(A0e, str);
            A0e.A8M(eZu, "upsell_flow_entry_point");
            AnonymousClass7TE.A1W(A0e, "upsell_type", 2);
            A0e.Cgf();
        }
    }

    public static final void A01(C48152EZu eZu, 0lg r4, String str, Map map) {
        int A02 = DbW.A02(0, r4, eZu);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r4), "fx_upsells_product");
        if (A0e.isSampled()) {
            DbS.A1I(A0e, str);
            A0e.A8M(eZu, "upsell_flow_entry_point");
            AnonymousClass7TE.A1W(A0e, "upsell_type", A02);
            A0e.A9H("debug_test_data", map);
            A0e.Cgf();
        }
    }

    public static final void A02(C48152EZu eZu, 0lg r3, String str, Map map, int i) {
        0qQ.A0B(eZu, 2);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r3), "fx_upsells_product");
        if (A0e.isSampled()) {
            DbS.A1I(A0e, str);
            A0e.A8M(eZu, "upsell_flow_entry_point");
            AnonymousClass7TE.A1W(A0e, "upsell_type", i);
            A0e.A9H("debug_test_data", map);
            A0e.Cgf();
        }
    }

    public static final void A03(0lg r3, Boolean bool, String str, String str2) {
        HashMap A1E = AnonymousClass7TE.A1E();
        if (str2 != null) {
            A1E.put("source", str2);
        }
        if (bool != null) {
            A1E.put("contact_point_claiming", bool.toString());
        }
        A02(C48152EZu.A0B, r3, str, A1E, 2);
    }
}
