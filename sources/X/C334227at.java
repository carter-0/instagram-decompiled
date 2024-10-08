package X;

/* renamed from: X.7at  reason: invalid class name and case insensitive filesystem */
public final class C334227at {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v16, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: type inference failed for: r4v22 */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C335777dW parseFromJson(X.16F r8) {
        /*
            r2 = 0
            X.0qQ.A0B(r8, r2)
            X.7dW r1 = new X.7dW     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.<init>()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.16L r3 = r8.A11()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r3 == r0) goto L_0x0016
            r8.A0z()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a9
        L_0x0016:
            X.16L r3 = r8.A1J()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r3 == r0) goto L_0x02aa
            java.lang.String r3 = r8.A0q()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r8.A1J()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            java.lang.String r0 = "comments"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r4 = 0
            if (r0 == 0) goto L_0x0054
            X.16L r3 = r8.A11()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r3 != r0) goto L_0x004d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r4.<init>()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
        L_0x003b:
            X.16L r3 = r8.A1J()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r3 == r0) goto L_0x004d
            X.1bK r0 = X.AnonymousClass1Zw.parseFromJson(r8)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x003b
            r4.add(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x003b
        L_0x004d:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A0D = r4     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x0054:
            r0 = 3773(0xebd, float:5.287E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x007f
            X.16L r3 = r8.A11()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r3 != r0) goto L_0x029f
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r4.<init>()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
        L_0x006d:
            X.16L r3 = r8.A1J()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r3 == r0) goto L_0x029f
            X.1bK r0 = X.AnonymousClass1Zw.parseFromJson(r8)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x006d
            r4.add(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x006d
        L_0x007f:
            java.lang.String r0 = "comment_count"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x008f
            int r0 = r8.A1D()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A01 = r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x008f:
            java.lang.String r0 = "anonymous_comment_count"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x009f
            int r0 = r8.A1D()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A00 = r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x009f:
            java.lang.String r0 = "show_comments_for_you_demarcator"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r8.A0d()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A06 = r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x00b3:
            r0 = 141(0x8d, float:1.98E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x00c7
            boolean r0 = r8.A0d()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A0G = r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x00c7:
            r0 = 3220(0xc94, float:4.512E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x00db
            boolean r0 = r8.A0d()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A0H = r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x00db:
            r0 = 624(0x270, float:8.74E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r8.A0d()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A0I = r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x00ef:
            java.lang.String r0 = "scroll_behavior"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x0117
            int r6 = r8.A1D()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r0 = 3
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            int r4 = r5.length     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r3 = 0
        L_0x0102:
            if (r3 >= r4) goto L_0x02a4
            r0 = r5[r3]     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            switch(r0) {
                case 1: goto L_0x010f;
                case 2: goto L_0x0111;
                default: goto L_0x010d;
            }     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
        L_0x010d:
            r0 = 0
            goto L_0x0112
        L_0x010f:
            r0 = 1
            goto L_0x0112
        L_0x0111:
            r0 = 2
        L_0x0112:
            if (r0 == r6) goto L_0x02a4
            int r3 = r3 + 1
            goto L_0x0102
        L_0x0117:
            r0 = 3568(0xdf0, float:5.0E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x0153
            java.lang.String r7 = r8.A1Q()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r0 = 2
            java.lang.Integer[] r6 = X.AnonymousClass05K.A00(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            int r5 = r6.length     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r4 = 0
        L_0x012e:
            if (r4 >= r5) goto L_0x014d
            r3 = r6[r4]     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            int r0 = r3.intValue()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0145
            r0 = 290(0x122, float:4.06E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
        L_0x0140:
            boolean r0 = r0.equals(r7)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x0148
        L_0x0145:
            java.lang.String r0 = "none"
            goto L_0x0140
        L_0x0148:
            if (r0 != 0) goto L_0x014f
            int r4 = r4 + 1
            goto L_0x012e
        L_0x014d:
            java.lang.Integer r3 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
        L_0x014f:
            r1.A07 = r3     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x0153:
            java.lang.String r0 = "sort_order"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x016a
            java.lang.String r0 = r8.A1Q()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            java.lang.Integer r0 = X.C335807dZ.A00(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.0qQ.A0B(r0, r2)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A08 = r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x016a:
            java.lang.String r0 = "comment_filter_param"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x0189
            java.lang.String r3 = r8.A1Q()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.0qQ.A0B(r3, r2)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            java.util.Map r0 = X.C333797aA.A01     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.7aA r0 = (X.C333797aA) r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 != 0) goto L_0x0185
            X.7aA r0 = X.C333797aA.NOT_SET     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
        L_0x0185:
            r1.A05 = r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x0189:
            java.lang.String r0 = "insert_new_comment_to_top"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 != 0) goto L_0x029b
            java.lang.String r0 = "caption"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x01a1
            X.1bK r0 = X.AnonymousClass1Zw.parseFromJson(r8)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A02 = r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x01a1:
            java.lang.String r0 = "next_max_id"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x01bc
            X.16L r3 = r8.A11()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r3 == r0) goto L_0x01b5
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
        L_0x01b5:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A0B = r4     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x01bc:
            java.lang.String r0 = "next_min_id"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x01d7
            X.16L r3 = r8.A11()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r3 == r0) goto L_0x01d0
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
        L_0x01d0:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A0C = r4     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x01d7:
            java.lang.String r0 = "quick_response_emojis"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x0202
            X.16L r3 = r8.A11()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r3 != r0) goto L_0x01fe
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r4.<init>()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
        L_0x01ec:
            X.16L r3 = r8.A1J()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r3 == r0) goto L_0x01fe
            X.7dY r0 = X.C335787dX.parseFromJson(r8)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x01ec
            r4.add(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x01ec
        L_0x01fe:
            r1.A0F = r4     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x0202:
            java.lang.String r0 = "comment_cover_pos"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x0228
            java.lang.String r7 = r8.A1Q()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.7aI[] r6 = X.C333877aI.values()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            int r5 = r6.length     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r4 = 0
        L_0x0214:
            if (r4 >= r5) goto L_0x0223
            r3 = r6[r4]     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            java.lang.String r0 = r3.A00     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            boolean r0 = X.0qQ.A0K(r0, r7)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 != 0) goto L_0x0225
            int r4 = r4 + 1
            goto L_0x0214
        L_0x0223:
            X.7aI r3 = X.C333877aI.NOT_SET     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
        L_0x0225:
            r1.A04 = r3     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x0228:
            r0 = 1343(0x53f, float:1.882E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x0238
            r8.A1D()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x0238:
            java.lang.String r0 = "fb_graphqlid"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x024f
            X.16L r3 = r8.A11()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r3 == r0) goto L_0x024c
            java.lang.String r4 = r8.A1P()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
        L_0x024c:
            r1.A0A = r4     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x024f:
            java.lang.String r0 = "has_comment_spike"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 != 0) goto L_0x029b
            java.lang.String r0 = "liked_by_media_owner_badge_enabled"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x0266
            boolean r0 = r8.A0d()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A0K = r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x0266:
            java.lang.String r0 = "is_eligible_for_creator_nudges"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x0275
            boolean r0 = r8.A0d()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A0J = r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x0275:
            java.lang.String r0 = "comment_prompt_parent_comment"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x0284
            X.1bK r0 = X.AnonymousClass1Zw.parseFromJson(r8)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A03 = r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x0284:
            java.lang.String r0 = "th_reply_count"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            if (r0 == 0) goto L_0x0297
            int r0 = r8.A1D()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A09 = r0     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x0297:
            X.1XY.A01(r8, r1, r3)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x029b:
            r8.A0d()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x02a4
        L_0x029f:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            r1.A0E = r4     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
        L_0x02a4:
            r8.A0z()     // Catch:{ IOException -> 0x02b2, Exception -> 0x02ab }
            goto L_0x0016
        L_0x02a9:
            r1 = 0
        L_0x02aa:
            return r1
        L_0x02ab:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x02b2:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C334227at.parseFromJson(X.16F):X.7dW");
    }
}
