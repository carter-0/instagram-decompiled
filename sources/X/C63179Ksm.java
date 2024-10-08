package X;

/* renamed from: X.Ksm  reason: case insensitive filesystem */
public abstract class C63179Ksm {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v190, resolved type: X.3QO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v201, resolved type: X.JYL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v213, resolved type: X.50r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C293505kq parseFromJson(X.16F r132) {
        /*
            r2 = r132
            r48 = 0
            r0 = r48
            X.0qQ.A0B(r2, r0)
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            r58 = 0
            if (r1 == r0) goto L_0x0017
            r2.A0z()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            return r58
        L_0x0017:
            r20 = r58
            r85 = r58
            r19 = r58
            r73 = r58
            r72 = r58
            r16 = r58
            r86 = r58
            r87 = r58
            r69 = r58
            r44 = r58
            r18 = r58
            r17 = r58
            r68 = r58
            r79 = r58
            r80 = r58
            r71 = r58
            r88 = r58
            r89 = r58
            r63 = r58
            r90 = r58
            r43 = r58
            r81 = r58
            r31 = r58
            r78 = r58
            r42 = r58
            r91 = r58
            r41 = r58
            r92 = r58
            r93 = r58
            r40 = r58
            r39 = r58
            r65 = r58
            r38 = r58
            r37 = r58
            r83 = r58
            r94 = r58
            r67 = r58
            r70 = r58
            r61 = r58
            r66 = r58
            r36 = r58
            r21 = r58
            r22 = r58
            r95 = r58
            r96 = r58
            r84 = r58
            r97 = r58
            r76 = r58
            r23 = r58
            r24 = r58
            r25 = r58
            r26 = r58
            r27 = r58
            r35 = r58
            r98 = r58
            r28 = r58
            r29 = r58
            r30 = r58
            r32 = r58
            r99 = r58
            r100 = r58
            r101 = r58
            r34 = r58
            r75 = r58
            r60 = r58
            r59 = r58
            r62 = r58
            r33 = r58
            r64 = r58
            r45 = r58
            r46 = r58
            r47 = r58
        L_0x00a7:
            X.16L r13 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r12 = X.16L.A09     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            r0 = 671(0x29f, float:9.4E-43)
            java.lang.String r49 = X.C273654mx.A00(r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            java.lang.String r57 = "hide_from_profile_grid"
            java.lang.String r56 = "created_at_time"
            java.lang.String r55 = "max_duration_in_ms"
            java.lang.String r54 = "is_gifting_enabled"
            java.lang.String r53 = "is_share_count_disabled"
            java.lang.String r52 = "is_like_and_view_counts_disabled"
            java.lang.String r3 = "is_caption_disabled"
            java.lang.String r51 = "is_comment_disabled"
            java.lang.String r50 = "is_vcr_sticker_added"
            java.lang.String r15 = "is_draft_for_posted_clip"
            java.lang.String r14 = "template_disabled"
            java.lang.String r11 = "media_type"
            java.lang.String r10 = "unschematized_compositions"
            java.lang.String r9 = "is_share_to_feed"
            java.lang.String r8 = "clips_creation_type"
            java.lang.String r7 = "draft_save_metadata"
            java.lang.String r6 = "draft_save_state"
            java.lang.String r5 = "video_segments"
            r4 = 10
            r1 = 18
            r0 = r48
            java.lang.String r4 = X.C39829ABa.A00(r0, r4, r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            java.lang.String r0 = "ClipsDraft"
            if (r13 == r12) goto L_0x0784
            java.lang.String r1 = X.AnonymousClass7TE.A17(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r0 = r4.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x00ff
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x00fa
            r85 = 0
            goto L_0x0166
        L_0x00fa:
            java.lang.String r85 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x00ff:
            boolean r0 = r5.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0128
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x0125
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x0111:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == r0) goto L_0x0166
            X.51M r1 = X.AnonymousClass51L.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x0111
            r0 = r19
            r0.add(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0111
        L_0x0125:
            r19 = 0
            goto L_0x0166
        L_0x0128:
            boolean r0 = r6.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x015c
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x0138
            r1 = 0
            goto L_0x013c
        L_0x0138:
            java.lang.String r1 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x013c:
            kotlin.enums.EnumEntries r0 = X.JXu.A00     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            r0 = r48
            X.0qQ.A0B(r1, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.JXu[] r3 = X.JXu.values()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            int r5 = r3.length     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x0148:
            if (r0 >= r5) goto L_0x0159
            r73 = r3[r0]     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            java.lang.String r4 = r73.toString()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r4 = X.0qQ.A0K(r4, r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r4 != 0) goto L_0x0166
            int r0 = r0 + 1
            goto L_0x0148
        L_0x0159:
            r73 = 0
            goto L_0x0166
        L_0x015c:
            boolean r0 = r7.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x016b
            X.L6N r72 = X.C63180Ksn.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x0166:
            r2.A0z()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x00a7
        L_0x016b:
            boolean r0 = r8.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0190
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x017b
            r0 = 0
            goto L_0x017f
        L_0x017b:
            java.lang.String r0 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x017f:
            java.util.Map r1 = X.C2801950r.A01     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            java.lang.Object r16 = r1.get(r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            r0 = r16
            X.50r r0 = (X.C2801950r) r0     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            r16 = r0
            if (r0 != 0) goto L_0x0166
            X.50r r16 = X.C2801950r.CLIPS     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0190:
            java.lang.String r0 = "caption"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x01a8
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x01a3
            r86 = 0
            goto L_0x0166
        L_0x01a3:
            java.lang.String r86 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x01a8:
            boolean r0 = r9.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x01b3
            java.lang.Boolean r58 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x01b3:
            r0 = 1673(0x689, float:2.344E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x01cf
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x01ca
            r87 = 0
            goto L_0x0166
        L_0x01ca:
            java.lang.String r87 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x01cf:
            java.lang.String r0 = "post_capture_edits"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x01dc
            X.8vh r69 = X.C370008vg.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x01dc:
            java.lang.String r0 = "sticker_list"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0208
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x0204
            java.util.ArrayList r44 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x01f0:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == r0) goto L_0x0166
            X.X5I r1 = X.W3F.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x01f0
            r0 = r44
            r0.add(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x01f0
        L_0x0204:
            r44 = 0
            goto L_0x0166
        L_0x0208:
            boolean r0 = r10.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0232
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x022e
            java.util.ArrayList r18 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x021a:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == r0) goto L_0x0166
            X.Jv8 r1 = X.C59706JUo.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x021a
            r0 = r18
            r0.add(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x021a
        L_0x022e:
            r18 = 0
            goto L_0x0166
        L_0x0232:
            boolean r0 = r11.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x024a
            int r1 = r2.A1D()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            java.util.Map r0 = X.JYL.A01     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            java.lang.Object r17 = X.C51968G9o.A10(r0, r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            r0 = r17
            X.JYL r0 = (X.JYL) r0     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            r17 = r0
            goto L_0x0166
        L_0x024a:
            java.lang.String r0 = "logging_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0258
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r68 = X.C63999LHz.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0258:
            java.lang.String r0 = "audio_overlay_track"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0266
            com.instagram.music.common.model.AudioOverlayTrack r79 = X.C59707JUp.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0266:
            java.lang.String r0 = "attribution_only_audio_overlay_track"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0274
            com.instagram.music.common.model.AudioOverlayTrack r80 = X.C59707JUp.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0274:
            java.lang.String r0 = "remix_model"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0282
            X.9P8 r71 = X.AnonymousClass9P7.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0282:
            java.lang.String r0 = "original_destination_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x029c
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x0296
            r88 = 0
            goto L_0x0166
        L_0x0296:
            java.lang.String r88 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x029c:
            java.lang.String r0 = "cover_photo_path"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x02b6
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x02b0
            r89 = 0
            goto L_0x0166
        L_0x02b0:
            java.lang.String r89 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x02b6:
            java.lang.String r0 = "crop_coordinates"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x02c4
            com.instagram.api.schemas.MediaCroppingCoordinates r63 = X.1qm.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x02c4:
            java.lang.String r0 = "funded_content_deal_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x02de
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x02d8
            r90 = 0
            goto L_0x0166
        L_0x02d8:
            java.lang.String r90 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x02de:
            java.lang.String r0 = "people_tags"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x030a
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x0306
            java.util.ArrayList r43 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x02f2:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == r0) goto L_0x0166
            com.instagram.model.people.PeopleTag r1 = X.LJJ.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x02f2
            r0 = r43
            r0.add(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x02f2
        L_0x0306:
            r43 = 0
            goto L_0x0166
        L_0x030a:
            java.lang.String r0 = "comment_poll"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0318
            X.4jy r81 = X.C271984ju.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0318:
            java.lang.String r0 = "audience"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x033c
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x032a
            r0 = 0
            goto L_0x032e
        L_0x032a:
            java.lang.String r0 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x032e:
            java.util.Map r1 = X.AnonymousClass3QO.A01     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            java.lang.Object r31 = r1.get(r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            r0 = r31
            X.3QO r0 = (X.AnonymousClass3QO) r0     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            r31 = r0
            goto L_0x0166
        L_0x033c:
            java.lang.String r0 = "location"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x034a
            com.instagram.model.venue.LocationDict r78 = X.AnonymousClass41Q.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x034a:
            java.lang.String r0 = "interest_topics"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0370
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x036c
            java.util.ArrayList r42 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x035e:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == r0) goto L_0x0166
            r0 = r42
            X.AnonymousClass7TG.A1F(r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x035e
        L_0x036c:
            r42 = 0
            goto L_0x0166
        L_0x0370:
            java.lang.String r0 = "collaborator_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x038a
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x0384
            r91 = 0
            goto L_0x0166
        L_0x0384:
            java.lang.String r91 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x038a:
            java.lang.String r0 = "collaborator_ids"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x03b0
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x03ac
            java.util.ArrayList r41 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x039e:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == r0) goto L_0x0166
            r0 = r41
            X.AnonymousClass7TG.A1F(r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x039e
        L_0x03ac:
            r41 = 0
            goto L_0x0166
        L_0x03b0:
            java.lang.String r0 = "entry_point"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x03ca
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x03c4
            r92 = 0
            goto L_0x0166
        L_0x03c4:
            java.lang.String r92 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x03ca:
            java.lang.String r0 = "original_audio_title"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x03e4
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x03de
            r93 = 0
            goto L_0x0166
        L_0x03de:
            java.lang.String r93 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x03e4:
            java.lang.String r0 = "multiple_audio_tracks"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0410
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x040c
            java.util.ArrayList r40 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x03f8:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == r0) goto L_0x0166
            com.instagram.music.common.model.AudioOverlayTrack r1 = X.C59707JUp.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x03f8
            r0 = r40
            r0.add(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x03f8
        L_0x040c:
            r40 = 0
            goto L_0x0166
        L_0x0410:
            java.lang.String r0 = "clips_sound_effects"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x043c
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x0438
            java.util.ArrayList r39 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x0424:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == r0) goto L_0x0166
            X.9c8 r1 = X.C39811AAi.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x0424
            r0 = r39
            r0.add(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0424
        L_0x0438:
            r39 = 0
            goto L_0x0166
        L_0x043c:
            java.lang.String r0 = "clips_template_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x044a
            X.4ys r65 = X.C67211sN.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x044a:
            boolean r0 = r14.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0456
            java.lang.Boolean r20 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0456:
            java.lang.String r0 = "clips_multiple_audio_segments"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x047c
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x0478
            java.util.ArrayList r38 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x046a:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == r0) goto L_0x0166
            r0 = r38
            X.AnonymousClass7TG.A1F(r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x046a
        L_0x0478:
            r38 = 0
            goto L_0x0166
        L_0x047c:
            java.lang.String r0 = "audio_effects"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x04a8
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x04a4
            java.util.ArrayList r37 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x0490:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == r0) goto L_0x0166
            X.55O r1 = X.AnonymousClass55N.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x0490
            r0 = r37
            r0.add(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0490
        L_0x04a4:
            r37 = 0
            goto L_0x0166
        L_0x04a8:
            java.lang.String r0 = "upcoming_event"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x04b6
            com.instagram.user.model.UpcomingEventImpl r83 = X.C45712D2l.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x04b6:
            java.lang.String r0 = "media_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x04d0
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x04ca
            r94 = 0
            goto L_0x0166
        L_0x04ca:
            java.lang.String r94 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x04d0:
            java.lang.String r0 = "video_crop_info"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x04de
            com.instagram.creation.base.CropInfo r67 = X.AnonymousClass9SO.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x04de:
            java.lang.String r0 = "branded_content_tags_model"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x04ec
            X.L7w r70 = X.LID.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x04ec:
            java.lang.String r0 = "clips_shopping_metadata"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x04fa
            X.Jw0 r61 = X.C45890D9t.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x04fa:
            java.lang.String r0 = "facebook_cross_posting_model"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0508
            X.LFS r66 = X.C63107Kra.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0508:
            java.lang.String r0 = "target_profiles"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0534
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x0530
            java.util.ArrayList r36 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x051c:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == r0) goto L_0x0166
            com.instagram.pendingmedia.model.recipients.PendingRecipient r1 = X.C330927Ou.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x051c
            r0 = r36
            r0.add(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x051c
        L_0x0530:
            r36 = 0
            goto L_0x0166
        L_0x0534:
            boolean r0 = r15.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0540
            java.lang.Boolean r21 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0540:
            r0 = r50
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x054e
            java.lang.Boolean r22 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x054e:
            java.lang.String r0 = "linked_highlight_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0568
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x0562
            r95 = 0
            goto L_0x0166
        L_0x0562:
            java.lang.String r95 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0568:
            java.lang.String r0 = "highlight_media_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0582
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x057c
            r96 = 0
            goto L_0x0166
        L_0x057c:
            java.lang.String r96 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0582:
            java.lang.String r0 = "existing_fundraiser_to_attach"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0590
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r84 = X.LKQ.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0590:
            java.lang.String r0 = "fundraiser_user_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x05aa
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x05a4
            r97 = 0
            goto L_0x0166
        L_0x05a4:
            java.lang.String r97 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x05aa:
            java.lang.String r0 = "new_fundraiser_model"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x05b8
            com.instagram.model.fundraiser.NewFundraiserInfo r76 = X.C64130LPe.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x05b8:
            r0 = r51
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x05c6
            java.lang.Boolean r23 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x05c6:
            boolean r0 = r3.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x05d2
            java.lang.Boolean r24 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x05d2:
            r0 = r52
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x05e0
            java.lang.Boolean r25 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x05e0:
            r0 = r53
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x05ee
            java.lang.Boolean r26 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x05ee:
            r0 = r54
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x05fc
            java.lang.Boolean r27 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x05fc:
            java.lang.String r0 = "stacked_timeline_actions"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0628
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x0624
            java.util.ArrayList r35 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x0610:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == r0) goto L_0x0166
            X.JvF r1 = X.LIP.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x0610
            r0 = r35
            r0.add(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0610
        L_0x0624:
            r35 = 0
            goto L_0x0166
        L_0x0628:
            java.lang.String r0 = "org_cta_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0642
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x063c
            r98 = 0
            goto L_0x0166
        L_0x063c:
            java.lang.String r98 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0642:
            r0 = r55
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0650
            java.lang.Integer r28 = X.AnonymousClass7TF.A0X(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0650:
            r0 = r56
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x065e
            java.lang.Long r29 = X.AnonymousClass7TF.A0Z(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x065e:
            r0 = r57
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x066c
            java.lang.Boolean r30 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x066c:
            r0 = r49
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x067a
            java.lang.Boolean r32 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x067a:
            java.lang.String r0 = "meta_verified_added_link"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0694
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x068e
            r99 = 0
            goto L_0x0166
        L_0x068e:
            java.lang.String r99 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0694:
            java.lang.String r0 = "metagallery_media_id"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x06ae
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x06a8
            r100 = 0
            goto L_0x0166
        L_0x06a8:
            java.lang.String r100 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x06ae:
            java.lang.String r0 = "name"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x06c8
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x06c2
            r101 = 0
            goto L_0x0166
        L_0x06c2:
            java.lang.String r101 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x06c8:
            java.lang.String r0 = "clips_spin_swappable_text_list"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x06f4
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x06f0
            java.util.ArrayList r34 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x06dc:
            X.16L r1 = r2.A1J()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == r0) goto L_0x0166
            X.BEE r1 = X.C45524Cxy.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x06dc
            r0 = r34
            r0.add(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x06dc
        L_0x06f0:
            r34 = 0
            goto L_0x0166
        L_0x06f4:
            java.lang.String r0 = "bio_product"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0702
            X.Juw r75 = X.LPS.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0702:
            r0 = 2674(0xa72, float:3.747E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0714
            X.Jw4 r60 = X.LHn.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0714:
            java.lang.String r0 = "trial_params"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0722
            X.JwI r59 = X.C45664D0o.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0722:
            java.lang.String r0 = "content_scheduling_metadata"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0730
            X.JxB r62 = X.C63980LGx.parseFromJson(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0730:
            java.lang.String r0 = "has_comment_prompt"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x073e
            java.lang.Boolean r33 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x073e:
            java.lang.String r0 = "gen_ai_detection_method"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x075a
            X.16L r1 = r2.A11()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 != r0) goto L_0x0750
            r0 = 0
            goto L_0x0754
        L_0x0750:
            java.lang.String r0 = r2.A1P()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x0754:
            com.instagram.api.schemas.MediaGenAIDetectionMethod r64 = X.C252913pu.A00(r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x075a:
            java.lang.String r0 = "is_pinned"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0768
            java.lang.Boolean r45 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0768:
            java.lang.String r0 = "is_closed_captions_toggle_enabled"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0776
            java.lang.Boolean r46 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0776:
            java.lang.String r0 = "third_party_downloads_enabled"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r0 == 0) goto L_0x0166
            java.lang.Boolean r47 = X.AnonymousClass7TF.A0S(r2)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x0166
        L_0x0784:
            if (r85 != 0) goto L_0x078f
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x078f
            X.AnonymousClass7TF.A1L(r4, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x078f:
            if (r19 != 0) goto L_0x0793
            goto L_0x089e
        L_0x0793:
            if (r73 != 0) goto L_0x079e
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x079e
            X.AnonymousClass7TF.A1L(r6, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x079e:
            if (r72 != 0) goto L_0x07a9
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x07a9
            X.AnonymousClass7TF.A1L(r7, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x07a9:
            if (r16 != 0) goto L_0x07b4
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x07b4
            X.AnonymousClass7TF.A1L(r8, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x07b4:
            if (r58 != 0) goto L_0x07bf
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x07bf
            X.AnonymousClass7TF.A1L(r9, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x07bf:
            if (r18 != 0) goto L_0x07ca
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x07ca
            X.AnonymousClass7TF.A1L(r10, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x07ca:
            if (r17 != 0) goto L_0x07d5
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x07d5
            X.AnonymousClass7TF.A1L(r11, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x07d5:
            if (r20 != 0) goto L_0x07e0
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x07e0
            X.AnonymousClass7TF.A1L(r14, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x07e0:
            if (r21 != 0) goto L_0x07eb
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x07eb
            X.AnonymousClass7TF.A1L(r15, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x07eb:
            if (r22 != 0) goto L_0x07f8
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x07f8
            r1 = r50
            X.AnonymousClass7TF.A1L(r1, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x07f8:
            if (r23 != 0) goto L_0x0805
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x0805
            r1 = r51
            X.AnonymousClass7TF.A1L(r1, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x0805:
            if (r24 != 0) goto L_0x0811
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x0811
            X.0c9 r2 = (X.0c9) r2     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.0LH r1 = r2.A03     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x089a
        L_0x0811:
            if (r25 != 0) goto L_0x081e
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x081e
            r1 = r52
            X.AnonymousClass7TF.A1L(r1, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x081e:
            if (r26 != 0) goto L_0x082a
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x082a
            r1 = r53
            X.AnonymousClass7TF.A1L(r1, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x082a:
            if (r27 != 0) goto L_0x0836
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x0836
            r1 = r54
            X.AnonymousClass7TF.A1L(r1, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x0836:
            if (r28 != 0) goto L_0x0842
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x0842
            r1 = r55
            X.AnonymousClass7TF.A1L(r1, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x0842:
            if (r29 != 0) goto L_0x084e
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x084e
            r1 = r56
            X.AnonymousClass7TF.A1L(r1, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x084e:
            if (r30 != 0) goto L_0x085a
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x085a
            r1 = r57
            X.AnonymousClass7TF.A1L(r1, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x085a:
            if (r32 != 0) goto L_0x0866
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x0866
            r1 = r49
            X.AnonymousClass7TF.A1L(r1, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x0866:
            if (r33 != 0) goto L_0x0869
            goto L_0x0890
        L_0x0869:
            if (r45 != 0) goto L_0x0876
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x0876
            X.0c9 r2 = (X.0c9) r2     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.0LH r1 = r2.A03     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            java.lang.String r3 = "is_pinned"
            goto L_0x089a
        L_0x0876:
            if (r46 != 0) goto L_0x0883
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x0883
            X.0c9 r2 = (X.0c9) r2     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.0LH r1 = r2.A03     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            java.lang.String r3 = "is_closed_captions_toggle_enabled"
            goto L_0x089a
        L_0x0883:
            if (r47 != 0) goto L_0x08aa
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x08aa
            X.0c9 r2 = (X.0c9) r2     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.0LH r1 = r2.A03     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            java.lang.String r3 = "third_party_downloads_enabled"
            goto L_0x089a
        L_0x0890:
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x0869
            X.0c9 r2 = (X.0c9) r2     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.0LH r1 = r2.A03     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            java.lang.String r3 = "has_comment_prompt"
        L_0x089a:
            r1.A00(r3, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            goto L_0x08a5
        L_0x089e:
            boolean r1 = r2 instanceof X.0c9     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            if (r1 == 0) goto L_0x0793
            X.AnonymousClass7TF.A1L(r5, r2, r0)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x08a5:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            throw r0     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
        L_0x08aa:
            boolean r118 = r58.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r119 = r20.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r120 = r21.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r121 = r22.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r122 = r23.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r123 = r24.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r124 = r25.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r125 = r26.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r126 = r27.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            int r115 = r28.intValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            long r116 = r29.longValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r127 = r30.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r128 = r32.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r129 = r33.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r130 = r45.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r131 = r46.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            boolean r132 = r47.booleanValue()     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            X.5kq r58 = new X.5kq     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            r74 = r16
            r77 = r31
            r82 = r17
            r102 = r19
            r103 = r44
            r104 = r18
            r105 = r43
            r106 = r42
            r107 = r41
            r108 = r40
            r109 = r39
            r110 = r38
            r111 = r37
            r112 = r36
            r113 = r35
            r114 = r34
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132)     // Catch:{ IOException -> 0x091a, Exception -> 0x0914 }
            return r58
        L_0x0914:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x091a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63179Ksm.parseFromJson(X.16F):X.5kq");
    }
}
