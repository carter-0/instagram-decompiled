package X;

/* renamed from: X.B7y  reason: case insensitive filesystem */
public final class C41946B7y {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.VcV] */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v17, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v19, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C41945B7x parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.B7x r2 = new X.B7x     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r2.<init>()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x024c
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 == r0) goto L_0x023c
            java.lang.String r1 = r5.A0q()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r5.A1J()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            java.lang.String r0 = "viewers"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r4 = 0
            if (r0 == 0) goto L_0x0051
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 != r0) goto L_0x004d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r4.<init>()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
        L_0x003b:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 == r0) goto L_0x004d
            X.9J5 r0 = X.C41947B7z.parseFromJson(r5)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x003b
            r4.add(r0)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x003b
        L_0x004d:
            r2.A0G = r4     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x0051:
            java.lang.String r0 = "story_likers"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x007a
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 != r0) goto L_0x0235
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r4.<init>()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
        L_0x0066:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 == r0) goto L_0x0235
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            com.instagram.user.model.User r0 = X.1aC.A00(r5, r3)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x0066
            r4.add(r0)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0066
        L_0x007a:
            java.lang.String r0 = "users"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x00a7
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 != r0) goto L_0x00a3
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r4.<init>()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
        L_0x008f:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 == r0) goto L_0x00a3
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            com.instagram.user.model.User r0 = X.1aC.A00(r5, r3)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x008f
            r4.add(r0)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x008f
        L_0x00a3:
            r2.A0F = r4     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x00a7:
            java.lang.String r0 = "shared_with_users"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x00da
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 != r0) goto L_0x00d6
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r4.<init>()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
        L_0x00bc:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 == r0) goto L_0x00d6
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 == r0) goto L_0x00bc
            java.lang.String r0 = r5.A1P()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x00bc
            r4.add(r0)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x00bc
        L_0x00d6:
            r2.A0C = r4     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x00da:
            java.lang.String r0 = "multi_author_stories"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x0105
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 != r0) goto L_0x0101
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r4.<init>()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
        L_0x00ef:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 == r0) goto L_0x0101
            X.Cv1 r0 = X.C44969Co6.parseFromJson(r5)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x00ef
            r4.add(r0)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x00ef
        L_0x0101:
            r2.A0A = r4     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x0105:
            java.lang.String r0 = "total_viewer_count"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x0115
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r2.A02 = r0     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x0115:
            java.lang.String r0 = "next_max_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x012d
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 == r0) goto L_0x0129
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
        L_0x0129:
            r2.A09 = r4     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x012d:
            java.lang.String r0 = "mas_view_count_megaphone_learn_more_url"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x0145
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 == r0) goto L_0x0141
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
        L_0x0141:
            r2.A08 = r4     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x0145:
            java.lang.String r0 = "show_mas_view_count_megaphone"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x0155
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r2.A0J = r0     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x0155:
            java.lang.String r0 = "megaphone"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x0165
            X.VcV r0 = X.C17037VFl.parseFromJson(r5)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r2.A04 = r0     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x0165:
            java.lang.String r0 = "updated_media"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x0175
            X.1Xj r0 = X.1Xj.A00(r5)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r2.A03 = r0     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x0175:
            java.lang.String r0 = "reactions"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x01a0
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 != r0) goto L_0x019c
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r4.<init>()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
        L_0x018a:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 == r0) goto L_0x019c
            X.BG9 r0 = X.C44302Cck.parseFromJson(r5)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x018a
            r4.add(r0)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x018a
        L_0x019c:
            r2.A0B = r4     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x01a0:
            java.lang.String r0 = "cursor"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x01b8
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 == r0) goto L_0x01b4
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
        L_0x01b4:
            r2.A07 = r4     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x01b8:
            java.lang.String r0 = "is_fb_story_archived"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x01cb
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r2.A06 = r0     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x01cb:
            java.lang.String r0 = "nonfriend_viewer_count"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x01da
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r2.A00 = r0     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x01da:
            java.lang.String r0 = "fb_viewer_count"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x01e9
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r2.A01 = r0     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x01e9:
            java.lang.String r0 = "story_prompt_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x01f8
            X.Csz r0 = X.C44988CoR.parseFromJson(r5)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r2.A05 = r0     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x01f8:
            java.lang.String r0 = "top_story_comments"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x0222
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 != r0) goto L_0x021f
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r4.<init>()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
        L_0x020d:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r1 == r0) goto L_0x021f
            X.1bK r0 = X.AnonymousClass1Zw.parseFromJson(r5)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x020d
            r4.add(r0)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x020d
        L_0x021f:
            r2.A0E = r4     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x0222:
            java.lang.String r0 = "has_more_comments"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x0231
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r2.A0I = r0     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x0231:
            X.1XY.A01(r5, r2, r1)     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0237
        L_0x0235:
            r2.A0D = r4     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
        L_0x0237:
            r5.A0z()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            goto L_0x0016
        L_0x023c:
            boolean r0 = r2.A0J     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            if (r0 == 0) goto L_0x024d
            java.lang.String r1 = r2.A08     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            X.VcV r0 = new X.VcV     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r0.<init>()     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r0.A05 = r1     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            r2.A04 = r0     // Catch:{ IOException -> 0x0254, Exception -> 0x024e }
            return r2
        L_0x024c:
            r2 = 0
        L_0x024d:
            return r2
        L_0x024e:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x0254:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41946B7y.parseFromJson(X.16F):X.B7x");
    }
}
