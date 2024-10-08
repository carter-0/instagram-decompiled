package X;

/* renamed from: X.7d9  reason: invalid class name and case insensitive filesystem */
public final class C335557d9 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v13, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v21, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v25, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: type inference failed for: r5v29 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r5v31 */
    /* JADX WARNING: type inference failed for: r5v32 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: type inference failed for: r5v38 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C335567dA parseFromJson(X.16F r61) {
        /*
            r3 = 0
            r4 = r61
            X.0qQ.A0B(r4, r3)
            X.7dA r1 = new X.7dA     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.<init>()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x0018
            r4.A0z()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1 = 0
            return r1
        L_0x0018:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x044b
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r4.A1J()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.String r0 = "anonymous_user_count"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x003d
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0J = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
        L_0x0039:
            r4.A0z()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0018
        L_0x003d:
            java.lang.String r0 = "auto_expand_chaining"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0050
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A08 = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0050:
            java.lang.String r0 = "big_list"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0063
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A09 = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0063:
            java.lang.String r0 = "chaining_upsell_cards"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r5 = 0
            if (r0 == 0) goto L_0x008e
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 != r0) goto L_0x008b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r5.<init>()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
        L_0x0079:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x008b
            X.GoU r0 = X.HTS.parseFromJson(r4)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0079
            r5.add(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0079
        L_0x008b:
            r1.A0c = r5     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x008e:
            java.lang.String r0 = "disclaimer_text"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x00a5
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x00a2
            java.lang.String r5 = r4.A1P()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
        L_0x00a2:
            r1.A0X = r5     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x00a5:
            java.lang.String r0 = "friend_requests"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x00b4
            X.7g4 r0 = X.C393359wJ.parseFromJson(r4)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A01 = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x00b4:
            java.lang.String r0 = "global_blacklist_sample"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x00c4
            X.7g6 r0 = X.C393319wF.parseFromJson(r4)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A00 = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x00c4:
            java.lang.String r0 = "groups"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x00ef
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 != r0) goto L_0x00eb
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r5.<init>()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
        L_0x00d9:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x00eb
            X.BGT r0 = X.C44360Cdg.parseFromJson(r4)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x00d9
            r5.add(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x00d9
        L_0x00eb:
            r1.A0d = r5     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x00ef:
            java.lang.String r0 = "has_chaining"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0103
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0A = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0103:
            java.lang.String r0 = "has_more"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0113
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0j = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0113:
            java.lang.String r0 = "has_stories"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0127
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0K = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0127:
            java.lang.String r0 = "hashtag_count"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x013b
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0L = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x013b:
            java.lang.String r0 = "is_recommend_account"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x014f
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0B = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x014f:
            java.lang.String r0 = "media_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x015f
            X.1Xj r0 = X.1Xj.A00(r4)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A05 = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x015f:
            java.lang.String r0 = "more_groups_available"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0173
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0C = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0173:
            java.lang.String r0 = "next_max_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x018b
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x0187
            java.lang.String r5 = r4.A1P()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
        L_0x0187:
            r1.A0Y = r5     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x018b:
            java.lang.String r0 = "num_ci_friends"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x019f
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0M = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x019f:
            java.lang.String r0 = "num_fb_friends"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x01b3
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0N = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x01b3:
            java.lang.String r0 = "page_size"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x01c7
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0O = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x01c7:
            java.lang.String r0 = "page_token"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x01df
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x01db
            java.lang.String r5 = r4.A1P()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
        L_0x01db:
            r1.A0Z = r5     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x01df:
            java.lang.String r0 = "pending_admins"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x020c
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 != r0) goto L_0x0208
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r5.<init>()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
        L_0x01f4:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x0208
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            com.instagram.user.model.User r0 = X.1aC.A00(r4, r3)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x01f4
            r5.add(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x01f4
        L_0x0208:
            r1.A0e = r5     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x020c:
            java.lang.String r0 = "post_impression_count"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0220
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0P = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0220:
            java.lang.String r0 = "preview_hashtags"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x024b
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 != r0) goto L_0x0247
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r5.<init>()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
        L_0x0235:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x0247
            X.BHl r0 = X.C44500Cfw.parseFromJson(r4)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0235
            r5.add(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0235
        L_0x0247:
            r1.A0f = r5     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x024b:
            java.lang.String r0 = "rank_token"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0263
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x025f
            java.lang.String r5 = r4.A1P()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
        L_0x025f:
            r1.A0a = r5     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0263:
            java.lang.String r0 = "sections"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x028e
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 != r0) goto L_0x028a
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r5.<init>()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
        L_0x0278:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x028a
            X.9ce r0 = X.C393369wK.parseFromJson(r4)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0278
            r5.add(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0278
        L_0x028a:
            r1.A0g = r5     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x028e:
            java.lang.String r0 = "sequence_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x02a2
            long r5 = r4.A0y()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0W = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x02a2:
            java.lang.String r0 = "should_limit_list_of_followers"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x02b6
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0D = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x02b6:
            java.lang.String r0 = "show_spam_follow_request_tab"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x02ca
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0E = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x02ca:
            java.lang.String r0 = "spam_follower_is_nux"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x02de
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0F = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x02de:
            java.lang.String r0 = "spam_follower_setting_enabled"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x02f2
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0G = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x02f2:
            java.lang.String r0 = "spam_follower_setting_help_center_link"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x030a
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x0306
            java.lang.String r5 = r4.A1P()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
        L_0x0306:
            r1.A0b = r5     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x030a:
            java.lang.String r0 = "special_empty_state"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x031a
            com.instagram.api.schemas.GraphGuardianContentImpl r0 = X.CYC.parseFromJson(r4)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A02 = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x031a:
            java.lang.String r0 = "suggested_users"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0347
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 != r0) goto L_0x0343
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r5.<init>()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
        L_0x032f:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x0343
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            com.instagram.user.model.User r0 = X.1aC.A00(r4, r3)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x032f
            r5.add(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x032f
        L_0x0343:
            r1.A0h = r5     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0347:
            java.lang.String r0 = "target_follower_count"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x035b
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0Q = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x035b:
            java.lang.String r0 = "target_following_count"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x036f
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0R = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x036f:
            java.lang.String r0 = "total_unique_viewer_count"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0383
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0S = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0383:
            java.lang.String r0 = "truncate_follow_requests_at_index"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0397
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0T = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0397:
            java.lang.String r0 = "truncate_users_at_index"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x03ab
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0U = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x03ab:
            java.lang.String r0 = "use_clickable_see_more"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x03bf
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0H = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x03bf:
            java.lang.String r0 = "user"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x03d1
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            com.instagram.user.model.User r0 = X.1aC.A00(r4, r3)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A07 = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x03d1:
            java.lang.String r0 = "user_count"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x03e5
            int r0 = r4.A1D()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0V = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x03e5:
            java.lang.String r0 = "user_has_hidden_groups"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x03f9
            boolean r0 = r4.A0d()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A0I = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x03f9:
            java.lang.String r0 = "user_pay_info"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0409
            X.7gA r0 = X.C44567Ch1.parseFromJson(r4)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A04 = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0409:
            java.lang.String r0 = "user_story"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0419
            X.4hN r0 = X.C44890Cmg.parseFromJson(r4)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A06 = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0419:
            java.lang.String r0 = "users"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x0446
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 != r0) goto L_0x0442
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r5.<init>()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
        L_0x042e:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r2 == r0) goto L_0x0442
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            com.instagram.user.model.User r0 = X.1aC.A00(r4, r3)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            if (r0 == 0) goto L_0x042e
            r5.add(r0)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x042e
        L_0x0442:
            r1.A0i = r5     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x0446:
            X.1XY.A01(r4, r1, r2)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            goto L_0x0039
        L_0x044b:
            java.lang.Integer r0 = r1.A0J     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r27 = r0
            java.lang.Boolean r0 = r1.A08     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r61 = r0
            java.lang.Boolean r0 = r1.A09     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r60 = r0
            java.util.List r0 = r1.A0c     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r46 = r0
            java.lang.String r0 = r1.A0X     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r41 = r0
            X.7g4 r0 = r1.A01     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r59 = r0
            X.7g6 r0 = r1.A00     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r58 = r0
            java.util.List r0 = r1.A0d     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r47 = r0
            java.lang.Boolean r0 = r1.A0A     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r57 = r0
            boolean r0 = r1.A0j     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r53 = r0
            java.lang.Integer r0 = r1.A0K     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r28 = r0
            java.lang.Integer r0 = r1.A0L     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r29 = r0
            java.lang.Boolean r0 = r1.A0B     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r56 = r0
            X.1Xj r0 = r1.A05     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r55 = r0
            java.lang.Boolean r0 = r1.A0C     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r54 = r0
            java.lang.String r0 = r1.A0Y     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r42 = r0
            java.lang.Integer r0 = r1.A0M     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r30 = r0
            java.lang.Integer r0 = r1.A0N     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r31 = r0
            java.lang.Integer r0 = r1.A0O     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r32 = r0
            java.lang.String r0 = r1.A0Z     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r43 = r0
            java.util.List r0 = r1.A0e     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r48 = r0
            java.lang.Integer r0 = r1.A0P     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r33 = r0
            java.util.List r0 = r1.A0f     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r49 = r0
            java.lang.String r0 = r1.A0a     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r44 = r0
            java.util.List r0 = r1.A0g     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r20 = r0
            java.lang.Long r0 = r1.A0W     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r19 = r0
            java.lang.Boolean r0 = r1.A0D     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r21 = r0
            java.lang.Boolean r0 = r1.A0E     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r22 = r0
            java.lang.Boolean r0 = r1.A0F     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r18 = r0
            java.lang.Boolean r0 = r1.A0G     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r17 = r0
            java.lang.String r0 = r1.A0b     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r16 = r0
            com.instagram.api.schemas.GraphGuardianContentImpl r15 = r1.A02     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.util.List r14 = r1.A0h     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r13 = r1.A0Q     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r12 = r1.A0R     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r11 = r1.A0S     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r10 = r1.A0T     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r9 = r1.A0U     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Boolean r8 = r1.A0H     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            com.instagram.user.model.User r7 = r1.A07     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Integer r6 = r1.A0V     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.lang.Boolean r5 = r1.A0I     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.7gA r4 = r1.A04     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.4hN r3 = r1.A06     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            java.util.List r2 = r1.A0i     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            X.7dB r0 = new X.7dB     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r23 = r18
            r24 = r17
            r25 = r8
            r26 = r5
            r34 = r13
            r35 = r12
            r36 = r11
            r37 = r10
            r38 = r9
            r39 = r6
            r40 = r19
            r45 = r16
            r50 = r20
            r51 = r14
            r52 = r2
            r8 = r0
            r9 = r58
            r10 = r59
            r11 = r15
            r12 = r4
            r13 = r55
            r14 = r3
            r15 = r7
            r16 = r61
            r17 = r60
            r18 = r57
            r19 = r56
            r20 = r54
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            r1.A03 = r0     // Catch:{ IOException -> 0x0525, Exception -> 0x051e }
            return r1
        L_0x051e:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0525:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C335557d9.parseFromJson(X.16F):X.7dA");
    }
}
