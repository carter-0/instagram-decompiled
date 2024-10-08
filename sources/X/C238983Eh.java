package X;

/* renamed from: X.3Eh  reason: invalid class name and case insensitive filesystem */
public abstract class C238983Eh {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.3Ei] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C238993Ei parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.3Ei r0 = new X.3Ei     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            r0.<init>()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            if (r2 == r1) goto L_0x0015
            r4.A0z()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            goto L_0x0087
        L_0x0015:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            if (r2 == r1) goto L_0x0088
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            r4.A1J()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            java.lang.String r1 = "status_code"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            if (r1 == 0) goto L_0x0036
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            r0.A01 = r1     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
        L_0x0032:
            r4.A0z()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            goto L_0x0015
        L_0x0036:
            java.lang.String r1 = "reason_phrase"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            r3 = 0
            if (r1 == 0) goto L_0x004e
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            if (r2 == r1) goto L_0x004b
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
        L_0x004b:
            r0.A02 = r3     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            goto L_0x0032
        L_0x004e:
            java.lang.String r1 = "headers"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            if (r1 == 0) goto L_0x0078
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            if (r2 != r1) goto L_0x0075
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            r3.<init>()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
        L_0x0063:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            if (r2 == r1) goto L_0x0075
            X.1Fn r1 = X.C239003Ej.parseFromJson(r4)     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            if (r1 == 0) goto L_0x0063
            r3.add(r1)     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            goto L_0x0063
        L_0x0075:
            r0.A03 = r3     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            goto L_0x0032
        L_0x0078:
            java.lang.String r1 = "response_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            if (r1 == 0) goto L_0x0032
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            r0.A00 = r1     // Catch:{ IOException -> 0x0090, Exception -> 0x0089 }
            goto L_0x0032
        L_0x0087:
            r0 = 0
        L_0x0088:
            return r0
        L_0x0089:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0090:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238983Eh.parseFromJson(X.16F):X.3Ei");
    }
}
