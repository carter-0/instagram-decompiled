package X;

public abstract class OP7 {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        if (r11 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a8, code lost:
        if (r1 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A01(android.content.Context r8, com.instagram.common.session.UserSession r9, java.lang.String r10, java.lang.String r11, int r12, boolean r13) {
        /*
            r4 = 1
            int r7 = X.DbW.A02(r4, r9, r10)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36599409195290114(0x8206f800130e02, double:3.208951976868682E-306)
            int r2 = X.DbS.A04(r2, r9, r0)
            r0 = 0
            if (r2 == r4) goto L_0x009c
            r1 = 3
            if (r2 == r7) goto L_0x006e
            if (r2 != r1) goto L_0x006a
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            if (r12 <= r1) goto L_0x006b
            if (r11 == 0) goto L_0x0055
            android.content.res.Resources r6 = r8.getResources()
            r5 = 2131820660(0x7f110074, float:1.9274041E38)
            int r3 = r12 - r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            android.content.res.Resources r1 = r8.getResources()
            java.lang.String r1 = X.C14066TpE.A01(r1, r2, r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r1}
            java.lang.String r1 = r6.getQuantityString(r5, r3, r1)
            X.0qQ.A07(r1)
            java.lang.CharSequence r1 = A00(r8, r1, r10, r13)
            r0.add(r1)
        L_0x0047:
            r1 = 2131959464(0x7f131ea8, float:1.955557E38)
            java.lang.String r1 = X.DbY.A0c(r8, r11, r1)
            java.lang.CharSequence r1 = A00(r8, r1, r10, r13)
            r0.add(r1)
        L_0x0055:
            android.content.res.Resources r2 = X.AnonymousClass7TF.A0A(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.String r1 = X.C66637Ma6.A01(r2, r1, r4)
            if (r1 == 0) goto L_0x006a
            java.lang.CharSequence r1 = A00(r8, r1, r10, r13)
            r0.add(r1)
        L_0x006a:
            return r0
        L_0x006b:
            if (r11 == 0) goto L_0x0055
            goto L_0x0047
        L_0x006e:
            if (r11 == 0) goto L_0x009c
            if (r12 != r7) goto L_0x007d
            r0 = 2131959464(0x7f131ea8, float:1.955557E38)
            java.lang.String r1 = X.DbW.A0h(r8, r11, r0)
        L_0x0079:
            X.0qQ.A07(r1)
            goto L_0x00aa
        L_0x007d:
            if (r12 <= r1) goto L_0x006a
            android.content.res.Resources r3 = r8.getResources()
            r2 = 2131820660(0x7f110074, float:1.9274041E38)
            int r12 = r12 - r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            android.content.res.Resources r0 = r8.getResources()
            java.lang.String r0 = X.C14066TpE.A01(r0, r1, r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r0}
            java.lang.String r1 = r3.getQuantityString(r2, r12, r0)
            goto L_0x0079
        L_0x009c:
            android.content.res.Resources r2 = X.AnonymousClass7TF.A0A(r8)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            java.lang.String r1 = X.C66637Ma6.A01(r2, r1, r4)
            if (r1 == 0) goto L_0x006a
        L_0x00aa:
            java.lang.CharSequence r0 = A00(r8, r1, r10, r13)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OP7.A01(android.content.Context, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, int, boolean):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.CharSequence A00(android.content.Context r3, java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            r1 = 2131959463(0x7f131ea7, float:1.9555567E38)
            r0 = 0
            java.lang.String r1 = X.DbV.A0u(r3, r5, r4, r1)
            X.0qQ.A07(r1)
            if (r6 == 0) goto L_0x0026
            int r2 = X.00l.A08(r1, r5, r0, r0)
            r0 = -1
            if (r2 == r0) goto L_0x0026
            boolean r0 = X.0mk.A02(r3)
            android.text.SpannableStringBuilder r1 = X.DbS.A0C(r1)
            if (r0 != 0) goto L_0x0023
            int r0 = r5.length()
            int r2 = r2 + r0
        L_0x0023:
            X.C244273av.A04(r3, r1, r2)
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OP7.A00(android.content.Context, java.lang.String, java.lang.String, boolean):java.lang.CharSequence");
    }
}
