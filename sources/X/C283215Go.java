package X;

/* renamed from: X.5Go  reason: invalid class name and case insensitive filesystem */
public abstract class C283215Go {
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass9JH parseFromJson(X.16F r9) {
        /*
            r7 = 0
            X.0qQ.A0B(r9, r7)
            r1 = 2
            X.9JH r0 = new X.9JH     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r6 = X.16L.A0D     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == r6) goto L_0x0017
            r9.A0z()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x00ac
        L_0x0017:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r8 = X.16L.A09     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == r8) goto L_0x00ad
            java.lang.String r2 = r9.A0q()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r9.A1J()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            java.lang.String r1 = "action_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r5 = 0
            if (r1 == 0) goto L_0x0044
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r2 == r1) goto L_0x003b
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
        L_0x003b:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r0.A02 = r5     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
        L_0x0040:
            r9.A0z()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x0017
        L_0x0044:
            java.lang.String r1 = "action_text"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == 0) goto L_0x005b
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r2 == r1) goto L_0x0058
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
        L_0x0058:
            r0.A01 = r5     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x0040
        L_0x005b:
            java.lang.String r1 = "confirmation_text"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == 0) goto L_0x0072
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r2 == r1) goto L_0x006f
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
        L_0x006f:
            r0.A03 = r5     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x0040
        L_0x0072:
            java.lang.String r1 = "controls"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == 0) goto L_0x0040
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 != r6) goto L_0x00a9
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r4.<init>()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
        L_0x0085:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == r8) goto L_0x00a8
            java.lang.String r3 = r9.A1P()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            r9.A1J()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r2 != r1) goto L_0x009e
            r4.put(r3, r5)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x0085
        L_0x009e:
            java.lang.String r1 = r9.A1P()     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            if (r1 == 0) goto L_0x0085
            r4.put(r3, r1)     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x0085
        L_0x00a8:
            r5 = r4
        L_0x00a9:
            r0.A00 = r5     // Catch:{ IOException -> 0x00b5, Exception -> 0x00ae }
            goto L_0x0040
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            return r0
        L_0x00ae:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00b5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C283215Go.parseFromJson(X.16F):X.9JH");
    }
}
