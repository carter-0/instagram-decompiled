package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Mm3  reason: case insensitive filesystem */
public final class C67327Mm3 implements AnonymousClass5IX {
    public final UserSession A00;
    public final C66797Mcj A01 = C66797Mcj.A00;

    public final boolean E1z(AnonymousClass5IY r4) {
        UserSession userSession = this.A00;
        if (!1xy.A00(userSession).A00() || new AnonymousClass630(userSession).A02.A01(1) || !C66797Mcj.A01(userSession, true)) {
            return false;
        }
        return true;
    }

    public C67327Mm3(UserSession userSession) {
        this.A00 = userSession;
    }
}
