package X;

/* renamed from: X.5ox  reason: invalid class name and case insensitive filesystem */
public abstract class C295815ox {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C295825oy parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.5oy r2 = new X.5oy     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            r2.<init>()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            r2 = 0
            return r2
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r1 == r0) goto L_0x013c
            java.lang.String r1 = r5.A0q()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            r5.A1J()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            r4 = 0
            if (r0 == 0) goto L_0x0043
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r1 == r0) goto L_0x003a
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
        L_0x003a:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            r2.A0A = r4     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
        L_0x003f:
            r5.A0z()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            goto L_0x0016
        L_0x0043:
            java.lang.String r0 = "design"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 == 0) goto L_0x0061
            java.lang.String r1 = r5.A1Q()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.0qQ.A0B(r1, r3)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            java.util.Map r0 = X.C292525j6.A01     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.5j6 r0 = (X.C292525j6) r0     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 != 0) goto L_0x005e
            X.5j6 r0 = X.C292525j6.NO_DESIGN     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
        L_0x005e:
            r2.A06 = r0     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            goto L_0x003f
        L_0x0061:
            java.lang.String r0 = "label"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 == 0) goto L_0x0078
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r1 == r0) goto L_0x0075
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
        L_0x0075:
            r2.A0B = r4     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            goto L_0x003f
        L_0x0078:
            java.lang.String r0 = "badge_label"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 == 0) goto L_0x008f
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r1 == r0) goto L_0x008c
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
        L_0x008c:
            r2.A08 = r4     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            goto L_0x003f
        L_0x008f:
            java.lang.String r0 = "type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 == 0) goto L_0x00a9
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r1 == r0) goto L_0x00a3
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
        L_0x00a3:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            r2.A0D = r4     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            goto L_0x003f
        L_0x00a9:
            java.lang.String r0 = "items"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 == 0) goto L_0x00d7
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r1 != r0) goto L_0x00d0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            r4.<init>()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
        L_0x00be:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r1 == r0) goto L_0x00d0
            X.4sL r0 = X.C275974sH.parseFromJson(r5)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 == 0) goto L_0x00be
            r4.add(r0)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            goto L_0x00be
        L_0x00d0:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            r2.A0E = r4     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            goto L_0x003f
        L_0x00d7:
            java.lang.String r0 = "tag"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 == 0) goto L_0x00ec
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r1 == r0) goto L_0x003f
            r5.A1P()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            goto L_0x003f
        L_0x00ec:
            java.lang.String r0 = "max_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 == 0) goto L_0x0104
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r1 == r0) goto L_0x0100
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
        L_0x0100:
            r2.A0C = r4     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            goto L_0x003f
        L_0x0104:
            java.lang.String r0 = "more_available"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 == 0) goto L_0x0114
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            r2.A0F = r0     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            goto L_0x003f
        L_0x0114:
            java.lang.String r0 = "content_source"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 == 0) goto L_0x012c
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r1 == r0) goto L_0x0128
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
        L_0x0128:
            r2.A09 = r4     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            goto L_0x003f
        L_0x012c:
            java.lang.String r0 = "chaining_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 == 0) goto L_0x003f
            X.9JG r0 = X.C295845p0.parseFromJson(r5)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            r2.A02 = r0     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            goto L_0x003f
        L_0x013c:
            java.lang.String r1 = r2.A0D     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            java.util.Map r0 = X.C292535j7.A01     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.5j7 r0 = (X.C292535j7) r0     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 != 0) goto L_0x014a
            X.5j7 r0 = X.C292535j7.MINOR     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
        L_0x014a:
            r2.A07 = r0     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.5u8 r1 = X.C276114sa.A00     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            boolean r0 = r2.A0F     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.5u9 r1 = r1.A00(r0)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            java.lang.String r0 = r2.A0C     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            r1.A00 = r0     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.4sZ r0 = r1.A00()     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            r2.A03 = r0     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            java.lang.String r1 = r2.A09     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r1 == 0) goto L_0x016c
            java.util.Map r0 = X.C295835oz.A01     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            X.5oz r0 = (X.C295835oz) r0     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            if (r0 != 0) goto L_0x016e
        L_0x016c:
            X.5oz r0 = X.C295835oz.DEFAULT     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
        L_0x016e:
            r2.A05 = r0     // Catch:{ IOException -> 0x0178, Exception -> 0x0171 }
            return r2
        L_0x0171:
            r0 = move-exception
            X.1Pf r1 = new X.1Pf
            r1.<init>(r0)
            throw r1
        L_0x0178:
            r1 = move-exception
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C295815ox.parseFromJson(X.16F):X.5oy");
    }
}
