package X;

public final class Fe6 implements C51883G5v {
    public final int A00;

    public Fe6(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02f6, code lost:
        r8.A05 = X.1QK.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02fa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x030d, code lost:
        r8.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x030f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03fe, code lost:
        if ("clips_resurrected".equals(r3) == false) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0441, code lost:
        r2.putString(r0, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0444, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x048b, code lost:
        X.DbU.A1B(r10, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x048e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        r2.putString(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0176, code lost:
        r2.putString(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0179, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01bb, code lost:
        X.DbU.A1B(r10, r3, "prompt_id");
        X.FHD.A0C(r10, r9, r8, "direct_inbox_push_notification");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E1n(android.net.Uri r24, com.instagram.common.session.UserSession r25, X.AnonymousClass2a4 r26, X.C49865FAi r27) {
        /*
            r23 = this;
            r0 = r23
            int r0 = r0.A00
            r10 = r24
            r9 = r25
            r8 = r27
            switch(r0) {
                case 4: goto L_0x01cd;
                case 5: goto L_0x01ee;
                case 6: goto L_0x0045;
                case 7: goto L_0x0186;
                case 8: goto L_0x0020;
                case 9: goto L_0x01a7;
                case 10: goto L_0x028c;
                case 11: goto L_0x0446;
                case 12: goto L_0x0455;
                case 13: goto L_0x02a3;
                case 14: goto L_0x02d4;
                case 15: goto L_0x02e2;
                case 16: goto L_0x007c;
                case 17: goto L_0x045f;
                case 18: goto L_0x0469;
                case 19: goto L_0x00aa;
                case 20: goto L_0x0473;
                case 21: goto L_0x00aa;
                case 22: goto L_0x00b9;
                case 23: goto L_0x00e8;
                case 24: goto L_0x00f7;
                case 25: goto L_0x0330;
                case 26: goto L_0x0108;
                case 27: goto L_0x0124;
                case 28: goto L_0x02fb;
                case 29: goto L_0x0310;
                default: goto L_0x000d;
            }
        L_0x000d:
            X.1QK r0 = X.1QK.A0C
            r8.A05 = r0
            android.os.Bundle r2 = r8.A0P
            X.DbW.A0v(r10, r2)
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "uri_string"
        L_0x001c:
            r2.putString(r0, r1)
        L_0x001f:
            return
        L_0x0020:
            X.FHD.A0A(r10, r9, r8)
            android.os.Bundle r2 = r8.A0P
            X.DbW.A0v(r10, r2)
            java.lang.String r0 = "thread_id"
            java.lang.String r1 = r10.getQueryParameter(r0)
            java.lang.String r0 = "id"
            r2.putString(r0, r1)
            java.lang.String r0 = "collection_type"
            java.lang.String r0 = r10.getQueryParameter(r0)
            com.instagram.direct.prompts.DirectPromptTypes r1 = X.AnonymousClass79B.A01(r0)
            com.instagram.direct.prompts.DirectPromptTypes r0 = com.instagram.direct.prompts.DirectPromptTypes.CHALLENGES
            if (r1 != r0) goto L_0x001f
            java.lang.String r0 = "collection_id"
            goto L_0x048b
        L_0x0045:
            r0 = 3897(0xf39, float:5.461E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.A06 = r0
            X.1QK r0 = X.1QK.A0C
            r8.A05 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.A00 = r0
            X.9QA r1 = X.AnonymousClass9QA.A00
            X.8aL r0 = X.C358088aL.A0p
            X.8aL[] r0 = new X.C358088aL[]{r0}
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = X.C358098aM.A00(r1, r0)
            r8.A03 = r0
            java.lang.String r0 = "timebox_start_timestamp"
            java.lang.Long r2 = X.FEH.A00(r10, r0)
            if (r2 == 0) goto L_0x001f
            java.lang.String r0 = "timebox_late_timestamp"
            java.lang.Long r1 = X.FEH.A00(r10, r0)
            if (r1 == 0) goto L_0x001f
            X.3BK r0 = X.AnonymousClass3BJ.A00(r9)
            r0.A01 = r2
            r0.A00 = r1
            return
        L_0x007c:
            android.os.Bundle r3 = X.C49865FAi.A00(r8)
            X.DbW.A0v(r10, r3)
            java.lang.String r0 = "start_time"
            java.lang.String r0 = r10.getQueryParameter(r0)     // Catch:{ NumberFormatException -> 0x001f }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x001f }
            long r1 = java.lang.Math.round(r0)     // Catch:{ NumberFormatException -> 0x001f }
            java.lang.String r0 = "BUNDLE_OTC_NOTIF_START_TIME"
            r3.putLong(r0, r1)     // Catch:{ NumberFormatException -> 0x001f }
            X.3HH r0 = X.AnonymousClass3HG.A00(r9)     // Catch:{ NumberFormatException -> 0x001f }
            X.0xa r0 = r0.A00     // Catch:{ NumberFormatException -> 0x001f }
            X.0xY r1 = r0.AR4()     // Catch:{ NumberFormatException -> 0x001f }
            java.lang.String r0 = "OTC_DISPLAY_CODE_INTRO"
            r1.ED3(r0)     // Catch:{ NumberFormatException -> 0x001f }
            r1.apply()     // Catch:{ NumberFormatException -> 0x001f }
            goto L_0x0445
        L_0x00aa:
            android.os.Bundle r2 = X.C49865FAi.A00(r8)
            X.DbW.A0v(r10, r2)
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "wall_uri_to_bundle"
            goto L_0x001c
        L_0x00b9:
            java.lang.String r0 = "entrypoint"
            java.lang.String r3 = r10.getQueryParameter(r0)
            java.lang.String r5 = "injected_actor_ids"
            java.lang.String r4 = r10.getQueryParameter(r5)
            X.1QK r0 = X.1QK.A0D
            r8.A05 = r0
            android.os.Bundle r2 = r8.A0P
            X.DbW.A0v(r10, r2)
            java.lang.String r1 = r9.A06
            java.lang.String r0 = "id"
            r2.putString(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00e0
            java.lang.String r0 = "get_app_entrypoint"
            r2.putString(r0, r3)
        L_0x00e0:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x001f
            goto L_0x0176
        L_0x00e8:
            android.os.Bundle r2 = X.C49865FAi.A00(r8)
            X.DbW.A0v(r10, r2)
            java.lang.String r1 = r10.toString()
            java.lang.String r0 = "friend_map_uri_param"
            goto L_0x001c
        L_0x00f7:
            android.os.Bundle r2 = X.C49865FAi.A00(r8)
            X.DbW.A0v(r10, r2)
            java.lang.String r0 = "media_id"
            java.lang.String r1 = r10.getQueryParameter(r0)
            java.lang.String r0 = "quick_snap_media_id"
            goto L_0x001c
        L_0x0108:
            java.lang.String r0 = "referrer_media_id"
            java.lang.String r2 = r10.getQueryParameter(r0)
            r14 = 0
            r11 = r9
            r12 = r8
            r13 = r2
            r15 = r14
            X.FHD.A0D(r10, r11, r12, r13, r14, r15)
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            if (r2 == 0) goto L_0x001f
            java.lang.String r0 = "id"
            r1.putString(r0, r2)
            r8.A01 = r1
            return
        L_0x0124:
            java.lang.String r0 = "media_id"
            java.lang.String r6 = r10.getQueryParameter(r0)
            if (r6 != 0) goto L_0x0130
            java.lang.String r6 = X.DbT.A0v(r10)
        L_0x0130:
            r4 = 0
            r1 = r9
            r2 = r8
            r3 = r6
            r5 = r4
            r0 = r10
            X.FHD.A0D(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "channel_user_id"
            java.lang.String r9 = r10.getQueryParameter(r0)
            java.lang.String r7 = "short_url"
            java.lang.String r3 = r10.getQueryParameter(r7)
            java.lang.String r5 = "destination"
            java.lang.String r4 = r10.getQueryParameter(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r2 = "id"
            if (r0 != 0) goto L_0x0163
            android.os.Bundle r1 = r8.A0P
            java.lang.String r0 = "arg_channel_user_id"
            r1.putString(r0, r9)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0163
            r1.putString(r2, r6)
        L_0x0163:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x017a
            android.os.Bundle r0 = r8.A0P
            r0.putString(r7, r3)
        L_0x016e:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x001f
            android.os.Bundle r2 = r8.A0P
        L_0x0176:
            r2.putString(r5, r4)
            return
        L_0x017a:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x016e
            android.os.Bundle r0 = r8.A0P
            r0.putString(r2, r6)
            goto L_0x016e
        L_0x0186:
            android.os.Bundle r3 = r8.A0P
            X.DbW.A0v(r10, r3)
            java.lang.String r2 = "note_pk"
            java.lang.String r0 = r10.getQueryParameter(r2)
            java.lang.String r1 = "note_id"
            if (r0 == 0) goto L_0x01a2
            java.lang.String r0 = r10.getQueryParameter(r2)
        L_0x0199:
            r3.putString(r1, r0)
            java.lang.String r0 = "is_self_note"
            X.DbT.A1E(r10, r3, r0)
            goto L_0x01bb
        L_0x01a2:
            java.lang.String r0 = r10.getQueryParameter(r1)
            goto L_0x0199
        L_0x01a7:
            android.os.Bundle r3 = r8.A0P
            X.DbW.A0v(r10, r3)
            java.lang.String r1 = "note_pk"
            java.lang.String r0 = r10.getQueryParameter(r1)
            if (r0 == 0) goto L_0x01c6
            java.lang.String r0 = r10.getQueryParameter(r1)
        L_0x01b8:
            r3.putString(r1, r0)
        L_0x01bb:
            java.lang.String r0 = "prompt_id"
            X.DbU.A1B(r10, r3, r0)
            java.lang.String r0 = "direct_inbox_push_notification"
            X.FHD.A0C(r10, r9, r8, r0)
            return
        L_0x01c6:
            java.lang.String r0 = "note_id"
            java.lang.String r0 = r10.getQueryParameter(r0)
            goto L_0x01b8
        L_0x01cd:
            java.lang.String r0 = "ar_effect_id"
            java.lang.String r0 = r10.getQueryParameter(r0)
            if (r0 == 0) goto L_0x01d7
            r8.A07 = r0
        L_0x01d7:
            X.1QK r0 = X.1QK.A0C
            r8.A05 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.A00 = r0
            java.lang.String r0 = "quick_camera_startup_uri"
            r8.A06 = r0
            X.80N r1 = X.AnonymousClass80N.A00
            r0 = 0
            X.8aL[] r0 = new X.C358088aL[r0]
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = X.C358098aM.A00(r1, r0)
            goto L_0x030d
        L_0x01ee:
            X.1QK r0 = X.1QK.A0C
            r8.A05 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.A00 = r0
            java.lang.String r0 = "mode"
            java.lang.String r9 = r10.getQueryParameter(r0)
            java.lang.String r0 = "effect_id"
            java.lang.String r5 = r10.getQueryParameter(r0)
            java.lang.String r0 = "entrypoint"
            java.lang.String r7 = r10.getQueryParameter(r0)
            java.lang.String r0 = "test_link_crypto_hash"
            java.lang.String r4 = r10.getQueryParameter(r0)
            java.lang.String r0 = "test_link_revision_id"
            java.lang.String r3 = r10.getQueryParameter(r0)
            java.lang.String r0 = "unlocked_sticker_id"
            java.lang.String r2 = r10.getQueryParameter(r0)
            java.lang.String r0 = "interactive_sticker_id"
            java.lang.String r1 = r10.getQueryParameter(r0)
            java.lang.String r0 = "close_friends"
            java.lang.String r6 = r10.getQueryParameter(r0)
            if (r4 == 0) goto L_0x0259
            java.lang.String r0 = "quick_camera_ar_effect_test_link"
        L_0x022a:
            r8.A06 = r0
            if (r6 == 0) goto L_0x0257
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
        L_0x0230:
            r8.A04 = r0
            java.util.Map r6 = X.C391389so.A01
            if (r9 == 0) goto L_0x0255
            java.lang.String r0 = X.AnonymousClass7TF.A0j(r9)
        L_0x023a:
            java.lang.Object r0 = r6.get(r0)
            X.9so r0 = (X.C391389so) r0
            if (r0 != 0) goto L_0x0244
            X.9so r0 = X.C391389so.NORMAL
        L_0x0244:
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = X.A1Y.A00(r0)
            r8.A03 = r0
            r8.A07 = r5
            r8.A0I = r4
            r8.A0J = r3
            r8.A0K = r2
            r8.A0B = r1
            return
        L_0x0255:
            r0 = 0
            goto L_0x023a
        L_0x0257:
            r0 = 0
            goto L_0x0230
        L_0x0259:
            if (r5 == 0) goto L_0x025e
            java.lang.String r0 = "quick_camera_ar_effect_share_link"
            goto L_0x022a
        L_0x025e:
            if (r7 == 0) goto L_0x0289
            r0 = 966(0x3c6, float:1.354E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0273
            r0 = 2981(0xba5, float:4.177E-42)
        L_0x026e:
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x022a
        L_0x0273:
            java.lang.String r0 = "sticker-drop-activity-feed"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x027e
            r0 = 1265(0x4f1, float:1.773E-42)
            goto L_0x026e
        L_0x027e:
            java.lang.String r0 = "sticker-drop-push"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0289
            r0 = 2980(0xba4, float:4.176E-42)
            goto L_0x026e
        L_0x0289:
            java.lang.String r0 = "quick_camera_startup_uri"
            goto L_0x022a
        L_0x028c:
            X.FHD.A0H(r9, r8)
            java.lang.String r0 = "app_id"
            java.lang.String r0 = r10.getQueryParameter(r0)
            r0.getClass()
            android.os.Bundle r1 = r8.A0P
            X.DbW.A0v(r10, r1)
            java.lang.String r0 = "bloks_screen_query_uri_key"
            r1.putParcelable(r0, r10)
            return
        L_0x02a3:
            android.os.Bundle r2 = r8.A0P
            X.DbW.A0v(r10, r2)
            X.Nko r0 = X.C69409Nko.TRENDING_PROMPTS_SURFACE
            java.lang.String r1 = r0.toString()
            r0 = 999(0x3e7, float:1.4E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.putString(r0, r1)
            X.Nkk r0 = X.C69406Nkk.NOTIFICATION
            java.lang.String r0 = r0.toString()
            X.DbS.A1B(r2, r0)
            java.lang.String r0 = "prompt_id"
            X.DbU.A1B(r10, r2, r0)
            r0 = 1134(0x46e, float:1.589E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.DbT.A1E(r10, r2, r0)
            java.lang.String r0 = "author_ids"
            X.DbU.A1B(r10, r2, r0)
            goto L_0x02f6
        L_0x02d4:
            android.os.Bundle r1 = r8.A0P
            X.DbW.A0v(r10, r1)
            java.lang.String r0 = "media_id"
            X.DbU.A1B(r10, r1, r0)
            r0 = 0
            r8.A00 = r0
            goto L_0x02f6
        L_0x02e2:
            android.os.Bundle r2 = r8.A0P
            X.DbW.A0v(r10, r2)
            java.lang.String r1 = "media_id"
            java.lang.String r0 = r10.getQueryParameter(r1)
            if (r0 != 0) goto L_0x02f3
            java.lang.String r0 = X.DbT.A0v(r10)
        L_0x02f3:
            r2.putString(r1, r0)
        L_0x02f6:
            X.1QK r0 = X.1QK.A0C
            r8.A05 = r0
            return
        L_0x02fb:
            X.1QK r0 = X.1QK.A0C
            r8.A05 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.A00 = r0
            java.lang.String r0 = "quick_camera_startup_uri"
            r8.A06 = r0
            X.9so r0 = X.C391389so.LIVE
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = X.A1Y.A00(r0)
        L_0x030d:
            r8.A03 = r0
            return
        L_0x0310:
            X.1QK r0 = X.1QK.A0C
            r8.A05 = r0
            java.lang.String r0 = "media_id"
            java.lang.String r14 = r10.getQueryParameter(r0)
            if (r14 != 0) goto L_0x0320
            java.lang.String r14 = X.DbT.A0v(r10)
        L_0x0320:
            android.os.Bundle r2 = r8.A0P
            X.DbW.A0v(r10, r2)
            java.lang.String r1 = r9.A06
            java.lang.String r0 = "current_user_id"
            r2.putString(r0, r1)
            java.lang.String r0 = "id"
            goto L_0x0441
        L_0x0330:
            java.lang.String r0 = "media_id"
            java.lang.String r13 = r10.getQueryParameter(r0)
            if (r13 != 0) goto L_0x033c
            java.lang.String r13 = X.DbT.A0v(r10)
        L_0x033c:
            java.lang.String r19 = "short_url"
            r0 = r19
            java.lang.String r12 = r10.getQueryParameter(r0)
            java.lang.String r18 = "media_list"
            r0 = r18
            java.lang.String r11 = r10.getQueryParameter(r0)
            java.lang.String r0 = "target_comment_id"
            java.lang.String r7 = r10.getQueryParameter(r0)
            java.lang.String r0 = "sort_order"
            java.lang.String r6 = r10.getQueryParameter(r0)
            if (r7 != 0) goto L_0x0360
            java.lang.String r0 = "forced_preview_comment_id"
            java.lang.String r7 = r10.getQueryParameter(r0)
        L_0x0360:
            java.lang.String r5 = "gift_action_type"
            java.lang.String r4 = r10.getQueryParameter(r5)
            java.lang.String r3 = "push_category"
            java.lang.String r2 = r10.getQueryParameter(r3)
            java.lang.String r1 = "highlight_original_media"
            r14 = 0
            boolean r17 = r10.getBooleanQueryParameter(r1, r14)
            java.lang.String r15 = r10.getHost()
            java.lang.String r0 = "clips_home_save_to_collection_sheet"
            boolean r22 = r15.equals(r0)
            java.lang.String r0 = "show_comment_nudge_banner"
            boolean r16 = r10.getBooleanQueryParameter(r0, r14)
            java.lang.String r0 = "trial_action_type"
            java.lang.String r14 = r10.getQueryParameter(r0)
            java.lang.String r0 = "open_trial_result_view"
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x0401
            java.lang.String r0 = "trial_result_source"
            java.lang.String r14 = r10.getQueryParameter(r0)
            if (r14 != 0) goto L_0x039b
            java.lang.String r14 = "trial_notification_type_not_set"
        L_0x039b:
            if (r13 != 0) goto L_0x03d8
            if (r12 != 0) goto L_0x03d8
            if (r11 != 0) goto L_0x03d8
        L_0x03a1:
            X.1QK r0 = X.1QK.A09
            r8.A05 = r0
            android.os.Bundle r0 = r8.A0P
            X.DbW.A0v(r10, r0)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            r0 = 2811(0xafb, float:3.939E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = "source"
            if (r13 == 0) goto L_0x03c8
            java.lang.String r0 = "id"
            r4.putString(r0, r13)
        L_0x03bd:
            r4.putString(r2, r3)
        L_0x03c0:
            r8.A01 = r4
        L_0x03c2:
            r0 = r17
            r4.putBoolean(r1, r0)
            return
        L_0x03c8:
            if (r11 == 0) goto L_0x03d0
            r0 = r18
            r4.putString(r0, r11)
            goto L_0x03bd
        L_0x03d0:
            if (r12 == 0) goto L_0x03c2
            r0 = r19
            r4.putString(r0, r12)
            goto L_0x03c0
        L_0x03d8:
            java.lang.String r15 = r10.getHost()
            java.lang.String r0 = "clips_home"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x0403
            if (r7 != 0) goto L_0x0403
            if (r6 != 0) goto L_0x0403
            if (r12 != 0) goto L_0x03a1
            if (r11 != 0) goto L_0x03a1
            java.lang.String r3 = r10.getQueryParameter(r3)
            java.lang.String r0 = "clips_subscribe_connected"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x03a1
            java.lang.String r0 = "clips_resurrected"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0403
            goto L_0x03a1
        L_0x0401:
            r14 = 0
            goto L_0x039b
        L_0x0403:
            r18 = r9
            r19 = r8
            r20 = r13
            r21 = r17
            r17 = r10
            X.FHD.A0D(r17, r18, r19, r20, r21, r22)
            if (r7 == 0) goto L_0x0419
            android.os.Bundle r1 = r8.A0P
            java.lang.String r0 = "CommentThreadFragment.TARGET_COMMENT_ID"
            r1.putString(r0, r7)
        L_0x0419:
            if (r4 == 0) goto L_0x0420
            android.os.Bundle r0 = r8.A0P
            r0.putString(r5, r4)
        L_0x0420:
            if (r2 == 0) goto L_0x0429
            android.os.Bundle r1 = r8.A0P
            java.lang.String r0 = "ReelViewerFragment.ARGUMENTS_KEY_EXTRA_PUSH_NOTIF_TYPE"
            r1.putString(r0, r2)
        L_0x0429:
            if (r6 == 0) goto L_0x0432
            android.os.Bundle r1 = r8.A0P
            java.lang.String r0 = "CommentThreadFragment.INTENT_EXTRA_SORT_ORDER"
            r1.putString(r0, r6)
        L_0x0432:
            android.os.Bundle r2 = r8.A0P
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = r16
            r2.putBoolean(r1, r0)
            java.lang.String r0 = "intent_extra_trial_notification_type"
        L_0x0441:
            r2.putString(r0, r14)
            return
        L_0x0445:
            return
        L_0x0446:
            android.os.Bundle r2 = X.C49865FAi.A00(r8)
            X.DbW.A0v(r10, r2)
            java.lang.String r0 = "media_id"
            X.DbU.A1B(r10, r2, r0)
            java.lang.String r0 = "entry_point"
            goto L_0x048b
        L_0x0455:
            android.os.Bundle r2 = X.C49865FAi.A00(r8)
            X.DbW.A0v(r10, r2)
            java.lang.String r0 = "media_id"
            goto L_0x048b
        L_0x045f:
            android.os.Bundle r2 = X.C49865FAi.A00(r8)
            X.DbW.A0v(r10, r2)
            java.lang.String r0 = "opal_user_id"
            goto L_0x048b
        L_0x0469:
            android.os.Bundle r2 = X.C49865FAi.A00(r8)
            X.DbW.A0v(r10, r2)
            java.lang.String r0 = "media_ids"
            goto L_0x048b
        L_0x0473:
            java.lang.String r0 = "media_id"
            java.lang.String r3 = r10.getQueryParameter(r0)
            if (r3 != 0) goto L_0x047f
            java.lang.String r3 = X.DbT.A0v(r10)
        L_0x047f:
            r4 = 0
            r1 = r9
            r2 = r8
            r5 = r4
            r0 = r10
            X.FHD.A0D(r0, r1, r2, r3, r4, r5)
            android.os.Bundle r2 = r8.A0P
            java.lang.String r0 = "playlist_title"
        L_0x048b:
            X.DbU.A1B(r10, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fe6.E1n(android.net.Uri, com.instagram.common.session.UserSession, X.2a4, X.FAi):void");
    }
}
