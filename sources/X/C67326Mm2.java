package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mm2  reason: case insensitive filesystem */
public final class C67326Mm2 implements AnonymousClass5IX {
    public final UserSession A00;

    public final boolean E1z(AnonymousClass5IY r7) {
        UserSession userSession = this.A00;
        if (!new AnonymousClass630(userSession).A02.A01(1)) {
            return false;
        }
        1Av A002 = 1Au.A00(userSession);
        if (!AnonymousClass7TG.A1a(A002, A002.A7u, 1Av.A8a, 509) || !C66797Mcj.A01(userSession, false)) {
            return false;
        }
        return true;
    }

    public C67326Mm2(UserSession userSession) {
        this.A00 = userSession;
    }
}
