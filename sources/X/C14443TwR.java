package X;

import android.location.Location;
import android.util.Base64;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;

/* renamed from: X.TwR  reason: case insensitive filesystem */
public final class C14443TwR implements C358448av {
    public String A00;
    public final C14444TwS A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final AnonymousClass0iw A05;
    public final 0wc A06;
    public final UserSession A07;

    public final void Chk(Integer num, String str, String str2, String str3, String str4) {
        0qQ.A0B(num, 3);
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "instagram_search_echo_click");
        if (A0e.isSampled()) {
            A0e.AAJ("search_type", C67419Mna.A00(num));
            C13988Tno.A1E(A0e, "click_type", str, str3);
            A0e.AAJ("rank_token", str2);
            A02(A0e, this, "search_session_id", this.A00);
            A0e.AAJ("prior_serp_session_id", this.A04);
            A01(A0e, this);
            DbY.A1C(A0e);
            A0e.AAJ("source", "typeahead");
            A0e.AAJ("click_id", str4);
            A0e.Cgf();
        }
    }

    public final void CiD(C14486Tx8 tx8, Integer num, Integer num2, String str, String str2, String str3, String str4, int i) {
    }

    public final void CiE(C14486Tx8 tx8, Integer num, String str, String str2, String str3, String str4, String str5, int i) {
    }

    public final void CjB(String str, String str2) {
        0qQ.A0B(str2, 1);
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "keyword_see_more_click");
        if (A0e.isSampled()) {
            A0e.AAJ("search_session_id", this.A00);
            A0e.AAJ("rank_token", str);
            A02(A0e, this, "query_text", str2);
            C51973G9u.A14(A0e, "prior_serp_session_id", this.A04);
            A0e.Cgf();
        }
    }

    public final /* synthetic */ void CkL(C14486Tx8 tx8, Integer num, Integer num2, String str, String str2, int i) {
        DbW.A1O(num, 4, num2);
        CkM(tx8, num, num2, str, str2, (String) null, (String) null, (String) null, i);
    }

    public final void CkM(C14486Tx8 tx8, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, int i) {
        String str6;
        String str7;
        Location lastLocation;
        DbW.A1N(num, 3, num2);
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "search_results_page");
        if (A0e.isSampled()) {
            C14486Tx8.A00(A0e, tx8, num, i);
            C13988Tno.A1E(A0e, "click_type", tx8.A01, str);
            A0e.AAJ("rank_token", str2);
            A0e.AAJ("search_session_id", this.A00);
            A0e.AAJ("selected_id_text", tx8.A05);
            C14486Tx8.A01(A0e, tx8, tx8.A02);
            UserSession userSession = this.A07;
            1Wr r1 = 1Wr.A00;
            if (r1 == null || (lastLocation = r1.getLastLocation(userSession, "SearchLogger")) == null) {
                str6 = null;
            } else {
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("locsig_ig_search_DO_NOT_USE_THIS,%s,%s", Double.valueOf(lastLocation.getLatitude()), Double.valueOf(lastLocation.getLongitude()));
                0qQ.A07(formatStrLocaleSafe);
                str6 = Base64.encodeToString(Pxf.A1V(formatStrLocaleSafe, AnonymousClass15Q.A05), 0);
            }
            A0e.AAJ("encoded_latlon_privacy_sensitive_do_not_use", str6);
            A02(A0e, this, "shopping_session_id", (String) null);
            A0e.AAJ("prior_serp_session_id", this.A04);
            switch (num2.intValue()) {
                case 0:
                    str7 = "POPULAR";
                    break;
                case 1:
                    str7 = "NORMAL";
                    break;
                default:
                    str7 = "";
                    break;
            }
            A0e.AAJ("keyword_context", str7);
            A01(A0e, this);
            DbY.A1C(A0e);
            A0e.AAJ("source", str3);
            A0e.AAJ("click_id", str5);
            A0e.A7p("has_social_context", Boolean.valueOf(tx8.A08));
            A0e.AAJ(AnonymousClass000.A00(5272), tx8.A06);
            A0e.Cgf();
        }
    }

    public final void CkO(C14486Tx8 tx8, Integer num, String str, String str2, String str3, int i) {
    }

    public static void A00(0Aj r2, C14443TwR twR) {
        r2.AAJ("search_session_id", twR.A00);
        r2.AAJ("prior_serp_session_id", twR.A04);
        r2.AAJ("prior_query_text", twR.A03);
    }

    public static void A01(0Aj r3, C14443TwR twR) {
        C14444TwS twS = twR.A01;
        if (twS != null) {
            r3.AAe("recommendations_shown_entity_ids", twS.A02);
            r3.AAe("recommendations_shown_entity_names", twS.A03);
            r3.AAe("recommendations_shown_entity_types", twS.A04);
        }
    }

    public final void ChZ(String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "ig_search_clear_query_x_icon_tap");
        String A0k = DbS.A0k();
        if (A0e.isSampled() && A0k != null) {
            C51965G9l.A1K(A0e, A0k);
            A0e.AAJ("search_session_id", this.A00);
            C13988Tno.A1E(A0e, "rank_token", str, str2);
            A0e.Cgf();
        }
    }

    public final void CkH() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "instagram_search_user_clicked_search_button");
        if (A0e.isSampled()) {
            A0e.A9F(AnonymousClass000.A00(4208), DbV.A0q(this.A07.A06));
            DbW.A15(A0e, this.A05);
            A0e.Cgf();
        }
    }

    public final void CkI(String str) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "instagram_search_boost_disclosure_click");
        if (A0e.isSampled()) {
            A00(A0e, this);
            C51973G9u.A14(A0e, "prior_module", this.A02);
            A0e.AAJ("query_text", str);
            A0e.Cgf();
        }
    }

    public final void CkJ(String str) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "instagram_search_boost_disclosure_impression");
        if (A0e.isSampled()) {
            A00(A0e, this);
            C51973G9u.A14(A0e, "prior_module", this.A02);
            A0e.AAJ("query_text", str);
            A0e.Cgf();
        }
    }

    public final void CkK() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "instagram_search_glyphs_shown");
        if (A0e.isSampled()) {
            A00(A0e, this);
            C51973G9u.A14(A0e, "prior_module", this.A02);
            A0e.Cgf();
        }
    }

    public final void CkP(C14489TxB txB, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "instagram_search_results");
        if (A0e.isSampled()) {
            C13988Tno.A1E(A0e, "search_session_id", this.A00, str);
            A0e.AAJ("rank_token", str2);
            A0e.AAe("results_list", txB.A02);
            A0e.AAe("results_list_names", txB.A03);
            A0e.AAe("results_type_list", txB.A08);
            A0e.AAe("results_source_list", txB.A07);
            A0e.AAe("results_has_social_context", txB.A00);
            A0e.AAe("results_social_context_type", txB.A06);
            C13988Tno.A1C(A0e, this.A02);
            A0e.AAJ("prior_query_text", this.A03);
            C51973G9u.A14(A0e, "prior_serp_session_id", this.A04);
            A0e.Cgf();
        }
    }

    public final void CkQ() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "instagram_search_session_initiated");
        if (A0e.isSampled()) {
            A0e.AAJ("search_session_id", this.A00);
            C13988Tno.A1D(A0e, (String) null);
            C51973G9u.A14(A0e, "prior_module", this.A02);
            A0e.Cgf();
        }
    }

    public final void CkS() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "instagram_search_typeahead_session_initiated");
        if (A0e.isSampled()) {
            A0e.AAJ("search_session_id", this.A00);
            C13988Tno.A1D(A0e, (String) null);
            C51973G9u.A14(A0e, "prior_module", this.A02);
            A0e.Cgf();
        }
    }

    public final void ClE(C14489TxB txB, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "search_viewport_view");
        if (A0e.isSampled()) {
            A0e.AAe("results_list", txB.A02);
            A0e.AAe("results_list_names", txB.A03);
            A0e.AAe("results_source_list", txB.A07);
            A0e.AAe("results_type_list", txB.A08);
            A0e.AAe("results_has_social_context", txB.A00);
            A0e.AAe("results_social_context_type", txB.A06);
            A0e.AAJ("search_session_id", this.A00);
            A0e.AAe("results_section_list", txB.A05);
            A0e.AAe("results_position_list", txB.A04);
            A0e.AAJ("query_text", str);
            A0e.AAJ("rank_token", str2);
            A02(A0e, this, "shopping_session_id", (String) null);
            A0e.AAJ("prior_serp_session_id", this.A04);
            A0e.AAe("results_keyword_context_list", txB.A01);
            A01(A0e, this);
            C51973G9u.A14(A0e, "source", str3);
            A0e.Cgf();
        }
    }

    public C14443TwR(AnonymousClass0iw r2, UserSession userSession, C14444TwS twS, String str, String str2, String str3, String str4) {
        this.A05 = r2;
        this.A00 = str;
        this.A07 = userSession;
        this.A01 = twS;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A06 = AnonymousClass0kN.A01(r2, userSession);
    }

    public static void A02(0Aj r2, C14443TwR twR, String str, String str2) {
        r2.AAJ(str, str2);
        r2.AAJ("prior_module", twR.A02);
        r2.AAJ("prior_query_text", twR.A03);
    }

    public final void CkN(String str, String str2, String str3, String str4, String str5, int i) {
        AnonymousClass7TG.A1U(str2, str3, str4);
        0Aj A0e = AnonymousClass7TE.A0e(this.A06, "search_results_dismiss");
        if (A0e.isSampled()) {
            A0e.AAJ("selected_id", str2);
            A0e.AAJ("selected_type", str4);
            A0e.A9F("selected_position", Long.valueOf((long) i));
            A0e.AAJ("selected_section", str5);
            A0e.AAJ("search_session_id", this.A00);
            A0e.AAJ("rank_token", str);
            A0e.AAJ("selected_id_text", str3);
            A02(A0e, this, "shopping_session_id", (String) null);
            C51973G9u.A14(A0e, "prior_serp_session_id", this.A04);
            A0e.Cgf();
        }
    }

    public final void CkR() {
        this.A00 = AnonymousClass7TF.A0b();
        CkQ();
    }
}
