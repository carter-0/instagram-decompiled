package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.W2p  reason: case insensitive filesystem */
public final class C18802W2p {
    public boolean A00;
    public final AnonymousClass0iw A01;
    public final 0wc A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public C18802W2p(AnonymousClass0iw r3, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        0qQ.A0B(userSession, 2);
        String A0k = DbS.A0k();
        0wc A012 = AnonymousClass0kN.A01(r3, userSession);
        this.A01 = r3;
        this.A03 = userSession;
        this.A0B = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A0C = str4;
        this.A05 = str5;
        this.A04 = str6;
        this.A09 = str7;
        this.A0A = str8;
        this.A06 = A0k;
        this.A02 = A012;
    }

    public static C263944Ny A03(0Aj r3, AnonymousClass57K r4, C18802W2p w2p, String str, String str2) {
        r3.AAK(A00(r4, str, str2), "collections_logging_info");
        String str3 = w2p.A0C;
        if (str3 == null || str3.length() == 0) {
            return null;
        }
        return C263944Ny.A00(str3);
    }

    public final void A05(AnonymousClass57K r7, String str, String str2) {
        1Ln r3;
        C14929UFq A012;
        String str3;
        0qQ.A0B(r7, 1);
        String str4 = this.A0C;
        if (str4 != null && str4.length() != 0) {
            String str5 = this.A04;
            0wc r1 = this.A02;
            if (str5 == null) {
                r3 = new 1Ln(AnonymousClass7TE.A0e(r1, "instagram_shopping_product_collection_page_entry"), 319);
                if (DbT.A1Y(r3)) {
                    r3.A0N(A02(this, (String) null), "navigation_info");
                    r3.A0N(A00(r7, str, str2), "collections_logging_info");
                    r3.A0e(C263944Ny.A00(str4));
                    r3.A00.AAE((AnonymousClass0Ah) null, "marketer_id");
                    A012 = A01(this);
                    str3 = "feed_item_info";
                } else {
                    return;
                }
            } else {
                r3 = new 1Ln(AnonymousClass7TE.A0e(r1, "shops_product_collection_page_entry"), 376);
                if (DbT.A1Y(r3)) {
                    r3.A0R("container_module", "shops_product_collection");
                    r3.A0N(A02(this, (String) null), "navigation_info");
                    r3.A0R("position", "0,0");
                    r3.A00.AAE(C263944Ny.A00(str4), "merchant_igid");
                    r3.A00.AAE((AnonymousClass0Ah) null, "marketer_igid");
                    r3.A0N(A00(r7, str, str2), "collections_logging_info");
                    r3.A0Q("discount_id", C51972G9s.A0i(str2));
                    r3.A0Q("link_id", AnonymousClass7TE.A10(str5));
                    A012 = A01(this);
                    str3 = "ig_media_info";
                } else {
                    return;
                }
            }
            r3.A0N(A012, str3);
            r3.A0R("query_text", this.A09);
            r3.A0R("search_session_id", this.A0A);
            r3.Cgf();
        }
    }

    public final void A06(AnonymousClass57K r5, String str, String str2, String str3, String str4) {
        0qQ.A0B(r5, 1);
        String str5 = null;
        if (str3.equals("shopping_incentive_mention")) {
            str5 = "header";
        } else if (str3.equals("shopping_incentive_user_picture")) {
            str5 = "account_image";
        }
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "instagram_shopping_product_collection_profile_navigation");
        if (A0e.isSampled()) {
            if (str2 == null) {
                str2 = "";
            }
            A0e.AAJ(AnonymousClass000.A00(1720), str2);
            C13988Tno.A17(A0e, A02(this, str5));
            A0e.AAK(A00(r5, str, str4), "collections_logging_info");
            A0e.AAK(A01(this), "feed_item_info");
            A0e.Cgf();
        }
    }

    public static final C254463sW A00(AnonymousClass57K r3, String str, String str2) {
        0bb r2 = new 0bb();
        r2.A06("product_collection_id", str);
        r2.A06("product_collection_type", r3.toString());
        if (str2 != null) {
            r2.A05("incentive_id", AnonymousClass7TE.A10(str2));
        }
        return r2;
    }

    public static final C14929UFq A01(C18802W2p w2p) {
        0bb r2 = new 0bb();
        String str = w2p.A05;
        r2.A06("m_pk", str);
        r2.A06("tracking_token", C231122qu.A0I(w2p.A03, str));
        return r2;
    }

    public static final AnonymousClass327 A02(C18802W2p w2p, String str) {
        0bb r2 = new 0bb();
        r2.A06("prior_module", w2p.A07);
        r2.A06("prior_submodule", w2p.A08);
        r2.A06("shopping_session_id", w2p.A0B);
        r2.A06("nav_chain", w2p.A06);
        r2.A06("submodule", str);
        return r2;
    }

    public static void A04(AnonymousClass0Ah r1, 0Aj r2, C18802W2p w2p) {
        r2.AAE(r1, "merchant_id");
        r2.AAK(A01(w2p), "feed_item_info");
        r2.AAJ("query_text", w2p.A09);
        r2.AAJ("search_session_id", w2p.A0A);
        r2.Cgf();
    }
}
