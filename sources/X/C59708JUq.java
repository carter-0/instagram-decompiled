package X;

/* renamed from: X.JUq  reason: case insensitive filesystem */
public abstract class C59708JUq {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v15, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v23 */
    /* JADX WARNING: type inference failed for: r4v24 */
    /* JADX WARNING: type inference failed for: r4v25 */
    /* JADX WARNING: type inference failed for: r4v26 */
    /* JADX WARNING: type inference failed for: r4v27 */
    /* JADX WARNING: type inference failed for: r4v28 */
    /* JADX WARNING: type inference failed for: r4v29 */
    /* JADX WARNING: type inference failed for: r4v30 */
    /* JADX WARNING: type inference failed for: r4v31 */
    /* JADX WARNING: type inference failed for: r4v32 */
    /* JADX WARNING: type inference failed for: r4v33 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.music.common.model.MusicAssetModel parseFromJson(X.16F r5) {
        /*
            r3 = 0
            X.0qQ.A0B(r5, r3)
            com.instagram.music.common.model.MusicAssetModel r2 = new com.instagram.music.common.model.MusicAssetModel     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.<init>()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2 = 0
            return r2
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 == r0) goto L_0x0231
            java.lang.String r1 = r5.A0q()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r5.A1J()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            java.lang.String r0 = "audio_asset_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r4 = 0
            if (r0 != 0) goto L_0x0221
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 != 0) goto L_0x0221
            java.lang.String r0 = "audio_cluster_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0050
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 == r0) goto L_0x004a
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
        L_0x004a:
            r2.A0B = r4     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
        L_0x004c:
            r5.A0z()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x0016
        L_0x0050:
            java.lang.String r0 = "progressive_download_url"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0067
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 == r0) goto L_0x0064
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
        L_0x0064:
            r2.A0H = r4     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0067:
            java.lang.String r0 = "dash_manifest"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x007e
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 == r0) goto L_0x007b
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
        L_0x007b:
            r2.A0C = r4     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x007e:
            java.lang.String r0 = "highlight_start_times_in_ms"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x00ac
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 != r0) goto L_0x00a9
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r4.<init>()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
        L_0x0093:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 == r0) goto L_0x00a9
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0093
            r4.add(r0)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x0093
        L_0x00a9:
            r2.A0J = r4     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x00ac:
            java.lang.String r0 = "title"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x00c3
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 == r0) goto L_0x00c0
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
        L_0x00c0:
            r2.A0I = r4     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x00c3:
            java.lang.String r0 = "ig_artist"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x00d5
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            com.instagram.user.model.User r0 = X.1aC.A00(r5, r3)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A06 = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x00d5:
            java.lang.String r0 = "display_artist"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x00ed
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 == r0) goto L_0x00e9
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
        L_0x00e9:
            r2.A0D = r4     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x00ed:
            java.lang.String r0 = "artist_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0105
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 == r0) goto L_0x0101
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
        L_0x0101:
            r2.A0A = r4     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0105:
            java.lang.String r0 = "cover_artwork_uri"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0115
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.16h.A00(r5)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A02 = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0115:
            java.lang.String r0 = "cover_artwork_thumbnail_uri"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0125
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.16h.A00(r5)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A03 = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0125:
            java.lang.String r0 = "duration_in_ms"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0135
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A00 = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0135:
            java.lang.String r0 = "is_explicit"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0145
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A0S = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0145:
            java.lang.String r0 = "is_eligible_for_audio_effects"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0155
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A0Q = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0155:
            java.lang.String r0 = "is_eligible_for_vinyl_sticker"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0165
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A0R = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0165:
            java.lang.String r0 = "has_lyrics"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0175
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A0O = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0175:
            java.lang.String r0 = "is_original_sound"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0185
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A0U = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0185:
            java.lang.String r0 = "allows_saving"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0195
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A0L = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0195:
            java.lang.String r0 = "original_sound_media_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x01ad
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 == r0) goto L_0x01a9
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
        L_0x01a9:
            r2.A0G = r4     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x01ad:
            java.lang.String r0 = "alacorn_session_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x01c5
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 == r0) goto L_0x01c1
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
        L_0x01c1:
            r2.A09 = r4     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x01c5:
            java.lang.String r0 = "is_bookmarked"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x01d5
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A0P = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x01d5:
            java.lang.String r0 = "can_remix_be_shared_to_fb"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x01e5
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A0M = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x01e5:
            java.lang.String r0 = "can_remix_be_shared_to_fb_expansion"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x01f5
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A0N = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x01f5:
            java.lang.String r0 = "is_local_audio"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x0205
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            r2.A0T = r0     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0205:
            r0 = 48
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r0 == 0) goto L_0x004c
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 == r0) goto L_0x021d
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
        L_0x021d:
            r2.A0F = r4     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0221:
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            if (r1 == r0) goto L_0x022d
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
        L_0x022d:
            r2.A0E = r4     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            goto L_0x004c
        L_0x0231:
            com.instagram.music.common.model.MusicAssetModel.A04(r2)     // Catch:{ IOException -> 0x023b, Exception -> 0x0235 }
            return r2
        L_0x0235:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x023b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59708JUq.parseFromJson(X.16F):com.instagram.music.common.model.MusicAssetModel");
    }
}
