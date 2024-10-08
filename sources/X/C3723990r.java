package X;

/* renamed from: X.90r  reason: invalid class name and case insensitive filesystem */
public final class C3723990r {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C3723890q parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.90q r0 = new X.90q     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            r0.<init>()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            goto L_0x00dc
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r2 == r1) goto L_0x00dd
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            r4.A1J()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            java.lang.String r1 = "more_available"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r1 == 0) goto L_0x0037
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            r0.A05 = r1     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
        L_0x0033:
            r4.A0z()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            goto L_0x0016
        L_0x0037:
            java.lang.String r1 = "auto_load_more_enabled"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r1 == 0) goto L_0x0046
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            r0.A06 = r1     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            goto L_0x0033
        L_0x0046:
            java.lang.String r1 = "clusters"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            r3 = 0
            if (r1 == 0) goto L_0x0071
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r2 != r1) goto L_0x006e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            r3.<init>()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
        L_0x005c:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r2 == r1) goto L_0x006e
            com.instagram.explore.topiccluster.ExploreTopicCluster r1 = X.C296855ql.parseFromJson(r4)     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r1 == 0) goto L_0x005c
            r3.add(r1)     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            goto L_0x005c
        L_0x006e:
            r0.A04 = r3     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            goto L_0x0033
        L_0x0071:
            java.lang.String r1 = "sectional_items"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r1 == 0) goto L_0x009b
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r2 != r1) goto L_0x0098
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            r3.<init>()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
        L_0x0086:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r2 == r1) goto L_0x0098
            X.5oq r1 = X.C295735op.parseFromJson(r4)     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r1 == 0) goto L_0x0086
            r3.add(r1)     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            goto L_0x0086
        L_0x0098:
            r0.A03 = r3     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            goto L_0x0033
        L_0x009b:
            java.lang.String r1 = "next_max_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r1 == 0) goto L_0x00b2
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r2 == r1) goto L_0x00af
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
        L_0x00af:
            r0.A01 = r3     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            goto L_0x0033
        L_0x00b2:
            java.lang.String r1 = "session_paging_token"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r1 == 0) goto L_0x00ca
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r2 == r1) goto L_0x00c6
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
        L_0x00c6:
            r0.A02 = r3     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            goto L_0x0033
        L_0x00ca:
            java.lang.String r1 = "demonstrate_push_block_irl"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            if (r1 == 0) goto L_0x00d7
            r4.A0d()     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            goto L_0x0033
        L_0x00d7:
            X.1XY.A01(r4, r0, r2)     // Catch:{ IOException -> 0x00e5, Exception -> 0x00de }
            goto L_0x0033
        L_0x00dc:
            r0 = 0
        L_0x00dd:
            return r0
        L_0x00de:
            r0 = move-exception
            X.1Pf r1 = new X.1Pf
            r1.<init>(r0)
            throw r1
        L_0x00e5:
            r1 = move-exception
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3723990r.parseFromJson(X.16F):X.90q");
    }
}
