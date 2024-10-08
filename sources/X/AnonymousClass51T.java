package X;

/* renamed from: X.51T  reason: invalid class name */
public abstract class AnonymousClass51T {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* JADX WARNING: type inference failed for: r4v20 */
    /* JADX WARNING: type inference failed for: r4v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass51R parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.51R r2 = new X.51R     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.<init>()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x01d9
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r1 == r0) goto L_0x01c6
            java.lang.String r1 = r5.A0q()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r5.A1J()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            java.lang.String r0 = "file_path"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r4 = 0
            if (r0 == 0) goto L_0x0043
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r1 == r0) goto L_0x003a
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
        L_0x003a:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A0F = r4     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
        L_0x003f:
            r5.A0z()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x0016
        L_0x0043:
            java.lang.String r0 = "original_file_path"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x005a
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r1 == r0) goto L_0x0057
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
        L_0x0057:
            r2.A0G = r4     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x005a:
            java.lang.String r0 = "cover_thumbnail_path"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x0071
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r1 == r0) goto L_0x006e
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
        L_0x006e:
            r2.A0E = r4     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x0071:
            java.lang.String r0 = "date_taken"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x0080
            long r0 = r5.A0y()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A0A = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x0080:
            java.lang.String r0 = "width"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x008f
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A09 = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x008f:
            java.lang.String r0 = "height"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x009e
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A05 = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x009e:
            java.lang.String r0 = "colorTransfer"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x00ad
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A01 = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x00ad:
            java.lang.String r0 = "orientation"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x00bc
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A07 = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x00bc:
            java.lang.String r0 = "camera_position"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x00d4
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r1 == r0) goto L_0x00d0
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
        L_0x00d0:
            r2.A0D = r4     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x00d4:
            java.lang.String r0 = "camera_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x00e4
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A00 = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x00e4:
            java.lang.String r0 = "origin"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x00f4
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A08 = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x00f4:
            java.lang.String r0 = "duration_ms"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x0104
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A04 = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x0104:
            java.lang.String r0 = "trim_start_time_ms"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x0114
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A03 = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x0114:
            java.lang.String r0 = "trim_end_time_ms"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x0124
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A02 = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x0124:
            java.lang.String r0 = "original_media_folder"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x013c
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r1 == r0) goto L_0x0138
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
        L_0x0138:
            r2.A0H = r4     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x013c:
            java.lang.String r0 = "in_flight_video_calculated_duration_ms"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x014c
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A06 = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x014c:
            java.lang.String r0 = "media_upload_metadata"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x015f
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = X.AnonymousClass3QX.parseFromJson(r5)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            X.0qQ.A0B(r0, r3)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A0B = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x015f:
            java.lang.String r0 = "was_photo"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x016f
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A0K = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x016f:
            java.lang.String r0 = "source_photo_file_path"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x0187
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r1 == r0) goto L_0x0183
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
        L_0x0183:
            r2.A0I = r4     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x0187:
            java.lang.String r0 = "external_media_segment_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x01b2
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r1 != r0) goto L_0x01ae
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r4.<init>()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
        L_0x019c:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r1 == r0) goto L_0x01ae
            X.9JM r0 = X.C39816AAn.parseFromJson(r5)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x019c
            r4.add(r0)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x019c
        L_0x01ae:
            r2.A0J = r4     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x01b2:
            java.lang.String r0 = "is_remix"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            if (r0 == 0) goto L_0x003f
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r2.A0C = r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            goto L_0x003f
        L_0x01c6:
            java.lang.String r0 = r2.A0F     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            java.lang.String r1 = "File path cannot be null in source video"
            if (r0 == 0) goto L_0x01db
            int r1 = r2.A06     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r0 = -1
            if (r1 != r0) goto L_0x01da
            int r1 = r2.A02     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            int r0 = r2.A03     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            int r1 = r1 - r0
            r2.A06 = r1     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            return r2
        L_0x01d9:
            r2 = 0
        L_0x01da:
            return r2
        L_0x01db:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
            throw r0     // Catch:{ IOException -> 0x01e8, Exception -> 0x01e1 }
        L_0x01e1:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x01e8:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51T.parseFromJson(X.16F):X.51R");
    }
}
