package X;

/* renamed from: X.3kh  reason: invalid class name and case insensitive filesystem */
public abstract class C249983kh {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C249993ki parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.3ki r0 = new X.3ki     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            r0.<init>()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            if (r2 == r1) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            goto L_0x00b7
        L_0x0016:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            if (r2 == r1) goto L_0x00b8
            java.lang.String r2 = r5.A0q()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            r5.A1J()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            java.lang.String r1 = "stories_items"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            r4 = 0
            if (r1 == 0) goto L_0x0053
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            if (r2 != r1) goto L_0x004d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            r4.<init>()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
        L_0x003b:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            if (r2 == r1) goto L_0x004d
            X.3kn r1 = X.C250023km.parseFromJson(r5)     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x003b
            r4.add(r1)     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            goto L_0x003b
        L_0x004d:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            r0.A05 = r4     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            goto L_0x0061
        L_0x0053:
            java.lang.String r1 = "next_ad_request_index"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x0065
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            r0.A02 = r1     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
        L_0x0061:
            r5.A0z()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            goto L_0x0016
        L_0x0065:
            java.lang.String r1 = "ads_pool_threshold_for_next_request"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x0074
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            r0.A00 = r1     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            goto L_0x0061
        L_0x0074:
            java.lang.String r1 = "earliest_request_position"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x0083
            int r1 = r5.A1D()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            r0.A01 = r1     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            goto L_0x0061
        L_0x0083:
            java.lang.String r1 = "index_calculation_strategy"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x009d
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            if (r2 == r1) goto L_0x0097
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
        L_0x0097:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            r0.A03 = r4     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            goto L_0x0061
        L_0x009d:
            java.lang.String r1 = "delivery_source"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x0061
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            if (r2 == r1) goto L_0x00b1
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
        L_0x00b1:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            r0.A04 = r4     // Catch:{ IOException -> 0x00c0, Exception -> 0x00b9 }
            goto L_0x0061
        L_0x00b7:
            r0 = 0
        L_0x00b8:
            return r0
        L_0x00b9:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00c0:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C249983kh.parseFromJson(X.16F):X.3ki");
    }
}
