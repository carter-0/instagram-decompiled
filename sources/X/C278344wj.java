package X;

/* renamed from: X.4wj  reason: invalid class name and case insensitive filesystem */
public abstract class C278344wj {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.4wk] */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C278354wk parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.4wk r0 = new X.4wk     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            r0.<init>()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            goto L_0x00de
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r2 == r1) goto L_0x00df
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            r4.A1J()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            java.lang.String r1 = "link_image_url"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r1 == 0) goto L_0x0037
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.16h.A00(r4)     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            r0.A00 = r1     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
        L_0x0033:
            r4.A0z()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            goto L_0x0016
        L_0x0037:
            java.lang.String r1 = "link_title"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            r3 = 0
            if (r1 == 0) goto L_0x004f
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r2 == r1) goto L_0x004c
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
        L_0x004c:
            r0.A03 = r3     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            goto L_0x0033
        L_0x004f:
            java.lang.String r1 = "link_body"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r1 == 0) goto L_0x0066
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r2 == r1) goto L_0x0063
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
        L_0x0063:
            r0.A02 = r3     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            goto L_0x0033
        L_0x0066:
            java.lang.String r1 = "link_url"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r1 == 0) goto L_0x007d
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r2 == r1) goto L_0x007a
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
        L_0x007a:
            r0.A05 = r3     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            goto L_0x0033
        L_0x007d:
            java.lang.String r1 = "link_summary"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r1 == 0) goto L_0x0094
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r2 == r1) goto L_0x0091
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
        L_0x0091:
            r0.A04 = r3     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            goto L_0x0033
        L_0x0094:
            java.lang.String r1 = "link_playable_audio_url"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r1 == 0) goto L_0x00ab
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r2 == r1) goto L_0x00a8
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
        L_0x00a8:
            r0.A01 = r3     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            goto L_0x0033
        L_0x00ab:
            java.lang.String r1 = "link_music_preview_countries_allowed"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r1 == 0) goto L_0x0033
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r2 != r1) goto L_0x00da
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            r3.<init>()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
        L_0x00c0:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r2 == r1) goto L_0x00da
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r2 == r1) goto L_0x00c0
            java.lang.String r1 = r4.A1P()     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            if (r1 == 0) goto L_0x00c0
            r3.add(r1)     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            goto L_0x00c0
        L_0x00da:
            r0.A06 = r3     // Catch:{ IOException -> 0x00e7, Exception -> 0x00e0 }
            goto L_0x0033
        L_0x00de:
            r0 = 0
        L_0x00df:
            return r0
        L_0x00e0:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00e7:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C278344wj.parseFromJson(X.16F):X.4wk");
    }
}
