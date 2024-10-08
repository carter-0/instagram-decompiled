package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FEj  reason: case insensitive filesystem */
public final class C49911FEj {
    public static final C49911FEj A00 = new Object();

    public static final boolean A00(1Xj r2) {
        Integer Bd0;
        Integer CEg = r2.A0C.CEg();
        if ((CEg == null || CEg.intValue() <= 0) && ((Bd0 = r2.A0C.Bd0()) == null || Bd0.intValue() <= 0)) {
            return false;
        }
        return true;
    }

    public final int A01(UserSession userSession, 1Xj r4, boolean z) {
        if (!C46342Dck.A02(userSession, r4) || !C338007hG.A01(r4)) {
            if (r4.A5G() || A00(r4)) {
                return 2131964957;
            }
            return 2131964955;
        } else if (z) {
            return 2131971325;
        } else {
            return 2131971326;
        }
    }
}
