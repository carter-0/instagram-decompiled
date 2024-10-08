package X;

import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.F5i  reason: case insensitive filesystem */
public abstract class C49757F5i {
    public static final FZ0 A00(AnonymousClass0iw r3, UserSession userSession) {
        AnonymousClass7TG.A1N(userSession, r3);
        return (FZ0) userSession.A01(FZ0.class, new C73667Phg(18, r3, userSession));
    }

    public static final void A01(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass0Ai r0 = (AnonymousClass0Ai) it.next();
            if (r0 != null) {
                r0.Cgf();
            }
        }
    }
}
