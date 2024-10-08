package X;

import android.view.View;

/* renamed from: X.8tj  reason: invalid class name and case insensitive filesystem */
public final class C369038tj extends AnonymousClass2xK {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C349317zw A01;
    public final /* synthetic */ C366978pz A02;
    public final /* synthetic */ 26t A03;
    public final /* synthetic */ 1Av A04;

    public final boolean Ds8(AnonymousClass5Gv r4) {
        0qQ.A0B(r4, 0);
        C366978pz r1 = this.A02;
        C369068tm r0 = C369068tm.$redex_init_class;
        if (r1.ordinal() == 57) {
            r4.A08(true);
        }
        return true;
    }

    public C369038tj(View view, C349317zw r2, C366978pz r3, 26t r4, 1Av r5) {
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = view;
    }

    public final void DsC(AnonymousClass5Gv r3) {
        C349317zw r1 = this.A01;
        r1.A01 = false;
        r1.A00 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0091, code lost:
        r2.Epx(r4, java.lang.Boolean.valueOf(r3), r1[r0]);
        r10 = com.instagram.android.R.drawable.instagram_scissors_pano_outline_24;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DsE(X.AnonymousClass5Gv r17) {
        /*
            r16 = this;
            r5 = r16
            X.8pz r1 = r5.A02
            X.8tm r0 = X.C369068tm.$redex_init_class
            int r1 = r1.ordinal()
            r0 = 7
            if (r1 == r0) goto L_0x00cd
            r0 = 8
            if (r1 == r0) goto L_0x00cd
            r0 = 39
            if (r1 == r0) goto L_0x0084
            r0 = 51
            if (r1 == r0) goto L_0x001d
            switch(r1) {
                case 30: goto L_0x0052;
                case 31: goto L_0x001c;
                case 32: goto L_0x001c;
                case 33: goto L_0x001c;
                case 34: goto L_0x001c;
                case 35: goto L_0x001c;
                case 36: goto L_0x0071;
                case 37: goto L_0x0088;
                case 38: goto L_0x0067;
                default: goto L_0x001c;
            }
        L_0x001c:
            return
        L_0x001d:
            X.7zw r0 = r5.A01
            com.instagram.common.session.UserSession r3 = r0.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321808278169377(0x810a7e00052721, double:3.033396039072357E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x001c
            android.view.View r1 = r5.A00
            r0 = 2131429415(0x7f0b0827, float:1.8480502E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            X.0qQ.A0A(r1)
            int r0 = X.C338887ih.A00(r3)
            X.AVI r4 = new X.AVI
            r4.<init>(r1, r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            android.widget.ImageView r1 = r4.A02
            X.AjJ r0 = new X.AjJ
            r0.<init>(r4)
            r1.postDelayed(r0, r2)
            return
        L_0x0052:
            X.1Av r0 = r5.A04
            X.0xa r2 = r0.A01
            java.lang.String r1 = "video_editing_tooltip_seen_count"
            r0 = 0
            int r0 = r2.getInt(r1, r0)
            int r0 = r0 + 1
            X.0xY r2 = r2.AR4()
            r2.E5Z(r1, r0)
            goto L_0x00db
        L_0x0067:
            X.1Av r4 = r5.A04
            r3 = 1
            X.0s0 r2 = r4.A2z
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 327(0x147, float:4.58E-43)
            goto L_0x0091
        L_0x0071:
            X.1Av r4 = r5.A04
            r3 = 1
            X.0s0 r2 = r4.A30
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 325(0x145, float:4.55E-43)
            r1 = r1[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.Epx(r4, r0, r1)
            return
        L_0x0084:
            r10 = 2131238877(0x7f081fdd, float:1.8094045E38)
            goto L_0x009d
        L_0x0088:
            X.1Av r4 = r5.A04
            r3 = 1
            X.0s0 r2 = r4.A2y
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 326(0x146, float:4.57E-43)
        L_0x0091:
            r1 = r1[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.Epx(r4, r0, r1)
            r10 = 2131238743(0x7f081f57, float:1.8093773E38)
        L_0x009d:
            android.view.View r1 = r5.A00
            r0 = 2131428161(0x7f0b0341, float:1.8477959E38)
            android.view.View r2 = r1.requireViewById(r0)
            X.0qQ.A07(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1 = 0
            r9 = 2131238850(0x7f081fc2, float:1.809399E38)
            r13 = 1
            r8 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r11 = 0
            X.AxG r7 = X.C41602AxG.A00
            X.7kN r0 = new X.7kN
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r14 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15)
            X.0eM r0 = r0.A0C
            java.lang.Object r0 = r0.getValue()
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.start()
            return
        L_0x00cd:
            X.1Av r0 = r5.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_boomerang_edit_sticker_tooltip_trimming"
            r2.E5T(r0, r1)
        L_0x00db:
            r2.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369038tj.DsE(X.5Gv):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0107, code lost:
        r0 = r2.getInt(r1, 0) + 1;
        r2 = r2.AR4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0111, code lost:
        r2.E5Z(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01d5, code lost:
        r2.E5T(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01e5, code lost:
        r2.E5T(r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01e9, code lost:
        r2.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0395, code lost:
        X.C368288sN.A00(r7, r5, r6, r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0398, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x03a2, code lost:
        r1 = r1[r0];
        r0 = java.lang.Boolean.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x03a8, code lost:
        r2.Epx(r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x03ab, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DsH(X.AnonymousClass5Gv r10) {
        /*
            r9 = this;
            X.8pz r1 = r9.A02
            X.8tm r0 = X.C369068tm.$redex_init_class
            int r0 = r1.ordinal()
            r4 = 0
            switch(r0) {
                case 0: goto L_0x0317;
                case 1: goto L_0x00ab;
                case 2: goto L_0x01d9;
                case 3: goto L_0x01c8;
                case 4: goto L_0x01ba;
                case 5: goto L_0x0224;
                case 6: goto L_0x0251;
                case 7: goto L_0x00e6;
                case 8: goto L_0x00e6;
                case 9: goto L_0x000c;
                case 10: goto L_0x0116;
                case 11: goto L_0x0116;
                case 12: goto L_0x0350;
                case 13: goto L_0x0101;
                case 14: goto L_0x030c;
                case 15: goto L_0x034a;
                case 16: goto L_0x0336;
                case 17: goto L_0x00d9;
                case 18: goto L_0x02f6;
                case 19: goto L_0x02eb;
                case 20: goto L_0x000c;
                case 21: goto L_0x02e0;
                case 22: goto L_0x0296;
                case 23: goto L_0x0301;
                case 24: goto L_0x0062;
                case 25: goto L_0x0040;
                case 26: goto L_0x0033;
                case 27: goto L_0x000c;
                case 28: goto L_0x00fa;
                case 29: goto L_0x0246;
                case 30: goto L_0x000c;
                case 31: goto L_0x0246;
                case 32: goto L_0x034a;
                case 33: goto L_0x032c;
                case 34: goto L_0x0322;
                case 35: goto L_0x009a;
                case 36: goto L_0x000c;
                case 37: goto L_0x000c;
                case 38: goto L_0x000c;
                case 39: goto L_0x00b2;
                case 40: goto L_0x0340;
                case 41: goto L_0x00f3;
                case 42: goto L_0x00cc;
                case 43: goto L_0x00bf;
                case 44: goto L_0x0261;
                case 45: goto L_0x0123;
                case 46: goto L_0x0123;
                case 47: goto L_0x0123;
                case 48: goto L_0x0055;
                case 49: goto L_0x008d;
                case 50: goto L_0x0080;
                case 51: goto L_0x004d;
                case 52: goto L_0x0073;
                case 53: goto L_0x000c;
                case 54: goto L_0x0026;
                case 55: goto L_0x0019;
                case 56: goto L_0x000d;
                case 57: goto L_0x0399;
                case 58: goto L_0x0219;
                case 59: goto L_0x020e;
                case 60: goto L_0x0203;
                case 61: goto L_0x01f8;
                case 62: goto L_0x000c;
                case 63: goto L_0x01ed;
                default: goto L_0x000c;
            }
        L_0x000c:
            return
        L_0x000d:
            X.1Av r0 = r9.A04
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "has_seen_permanent_media_edit_tooltip"
            goto L_0x01e5
        L_0x0019:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_camera_note_capture_tooltip"
            goto L_0x01d5
        L_0x0026:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_flexible_duration_video_note_tooltip"
            goto L_0x01d5
        L_0x0033:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_draft_scheduling_tooltip"
            goto L_0x01d5
        L_0x0040:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_draft_naming_tooltip"
            goto L_0x01d5
        L_0x004d:
            X.1Av r0 = r9.A04
            X.0xa r2 = r0.A01
            java.lang.String r1 = "AR_EFFECT_ICON_NUX_IMPRESSION_COUNT"
            goto L_0x0107
        L_0x0055:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_bio_product_sticker_tooltip"
            goto L_0x01d5
        L_0x0062:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            r0 = 1403(0x57b, float:1.966E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x01d5
        L_0x0073:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_audience_lists_hidden_sharecut_tooltip"
            goto L_0x01d5
        L_0x0080:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_group_stories_post_cap_tooltip"
            goto L_0x01d5
        L_0x008d:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_hall_pass_hidden_sharecut_tooltip"
            goto L_0x01d5
        L_0x009a:
            X.1Av r0 = r9.A04
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "preference_roll_call_direct_camera_nux_impression_count"
            int r0 = r0.getInt(r1, r4)
            int r0 = r0 + 1
            goto L_0x0111
        L_0x00ab:
            X.1Av r0 = r9.A04
            X.0xa r2 = r0.A01
            java.lang.String r1 = "clips_timed_text_button_tooltip_impression_count"
            goto L_0x0107
        L_0x00b2:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_stories_template_toolbar_badge_nux"
            goto L_0x01d5
        L_0x00bf:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "clips_nux_voiceover_postcapture"
            goto L_0x01d5
        L_0x00cc:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_voice_effects_tooltip"
            goto L_0x01d5
        L_0x00d9:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_layout_post_capture_edit_tooltip"
            goto L_0x01d5
        L_0x00e6:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_boomerang_edit_sticker_tooltip_trimming"
            goto L_0x01d5
        L_0x00f3:
            X.1Av r0 = r9.A04
            X.0xa r2 = r0.A01
            java.lang.String r1 = "template_sticker_tooltip_impression_count"
            goto L_0x0107
        L_0x00fa:
            X.1Av r0 = r9.A04
            X.0xa r2 = r0.A01
            java.lang.String r1 = "music_snippet_button_nux_seen_count"
            goto L_0x0107
        L_0x0101:
            X.1Av r0 = r9.A04
            X.0xa r2 = r0.A01
            java.lang.String r1 = "channel_sticker_clips_tooltip_impression_count"
        L_0x0107:
            int r0 = r2.getInt(r1, r4)
            int r0 = r0 + 1
            X.0xY r2 = r2.AR4()
        L_0x0111:
            r2.E5Z(r1, r0)
            goto L_0x01e9
        L_0x0116:
            X.1Av r0 = r9.A04
            r1 = 1
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "has_seen_favorites_camera_share_button"
            goto L_0x01d5
        L_0x0123:
            X.1Av r0 = r9.A04
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "ads_mode_story_tooltip_impression_count"
            int r0 = r0.getInt(r1, r4)
            int r0 = r0 + 1
            r2.E5Z(r1, r0)
            r2.apply()
            X.7zw r0 = r9.A01
            com.instagram.common.session.UserSession r0 = r0.A03
            X.27r r3 = X.27p.A01(r0)
            X.0wc r2 = r3.A01
            r0 = 1430(0x596, float:2.004E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r3.A0P()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x000c
            X.4yP r1 = r3.A0J()
            java.lang.String r0 = "camera_destination"
            r2.A8M(r1, r0)
            X.283 r3 = r3.A04
            java.lang.String r1 = r3.A0L
            java.lang.String r0 = "camera_session_id"
            r2.AAJ(r0, r1)
            r0 = 32
            java.lang.String r1 = "entity_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A8k(r1, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r2.AAJ(r0, r1)
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            java.lang.String r0 = "surface"
            r2.A8M(r1, r0)
            java.lang.String r1 = r3.A0M
            java.lang.String r0 = "composition_str_id"
            r2.AAJ(r0, r1)
            X.28t r1 = r3.A0A
            java.lang.String r0 = "composition_media_type"
            r2.A8M(r1, r0)
            X.7w9 r0 = X.C347027w9.ADS_MODE_SETTINGS
            X.7w9[] r0 = new X.C347027w9[]{r0}
            java.util.List r1 = java.util.Arrays.asList(r0)
            r0 = 1154(0x482, float:1.617E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.AAe(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r1)
            r2.Cgf()
            return
        L_0x01ba:
            X.26t r0 = r9.A03
            if (r0 == 0) goto L_0x000c
            r1 = 1
            X.0xa r0 = r0.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "avatar_sticker_story_creation_tooltip_has_seen"
            goto L_0x01d5
        L_0x01c8:
            X.26t r0 = r9.A03
            if (r0 == 0) goto L_0x000c
            r1 = 1
            X.0xa r0 = r0.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r0 = "avatar_sticker_story_post_capture_find_more_stickers_tooltip_has_seen"
        L_0x01d5:
            r2.E5T(r0, r1)
            goto L_0x01e9
        L_0x01d9:
            X.26t r0 = r9.A03
            if (r0 == 0) goto L_0x000c
            X.0xa r0 = r0.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "KEY_AVATAR_EFFECT_TOOLTIP"
        L_0x01e5:
            r0 = 1
            r2.E5T(r1, r0)
        L_0x01e9:
            r2.apply()
            return
        L_0x01ed:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A57
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 484(0x1e4, float:6.78E-43)
            goto L_0x03a2
        L_0x01f8:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A3j
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 483(0x1e3, float:6.77E-43)
            goto L_0x03a2
        L_0x0203:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A3i
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 482(0x1e2, float:6.75E-43)
            goto L_0x03a2
        L_0x020e:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A2f
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 220(0xdc, float:3.08E-43)
            goto L_0x03a2
        L_0x0219:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A2i
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 219(0xdb, float:3.07E-43)
            goto L_0x03a2
        L_0x0224:
            X.26t r0 = r9.A03
            if (r0 == 0) goto L_0x023c
            X.0xa r0 = r0.A00
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "key_avatar_stories_mentionable_friends_tooltip_view_count_v4"
            int r0 = r0.getInt(r1, r4)
            int r0 = r0 + 1
            r2.E5Z(r1, r0)
            r2.apply()
        L_0x023c:
            X.7zw r0 = r9.A01
            com.instagram.common.session.UserSession r1 = r0.A03
            java.lang.String r0 = "Now you can add your friends' avatars."
            X.LHS.A00(r1, r0)
            return
        L_0x0246:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A4W
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 210(0xd2, float:2.94E-43)
            goto L_0x03a2
        L_0x0251:
            X.1Av r5 = r9.A04
            X.0s0 r2 = r5.A7t
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 429(0x1ad, float:6.01E-43)
            r1 = r1[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            goto L_0x03a8
        L_0x0261:
            X.1Av r0 = r9.A04
            X.0xa r5 = r0.A01
            X.0xY r3 = r5.AR4()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "story_composer_my_story_fb_share_nux_tooltip_last_seen"
            r3.E5c(r0, r1)
            r3.apply()
            X.0xY r2 = r5.AR4()
            java.lang.String r0 = "story_composer_my_story_button_nux_tooltip_count"
            int r0 = r5.getInt(r0, r4)
            int r1 = r0 + 1
            java.lang.String r0 = "story_composer_my_story_fb_share_nux_tooltip_count"
            r2.E5Z(r0, r1)
            r2.apply()
            X.7zw r0 = r9.A01
            com.instagram.common.session.UserSession r8 = r0.A03
            X.818 r7 = X.AnonymousClass818.IG_STORY_COMPOSER_YOUR_STORY_BUTTON_TOOLTIP
            X.819 r6 = X.AnonymousClass819.TOOLTIP_SHORTCUT_DESTINATION_PICKER_NOT_SHARING_STORIES
            X.8sM r5 = X.C368278sM.VIEW
            r2 = 0
            goto L_0x0395
        L_0x0296:
            X.7zw r0 = r9.A01
            com.instagram.common.session.UserSession r0 = r0.A03
            X.27r r0 = X.27p.A01(r0)
            X.29V r4 = r0.A0C
            X.0wc r2 = r4.A01
            java.lang.String r1 = "ig_camera_nux"
            X.0kJ r0 = r2.A00
            X.0Aj r3 = r2.A00(r0, r1)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x02d5
            java.lang.String r1 = "AI_CONTEXTUAL_BACKGROUND"
            java.lang.String r0 = "entity"
            r3.AAJ(r0, r1)
            java.lang.String r1 = "OPEN"
            java.lang.String r0 = "nux_step"
            r3.AAJ(r0, r1)
            X.283 r2 = r4.A04
            java.lang.String r1 = r2.A0L
            if (r1 != 0) goto L_0x02c6
            java.lang.String r1 = ""
        L_0x02c6:
            java.lang.String r0 = "camera_session_id"
            r3.AAJ(r0, r1)
            X.28D r1 = r2.A09
            java.lang.String r0 = "entry_point"
            r3.A8M(r1, r0)
            r3.Cgf()
        L_0x02d5:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A2D
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 470(0x1d6, float:6.59E-43)
            goto L_0x03a2
        L_0x02e0:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A3v
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 469(0x1d5, float:6.57E-43)
            goto L_0x03a2
        L_0x02eb:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A3s
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 468(0x1d4, float:6.56E-43)
            goto L_0x03a2
        L_0x02f6:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A3r
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 467(0x1d3, float:6.54E-43)
            goto L_0x03a2
        L_0x0301:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A3w
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 371(0x173, float:5.2E-43)
            goto L_0x03a2
        L_0x030c:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A39
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 314(0x13a, float:4.4E-43)
            goto L_0x03a2
        L_0x0317:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A29
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 373(0x175, float:5.23E-43)
            goto L_0x03a2
        L_0x0322:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A4l
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 313(0x139, float:4.39E-43)
            goto L_0x03a2
        L_0x032c:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A2l
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 320(0x140, float:4.48E-43)
            goto L_0x03a2
        L_0x0336:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A3k
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 69
            goto L_0x03a2
        L_0x0340:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A59
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 207(0xcf, float:2.9E-43)
            goto L_0x03a2
        L_0x034a:
            X.1Av r0 = r9.A04
            r0.A1d(r4)
            return
        L_0x0350:
            X.1Av r0 = r9.A04
            X.0xa r3 = r0.A01
            X.0xY r2 = r3.AR4()
            java.lang.String r0 = "xpost_to_facebook_story_server_mtime_in_second"
            int r1 = r3.getInt(r0, r4)
            java.lang.String r0 = "story_last_server_xposting_turn_on_time_in_second"
            r2.E5Z(r0, r1)
            r2.apply()
            X.0xY r2 = r3.AR4()
            java.lang.String r1 = "story_composer_my_story_button_nux_tooltip_count"
            int r0 = r3.getInt(r1, r4)
            int r0 = r0 + 1
            r2.E5Z(r1, r0)
            r2.apply()
            X.7zw r0 = r9.A01
            com.instagram.common.session.UserSession r8 = r0.A03
            X.818 r7 = X.AnonymousClass818.IG_STORY_COMPOSER_YOUR_STORY_BUTTON_TOOLTIP
            X.819 r6 = X.AnonymousClass819.TOOLTIP_SHORTCUT_DESTINATION_PICKER_STORIES
            X.8sM r5 = X.C368278sM.VIEW
            X.81A r2 = new X.81A
            r2.<init>()
            int r0 = r3.getInt(r1, r4)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "impression_count"
            r2.A05(r0, r1)
        L_0x0395:
            X.C368288sN.A00(r7, r5, r6, r2, r8)
            return
        L_0x0399:
            X.1Av r5 = r9.A04
            r3 = 1
            X.0s0 r2 = r5.A2P
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 216(0xd8, float:3.03E-43)
        L_0x03a2:
            r1 = r1[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
        L_0x03a8:
            r2.Epx(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369038tj.DsH(X.5Gv):void");
    }
}
