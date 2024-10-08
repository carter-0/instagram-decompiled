package X;

/* renamed from: X.650  reason: invalid class name */
public abstract class AnonymousClass650 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass651 parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.651 r0 = new X.651     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            r0.<init>()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r2 == r1) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            goto L_0x00df
        L_0x0016:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r2 == r1) goto L_0x00e0
            java.lang.String r2 = r5.A0q()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            r5.A1J()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            java.lang.String r1 = "data"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            r4 = 0
            if (r1 == 0) goto L_0x0053
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r2 != r1) goto L_0x004d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            r4.<init>()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
        L_0x003b:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r2 == r1) goto L_0x004d
            X.653 r1 = X.AnonymousClass652.parseFromJson(r5)     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r1 == 0) goto L_0x003b
            r4.add(r1)     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            goto L_0x003b
        L_0x004d:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            r0.A05 = r4     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            goto L_0x0061
        L_0x0053:
            java.lang.String r1 = "seq_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r1 == 0) goto L_0x0065
            long r1 = r5.A0y()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            r0.A00 = r1     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
        L_0x0061:
            r5.A0z()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            goto L_0x0016
        L_0x0065:
            java.lang.String r1 = "tq_seq_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r1 == 0) goto L_0x0080
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            X.16L r1 = X.16L.A0I     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r2 != r1) goto L_0x007d
            long r1 = r5.A0y()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
        L_0x007d:
            r0.A02 = r4     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            goto L_0x0061
        L_0x0080:
            java.lang.String r1 = "sampled"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r1 == 0) goto L_0x008f
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            r0.A07 = r1     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            goto L_0x0061
        L_0x008f:
            java.lang.String r1 = "realtime"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r1 == 0) goto L_0x009e
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            r0.A06 = r1     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            goto L_0x0061
        L_0x009e:
            java.lang.String r1 = "client_context"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r1 == 0) goto L_0x00b5
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r2 == r1) goto L_0x00b2
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
        L_0x00b2:
            r0.A03 = r4     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            goto L_0x0061
        L_0x00b5:
            java.lang.String r1 = "mutation_token"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r1 == 0) goto L_0x00cc
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r2 == r1) goto L_0x00c9
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
        L_0x00c9:
            r0.A04 = r4     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            goto L_0x0061
        L_0x00cc:
            java.lang.String r1 = "mi_trace_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            if (r1 == 0) goto L_0x0061
            long r1 = r5.A0y()     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            r0.A01 = r1     // Catch:{ IOException -> 0x00e8, Exception -> 0x00e1 }
            goto L_0x0061
        L_0x00df:
            r0 = 0
        L_0x00e0:
            return r0
        L_0x00e1:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00e8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass650.parseFromJson(X.16F):X.651");
    }
}
