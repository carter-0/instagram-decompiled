package X;

import com.instagram.common.session.UserSession;

public final class ONF {
    public final 0wc A00;

    public ONF(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A00(Long l, Long l2, String str, String str2, String str3, long j) {
        0qQ.A0B(str2, 2);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_recs_from_friends_recommendation_viewer_click_events");
        DbS.A1J(A0e, str);
        A0e.A9F("target_id", l);
        A0e.AAJ("module", str2);
        A0e.AAJ("follow_type", str3);
        A0e.A9F("number_of_users", Long.valueOf(j));
        A0e.A9F("index", l2);
        A0e.Cgf();
    }

    public final void A01(Long l, String str, String str2) {
        0qQ.A0B(str2, 2);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_recs_from_friends_impression_events");
        A0e.AAJ("flows", str);
        A0e.A9F("target_id", l);
        A0e.AAJ("module", str2);
        A0e.Cgf();
    }

    public final void A02(Long l, String str, String str2, boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_recs_from_friends_sender_view_click_events");
        DbS.A1J(A0e, str);
        A0e.A9F("target_id", l);
        A0e.AAJ("module", "recs_from_friends_sender");
        A0e.A7p("has_custom_text", JTP.A0g(A0e, "selected_user_ids", str2, z));
        A0e.Cgf();
    }
}
