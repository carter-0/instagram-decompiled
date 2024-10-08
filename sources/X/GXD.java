package X;

import com.instagram.common.session.UserSession;

public final class GXD implements C250603lj {
    public String A00 = "canceled";
    public final UserSession A01;

    public final void ATF(AnonymousClass30Y r4, C252093oY r5) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        int intValue = r5.CEk(r4).intValue();
        if (intValue != 0 && intValue != 1) {
            A00(r5.B0M(r4), "cold");
        }
    }

    public final void A00(long j, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(this.A01), "instagram_explore_head_load");
        if (A0e.isSampled()) {
            Long A0S = C51974G9v.A0S(A0e, "explore_popular", j);
            A0e.A9F("time_spent_all_media_rendered", A0S);
            A0e.A9F("time_spent_first_media_rendered", A0S);
            A0e.AAJ("event_outcome", this.A00);
            A0e.AAJ("load_type", str);
            A0e.Cgf();
        }
    }

    public GXD(UserSession userSession) {
        this.A01 = userSession;
    }
}
