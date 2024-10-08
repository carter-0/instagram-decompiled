package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.F7j  reason: case insensitive filesystem */
public abstract class C49798F7j {
    public static final void A00(UserSession userSession, AnonymousClass4DU r1, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0O(r1, userSession), "instagram_shopping_shop_manager_add_products_entry_tap");
        if (A0e.isSampled()) {
            A0e.AAJ("waterfall_id", str);
            A0e.AAJ("submodule", str3);
            A0e.AAJ("prior_module", str2);
            A0e.Cgf();
        }
    }

    public static final void A01(UserSession userSession, AnonymousClass4DU r2, String str, String str2, String str3) {
        DbY.A1S(userSession, str);
        0qQ.A0B(str3, 4);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "instagram_shopping_shop_manager_edit_products_entry_tap");
        if (A0e.isSampled()) {
            A0e.AAJ("waterfall_id", str);
            A0e.AAJ("submodule", str3);
            A0e.AAJ("prior_module", str2);
            A0e.Cgf();
        }
    }
}
