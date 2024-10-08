package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6K6  reason: invalid class name */
public abstract class AnonymousClass6K6 {
    public static final AnonymousClass6K7 A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (AnonymousClass6K7.A03 == null) {
            AnonymousClass6K7.A03 = new AnonymousClass6K7(userSession);
        }
        AnonymousClass6K7 r0 = AnonymousClass6K7.A03;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("instance");
        throw AnonymousClass00P.createAndThrow();
    }
}
