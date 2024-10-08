package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Pk  reason: invalid class name and case insensitive filesystem */
public final class C331077Pk {
    public static final C331057Pi A02 = new Object();
    public final UserSession A00;
    public final C328387Ep A01;

    public C331077Pk(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = (C328387Ep) userSession.A01(C328387Ep.class, new C73661Pha(userSession, 44));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0089, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        if ((r7.A00(r6) & r4) != r4) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(X.AnonymousClass2Ep r9, java.lang.Integer r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            com.instagram.common.session.UserSession r6 = r8.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 2342161901214702258(0x208107d7005b1ab2, double:4.064646391081342E-152)
            boolean r1 = X.182.A06(r3, r6, r0)
            r0 = 0
            if (r1 != 0) goto L_0x002f
            if (r9 == 0) goto L_0x002e
            X.3Tu r1 = r9.AiM()
            if (r1 == 0) goto L_0x002e
            long r4 = r1.A03
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x002e
            X.0wj r3 = X.0wj.A01
            r2 = 817904752(0x30c03c70, float:1.3987016E-9)
            java.lang.String r1 = "TTLC is enabled but MC is disabled"
            X.0f9 r1 = r3.AEf(r1, r2)
            r1.report()
        L_0x002e:
            return r0
        L_0x002f:
            if (r11 != 0) goto L_0x002e
            if (r9 == 0) goto L_0x002e
            X.3Tu r7 = r9.AiM()
            if (r7 == 0) goto L_0x002e
            boolean r1 = r9.CVE()
            if (r1 != 0) goto L_0x002e
            int r1 = r10.intValue()
            switch(r1) {
                case 0: goto L_0x0047;
                case 1: goto L_0x0047;
                case 2: goto L_0x005d;
                case 3: goto L_0x0063;
                case 4: goto L_0x0066;
                case 5: goto L_0x004a;
                case 6: goto L_0x0050;
                case 7: goto L_0x0056;
                case 8: goto L_0x0069;
                case 9: goto L_0x004d;
                case 10: goto L_0x0060;
                case 11: goto L_0x006f;
                case 12: goto L_0x006f;
                case 13: goto L_0x0053;
                case 14: goto L_0x006c;
                case 15: goto L_0x0053;
                case 16: goto L_0x005d;
                case 17: goto L_0x006c;
                case 18: goto L_0x0072;
                case 19: goto L_0x0053;
                case 20: goto L_0x0075;
                default: goto L_0x0046;
            }
        L_0x0046:
            return r0
        L_0x0047:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0077
        L_0x004a:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x0077
        L_0x004d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0077
        L_0x0050:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x0077
        L_0x0053:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            goto L_0x0077
        L_0x0056:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r12 == 0) goto L_0x0077
            r4 = 2052(0x804, double:1.014E-320)
            goto L_0x0089
        L_0x005d:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            goto L_0x0077
        L_0x0060:
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            goto L_0x0077
        L_0x0063:
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            goto L_0x0077
        L_0x0066:
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            goto L_0x0077
        L_0x0069:
            java.lang.Integer r0 = X.AnonymousClass05K.A02
            goto L_0x0077
        L_0x006c:
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            goto L_0x0077
        L_0x006f:
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            goto L_0x0077
        L_0x0072:
            java.lang.Integer r0 = X.AnonymousClass05K.A05
            goto L_0x0077
        L_0x0075:
            java.lang.Integer r0 = X.AnonymousClass05K.A06
        L_0x0077:
            long r4 = X.C242393Tw.A00(r0)
            r1 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0089
            r0 = 36330269363421738(0x8112300000422a, double:3.0387468634560055E-306)
            X.182.A06(r3, r6, r0)
        L_0x0089:
            long r2 = r7.A00(r6)
            long r2 = r2 & r4
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x002e
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331077Pk.A00(X.2Ep, java.lang.Integer, boolean, boolean):boolean");
    }
}
