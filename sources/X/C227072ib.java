package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2ib  reason: invalid class name and case insensitive filesystem */
public final class C227072ib {
    public final UserSession A00;

    public final boolean A02(1Xj r6) {
        0qQ.A0B(r6, 0);
        if (r6.A5o()) {
            if (182.A06(0Tu.A05, this.A00, 2342171311482485971L)) {
                return false;
            }
        }
        if (r6.A0f) {
            return false;
        }
        if (182.A06(0Tu.A05, this.A00, 36328302268398799L)) {
            return true;
        }
        return false;
    }

    public final boolean A00() {
        return 182.A06(0Tu.A05, this.A00, 36328302268464336L);
    }

    public final boolean A01() {
        UserSession userSession = this.A00;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36328302268398799L) || 182.A06(r2, userSession, 36328302268857556L)) {
            return true;
        }
        return false;
    }

    public C227072ib(UserSession userSession) {
        this.A00 = userSession;
    }
}
