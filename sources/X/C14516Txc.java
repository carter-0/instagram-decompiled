package X;

/* renamed from: X.Txc  reason: case insensitive filesystem */
public abstract class C14516Txc {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C14517Txd parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.Txd r0 = new X.Txd     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            r0.<init>()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            goto L_0x00ba
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r2 == r1) goto L_0x00bb
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            r4.A1J()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            java.lang.String r1 = "document"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            r3 = 0
            if (r1 == 0) goto L_0x0040
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r2 == r1) goto L_0x003a
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
        L_0x003a:
            r0.A01 = r3     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
        L_0x003c:
            r4.A0z()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            goto L_0x0016
        L_0x0040:
            java.lang.String r1 = "name"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r1 == 0) goto L_0x0057
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r2 == r1) goto L_0x0054
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
        L_0x0054:
            r0.A02 = r3     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            goto L_0x003c
        L_0x0057:
            java.lang.String r1 = "metadata"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r1 == 0) goto L_0x0066
            X.Txh r1 = X.C14520Txg.parseFromJson(r4)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            r0.A00 = r1     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            goto L_0x003c
        L_0x0066:
            java.lang.String r1 = "bitmaps"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r1 == 0) goto L_0x0090
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r2 != r1) goto L_0x008d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            r3.<init>()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
        L_0x007b:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r2 == r1) goto L_0x008d
            X.Txf r1 = X.C14518Txe.parseFromJson(r4)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r1 == 0) goto L_0x007b
            r3.add(r1)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            goto L_0x007b
        L_0x008d:
            r0.A03 = r3     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            goto L_0x003c
        L_0x0090:
            java.lang.String r1 = "states"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r1 == 0) goto L_0x003c
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r2 != r1) goto L_0x00b7
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            r3.<init>()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
        L_0x00a5:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r2 == r1) goto L_0x00b7
            X.VSb r1 = X.C16993VDt.parseFromJson(r4)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            if (r1 == 0) goto L_0x00a5
            r3.add(r1)     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            goto L_0x00a5
        L_0x00b7:
            r0.A04 = r3     // Catch:{ IOException -> 0x00c3, Exception -> 0x00bc }
            goto L_0x003c
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            return r0
        L_0x00bc:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00c3:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14516Txc.parseFromJson(X.16F):X.Txd");
    }
}
