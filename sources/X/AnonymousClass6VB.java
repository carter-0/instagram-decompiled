package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6VB  reason: invalid class name */
public abstract class AnonymousClass6VB {
    public static final AnonymousClass6VC A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (AnonymousClass6VC.A02 == null) {
            AnonymousClass6VC.A02 = new AnonymousClass6VC(userSession);
        }
        AnonymousClass6VC r0 = AnonymousClass6VC.A02;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("instance");
        throw AnonymousClass00P.createAndThrow();
    }
}
