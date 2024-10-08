package X;

import com.instagram.common.session.UserSession;

public final class ONT {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C51801G2k(this, 8));
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C51801G2k(this, 9));

    public ONT(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final C69627Np9 A00() {
        C69627Np9 np9;
        if (!AnonymousClass7TF.A1Z(this.A02) && !AnonymousClass7TF.A1Z(this.A01)) {
            UserSession userSession = this.A00;
            0Tu r2 = 0Tu.A06;
            if (182.A06(r2, userSession, 36310903355867507L)) {
                np9 = C69146NfV.A00;
            } else if (182.A06(r2, userSession, 36310903356981620L)) {
                np9 = C69147NfW.A00;
            }
            return np9;
        }
        np9 = C69145NfU.A00;
        return np9;
    }

    public final boolean A01() {
        return 182.A06(0Tu.A05, this.A00, 36310903358292347L);
    }

    public final boolean A02() {
        if (A00() instanceof C69146NfV) {
            if (!182.A06(0Tu.A05, this.A00, 36310903358030200L)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
