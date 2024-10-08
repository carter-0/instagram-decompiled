package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;

/* renamed from: X.8vu  reason: invalid class name and case insensitive filesystem */
public abstract class C370148vu {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C366688pV parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.8pV r0 = new X.8pV     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r0.<init>()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r2 == r1) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x0111
        L_0x0016:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r2 == r1) goto L_0x0112
            java.lang.String r2 = r4.A0q()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r4.A1J()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            java.lang.String r1 = "free_transform_edits"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r3 = 1
            if (r1 == 0) goto L_0x0038
            X.8vx r2 = X.C370168vw.parseFromJson(r4)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r2 != 0) goto L_0x0105
            r3 = 0
            r2 = 0
            goto L_0x0105
        L_0x0038:
            java.lang.String r1 = "audio_state_edits"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r1 == 0) goto L_0x0048
            X.8vz r1 = X.C370188vy.parseFromJson(r4)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r0.A02 = r1     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x010c
        L_0x0048:
            java.lang.String r1 = "video_filter_setting"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r1 == 0) goto L_0x0058
            X.3QG r1 = X.AnonymousClass3QV.parseFromJson(r4)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r0.A08 = r1     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x010c
        L_0x0058:
            java.lang.String r1 = "is_audio_muted"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r1 == 0) goto L_0x0068
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r0.A0B = r1     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x010c
        L_0x0068:
            java.lang.String r1 = "post_capture_ar_effectId"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r3 = 0
            if (r1 == 0) goto L_0x0081
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r2 == r1) goto L_0x007d
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
        L_0x007d:
            r0.A09 = r3     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x010c
        L_0x0081:
            java.lang.String r1 = "post_capture_ar_effect"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r1 == 0) goto L_0x0090
            com.instagram.camera.effect.models.CameraAREffect r1 = X.AnonymousClass515.parseFromJson(r4)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r0.A00 = r1     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x010c
        L_0x0090:
            java.lang.String r1 = "visual_info"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r1 == 0) goto L_0x009f
            X.8PW r1 = X.C370208w0.parseFromJson(r4)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r0.A05 = r1     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x010c
        L_0x009f:
            java.lang.String r1 = "transform_matrix_configs"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r1 == 0) goto L_0x00c9
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r2 != r1) goto L_0x00c6
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r3.<init>()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
        L_0x00b4:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r2 == r1) goto L_0x00c6
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r1 = X.C266614a0.parseFromJson(r4)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r1 == 0) goto L_0x00b4
            r3.add(r1)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x00b4
        L_0x00c6:
            r0.A0A = r3     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x010c
        L_0x00c9:
            java.lang.String r1 = "transform_matrix_config"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r1 == 0) goto L_0x00d8
            com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig r1 = X.C266614a0.parseFromJson(r4)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r0.A01 = r1     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x010c
        L_0x00d8:
            java.lang.String r1 = "render_dynamic_drawables_first"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r1 == 0) goto L_0x00e7
            boolean r1 = r4.A0d()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r0.A0C = r1     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x010c
        L_0x00e7:
            java.lang.String r1 = "media_audio_overlay_info"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r1 == 0) goto L_0x00f6
            X.3QS r1 = X.AnonymousClass3RJ.parseFromJson(r4)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r0.A07 = r1     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x010c
        L_0x00f6:
            java.lang.String r1 = "clips_voiceover_edits"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            if (r1 == 0) goto L_0x010c
            X.8vv r1 = X.C370228w2.parseFromJson(r4)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r0.A03 = r1     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x010c
        L_0x0105:
            X.8pT r1 = new X.8pT     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r1.<init>(r3, r2)     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            r0.A04 = r1     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
        L_0x010c:
            r4.A0z()     // Catch:{ IOException -> 0x011a, Exception -> 0x0113 }
            goto L_0x0016
        L_0x0111:
            r0 = 0
        L_0x0112:
            return r0
        L_0x0113:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x011a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370148vu.parseFromJson(X.16F):X.8pV");
    }

    public static void A00(17Z r5, C366688pV r6) {
        r5.A0c();
        C366668pT r0 = r6.A04;
        if (r0 != null) {
            C369448um.A00(r5, r0);
        }
        if (r6.A02 != null) {
            r5.A0q("audio_state_edits");
            C370198vz r2 = r6.A02;
            r5.A0c();
            r5.A0S("is_video", r2.A04);
            r5.A0S("is_video_muted", r2.A05);
            r5.A0S("did_user_mute_audio", r2.A00);
            r5.A0S("has_music_sticker", r2.A02);
            r5.A0S("is_music_burned_into_video", r2.A03);
            r5.A0S("force_play_video_audio", r2.A01);
            r5.A0Z();
        }
        if (r6.A08 != null) {
            r5.A0q("video_filter_setting");
            AnonymousClass3QV.A00(r5, r6.A08);
        }
        r5.A0S("is_audio_muted", r6.A0B);
        String str = r6.A09;
        if (str != null) {
            r5.A0R("post_capture_ar_effectId", str);
        }
        if (r6.A00 != null) {
            r5.A0q("post_capture_ar_effect");
            AnonymousClass515.A00(r5, r6.A00);
        }
        if (r6.A05 != null) {
            r5.A0q("visual_info");
            C370208w0.A00(r5, r6.A05);
        }
        if (r6.A0A != null) {
            16P.A03(r5, "transform_matrix_configs");
            for (TransformMatrixConfig transformMatrixConfig : r6.A0A) {
                if (transformMatrixConfig != null) {
                    C266614a0.A00(r5, transformMatrixConfig);
                }
            }
            r5.A0Y();
        }
        if (r6.A01 != null) {
            r5.A0q("transform_matrix_config");
            C266614a0.A00(r5, r6.A01);
        }
        r5.A0S("render_dynamic_drawables_first", r6.A0C);
        if (r6.A07 != null) {
            r5.A0q("media_audio_overlay_info");
            AnonymousClass3RJ.A00(r5, r6.A07);
        }
        if (r6.A03 != null) {
            r5.A0q("clips_voiceover_edits");
            C370158vv r22 = r6.A03;
            r5.A0c();
            if (r22.A05 != null) {
                16P.A03(r5, "clips_voiceover_segments");
                for (M1Y m1y : r22.A05) {
                    if (m1y != null) {
                        r5.A0c();
                        r5.A0P("start_time_ms", m1y.A01);
                        r5.A0P("end_time_ms", m1y.A00);
                        String str2 = m1y.A06;
                        if (str2 != null) {
                            r5.A0R("file_path", str2);
                        }
                        r5.A0P(C273654mx.A00(IgNetworkConsentStorage.MAX_ENTRIES), m1y.A03);
                        r5.A0P("trimmed_end_time_ms", m1y.A02);
                        if (m1y.A07 != null) {
                            16P.A03(r5, "waveform");
                            for (Number number : m1y.A07) {
                                if (number != null) {
                                    r5.A0f(number.floatValue());
                                }
                            }
                            r5.A0Y();
                        }
                        r5.A0P(AnonymousClass000.A00(4016), m1y.A05);
                        r5.A0S("is_recording_segment", m1y.A08);
                        r5.A0P(AnonymousClass000.A00(367), m1y.A04);
                        r5.A0Z();
                    }
                }
                r5.A0Y();
            }
            r5.A0O("video_volume", r22.A03);
            r5.A0O("audio_overlay_volume", r22.A00);
            r5.A0O("voiceover_volume", r22.A04);
            r5.A0O("sound_effects_volume", r22.A01);
            r5.A0O("sticker_volume", r22.A02);
            r5.A0Z();
        }
        r5.A0Z();
    }
}
