package X;

/* renamed from: X.8u3  reason: invalid class name and case insensitive filesystem */
public abstract class C369228u3 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C369238u4 parseFromJson(X.16F r5) {
        /*
            r4 = 0
            X.0qQ.A0B(r5, r4)
            X.8u4 r0 = new X.8u4     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            r0.<init>()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r2 == r1) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            goto L_0x0128
        L_0x0016:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r2 == r1) goto L_0x0129
            java.lang.String r2 = r5.A0q()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            r5.A1J()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            java.lang.String r1 = "section_name"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            r3 = 0
            if (r1 == 0) goto L_0x0043
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r2 == r1) goto L_0x003a
            java.lang.String r3 = r5.A1P()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
        L_0x003a:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            r0.A03 = r3     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
        L_0x003f:
            r5.A0z()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            goto L_0x0016
        L_0x0043:
            java.lang.String r1 = "section_title"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r1 == 0) goto L_0x005d
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r2 == r1) goto L_0x0057
            java.lang.String r3 = r5.A1P()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
        L_0x0057:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            r0.A04 = r3     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            goto L_0x003f
        L_0x005d:
            java.lang.String r1 = "allow_overflow"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r1 == 0) goto L_0x006c
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            r0.A08 = r1     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            goto L_0x003f
        L_0x006c:
            java.lang.String r1 = "cta_text"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r1 == 0) goto L_0x0086
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r2 == r1) goto L_0x0080
            java.lang.String r3 = r5.A1P()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
        L_0x0080:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            r0.A02 = r3     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            goto L_0x003f
        L_0x0086:
            java.lang.String r1 = "show_separator"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r1 == 0) goto L_0x0095
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            r0.A09 = r1     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            goto L_0x003f
        L_0x0095:
            java.lang.String r1 = "is_separator_invisible"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r1 == 0) goto L_0x00a8
            boolean r1 = r5.A0d()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            r0.A01 = r1     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            goto L_0x003f
        L_0x00a8:
            java.lang.String r1 = "cta_action"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r1 == 0) goto L_0x00c4
            java.lang.String r2 = r5.A1Q()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            java.util.Map r1 = com.instagram.api.schemas.StickerTraySectionCTAType.A01     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            com.instagram.api.schemas.StickerTraySectionCTAType r1 = (com.instagram.api.schemas.StickerTraySectionCTAType) r1     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r1 != 0) goto L_0x00c0
            com.instagram.api.schemas.StickerTraySectionCTAType r1 = com.instagram.api.schemas.StickerTraySectionCTAType.UNRECOGNIZED     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
        L_0x00c0:
            r0.A00 = r1     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            goto L_0x003f
        L_0x00c4:
            java.lang.String r1 = "section_with_content_title"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r1 == 0) goto L_0x00df
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r2 == r1) goto L_0x00d8
            java.lang.String r3 = r5.A1P()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
        L_0x00d8:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            r0.A06 = r3     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            goto L_0x003f
        L_0x00df:
            java.lang.String r1 = "section_with_content_body"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r1 == 0) goto L_0x00fa
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r2 == r1) goto L_0x00f3
            java.lang.String r3 = r5.A1P()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
        L_0x00f3:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            r0.A05 = r3     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            goto L_0x003f
        L_0x00fa:
            java.lang.String r1 = "sticker_bundles"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r1 == 0) goto L_0x003f
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r2 != r1) goto L_0x0121
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            r3.<init>()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
        L_0x010f:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r2 == r1) goto L_0x0121
            X.6nz r1 = X.C369248u6.parseFromJson(r5)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            if (r1 == 0) goto L_0x010f
            r3.add(r1)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            goto L_0x010f
        L_0x0121:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            r0.A07 = r3     // Catch:{ IOException -> 0x0131, Exception -> 0x012a }
            goto L_0x003f
        L_0x0128:
            r0 = 0
        L_0x0129:
            return r0
        L_0x012a:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0131:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369228u3.parseFromJson(X.16F):X.8u4");
    }
}
