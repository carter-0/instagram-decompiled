package X;

/* renamed from: X.B6m  reason: case insensitive filesystem */
public final class C41914B6m {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v4, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C43815CEh parseFromJson(X.16F r11) {
        /*
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.CEh r1 = new X.CEh     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r1.<init>()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.16L r0 = r11.A11()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.16L r3 = X.16L.A0D     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == r3) goto L_0x0016
            r11.A0z()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r1 = 0
            return r1
        L_0x0016:
            X.16L r0 = r11.A1J()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.16L r7 = X.16L.A09     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == r7) goto L_0x0135
            java.lang.String r2 = r11.A0q()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r11.A1J()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            java.lang.String r0 = "ad_media_items"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r4 = 0
            if (r0 == 0) goto L_0x0050
            X.16L r2 = r11.A11()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r2 != r0) goto L_0x004d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r4.<init>()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
        L_0x003b:
            X.16L r2 = r11.A1J()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r2 == r0) goto L_0x004d
            X.XET r0 = X.C41915B6n.parseFromJson(r11)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == 0) goto L_0x003b
            r4.add(r0)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x003b
        L_0x004d:
            r1.A08 = r4     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x0062
        L_0x0050:
            java.lang.String r0 = "ads_pool_threshold_for_next_request"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == 0) goto L_0x0066
            int r0 = r11.A1D()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r1.A04 = r0     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
        L_0x0062:
            r11.A0z()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x0016
        L_0x0066:
            java.lang.String r0 = "container_module"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == 0) goto L_0x007d
            X.16L r2 = r11.A11()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r2 == r0) goto L_0x007a
            java.lang.String r4 = r11.A1P()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
        L_0x007a:
            r1.A06 = r4     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x0062
        L_0x007d:
            java.lang.String r0 = "earliest_request_position"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == 0) goto L_0x0090
            int r0 = r11.A1D()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r1.A05 = r0     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x0062
        L_0x0090:
            java.lang.String r0 = "is_overlay"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r11.A0d()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r1.A02 = r0     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x0062
        L_0x00a3:
            java.lang.String r0 = "media_id_to_brand_safety_severity_map"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == 0) goto L_0x00e1
            X.16L r0 = r11.A11()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 != r3) goto L_0x00de
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r6.<init>()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
        L_0x00b6:
            X.16L r0 = r11.A1J()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == r7) goto L_0x00dd
            java.lang.String r5 = r11.A1P()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r11.A1J()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.16L r2 = r11.A11()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r2 != r0) goto L_0x00cf
            r6.put(r5, r4)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x00b6
        L_0x00cf:
            int r0 = r11.A1D()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == 0) goto L_0x00b6
            r6.put(r5, r0)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x00b6
        L_0x00dd:
            r4 = r6
        L_0x00de:
            r1.A07 = r4     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x0062
        L_0x00e1:
            java.lang.String r0 = "more_available_ad_media"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == 0) goto L_0x00f5
            boolean r0 = r11.A0d()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r1.A03 = r0     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x0062
        L_0x00f5:
            java.lang.String r0 = "netego_media_items"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == 0) goto L_0x0120
            X.16L r2 = r11.A11()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r2 != r0) goto L_0x011c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r4.<init>()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
        L_0x010a:
            X.16L r2 = r11.A1J()     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r2 == r0) goto L_0x011c
            X.BFg r0 = X.C44231Cas.parseFromJson(r11)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == 0) goto L_0x010a
            r4.add(r0)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x010a
        L_0x011c:
            r1.A09 = r4     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x0062
        L_0x0120:
            java.lang.String r0 = "profile_ads_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            if (r0 == 0) goto L_0x0130
            X.B6l r0 = X.C41912B6k.parseFromJson(r11)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r1.A01 = r0     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x0062
        L_0x0130:
            X.1XY.A01(r11, r1, r2)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            goto L_0x0062
        L_0x0135:
            java.util.List r10 = r1.A08     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.0qQ.A0A(r10)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            java.lang.Integer r6 = r1.A04     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            java.lang.String r8 = r1.A06     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.0qQ.A0A(r8)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            java.lang.Integer r7 = r1.A05     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            java.lang.Boolean r4 = r1.A02     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            java.util.HashMap r9 = r1.A07     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            java.lang.Boolean r5 = r1.A03     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            java.util.List r11 = r1.A09     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.0qQ.A0A(r11)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.B6l r3 = r1.A01     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            X.XES r2 = new X.XES     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            r1.A00 = r2     // Catch:{ IOException -> 0x015e, Exception -> 0x0158 }
            return r1
        L_0x0158:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x015e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41914B6m.parseFromJson(X.16F):X.CEh");
    }
}
