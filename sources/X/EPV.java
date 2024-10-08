package X;

import com.instagram.common.session.UserSession;

public final class EPV extends C319156q8 {
    public final void A02() {
        C323256xC r3 = this.A01;
        UserSession userSession = r3.A09;
        boolean A06 = 182.A06(0Tu.A06, userSession, 36312363645142073L);
        AnonymousClass4DH r32 = r3.A07;
        if (A06) {
            F79.A01(r32.getActivity(), userSession, (String) null, false);
        } else {
            F79.A00(r32, userSession, "profile", "discover_people", false);
        }
    }
}
