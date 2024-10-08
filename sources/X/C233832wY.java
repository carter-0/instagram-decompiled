package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2wY  reason: invalid class name and case insensitive filesystem */
public abstract class C233832wY {
    public static final String A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36319772463930999L) || !182.A06(r2, userSession, 36319772463996536L)) {
            return null;
        }
        1Av A00 = 1Au.A00(userSession);
        return (String) A00.A06.CDM(A00, 1Av.A8a[369]);
    }

    public static final boolean A05(UserSession userSession, boolean z, boolean z2, boolean z3) {
        0Tu r2;
        long j;
        if (!z) {
            if (!z2 || !A01(userSession) || !z3) {
                return false;
            }
            r2 = 0Tu.A05;
            j = 36319772464389756L;
        } else if (!A01(userSession)) {
            return false;
        } else {
            r2 = 0Tu.A05;
            j = 36319772463865462L;
        }
        if (182.A06(r2, userSession, j)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        Object obj;
        if (182.A06(0Tu.A05, userSession, 36319772463996536L)) {
            1Av A00 = 1Au.A00(userSession);
            obj = A00.A06.CDM(A00, 1Av.A8a[369]);
        } else {
            obj = null;
        }
        if (0qQ.A0K(obj, AnonymousClass3VR.ACTIVE.toString()) || 0qQ.A0K(obj, AnonymousClass3VR.DOGFOODING.toString())) {
            return true;
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, boolean z) {
        if (!A01(userSession) || !z || !182.A06(0Tu.A05, userSession, 36319772463472240L)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession, boolean z) {
        if (!A01(userSession) || !z || !182.A06(0Tu.A05, userSession, 36319772463537777L)) {
            return false;
        }
        return true;
    }

    public static final boolean A04(UserSession userSession, boolean z) {
        if (!A01(userSession) || !z || !182.A06(0Tu.A05, userSession, 36319772463341166L)) {
            return false;
        }
        return true;
    }
}
