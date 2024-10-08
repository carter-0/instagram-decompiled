package X;

import com.instagram.common.session.UserSession;

public final class EPc extends C319156q8 {
    public final G5B A01() {
        G5B g5b;
        C323256xC r1 = this.A01;
        if (C318996ps.A01()) {
            C318996ps.A00();
            UserSession userSession = r1.A09;
            if (182.A06(0Tu.A05, userSession, 36321082429285456L) && 1q7.A00(userSession) && AnonymousClass7TE.A0q(userSession).getInt("opal_profile_menu_option_view_count", 0) < 2) {
                g5b = C50690Fgp.A00;
                return g5b;
            }
        }
        g5b = C50691Fgq.A00;
        return g5b;
    }

    public final void A02() {
        C323256xC r3 = this.A01;
        if (C318996ps.A01()) {
            1q7 A00 = C318996ps.A00();
            UserSession userSession = r3.A09;
            if (A00.A05(userSession)) {
                0xY A0p = AnonymousClass7TE.A0p(1Au.A00(userSession));
                A0p.E5Z("opal_profile_menu_option_view_count", 2);
                A0p.apply();
                DbU.A0d().A04(r3.A06, userSession, (Integer) null, r3.A0I, "opal_profile_menu", false, false);
            }
        }
    }
}
