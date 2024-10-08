package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.WbL  reason: case insensitive filesystem */
public final class C19535WbL implements C358448av {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final 0wc A03;
    public final UserSession A04;
    public final C17265VOs A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final void Chk(Integer num, String str, String str2, String str3, String str4) {
    }

    public final void CiD(C14486Tx8 tx8, Integer num, Integer num2, String str, String str2, String str3, String str4, int i) {
        0qQ.A0B(num, 3);
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "instagram_serp_results_button_click");
        if (A0e.isSampled()) {
            A0e.AAJ("serp_session_id", this.A09);
            C14486Tx8.A00(A0e, tx8, num, i);
            A00(A0e, this, tx8, str2, str);
            A0e.A7p("is_mixed_serp_content", Boolean.valueOf(C13989Tnp.A0b(this.A05.A00).A0M));
            C14486Tx8.A01(A0e, tx8, tx8.A02);
            A0e.AAJ("prior_serp_session_id", this.A07);
            C51973G9u.A14(A0e, "prior_module", this.A06);
            A0e.AAJ("source", this.A0A);
            A0e.AAJ("serp_button_click_type", str4);
            A0e.Cgf();
        }
    }

    public final void CiE(C14486Tx8 tx8, Integer num, String str, String str2, String str3, String str4, String str5, int i) {
        0qQ.A0B(num, 3);
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "instagram_serp_results_click");
        if (A0e.isSampled()) {
            A0e.AAJ("serp_session_id", this.A09);
            A0e.AAJ("search_type", C67419Mna.A00(num));
            A0e.AAJ("selected_id", tx8.A03);
            A0e.A9F("selected_position", C51971G9r.A0m());
            A0e.AAJ("selected_type", tx8.A04);
            A00(A0e, this, tx8, str2, str);
            C14486Tx8.A01(A0e, tx8, (String) null);
            A0e.AAJ("prior_serp_session_id", this.A07);
            C13988Tno.A1D(A0e, (String) null);
            C51973G9u.A14(A0e, "typecode", str4);
            A0e.AAJ("click_id", str5);
            A0e.Cgf();
        }
    }

    public final void CjB(String str, String str2) {
    }

    public final void CkH() {
    }

    public final /* synthetic */ void CkI(String str) {
    }

    public final /* synthetic */ void CkJ(String str) {
    }

    public final /* synthetic */ void CkK() {
    }

    public final /* synthetic */ void CkL(C14486Tx8 tx8, Integer num, Integer num2, String str, String str2, int i) {
        DbW.A1O(num, 4, num2);
        CkM(tx8, num, num2, str, str2, (String) null, (String) null, (String) null, i);
    }

    public final void CkM(C14486Tx8 tx8, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, int i) {
        0qQ.A0B(num, 3);
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "instagram_serp_results_click");
        if (A0e.isSampled()) {
            A0e.AAJ("serp_session_id", this.A09);
            C14486Tx8.A00(A0e, tx8, num, i);
            A00(A0e, this, tx8, str2, str);
            A0e.AAJ("serp_button_click_type", str4);
            C14486Tx8.A01(A0e, tx8, tx8.A02);
            C51973G9u.A14(A0e, "prior_serp_session_id", this.A07);
            A0e.A7p("is_mixed_serp_content", Boolean.valueOf(C13989Tnp.A0b(this.A05.A00).A0M));
            A0e.AAJ("source", this.A0A);
            A01(A0e, this, "click_id", str5);
        }
    }

    public final void CkN(String str, String str2, String str3, String str4, String str5, int i) {
    }

    public final void CkO(C14486Tx8 tx8, Integer num, String str, String str2, String str3, int i) {
        0qQ.A0B(num, 3);
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "instagram_serp_results_impression");
        if (A0e.isSampled()) {
            A0e.AAJ("serp_session_id", this.A09);
            C14486Tx8.A00(A0e, tx8, num, i);
            A0e.AAJ("serp_button_click_type", str3);
            A00(A0e, this, tx8, str2, str);
            C14486Tx8.A01(A0e, tx8, (String) null);
            A0e.AAJ("prior_serp_session_id", this.A07);
            A0e.A7p("is_mixed_serp_content", Boolean.valueOf(C13989Tnp.A0b(this.A05.A00).A0M));
            DbY.A1C(A0e);
            A01(A0e, this, "source", this.A0A);
        }
    }

    public final void CkP(C14489TxB txB, String str, String str2) {
    }

    public final void CkR() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CkS() {
    }

    public final void ClE(C14489TxB txB, String str, String str2, String str3) {
    }

    public static void A00(0Aj r2, C19535WbL wbL, C14486Tx8 tx8, String str, String str2) {
        r2.A9F("selected_sub_type", tx8.A00);
        r2.AAJ("search_session_id", wbL.A01);
        r2.AAJ("rank_token", str);
        r2.AAJ("query_text", str2);
        r2.AAJ("selected_id_text", tx8.A05);
    }

    public final void ChZ(String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "ig_search_clear_query_x_icon_tap");
        String A0k = DbS.A0k();
        if (A0e.isSampled() && A0k != null) {
            C51965G9l.A1K(A0e, A0k);
            A0e.AAJ("search_session_id", this.A01);
            C13988Tno.A1E(A0e, "rank_token", str, str2);
            A0e.Cgf();
        }
    }

    public final void CkQ() {
        0Aj A0e = AnonymousClass7TE.A0e(this.A03, "instagram_serp_session_initiated");
        if (A0e.isSampled()) {
            A0e.AAJ("search_session_id", this.A01);
            A0e.AAJ("serp_session_id", this.A09);
            A0e.AAJ("query_text", this.A08);
            C13988Tno.A1C(A0e, this.A06);
            C51973G9u.A14(A0e, "prior_serp_session_id", this.A07);
            A0e.AAJ("source", this.A0A);
            A01(A0e, this, "serp_type", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        }
    }

    public C19535WbL(AnonymousClass0iw r2, UserSession userSession, C17265VOs vOs, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A04 = userSession;
        this.A01 = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A0A = str6;
        this.A05 = vOs;
        this.A00 = bool;
        this.A02 = str7;
        this.A03 = AnonymousClass0kN.A01(r2, userSession);
    }

    public static void A01(0Aj r2, C19535WbL wbL, String str, String str2) {
        r2.AAJ(str, str2);
        r2.A7p("is_tag", wbL.A00);
        r2.AAJ(C273654mx.A00(982), wbL.A02);
        r2.Cgf();
    }
}
