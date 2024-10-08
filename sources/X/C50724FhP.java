package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FhP  reason: case insensitive filesystem */
public final class C50724FhP implements AnonymousClass5IX {
    public final int A00;
    public final UserSession A01;

    public final boolean E1z(AnonymousClass5IY r7) {
        if (AnonymousClass3FV.A02(this.A01) >= ((long) this.A00)) {
            return true;
        }
        return false;
    }

    public C50724FhP(UserSession userSession, int i) {
        this.A01 = userSession;
        this.A00 = i;
    }
}
