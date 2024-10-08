package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fh7  reason: case insensitive filesystem */
public final class C50706Fh7 implements AnonymousClass5IX {
    public final UserSession A00;

    public final boolean E1z(AnonymousClass5IY r4) {
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A00;
        if (r0.A01(userSession).A0N() != AnonymousClass05K.A01 || !C375469Dr.A00(userSession)) {
            return false;
        }
        return true;
    }

    public C50706Fh7(UserSession userSession) {
        this.A00 = userSession;
    }
}
