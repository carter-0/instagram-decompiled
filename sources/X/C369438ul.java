package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8ul  reason: invalid class name and case insensitive filesystem */
public abstract class C369438ul {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0296, code lost:
        if (r13.A1p() != false) goto L_0x0298;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashMap A00(com.instagram.common.session.UserSession r54) {
        /*
            r3 = 0
            r0 = r54
            X.0qQ.A0B(r0, r3)
            X.2D6 r0 = X.2D5.A00(r54)
            X.1Av r13 = X.1Au.A00(r54)
            X.0xa r8 = r0.A04
            java.lang.String r11 = "PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_UPSELL_LAST_SEEN"
            r1 = 0
            long r4 = r8.getLong(r11, r1)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r33 = 0
            if (r0 <= 0) goto L_0x0020
            r33 = 1
        L_0x0020:
            java.lang.String r6 = "PREFERENCE_REELS_SHARE_TO_FACEBOOK_SIMPLIFICATION_V_1_5_UPSELL_LAST_SEEN"
            long r9 = r8.getLong(r6, r1)
            int r4 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r0 = 0
            if (r4 <= 0) goto L_0x002c
            r0 = 1
        L_0x002c:
            int r33 = r33 + r0
            X.2DQ r7 = X.2DQ.A02
            X.0xa r0 = r13.A01
            java.lang.String r4 = "fb_feed_crossposting_only_me_privacy_prompt_times_shown"
            int r16 = r0.getInt(r4, r3)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r4 = "fb_feed_crossposting_only_me_privacy_prompt_time_stamp_ms"
            long r4 = r0.getLong(r4, r1)
            long r4 = r10.toSeconds(r4)
            int r9 = (int) r4
            X.9I7 r14 = new X.9I7
            r15 = r3
            r17 = r3
            r18 = r9
            r19 = r3
            r14.<init>(r15, r16, r17, r18, r19)
            X.0eP r30 = new X.0eP
            r4 = r30
            r4.<init>(r7, r14)
            X.2DQ r7 = X.2DQ.A03
            java.lang.String r4 = "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_VIEW_COUNT"
            int r16 = r8.getInt(r4, r3)
            java.lang.String r4 = "PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_LAST_SEEN_TIME_MS"
            long r4 = r8.getLong(r4, r1)
            long r4 = r10.toSeconds(r4)
            int r9 = (int) r4
            X.9I7 r14 = new X.9I7
            r18 = r9
            r14.<init>(r15, r16, r17, r18, r19)
            X.0eP r29 = new X.0eP
            r4 = r29
            r4.<init>(r7, r14)
            X.2DQ r7 = X.2DQ.A0A
            java.lang.String r4 = "feed_xpost_user_migration_upsell_second_wave_display_count"
            int r16 = r0.getInt(r4, r3)
            java.lang.String r4 = "feed_xpost_user_migration_upsell_second_wave_last_seen_sec"
            long r4 = r0.getLong(r4, r1)
            int r9 = (int) r4
            X.9I7 r14 = new X.9I7
            r18 = r9
            r14.<init>(r15, r16, r17, r18, r19)
            X.0eP r28 = new X.0eP
            r4 = r28
            r4.<init>(r7, r14)
            r37 = 2
            X.2DQ r7 = X.2DQ.A0B
            java.lang.String r4 = "story_xpost_user_migration_upsell_second_wave_display_count"
            int r16 = r0.getInt(r4, r3)
            java.lang.String r4 = "story_xpost_user_migration_upsell_second_wave_last_seen_sec"
            long r4 = r0.getLong(r4, r1)
            int r9 = (int) r4
            X.9I7 r4 = new X.9I7
            r14 = r4
            r18 = r9
            r14.<init>(r15, r16, r17, r18, r19)
            X.0eP r15 = new X.0eP
            r15.<init>(r7, r4)
            X.2DQ r9 = X.2DQ.A0D
            java.lang.String r4 = "reels_ccp_user_migration_feed_upsell_display_count"
            int r18 = r0.getInt(r4, r3)
            java.lang.String r4 = "reels_ccp_user_migration_feed_upsell_last_seen_sec"
            long r4 = r0.getLong(r4, r1)
            int r7 = (int) r4
            X.9I7 r4 = new X.9I7
            r16 = r4
            r20 = r7
            r21 = r3
            r16.<init>(r17, r18, r19, r20, r21)
            X.0eP r27 = new X.0eP
            r5 = r27
            r5.<init>(r9, r4)
            X.2DQ r9 = X.2DQ.A0E
            java.lang.String r4 = "reels_ccp_user_migration_story_upsell_display_count"
            int r18 = r0.getInt(r4, r3)
            java.lang.String r4 = "reels_ccp_user_migration_story_upsell_last_seen_sec"
            long r4 = r0.getLong(r4, r1)
            int r7 = (int) r4
            X.9I7 r4 = new X.9I7
            r16 = r4
            r20 = r7
            r16.<init>(r17, r18, r19, r20, r21)
            X.0eP r26 = new X.0eP
            r5 = r26
            r5.<init>(r9, r4)
            X.2DQ r9 = X.2DQ.A0G
            java.lang.String r4 = "story_reels_ccp_user_migration_feed_upsell_display_count"
            int r18 = r0.getInt(r4, r3)
            java.lang.String r4 = "story_reels_ccp_user_migration_feed_upsell_last_seen_sec"
            long r4 = r0.getLong(r4, r1)
            int r7 = (int) r4
            X.9I7 r4 = new X.9I7
            r16 = r4
            r20 = r7
            r16.<init>(r17, r18, r19, r20, r21)
            X.0eP r25 = new X.0eP
            r5 = r25
            r5.<init>(r9, r4)
            X.2DQ r9 = X.2DQ.A06
            java.lang.String r4 = "feed_reels_ccp_user_migration_story_upsell_display_count"
            int r18 = r0.getInt(r4, r3)
            java.lang.String r4 = "feed_reels_ccp_user_migration_story_upsell_last_seen_sec"
            long r4 = r0.getLong(r4, r1)
            int r7 = (int) r4
            X.9I7 r4 = new X.9I7
            r16 = r4
            r20 = r7
            r16.<init>(r17, r18, r19, r20, r21)
            X.0eP r24 = new X.0eP
            r5 = r24
            r5.<init>(r9, r4)
            X.2DQ r9 = X.2DQ.A0H
            java.lang.String r4 = "xpost_unified_onboarding_upsell_display_count"
            int r18 = r0.getInt(r4, r3)
            java.lang.String r4 = "xpost_unified_onboarding_upsell_last_seen_sec"
            long r4 = r0.getLong(r4, r1)
            int r7 = (int) r4
            X.9I7 r4 = new X.9I7
            r16 = r4
            r20 = r7
            r16.<init>(r17, r18, r19, r20, r21)
            X.0eP r23 = new X.0eP
            r5 = r23
            r5.<init>(r9, r4)
            X.2DQ r9 = X.2DQ.A0I
            java.lang.String r4 = "fx_cal_ig_fb_feed_crosspost_after_share_ac_upsell_seen"
            boolean r18 = r0.getBoolean(r4, r3)
            java.lang.String r4 = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_FEED"
            long r4 = r8.getLong(r4, r1)
            int r7 = (int) r4
            X.9I7 r4 = new X.9I7
            r16 = r4
            r20 = r7
            r16.<init>(r17, r18, r19, r20, r21)
            X.0eP r22 = new X.0eP
            r5 = r22
            r5.<init>(r9, r4)
            X.2DQ r9 = X.2DQ.A0M
            long r6 = r8.getLong(r6, r1)
            long r4 = r8.getLong(r11, r1)
            long r4 = java.lang.Math.max(r6, r4)
            long r4 = r10.toSeconds(r4)
            int r6 = (int) r4
            X.9I7 r5 = new X.9I7
            r31 = r5
            r32 = r3
            r34 = r3
            r35 = r6
            r36 = r3
            r31.<init>(r32, r33, r34, r35, r36)
            X.0eP r21 = new X.0eP
            r4 = r21
            r4.<init>(r9, r5)
            X.2DQ r6 = X.2DQ.A0N
            java.lang.String r5 = "PREFERENCE_REELS_SHOULD_SHOW_RECOMMEND_ON_FACEBOOK_CREATION_PRIMER"
            r4 = 1
            boolean r4 = r8.getBoolean(r5, r4)
            r36 = r4 ^ 1
            java.lang.String r4 = "PREFERENCE_REELS_XAR_UPSELL_LAST_SEEN_MS"
            long r4 = r8.getLong(r4, r1)
            long r4 = r10.toSeconds(r4)
            int r7 = (int) r4
            X.9I7 r5 = new X.9I7
            r34 = r5
            r35 = r3
            r38 = r7
            r39 = r3
            r34.<init>(r35, r36, r37, r38, r39)
            X.0eP r20 = new X.0eP
            r4 = r20
            r4.<init>(r6, r5)
            X.2DQ r7 = X.2DQ.A0O
            java.lang.String r4 = "feed_fb_autoshare_upsell_dialog_display_count"
            int r33 = r0.getInt(r4, r3)
            java.lang.String r4 = "feed_fb_autoshare_upsell_dialog_last_seen_sec"
            long r4 = r0.getLong(r4, r1)
            int r6 = (int) r4
            X.9I7 r5 = new X.9I7
            r31 = r5
            r34 = r3
            r35 = r6
            r36 = r3
            r31.<init>(r32, r33, r34, r35, r36)
            X.0eP r19 = new X.0eP
            r4 = r19
            r4.<init>(r7, r5)
            X.2DQ r7 = X.2DQ.A0P
            java.lang.String r4 = "direct_sharesheet_auto_share_to_fb_dialog_display_count"
            int r33 = r0.getInt(r4, r3)
            java.lang.String r4 = "last_seen_direct_sharesheet_auto_share_to_fb_dialog_sec"
            long r4 = r0.getLong(r4, r1)
            int r6 = (int) r4
            X.9I7 r5 = new X.9I7
            r31 = r5
            r35 = r6
            r31.<init>(r32, r33, r34, r35, r36)
            X.0eP r18 = new X.0eP
            r4 = r18
            r4.<init>(r7, r5)
            X.2DQ r6 = X.2DQ.A0R
            java.lang.String r4 = "fb_feed_crossposting_toggle_tooltip_show_times"
            int r33 = r0.getInt(r4, r3)
            java.lang.String r4 = "fb_feed_crossposting_toggle_tooltip_last_seen_time_in_ms"
            long r4 = r0.getLong(r4, r1)
            long r4 = r10.toSeconds(r4)
            int r7 = (int) r4
            X.9I7 r5 = new X.9I7
            r31 = r5
            r35 = r7
            r31.<init>(r32, r33, r34, r35, r36)
            X.0eP r17 = new X.0eP
            r4 = r17
            r4.<init>(r6, r5)
            X.2DQ r7 = X.2DQ.A0S
            java.lang.String r4 = "fb_currently_sharing_feed_tooltip_show_times"
            int r6 = r0.getInt(r4, r3)
            r5 = 8
            X.9I7 r4 = new X.9I7
            r4.<init>(r3, r6, r5)
            X.0eP r14 = new X.0eP
            r14.<init>(r7, r4)
            X.2DQ r7 = X.2DQ.A0T
            java.lang.String r4 = "reel_one_tap_fbshare_tooltip_count"
            int r33 = r0.getInt(r4, r3)
            java.lang.String r4 = "reel_one_tap_fbshare_tooltip_last_seen_sec"
            long r4 = r0.getLong(r4, r1)
            int r6 = (int) r4
            X.9I7 r4 = new X.9I7
            r31 = r4
            r35 = r6
            r31.<init>(r32, r33, r34, r35, r36)
            X.0eP r12 = new X.0eP
            r12.<init>(r7, r4)
            X.2DQ r6 = X.2DQ.A0U
            java.lang.String r4 = "xshare_facebook_page_nux_impression"
            int r33 = r0.getInt(r4, r3)
            java.lang.String r4 = "xshare_facebook_page_nux_last_seen_time"
            long r4 = r0.getLong(r4, r1)
            long r4 = r10.toSeconds(r4)
            int r7 = (int) r4
            X.9I7 r4 = new X.9I7
            r31 = r4
            r35 = r7
            r31.<init>(r32, r33, r34, r35, r36)
            X.0eP r9 = new X.0eP
            r9.<init>(r6, r4)
            X.2DQ r11 = X.2DQ.A0V
            X.0s0 r5 = r13.A2H
            X.0YZ[] r16 = X.1Av.A8a
            r4 = 81
            r4 = r16[r4]
            java.lang.Object r4 = r5.CDM(r13, r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x0298
            boolean r4 = r13.A1p()
            r33 = 0
            if (r4 == 0) goto L_0x029a
        L_0x0298:
            r33 = 1
        L_0x029a:
            java.lang.String r6 = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_REEL"
            long r4 = r8.getLong(r6, r1)
            int r7 = (int) r4
            X.9I7 r4 = new X.9I7
            r31 = r4
            r35 = r7
            r31.<init>(r32, r33, r34, r35, r36)
            X.0eP r7 = new X.0eP
            r7.<init>(r11, r4)
            X.2DQ r11 = X.2DQ.A0W
            java.lang.String r4 = "PREFERENCE_REELS_HAS_SHOWN_CROSS_POST_TO_FACEBOOK_TOOLTIP"
            boolean r33 = r8.getBoolean(r4, r3)
            long r4 = r8.getLong(r6, r1)
            int r6 = (int) r4
            X.9I7 r4 = new X.9I7
            r31 = r4
            r35 = r6
            r31.<init>(r32, r33, r34, r35, r36)
            X.0eP r6 = new X.0eP
            r6.<init>(r11, r4)
            X.2DQ r11 = X.2DQ.A0X
            java.lang.String r4 = "story_composer_my_story_fb_share_nux_tooltip_count"
            int r33 = r0.getInt(r4, r3)
            java.lang.String r4 = "story_composer_my_story_fb_share_nux_tooltip_last_seen"
            long r4 = r0.getLong(r4, r1)
            long r4 = r10.toSeconds(r4)
            int r13 = (int) r4
            X.9I7 r5 = new X.9I7
            r31 = r5
            r35 = r13
            r31.<init>(r32, r33, r34, r35, r36)
            X.0eP r4 = new X.0eP
            r4.<init>(r11, r5)
            X.2DQ r11 = X.2DQ.A0Y
            java.lang.String r5 = "story_composer_my_story_button_nux_tooltip_count"
            int r33 = r0.getInt(r5, r3)
            java.lang.String r13 = "story_last_server_xposting_turn_on_time_in_second"
            r5 = -1
            int r35 = r0.getInt(r13, r5)
            X.9I7 r0 = new X.9I7
            r31 = r0
            r31.<init>(r32, r33, r34, r35, r36)
            X.0eP r5 = new X.0eP
            r5.<init>(r11, r0)
            X.2DQ r11 = X.2DQ.A0b
            java.lang.String r0 = "PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_SEEN_COUNT"
            int r33 = r8.getInt(r0, r3)
            java.lang.String r0 = "PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_LAST_SEEN_MS"
            long r0 = r8.getLong(r0, r1)
            long r0 = r10.toSeconds(r0)
            int r2 = (int) r0
            X.9I7 r0 = new X.9I7
            r31 = r0
            r35 = r2
            r31.<init>(r32, r33, r34, r35, r36)
            X.0eP r2 = new X.0eP
            r2.<init>(r11, r0)
            X.2DQ r8 = X.2DQ.A0C
            X.1Av r11 = X.1Au.A00(r54)
            X.0s0 r1 = r11.A3K
            r0 = 321(0x141, float:4.5E-43)
            r0 = r16[r0]
            java.lang.Object r0 = r1.CDM(r11, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r33 = r0.booleanValue()
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r10.toSeconds(r0)
            int r10 = (int) r0
            X.9I7 r1 = new X.9I7
            r31 = r1
            r35 = r10
            r31.<init>(r32, r33, r34, r35, r36)
            X.0eP r0 = new X.0eP
            r0.<init>(r8, r1)
            r34 = r27
            r35 = r26
            r36 = r25
            r37 = r24
            r38 = r23
            r39 = r22
            r40 = r21
            r41 = r20
            r42 = r19
            r43 = r18
            r44 = r17
            r45 = r14
            r46 = r12
            r47 = r9
            r48 = r7
            r49 = r6
            r50 = r4
            r51 = r5
            r52 = r2
            r53 = r0
            r31 = r29
            r32 = r28
            r33 = r15
            X.0eP[] r0 = new X.0eP[]{r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53}
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x0397:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03d1
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getValue()
            X.9I7 r0 = (X.AnonymousClass9I7) r0
            int r0 = r0.A00
            if (r0 > 0) goto L_0x03c5
            java.lang.Object r0 = r2.getValue()
            X.9I7 r0 = (X.AnonymousClass9I7) r0
            int r0 = r0.A01
            if (r0 > 0) goto L_0x03c5
            java.lang.Object r1 = r2.getKey()
            X.2DQ r1 = (X.2DQ) r1
            r0 = r54
            boolean r0 = A01(r0, r1)
            if (r0 == 0) goto L_0x0397
        L_0x03c5:
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r4.put(r1, r0)
            goto L_0x0397
        L_0x03d1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369438ul.A00(com.instagram.common.session.UserSession):java.util.LinkedHashMap");
    }

    public static final boolean A01(UserSession userSession, 2DQ r4) {
        long j;
        int ordinal = r4.ordinal();
        0Tu r2 = 0Tu.A05;
        switch (ordinal) {
            case 3:
            case 22:
            case 38:
            case 39:
            case 79:
            case 80:
            case 86:
                j = 36318471091460238L;
                break;
            default:
                j = 36318471091394701L;
                break;
        }
        return 182.A06(r2, userSession, j);
    }
}
