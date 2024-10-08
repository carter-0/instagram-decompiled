package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.58E  reason: invalid class name */
public final class AnonymousClass58E implements C250603lj {
    public final UserSession A00;

    public AnonymousClass58E(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        1Xj r3 = (1Xj) r5.A03;
        if (r3 != null && r6.CEk(r5) == AnonymousClass05K.A00) {
            AnonymousClass589 r2 = AnonymousClass589.IG_FEED_TIMELINE;
            String id = r3.getId();
            if (id != null) {
                AnonymousClass584.A00(this.A00).A01(new AnonymousClass58G(r2, id));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
