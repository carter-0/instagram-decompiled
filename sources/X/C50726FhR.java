package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FhR  reason: case insensitive filesystem */
public final class C50726FhR implements AnonymousClass5IX {
    public final 0tS A00 = DbT.A0h();
    public final String A01;

    public final boolean E1z(AnonymousClass5IY r7) {
        String A13;
        String str = this.A01;
        0tS r3 = this.A00;
        0s0 r1 = r3.A08;
        AnonymousClass0YZ[] r2 = 0tS.A4G;
        String A132 = DbV.A13(r3, r1, r2, 232);
        if (A132 == null || !A132.equals(str) || (A13 = DbV.A13(r3, r3.A07, r2, 231)) == null || A13.length() <= 0) {
            return false;
        }
        return true;
    }

    public C50726FhR(UserSession userSession) {
        this.A01 = userSession.A06;
    }
}
