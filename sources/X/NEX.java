package X;

public final class NEX extends 0aw {
    public final AnonymousClass0cT A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r3 == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(android.content.Context r5, android.content.Intent r6, X.0bY r7, java.lang.Object r8) {
        /*
            r4 = this;
            r0 = 0
            X.0cT r2 = r4.A00
            java.lang.String r1 = X.C51968G9o.A16(r8)
            X.0qQ.A07(r1)
            X.0qQ.A0B(r2, r0)
            java.util.List r0 = X.OUo.A01
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            boolean r3 = r2.A03(r5, r6, r0)
            if (r3 != 0) goto L_0x0033
        L_0x001c:
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r1 = "DirectMessageTrustedAppChecker"
            java.lang.String r0 = "Failed trusted app check: %s"
            X.0KC.A0P(r1, r0, r2)
            java.lang.String r0 = "Binding intent not handled due to permission check failure"
            X.0wb.A03(r1, r0)
            if (r7 == 0) goto L_0x0033
            java.lang.String r0 = "Failed Stella trusted app check"
            r7.EFS(r0)
        L_0x0033:
            return r3
        L_0x0034:
            r3 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NEX.A00(android.content.Context, android.content.Intent, X.0bY, java.lang.Object):boolean");
    }

    public NEX() {
        0cS r1 = new 0cS();
        r1.A05("com.instagram.android.fbpermission.MANAGE_MESSAGING");
        r1.A04("MANAGE_DIRECT_MESSAGING");
        this.A00 = r1.A00();
    }
}
