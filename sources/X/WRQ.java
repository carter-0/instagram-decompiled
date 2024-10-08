package X;

public final class WRQ implements AnonymousClass1FD {
    public static final WRQ A00 = new WRQ();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(X.16F r11) {
        /*
            r10 = this;
            r0 = 0
            X.0qQ.A0B(r11, r0)
            r3 = 0
            r8 = 15
            r9 = 20
            X.GSY r2 = new X.GSY
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r2.<init>((java.lang.Boolean) r3, (java.lang.Integer) r4, (java.lang.String) r5, (java.lang.String) r6, (kotlin.jvm.internal.DefaultConstructorMarker) r7, (int) r8, (int) r9)
            X.16L r1 = r11.A11()
            X.16L r0 = X.16L.A0D
            if (r1 == r0) goto L_0x0022
            java.lang.String r1 = "JSON string for MediaQuizTally should start with a left brace"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0022:
            X.16L r1 = r11.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x0085
            java.lang.String r1 = X.AnonymousClass7TE.A17(r11)
            if (r1 == 0) goto L_0x0080
            int r0 = r1.hashCode()
            switch(r0) {
                case 3556653: goto L_0x0071;
                case 94851343: goto L_0x0062;
                case 1568218085: goto L_0x0053;
                case 2086502295: goto L_0x0044;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.String r1 = X.C13988Tno.A0g(r1)
            java.lang.String r0 = "MediaQuizTallyJsonHelper"
            X.0KC.A0C(r0, r1)
        L_0x0040:
            r11.A0z()
            goto L_0x0022
        L_0x0044:
            java.lang.String r0 = "is_hint_row"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0S(r11)
            r2.A01 = r0
            goto L_0x0040
        L_0x0053:
            java.lang.String r0 = "hint_text"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = X.C13989Tnp.A0o(r11)
            r2.A02 = r0
            goto L_0x0040
        L_0x0062:
            java.lang.String r0 = "count"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.Integer r0 = X.AnonymousClass7TF.A0X(r11)
            r2.A00 = r0
            goto L_0x0040
        L_0x0071:
            java.lang.String r0 = "text"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = X.C13989Tnp.A0o(r11)
            r2.A03 = r0
            goto L_0x0040
        L_0x0080:
            java.io.IOException r0 = X.C13988Tno.A0P()
            throw r0
        L_0x0085:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WRQ.invoke(X.16F):java.lang.Object");
    }
}
