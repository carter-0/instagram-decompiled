package X;

public final class B5D {
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.B5E parseFromJson(X.16F r9) {
        /*
            r5 = 0
            X.0qQ.A0B(r9, r5)
            X.B5E r0 = new X.B5E     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r0.<init>()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            X.16L r4 = X.16L.A0D     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == r4) goto L_0x0016
            r9.A0z()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x0144
        L_0x0016:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            X.16L r8 = X.16L.A09     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == r8) goto L_0x0145
            java.lang.String r2 = r9.A0q()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r9.A1J()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            java.lang.String r1 = "ad_media_items"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r3 = 0
            if (r1 == 0) goto L_0x0054
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r2 != r1) goto L_0x004d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r3.<init>()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
        L_0x003b:
            X.16L r2 = r9.A1J()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r2 == r1) goto L_0x004d
            X.B7p r1 = X.C41939B7q.parseFromJson(r9)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == 0) goto L_0x003b
            r3.add(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x003b
        L_0x004d:
            X.0qQ.A0B(r3, r5)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r0.A02 = r3     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x013f
        L_0x0054:
            java.lang.String r1 = "ad_positions"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == 0) goto L_0x0091
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 != r4) goto L_0x013a
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r7.<init>()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
        L_0x0067:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == r8) goto L_0x008e
            java.lang.String r6 = r9.A1P()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r9.A1J()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r2 != r1) goto L_0x0080
            r7.put(r6, r3)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x0067
        L_0x0080:
            int r1 = r9.A1D()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == 0) goto L_0x0067
            r7.put(r6, r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x0067
        L_0x008e:
            r3 = r7
            goto L_0x013a
        L_0x0091:
            java.lang.String r1 = "is_overlay"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == 0) goto L_0x00a1
            boolean r1 = r9.A0d()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r0.A05 = r1     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x013f
        L_0x00a1:
            java.lang.String r1 = "media_id_to_brand_safety_severity_map"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == 0) goto L_0x00df
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 != r4) goto L_0x00dc
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r7.<init>()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
        L_0x00b4:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == r8) goto L_0x00db
            java.lang.String r6 = r9.A1P()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r9.A1J()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r2 != r1) goto L_0x00cd
            r7.put(r6, r3)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x00b4
        L_0x00cd:
            long r1 = r9.A0y()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == 0) goto L_0x00b4
            r7.put(r6, r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x00b4
        L_0x00db:
            r3 = r7
        L_0x00dc:
            r0.A00 = r3     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x013f
        L_0x00df:
            java.lang.String r1 = "media_id_to_brand_safety_content_blocklist_map"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == 0) goto L_0x0109
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r2 != r1) goto L_0x0106
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r3.<init>()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
        L_0x00f4:
            X.16L r2 = r9.A1J()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r2 == r1) goto L_0x0106
            com.instagram.api.schemas.MediaIdToBrandSafetyContentBlocklistBitmapMapImpl r1 = X.B5H.parseFromJson(r9)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == 0) goto L_0x00f4
            r3.add(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x00f4
        L_0x0106:
            r0.A03 = r3     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x013f
        L_0x0109:
            java.lang.String r1 = "netego_media_items"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == 0) goto L_0x0136
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r2 != r1) goto L_0x0130
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r3.<init>()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
        L_0x011e:
            X.16L r2 = r9.A1J()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r2 == r1) goto L_0x0130
            X.CwE r1 = X.C44616Cho.parseFromJson(r9)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            if (r1 == 0) goto L_0x011e
            r3.add(r1)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x011e
        L_0x0130:
            X.0qQ.A0B(r3, r5)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r0.A04 = r3     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x013f
        L_0x0136:
            X.1XY.A01(r9, r0, r2)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x013f
        L_0x013a:
            X.0qQ.A0B(r3, r5)     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            r0.A01 = r3     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
        L_0x013f:
            r9.A0z()     // Catch:{ IOException -> 0x014c, Exception -> 0x0146 }
            goto L_0x0016
        L_0x0144:
            r0 = 0
        L_0x0145:
            return r0
        L_0x0146:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x014c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B5D.parseFromJson(X.16F):X.B5E");
    }
}
