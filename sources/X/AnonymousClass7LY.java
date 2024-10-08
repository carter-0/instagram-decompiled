package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7LY  reason: invalid class name */
public abstract class AnonymousClass7LY {
    public static final boolean A01(UserSession userSession, int i) {
        0Tu r2;
        long j;
        0qQ.A0B(userSession, 0);
        if (!A00(i)) {
            return true;
        }
        if (i == 29) {
            r2 = 0Tu.A05;
            j = 36316512585191873L;
        } else if (i != 32 && i != 62) {
            return false;
        } else {
            r2 = 0Tu.A05;
            j = 36315881224343188L;
        }
        return 182.A06(r2, userSession, j);
    }

    public static final boolean A00(int i) {
        if (i == 29 || AnonymousClass48O.A01(i) || AnonymousClass48O.A02(i)) {
            return true;
        }
        return false;
    }
}
