package X;

/* renamed from: X.7oq  reason: invalid class name and case insensitive filesystem */
public final class C342587oq {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C342577op parseFromJson(X.16F r5) {
        /*
            r4 = 0
            X.0qQ.A0B(r5, r4)
            X.7op r0 = new X.7op     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            r0.<init>()     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            if (r2 == r1) goto L_0x0015
            r5.A0z()     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            goto L_0x007c
        L_0x0015:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            if (r2 == r1) goto L_0x007d
            java.lang.String r2 = r5.A0q()     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            r5.A1J()     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            java.lang.String r1 = "upcoming_events"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            r3 = 0
            if (r1 == 0) goto L_0x004c
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            if (r2 != r1) goto L_0x0073
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            r3.<init>()     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
        L_0x003a:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            if (r2 == r1) goto L_0x0073
            com.instagram.user.model.UpcomingEventImpl r1 = X.C45712D2l.parseFromJson(r5)     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            if (r1 == 0) goto L_0x003a
            r3.add(r1)     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            goto L_0x003a
        L_0x004c:
            java.lang.String r1 = "next_max_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            if (r1 == 0) goto L_0x0063
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            if (r2 == r1) goto L_0x0060
            java.lang.String r3 = r5.A1P()     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
        L_0x0060:
            r0.A00 = r3     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            goto L_0x0078
        L_0x0063:
            java.lang.String r1 = "more_available"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            if (r1 == 0) goto L_0x006f
            r5.A0d()     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            goto L_0x0078
        L_0x006f:
            X.1XY.A01(r5, r0, r2)     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            goto L_0x0078
        L_0x0073:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            r0.A01 = r3     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
        L_0x0078:
            r5.A0z()     // Catch:{ IOException -> 0x0085, Exception -> 0x007e }
            goto L_0x0015
        L_0x007c:
            r0 = 0
        L_0x007d:
            return r0
        L_0x007e:
            r0 = move-exception
            X.1Pf r1 = new X.1Pf
            r1.<init>(r0)
            throw r1
        L_0x0085:
            r1 = move-exception
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C342587oq.parseFromJson(X.16F):X.7op");
    }
}
