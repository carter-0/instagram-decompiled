package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.4i4  reason: invalid class name and case insensitive filesystem */
public abstract class C271174i4 {
    public static final C54669HOa A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A05, userSession, 36318926354848510L)) {
            return C54669HOa.OPEN_TO_COLLAB_V2;
        }
        return C54669HOa.OPEN_TO_COLLAB_V1;
    }

    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return 182.A06(0Tu.A05, userSession, 36328886383951522L);
    }

    public static final boolean A03(UserSession userSession, 1Xj r5) {
        return 0qQ.A0K(r5.A0C.BuI(), true) || 182.A06(0Tu.A05, userSession, 36325493359850491L);
    }

    public static final boolean A04(UserSession userSession, boolean z) {
        long j;
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (z) {
            j = 36324977964036643L;
        } else {
            j = 36324977963971106L;
        }
        if (!182.A06(r2, userSession, j) || !182.A06(r2, userSession, 36324977964102180L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36318926354848510L) || 182.A06(r2, userSession, 36318926354782973L)) {
            return true;
        }
        return false;
    }
}
