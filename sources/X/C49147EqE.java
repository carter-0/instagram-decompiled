package X;

/* renamed from: X.EqE  reason: case insensitive filesystem */
public abstract class C49147EqE {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r3 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r1 != null) goto L_0x0066;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24) {
        /*
            r14 = r22
            r12 = 0
            r11 = 1
            r1 = r15
            com.instagram.user.model.User r15 = X.DbT.A0j(r15)
            r0 = 0
            X.0wc r2 = X.AnonymousClass0kN.A01(r0, r1)
            java.lang.String r1 = "commerce_buyer_ui_events"
            X.0Aj r10 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r9 = ""
            if (r18 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r1 = r9
            goto L_0x001f
        L_0x001b:
            java.lang.String r1 = X.DbY.A0k(r18)     // Catch:{ IllegalArgumentException -> 0x0024 }
        L_0x001f:
            X.EZK r13 = X.EZK.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0024 }
            goto L_0x0026
        L_0x0024:
            X.EZK r13 = X.EZK.UNKNOWN
        L_0x0026:
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.lang.String r7 = ","
            r2 = r21
            if (r21 == 0) goto L_0x0078
            java.lang.String[] r1 = new java.lang.String[]{r7}     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            r6 = 0
            java.util.List r1 = X.00l.A0R(r2, r1, r12)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            java.lang.String[] r5 = X.DbU.A1b(r1, r12)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            if (r5 == 0) goto L_0x0078
            int r4 = r5.length     // Catch:{ Exception -> 0x008c, all -> 0x008a }
        L_0x0040:
            if (r6 >= r4) goto L_0x0078
            r2 = r5[r6]     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            java.lang.String r1 = ":"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            java.util.List r1 = X.00l.A0R(r2, r1, r12)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            java.lang.String[] r3 = X.DbU.A1b(r1, r12)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            if (r3 == 0) goto L_0x005b
            int r1 = r3.length     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            if (r12 >= r1) goto L_0x005b
            r2 = r3[r12]     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            if (r2 != 0) goto L_0x005e
        L_0x005b:
            r2 = r9
            if (r3 == 0) goto L_0x0065
        L_0x005e:
            int r1 = r3.length     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            if (r11 >= r1) goto L_0x0065
            r1 = r3[r11]     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            if (r1 != 0) goto L_0x0066
        L_0x0065:
            r1 = r9
        L_0x0066:
            boolean r3 = r2.equals(r9)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            if (r3 != 0) goto L_0x0075
            boolean r3 = r1.equals(r9)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            if (r3 != 0) goto L_0x0075
            r8.put(r2, r1)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
        L_0x0075:
            int r6 = r6 + 1
            goto L_0x0040
        L_0x0078:
            java.lang.String r1 = "deeplink_destination"
            if (r22 != 0) goto L_0x007d
            r14 = r9
        L_0x007d:
            r8.put(r1, r14)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            java.lang.String r1 = "deeplink_destination_params"
            if (r23 == 0) goto L_0x0086
            r9 = r23
        L_0x0086:
            r8.put(r1, r9)     // Catch:{ Exception -> 0x008c, all -> 0x008a }
            goto L_0x008c
        L_0x008a:
            r0 = move-exception
            throw r0
        L_0x008c:
            java.lang.String r1 = "flow_name"
            r2 = r17
            r10.AAJ(r1, r2)
            java.lang.String r2 = "entry"
            java.lang.String r1 = "flow_step"
            r10.AAJ(r1, r2)
            java.lang.String r1 = "invoice_id"
            r2 = r19
            r10.AAJ(r1, r2)
            r1 = r20
            if (r20 == 0) goto L_0x00a9
            java.util.List r0 = X.DbV.A18(r1, r7)
        L_0x00a9:
            java.lang.String r1 = "order_item_ids"
            r10.AAe(r1, r0)
            java.lang.String r0 = "referrer_surface"
            r10.A8M(r13, r0)
            java.lang.String r0 = "session"
            r1 = r16
            r10.AAJ(r0, r1)
            java.lang.String r0 = r15.getId()
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r0)
            java.lang.String r0 = "user_id"
            r10.A9F(r0, r1)
            r0 = 627(0x273, float:8.79E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r10.A9H(r0, r8)
            if (r24 == 0) goto L_0x00db
            java.lang.String r0 = "succeed"
        L_0x00d4:
            X.DbS.A1I(r10, r0)
            r10.Cgf()
            return
        L_0x00db:
            java.lang.String r0 = "fail"
            goto L_0x00d4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49147EqE.A00(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
