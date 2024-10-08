package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8nx  reason: invalid class name and case insensitive filesystem */
public abstract class C365958nx {
    public static final C365988o0 A00(UserSession userSession, C279284yO r2, boolean z) {
        0qQ.A0B(r2, 1);
        if (r2 instanceof AnonymousClass80O) {
            return new C368518sm(userSession);
        }
        if (r2 instanceof AnonymousClass80M) {
            return new C368498si(userSession, z);
        }
        return new C365978nz(userSession, z);
    }
}
