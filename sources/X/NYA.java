package X;

import com.instagram.common.session.UserSession;

public final class NYA extends C327997Da {
    public final UserSession A00;

    public final Class modelClass() {
        return C68211N6a.class;
    }

    public NYA(UserSession userSession, AnonymousClass7DR r2, AnonymousClass74R r3) {
        super(r2, r3);
        this.A00 = userSession;
    }

    /* renamed from: A03 */
    public final void bind(AnonymousClass7EZ r4, C68211N6a n6a) {
        AnonymousClass7TG.A1N(n6a, r4);
        UserSession userSession = this.A00;
        0qQ.A0B(userSession, 0);
        if (!((AnonymousClass7ZD) userSession.A01(AnonymousClass7ZL.class, AnonymousClass7ZK.A00)).A02(n6a.A00.A0L.A02)) {
            ((C3257073v) r4.A0M).A0A.setVisibility(8);
        } else {
            super.bind(n6a, r4);
        }
    }
}
