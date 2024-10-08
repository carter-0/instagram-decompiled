package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.3ER  reason: invalid class name */
public abstract class AnonymousClass3ER {
    public static final boolean A02(int i, long j) {
        boolean z = false;
        if (604800000 <= System.currentTimeMillis() - j) {
            z = true;
        }
        0Tu A00 = 0Tu.A00(0Tu.A04);
        A00.A03 = true;
        0qQ.A0A(A00);
        int A01 = (int) 1AW.A01(A00, 18597410255411465L);
        boolean z2 = false;
        if (i < A01) {
            z2 = true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static final boolean A00() {
        if (!AnonymousClass3EM.A05(18315935278776898L, false)) {
            return false;
        }
        if (AnonymousClass3EM.A05(18315935278842435L, false) || AnonymousClass3EM.A05(18315935278907972L, false)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(int i, long j) {
        0Tu r4 = 0Tu.A04;
        0Tu A00 = 0Tu.A00(r4);
        A00.A03 = true;
        0qQ.A0A(A00);
        int A01 = (int) 1AW.A01(A00, 18597410255411465L);
        long currentTimeMillis = System.currentTimeMillis();
        0Tu A002 = 0Tu.A00(r4);
        A002.A03 = true;
        0qQ.A0A(A002);
        int i2 = (1AW.A01(A002, 18583425845365733L) > (currentTimeMillis - j) ? 1 : (1AW.A01(A002, 18583425845365733L) == (currentTimeMillis - j) ? 0 : -1));
        boolean z = false;
        if (i2 <= 0) {
            z = true;
        }
        if (i >= A01 || !z) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession) {
        if (AnonymousClass3EM.A05(18315935278580288L, false)) {
            CallerContext callerContext = FRS.A00;
            if (2Lv.A00(userSession).A01(FRS.A00, "fx_company_identity_switcher_linking_cache") == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        if (AnonymousClass3EM.A05(18315935278645825L, false)) {
            CallerContext callerContext = FRS.A00;
            2Ly A00 = 2Lv.A00(userSession);
            if (!(!A00.A00.A03(FRS.A00, "fx_company_identity_switcher_linking_cache", "INSTAGRAM").isEmpty())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
