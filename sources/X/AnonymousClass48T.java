package X;

/* renamed from: X.48T  reason: invalid class name */
public final class AnonymousClass48T {
    public AnonymousClass3SZ A00;
    public AnonymousClass3SZ A01;
    public final String A02;
    public final AnonymousClass0eM A03;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        if (X.AnonymousClass48V.A01.compare(r8.A0g(), r2) > 0) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.C254703su r8, X.AnonymousClass48T r9, boolean r10) {
        /*
            boolean r0 = r8.A2P
            r7 = 1
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = r8.A0g()
            if (r0 == 0) goto L_0x0078
            if (r10 == 0) goto L_0x0033
            long r5 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            long r3 = r8.C7c()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r0 = 6
            long r0 = r2.toMicros(r0)
            long r5 = r5 - r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0033
            X.0eM r0 = r9.A03
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0078
        L_0x0033:
            java.lang.String r1 = r8.A1u
            java.lang.String r0 = r9.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = r8.A0g()
            if (r0 == 0) goto L_0x0078
            X.3SZ r0 = r9.A01
            if (r0 == 0) goto L_0x005c
            X.3Sc r0 = r0.A02
            if (r0 == 0) goto L_0x005c
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x005c
            java.util.Comparator r1 = X.AnonymousClass48V.A01
            java.lang.String r0 = r8.A0g()
            int r0 = r1.compare(r0, r2)
            r3 = 1
            if (r0 <= 0) goto L_0x005d
        L_0x005c:
            r3 = 0
        L_0x005d:
            X.3SZ r0 = r9.A00
            if (r0 == 0) goto L_0x0078
            X.3Sc r0 = r0.A02
            if (r0 == 0) goto L_0x0078
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x0078
            java.util.Comparator r1 = X.AnonymousClass48V.A01
            java.lang.String r0 = r8.A0g()
            int r0 = r1.compare(r0, r2)
            if (r0 > 0) goto L_0x0078
            if (r3 == 0) goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            return r7
        L_0x0079:
            boolean r0 = r9.A01(r8)
            if (r0 != 0) goto L_0x0077
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48T.A00(X.3su, X.48T, boolean):boolean");
    }

    public final boolean A01(C254703su r5) {
        String str;
        String str2;
        if (0qQ.A0K(r5.A1u, this.A02)) {
            AnonymousClass3SZ r1 = this.A01;
            boolean z = r5.A2P;
            if (r1 == null) {
                return false;
            }
            if (!z) {
                str2 = r1.A02;
            } else {
                C241973Sc r0 = r1.A02;
                if (r0 == null) {
                    return false;
                }
                str2 = r0.A01;
            }
            if (str2 == null || r5.A0g() == null) {
                return false;
            }
            AnonymousClass3SZ r12 = this.A01;
            boolean z2 = r5.A2P;
            if (r12 == null) {
                return false;
            }
            if (!z2) {
                str = r12.A02;
            } else {
                C241973Sc r02 = r12.A02;
                if (r02 == null) {
                    return false;
                }
                str = r02.A01;
            }
        } else {
            AnonymousClass3SZ r13 = this.A00;
            boolean z3 = r5.A2P;
            if (r13 == null) {
                return false;
            }
            if (!z3) {
                str = r13.A02;
            } else {
                C241973Sc r03 = r13.A02;
                if (r03 == null) {
                    return false;
                }
                str = r03.A01;
            }
            str2 = str;
        }
        if (str == null || AnonymousClass48V.A01.compare(r5.A0g(), str2) > 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass48T(String str, AnonymousClass0eM r2) {
        this.A02 = str;
        this.A03 = r2;
    }
}
