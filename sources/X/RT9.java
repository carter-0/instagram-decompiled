package X;

public abstract class RT9 {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if ((r2 % 10) == 0) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.HashMap A00(X.AnonymousClass6Tm r7) {
        /*
            java.lang.Object r2 = X.DbW.A0e(r7)
            java.lang.String r2 = (java.lang.String) r2
            X.RFo r1 = X.SD7.A00(r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.common.payments.paymentmethods.creditcardvalidations.PaymentCardType"
            X.0qQ.A0C(r1, r0)
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = r1.A01
            java.lang.String r0 = "cardType"
            r6.put(r0, r1)
            r7 = 1
            if (r2 == 0) goto L_0x0060
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = "[^\\d+]"
            X.11S r1 = new X.11S
            r1.<init>(r0)
            java.lang.String r0 = ""
            java.lang.String r5 = r1.A00(r2, r0)
            X.RFo r1 = X.SD7.A00(r2)
            X.RFo r0 = X.C8921RFo.UNKNOWN
            if (r1 == r0) goto L_0x0060
            int r4 = r5.length()
            int r0 = r1.A00
            if (r4 != r0) goto L_0x0060
            r3 = 0
            r2 = 0
        L_0x0043:
            if (r3 >= r4) goto L_0x0062
            int r0 = r4 + -1
            int r0 = r0 - r3
            char r0 = r5.charAt(r0)
            int r1 = r0 + -48
            int r0 = r3 % 2
            if (r0 == 0) goto L_0x005c
            int r1 = r1 * 2
            r0 = 9
            if (r1 <= r0) goto L_0x005c
            int r0 = r1 + -10
            int r1 = r0 + 1
        L_0x005c:
            int r2 = r2 + r1
            int r3 = r3 + 1
            goto L_0x0043
        L_0x0060:
            r7 = 0
            goto L_0x0066
        L_0x0062:
            int r0 = r2 % 10
            if (r0 != 0) goto L_0x0060
        L_0x0066:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "isValid"
            r6.put(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RT9.A00(X.6Tm):java.util.HashMap");
    }
}
