package X;

import com.instagram.common.session.UserSession;
import kotlin.Deprecated;

/* renamed from: X.438  reason: invalid class name */
public final class AnonymousClass438 {
    @Deprecated(message = "Should only be used when trying to synchronize complex operations, otherwise use IgExecutor.")
    public final AnonymousClass435 A00(UserSession userSession) {
        Class cls;
        C62320sa r0;
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36328001620687712L)) {
            cls = B7S.class;
            r0 = B7R.A00;
        } else {
            cls = AnonymousClass436.class;
            r0 = AnonymousClass437.A00;
        }
        return (AnonymousClass435) userSession.A01(cls, r0);
    }
}
