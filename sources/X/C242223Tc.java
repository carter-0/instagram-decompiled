package X;

/* renamed from: X.3Tc  reason: invalid class name and case insensitive filesystem */
public abstract class C242223Tc {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r3v24 */
    /* JADX WARNING: type inference failed for: r3v25 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r3v27 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C242243Te parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.3Te r0 = new X.3Te     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.<init>()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0309
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x030a
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r4.A1J()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            java.lang.String r1 = "audience_type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0037
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A00 = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
        L_0x0033:
            r4.A0z()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0016
        L_0x0037:
            java.lang.String r1 = "channel_end_source"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x004a
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A05 = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x004a:
            java.lang.String r1 = "channel_end_timestamp"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0059
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A01 = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x0059:
            java.lang.String r1 = "is_public"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0068
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A0Q = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x0068:
            java.lang.String r1 = "is_pinnable_to_viewer_profile"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0077
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A0O = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x0077:
            java.lang.String r1 = "is_pinned_to_viewer_profile"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0086
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A0P = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x0086:
            java.lang.String r1 = "is_added_to_inbox"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0095
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A0I = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x0095:
            java.lang.String r1 = "is_periodic_polling_enabled"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x00a4
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A0N = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x00a4:
            java.lang.String r1 = "creator_igid"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r3 = 0
            if (r1 == 0) goto L_0x00bd
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x00b9
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
        L_0x00b9:
            r0.A07 = r3     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x00bd:
            java.lang.String r1 = "creator_profile_picture_url"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x00cd
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.16h.A00(r4)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A04 = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x00cd:
            java.lang.String r1 = "creator_username"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x00e5
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x00e1
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
        L_0x00e1:
            r0.A08 = r3     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x00e5:
            java.lang.String r1 = "joined_collaborator_ids"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0118
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 != r1) goto L_0x0114
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r3.<init>()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
        L_0x00fa:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x0114
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x00fa
            java.lang.String r1 = r4.A1P()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x00fa
            r3.add(r1)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x00fa
        L_0x0114:
            r0.A0D = r3     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x0118:
            java.lang.String r1 = "invited_collaborator_ids"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x014b
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 != r1) goto L_0x0147
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r3.<init>()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
        L_0x012d:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x0147
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x012d
            java.lang.String r1 = r4.A1P()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x012d
            r3.add(r1)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x012d
        L_0x0147:
            r0.A0B = r3     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x014b:
            java.lang.String r1 = "added_to_inbox_count"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x015b
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A02 = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x015b:
            java.lang.String r1 = "is_subscribed_collaborator"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x016b
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A0R = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x016b:
            java.lang.String r1 = "joined_moderator_ids"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x019e
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 != r1) goto L_0x019a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r3.<init>()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
        L_0x0180:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x019a
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x0180
            java.lang.String r1 = r4.A1P()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0180
            r3.add(r1)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0180
        L_0x019a:
            r0.A0E = r3     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x019e:
            java.lang.String r1 = "invited_moderator_ids"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x01d1
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 != r1) goto L_0x01cd
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r3.<init>()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
        L_0x01b3:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x01cd
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x01b3
            java.lang.String r1 = r4.A1P()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x01b3
            r3.add(r1)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x01b3
        L_0x01cd:
            r0.A0C = r3     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x01d1:
            java.lang.String r1 = "is_creator_minor"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x01e1
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A0K = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x01e1:
            java.lang.String r1 = "has_creator_sent_msg"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x01f1
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A0H = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x01f1:
            java.lang.String r1 = "is_comments_enabled"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0201
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A0J = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x0201:
            java.lang.String r1 = "is_hidden_in_messages_primary_tab"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0211
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A0L = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x0211:
            java.lang.String r1 = "social_context_facepile_users"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x023c
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 != r1) goto L_0x0238
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r3.<init>()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
        L_0x0226:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x0238
            X.JwJ r1 = X.C48849ElB.parseFromJson(r4)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0226
            r3.add(r1)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0226
        L_0x0238:
            r0.A0F = r3     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x023c:
            java.lang.String r1 = "is_xposting_eligible"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x024c
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A0S = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x024c:
            java.lang.String r1 = "xposting_enabled_channels"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0277
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 != r1) goto L_0x0273
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r3.<init>()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
        L_0x0261:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x0273
            X.JwB r1 = X.D10.parseFromJson(r4)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0261
            r3.add(r1)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0261
        L_0x0273:
            r0.A0G = r3     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x0277:
            java.lang.String r1 = "xposting_available_channel_count"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x028b
            int r1 = r4.A1D()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A06 = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x028b:
            java.lang.String r1 = "first_available_xpost_channel"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x029b
            X.JwB r1 = X.D10.parseFromJson(r4)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A03 = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x029b:
            java.lang.String r1 = "hidden_emojis"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x02ce
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 != r1) goto L_0x02ca
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r3.<init>()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
        L_0x02b0:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x02ca
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x02b0
            java.lang.String r1 = r4.A1P()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x02b0
            r3.add(r1)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x02b0
        L_0x02ca:
            r0.A09 = r3     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x02ce:
            java.lang.String r1 = "channel_milestones"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x02f9
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 != r1) goto L_0x02f5
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r3.<init>()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
        L_0x02e3:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r2 == r1) goto L_0x02f5
            X.Cuh r1 = X.C44658Cic.parseFromJson(r4)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x02e3
            r3.add(r1)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x02e3
        L_0x02f5:
            r0.A0A = r3     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x02f9:
            java.lang.String r1 = "is_linked_account_eligible_for_xposting"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            if (r1 == 0) goto L_0x0033
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            r0.A0M = r1     // Catch:{ IOException -> 0x0312, Exception -> 0x030b }
            goto L_0x0033
        L_0x0309:
            r0 = 0
        L_0x030a:
            return r0
        L_0x030b:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0312:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C242223Tc.parseFromJson(X.16F):X.3Te");
    }
}
