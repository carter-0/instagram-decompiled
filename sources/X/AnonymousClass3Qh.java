package X;

/* renamed from: X.3Qh  reason: invalid class name */
public abstract class AnonymousClass3Qh {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3QP parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            X.3QP r2 = new X.3QP     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            r2.<init>()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            r2 = 0
            return r2
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r1 == r0) goto L_0x00cf
            java.lang.String r1 = r5.A0q()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            r5.A1J()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            java.lang.String r0 = "video_frame_List"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            r4 = 0
            if (r0 == 0) goto L_0x0053
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r1 != r0) goto L_0x004d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            r4.<init>()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
        L_0x003b:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r1 == r0) goto L_0x004d
            X.JtF r0 = X.C63372Kvt.parseFromJson(r5)     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r0 == 0) goto L_0x003b
            r4.add(r0)     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            goto L_0x003b
        L_0x004d:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            r2.A06 = r4     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            goto L_0x0069
        L_0x0053:
            java.lang.String r0 = "compare_video_path"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r0 == 0) goto L_0x006d
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r1 == r0) goto L_0x0067
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
        L_0x0067:
            r2.A04 = r4     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
        L_0x0069:
            r5.A0z()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            goto L_0x0016
        L_0x006d:
            java.lang.String r0 = "frame_width"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r0 == 0) goto L_0x007c
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            r2.A02 = r0     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            goto L_0x0069
        L_0x007c:
            java.lang.String r0 = "frame_height"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r0 == 0) goto L_0x008b
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            r2.A01 = r0     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            goto L_0x0069
        L_0x008b:
            java.lang.String r0 = "render_block_time_ms"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r0 == 0) goto L_0x009a
            long r0 = r5.A0y()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            r2.A03 = r0     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            goto L_0x0069
        L_0x009a:
            java.lang.String r0 = "ssim_disabled"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            r2.A07 = r0     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            goto L_0x0069
        L_0x00a9:
            java.lang.String r0 = "uumos_cs"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r0 == 0) goto L_0x00b8
            double r0 = r5.A0U()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            r2.A00 = r0     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            goto L_0x0069
        L_0x00b8:
            java.lang.String r0 = "target_video_codec"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r0 == 0) goto L_0x0069
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            if (r1 == r0) goto L_0x00cc
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
        L_0x00cc:
            r2.A05 = r4     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            goto L_0x0069
        L_0x00cf:
            java.util.List r0 = r2.A06     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            r2.A06 = r0     // Catch:{ IOException -> 0x00e2, Exception -> 0x00db }
            return r2
        L_0x00db:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00e2:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Qh.parseFromJson(X.16F):X.3QP");
    }
}
