package X;

/* renamed from: X.Txk  reason: case insensitive filesystem */
public abstract class C14524Txk {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C14525Txl parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.Txl r0 = new X.Txl     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            r0.<init>()     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            if (r2 == r1) goto L_0x0015
            r4.A0z()     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            goto L_0x0069
        L_0x0015:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            if (r2 == r1) goto L_0x006a
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            r4.A1J()     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            java.lang.String r1 = "name"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            r3 = 0
            if (r1 == 0) goto L_0x003f
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            if (r2 == r1) goto L_0x0039
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
        L_0x0039:
            r0.A00 = r3     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
        L_0x003b:
            r4.A0z()     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            goto L_0x0015
        L_0x003f:
            java.lang.String r1 = "actions"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            if (r1 == 0) goto L_0x003b
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            if (r2 != r1) goto L_0x0066
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            r3.<init>()     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
        L_0x0054:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            if (r2 == r1) goto L_0x0066
            X.Txj r1 = X.C14522Txi.parseFromJson(r4)     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            if (r1 == 0) goto L_0x0054
            r3.add(r1)     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            goto L_0x0054
        L_0x0066:
            r0.A01 = r3     // Catch:{ IOException -> 0x0072, Exception -> 0x006b }
            goto L_0x003b
        L_0x0069:
            r0 = 0
        L_0x006a:
            return r0
        L_0x006b:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0072:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14524Txk.parseFromJson(X.16F):X.Txl");
    }
}
