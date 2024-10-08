package X;

import com.instagram.common.session.UserSession;

public final class F2F {
    public final AnonymousClass0iw A00;
    public final 0wc A01;
    public final UserSession A02;

    public final void A00(String str, Integer num) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01, "batch_follow_requests_action");
        A0e.AAJ("action_type", str);
        DbW.A15(A0e, this.A00);
        A0e.A9F("num_requests", DbZ.A0c(num));
        A0e.Cgf();
    }

    public F2F(AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A02 = userSession;
        this.A00 = r2;
        this.A01 = AnonymousClass0kN.A01(r2, userSession);
    }
}
