package X;

public abstract class Rh8 {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r0 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (r1 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r1.equals("true") == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r0 = X.AnonymousClass7TE.A1L(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        if (r1.equals("null") != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C307896Rx r15, X.AnonymousClass6Tm r16) {
        /*
            r11 = 0
            r8 = 1
            X.6Rm r0 = r15.A03
            r14 = 0
            if (r0 == 0) goto L_0x0034
            android.content.Context r7 = r0.A00
        L_0x0009:
            X.6Rm r0 = X.C308206Td.A09(r15)
            X.0lg r6 = X.C308206Td.A0A(r0)
            r0 = 2
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r6, r0)
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            r0 = r16
            java.lang.String r13 = X.DbY.A0h(r0, r11)
            java.util.List r0 = r0.A00
            java.lang.String r3 = X.DbU.A0t(r0, r8)
            java.lang.String r12 = "OPT_IN_NUX_UPDATE"
            boolean r0 = X.0qQ.A0K(r13, r12)
            if (r0 == 0) goto L_0x008a
            java.lang.String r5 = "bloks.browser_history.UpdateProperty"
            java.lang.String r4 = ""
            goto L_0x0036
        L_0x0034:
            r7 = r14
            goto L_0x0009
        L_0x0036:
            X.3mC r2 = X.C250863mB.A03     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            if (r3 != 0) goto L_0x003b
            r3 = r4
        L_0x003b:
            X.3u9 r1 = X.C255453u9.A01     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            X.3zM r0 = new X.3zM     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            r0.<init>(r1, r1)     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            java.lang.Object r0 = r2.A00(r3, r0)     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            java.util.List r0 = X.01U.A00(r0)     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            java.lang.Object r0 = X.00k.A0J(r0)     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            X.0eP r0 = (X.0eP) r0     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            r3 = 0
            if (r0 == 0) goto L_0x0059
            java.lang.Object r2 = r0.A00     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            if (r2 != 0) goto L_0x005c
        L_0x0059:
            r2 = r4
            if (r0 == 0) goto L_0x0060
        L_0x005c:
            java.lang.Object r1 = r0.A01     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            if (r1 != 0) goto L_0x0061
        L_0x0060:
            r1 = r4
        L_0x0061:
            java.lang.String r0 = "true"
            boolean r0 = r1.equals(r0)     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            if (r0 == 0) goto L_0x0073
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
        L_0x006e:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r2, r3)     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            goto L_0x0092
        L_0x0073:
            java.lang.String r0 = "null"
            boolean r0 = r1.equals(r0)     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            if (r0 != 0) goto L_0x006e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)     // Catch:{ 1pa | IllegalArgumentException -> 0x0081 }
            goto L_0x006e
        L_0x0081:
            r0 = move-exception
            X.1Kn.A03(r5, r0)
            X.0eP r0 = X.C66581MXm.A14(r4, r11)
            goto L_0x0092
        L_0x008a:
            if (r3 != 0) goto L_0x008e
            java.lang.String r3 = ""
        L_0x008e:
            X.0eP r0 = X.C66581MXm.A14(r3, r11)
        L_0x0092:
            java.lang.Object r4 = r0.A00
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r0.A01
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r7 == 0) goto L_0x00ad
            boolean r0 = X.C51966G9m.A1X(r4)
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = "OPT_IN_NUX_SHOWN"
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 != 0) goto L_0x00ad
            X.SAP.A00(r6, r7, r4)
        L_0x00ad:
            X.0qQ.A0B(r13, r11)
            r0 = 6
            java.lang.Integer[] r10 = X.AnonymousClass05K.A00(r0)
            int r3 = r10.length
            r2 = 0
        L_0x00b7:
            if (r2 >= r3) goto L_0x011e
            r1 = r10[r2]
            int r0 = r1.intValue()
            switch(r0) {
                case 1: goto L_0x014e;
                case 2: goto L_0x0152;
                case 3: goto L_0x0156;
                case 4: goto L_0x015a;
                case 5: goto L_0x015e;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            java.lang.String r0 = "CLEAR_ALL"
        L_0x00c4:
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x014a
            int r1 = r1.intValue()
            if (r1 == r11) goto L_0x0161
            r0 = 5
            if (r1 == r0) goto L_0x0131
            r0 = 4
            if (r1 != r0) goto L_0x011e
            X.SSz r4 = X.Ri1.A00(r6)
            com.instagram.common.session.UserSession r3 = r4.A02
            X.0qQ.A0B(r3, r11)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316843297018550(0x8105fa001512b6, double:3.0302561650001993E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x011f
            X.C11423SSz.A01(r4)
            java.util.List r1 = r4.A00
            if (r1 == 0) goto L_0x00fa
            java.lang.Long r0 = X.C51968G9o.A0u()
            r1.add(r0)
        L_0x00fa:
            X.C11423SSz.A03(r4)
            X.0xa r3 = r4.A03
            X.0xY r2 = r3.AR4()
            java.util.List r0 = r4.A00
            int r1 = X.C51971G9r.A0H(r0)
            java.lang.String r0 = "browser_link_history_optin_nux_count"
            r2.E5Z(r0, r1)
        L_0x010e:
            X.0xY r3 = X.DbU.A0e(r2, r3)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "browser_link_history_optin_nux_last_seen"
            r3.E5c(r0, r1)
            r3.apply()
        L_0x011e:
            return r14
        L_0x011f:
            X.0xa r3 = r4.A03
            X.0xY r2 = r3.AR4()
            java.lang.String r1 = "browser_link_history_optin_nux_count"
            int r0 = r3.getInt(r1, r11)
            int r0 = r0 + 1
            r2.E5Z(r1, r0)
            goto L_0x010e
        L_0x0131:
            X.SSz r0 = X.Ri1.A00(r6)
            r0.A06(r9)
            if (r7 == 0) goto L_0x011e
            boolean r0 = X.C51966G9m.A1X(r4)
            if (r0 == 0) goto L_0x011e
            boolean r0 = X.AnonymousClass7TF.A1Y(r9, r8)
            if (r0 == 0) goto L_0x011e
            X.SAP.A01(r6, r7, r4)
            return r14
        L_0x014a:
            int r2 = r2 + 1
            goto L_0x00b7
        L_0x014e:
            java.lang.String r0 = "CLEAR_SINGLE"
            goto L_0x00c4
        L_0x0152:
            java.lang.String r0 = "TOOLTIP_VISIBLE"
            goto L_0x00c4
        L_0x0156:
            java.lang.String r0 = "HAS_ACCESSED_BROWSER_HISTORY"
            goto L_0x00c4
        L_0x015a:
            java.lang.String r0 = "OPT_IN_NUX_SHOWN"
            goto L_0x00c4
        L_0x015e:
            r0 = r12
            goto L_0x00c4
        L_0x0161:
            X.C11423SSz.A00(r6)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Rh8.A00(X.6Rx, X.6Tm):java.lang.Object");
    }
}
