package X;

public abstract class OS7 {
    public static final C74239PrS A00 = P1S.A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0047, code lost:
        throw X.AnonymousClass7TF.A0W("Unknown entry point type ", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012c, code lost:
        if (r9.equals(r1) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012e, code lost:
        r10 = X.JTP.A0m(r0, "DirectReplyModalFragment.viewer_user_id");
        r11 = X.JTP.A0m(r0, "DirectReplyModalFragment.reel_id");
        r12 = X.JTP.A0m(r0, "DirectReplyModalFragment.reel_item_id");
        r0.getBoolean("DirectReplyModalFragment.is_archive_reel");
        r20 = r0.getBoolean("DirectReplyModalFragment.has_story_like", false);
        r13 = r0.getString("DirectReplyModalFragment.subtitle_string");
        r0.getString("DirectReplyModalFragment.response_string");
        r15 = r0.getString("DirectReplyModalFragment.poll_vote");
        r0.getString("DirectReplyModalFragment.quiz_vote");
        r0.getString("DirectReplyModalFragment.slider_vote");
        r6 = new X.P1Q(r7, r8, r9, r10, r11, r12, r13, r0.getString("DirectReplyModalFragment.interactive_sticker_type"), r15, r0.getString("DirectReplyModalFragment.interactive_sticker_id"), r0.getString("DirectReplyModalFragment.question_response_type"), r0.getString("DirectReplyModalFragment.avatar_reaction_url"), r0.getString("DirectReplyModalFragment.emoji_reaction_unicode"), r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x018f, code lost:
        if (r9.equals(r1) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0191, code lost:
        r6 = new X.C50392Fav(r7, r8, r9, X.JTP.A0m(r0, "DirectReplyModalFragment.reel_id"), X.JTP.A0m(r0, "DirectReplyModalFragment.reel_item_id"), r12, r13, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01a5, code lost:
        if (r9.equals(r1) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a7, code lost:
        r6 = new X.C50391Fau(r7, r8, r9, X.JTP.A0m(r0, "DirectReplyModalFragment.content_id"), r12, r13, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b6, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C74468PvO A00(android.os.Bundle r17, com.instagram.common.session.UserSession r18, X.C74239PrS r19, java.lang.String r20) {
        /*
            r3 = 0
            r8 = r18
            X.0qQ.A0B(r8, r3)
            boolean r4 = X.DbW.A1Z(r19)
            java.lang.String r2 = "DirectReplyModalFragment.source_module_name"
            java.lang.String r1 = ""
            r0 = r17
            java.lang.String r1 = X.DbT.A0w(r0, r2, r1)
            X.0xG r7 = X.DbS.A0O(r1)
            java.lang.String r1 = "DirectReplyModalFragment.user_id_to_send_message_to"
            java.lang.String r12 = r0.getString(r1)
            java.lang.String r1 = "DirectReplyModalFragment.send_attribution_postfix"
            java.lang.String r13 = r0.getString(r1)
            java.lang.String r1 = "ClickToMessagingOnFeedBottomSheetFragment.should_send_attachment"
            boolean r15 = r0.getBoolean(r1, r4)
            java.lang.String r1 = "ClickToMessagingOnFeedBottomSheetFragment.ad_id"
            java.lang.String r14 = r0.getString(r1)
            r9 = r20
            int r1 = r9.hashCode()
            java.lang.String r4 = "DirectReplyModalFragment.reel_item_id"
            java.lang.String r5 = "DirectReplyModalFragment.content_id"
            java.lang.String r6 = "DirectReplyModalFragment.message_recipient_user_id"
            java.lang.String r2 = "DirectReplyModalFragment.reel_id"
            switch(r1) {
                case -2118202260: goto L_0x019f;
                case -2016043051: goto L_0x0189;
                case -1769856800: goto L_0x0186;
                case -1611967061: goto L_0x0126;
                case -1594935902: goto L_0x0123;
                case -1585172748: goto L_0x0120;
                case -1572212206: goto L_0x011d;
                case -1538544051: goto L_0x0115;
                case -1427335741: goto L_0x0111;
                case -1177171041: goto L_0x010e;
                case -1036567346: goto L_0x00fb;
                case -745312661: goto L_0x00f3;
                case -371454415: goto L_0x00ef;
                case -364815552: goto L_0x00ec;
                case -191571497: goto L_0x00e8;
                case -155335178: goto L_0x00cf;
                case 178011770: goto L_0x00c7;
                case 236585518: goto L_0x00a6;
                case 542936960: goto L_0x008f;
                case 660585421: goto L_0x008b;
                case 830001742: goto L_0x0087;
                case 884871936: goto L_0x0068;
                case 1103084904: goto L_0x0064;
                case 1126372533: goto L_0x0060;
                case 1386868267: goto L_0x005c;
                case 1469076478: goto L_0x0058;
                case 1501975872: goto L_0x0054;
                case 1526289629: goto L_0x0050;
                case 2103859248: goto L_0x0048;
                default: goto L_0x0041;
            }
        L_0x0041:
            java.lang.String r0 = "Unknown entry point type "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TF.A0W(r0, r9)
            throw r0
        L_0x0048:
            r1 = 2900(0xb54, float:4.064E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x01a1
        L_0x0050:
            java.lang.String r1 = "story_poll_vote_list"
            goto L_0x0128
        L_0x0054:
            java.lang.String r1 = "lead_ads_message_reply"
            goto L_0x01a1
        L_0x0058:
            java.lang.String r1 = "single_media_cta"
            goto L_0x01a1
        L_0x005c:
            java.lang.String r1 = "row_cta"
            goto L_0x01a1
        L_0x0060:
            java.lang.String r1 = "stories_viewers"
            goto L_0x0128
        L_0x0064:
            java.lang.String r1 = "like_cta"
            goto L_0x01a1
        L_0x0068:
            java.lang.String r1 = "message_merchant"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0041
            java.lang.Class<com.instagram.user.model.Product> r2 = com.instagram.user.model.Product.class
            java.lang.String r1 = "DirectReplyModalFragment.product"
            android.os.Parcelable r2 = X.C320236s2.A00(r0, r2, r1)
            com.instagram.user.model.Product r2 = (com.instagram.user.model.Product) r2
            java.lang.String r1 = "DirectReplyModalFragment.submodule_name"
            java.lang.String r0 = X.JTP.A0m(r0, r1)
            X.P1N r6 = new X.P1N
            r6.<init>(r7, r8, r2, r0)
            goto L_0x01b4
        L_0x0087:
            java.lang.String r1 = "search_grid_cta"
            goto L_0x01a1
        L_0x008b:
            java.lang.String r1 = "story_question_response_list"
            goto L_0x0128
        L_0x008f:
            r1 = 288(0x120, float:4.04E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0041
            java.lang.String r0 = X.JTP.A0m(r0, r6)
            X.P1M r6 = new X.P1M
            r6.<init>(r7, r8, r9, r0)
            goto L_0x01b4
        L_0x00a6:
            java.lang.String r1 = "reel_mentions_sheet"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0041
            java.lang.String r11 = X.JTP.A0m(r0, r6)
            java.lang.String r1 = "DirectReplyModalFragment.custom_module_name"
            java.lang.String r9 = X.JTP.A0m(r0, r1)
            java.lang.String r10 = r0.getString(r2)
            java.lang.String r12 = r0.getString(r5)
            X.P1O r6 = new X.P1O
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x01b4
        L_0x00c7:
            r1 = 1716(0x6b4, float:2.405E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x01a1
        L_0x00cf:
            java.lang.String r1 = "private_reply_message"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0041
            java.lang.Class<com.instagram.direct.intf.DirectReplyModalPrivateReplyInfo> r2 = com.instagram.direct.intf.DirectReplyModalPrivateReplyInfo.class
            java.lang.String r1 = "DirectReplyModalFragment.private_reply_info"
            android.os.Parcelable r0 = X.C320236s2.A00(r0, r2, r1)
            com.instagram.direct.intf.DirectReplyModalPrivateReplyInfo r0 = (com.instagram.direct.intf.DirectReplyModalPrivateReplyInfo) r0
            X.P1P r6 = new X.P1P
            r6.<init>(r7, r8, r0, r9)
            goto L_0x01b4
        L_0x00e8:
            java.lang.String r1 = "feed_ufi"
            goto L_0x01a1
        L_0x00ec:
            java.lang.String r1 = "story_comment_reply"
            goto L_0x0128
        L_0x00ef:
            java.lang.String r1 = "comment_detail"
            goto L_0x01a1
        L_0x00f3:
            r1 = 3851(0xf0b, float:5.396E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x018b
        L_0x00fb:
            java.lang.String r1 = "activity_feed"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0041
            java.lang.String r0 = X.JTP.A0m(r0, r6)
            X.P1L r6 = new X.P1L
            r6.<init>(r7, r8, r9, r0)
            goto L_0x01b4
        L_0x010e:
            java.lang.String r1 = "story_quiz_answer_list"
            goto L_0x0128
        L_0x0111:
            java.lang.String r1 = "explore_grid_cta"
            goto L_0x01a1
        L_0x0115:
            r1 = 3115(0xc2b, float:4.365E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            goto L_0x01a1
        L_0x011d:
            java.lang.String r1 = "reel_dashboard_reactor"
            goto L_0x0128
        L_0x0120:
            java.lang.String r1 = "clips_cta"
            goto L_0x01a1
        L_0x0123:
            java.lang.String r1 = "reel_dashboard_viewer"
            goto L_0x0128
        L_0x0126:
            java.lang.String r1 = "story_slider_answer_list"
        L_0x0128:
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0041
            java.lang.String r1 = "DirectReplyModalFragment.viewer_user_id"
            java.lang.String r10 = X.JTP.A0m(r0, r1)
            java.lang.String r11 = X.JTP.A0m(r0, r2)
            java.lang.String r12 = X.JTP.A0m(r0, r4)
            java.lang.String r1 = "DirectReplyModalFragment.is_archive_reel"
            r0.getBoolean(r1)
            java.lang.String r1 = "DirectReplyModalFragment.has_story_like"
            boolean r20 = r0.getBoolean(r1, r3)
            java.lang.String r1 = "DirectReplyModalFragment.subtitle_string"
            java.lang.String r13 = r0.getString(r1)
            java.lang.String r1 = "DirectReplyModalFragment.response_string"
            r0.getString(r1)
            java.lang.String r1 = "DirectReplyModalFragment.poll_vote"
            java.lang.String r15 = r0.getString(r1)
            java.lang.String r1 = "DirectReplyModalFragment.quiz_vote"
            r0.getString(r1)
            java.lang.String r1 = "DirectReplyModalFragment.slider_vote"
            r0.getString(r1)
            java.lang.String r1 = "DirectReplyModalFragment.interactive_sticker_id"
            java.lang.String r16 = r0.getString(r1)
            java.lang.String r1 = "DirectReplyModalFragment.interactive_sticker_type"
            java.lang.String r14 = r0.getString(r1)
            java.lang.String r1 = "DirectReplyModalFragment.question_response_type"
            java.lang.String r17 = r0.getString(r1)
            java.lang.String r1 = "DirectReplyModalFragment.avatar_reaction_url"
            java.lang.String r18 = r0.getString(r1)
            java.lang.String r1 = "DirectReplyModalFragment.emoji_reaction_unicode"
            java.lang.String r19 = r0.getString(r1)
            X.P1Q r6 = new X.P1Q
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x01b4
        L_0x0186:
            java.lang.String r1 = "sharesheet"
            goto L_0x01a1
        L_0x0189:
            java.lang.String r1 = "reel_profile_cta"
        L_0x018b:
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0041
            java.lang.String r10 = X.JTP.A0m(r0, r2)
            java.lang.String r11 = X.JTP.A0m(r0, r4)
            X.Fav r6 = new X.Fav
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x01b4
        L_0x019f:
            java.lang.String r1 = "website_cta"
        L_0x01a1:
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0041
            java.lang.String r10 = X.JTP.A0m(r0, r5)
            X.Fau r6 = new X.Fau
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x01b4:
            X.PvO r6 = (X.C74468PvO) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OS7.A00(android.os.Bundle, com.instagram.common.session.UserSession, X.PrS, java.lang.String):X.PvO");
    }
}
