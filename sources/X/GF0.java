package X;

import com.instagram.common.session.UserSession;

public final class GF0 implements C59600JPu {
    public 0sP A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass93U A03;

    public final void D4D(C52058GDe gDe, GES ges) {
        1Xj r5;
        0qQ.A0B(ges, 0);
        0sP r1 = this.A00;
        if (r1 != null && (r5 = ges.A00.A02) != null) {
            r1.invoke(r5);
            UserSession userSession = this.A02;
            27p.A01(userSession);
            AnonymousClass93U r4 = this.A03;
            AnonymousClass0iw r3 = this.A01;
            0Aj A0M = C51972G9s.A0M(r3, userSession);
            if (A0M.isSampled()) {
                A0M.AAJ("organic_tap_action", "close_friends_tap");
                A0M.AAJ("organic_tap_action_source", "close_friends_cta");
                DbW.A16(A0M, r3);
                C51969G9p.A16(A0M, 0);
                C51970G9q.A1E(A0M, r4);
                String A2n = r5.A2n();
                A2n.getClass();
                G9t.A1J(A0M, A2n);
                G9t.A1K(A0M, C51966G9m.A11(r5).getId());
                C51970G9q.A1F(A0M, r4);
                A0M.Cgf();
            }
        }
    }

    public GF0(AnonymousClass0iw r1, UserSession userSession, AnonymousClass93U r3) {
        this.A02 = userSession;
        this.A03 = r3;
        this.A01 = r1;
    }

    public final void Ebg(0sP r1) {
        this.A00 = r1;
    }
}
