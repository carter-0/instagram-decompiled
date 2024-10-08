package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5Ib  reason: invalid class name and case insensitive filesystem */
public final class C283535Ib implements AnonymousClass5IX {
    public static final C279244yJ A01 = new Object();
    public final UserSession A00;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (X.182.A06(X.0Tu.A05, r5, 36319570599878118L) == false) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E1z(X.AnonymousClass5IY r9) {
        /*
            r8 = this;
            X.4yJ r6 = A01
            com.instagram.common.session.UserSession r5 = r8.A00
            boolean r0 = X.C279244yJ.A00(r5)
            r4 = 0
            if (r0 == 0) goto L_0x0068
            X.0wX r2 = X.C61170le.A00
            X.0xm r7 = X.AnonymousClass0xl.A00(r2)
            boolean r1 = X.C279244yJ.A01(r5)
            r0 = 1
            if (r1 == 0) goto L_0x0019
            return r0
        L_0x0019:
            X.0xm r0 = X.AnonymousClass0xl.A00(r2)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "preference_has_denied_push_system_dialog"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x0035
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319570599878118(0x81087500001de6, double:3.031980922310557E-306)
            boolean r1 = X.182.A06(r2, r5, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            r3 = 33
            if (r0 == 0) goto L_0x0051
            X.0Tu r2 = X.0Tu.A05
            r0 = 36601045576650838(0x82087500011056, double:3.209986831030383E-306)
            long r1 = X.182.A01(r2, r5, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x0068
            boolean r0 = r6.A02(r5, r1)
            if (r0 == 0) goto L_0x0068
        L_0x004f:
            r4 = 1
            return r4
        L_0x0051:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r3) goto L_0x0068
            X.0xa r1 = r7.A00
            java.lang.String r0 = "preference_has_asked_push_permission_in_nux"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "preference_push_permission_impression_count"
            int r0 = r1.getInt(r0, r4)
            if (r0 != 0) goto L_0x0068
            goto L_0x004f
        L_0x0068:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C283535Ib.E1z(X.5IY):boolean");
    }

    public C283535Ib(UserSession userSession) {
        this.A00 = userSession;
    }
}
