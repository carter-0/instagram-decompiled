package X;

/* renamed from: X.PqW  reason: case insensitive filesystem */
public final class C74190PqW extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74190PqW(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C74190PqW A00(Object obj, int i) {
        return new C74190PqW(obj, i);
    }

    public static void A01(C70840ONr oNr, String str) {
        oNr.A03("content_id", 00l.A0L(str, "_", str));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04b3, code lost:
        r2.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0541, code lost:
        r0 = "reason";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0555, code lost:
        r0 = "event_source";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0573, code lost:
        if (X.JTP.A0j(r0 ? 1 : 0).intValue() == 0) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0575, code lost:
        r2 = "off";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0577, code lost:
        r0 = "action";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x057a, code lost:
        r2 = "on";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x058d, code lost:
        r1.A03(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0601, code lost:
        r5.A02(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x016c, code lost:
        r2 = "notification_shown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x018a, code lost:
        r0 = com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0015;
                case 1: goto L_0x0031;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0109;
                case 6: goto L_0x011b;
                case 7: goto L_0x0126;
                case 8: goto L_0x013b;
                case 9: goto L_0x0170;
                case 10: goto L_0x0198;
                case 11: goto L_0x01a4;
                case 12: goto L_0x01cd;
                case 13: goto L_0x01ef;
                case 14: goto L_0x020d;
                case 15: goto L_0x024c;
                case 16: goto L_0x0275;
                case 17: goto L_0x02b5;
                case 18: goto L_0x02d7;
                case 19: goto L_0x02eb;
                case 20: goto L_0x02ff;
                case 21: goto L_0x0313;
                case 22: goto L_0x033f;
                case 23: goto L_0x0357;
                case 24: goto L_0x036a;
                case 25: goto L_0x03ae;
                case 26: goto L_0x03c5;
                case 27: goto L_0x03dc;
                case 28: goto L_0x03f3;
                case 29: goto L_0x018e;
                case 30: goto L_0x040b;
                case 31: goto L_0x0158;
                case 32: goto L_0x044d;
                case 33: goto L_0x0469;
                case 34: goto L_0x047a;
                case 35: goto L_0x048b;
                case 36: goto L_0x04a3;
                case 37: goto L_0x04b8;
                case 38: goto L_0x04e4;
                case 39: goto L_0x0505;
                case 40: goto L_0x051d;
                case 41: goto L_0x0533;
                case 42: goto L_0x0546;
                case 43: goto L_0x0561;
                case 44: goto L_0x057d;
                case 45: goto L_0x0592;
                case 46: goto L_0x05c4;
                case 47: goto L_0x05d5;
                case 48: goto L_0x05f1;
                case 49: goto L_0x0606;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.Object r0 = r13.A01
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageBitmap(r14)
        L_0x0012:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0015:
            X.LFx r14 = (X.C63970LFx) r14
            r3 = 0
            X.0qQ.A0B(r14, r3)
            X.KzI r0 = r14.A00
            boolean r0 = r0 instanceof X.C60332Jjb
            if (r0 != 0) goto L_0x0027
            X.KzI r0 = r14.A01
            boolean r0 = r0 instanceof X.C60332Jjb
            if (r0 == 0) goto L_0x0012
        L_0x0027:
            java.lang.Object r2 = r13.A01
            com.instagram.reels.storiestemplate.discovery.view.StoryTemplateDiscoverySurfaceFragment r2 = (com.instagram.reels.storiestemplate.discovery.view.StoryTemplateDiscoverySurfaceFragment) r2
            r1 = 3
            r0 = 0
            com.instagram.reels.storiestemplate.discovery.view.StoryTemplateDiscoverySurfaceFragment.updateActiveViewHolder$default(r2, r3, r3, r1, r0)
            goto L_0x0012
        L_0x0031:
            X.N3s r14 = (X.C68177N3s) r14
            r2 = 0
            X.0qQ.A0B(r14, r2)
            java.lang.Object r0 = r13.A01
            X.MuO r0 = (X.C67764MuO) r0
            X.O9D r0 = r0.A03
            com.instagram.reels.storiestemplate.discovery.view.StoryTemplateDiscoverySurfaceFragment r4 = r0.A00
            androidx.fragment.app.FragmentActivity r8 = r4.getActivity()
            r11 = 0
            if (r8 == 0) goto L_0x0106
            X.0eM r0 = r4.session$delegate
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r0)
            X.28D r9 = X.28D.A46
            X.6b6 r7 = new X.6b6
            r12 = r11
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x0054:
            com.instagram.reels.prompt.model.PromptStickerModel r3 = r14.A04
            if (r3 == 0) goto L_0x0067
            if (r7 == 0) goto L_0x0067
            X.3ui r0 = r14.A03
            if (r0 == 0) goto L_0x0103
            X.6b1 r1 = X.AEF.A01(r0)
        L_0x0062:
            com.instagram.feed.media.CreativeConfigIntf r0 = r14.A01
            r7.A04(r0, r3, r1, r11)
        L_0x0067:
            java.lang.String r9 = r14.A07
            java.lang.String r7 = ""
            if (r9 != 0) goto L_0x006e
            r9 = r7
        L_0x006e:
            int r0 = r14.A00
            long r0 = (long) r0
            X.C3Q r5 = r14.A05
            if (r5 == 0) goto L_0x007f
            java.lang.String r3 = "strong_id__"
            java.lang.String r3 = r5.getOptionalStringField(r2, r3)
            java.lang.Long r11 = X.C51972G9s.A0i(r3)
        L_0x007f:
            java.lang.String r6 = r14.A08
            if (r6 != 0) goto L_0x0084
            r6 = r7
        L_0x0084:
            java.lang.String r5 = r4.viewerSessionId
            X.0eM r3 = r4.session$delegate
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r3)
            java.lang.String r3 = "StoryTemplateDiscoverySurfaceFragment"
            X.0xG r8 = X.DbS.A0O(r3)
            X.EWj r4 = r14.A02
            X.0qQ.A0B(r9, r2)
            r3 = 3
            X.C51973G9u.A0r(r3, r6, r5, r10)
            r2 = 7
            X.0wc r2 = X.C51967G9n.A0Z(r8, r10, r4, r2)
            X.1Ln r2 = X.1Ln.A0C(r2)
            boolean r8 = X.DbT.A1Y(r2)
            if (r8 == 0) goto L_0x0012
            r2.A0m(r9)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "m_t"
            r2.A0Q(r0, r1)
            r0 = 0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "time_elapsed"
            r2.A0P(r0, r1)
            java.lang.String r0 = "time_remaining"
            r2.A0P(r0, r1)
            java.lang.String r0 = "tray_session_id"
            r2.A0R(r0, r7)
            java.lang.String r0 = "viewer_session_id"
            r2.A0R(r0, r5)
            java.lang.String r0 = "reel_id"
            r2.A0R(r0, r6)
            java.lang.String r0 = "tap"
            r2.A0k(r0)
            int r1 = r4.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0100
            if (r1 == r3) goto L_0x00fd
            r0 = 4
            if (r1 == r0) goto L_0x00fa
            r1 = 0
        L_0x00e7:
            r0 = 53
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A0R(r0, r1)
            java.lang.String r0 = "a_pk"
            r2.A0Q(r0, r11)
            r2.Cgf()
            goto L_0x0012
        L_0x00fa:
            java.lang.String r1 = "add_yours_templates_discovery_surface_international_hits"
            goto L_0x00e7
        L_0x00fd:
            java.lang.String r1 = "add_yours_templates_discovery_surface_hot_right_now"
            goto L_0x00e7
        L_0x0100:
            java.lang.String r1 = "add_yours_templates_discovery_surface_find_it_first"
            goto L_0x00e7
        L_0x0103:
            r1 = r11
            goto L_0x0062
        L_0x0106:
            r7 = r11
            goto L_0x0054
        L_0x0109:
            int r0 = X.AnonymousClass7TE.A0M(r14)
            java.lang.Object r4 = r13.A01
            X.HDS r4 = (X.HDS) r4
            r4.A01 = r0
            double r2 = (double) r0
            double r0 = r4.A00
            double r2 = r2 * r0
            r4.A00 = r2
            goto L_0x0012
        L_0x011b:
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.Object r0 = r13.A01
            X.C51965G9l.A1W(r0, r14)
            goto L_0x0012
        L_0x0126:
            X.0lg r14 = (X.0lg) r14
            r0 = 0
            X.0qQ.A0B(r14, r0)
            java.lang.Object r2 = r13.A01
            com.instagram.rtc.activity.RtcCallIntentHandlerActivity r2 = (com.instagram.rtc.activity.RtcCallIntentHandlerActivity) r2
            X.2cc r1 = X.C71342cb.A00(r14)
            java.lang.String r0 = "ig_activity"
            r1.A0E(r0, r2)
            goto L_0x0012
        L_0x013b:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PJn r0 = (X.C72773PJn) r0
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0150;
                case 1: goto L_0x0154;
                case 2: goto L_0x016c;
                default: goto L_0x014c;
            }
        L_0x014c:
            java.lang.String r2 = "unknown"
            goto L_0x0577
        L_0x0150:
            java.lang.String r2 = "audio_record_start_error"
            goto L_0x0577
        L_0x0154:
            java.lang.String r2 = "audio_record_long_stall"
            goto L_0x0577
        L_0x0158:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PJy r0 = (X.C72784PJy) r0
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x016c
            java.lang.String r2 = "voice_detected"
            goto L_0x0577
        L_0x016c:
            java.lang.String r2 = "notification_shown"
            goto L_0x0577
        L_0x0170:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.String r2 = "show_picker"
            java.lang.String r0 = "event_type"
            r1.A03(r0, r2)
            java.lang.Object r0 = r13.A01
            X.PJo r0 = (X.C72774PJo) r0
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0192;
                case 1: goto L_0x0195;
                default: goto L_0x0188;
            }
        L_0x0188:
            java.lang.String r2 = "upsell"
        L_0x018a:
            java.lang.String r0 = "entry_point"
            goto L_0x058d
        L_0x018e:
            X.ONr r1 = X.C66581MXm.A0h(r14)
        L_0x0192:
            java.lang.String r2 = "call_controls"
            goto L_0x018a
        L_0x0195:
            java.lang.String r2 = "swipe"
            goto L_0x018a
        L_0x0198:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PJp r0 = (X.C72775PJp) r0
            boolean r0 = r0.A00
            goto L_0x056b
        L_0x01a4:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r4 = r13.A01
            X.PKG r4 = (X.PKG) r4
            java.lang.String r0 = r4.A02
            A01(r1, r0)
            java.lang.Integer r0 = r4.A01
            java.lang.String r2 = X.O20.A00(r0)
            java.lang.String r0 = "content_source"
            r1.A03(r0, r2)
            long r2 = r4.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "load_time_ms"
            r1.A02(r0, r2)
            java.lang.String r2 = r4.A03
            java.lang.String r0 = "tab_source"
            goto L_0x058d
        L_0x01cd:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r2 = r13.A01
            X.PKA r2 = (X.PKA) r2
            java.lang.String r0 = r2.A01
            A01(r1, r0)
            java.lang.Integer r0 = r2.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x01e7;
                case 1: goto L_0x01eb;
                default: goto L_0x01e3;
            }
        L_0x01e3:
            java.lang.String r2 = "scrub"
            goto L_0x0577
        L_0x01e7:
            java.lang.String r2 = "play"
            goto L_0x0577
        L_0x01eb:
            java.lang.String r2 = "pause"
            goto L_0x0577
        L_0x01ef:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r3 = r13.A01
            X.PKD r3 = (X.PKD) r3
            java.lang.String r0 = r3.A01
            A01(r1, r0)
            java.lang.Integer r0 = r3.A00
            java.lang.String r2 = X.O20.A00(r0)
            java.lang.String r0 = "content_source"
            r1.A03(r0, r2)
            java.lang.String r2 = r3.A02
            java.lang.String r0 = "tab_source"
            goto L_0x058d
        L_0x020d:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r4 = r13.A01
            X.PKJ r4 = (X.PKJ) r4
            java.lang.String r0 = r4.A04
            A01(r1, r0)
            java.lang.Integer r0 = r4.A02
            java.lang.String r2 = X.O20.A00(r0)
            java.lang.String r0 = "content_source"
            r1.A03(r0, r2)
            java.lang.Integer r0 = r4.A03
            java.lang.String r2 = X.O21.A00(r0)
            java.lang.String r0 = "content_type"
            r1.A03(r0, r2)
            long r2 = r4.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "on_screen_duration_ms"
            r1.A02(r0, r2)
            long r2 = r4.A01
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "playback_duration_ms"
            r1.A02(r0, r2)
            java.lang.String r2 = r4.A05
            java.lang.String r0 = "tab_source"
            goto L_0x058d
        L_0x024c:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r4 = r13.A01
            X.PKH r4 = (X.PKH) r4
            java.lang.String r0 = r4.A03
            A01(r1, r0)
            java.lang.Integer r0 = r4.A01
            java.lang.String r2 = X.O20.A00(r0)
            java.lang.String r0 = "content_source"
            r1.A03(r0, r2)
            long r2 = r4.A00
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "content_video_duration"
            r1.A02(r0, r2)
            java.lang.String r2 = r4.A02
            java.lang.String r0 = "action"
            goto L_0x058d
        L_0x0275:
            X.ONr r5 = X.C66581MXm.A0h(r14)
            java.lang.Object r3 = r13.A01
            X.PKI r3 = (X.PKI) r3
            java.lang.String r2 = r3.A03
            r1 = 0
            if (r2 == 0) goto L_0x02b3
            java.lang.String r0 = "_"
            java.lang.String r2 = X.00l.A0L(r2, r0, r2)
        L_0x0288:
            java.lang.String r0 = "content_id"
            r5.A03(r0, r2)
            java.lang.Integer r0 = r3.A01
            if (r0 == 0) goto L_0x02b1
            java.lang.String r2 = X.O20.A00(r0)
        L_0x0295:
            java.lang.String r0 = "content_source"
            r5.A03(r0, r2)
            java.lang.Integer r0 = r3.A02
            if (r0 == 0) goto L_0x02a2
            java.lang.String r1 = X.O21.A00(r0)
        L_0x02a2:
            java.lang.String r0 = "content_type"
            r5.A03(r0, r1)
            long r0 = r3.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "reels_watch_time"
            goto L_0x0601
        L_0x02b1:
            r2 = r1
            goto L_0x0295
        L_0x02b3:
            r2 = r1
            goto L_0x0288
        L_0x02b5:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r3 = r13.A01
            X.PKE r3 = (X.PKE) r3
            java.lang.String r0 = r3.A02
            A01(r1, r0)
            java.lang.Integer r0 = r3.A00
            java.lang.String r2 = X.O20.A00(r0)
            java.lang.String r0 = "content_source"
            r1.A03(r0, r2)
            java.lang.Integer r0 = r3.A01
            java.lang.String r2 = X.O21.A00(r0)
            java.lang.String r0 = "content_type"
            goto L_0x058d
        L_0x02d7:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PJq r0 = (X.C72776PJq) r0
            java.lang.String r2 = r0.A00
            java.lang.String r0 = "_"
            java.lang.String r2 = X.00l.A0L(r2, r0, r2)
            java.lang.String r0 = "content_id"
            goto L_0x058d
        L_0x02eb:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PJr r0 = (X.C72777PJr) r0
            java.lang.String r2 = r0.A00
            java.lang.String r0 = "_"
            java.lang.String r2 = X.00l.A0L(r2, r0, r2)
            java.lang.String r0 = "content_id"
            goto L_0x058d
        L_0x02ff:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PJs r0 = (X.C72778PJs) r0
            java.lang.String r2 = r0.A00
            java.lang.String r0 = "_"
            java.lang.String r2 = X.00l.A0L(r2, r0, r2)
            java.lang.String r0 = "content_id"
            goto L_0x058d
        L_0x0313:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PKw r0 = (X.C72808PKw) r0
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x032a;
                case 2: goto L_0x032d;
                case 3: goto L_0x0330;
                case 4: goto L_0x0333;
                case 5: goto L_0x0336;
                case 6: goto L_0x0339;
                case 7: goto L_0x033c;
                default: goto L_0x0324;
            }
        L_0x0324:
            java.lang.String r2 = "call_ended"
        L_0x0326:
            java.lang.String r0 = "end_screen_type"
            goto L_0x058d
        L_0x032a:
            java.lang.String r2 = "no_answer"
            goto L_0x0326
        L_0x032d:
            java.lang.String r2 = "you_left_call"
            goto L_0x0326
        L_0x0330:
            java.lang.String r2 = "receiver_ineligible"
            goto L_0x0326
        L_0x0333:
            java.lang.String r2 = "call_failed"
            goto L_0x0326
        L_0x0336:
            java.lang.String r2 = "call_full"
            goto L_0x0326
        L_0x0339:
            java.lang.String r2 = "last_one_left"
            goto L_0x0326
        L_0x033c:
            java.lang.String r2 = "minimized"
            goto L_0x0326
        L_0x033f:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PKx r0 = (X.C72809PKx) r0
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0353
            java.lang.String r2 = "join_call"
            goto L_0x0541
        L_0x0353:
            java.lang.String r2 = "initiate_call"
            goto L_0x0541
        L_0x0357:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r2 = r13.A01
            X.PKB r2 = (X.PKB) r2
            java.lang.String r0 = r2.A00
            A01(r1, r0)
            java.lang.String r2 = r2.A01
            java.lang.String r0 = "captions_locale"
            goto L_0x058d
        L_0x036a:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.String r2 = "effects_entry_point_tap"
            java.lang.String r0 = "event_type"
            r1.A03(r0, r2)
            java.lang.Object r0 = r13.A01
            X.PJt r0 = (X.C72779PJt) r0
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0386;
                case 1: goto L_0x03aa;
                case 2: goto L_0x03a6;
                case 3: goto L_0x03a2;
                case 4: goto L_0x039e;
                case 5: goto L_0x039a;
                case 6: goto L_0x0396;
                case 7: goto L_0x0392;
                case 8: goto L_0x038e;
                case 9: goto L_0x038a;
                default: goto L_0x0382;
            }
        L_0x0382:
            java.lang.String r2 = "chevron_button"
            goto L_0x0555
        L_0x0386:
            java.lang.String r2 = "effects_button"
            goto L_0x0555
        L_0x038a:
            java.lang.String r2 = "dual_camera_button"
            goto L_0x0555
        L_0x038e:
            java.lang.String r2 = "solo_backgrounds_button"
            goto L_0x0555
        L_0x0392:
            java.lang.String r2 = "touch_up_button"
            goto L_0x0555
        L_0x0396:
            java.lang.String r2 = "avatar_thumbnail_button"
            goto L_0x0555
        L_0x039a:
            java.lang.String r2 = "avatar_backgrounds_button"
            goto L_0x0555
        L_0x039e:
            java.lang.String r2 = "avatar_filters_button"
            goto L_0x0555
        L_0x03a2:
            java.lang.String r2 = "avatars_button"
            goto L_0x0555
        L_0x03a6:
            java.lang.String r2 = "filters_button"
            goto L_0x0555
        L_0x03aa:
            java.lang.String r2 = "effects_discovery_button"
            goto L_0x0555
        L_0x03ae:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.String r2 = "effects_tab_auto_selected"
            java.lang.String r0 = "event_type"
            r1.A03(r0, r2)
            java.lang.Object r0 = r13.A01
            X.PJu r0 = (X.C72780PJu) r0
            X.Njp r0 = r0.A00
            java.lang.String r2 = r0.A00
            java.lang.String r0 = "event_source"
            goto L_0x058d
        L_0x03c5:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.String r2 = "effects_tab_impression"
            java.lang.String r0 = "event_type"
            r1.A03(r0, r2)
            java.lang.Object r0 = r13.A01
            X.PJv r0 = (X.C72781PJv) r0
            X.Njp r0 = r0.A00
            java.lang.String r2 = r0.A00
            java.lang.String r0 = "event_source"
            goto L_0x058d
        L_0x03dc:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.String r2 = "effects_tab_tap"
            java.lang.String r0 = "event_type"
            r1.A03(r0, r2)
            java.lang.Object r0 = r13.A01
            X.PJw r0 = (X.C72782PJw) r0
            X.Njp r0 = r0.A00
            java.lang.String r2 = r0.A00
            java.lang.String r0 = "event_source"
            goto L_0x058d
        L_0x03f3:
            X.ONr r3 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PJx r0 = (X.C72783PJx) r0
            X.0xE r0 = r0.A00
            java.lang.String r2 = "added_users"
            X.NeF r1 = new X.NeF
            r1.<init>(r0)
            java.util.Map r0 = r3.A00
            r0.put(r2, r1)
            goto L_0x0012
        L_0x040b:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r4 = r13.A01
            X.PKF r4 = (X.PKF) r4
            java.lang.Integer r0 = r4.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x043f;
                case 1: goto L_0x0442;
                default: goto L_0x041c;
            }
        L_0x041c:
            java.lang.String r2 = "minimize_button_pressed"
        L_0x041e:
            java.lang.String r0 = "action"
            r1.A03(r0, r2)
            boolean r3 = r4.A02
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "result"
            r1.A01(r0, r2)
            if (r3 != 0) goto L_0x0012
            java.lang.Integer r0 = r4.A01
            if (r0 == 0) goto L_0x0012
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x0445;
                case 2: goto L_0x0449;
                default: goto L_0x043b;
            }
        L_0x043b:
            java.lang.String r2 = "ig_feature_not_enabled"
            goto L_0x0541
        L_0x043f:
            java.lang.String r2 = "on_back_pressed"
            goto L_0x041e
        L_0x0442:
            java.lang.String r2 = "on_user_leave_hint"
            goto L_0x041e
        L_0x0445:
            java.lang.String r2 = "system_permission_denied"
            goto L_0x0541
        L_0x0449:
            java.lang.String r2 = "system_not_capable"
            goto L_0x0541
        L_0x044d:
            X.ONr r2 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PJz r0 = (X.C72785PJz) r0
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto L_0x045b
            java.lang.String r1 = "unknown"
        L_0x045b:
            java.lang.String r0 = "network_state"
            r2.A03(r0, r1)
            java.lang.String r1 = "action"
            java.lang.String r0 = "notification_shown"
            r2.A03(r1, r0)
            goto L_0x0012
        L_0x0469:
            X.ONr r2 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PK0 r0 = (X.PK0) r0
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "remaining_captures"
            goto L_0x04b3
        L_0x047a:
            X.ONr r2 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PK1 r0 = (X.PK1) r0
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "zoom_level"
            goto L_0x04b3
        L_0x048b:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PK2 r0 = (X.PK2) r0
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x049f
            java.lang.String r2 = "reconnecting_view_hidden"
            goto L_0x0577
        L_0x049f:
            java.lang.String r2 = "reconnecting_view_shown"
            goto L_0x0577
        L_0x04a3:
            X.ONr r2 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PK3 r0 = (X.PK3) r0
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "value"
        L_0x04b3:
            r2.A00(r1, r0)
            goto L_0x0012
        L_0x04b8:
            X.ONr r14 = (X.C70840ONr) r14
            r2 = 0
            X.0qQ.A0B(r14, r2)
            java.lang.String r1 = "captured"
            java.lang.String r0 = "action"
            r14.A03(r0, r1)
            java.lang.Object r0 = r13.A01
            X.PK4 r0 = (X.PK4) r0
            java.lang.Integer r0 = r0.A00
            java.lang.String r1 = X.O21.A00(r0)
            java.lang.String r0 = "media_type"
            r14.A03(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "face_filters_used"
            r14.A01(r0, r1)
            java.lang.String r0 = "is_hardware_capture"
            r14.A01(r0, r1)
            goto L_0x0012
        L_0x04e4:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            r0 = 3023(0xbcf, float:4.236E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "action"
            r1.A03(r0, r2)
            java.lang.Object r0 = r13.A01
            X.PK5 r0 = (X.PK5) r0
            java.lang.Integer r0 = r0.A00
            java.lang.String r2 = X.O21.A00(r0)
            java.lang.String r0 = "media_type"
            r1.A03(r0, r2)
            java.lang.String r2 = "swiped"
            goto L_0x0541
        L_0x0505:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.String r2 = "tapped"
            java.lang.String r0 = "action"
            r1.A03(r0, r2)
            java.lang.Object r0 = r13.A01
            X.PK6 r0 = (X.PK6) r0
            java.lang.Integer r0 = r0.A00
            java.lang.String r2 = X.O21.A00(r0)
            java.lang.String r0 = "media_type"
            goto L_0x058d
        L_0x051d:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PK7 r0 = (X.PK7) r0
            java.lang.Integer r0 = r0.A00
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0530
            java.lang.String r2 = "save_to_library_denied"
            goto L_0x0577
        L_0x0530:
            java.lang.String r2 = "save_to_library_granted"
            goto L_0x0577
        L_0x0533:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PKv r0 = (X.C72807PKv) r0
            java.lang.Integer r0 = r0.A00
            if (r0 == 0) goto L_0x0544
            java.lang.String r2 = "screen_locked"
        L_0x0541:
            java.lang.String r0 = "reason"
            goto L_0x058d
        L_0x0544:
            r2 = 0
            goto L_0x0541
        L_0x0546:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            int r0 = X.AnonymousClass7TE.A0M(r0)
            switch(r0) {
                case 1: goto L_0x0558;
                case 2: goto L_0x055b;
                case 3: goto L_0x055e;
                default: goto L_0x0553;
            }
        L_0x0553:
            java.lang.String r2 = "call_controls"
        L_0x0555:
            java.lang.String r0 = "event_source"
            goto L_0x058d
        L_0x0558:
            java.lang.String r2 = "cowatch_blocks_sheet"
            goto L_0x0555
        L_0x055b:
            java.lang.String r2 = "nux_bottom_sheet"
            goto L_0x0555
        L_0x055e:
            java.lang.String r2 = "nux_dialog"
            goto L_0x0555
        L_0x0561:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PK8 r0 = (X.PK8) r0
            boolean r0 = r0.A00
        L_0x056b:
            java.lang.Integer r0 = X.JTP.A0j(r0)
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x057a
            java.lang.String r2 = "off"
        L_0x0577:
            java.lang.String r0 = "action"
            goto L_0x058d
        L_0x057a:
            java.lang.String r2 = "on"
            goto L_0x0577
        L_0x057d:
            X.ONr r1 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PK9 r0 = (X.PK9) r0
            java.lang.String r2 = r0.A00
            r0 = 5337(0x14d9, float:7.479E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x058d:
            r1.A03(r0, r2)
            goto L_0x0012
        L_0x0592:
            X.ONr r5 = X.C66581MXm.A0h(r14)
            java.lang.Object r2 = r13.A01
            X.Ods r2 = (X.C71142Ods) r2
            long r0 = r2.A0A
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "talk_time"
            r5.A02(r0, r1)
            long r0 = r2.A05
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration_minimized_screen"
            r5.A02(r0, r1)
            long r0 = r2.A04
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration_full_screen"
            r5.A02(r0, r1)
            long r0 = r2.A03
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "duration_backgrounded"
            goto L_0x0601
        L_0x05c4:
            X.ONr r5 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.Ods r0 = (X.C71142Ods) r0
            long r0 = r0.A07
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "talk_time"
            goto L_0x0601
        L_0x05d5:
            X.ONr r5 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.Ods r0 = (X.C71142Ods) r0
            long r3 = r0.A0D
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x05ea
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r3
        L_0x05ea:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "resume_time"
            goto L_0x0601
        L_0x05f1:
            X.ONr r5 = X.C66581MXm.A0h(r14)
            java.lang.Object r0 = r13.A01
            X.PL2 r0 = (X.PL2) r0
            long r0 = r0.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "value"
        L_0x0601:
            r5.A02(r0, r1)
            goto L_0x0012
        L_0x0606:
            X.ONr r4 = X.C66581MXm.A0h(r14)
            java.lang.Object r3 = r13.A01
            X.PL6 r3 = (X.PL6) r3
            java.lang.Integer r0 = r3.A00
            java.lang.String r1 = X.O22.A00(r0)
            java.lang.String r0 = "action"
            r4.A03(r0, r1)
            r1 = 0
            java.lang.String r2 = "touchup_effect"
            java.lang.String r0 = "effect_type"
            r4.A03(r0, r2)
            java.lang.String r2 = r3.A03
            java.lang.String r0 = "slider_qualified_use_bucket"
            r4.A03(r0, r2)
            java.lang.Long r2 = r3.A02
            java.lang.String r0 = "effect_duration"
            r4.A02(r0, r2)
            java.lang.Integer r0 = r3.A01
            if (r0 == 0) goto L_0x0637
            java.lang.String r1 = X.O23.A00(r0)
        L_0x0637:
            java.lang.String r0 = "effect_trigger"
            r4.A03(r0, r1)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74190PqW.invoke(java.lang.Object):java.lang.Object");
    }
}
