package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Yk  reason: invalid class name and case insensitive filesystem */
public final class C243353Yk {
    public static final C243353Yk A00 = new Object();

    public static final boolean A00(UserSession userSession, 1Xj r2) {
        0qQ.A0B(userSession, 1);
        if (r2.A5c()) {
            return true;
        }
        if (2R8.A02(userSession, r2) || !AnonymousClass3VS.A00(userSession).A00) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession, 1Xj r4) {
        0qQ.A0B(userSession, 1);
        boolean A06 = 182.A06(0Tu.A05, userSession, 36328302268529873L);
        if (r4.A61()) {
            return true;
        }
        if (2R8.A02(userSession, r4) || !A06 || !AnonymousClass3VS.A00(userSession).A00) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r5.A5R() != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(com.instagram.common.session.UserSession r4, X.1Xj r5, java.lang.Integer r6) {
        /*
            r1 = 0
            boolean r0 = r5.CeS()
            r3 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            if (r6 == 0) goto L_0x0038
            int r0 = r6.intValue()
            if (r0 <= 0) goto L_0x0038
            boolean r2 = X.2R8.A02(r4, r5)
            boolean r0 = r5.A5T()
            if (r0 != 0) goto L_0x0022
            boolean r1 = r5.A5R()
            r0 = 0
            if (r1 == 0) goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            if (r2 == 0) goto L_0x0026
            return r0
        L_0x0026:
            if (r0 == 0) goto L_0x0038
            boolean r0 = r5.A5c()
            if (r0 != 0) goto L_0x0038
            X.3VT r0 = X.AnonymousClass3VS.A00(r4)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0038
            r3 = 1
            return r3
        L_0x0038:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243353Yk.A03(com.instagram.common.session.UserSession, X.1Xj, java.lang.Integer):boolean");
    }

    public final boolean A04(UserSession userSession, 1Xj r5) {
        0qQ.A0B(userSession, 1);
        boolean A06 = 182.A06(0Tu.A05, userSession, 36315640704994753L);
        if (2R8.A02(userSession, r5)) {
            return false;
        }
        if (r5.A5c() || (AnonymousClass3VS.A00(userSession).A00 && A06)) {
            return true;
        }
        return false;
    }

    public final boolean A05(UserSession userSession, 1Xj r6, Integer num, boolean z) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(userSession, 3);
        boolean A06 = 182.A06(0Tu.A05, userSession, 36315640704994753L);
        if (!z) {
            return false;
        }
        if (!A03(userSession, r6, num) && !r6.A5c()) {
            if (r6.BR7() != 1iA.A0a || !A06 || 2R8.A02(userSession, r6)) {
                return false;
            }
            if (r6.A5c() || AnonymousClass3VS.A00(userSession).A00) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession, 1Xj r2) {
        if (2R8.A02(userSession, r2)) {
            return true;
        }
        if (!r2.CeS() || r2.A5c() || AnonymousClass3VS.A00(userSession).A00) {
            return false;
        }
        return true;
    }
}
