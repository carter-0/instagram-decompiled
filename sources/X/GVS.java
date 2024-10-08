package X;

public final class GVS {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List, java.lang.Object] */
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
    public static X.GVR parseFromJson(X.16F r5) {
        /*
            r2 = 0
            X.0qQ.A0B(r5, r2)
            X.GVR r1 = new X.GVR     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1.<init>()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r3 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1 = 0
            return r1
        L_0x0016:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r3 == r0) goto L_0x0192
            java.lang.String r3 = r5.A0q()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r5.A1J()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            java.lang.String r0 = "formatted_media_count"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r4 = 0
            if (r0 == 0) goto L_0x0040
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r3 == r0) goto L_0x003a
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
        L_0x003a:
            r1.A08 = r4     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
        L_0x003c:
            r5.A0z()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x0016
        L_0x0040:
            java.lang.String r0 = "is_music_page_restricted"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x004f
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1.A0E = r0     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x004f:
            java.lang.String r0 = "music_page_restricted_context"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x005e
            X.Jvb r0 = X.HU0.parseFromJson(r5)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1.A03 = r0     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x005e:
            java.lang.String r0 = "spotify_track_metadata"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x006d
            X.N49 r0 = X.HTP.parseFromJson(r5)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1.A02 = r0     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x006d:
            java.lang.String r0 = "audio_page_reporting_id"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x0084
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r3 == r0) goto L_0x0081
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
        L_0x0081:
            r1.A07 = r4     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x0084:
            java.lang.String r0 = "music_canonical_id"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x009b
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r3 == r0) goto L_0x0098
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
        L_0x0098:
            r1.A09 = r4     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x009b:
            java.lang.String r0 = "audio_page_segments"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x00c9
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r3 != r0) goto L_0x00c2
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r4.<init>()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
        L_0x00b0:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r3 == r0) goto L_0x00c2
            X.N4G r0 = X.HTX.parseFromJson(r5)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x00b0
            r4.add(r0)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x00b0
        L_0x00c2:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1.A0B = r4     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x00c9:
            java.lang.String r0 = "audio_ranking_info"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x00d9
            X.1rs r0 = X.C67081rr.parseFromJson(r5)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1.A04 = r0     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x00d9:
            java.lang.String r0 = "metadata"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x00e9
            X.Hm6 r0 = X.C41922B6y.parseFromJson(r5)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1.A05 = r0     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x00e9:
            java.lang.String r0 = "available_tabs"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x011f
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r3 != r0) goto L_0x0118
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r4.<init>()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
        L_0x00fe:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r3 == r0) goto L_0x0118
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r3 == r0) goto L_0x00fe
            java.lang.String r0 = r5.A1P()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x00fe
            r4.add(r0)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x00fe
        L_0x0118:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1.A0C = r4     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x011f:
            java.lang.String r0 = "auto_created_reels_preview_metadata"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x014d
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r3 != r0) goto L_0x0146
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r4.<init>()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
        L_0x0134:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r3 == r0) goto L_0x0146
            X.BH0 r0 = X.C44410CeU.parseFromJson(r5)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x0134
            r4.add(r0)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x0134
        L_0x0146:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1.A0A = r4     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x014d:
            java.lang.String r0 = "media_count"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x015d
            X.Gms r0 = X.C54810HTr.parseFromJson(r5)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1.A00 = r0     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x015d:
            java.lang.String r0 = "music_page_response"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x016d
            X.GVR r0 = parseFromJson(r5)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1.A06 = r0     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x016d:
            java.lang.String r0 = "is_media_preview"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x017d
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1.A0D = r0     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x017d:
            java.lang.String r0 = "social_context"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            if (r0 == 0) goto L_0x018d
            X.JVf r0 = X.C54811HTs.parseFromJson(r5)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            r1.A01 = r0     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x018d:
            X.AnonymousClass93W.A00(r5, r1, r3)     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            goto L_0x003c
        L_0x0192:
            r1.A02()     // Catch:{ IOException -> 0x019c, Exception -> 0x0196 }
            return r1
        L_0x0196:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x019c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GVS.parseFromJson(X.16F):X.GVR");
    }
}
