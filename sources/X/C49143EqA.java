package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EqA  reason: case insensitive filesystem */
public abstract class C49143EqA {
    public static final void A00(UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1T(userSession, str, str2);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(C49299Esi.A00, userSession), "instagram_shopping_catalog_add_product_button_impression");
        if (A0e.isSampled()) {
            A0e.AAJ("waterfall_id", str);
            DbV.A1J(A0e, str2);
        }
    }
}
