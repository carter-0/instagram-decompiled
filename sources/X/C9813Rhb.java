package X;

/* renamed from: X.Rhb  reason: case insensitive filesystem */
public abstract class C9813Rhb {
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        if (r1 != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r2 == 13950) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence A00(X.C276544tV r9) {
        /*
            int r2 = r9.A04
            r0 = 13319(0x3407, float:1.8664E-41)
            if (r2 == r0) goto L_0x0013
            r0 = 13626(0x353a, float:1.9094E-41)
            if (r2 == r0) goto L_0x0013
            r0 = 13904(0x3650, float:1.9484E-41)
            if (r2 == r0) goto L_0x0013
            r1 = 13950(0x367e, float:1.9548E-41)
            r0 = 0
            if (r2 != r1) goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            if (r0 == 0) goto L_0x010b
            r0 = 13319(0x3407, float:1.8664E-41)
            if (r2 == r0) goto L_0x00e9
            r0 = 13626(0x353a, float:1.9094E-41)
            if (r2 == r0) goto L_0x00c1
            r0 = 13904(0x3650, float:1.9484E-41)
            if (r2 == r0) goto L_0x00a3
            r0 = 13950(0x367e, float:1.9548E-41)
            if (r2 != r0) goto L_0x009a
            r8 = 0
            X.1Kj r0 = X.C64361Kj.A00()
            android.content.Context r0 = r0.A00
            android.content.res.Configuration r0 = X.Pxf.A0G(r0)
            java.util.Locale r2 = r0.locale
            java.lang.String r1 = r9.A0F()
            boolean r0 = X.0mp.A0B(r1)
            if (r0 != 0) goto L_0x0090
            X.0qQ.A0A(r1)
            double r0 = java.lang.Double.parseDouble(r1)
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
        L_0x0048:
            java.lang.String r0 = r9.A0D()
            if (r0 == 0) goto L_0x0095
            X.0qQ.A0A(r2)
            java.util.Currency r0 = java.util.Currency.getInstance(r0)
            X.0qQ.A07(r0)
            java.text.NumberFormat r6 = java.text.NumberFormat.getCurrencyInstance(r2)
            r6.setCurrency(r0)
            r5 = r6
            java.text.DecimalFormat r5 = (java.text.DecimalFormat) r5
            java.text.DecimalFormatSymbols r4 = r5.getDecimalFormatSymbols()
            char r0 = r4.getGroupingSeparator()
            r3 = 32
            r2 = 8239(0x202f, float:1.1545E-41)
            if (r0 != r2) goto L_0x008e
            r4.setGroupingSeparator(r3)
            r1 = 1
        L_0x0074:
            char r0 = r4.getDecimalSeparator()
            if (r0 != r2) goto L_0x008b
            r4.setDecimalSeparator(r3)
        L_0x007d:
            r5.setDecimalFormatSymbols(r4)
        L_0x0080:
            r5.setMaximumFractionDigits(r8)
            java.lang.String r4 = r6.format(r7)
            X.0qQ.A07(r4)
            return r4
        L_0x008b:
            if (r1 == 0) goto L_0x0080
            goto L_0x007d
        L_0x008e:
            r1 = 0
            goto L_0x0074
        L_0x0090:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            goto L_0x0048
        L_0x0095:
            java.lang.String r4 = r7.toString()
            return r4
        L_0x009a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.IllegalArgumentException r0 = X.DbZ.A0Z(r0)
            throw r0
        L_0x00a3:
            java.lang.String r0 = r9.A0D()
            if (r0 == 0) goto L_0x00be
            android.text.SpannableStringBuilder r4 = X.DbS.A0C(r0)
            X.1Kj r0 = X.C64361Kj.A00()
            android.content.Context r2 = r0.A00
            r1 = 36
            r0 = 1
            boolean r0 = r9.A0R(r1, r0)
            X.C244273av.A07(r2, r4, r0)
            return r4
        L_0x00be:
            java.lang.String r4 = ""
            return r4
        L_0x00c1:
            java.lang.String r0 = r9.A0D()
            java.lang.String r4 = ""
            java.lang.String r3 = "IGCheckoutSignalingTextProviderUtils"
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "Null Padding Horizontal value for IGCheckoutSignalingTextProviderUtils"
            X.1Kn.A02(r3, r0)
            return r4
        L_0x00d1:
            X.TxT r2 = X.AnonymousClass6Su.A0B(r0)     // Catch:{ 3yO -> 0x00e3 }
            X.1Kj r0 = X.C64361Kj.A00()     // Catch:{ 3yO -> 0x00e3 }
            android.content.Context r1 = r0.A00     // Catch:{ 3yO -> 0x00e3 }
            float r0 = r2.A00     // Catch:{ 3yO -> 0x00e3 }
            int r0 = (int) r0     // Catch:{ 3yO -> 0x00e3 }
            android.text.SpannableStringBuilder r4 = X.W2t.A01(r1, r0)     // Catch:{ 3yO -> 0x00e3 }
            return r4
        L_0x00e3:
            java.lang.String r0 = "Error while parsing Padding Horizontal"
            X.1Kn.A02(r3, r0)
            return r4
        L_0x00e9:
            r2 = 36
            r0 = 0
            long r5 = r9.A04(r2, r0)
            java.lang.String r1 = "date"
            java.lang.String r0 = r9.A0H()
            if (r0 == 0) goto L_0x00fa
            r1 = r0
        L_0x00fa:
            java.lang.String r2 = r9.A0D()
            java.lang.String r3 = r9.A0E()
            java.lang.String r4 = r9.A0I()
            java.lang.String r4 = X.RTW.A00(r1, r2, r3, r4, r5)
            return r4
        L_0x010b:
            java.lang.String r0 = "Unrecognized Text provider with style id "
            java.lang.String r1 = X.002.A0O(r0, r2)
            java.lang.String r0 = "BloksTextProviderMapper"
            X.1Kn.A02(r0, r1)
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9813Rhb.A00(X.4tV):java.lang.CharSequence");
    }
}
