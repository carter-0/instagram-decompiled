package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.hallpass.model.HallPassViewModel;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Collection;

public final class E7Y extends MYR implements C273494mf, C273414mX {
    public static final String __redex_internal_original_name = "HallPassListFragment";
    public View A00;
    public View A01;
    public IgTextView A02;
    public IgTextView A03;
    public C51906G7a A04;
    public C2366734q A05;
    public IgdsButton A06;
    public String A07;
    public boolean A08;
    public boolean A09 = true;
    public boolean A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F = C227642jf.A02(this);

    public final void A0C(HallPassViewModel hallPassViewModel) {
        AnonymousClass0eM r5 = this.A0F;
        27r A012 = 27p.A01(AnonymousClass7TE.A0l(r5));
        String str = hallPassViewModel.A04;
        0qQ.A0B(str, 0);
        Long A10 = AnonymousClass7TE.A10(str);
        String str2 = hallPassViewModel.A05;
        A012.A1i(A10, "GROUP_STORY_MEMBERSHIP_VIEW_BUTTON", str2);
        C49957FGp.A05(requireActivity(), AnonymousClass7TE.A0l(r5), str, str2);
        this.A0D = true;
    }

    public final void A0D(HallPassViewModel hallPassViewModel) {
        String str = this.A0B;
        HallPassViewModel hallPassViewModel2 = hallPassViewModel;
        if (str != null) {
            C2366734q r9 = this.A05;
            if (r9 == null) {
                0qQ.A0F("hallPassLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            r9.A00((EZX) null, AnonymousClass05K.A15, (Integer) null, (String) null, (String) null, (String) null, (String) null, hallPassViewModel2.A04, hallPassViewModel2.A05, str);
        }
        AnonymousClass0eM r5 = this.A0F;
        27r A012 = 27p.A01(AnonymousClass7TE.A0l(r5));
        String str2 = hallPassViewModel2.A04;
        0qQ.A0B(str2, 0);
        Long A10 = AnonymousClass7TE.A10(str2);
        String str3 = hallPassViewModel2.A05;
        A012.A1i(A10, "SHARED_LISTS_VIEW_MEMBERS_BUTTON", str3);
        C49957FGp.A06(requireActivity(), AnonymousClass7TE.A0l(r5), str2, str3, false);
        this.A0D = true;
    }

    public final /* synthetic */ void Cyf() {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "hall_pass_list";
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new MPA(this, 2));
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x021a, code lost:
        r0 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0227, code lost:
        if (r1.equals(r13) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0229, code lost:
        r0 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0232, code lost:
        if (r1.equals(r12) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0234, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x023c, code lost:
        if (r1.equals(r11) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x023e, code lost:
        r0 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0246, code lost:
        if (r1.equals(r10) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0248, code lost:
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0254, code lost:
        if (r1.equals(r9) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0256, code lost:
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x025e, code lost:
        if (r1.equals(r8) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0260, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0268, code lost:
        if (r1.equals(r7) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x026a, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0276, code lost:
        if (r1.equals(r6) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0278, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0280, code lost:
        if (r1.equals(r4) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0282, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x028d, code lost:
        if (r1.equals(r2) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x028f, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02ae, code lost:
        if (r1.equals(r3) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02b0, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0082, code lost:
        throw X.AnonymousClass7TE.A0w(X.002.A0g("invalid argument ", r1, " does not exist within the typedef"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x008d, code lost:
        if (r1.equals(r15) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x020e, code lost:
        if (r1.equals(r0) != false) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0218, code lost:
        if (r1.equals(r14) == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x008f, code lost:
        r0 = r15;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r27, android.os.Bundle r28) {
        /*
            r26 = this;
            r2 = 0
            r1 = r27
            X.0qQ.A0B(r1, r2)
            r5 = r26
            r0 = r28
            super.onViewCreated(r1, r0)
            android.os.Bundle r1 = r5.requireArguments()
            java.lang.String r0 = "hall_pass_id"
            java.lang.String r25 = r1.getString(r0)
            java.lang.String r0 = "is_from_share_cut"
            boolean r0 = r1.getBoolean(r0, r2)
            r5.A08 = r0
            r0 = 53
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x02a6
            int r24 = r1.hashCode()
            java.lang.String r0 = "ig_story_item_insights_action"
            java.lang.String r15 = "ig_story_item_pending_upload_cancel_upload_action"
            java.lang.String r14 = "shared_list_add_story_footer"
            r2 = 3299(0xce3, float:4.623E-42)
            java.lang.String r13 = X.AnonymousClass000.A00(r2)
            java.lang.String r12 = "ig_story_item_external_sharing_share_highlight_via_system_share_action"
            r2 = 3301(0xce5, float:4.626E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r2)
            r2 = 2849(0xb21, float:3.992E-42)
            java.lang.String r10 = X.C273654mx.A00(r2)
            java.lang.String r9 = "ig_story_item_delete_music_pick_template_action"
            r2 = 2321(0x911, float:3.252E-42)
            java.lang.String r8 = X.C273654mx.A00(r2)
            java.lang.String r7 = "ig_story_item_highlight_edit_highlight_action"
            java.lang.String r6 = "shared_lists_consumption_sheet"
            java.lang.String r4 = "avatar_qr_plus_button"
            java.lang.String r3 = "ig_story_item_view_ai_info_action"
            java.lang.String r23 = "magic_mod_restyle_get_notified_button"
            java.lang.String r22 = "ig_story_item_chain_garden_pog_click_action"
            java.lang.String r21 = "ig_story_item_share_to_feed_action"
            r2 = 646(0x286, float:9.05E-43)
            java.lang.String r20 = X.C66579MXk.A00(r2)
            java.lang.String r19 = "ig_story_item_fact_check_action"
            r2 = 2320(0x910, float:3.251E-42)
            java.lang.String r18 = X.C273654mx.A00(r2)
            java.lang.String r17 = "ig_story_item_media_deletion_delete_story_action"
            java.lang.String r16 = "ig_story_item_pending_upload_discard_photo_action"
            java.lang.String r2 = "ig_group_story_tray_arrow_entry"
            switch(r24) {
                case -2119533442: goto L_0x0289;
                case -2104552999: goto L_0x02a8;
                case -2038230689: goto L_0x02a3;
                case -2035453356: goto L_0x02a0;
                case -1987886049: goto L_0x029d;
                case -1985333067: goto L_0x029a;
                case -1967279020: goto L_0x0297;
                case -1828996081: goto L_0x0294;
                case -1800820704: goto L_0x0291;
                case -1716551095: goto L_0x02aa;
                case -1712658433: goto L_0x027c;
                case -1711745097: goto L_0x0272;
                case -1685002742: goto L_0x0264;
                case -1650599731: goto L_0x025a;
                case -1621733302: goto L_0x0250;
                case -1599839957: goto L_0x0242;
                case -1516054938: goto L_0x0238;
                case -1483718540: goto L_0x022e;
                case -1442966422: goto L_0x0223;
                case -1357049814: goto L_0x0214;
                case -1281164252: goto L_0x0089;
                case -1267616071: goto L_0x020a;
                case -1163016568: goto L_0x0287;
                case -1110536842: goto L_0x0284;
                case -1099018018: goto L_0x027a;
                case -1094773803: goto L_0x026c;
                case -1030496362: goto L_0x0262;
                case -941839555: goto L_0x0258;
                case -842149748: goto L_0x024a;
                case -823502190: goto L_0x0240;
                case -815911399: goto L_0x0236;
                case -752423168: goto L_0x022c;
                case -697493813: goto L_0x021d;
                case -696875583: goto L_0x0212;
                case -693314613: goto L_0x0083;
                case -662167807: goto L_0x0208;
                case -600021634: goto L_0x0205;
                case -597149348: goto L_0x0202;
                case -588012404: goto L_0x01fb;
                case -579759082: goto L_0x01f8;
                case -553497351: goto L_0x01f5;
                case -540284793: goto L_0x01ee;
                case -480018108: goto L_0x01e7;
                case -457954643: goto L_0x01e0;
                case -437832854: goto L_0x01d9;
                case -364533392: goto L_0x01d6;
                case -302885953: goto L_0x01cf;
                case -225907570: goto L_0x01cc;
                case -189560410: goto L_0x01c9;
                case -173613794: goto L_0x01c6;
                case -163205249: goto L_0x01c3;
                case -91274939: goto L_0x01c0;
                case -85450262: goto L_0x01bd;
                case -80114392: goto L_0x01ba;
                case -69035351: goto L_0x01b7;
                case -32113486: goto L_0x01b4;
                case 9985582: goto L_0x01ad;
                case 40989896: goto L_0x01aa;
                case 71608775: goto L_0x01a3;
                case 103928669: goto L_0x01a0;
                case 108472349: goto L_0x019d;
                case 190122064: goto L_0x0196;
                case 205895131: goto L_0x0193;
                case 220609391: goto L_0x0190;
                case 254020012: goto L_0x018d;
                case 262609789: goto L_0x018a;
                case 283985964: goto L_0x0186;
                case 285574918: goto L_0x0182;
                case 310227821: goto L_0x017e;
                case 373002346: goto L_0x017a;
                case 376653680: goto L_0x0176;
                case 443272228: goto L_0x0172;
                case 460139863: goto L_0x016a;
                case 554181252: goto L_0x0162;
                case 582415626: goto L_0x015e;
                case 585579101: goto L_0x015a;
                case 657576306: goto L_0x0152;
                case 679350074: goto L_0x014a;
                case 703096823: goto L_0x0146;
                case 852880408: goto L_0x0142;
                case 886263359: goto L_0x013e;
                case 906852310: goto L_0x013a;
                case 910679242: goto L_0x0136;
                case 928388367: goto L_0x0132;
                case 935187175: goto L_0x012e;
                case 947347183: goto L_0x012a;
                case 961050535: goto L_0x0126;
                case 1095282182: goto L_0x0122;
                case 1111533493: goto L_0x011e;
                case 1113707032: goto L_0x011a;
                case 1117907987: goto L_0x0116;
                case 1132456348: goto L_0x010e;
                case 1137947020: goto L_0x010a;
                case 1224814208: goto L_0x0106;
                case 1275690477: goto L_0x0102;
                case 1365998974: goto L_0x00fa;
                case 1409626345: goto L_0x00f6;
                case 1444231014: goto L_0x00f2;
                case 1454275442: goto L_0x00ee;
                case 1455657874: goto L_0x00ea;
                case 1471468916: goto L_0x00e6;
                case 1535288039: goto L_0x00e2;
                case 1594862573: goto L_0x00de;
                case 1608682434: goto L_0x00da;
                case 1616471398: goto L_0x00d6;
                case 1702080847: goto L_0x00d2;
                case 1712484821: goto L_0x00ce;
                case 1724215734: goto L_0x00c6;
                case 1763893819: goto L_0x00c2;
                case 1846866689: goto L_0x00be;
                case 1873911949: goto L_0x00ba;
                case 1879640106: goto L_0x00b6;
                case 1942870177: goto L_0x00b2;
                case 1976304622: goto L_0x00ae;
                case 1980230621: goto L_0x00a6;
                case 2019655748: goto L_0x00a2;
                case 2055216530: goto L_0x009e;
                case 2123234652: goto L_0x009a;
                case 2130109143: goto L_0x0096;
                case 2130658245: goto L_0x0092;
                default: goto L_0x0076;
            }
        L_0x0076:
            java.lang.String r2 = "invalid argument "
            java.lang.String r0 = " does not exist within the typedef"
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0083:
            r0 = 4060(0xfdc, float:5.689E-42)
            java.lang.String r15 = X.AnonymousClass000.A00(r0)
        L_0x0089:
            boolean r0 = r1.equals(r15)
            if (r0 == 0) goto L_0x0076
            r0 = r15
            goto L_0x02b1
        L_0x0092:
            java.lang.String r0 = "ig_story_item_share_to_close_friends_facebook_story_action"
            goto L_0x020a
        L_0x0096:
            java.lang.String r0 = "ig_story_item_igctm_ads_disclosure_action"
            goto L_0x020a
        L_0x009a:
            java.lang.String r0 = "ig_story_item_request_mention_action"
            goto L_0x020a
        L_0x009e:
            java.lang.String r0 = "ig_story_item_story_mention_settings_action"
            goto L_0x020a
        L_0x00a2:
            java.lang.String r0 = "ig_story_item_save_photo_action"
            goto L_0x020a
        L_0x00a6:
            r0 = 645(0x285, float:9.04E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            goto L_0x020a
        L_0x00ae:
            java.lang.String r0 = "ig_story_item_subscribe_to_story_action"
            goto L_0x020a
        L_0x00b2:
            java.lang.String r0 = "ig_story_item_lately_action"
            goto L_0x020a
        L_0x00b6:
            java.lang.String r0 = "ig_story_item_unfollow_action"
            goto L_0x020a
        L_0x00ba:
            java.lang.String r0 = "ig_story_item_view_viewers_action"
            goto L_0x020a
        L_0x00be:
            java.lang.String r0 = "add_yours_template_discovery_surface_viewed_stories"
            goto L_0x020a
        L_0x00c2:
            java.lang.String r0 = "ig_story_item_mute_action"
            goto L_0x020a
        L_0x00c6:
            r0 = 2852(0xb24, float:3.997E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x020a
        L_0x00ce:
            java.lang.String r0 = "ig_story_item_ads_update_ad_experience_action"
            goto L_0x020a
        L_0x00d2:
            java.lang.String r0 = "ig_story_item_see_less_action"
            goto L_0x020a
        L_0x00d6:
            java.lang.String r0 = "ig_story_item_adsabout_ads_action"
            goto L_0x020a
        L_0x00da:
            java.lang.String r0 = "ig_story_item_view_link_action"
            goto L_0x020a
        L_0x00de:
            java.lang.String r0 = "ig_story_item_add_mentions_action"
            goto L_0x020a
        L_0x00e2:
            java.lang.String r0 = "ig_story_item_story_settings_action"
            goto L_0x020a
        L_0x00e6:
            java.lang.String r0 = "ig_story_item_branded_content_add_brand_partners_action"
            goto L_0x020a
        L_0x00ea:
            java.lang.String r0 = "ig_group_story_tray_arrow_exit"
            goto L_0x020a
        L_0x00ee:
            java.lang.String r0 = "ess_story_reshare_profile"
            goto L_0x020a
        L_0x00f2:
            java.lang.String r0 = "ig_story_item_branded_content_about_story_item_action"
            goto L_0x020a
        L_0x00f6:
            java.lang.String r0 = "ig_story_item_save_whole_story_action"
            goto L_0x020a
        L_0x00fa:
            r0 = 644(0x284, float:9.02E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            goto L_0x020a
        L_0x0102:
            java.lang.String r0 = "ig_story_item_mute_fan_club_teaser_action"
            goto L_0x020a
        L_0x0106:
            java.lang.String r0 = "ess_reshare_card_view_profile_button"
            goto L_0x020a
        L_0x010a:
            java.lang.String r0 = "ig_story_item_branded_content_remove_me_story_item_action"
            goto L_0x020a
        L_0x010e:
            r0 = 3375(0xd2f, float:4.73E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x020a
        L_0x0116:
            java.lang.String r0 = "ig_story_item_see_more_action"
            goto L_0x020a
        L_0x011a:
            java.lang.String r0 = "ig_story_item_save_options_action"
            goto L_0x020a
        L_0x011e:
            java.lang.String r0 = "ig_story_item_unsubscribe_to_story_action"
            goto L_0x020a
        L_0x0122:
            java.lang.String r0 = "ig_story_item_turn_off_story_comments_action"
            goto L_0x020a
        L_0x0126:
            java.lang.String r0 = "shared_lists_restrict_user_button"
            goto L_0x020a
        L_0x012a:
            java.lang.String r0 = "ig_group_story_tray_swipe_entry"
            goto L_0x020a
        L_0x012e:
            java.lang.String r0 = "shared_list_sharecut_button"
            goto L_0x020a
        L_0x0132:
            java.lang.String r0 = "ig_story_item_live_preview_watch_action"
            goto L_0x020a
        L_0x0136:
            java.lang.String r0 = "ig_story_item_reshare_action"
            goto L_0x020a
        L_0x013a:
            java.lang.String r0 = "magic_mod_backdrop_get_notified_button"
            goto L_0x020a
        L_0x013e:
            java.lang.String r0 = "ig_group_story_end_card"
            goto L_0x020a
        L_0x0142:
            java.lang.String r0 = "ig_story_item_turn_on_story_comments_action"
            goto L_0x020a
        L_0x0146:
            java.lang.String r0 = "ig_story_item_ineligible_to_fb_share_action"
            goto L_0x020a
        L_0x014a:
            r0 = 2850(0xb22, float:3.994E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x020a
        L_0x0152:
            r0 = 2308(0x904, float:3.234E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x020a
        L_0x015a:
            java.lang.String r0 = "ig_story_item_remove_ad_from_ad_activity_action"
            goto L_0x020a
        L_0x015e:
            java.lang.String r0 = "ig_story_item_account_transparency_action"
            goto L_0x020a
        L_0x0162:
            r0 = 3023(0xbcf, float:4.236E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x020a
        L_0x016a:
            r0 = 2319(0x90f, float:3.25E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x020a
        L_0x0172:
            java.lang.String r0 = "ig_story_item_edit_ai_label_action"
            goto L_0x020a
        L_0x0176:
            java.lang.String r0 = "ig_story_item_pending_upload_discard_video_action"
            goto L_0x020a
        L_0x017a:
            java.lang.String r0 = "ig_story_item_pause_story_action"
            goto L_0x020a
        L_0x017e:
            java.lang.String r0 = "ig_story_item_more_menu_action"
            goto L_0x020a
        L_0x0182:
            java.lang.String r0 = "ig_story_item_highlight_copy_string_action"
            goto L_0x020a
        L_0x0186:
            java.lang.String r0 = "reply_composer_tap_voice_icon"
            goto L_0x020a
        L_0x018a:
            java.lang.String r0 = "ess_su_card_profile"
            goto L_0x020a
        L_0x018d:
            java.lang.String r0 = "ig_story_item_branded_content_manage_partnerships_action"
            goto L_0x020a
        L_0x0190:
            java.lang.String r0 = "shared_lists_invitation_nux"
            goto L_0x020a
        L_0x0193:
            java.lang.String r0 = "ig_story_item_save_video_action"
            goto L_0x020a
        L_0x0196:
            r0 = 3302(0xce6, float:4.627E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x020a
        L_0x019d:
            java.lang.String r0 = "ig_story_item_branded_content_edit_brand_partners_action"
            goto L_0x020a
        L_0x01a0:
            java.lang.String r0 = "ig_story_item_archive_now_action"
            goto L_0x020a
        L_0x01a3:
            r0 = 2816(0xb00, float:3.946E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x020a
        L_0x01aa:
            java.lang.String r0 = "ig_story_item_report_ad_action"
            goto L_0x020a
        L_0x01ad:
            r0 = 3300(0xce4, float:4.624E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x020a
        L_0x01b4:
            java.lang.String r0 = "ig_story_item_share_as_post_or_reel_action"
            goto L_0x020a
        L_0x01b7:
            java.lang.String r0 = "ig_story_item_delete_action"
            goto L_0x020a
        L_0x01ba:
            java.lang.String r0 = "ig_story_item_copy_link_to_story_action"
            goto L_0x020a
        L_0x01bd:
            java.lang.String r0 = "share_to_friends_story_viewer_attribution_bottom_sheet_user"
            goto L_0x020a
        L_0x01c0:
            java.lang.String r0 = "ig_story_item_ads_waist_action"
            goto L_0x020a
        L_0x01c3:
            java.lang.String r0 = "ig_story_item_external_sharing_share_via_system_share_action"
            goto L_0x020a
        L_0x01c6:
            java.lang.String r0 = "ess_reshare_card_follow_button"
            goto L_0x020a
        L_0x01c9:
            java.lang.String r0 = "ig_story_item_media_deletion_restore_story_action"
            goto L_0x020a
        L_0x01cc:
            java.lang.String r0 = "profile_tray_shared_lists"
            goto L_0x020a
        L_0x01cf:
            r0 = 1591(0x637, float:2.23E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x020a
        L_0x01d6:
            java.lang.String r0 = "shared_lists_block_user_button"
            goto L_0x020a
        L_0x01d9:
            r0 = 2853(0xb25, float:3.998E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x020a
        L_0x01e0:
            r0 = 3019(0xbcb, float:4.23E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x020a
        L_0x01e7:
            r0 = 1590(0x636, float:2.228E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x020a
        L_0x01ee:
            r0 = 3589(0xe05, float:5.029E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x020a
        L_0x01f5:
            java.lang.String r0 = "ig_story_item_none"
            goto L_0x020a
        L_0x01f8:
            java.lang.String r0 = "ig_story_item_promote_action"
            goto L_0x020a
        L_0x01fb:
            r0 = 1437(0x59d, float:2.014E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x020a
        L_0x0202:
            java.lang.String r0 = "ig_story_item_remove_from_highlight_action"
            goto L_0x020a
        L_0x0205:
            java.lang.String r0 = "ig_story_item_delete_story_template_action"
            goto L_0x020a
        L_0x0208:
            java.lang.String r0 = "ig_group_story_tray_swipe_exit"
        L_0x020a:
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L_0x02b1
            goto L_0x0076
        L_0x0212:
            java.lang.String r14 = "ig_story_item_browse_carousel_action"
        L_0x0214:
            boolean r0 = r1.equals(r14)
            if (r0 == 0) goto L_0x0076
            r0 = r14
            goto L_0x02b1
        L_0x021d:
            r0 = 307(0x133, float:4.3E-43)
            java.lang.String r13 = X.AnonymousClass000.A00(r0)
        L_0x0223:
            boolean r0 = r1.equals(r13)
            if (r0 == 0) goto L_0x0076
            r0 = r13
            goto L_0x02b1
        L_0x022c:
            java.lang.String r12 = "ig_story_item_report_action"
        L_0x022e:
            boolean r0 = r1.equals(r12)
            if (r0 == 0) goto L_0x0076
            r0 = r12
            goto L_0x02b1
        L_0x0236:
            java.lang.String r11 = "imagine_try_it_button"
        L_0x0238:
            boolean r0 = r1.equals(r11)
            if (r0 == 0) goto L_0x0076
            r0 = r11
            goto L_0x02b1
        L_0x0240:
            java.lang.String r10 = "story_viewer_mention_back_button"
        L_0x0242:
            boolean r0 = r1.equals(r10)
            if (r0 == 0) goto L_0x0076
            r0 = r10
            goto L_0x02b1
        L_0x024a:
            r0 = 2866(0xb32, float:4.016E-42)
            java.lang.String r9 = X.C273654mx.A00(r0)
        L_0x0250:
            boolean r0 = r1.equals(r9)
            if (r0 == 0) goto L_0x0076
            r0 = r9
            goto L_0x02b1
        L_0x0258:
            java.lang.String r8 = "story_viewer_mention_reshare_button"
        L_0x025a:
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x0076
            r0 = r8
            goto L_0x02b1
        L_0x0262:
            java.lang.String r7 = "ig_story_item_hide_ad_action"
        L_0x0264:
            boolean r0 = r1.equals(r7)
            if (r0 == 0) goto L_0x0076
            r0 = r7
            goto L_0x02b1
        L_0x026c:
            r0 = 2851(0xb23, float:3.995E-42)
            java.lang.String r6 = X.C273654mx.A00(r0)
        L_0x0272:
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L_0x0076
            r0 = r6
            goto L_0x02b1
        L_0x027a:
            java.lang.String r4 = "ig_story_item_move_to_close_friends_action"
        L_0x027c:
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x0076
            r0 = r4
            goto L_0x02b1
        L_0x0284:
            java.lang.String r3 = "ig_story_item_ads_debug_ad_action"
            goto L_0x02aa
        L_0x0287:
            java.lang.String r2 = "ig_story_item_media_re_shared_settings_action"
        L_0x0289:
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L_0x0076
            r0 = r2
            goto L_0x02b1
        L_0x0291:
            r3 = r23
            goto L_0x02aa
        L_0x0294:
            r3 = r22
            goto L_0x02aa
        L_0x0297:
            r3 = r21
            goto L_0x02aa
        L_0x029a:
            r3 = r20
            goto L_0x02aa
        L_0x029d:
            r3 = r19
            goto L_0x02aa
        L_0x02a0:
            r3 = r18
            goto L_0x02aa
        L_0x02a3:
            r3 = r17
            goto L_0x02aa
        L_0x02a6:
            r0 = 0
            goto L_0x02b1
        L_0x02a8:
            r3 = r16
        L_0x02aa:
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L_0x0076
            r0 = r3
        L_0x02b1:
            r5.A0B = r0
            android.view.View r1 = r5.requireView()
            r0 = 2131439345(0x7f0b2ef1, float:1.8500643E38)
            android.view.View r4 = X.AnonymousClass7TF.A0F(r1, r0)
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            X.4gb r3 = new X.4gb
            r3.<init>()
            r3.A0I(r4)
            r2 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            r1 = 1
            X.6rh r0 = X.C270354gb.A02(r3, r2)
            X.6rk r0 = r0.A03
            r0.A0z = r1
            android.content.Context r0 = r5.requireContext()
            int r0 = X.AnonymousClass0nB.A00(r0)
            float r1 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            int r1 = (int) r1
            X.6rh r0 = X.C270354gb.A02(r3, r2)
            X.6rk r0 = r0.A03
            r0.A0W = r1
            r3.A0G(r4)
            android.view.View r1 = r5.requireView()
            r0 = 2131432364(0x7f0b13ac, float:1.8486483E38)
            android.view.View r1 = r1.requireViewById(r0)
            r5.A00 = r1
            X.G7a r0 = r5.A04
            if (r0 == 0) goto L_0x030e
            if (r1 != 0) goto L_0x0309
            java.lang.String r4 = "emptyState"
        L_0x0301:
            X.0qQ.A0F(r4)
        L_0x0304:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0309:
            r0 = 31
            X.FP1.A01(r1, r0, r5)
        L_0x030e:
            android.view.View r1 = r5.requireView()
            r0 = 2131441185(0x7f0b3621, float:1.8504374E38)
            android.view.View r0 = r1.requireViewById(r0)
            r5.A01 = r0
            android.view.View r1 = r5.requireView()
            r0 = 2131428521(0x7f0b04a9, float:1.8478689E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r1, r0)
            android.view.View r1 = r5.requireView()
            r0 = 2131442865(0x7f0b3cb1, float:1.8507782E38)
            android.widget.TextView r7 = X.AnonymousClass7TG.A0R(r1, r0)
            android.view.View r1 = r5.requireView()
            r0 = 2131430946(0x7f0b0e22, float:1.8483607E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r1, r0)
            r5.A02 = r0
            android.view.View r1 = r5.requireView()
            r0 = 2131431430(0x7f0b1006, float:1.8484589E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r1, r0)
            r5.A03 = r0
            boolean r0 = r5.A08
            r4 = 0
            r3 = 8
            int r0 = X.DbW.A00(r0)
            r2.setVisibility(r0)
            r0 = 32
            X.FP1.A01(r2, r0, r5)
            boolean r0 = r5.A0A
            java.lang.String r6 = "hallPassDescription"
            java.lang.String r2 = "createButton"
            if (r0 == 0) goto L_0x03ea
            android.content.Context r1 = r5.requireContext()
            r0 = 2131954717(0x7f130c1d, float:1.9545941E38)
            X.DbT.A18(r1, r7, r0)
            com.instagram.common.ui.base.IgTextView r0 = r5.A03
            if (r0 == 0) goto L_0x044a
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r0 = r5.A02
            if (r0 == 0) goto L_0x044f
            r0.setVisibility(r3)
        L_0x037c:
            android.view.View r0 = r5.requireView()
            r3 = 2131433757(0x7f0b191d, float:1.8489309E38)
            com.instagram.igds.components.button.IgdsButton r2 = X.DbU.A0b(r0, r3)
            r5.A06 = r2
            java.lang.String r4 = "shareButton"
            if (r2 == 0) goto L_0x0301
            X.G7a r1 = r5.A04
            r0 = 8
            if (r1 == 0) goto L_0x0394
            r0 = 0
        L_0x0394:
            r2.setVisibility(r0)
            com.instagram.igds.components.button.IgdsButton r1 = r5.A06
            if (r1 == 0) goto L_0x0301
            r0 = 2131963281(0x7f132d91, float:1.956331E38)
            r1.setText((int) r0)
            com.instagram.igds.components.button.IgdsButton r1 = r5.A06
            if (r1 == 0) goto L_0x0301
            r0 = 34
            X.FP1.A01(r1, r0, r5)
            android.view.View r0 = r5.requireView()
            android.view.View r1 = X.AnonymousClass7TF.A0G(r0, r3)
            java.lang.String r0 = r5.A07
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r1.setEnabled(r0)
            X.0eM r4 = r5.A0E
            java.lang.Object r0 = r4.getValue()
            X.Dkr r0 = (X.C46764Dkr) r0
            X.2Fk r3 = r0.A00
            X.07Z r2 = r5.getViewLifecycleOwner()
            r0 = 3
            X.MPA r1 = new X.MPA
            r1.<init>(r5, r0)
            r0 = 59
            X.Dba.A15(r2, r3, r1, r0)
            X.2YL r5 = X.DbS.A0H(r4)
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 46
            X.MFW r1 = new X.MFW
            r0 = r25
            r1.<init>(r5, r0, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
            return
        L_0x03ea:
            com.instagram.common.ui.base.IgTextView r1 = r5.A02
            if (r1 == 0) goto L_0x044f
            X.G7a r0 = r5.A04
            if (r0 != 0) goto L_0x03f4
            r4 = 8
        L_0x03f4:
            r1.setVisibility(r4)
            com.instagram.common.ui.base.IgTextView r1 = r5.A02
            if (r1 == 0) goto L_0x044f
            r0 = 33
            X.FP1.A01(r1, r0, r5)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131963266(0x7f132d82, float:1.956328E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r1, r0)
            android.content.Context r1 = r5.requireContext()
            r0 = 2131963259(0x7f132d7b, float:1.9563266E38)
            java.lang.String r0 = r1.getString(r0)
            android.text.SpannableStringBuilder r3 = X.DbZ.A0B(r0, r4)
            android.content.Context r2 = r5.requireContext()
            android.content.Context r1 = r5.getContext()
            r0 = 2130970224(0x7f040670, float:1.7549152E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r1 = r2.getColor(r0)
            X.ESx r0 = new X.ESx
            r0.<init>((X.E7Y) r5, (int) r1)
            X.0qQ.A0A(r3)
            X.AnonymousClass7AV.A05(r3, r0, r4)
            com.instagram.common.ui.base.IgTextView r1 = r5.A03
            if (r1 == 0) goto L_0x044a
            X.6LK r0 = X.AnonymousClass6LK.A00
            r1.setMovementMethod(r0)
            com.instagram.common.ui.base.IgTextView r0 = r5.A03
            if (r0 == 0) goto L_0x044a
            r0.setText(r3)
            goto L_0x037c
        L_0x044a:
            X.0qQ.A0F(r6)
            goto L_0x0304
        L_0x044f:
            X.0qQ.A0F(r2)
            goto L_0x0304
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7Y.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(E7Y e7y, String str, boolean z) {
        C51906G7a g7a = e7y.A04;
        if (g7a != null) {
            g7a.DkC(str, z);
        }
        e7y.A0C = true;
        if (e7y.A08) {
            DbZ.A17(e7y);
        }
    }

    public final void Cyc() {
        C51906G7a g7a;
        String str = this.A07;
        if (str != null && (g7a = this.A04) != null) {
            g7a.DIS(this.A0C, str);
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final Collection getDefinitions() {
        if (this.A0A) {
            return 0sr.A1P(new C232232tF[]{new EHE(requireContext(), this, this), new EH8(this)});
        }
        return AnonymousClass7TE.A1I(new EHG(requireContext(), AnonymousClass7TE.A0l(this.A0F), this, this.A09));
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0F);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public E7Y() {
        MMJ mmj = new MMJ(this, 2);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMJ(new MMJ(this, 3), 4));
        this.A0E = DbS.A0I(new MMJ(A002, 5), mmj, new C58185Inp(36, (Object) null, A002), DbS.A0z(C46764Dkr.class));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final boolean isScrolledToTop() {
        return C2808154f.A05(getRecyclerView());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r10 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.onActivityResult(r8, r9, r10)
            r0 = -1
            if (r9 != r0) goto L_0x003a
            r0 = 73437(0x11edd, float:1.02907E-40)
            if (r8 != r0) goto L_0x003a
            r4 = 0
            if (r10 == 0) goto L_0x0051
            android.os.Bundle r1 = r10.getExtras()
            if (r1 == 0) goto L_0x0051
            r0 = 2758(0xac6, float:3.865E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r3 = r1.getString(r0)
        L_0x001e:
            android.os.Bundle r1 = r10.getExtras()
            if (r1 == 0) goto L_0x002e
            r0 = 2759(0xac7, float:3.866E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r4 = r1.getString(r0)
        L_0x002e:
            X.G7a r0 = r7.A04
            if (r0 == 0) goto L_0x003b
            r0 = 1
            r7.A08 = r0
            if (r3 == 0) goto L_0x003a
            A00(r7, r3, r0)
        L_0x003a:
            return
        L_0x003b:
            if (r3 == 0) goto L_0x003a
            if (r4 == 0) goto L_0x003a
            X.0eM r0 = r7.A0F
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            X.28D r1 = X.28D.A34
            r5 = 1
            r6 = r5
            X.C49957FGp.A01(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0051:
            r3 = r4
            if (r10 == 0) goto L_0x002e
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E7Y.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-374481095);
        E7Y.super.onCreate(bundle);
        AnonymousClass0eM r4 = this.A0F;
        this.A0A = 182.A06(0Tu.A06, DbY.A0R(r4), 36320313630007530L);
        this.A05 = new C2366734q(this, AnonymousClass7TE.A0l(r4));
        AnonymousClass0fD.A09(1980067921, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-30463006);
        super.onResume();
        if (this.A0D) {
            this.A0D = false;
            2YL A0H = DbS.A0H(this.A0E);
            String str = this.A07;
            AnonymousClass7TE.A1Z(new MFW(A0H, str, (AnonymousClass4D7) null, 47), C318116oQ.A00(A0H));
        }
        AnonymousClass0fD.A09(1265569648, A022);
    }
}
