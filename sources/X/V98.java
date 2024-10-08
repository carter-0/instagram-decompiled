package X;

public abstract class V98 {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (r3.length() == 0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r2.length() == 0) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(X.C307896Rx r8, X.AnonymousClass6Tm r9) {
        /*
            r0 = 0
            java.lang.String r1 = ""
            java.util.List r7 = X.AnonymousClass7TE.A1I(r1)
            java.lang.String r6 = X.DbY.A0h(r9, r0)
            X.C308206Td.A0B(r8)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            X.C17124VIu.A00(r5)
            int r0 = r6.length()
            if (r0 == 0) goto L_0x006c
            java.util.List r7 = X.AnonymousClass7TE.A1I(r1)
            X.C17124VIu.A00(r5)     // Catch:{ IOException -> 0x0024 }
            goto L_0x0038
        L_0x0024:
            r4 = move-exception
            X.0wj r3 = X.0wj.A01
            r2 = 817898180(0x30c022c4, float:1.397972E-9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "error fetching live chat nonce: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r4, r0, r1)
            X.DbT.A1Q(r3, r0, r2)
        L_0x0038:
            java.lang.Object r0 = r5.get(r6)
            com.instagram.wellbeing.livechat.LiveChatNonce r0 = (com.instagram.wellbeing.livechat.LiveChatNonce) r0
            r2 = 0
            if (r0 == 0) goto L_0x006a
            java.lang.String r3 = r0.A00
        L_0x0043:
            java.lang.Object r0 = r5.get(r6)
            com.instagram.wellbeing.livechat.LiveChatNonce r0 = (com.instagram.wellbeing.livechat.LiveChatNonce) r0
            if (r0 == 0) goto L_0x004d
            java.lang.String r2 = r0.A01
        L_0x004d:
            if (r3 == 0) goto L_0x0056
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x0057
        L_0x0056:
            r0 = 1
        L_0x0057:
            if (r0 != 0) goto L_0x006c
            if (r2 == 0) goto L_0x0062
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x0063
        L_0x0062:
            r0 = 1
        L_0x0063:
            if (r0 != 0) goto L_0x006c
            java.util.List r7 = X.C66581MXm.A11(r3, r2)
            return r7
        L_0x006a:
            r3 = r2
            goto L_0x0043
        L_0x006c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V98.A00(X.6Rx, X.6Tm):java.util.List");
    }
}
