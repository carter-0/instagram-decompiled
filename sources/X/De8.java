package X;

public final class De8 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.De9 parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.De9 r0 = new X.De9     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            r0.<init>()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            goto L_0x00d7
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r2 == r1) goto L_0x00d8
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            r4.A1J()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            java.lang.String r1 = "onboarding_checklist"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            r3 = 0
            if (r1 == 0) goto L_0x004d
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r2 != r1) goto L_0x00d0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            r3.<init>()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
        L_0x003b:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r2 == r1) goto L_0x00d0
            X.F3Q r1 = X.C48744EjT.parseFromJson(r4)     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r1 == 0) goto L_0x003b
            r3.add(r1)     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            goto L_0x003b
        L_0x004d:
            java.lang.String r1 = "title"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r1 == 0) goto L_0x0064
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r2 == r1) goto L_0x0061
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
        L_0x0061:
            r0.A02 = r3     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            goto L_0x00d2
        L_0x0064:
            java.lang.String r1 = "description"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r1 == 0) goto L_0x007b
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r2 == r1) goto L_0x0078
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
        L_0x0078:
            r0.A01 = r3     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            goto L_0x00d2
        L_0x007b:
            java.lang.String r1 = "eligible_for_experience"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r1 == 0) goto L_0x008a
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            r0.A04 = r1     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            goto L_0x00d2
        L_0x008a:
            java.lang.String r1 = "should_show_reminder"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r1 == 0) goto L_0x0099
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            r0.A05 = r1     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            goto L_0x00d2
        L_0x0099:
            java.lang.String r1 = "nrux_account_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r1 == 0) goto L_0x00b8
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            java.util.Map r2 = X.C46388DeA.A01     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            X.DeA r1 = (X.C46388DeA) r1     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r1 != 0) goto L_0x00b5
            X.DeA r1 = X.C46388DeA.UNKNOWN     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
        L_0x00b5:
            r0.A00 = r1     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            goto L_0x00d2
        L_0x00b8:
            java.lang.String r1 = "total_days"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r1 != 0) goto L_0x00cc
            java.lang.String r1 = "current_day"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            if (r1 != 0) goto L_0x00cc
            X.1XY.A01(r4, r0, r2)     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            goto L_0x00d2
        L_0x00cc:
            r4.A1D()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            goto L_0x00d2
        L_0x00d0:
            r0.A03 = r3     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
        L_0x00d2:
            r4.A0z()     // Catch:{ IOException -> 0x00df, Exception -> 0x00d9 }
            goto L_0x0016
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            return r0
        L_0x00d9:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x00df:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.De8.parseFromJson(X.16F):X.De9");
    }
}
