package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LSt  reason: case insensitive filesystem */
public abstract class C64186LSt {
    public static void A00(0Aj r2, AnonymousClass0iw r3, Long l) {
        r2.A9F("sponsor_ig_id", l);
        r2.AAJ("media_id", (String) null);
        r2.AAJ("source_of_action", r3.getModuleName());
        r2.Cgf();
    }

    public static final void A01(AnonymousClass0iw r6, UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(r6, userSession, 0), "instagram_bc_add_new_partner");
        A0e.A7p("is_editing", false);
        DbU.A1N(A0e, "sponsor_igid", str, (String) null);
        A0e.AAJ("media_type", "feed");
        A0e.AAJ("prior_module", r6.getModuleName());
        A0e.Cgf();
        0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_organic_tag_business_partner");
        A0e2.AAJ("source_of_action", r6.getModuleName());
        A0e2.A9F(C273654mx.A00(561), DbV.A0q(str));
        A0e2.Cgf();
    }

    public static final void A02(AnonymousClass0iw r6, UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(r6, userSession, 0), "instagram_bc_add_partner_exit");
        A0e.A7p("is_editing", false);
        DbU.A1N(A0e, "sponsor_igid", str, (String) null);
        A0e.AAJ("media_type", "feed");
        A0e.AAJ("prior_module", r6.getModuleName());
        A0e.A7p("is_permission_enabled", false);
        A0e.Cgf();
    }

    public static final void A03(AnonymousClass0iw r2, UserSession userSession, String str) {
        A00(AnonymousClass7TE.A0e(DbX.A0O(r2, userSession), "ig_branded_content_permission_required_dialog_cancel_tapped"), r2, DbV.A0q(str));
    }

    public static final void A04(AnonymousClass0iw r2, UserSession userSession, String str) {
        A00(AnonymousClass7TE.A0e(DbX.A0O(r2, userSession), "ig_branded_content_permission_required_dialog_request_approval_tapped"), r2, DbV.A0q(str));
    }

    public static final void A05(AnonymousClass0iw r0, UserSession userSession, String str) {
        DbY.A1S(userSession, str);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r0, userSession), "instagram_organic_remove_business_partner");
        A0e.AAJ("source_of_action", str);
        A0e.Cgf();
    }
}
