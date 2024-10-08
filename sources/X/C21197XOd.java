package X;

/* renamed from: X.XOd  reason: case insensitive filesystem */
public final class C21197XOd extends C21199XOf {
    public final C21200XOg A00;
    public final C375079Cd A01;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (r2 == X.XOa.A02) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C21197XOd A00(X.C21200XOg r8, X.C375079Cd r9) {
        /*
            X.XOb r0 = r8.A00
            X.XOa r2 = r0.A02
            X.97y r0 = r9.A00
            byte[] r0 = r0.A00
            int r7 = r0.length
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Encoded private key byte length for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " must be %d, not "
            java.lang.String r4 = X.Pxg.A0t(r0, r1, r7)
            X.XOa r3 = X.XOa.A00
            r6 = 1
            r5 = 32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            if (r2 != r3) goto L_0x0031
            if (r7 == r5) goto L_0x0062
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            java.security.GeneralSecurityException r0 = X.C21055XCg.A0W(r4, r0)
            throw r0
        L_0x0031:
            X.XOa r0 = X.XOa.A01
            if (r2 != r0) goto L_0x0042
            r0 = 48
            if (r7 == r0) goto L_0x0062
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            java.security.GeneralSecurityException r0 = X.C21055XCg.A0W(r4, r0)
            throw r0
        L_0x0042:
            X.XOa r0 = X.XOa.A02
            if (r2 != r0) goto L_0x0053
            r0 = 66
            if (r7 == r0) goto L_0x0062
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            java.security.GeneralSecurityException r0 = X.C21055XCg.A0W(r4, r0)
            throw r0
        L_0x0053:
            X.XOa r0 = X.XOa.A03
            if (r2 != r0) goto L_0x00f2
            if (r7 == r5) goto L_0x0062
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            java.security.GeneralSecurityException r0 = X.C21055XCg.A0W(r4, r0)
            throw r0
        L_0x0062:
            X.97y r0 = r8.A02
            byte[] r5 = r0.A01()
            X.9Ca r0 = X.C375049Ca.A00
            byte[] r7 = r9.A02(r0)
            if (r2 == r3) goto L_0x0079
            X.XOa r0 = X.XOa.A01
            if (r2 == r0) goto L_0x0079
            X.XOa r1 = X.XOa.A02
            r0 = 0
            if (r2 != r1) goto L_0x007a
        L_0x0079:
            r0 = 1
        L_0x007a:
            java.lang.String r4 = "Invalid private key for public key."
            if (r0 == 0) goto L_0x00ce
            if (r2 != r3) goto L_0x00ae
            java.security.spec.ECParameterSpec r3 = X.C22029Xtj.A00
        L_0x0082:
            java.math.BigInteger r2 = r3.getOrder()
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r6, r7)
            int r0 = r1.signum()
            if (r0 <= 0) goto L_0x00bc
            int r0 = r1.compareTo(r2)
            if (r0 >= 0) goto L_0x00bc
            java.security.spec.ECPoint r1 = X.C22029Xtj.A06(r1, r3)
            java.security.spec.EllipticCurve r0 = r3.getCurve()
            java.security.spec.ECPoint r0 = X.C22024Xt8.A02(r0, r5)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00e1
            java.security.GeneralSecurityException r0 = X.AnonymousClass7TG.A0q(r4)
            throw r0
        L_0x00ae:
            X.XOa r0 = X.XOa.A01
            if (r2 != r0) goto L_0x00b5
            java.security.spec.ECParameterSpec r3 = X.C22029Xtj.A01
            goto L_0x0082
        L_0x00b5:
            X.XOa r0 = X.XOa.A02
            if (r2 != r0) goto L_0x00c3
            java.security.spec.ECParameterSpec r3 = X.C22029Xtj.A02
            goto L_0x0082
        L_0x00bc:
            java.lang.String r0 = "Invalid private key."
            java.security.GeneralSecurityException r0 = X.AnonymousClass7TG.A0q(r0)
            throw r0
        L_0x00c3:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unable to determine NIST curve params for "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r2, r0, r1)
            throw r0
        L_0x00ce:
            X.XOa r0 = X.XOa.A03
            if (r2 != r0) goto L_0x00e7
            byte[] r0 = X.C18109Vld.A00(r7)
            boolean r0 = java.util.Arrays.equals(r0, r5)
            if (r0 != 0) goto L_0x00e1
            java.security.GeneralSecurityException r0 = X.AnonymousClass7TG.A0q(r4)
            throw r0
        L_0x00e1:
            X.XOd r0 = new X.XOd
            r0.<init>(r8, r9)
            return r0
        L_0x00e7:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unable to validate key pair for "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r2, r0, r1)
            throw r0
        L_0x00f2:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unable to validate private key length for "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.security.GeneralSecurityException r0 = X.AnonymousClass7TG.A0q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21197XOd.A00(X.XOg, X.9Cd):X.XOd");
    }

    public C21197XOd(C21200XOg xOg, C375079Cd r2) {
        this.A00 = xOg;
        this.A01 = r2;
    }
}
