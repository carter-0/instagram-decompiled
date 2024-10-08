package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.430  reason: invalid class name */
public abstract class AnonymousClass430 {
    public static final boolean A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        1Av A00 = 1Au.A00(userSession);
        Object CDM = A00.A0L.CDM(A00, 1Av.A8a[139]);
        if (0eE.A00(userSession).A00().A1O() || "eligible".equals(CDM) || "at_risk_of_becoming_ineligible".equals(CDM)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return A03(userSession, 36312995005007433L);
    }

    public static final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36316126037151728L) || !182.A06(r2, userSession, 36316126037413876L)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession, long j) {
        1AA A02 = 182.A02(userSession, j);
        if (A02 == null || !A02.Ah0(0Tu.A04, j)) {
            return false;
        }
        return true;
    }
}
