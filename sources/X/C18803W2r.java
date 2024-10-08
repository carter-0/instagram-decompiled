package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.W2r  reason: case insensitive filesystem */
public abstract class C18803W2r {
    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (182.A06(0Tu.A06, userSession, 36323131127835513L) || !182.A06(0Tu.A05, userSession, 36323131127901050L)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        int A01 = A01(userSession);
        if (A01 == 1 || A01 == 2 || 182.A06(0Tu.A05, userSession, 36319888427589324L)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        int A00;
        0qQ.A0B(userSession, 0);
        int A01 = A01(userSession);
        if (A01 == 1 || A01 == 2 || (A00 = A00(userSession)) == 4 || A00 == 5) {
            return true;
        }
        return false;
    }

    public static final int A00(UserSession userSession) {
        return (int) 182.A01(0Tu.A05, userSession, 36601363404165268L);
    }

    public static final int A01(UserSession userSession) {
        return (int) 182.A01(0Tu.A05, userSession, 36601363404361877L);
    }

    public static final boolean A04(UserSession userSession) {
        int A01 = A01(userSession);
        if (A01 == 1 || A01 == 2 || 182.A06(0Tu.A05, userSession, 36319888427523787L)) {
            return true;
        }
        return false;
    }

    public static final boolean A06(UserSession userSession) {
        return 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36328310858398942L);
    }
}
