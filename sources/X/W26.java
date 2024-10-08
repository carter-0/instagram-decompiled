package X;

import com.instagram.common.session.UserSession;

public final class W26 {
    public final 0wc A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final String A06;

    public W26(UserSession userSession, AnonymousClass4DU r3, Long l, String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass7TG.A0w(1, userSession, str, str2);
        this.A00 = AnonymousClass0kN.A01(r3, userSession);
        this.A03 = str;
        this.A02 = str2;
        this.A06 = str3;
        this.A04 = str4;
        this.A01 = l;
        this.A05 = z;
    }

    public static final V1Y A00(String str) {
        if (str == null) {
            return V1Y.RECONSIDERATION_MODULE;
        }
        if (str.equals("cart")) {
            return V1Y.CART_ITEM;
        }
        if (str.equals("wish_list")) {
            return V1Y.SAVED_ITEMS;
        }
        return V1Y.RECENTLY_VIEWED;
    }

    public static final AnonymousClass327 A01(W26 w26, String str) {
        0bb r2 = new 0bb();
        r2.A06("shopping_session_id", w26.A03);
        r2.A06("prior_module", w26.A02);
        r2.A06("prior_submodule", w26.A06);
        C13989Tnp.A1K(r2, "submodule", str);
        return r2;
    }

    public static final void A02(V1Z v1z, V1W v1w, V1Y v1y, V1X v1x, W26 w26) {
        0Aj A0e = AnonymousClass7TE.A0e(w26.A00, "commerce_storefront_click");
        if (A0e.isSampled()) {
            A0e.A8M(v1w, "referral_surface");
            C13988Tno.A1D(A0e, w26.A03);
            A0e.A8M(v1z, "analytics_component");
            A0e.A8M(v1x, "analytics_page");
            A0e.A8M(v1y, "analytics_module");
            A0e.AAJ("navigation_chain", DbS.A0k());
            A0e.Cgf();
        }
    }

    public static final void A03(V1Z v1z, V1W v1w, V1Y v1y, V1X v1x, W26 w26) {
        0Aj A0e = AnonymousClass7TE.A0e(w26.A00, "commerce_tab_feed_click");
        if (A0e.isSampled()) {
            A0e.A8M(v1z, "analytics_component");
            A0e.A8M(v1x, "analytics_page");
            A0e.A8M(v1w, "referral_surface");
            C13988Tno.A1D(A0e, w26.A03);
            A0e.A8M(v1y, "analytics_module");
            A0e.AAJ("navigation_chain", DbS.A0k());
            A0e.Cgf();
        }
    }
}
