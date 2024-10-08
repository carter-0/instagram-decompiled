package X;

public final class F4Q {
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C47321Duo parseFromJson(X.16F r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.Duo r4 = new X.Duo     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            r4.<init>()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            r4 = 0
            return r4
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            if (r1 == r0) goto L_0x0093
            java.lang.String r1 = X.AnonymousClass7TE.A17(r5)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            java.lang.String r0 = "allow_list_data"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            r2 = 0
            if (r0 == 0) goto L_0x0046
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            if (r1 != r0) goto L_0x0043
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
        L_0x0037:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            if (r1 == r0) goto L_0x0043
            X.C41846B3n.A1E(r5, r2)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            goto L_0x0037
        L_0x0043:
            r4.A02 = r2     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            goto L_0x0068
        L_0x0046:
            java.lang.String r0 = "setting_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            if (r0 == 0) goto L_0x006c
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            if (r1 == r0) goto L_0x005a
            java.lang.String r2 = r5.A1P()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
        L_0x005a:
            java.util.Map r0 = com.instagram.api.schemas.UserCallSettings.A01     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            com.instagram.api.schemas.UserCallSettings r0 = (com.instagram.api.schemas.UserCallSettings) r0     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            if (r0 != 0) goto L_0x0066
            com.instagram.api.schemas.UserCallSettings r0 = com.instagram.api.schemas.UserCallSettings.UNRECOGNIZED     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
        L_0x0066:
            r4.A01 = r0     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
        L_0x0068:
            r5.A0z()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            goto L_0x0016
        L_0x006c:
            java.lang.String r0 = "suggested_users"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            if (r0 == 0) goto L_0x008f
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            if (r1 != r0) goto L_0x008c
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
        L_0x0080:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            if (r1 == r0) goto L_0x008c
            X.C41846B3n.A1E(r5, r2)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            goto L_0x0080
        L_0x008c:
            r4.A03 = r2     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            goto L_0x0068
        L_0x008f:
            X.1XY.A01(r5, r4, r1)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            goto L_0x0068
        L_0x0093:
            java.util.List r3 = r4.A02     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            X.0qQ.A0A(r3)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            com.instagram.api.schemas.UserCallSettings r2 = r4.A01     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            X.0qQ.A0A(r2)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            java.util.List r1 = r4.A03     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            X.0qQ.A0A(r1)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            X.DrQ r0 = new X.DrQ     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            r0.<init>(r2, r3, r1)     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            r4.A00 = r0     // Catch:{ IOException -> 0x00b0, Exception -> 0x00aa }
            return r4
        L_0x00aa:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x00b0:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F4Q.parseFromJson(X.16F):X.Duo");
    }
}
