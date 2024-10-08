package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.56C  reason: invalid class name */
public abstract class AnonymousClass56C {
    public static final boolean A00(UserSession userSession, Integer num) {
        boolean z;
        0Tu r2;
        long j;
        int intValue = num.intValue();
        if (intValue == 0) {
            z = false;
            r2 = 0Tu.A06;
            if (!182.A06(r2, userSession, 36321769623135953L)) {
                return false;
            }
            j = 36321769623856857L;
        } else if (intValue == 1) {
            z = false;
            r2 = 0Tu.A06;
            if (!182.A06(r2, userSession, 36321769623135953L)) {
                return false;
            }
            j = 36321769623922394L;
        } else if (intValue == 2) {
            z = false;
            r2 = 0Tu.A06;
            if (!182.A06(r2, userSession, 36321769623135953L)) {
                return false;
            }
            j = 36321769624839912L;
        } else {
            throw new RuntimeException();
        }
        if (182.A06(r2, userSession, j)) {
            return true;
        }
        return z;
    }
}
