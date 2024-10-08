package X;

import android.app.Activity;
import android.os.Parcelable;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.7zw  reason: invalid class name and case insensitive filesystem */
public final class C349317zw implements AnonymousClass81E {
    public AnonymousClass5Gv A00;
    public boolean A01;
    public final Activity A02;
    public final UserSession A03;
    public final Set A04 = new LinkedHashSet();

    public C349317zw(Activity activity, UserSession userSession) {
        0qQ.A0B(activity, 1);
        0qQ.A0B(userSession, 2);
        this.A02 = activity;
        this.A03 = userSession;
    }

    public final boolean A01(View view, View view2, C366978pz r5) {
        0qQ.A0B(view, 0);
        0qQ.A0B(view2, 1);
        return A03(view, view2, r5, false);
    }

    public final boolean A03(View view, View view2, C366978pz r11, boolean z) {
        0qQ.A0B(view, 0);
        0qQ.A0B(r11, 2);
        return A02(view, view2, r11, (26t) null, (String) null, 0, z);
    }

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    public final void A00() {
        AnonymousClass5Gv r1 = this.A00;
        if (r1 != null) {
            r1.A08(true);
            this.A00 = null;
            this.A01 = false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0290, code lost:
        if (r1.getInt("preference_roll_call_direct_camera_nux_impression_count", 0) < 3) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (r25 != false) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r6 != false) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x032d, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0368, code lost:
        if (r15.A01.getInt("channel_sticker_clips_tooltip_impression_count", 0) < 2) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0381, code lost:
        if (r3.getInt("story_last_server_xposting_turn_on_time_in_second", -1) < r3.getInt("xpost_to_facebook_story_server_mtime_in_second", 0)) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x038f, code lost:
        r0 = r1.getBoolean(r0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03bc, code lost:
        if (r1.getInt(r0, 0) >= 3) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03c6, code lost:
        r0 = ((java.lang.Boolean) r3.CDM(r15, r1[r0])).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03d2, code lost:
        if (r0 != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03d6, code lost:
        r12.A01 = true;
        r12.A04.add(r13);
        r10.post(new X.C369018th(r10, r11, r12, r13, r14, r15, r23, r24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03e9, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        if (X.182.A06(r4, r3, 36321808278169377L) == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        if (r15.A01.getInt("AR_EFFECT_ICON_NUX_IMPRESSION_COUNT", 0) >= ((int) X.182.A01(r4, r3, 36603283254743960L))) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ea, code lost:
        if (r1.getBoolean(r0, false) != false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ec, code lost:
        r0 = X.182.A06(X.0Tu.A05, r3, 36319858362752697L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        if (r13 != X.C366978pz.A0J) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0178, code lost:
        r0 = X.182.A06(r4, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        if (r15.A01.getBoolean("has_seen_boomerang_edit_sticker_tooltip_trimming", false) != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01db, code lost:
        if (((long) r15.A01.getInt("ads_mode_story_tooltip_impression_count", 0)) < X.182.A01(r6, r3, 36603094276248431L)) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01fd, code lost:
        if (r15.A01.getInt("story_composer_my_story_fb_share_nux_tooltip_count", 0) < 1) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r0 = r10.getContext();
        X.0qQ.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0228, code lost:
        if (r1.getInt("template_sticker_tooltip_impression_count", 0) < 3) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (X.C305756Jk.A00(r0) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0247, code lost:
        r0 = X.182.A06(r4, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x024b, code lost:
        if (r0 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x027b, code lost:
        if (((java.lang.Boolean) r15.A30.CDM(r15, X.1Av.A8a[325(0x145, float:4.55E-43)])).booleanValue() == false) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        r13 = X.C366978pz.A0K;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(android.view.View r19, android.view.View r20, X.C366978pz r21, X.26t r22, java.lang.String r23, int r24, boolean r25) {
        /*
            r18 = this;
            r13 = r21
            r2 = 0
            r10 = r19
            X.0qQ.A0B(r10, r2)
            r7 = 1
            r11 = r20
            X.0qQ.A0B(r11, r7)
            r12 = r18
            com.instagram.common.session.UserSession r3 = r12.A03
            X.1Av r15 = X.1Au.A00(r3)
            X.8q0 r0 = X.C366988q0.$redex_init_class
            int r0 = r13.ordinal()
            r4 = 3
            r6 = 1
            r14 = r22
            switch(r0) {
                case 0: goto L_0x03c0;
                case 1: goto L_0x03b4;
                case 2: goto L_0x00f9;
                case 3: goto L_0x00e0;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00b4;
                case 6: goto L_0x0394;
                case 7: goto L_0x038b;
                case 8: goto L_0x0023;
                case 9: goto L_0x0024;
                case 10: goto L_0x0386;
                case 11: goto L_0x0386;
                case 12: goto L_0x036b;
                case 13: goto L_0x034b;
                case 14: goto L_0x0344;
                case 15: goto L_0x0330;
                case 16: goto L_0x02ff;
                case 17: goto L_0x02f9;
                case 18: goto L_0x02f1;
                case 19: goto L_0x02e9;
                case 20: goto L_0x0023;
                case 21: goto L_0x02e1;
                case 22: goto L_0x02d9;
                case 23: goto L_0x02d1;
                case 24: goto L_0x01a4;
                case 25: goto L_0x0198;
                case 26: goto L_0x0192;
                case 27: goto L_0x0024;
                case 28: goto L_0x02cb;
                case 29: goto L_0x02c3;
                case 30: goto L_0x02bd;
                case 31: goto L_0x02c3;
                case 32: goto L_0x0330;
                case 33: goto L_0x0294;
                case 34: goto L_0x00a2;
                case 35: goto L_0x027f;
                case 36: goto L_0x0263;
                case 37: goto L_0x025b;
                case 38: goto L_0x0023;
                case 39: goto L_0x024f;
                case 40: goto L_0x022c;
                case 41: goto L_0x0218;
                case 42: goto L_0x0207;
                case 43: goto L_0x0201;
                case 44: goto L_0x01eb;
                case 45: goto L_0x01ae;
                case 46: goto L_0x01ae;
                case 47: goto L_0x01ae;
                case 48: goto L_0x019e;
                case 49: goto L_0x0092;
                case 50: goto L_0x01e5;
                case 51: goto L_0x005b;
                case 52: goto L_0x01df;
                case 53: goto L_0x0024;
                case 54: goto L_0x018c;
                case 55: goto L_0x0186;
                case 56: goto L_0x017e;
                case 57: goto L_0x015d;
                case 58: goto L_0x0136;
                case 59: goto L_0x0046;
                case 60: goto L_0x012e;
                case 61: goto L_0x0126;
                case 62: goto L_0x011e;
                case 63: goto L_0x0101;
                case 64: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            r6 = 0
        L_0x0024:
            X.8pz r0 = X.C366978pz.A0J
            if (r13 != r0) goto L_0x0041
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_boomerang_edit_sticker_tooltip_trimming"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0041
            android.content.Context r0 = r10.getContext()
            X.0qQ.A07(r0)
            boolean r0 = X.C305756Jk.A00(r0)
            if (r0 == 0) goto L_0x0041
            X.8pz r13 = X.C366978pz.A0K
        L_0x0041:
            if (r25 != 0) goto L_0x03d6
            if (r6 != 0) goto L_0x03d6
            return r2
        L_0x0046:
            X.0Tu r4 = X.0Tu.A05
            r0 = 36324475452534894(0x810ceb0000306e, double:3.035082770880959E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x0023
            X.0s0 r3 = r15.A2f
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 220(0xdc, float:3.08E-43)
            goto L_0x03c6
        L_0x005b:
            java.lang.Boolean r0 = X.C306096Kt.A00(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0023
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321808278103840(0x810a7e00042720, double:3.033396039030911E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 != 0) goto L_0x007d
            r0 = 36321808278169377(0x810a7e00052721, double:3.033396039072357E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x0023
        L_0x007d:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "AR_EFFECT_ICON_NUX_IMPRESSION_COUNT"
            int r5 = r1.getInt(r0, r2)
            r0 = 36603283254743960(0x820a7e00031398, double:3.21140194766688E-306)
            long r0 = X.182.A01(r4, r3, r0)
            int r3 = (int) r0
            if (r5 >= r3) goto L_0x0023
            goto L_0x0024
        L_0x0092:
            java.util.Set r1 = r12.A04
            X.8pz r0 = X.C366978pz.A0P
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0023
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_hall_pass_hidden_sharecut_tooltip"
            goto L_0x038f
        L_0x00a2:
            java.util.Set r1 = r12.A04
            X.8pz r0 = X.C366978pz.A0v
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0023
            X.0s0 r3 = r15.A4l
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 313(0x139, float:4.39E-43)
            goto L_0x03c6
        L_0x00b4:
            com.instagram.avatars.store.AvatarStore r0 = X.25x.A00(r3)
            X.27E r0 = r0.A01
            X.27H r1 = r0.A00
            X.5vi r0 = X.C299715vi.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0023
            X.0Tu r5 = X.0Tu.A05
            r0 = 36321503335491016(0x810a37000525c8, double:3.0332031920946556E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x0023
            if (r22 == 0) goto L_0x0023
            X.0xa r1 = r14.A00
            java.lang.String r0 = "key_avatar_stories_mentionable_friends_tooltip_view_count_v4"
            goto L_0x03b8
        L_0x00d9:
            if (r22 == 0) goto L_0x0023
            X.0xa r1 = r14.A00
            java.lang.String r0 = "avatar_sticker_story_creation_tooltip_has_seen"
            goto L_0x00e6
        L_0x00e0:
            if (r22 == 0) goto L_0x0023
            X.0xa r1 = r14.A00
            java.lang.String r0 = "avatar_sticker_story_post_capture_find_more_stickers_tooltip_has_seen"
        L_0x00e6:
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0023
            X.0Tu r4 = X.0Tu.A05
            r0 = 36319858362752697(0x8108b800011eb9, double:3.032162904711169E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            goto L_0x03d2
        L_0x00f9:
            if (r22 == 0) goto L_0x0023
            X.0xa r1 = r14.A00
            java.lang.String r0 = "KEY_AVATAR_EFFECT_TOOLTIP"
            goto L_0x038f
        L_0x0101:
            X.0s0 r4 = r15.A57
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 484(0x1e4, float:6.78E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r4.CDM(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0023
            X.0Tu r4 = X.0Tu.A05
            r0 = 36327941491145542(0x81101200003b46, double:3.03727470765495E-306)
            goto L_0x0247
        L_0x011e:
            X.0s0 r3 = r15.A4P
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 93
            goto L_0x03c6
        L_0x0126:
            X.0s0 r3 = r15.A3j
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 483(0x1e3, float:6.77E-43)
            goto L_0x03c6
        L_0x012e:
            X.0s0 r3 = r15.A3i
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 482(0x1e2, float:6.75E-43)
            goto L_0x03c6
        L_0x0136:
            X.0s0 r4 = r15.A2i
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 219(0xdb, float:3.07E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r4.CDM(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0023
            X.0Tu r4 = X.0Tu.A05
            r0 = 36325304381289307(0x810dac0001335b, double:3.035606988763078E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 != 0) goto L_0x0383
            r0 = 36325304381420380(0x810dac0003335c, double:3.035606988845969E-306)
            goto L_0x0178
        L_0x015d:
            X.0s0 r4 = r15.A2P
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 216(0xd8, float:3.03E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r4.CDM(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0023
            X.0Tu r4 = X.0Tu.A05
            r0 = 36323315811560513(0x810bdd00032c41, double:3.034349409259261E-306)
        L_0x0178:
            boolean r0 = X.182.A06(r4, r3, r0)
            goto L_0x032d
        L_0x017e:
            X.0s0 r3 = r15.A4U
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 318(0x13e, float:4.46E-43)
            goto L_0x03c6
        L_0x0186:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_camera_note_capture_tooltip"
            goto L_0x038f
        L_0x018c:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_flexible_duration_video_note_tooltip"
            goto L_0x038f
        L_0x0192:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_draft_scheduling_tooltip"
            goto L_0x038f
        L_0x0198:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_draft_naming_tooltip"
            goto L_0x038f
        L_0x019e:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_bio_product_sticker_tooltip"
            goto L_0x038f
        L_0x01a4:
            X.0xa r1 = r15.A01
            r0 = 1403(0x57b, float:1.966E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x038f
        L_0x01ae:
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r3)
            boolean r0 = r0.A2L()
            if (r0 == 0) goto L_0x0023
            X.0Tu r6 = X.0Tu.A05
            r0 = 36321619299346017(0x810a5200012661, double:3.033276528103507E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x0023
            X.0xa r1 = r15.A01
            java.lang.String r0 = "ads_mode_story_tooltip_impression_count"
            int r0 = r1.getInt(r0, r2)
            long r4 = (long) r0
            r0 = 36603094276248431(0x820a520004136f, double:3.211282436905352E-306)
            long r8 = X.182.A01(r6, r3, r0)
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0023
            goto L_0x0383
        L_0x01df:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_audience_lists_hidden_sharecut_tooltip"
            goto L_0x038f
        L_0x01e5:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_group_stories_post_cap_tooltip"
            goto L_0x038f
        L_0x01eb:
            X.819 r1 = X.AnonymousClass819.TOOLTIP_SHORTCUT_DESTINATION_PICKER_NOT_SHARING_STORIES
            X.818 r0 = X.AnonymousClass818.IG_STORY_COMPOSER_YOUR_STORY_BUTTON_TOOLTIP
            boolean r0 = X.C367998ru.A03(r0, r1, r3)
            if (r0 == 0) goto L_0x0023
            X.0xa r1 = r15.A01
            java.lang.String r0 = "story_composer_my_story_fb_share_nux_tooltip_count"
            int r0 = r1.getInt(r0, r2)
            if (r0 >= r7) goto L_0x0023
            goto L_0x0024
        L_0x0201:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "clips_nux_voiceover_postcapture"
            goto L_0x038f
        L_0x0207:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_voice_effects_tooltip"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "clips_nux_voiceover_postcapture"
            boolean r0 = r1.getBoolean(r0, r2)
            goto L_0x024b
        L_0x0218:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_tapped_on_template_sticker_tooltip"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "template_sticker_tooltip_impression_count"
            int r0 = r1.getInt(r0, r2)
            if (r0 >= r4) goto L_0x0023
            goto L_0x0383
        L_0x022c:
            X.0s0 r4 = r15.A59
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 207(0xcf, float:2.9E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r4.CDM(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0023
            X.0Tu r4 = X.0Tu.A05
            r0 = 36319939967131443(0x8108cb00011f33, double:3.0322145116488825E-306)
        L_0x0247:
            boolean r0 = X.182.A06(r4, r3, r0)
        L_0x024b:
            if (r0 == 0) goto L_0x0023
            goto L_0x0024
        L_0x024f:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_stories_template_toolbar_badge_nux"
            boolean r0 = r1.getBoolean(r0, r2)
            r6 = r0 ^ 1
            goto L_0x0024
        L_0x025b:
            X.0s0 r3 = r15.A2y
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 326(0x146, float:4.57E-43)
            goto L_0x03c6
        L_0x0263:
            boolean r0 = r15.A1o()
            if (r0 == 0) goto L_0x0023
            X.0s0 r3 = r15.A30
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 325(0x145, float:4.55E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r3.CDM(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0023
            goto L_0x0383
        L_0x027f:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "preference_has_clicked_roll_call_direct_camera_tool"
            r6 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "preference_roll_call_direct_camera_nux_impression_count"
            int r0 = r1.getInt(r0, r2)
            if (r0 >= r4) goto L_0x0024
            goto L_0x0383
        L_0x0294:
            java.util.Set r1 = r12.A04
            X.8pz r0 = X.C366978pz.A0u
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0023
            X.0s0 r1 = r15.A2l
            X.0YZ[] r3 = X.1Av.A8a
            r0 = 320(0x140, float:4.48E-43)
            r0 = r3[r0]
            java.lang.Object r0 = r1.CDM(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0023
            X.0s0 r1 = r15.A2k
            r0 = 319(0x13f, float:4.47E-43)
            r0 = r3[r0]
            r1.CDM(r15, r0)
            goto L_0x0023
        L_0x02bd:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "video_editing_tooltip_seen_count"
            goto L_0x03b8
        L_0x02c3:
            X.0s0 r3 = r15.A4W
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 210(0xd2, float:2.94E-43)
            goto L_0x03c6
        L_0x02cb:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "music_snippet_button_nux_seen_count"
            goto L_0x03b8
        L_0x02d1:
            X.0s0 r3 = r15.A3w
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 371(0x173, float:5.2E-43)
            goto L_0x03c6
        L_0x02d9:
            X.0s0 r3 = r15.A2D
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 470(0x1d6, float:6.59E-43)
            goto L_0x03c6
        L_0x02e1:
            X.0s0 r3 = r15.A3v
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 469(0x1d5, float:6.57E-43)
            goto L_0x03c6
        L_0x02e9:
            X.0s0 r3 = r15.A3s
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 468(0x1d4, float:6.56E-43)
            goto L_0x03c6
        L_0x02f1:
            X.0s0 r3 = r15.A3r
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 467(0x1d3, float:6.54E-43)
            goto L_0x03c6
        L_0x02f9:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_layout_post_capture_edit_tooltip"
            goto L_0x038f
        L_0x02ff:
            java.util.Set r1 = r12.A04
            X.8pz r0 = X.C366978pz.A0e
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0023
            X.0s0 r1 = r15.A3k
            X.0YZ[] r3 = X.1Av.A8a
            r0 = 69
            r0 = r3[r0]
            java.lang.Object r0 = r1.CDM(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0023
            X.0s0 r1 = r15.A2l
            r0 = 320(0x140, float:4.48E-43)
            r0 = r3[r0]
            java.lang.Object r0 = r1.CDM(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L_0x032d:
            if (r0 == 0) goto L_0x0023
            goto L_0x0383
        L_0x0330:
            X.0s0 r3 = r15.A7s
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 309(0x135, float:4.33E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r3.CDM(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            goto L_0x0024
        L_0x0344:
            X.0s0 r3 = r15.A39
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 314(0x13a, float:4.4E-43)
            goto L_0x03c6
        L_0x034b:
            X.0s0 r3 = r15.A5i
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 457(0x1c9, float:6.4E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r3.CDM(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0023
            X.0xa r1 = r15.A01
            java.lang.String r0 = "channel_sticker_clips_tooltip_impression_count"
            int r1 = r1.getInt(r0, r2)
            r0 = 2
            if (r1 >= r0) goto L_0x0023
            goto L_0x0383
        L_0x036b:
            boolean r0 = X.C363018iu.A00(r3)
            r6 = 0
            if (r0 == 0) goto L_0x0024
            X.0xa r3 = r15.A01
            java.lang.String r1 = "story_last_server_xposting_turn_on_time_in_second"
            r0 = -1
            int r1 = r3.getInt(r1, r0)
            java.lang.String r0 = "xpost_to_facebook_story_server_mtime_in_second"
            int r0 = r3.getInt(r0, r2)
            if (r1 >= r0) goto L_0x0024
        L_0x0383:
            r6 = 1
            goto L_0x0024
        L_0x0386:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_favorites_camera_share_button"
            goto L_0x038f
        L_0x038b:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "has_seen_boomerang_edit_sticker_tooltip_trimming"
        L_0x038f:
            boolean r0 = r1.getBoolean(r0, r2)
            goto L_0x03d2
        L_0x0394:
            X.0s0 r4 = r15.A7t
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 429(0x1ad, float:6.01E-43)
            r0 = r1[r0]
            java.lang.Object r0 = r4.CDM(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0023
            X.0Tu r4 = X.0Tu.A05
            r0 = 36322989393849045(0x810b9100002ad5, double:3.03414298138415E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            goto L_0x03d2
        L_0x03b4:
            X.0xa r1 = r15.A01
            java.lang.String r0 = "clips_timed_text_button_tooltip_impression_count"
        L_0x03b8:
            int r0 = r1.getInt(r0, r2)
            if (r0 >= r4) goto L_0x0023
            goto L_0x0024
        L_0x03c0:
            X.0s0 r3 = r15.A29
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 373(0x175, float:5.23E-43)
        L_0x03c6:
            r0 = r1[r0]
            java.lang.Object r0 = r3.CDM(r15, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L_0x03d2:
            if (r0 != 0) goto L_0x0023
            goto L_0x0024
        L_0x03d6:
            r12.A01 = r7
            java.util.Set r0 = r12.A04
            r0.add(r13)
            X.8th r9 = new X.8th
            r16 = r23
            r17 = r24
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r10.post(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C349317zw.A02(android.view.View, android.view.View, X.8pz, X.26t, java.lang.String, int, boolean):boolean");
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }
}
