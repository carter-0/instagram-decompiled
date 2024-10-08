package X;

import java.util.List;

/* renamed from: X.3RJ  reason: invalid class name */
public abstract class AnonymousClass3RJ {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass3QS parseFromJson(X.16F r6) {
        /*
            r3 = 0
            X.0qQ.A0B(r6, r3)
            X.3QS r0 = new X.3QS     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            r0.<init>()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            if (r2 == r1) goto L_0x0016
            r6.A0z()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            goto L_0x009e
        L_0x0016:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            if (r2 == r1) goto L_0x009f
            java.lang.String r2 = r6.A0q()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            r6.A1J()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            java.lang.String r1 = "video_volume"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            if (r1 == 0) goto L_0x0038
            double r4 = r6.A0U()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            float r1 = (float) r4     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            r0.A00 = r1     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
        L_0x0034:
            r6.A0z()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            goto L_0x0016
        L_0x0038:
            java.lang.String r1 = "media_audio_overlays"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            r4 = 0
            if (r1 == 0) goto L_0x0066
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            if (r2 != r1) goto L_0x0060
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            r4.<init>()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
        L_0x004e:
            X.16L r2 = r6.A1J()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            if (r2 == r1) goto L_0x0060
            X.51I r1 = X.AnonymousClass51H.parseFromJson(r6)     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            if (r1 == 0) goto L_0x004e
            r4.add(r1)     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            goto L_0x004e
        L_0x0060:
            X.0qQ.A0B(r4, r3)     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            r0.A03 = r4     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            goto L_0x0034
        L_0x0066:
            java.lang.String r1 = "audio_mix_burned_in"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            if (r1 == 0) goto L_0x0075
            boolean r1 = r6.A0d()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            r0.A04 = r1     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            goto L_0x0034
        L_0x0075:
            java.lang.String r1 = "original_audio_title"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            if (r1 == 0) goto L_0x008c
            X.16L r2 = r6.A11()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            if (r2 == r1) goto L_0x0089
            java.lang.String r4 = r6.A1P()     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
        L_0x0089:
            r0.A02 = r4     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            goto L_0x0034
        L_0x008c:
            java.lang.String r1 = "metadata"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            if (r1 == 0) goto L_0x0034
            X.9IV r1 = X.AnonymousClass3RM.parseFromJson(r6)     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            X.0qQ.A0B(r1, r3)     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            r0.A01 = r1     // Catch:{ IOException -> 0x00a7, Exception -> 0x00a0 }
            goto L_0x0034
        L_0x009e:
            r0 = 0
        L_0x009f:
            return r0
        L_0x00a0:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3RJ.parseFromJson(X.16F):X.3QS");
    }

    public static void A00(17Z r4, AnonymousClass3QS r5) {
        r4.A0c();
        r4.A0O("video_volume", r5.A00);
        16P.A03(r4, "media_audio_overlays");
        for (AnonymousClass51I r0 : r5.A03) {
            if (r0 != null) {
                AnonymousClass51H.A00(r4, r0);
            }
        }
        r4.A0Y();
        r4.A0S("audio_mix_burned_in", r5.A04);
        String str = r5.A02;
        if (str != null) {
            r4.A0R("original_audio_title", str);
        }
        r4.A0q("metadata");
        AnonymousClass9IV r2 = r5.A01;
        r4.A0c();
        C357588Yu r02 = (C357588Yu) r2.A01;
        if (r02 != null) {
            r4.A0R("voice_effect", r02.name());
        }
        if (r2.A00 != null) {
            16P.A03(r4, "sound_effects");
            for (C381699cB r22 : (List) r2.A00) {
                if (r22 != null) {
                    r4.A0c();
                    String str2 = r22.A04;
                    if (str2 != null) {
                        r4.A0R(AnonymousClass000.A00(3043), str2);
                    }
                    r4.A0P("duration_ms", r22.A00);
                    String str3 = r22.A02;
                    if (str3 != null) {
                        r4.A0R("audio_asset_id", str3);
                    }
                    String str4 = r22.A03;
                    if (str4 != null) {
                        r4.A0R("audio_cluster_id", str4);
                    }
                    r4.A0Q("start_time_ms", r22.A01);
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        r4.A0Z();
        r4.A0Z();
    }
}
