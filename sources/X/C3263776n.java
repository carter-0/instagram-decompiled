package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.76n  reason: invalid class name and case insensitive filesystem */
public abstract class C3263776n {
    public static final boolean A00(UserSession userSession, C242373Tu r7) {
        if (!C331057Pi.A02(r7)) {
            return false;
        }
        boolean A06 = 182.A06(0Tu.A05, userSession, 36322809005222319L);
        1Av A00 = 1Au.A00(userSession);
        boolean booleanValue = ((Boolean) A00.A7r.CDM(A00, 1Av.A8a[510])).booleanValue();
        if (!A06 || booleanValue) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, C242373Tu r3, C254703su r4, C254873tC r5) {
        if (!r4.A1T() && !r4.A2P && r4.A10 != 2FW.A1s && A00(userSession, r3)) {
            return true;
        }
        if (!r4.A1S() || r5.A0Q != C254883tD.PLAIN) {
            return false;
        }
        return true;
    }
}
