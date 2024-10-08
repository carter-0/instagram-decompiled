package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fgz  reason: case insensitive filesystem */
public final class C50700Fgz implements AnonymousClass5IX {
    public final UserSession A00;

    public final boolean E1z(AnonymousClass5IY r4) {
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = this.A00;
        if (r0.A01(userSession).A0N() != AnonymousClass05K.A01 || !AnonymousClass7K4.A00(userSession)) {
            return false;
        }
        return true;
    }

    public C50700Fgz(UserSession userSession) {
        this.A00 = userSession;
    }
}
