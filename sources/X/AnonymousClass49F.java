package X;

/* renamed from: X.49F  reason: invalid class name */
public final class AnonymousClass49F {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C250903mF parseFromJson(X.16F r8) {
        /*
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.3mF r0 = new X.3mF     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            r0.<init>()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            X.16L r3 = X.16L.A0D     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r1 == r3) goto L_0x0016
            r8.A0z()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            goto L_0x00f4
        L_0x0016:
            X.16L r1 = r8.A1J()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            X.16L r7 = X.16L.A09     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r1 == r7) goto L_0x00f5
            java.lang.String r2 = r8.A0q()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            r8.A1J()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            java.lang.String r1 = "reels"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            r6 = 0
            if (r1 == 0) goto L_0x0061
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r1 != r3) goto L_0x005d
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            r5.<init>()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
        L_0x0039:
            X.16L r1 = r8.A1J()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r1 == r7) goto L_0x005c
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            r8.A1J()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r2 != r1) goto L_0x0052
            r5.put(r4, r6)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            goto L_0x0039
        L_0x0052:
            X.3HX r1 = X.AnonymousClass3HR.parseFromJson(r8)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r1 == 0) goto L_0x0039
            r5.put(r4, r1)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            goto L_0x0039
        L_0x005c:
            r6 = r5
        L_0x005d:
            r0.A07 = r6     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            goto L_0x00ef
        L_0x0061:
            java.lang.String r1 = "cached_reels"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r1 == 0) goto L_0x0099
            X.16L r1 = r8.A11()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r1 != r3) goto L_0x00ed
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            r5.<init>()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
        L_0x0074:
            X.16L r1 = r8.A1J()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r1 == r7) goto L_0x0097
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            r8.A1J()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r2 != r1) goto L_0x008d
            r5.put(r4, r6)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            goto L_0x0074
        L_0x008d:
            X.9JE r1 = X.C44876CmS.parseFromJson(r8)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r1 == 0) goto L_0x0074
            r5.put(r4, r1)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            goto L_0x0074
        L_0x0097:
            r6 = r5
            goto L_0x00ed
        L_0x0099:
            java.lang.String r1 = "next_ad_request_index"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r1 == 0) goto L_0x00ac
            int r1 = r8.A1D()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            r0.A04 = r1     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            goto L_0x00ef
        L_0x00ac:
            java.lang.String r1 = "viewer_session_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r1 == 0) goto L_0x00c3
            X.16L r2 = r8.A11()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r2 == r1) goto L_0x00c0
            java.lang.String r6 = r8.A1P()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
        L_0x00c0:
            r0.A05 = r6     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            goto L_0x00ef
        L_0x00c3:
            java.lang.String r1 = "ads_pool_threshold_for_next_request"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r1 == 0) goto L_0x00d6
            int r1 = r8.A1D()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            r0.A01 = r1     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            goto L_0x00ef
        L_0x00d6:
            java.lang.String r1 = "earliest_request_position"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            if (r1 == 0) goto L_0x00e9
            int r1 = r8.A1D()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            r0.A03 = r1     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            goto L_0x00ef
        L_0x00e9:
            X.1XY.A01(r8, r0, r2)     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            goto L_0x00ef
        L_0x00ed:
            r0.A06 = r6     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
        L_0x00ef:
            r8.A0z()     // Catch:{ IOException -> 0x00fd, Exception -> 0x00f6 }
            goto L_0x0016
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            return r0
        L_0x00f6:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00fd:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass49F.parseFromJson(X.16F):X.3mF");
    }
}
