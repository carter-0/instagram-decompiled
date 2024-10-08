package X;

/* renamed from: X.3QT  reason: invalid class name */
public abstract class AnonymousClass3QT {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v13, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v19, types: [java.util.Set, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v21 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r5v26 */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3QF parseFromJson(X.16F r9) {
        /*
            r7 = 0
            X.0qQ.A0B(r9, r7)
            X.3QF r1 = new X.3QF     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.<init>()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r6 = X.16L.A0D     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == r6) goto L_0x0016
            r9.A0z()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0294
        L_0x0016:
            X.16L r0 = r9.A1J()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r8 = X.16L.A09     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == r8) goto L_0x0295
            java.lang.String r2 = r9.A0q()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r9.A1J()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            java.lang.String r0 = "source_format"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r5 = 0
            if (r0 == 0) goto L_0x005b
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 != r0) goto L_0x0055
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r5.<init>()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
        L_0x003b:
            X.16L r2 = r9.A1J()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 == r0) goto L_0x0055
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 == r0) goto L_0x003b
            java.lang.String r0 = r9.A1P()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x003b
            r5.add(r0)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x003b
        L_0x0055:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A0F = r5     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x005b:
            java.lang.String r0 = "external_app_sign"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x0078
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 == r0) goto L_0x006f
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
        L_0x006f:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A09 = r5     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
        L_0x0074:
            r9.A0z()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0016
        L_0x0078:
            java.lang.String r0 = "external_app_metadata"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x0092
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 == r0) goto L_0x008c
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
        L_0x008c:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A08 = r5     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x0092:
            java.lang.String r0 = "next_publish_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x00a1
            int r0 = r9.A1D()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A02 = r0     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x00a1:
            java.lang.String r0 = "current_publish_id"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x00b0
            int r0 = r9.A1D()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A00 = r0     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x00b0:
            java.lang.String r0 = "media_publish_sent_id_set"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x00e6
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 != r0) goto L_0x00db
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r5.<init>()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
        L_0x00c5:
            X.16L r2 = r9.A1J()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 == r0) goto L_0x00db
            int r0 = r9.A1D()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x00c5
            r5.add(r0)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x00c5
        L_0x00db:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A0D = r0     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x00e6:
            java.lang.String r0 = "media_success_sent_id_set"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x011d
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 != r0) goto L_0x0111
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r5.<init>()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
        L_0x00fb:
            X.16L r2 = r9.A1J()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 == r0) goto L_0x0111
            int r0 = r9.A1D()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x00fb
            r5.add(r0)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x00fb
        L_0x0111:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A0E = r0     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x011d:
            java.lang.String r0 = "media_abandon_sent_id_set"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x0154
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 != r0) goto L_0x0148
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r5.<init>()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
        L_0x0132:
            X.16L r2 = r9.A1J()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 == r0) goto L_0x0148
            int r0 = r9.A1D()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x0132
            r5.add(r0)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0132
        L_0x0148:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A0C = r0     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x0154:
            java.lang.String r0 = "is_publish_ready_sent"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x0164
            boolean r0 = r9.A0d()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A0G = r0     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x0164:
            java.lang.String r0 = "event_counter"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x0174
            int r0 = r9.A1D()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A01 = r0     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x0174:
            java.lang.String r0 = "last_upload_time"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x0184
            long r2 = r9.A0y()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A04 = r2     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x0184:
            java.lang.String r0 = "publish_id_to_target_share_type_media_map"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x01e6
            X.16L r0 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 != r6) goto L_0x01da
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r4.<init>()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
        L_0x0197:
            X.16L r0 = r9.A1J()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == r8) goto L_0x01d9
            java.lang.String r3 = r9.A1P()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r9.A1J()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 != r0) goto L_0x01b0
            r4.put(r3, r5)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0197
        L_0x01b0:
            java.lang.String r2 = r9.A1P()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            kotlin.enums.EnumEntries r0 = com.instagram.pendingmedia.model.constants.ShareType.A05     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.0qQ.A0B(r2, r7)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            java.lang.String r0 = "MULTI_CONFIG"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x01c7
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.REEL_SHARE_AND_DIRECT_STORY_SHARE     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
        L_0x01c3:
            r4.put(r3, r0)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0197
        L_0x01c7:
            java.util.Set r0 = com.instagram.pendingmedia.model.constants.ShareType.A04     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            boolean r0 = r0.contains(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 != 0) goto L_0x01d2
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.INVALID     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x01c3
        L_0x01d2:
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.valueOf(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x0197
            goto L_0x01c3
        L_0x01d9:
            r5 = r4
        L_0x01da:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A0B = r0     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x01e6:
            java.lang.String r0 = "photo_to_video_type"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x01f6
            int r0 = r9.A1D()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A03 = r0     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x01f6:
            java.lang.String r0 = "server_ptv_duration_ms"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x0206
            long r2 = r9.A0y()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A05 = r2     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x0206:
            java.lang.String r0 = "download_bandwidth"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x0221
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 == r0) goto L_0x021a
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
        L_0x021a:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A07 = r5     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x0221:
            java.lang.String r0 = "transcode_type"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x0256
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 == r0) goto L_0x0235
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
        L_0x0235:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r0 = 7
            java.lang.Integer[] r8 = X.AnonymousClass05K.A00(r0)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            int r4 = r8.length     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r3 = 0
        L_0x023f:
            if (r3 >= r4) goto L_0x0250
            r2 = r8[r3]     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            java.lang.String r0 = X.C273764n9.A00(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            boolean r0 = X.0qQ.A0K(r0, r5)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 != 0) goto L_0x0252
            int r3 = r3 + 1
            goto L_0x023f
        L_0x0250:
            java.lang.Integer r2 = X.AnonymousClass05K.A0u     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
        L_0x0252:
            r1.A06 = r2     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x0256:
            java.lang.String r0 = "ingest_session_id_to_publish_ids_map"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x0074
            X.16L r0 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 != r6) goto L_0x028d
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r4.<init>()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
        L_0x0269:
            X.16L r0 = r9.A1J()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == r8) goto L_0x028c
            java.lang.String r3 = r9.A1P()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r9.A1J()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r2 != r0) goto L_0x0282
            r4.put(r3, r5)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0269
        L_0x0282:
            X.9IE r0 = X.AnonymousClass4FL.parseFromJson(r9)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            if (r0 == 0) goto L_0x0269
            r4.put(r3, r0)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0269
        L_0x028c:
            r5 = r4
        L_0x028d:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            r1.A0A = r5     // Catch:{ IOException -> 0x029d, Exception -> 0x0296 }
            goto L_0x0074
        L_0x0294:
            r1 = 0
        L_0x0295:
            return r1
        L_0x0296:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x029d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QT.parseFromJson(X.16F):X.3QF");
    }
}
