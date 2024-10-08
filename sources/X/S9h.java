package X;

public abstract class S9h {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if (X.0qQ.A0K(r4.A02, r5.A02) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.SUj r4, X.SUj r5) {
        /*
            r3 = 0
            if (r5 == 0) goto L_0x0025
            if (r4 == 0) goto L_0x0027
            boolean r0 = r4.equals(r5)
            if (r0 != 0) goto L_0x0025
            X.RDz r2 = r4.A00
            X.RDz r0 = r5.A00
            if (r2 != r0) goto L_0x0028
            java.lang.Object r1 = r4.A01
            java.lang.Object r0 = r5.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0028
            java.lang.Throwable r1 = r4.A02
            java.lang.Throwable r0 = r5.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0028
        L_0x0025:
            r3 = 1
        L_0x0026:
            return r3
        L_0x0027:
            r2 = 0
        L_0x0028:
            X.RDz r0 = X.C8882RDz.LOADING
            if (r2 != r0) goto L_0x0026
            X.RDz r1 = r4.A00
            X.RDz r0 = r5.A00
            if (r1 != r0) goto L_0x0026
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S9h.A01(X.SUj, X.SUj):boolean");
    }

    public static final SUj A00(SUj sUj, int i) {
        if (!SUj.A0S(sUj) || !(sUj.A02 instanceof C13216TQh)) {
            return sUj;
        }
        SUj A0A = SUj.A0A(sUj.A01, new C13216TQh(RH2.A0A, i));
        0qQ.A0A(A0A);
        return A0A;
    }
}
