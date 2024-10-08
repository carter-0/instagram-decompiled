package X;

public abstract class RUO {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.content.Context r7, com.facebook.browser.lite.extensions.autofill.model.AutofillData r8) {
        /*
            r0 = 0
            X.0qQ.A0B(r7, r0)
            r2 = 1
            java.util.Map r6 = r8.A00
            java.lang.String r5 = "tel"
            java.lang.Object r1 = r6.get(r5)
            if (r1 == 0) goto L_0x0075
            com.facebook.phonenumbers.PhoneNumberUtil r4 = com.facebook.phonenumbers.PhoneNumberUtil.A01(r7)
            X.0qQ.A0A(r4)
            X.0qQ.A0B(r4, r2)
            java.lang.String r2 = "tel-country-code"
            java.lang.String r1 = X.DbT.A11(r2, r6)
            r7 = 0
            if (r1 == 0) goto L_0x003b
            boolean r1 = X.00l.A0W(r1)
            if (r1 != 0) goto L_0x003b
            java.lang.String r2 = X.DbT.A11(r2, r6)
        L_0x002e:
            if (r2 == 0) goto L_0x0075
        L_0x0030:
            boolean r1 = X.00l.A0W(r2)
            if (r1 != 0) goto L_0x0075
            java.lang.String r1 = X.DbT.A11(r5, r6)
            goto L_0x005f
        L_0x003b:
            java.lang.String r3 = "country"
            java.lang.String r1 = X.DbT.A11(r3, r6)
            if (r1 == 0) goto L_0x0049
            boolean r1 = X.00l.A0W(r1)
            if (r1 == 0) goto L_0x004a
        L_0x0049:
            r7 = 1
        L_0x004a:
            java.lang.String r2 = ""
            if (r7 != 0) goto L_0x0030
            java.lang.String r1 = X.DbT.A11(r3, r6)
            int r3 = r4.A0A(r1)
            if (r3 == 0) goto L_0x0030
            X.79y r1 = r4.A00
            java.lang.String r2 = r1.A01(r3)
            goto L_0x002e
        L_0x005f:
            X.74u r1 = r4.A0F(r1, r2)     // Catch:{ 2sh -> 0x0075 }
            boolean r1 = r4.A0M(r1)     // Catch:{ 2sh -> 0x0075 }
            if (r1 == 0) goto L_0x0075
            java.lang.String r1 = X.DbT.A11(r5, r6)     // Catch:{ 2sh -> 0x0075 }
            X.74u r1 = r4.A0F(r1, r2)     // Catch:{ 2sh -> 0x0075 }
            boolean r0 = r4.A0N(r1)     // Catch:{ 2sh -> 0x0075 }
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RUO.A00(android.content.Context, com.facebook.browser.lite.extensions.autofill.model.AutofillData):boolean");
    }
}
