package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fh2  reason: case insensitive filesystem */
public final class C50702Fh2 implements AnonymousClass5IX {
    public final UserSession A00;

    public final boolean E1z(AnonymousClass5IY r4) {
        UserSession userSession = this.A00;
        AnonymousClass9BG A01 = AnonymousClass9BG.A01(userSession);
        0qQ.A07(A01);
        String str = userSession.A06;
        if (!A01.A06(str) || AnonymousClass9BG.A00(A01, str) <= 0) {
            return false;
        }
        return true;
    }

    public C50702Fh2(UserSession userSession) {
        this.A00 = userSession;
    }
}
