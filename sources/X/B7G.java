package X;

public abstract class B7G {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3UL parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            r0 = 0
            X.3UL r2 = new X.3UL     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r1 == r0) goto L_0x0017
            r5.A0z()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r2 = 0
            return r2
        L_0x0017:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r1 == r0) goto L_0x0140
            java.lang.String r1 = r5.A0q()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r5.A1J()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            java.lang.String r0 = "is_new_suggestion"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r0 == 0) goto L_0x0038
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r2.A0D = r0     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
        L_0x0034:
            r5.A0z()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            goto L_0x0017
        L_0x0038:
            java.lang.String r0 = "algorithm"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r4 = 0
            if (r0 == 0) goto L_0x0053
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r1 == r0) goto L_0x004d
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
        L_0x004d:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r2.A04 = r4     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            goto L_0x0034
        L_0x0053:
            java.lang.String r0 = "uuid"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r0 == 0) goto L_0x006d
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r1 == r0) goto L_0x0067
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
        L_0x0067:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r2.A08 = r4     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            goto L_0x0034
        L_0x006d:
            java.lang.String r0 = "social_context"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r0 == 0) goto L_0x0087
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r1 == r0) goto L_0x0081
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
        L_0x0081:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r2.A05 = r4     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            goto L_0x0034
        L_0x0087:
            java.lang.String r0 = "user_story"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r0 == 0) goto L_0x0096
            X.4hN r0 = X.C44890Cmg.parseFromJson(r5)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r2.A02 = r0     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            goto L_0x0034
        L_0x0096:
            java.lang.String r0 = "followed_by"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r0 == 0) goto L_0x00a5
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r2.A0C = r0     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            goto L_0x0034
        L_0x00a5:
            java.lang.String r0 = "media_infos"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r0 == 0) goto L_0x00d3
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r1 != r0) goto L_0x00cc
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r4.<init>()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
        L_0x00ba:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r1 == r0) goto L_0x00cc
            X.1Xj r0 = X.1Xj.A00(r5)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r0 == 0) goto L_0x00ba
            r4.add(r0)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            goto L_0x00ba
        L_0x00cc:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r2.A09 = r4     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            goto L_0x0034
        L_0x00d3:
            java.lang.String r0 = "user"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r0 == 0) goto L_0x00e8
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            com.instagram.user.model.User r0 = X.1aC.A00(r5, r3)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            X.0qQ.A0B(r0, r3)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r2.A03 = r0     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            goto L_0x0034
        L_0x00e8:
            java.lang.String r0 = "social_context_facepile_users"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r0 == 0) goto L_0x0118
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r1 != r0) goto L_0x0111
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r4.<init>()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
        L_0x00fd:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r1 == r0) goto L_0x0111
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            com.instagram.user.model.User r0 = X.1aC.A00(r5, r3)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r0 == 0) goto L_0x00fd
            r4.add(r0)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            goto L_0x00fd
        L_0x0111:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r2.A0A = r4     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            goto L_0x0034
        L_0x0118:
            java.lang.String r0 = "interest_topic"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r0 == 0) goto L_0x0130
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r1 == r0) goto L_0x012c
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
        L_0x012c:
            r2.A07 = r4     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            goto L_0x0034
        L_0x0130:
            java.lang.String r0 = "custom_profile_pic_url"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            if (r0 == 0) goto L_0x0034
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.16W.parseFromJson(r5)     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            r2.A01 = r0     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            goto L_0x0034
        L_0x0140:
            r2.A00()     // Catch:{ IOException -> 0x014b, Exception -> 0x0144 }
            return r2
        L_0x0144:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x014b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B7G.parseFromJson(X.16F):X.3UL");
    }
}
