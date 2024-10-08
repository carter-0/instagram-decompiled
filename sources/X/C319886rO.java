package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6rO  reason: invalid class name and case insensitive filesystem */
public final class C319886rO {
    public static final C319886rO A00 = new Object();

    public static final String A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (AnonymousClass9HN.A00(userSession).booleanValue()) {
            String A04 = 182.A04(0Tu.A05, userSession, 36881837653950878L);
            if (A04.length() != 0) {
                return A04;
            }
        }
        return "Threads";
    }

    public static final boolean A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (!AnonymousClass9HN.A00(userSession).booleanValue() || !182.A06(0Tu.A05, userSession, 36318887701387845L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        return "6875945d398f9fd6e332c3950d576e7b".equals(182.A04(0Tu.A05, userSession, 36881837655851426L));
    }

    public static final boolean A02(UserSession userSession) {
        if (!AnonymousClass9HN.A00(userSession).booleanValue()) {
            return false;
        }
        if (1Au.A00(userSession).A01.getBoolean("barcelona_has_seen_golden_ticket", false) || 182.A06(0Tu.A05, userSession, 36318887700339259L)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        if (!AnonymousClass9HN.A00(userSession).booleanValue() || !182.A06(0Tu.A05, userSession, 36318887702698584L)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession) {
        if (AnonymousClass9HN.A00(userSession).booleanValue()) {
            0Tu r2 = 0Tu.A05;
            if (!182.A06(r2, userSession, 36318887700863550L) || 182.A06(r2, userSession, 36327795462322887L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A06(UserSession userSession) {
        if (!A05(userSession) || !182.A06(0Tu.A05, userSession, 36318887702108752L)) {
            return false;
        }
        return true;
    }
}
