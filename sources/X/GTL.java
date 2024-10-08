package X;

import com.instagram.common.session.UserSession;

public final class GTL implements C250603lj {
    public final UserSession A00;
    public final 1sy A01;
    public final String A02;

    public GTL(UserSession userSession, 1sy r3, String str) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
        this.A02 = str;
    }

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        String str;
        0qQ.A0B(r6, 0);
        1Xj r4 = (1Xj) r6.A03;
        if (r4 != null && r4.A4R() && !0qQ.A0K(r4.A0C.BBA(), true)) {
            r4.A0C.EYH(true);
            if (0qQ.A0K(this.A01.toString(), "MEDIA_CONTEXTUAL_FEED")) {
                str = "profile";
            } else {
                str = null;
            }
            String A30 = r4.A30();
            if (A30 != null) {
                1OC A05 = C3724090s.A05(this.A00, A30, str, this.A02);
                A05.A00 = new H51(6, (Object) r4, (Object) this);
                1ES.A03(A05);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
