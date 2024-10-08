package X;

/* renamed from: X.94D  reason: invalid class name */
public final class AnonymousClass94D {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C273664mz parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.4mz r2 = new X.4mz     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            r2.<init>()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r1 == r0) goto L_0x0015
            r4.A0z()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            goto L_0x0093
        L_0x0015:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r1 == r0) goto L_0x0094
            java.lang.String r1 = r4.A0q()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            r4.A1J()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            java.lang.String r0 = "profile_grid_items"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            r3 = 0
            if (r0 == 0) goto L_0x004f
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r1 != r0) goto L_0x004c
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            r3.<init>()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
        L_0x003a:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r1 == r0) goto L_0x004c
            X.UNQ r0 = X.V83.parseFromJson(r4)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r0 == 0) goto L_0x003a
            r3.add(r0)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            goto L_0x003a
        L_0x004c:
            r2.A03 = r3     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            goto L_0x0065
        L_0x004f:
            java.lang.String r0 = "profile_grid_items_cursor"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r0 == 0) goto L_0x0069
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r1 == r0) goto L_0x0063
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
        L_0x0063:
            r2.A02 = r3     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
        L_0x0065:
            r4.A0z()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            goto L_0x0015
        L_0x0069:
            java.lang.String r0 = "special_empty_state"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r0 == 0) goto L_0x0078
            com.instagram.api.schemas.GraphGuardianContentImpl r0 = X.CYC.parseFromJson(r4)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            r2.A00 = r0     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            goto L_0x0065
        L_0x0078:
            java.lang.String r0 = "pinned_profile_grid_items_ids"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r0 == 0) goto L_0x008f
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            if (r1 == r0) goto L_0x008c
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
        L_0x008c:
            r2.A01 = r3     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            goto L_0x0065
        L_0x008f:
            X.1XW.A00(r4, r2, r1)     // Catch:{ IOException -> 0x009c, Exception -> 0x0095 }
            goto L_0x0065
        L_0x0093:
            r2 = 0
        L_0x0094:
            return r2
        L_0x0095:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x009c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass94D.parseFromJson(X.16F):X.4mz");
    }
}
