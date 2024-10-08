package X;

import android.content.DialogInterface;

public final class LV0 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LV0(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static LV0 A00(Object obj, Object obj2, int i) {
        return new LV0(i, obj, obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x058a, code lost:
        X.C70888OQg.A00(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x058d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x05b4, code lost:
        X.Dbb.A0k(r5, r4, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x05b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x066e, code lost:
        r6.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0671, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x07fd, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0804, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x08bd, code lost:
        X.C359448cq.A03(r5, r6, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x08c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x08ca, code lost:
        r0.A06.A1N(r3, r2, X.AnonymousClass000.A00(232));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x08d5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0911, code lost:
        X.JWG.A07(r1, (java.lang.Integer) r4.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c9, code lost:
        r1 = r5.A01.AR4();
        r1.E5T("translate_stickers", false);
        r1.apply();
        r4 = ((X.27r) r4.A01).A0C;
        r2 = r4.A01;
        r5 = r2.A00(r2.A00, "ig_camera_nux");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0918, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x093a, code lost:
        X.JTU.A1J(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x093d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ec, code lost:
        if (r5.isSampled() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0994, code lost:
        r4 = new X.MHC(r3, (java.lang.Object) r5, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ee, code lost:
        r5.AAJ("entity", "TRANSLATE_TEXT_STICKER");
        r5.AAJ("nux_step", "DISMISS");
        r2 = r4.A04;
        r1 = r2.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0999, code lost:
        X.AnonymousClass7TE.A1Z(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x099c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0100, code lost:
        if (r1 != null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0102, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0104, code lost:
        r5.AAJ("camera_session_id", r1);
        r5.A8M(r2.A09, com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        r3 = 2;
        r5.A8k("event_type", 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x011c, code lost:
        if (r2.A01 == 2) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011e, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x011f, code lost:
        r5.A8k("camera_position", java.lang.Integer.valueOf(r3));
        r5.A8M(r4.A0I(), "capture_type");
        r5.A8M(r2.A0A, "media_type");
        r5.AAJ("module", X.27x.A08.getModuleName());
        r5.A8M(X.C59725JVj.PRE_CAPTURE, "surface");
        r5.A9F("capture_format_index", 0L);
        r5.AAJ("discovery_session_id", r2.A0O);
        r5.AAJ("search_session_id", r2.A0P);
        r3 = X.AnonymousClass1QI.A00.A02.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01da, code lost:
        r0 = "nav_chain";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02a7, code lost:
        r5.AAJ(r0, r3);
        r5.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x02ad, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r19, int r20) {
        /*
            r18 = this;
            r4 = r18
            int r0 = r4.A00
            r6 = r19
            r5 = r20
            switch(r0) {
                case 0: goto L_0x09f5;
                case 1: goto L_0x09e7;
                case 2: goto L_0x02ae;
                case 3: goto L_0x09be;
                case 4: goto L_0x023b;
                case 5: goto L_0x099d;
                case 6: goto L_0x0987;
                case 7: goto L_0x0979;
                case 8: goto L_0x096b;
                case 9: goto L_0x095f;
                case 10: goto L_0x093e;
                case 11: goto L_0x0934;
                case 12: goto L_0x092a;
                case 13: goto L_0x091d;
                case 14: goto L_0x08ea;
                case 15: goto L_0x090d;
                case 16: goto L_0x08d6;
                case 17: goto L_0x08c1;
                case 18: goto L_0x08ae;
                case 19: goto L_0x08a1;
                case 20: goto L_0x0887;
                case 21: goto L_0x01de;
                case 22: goto L_0x0877;
                case 23: goto L_0x016a;
                case 24: goto L_0x00c5;
                case 25: goto L_0x016a;
                case 26: goto L_0x00b6;
                case 27: goto L_0x0824;
                case 28: goto L_0x0805;
                case 29: goto L_0x06fc;
                case 30: goto L_0x06de;
                case 31: goto L_0x06af;
                case 32: goto L_0x0688;
                case 33: goto L_0x0672;
                case 34: goto L_0x063d;
                case 35: goto L_0x062d;
                case 36: goto L_0x0614;
                case 37: goto L_0x05e1;
                case 38: goto L_0x05b8;
                case 39: goto L_0x058e;
                case 40: goto L_0x0573;
                case 41: goto L_0x058e;
                case 42: goto L_0x055b;
                case 43: goto L_0x054b;
                case 44: goto L_0x04c0;
                case 45: goto L_0x04ba;
                case 46: goto L_0x04ba;
                case 47: goto L_0x000b;
                case 48: goto L_0x000b;
                case 49: goto L_0x000b;
                case 50: goto L_0x04a9;
                case 51: goto L_0x049a;
                case 52: goto L_0x047a;
                case 53: goto L_0x0455;
                case 54: goto L_0x0437;
                case 55: goto L_0x001f;
                case 56: goto L_0x03de;
                case 57: goto L_0x03c8;
                case 58: goto L_0x0303;
                case 59: goto L_0x02f3;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r4.A02
            X.JaK r0 = (X.C59844JaK) r0
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r1 = X.C59844JaK.A00(r0)
            java.lang.Object r0 = r4.A01
            X.JwL r0 = (X.C61083JwL) r0
            java.lang.Object r0 = r0.A00
            X.L2R r0 = (X.L2R) r0
            r1.A06(r0)
        L_0x001e:
            return
        L_0x001f:
            java.lang.Object r0 = r4.A02
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r11 = X.LRB.A00(r0)
            java.lang.Object r1 = r4.A01
            X.KoA r1 = (X.C62896KoA) r1
            X.KeI r1 = (X.C62345KeI) r1
            com.instagram.user.model.User r0 = r1.A00
            java.lang.String r12 = r0.getId()
            java.lang.String r6 = r1.A01
            r0 = 1
            X.0qQ.A0B(r6, r0)
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r11.A0C
            X.JvD r10 = X.JTQ.A0Q(r0)
            if (r10 == 0) goto L_0x001e
            X.6oS r0 = X.C318116oQ.A00(r11)
            r13 = 0
            r14 = 24
            X.MGk r9 = new X.MGk
            r9.<init>(r10, r11, r12, r13, r14)
            X.AnonymousClass7TE.A1Z(r9, r0)
            X.LF6 r7 = r11.A08
            java.lang.String r9 = r10.A08
            java.lang.String r3 = X.C61013JvD.A00(r10)
            java.lang.String r8 = r10.A09
            com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager r0 = r11.A0E
            X.Juh r0 = X.JTP.A0e(r0)
            if (r0 == 0) goto L_0x0062
            java.util.Set r13 = r0.A09
        L_0x0062:
            X.0wc r1 = r7.A01
            java.lang.String r0 = "ig_live_mute_user"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r5 = "0"
            X.JTQ.A14(r2, r3)
            r3 = 0
            if (r9 == 0) goto L_0x00b3
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r9)
            if (r0 == 0) goto L_0x00b3
            long r0 = r0.longValue()
        L_0x007d:
            X.JTQ.A10(r2, r0)
            if (r8 != 0) goto L_0x0083
            r8 = r5
        L_0x0083:
            X.C51965G9l.A1I(r2, r8)
            X.0iw r0 = r7.A00
            X.C51969G9p.A1A(r2, r0)
            java.lang.String r0 = "method"
            r2.AAJ(r0, r6)
            long r0 = X.DbZ.A07(r12)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "target_user_id"
            r2.A9F(r0, r1)
            java.lang.String r0 = "moderator"
            X.JTO.A1R(r2, r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "c_pk"
            r2.A9F(r0, r1)
            java.util.List r0 = X.JTT.A0t(r13)
            X.JTQ.A16(r2, r0)
            return
        L_0x00b3:
            r0 = 0
            goto L_0x007d
        L_0x00b6:
            java.lang.Object r5 = r4.A02
            X.1Av r5 = (X.1Av) r5
            r3 = 1
            X.0s0 r2 = r5.A0h
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 188(0xbc, float:2.63E-43)
            X.AnonymousClass7TF.A1J(r5, r2, r1, r0, r3)
            goto L_0x00c9
        L_0x00c5:
            java.lang.Object r5 = r4.A02
            X.1Av r5 = (X.1Av) r5
        L_0x00c9:
            r2 = 0
            X.0xa r0 = r5.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "translate_stickers"
            r1.E5T(r0, r2)
            r1.apply()
            java.lang.Object r0 = r4.A01
            X.27r r0 = (X.27r) r0
            X.29V r4 = r0.A0C
            X.0wc r2 = r4.A01
            java.lang.String r1 = "ig_camera_nux"
            X.0kJ r0 = r2.A00
            X.0Aj r5 = r2.A00(r0, r1)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto L_0x001e
            java.lang.String r1 = "TRANSLATE_TEXT_STICKER"
            java.lang.String r0 = "entity"
            r5.AAJ(r0, r1)
            java.lang.String r1 = "DISMISS"
            java.lang.String r0 = "nux_step"
            r5.AAJ(r0, r1)
            X.283 r2 = r4.A04
            java.lang.String r1 = r2.A0L
            if (r1 != 0) goto L_0x0104
            java.lang.String r1 = ""
        L_0x0104:
            java.lang.String r0 = "camera_session_id"
            r5.AAJ(r0, r1)
            X.28D r1 = r2.A09
            java.lang.String r0 = "entry_point"
            r5.A8M(r1, r0)
            r3 = 2
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5.A8k(r1, r0)
            int r0 = r2.A01
            if (r0 == r3) goto L_0x011f
            r3 = 1
        L_0x011f:
            java.lang.String r1 = "camera_position"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r5.A8k(r1, r0)
            X.8fP r1 = r4.A0I()
            java.lang.String r0 = "capture_type"
            r5.A8M(r1, r0)
            X.28t r1 = r2.A0A
            java.lang.String r0 = "media_type"
            r5.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r5.AAJ(r0, r1)
            X.JVj r1 = X.C59725JVj.PRE_CAPTURE
            java.lang.String r0 = "surface"
            r5.A8M(r1, r0)
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "capture_format_index"
            r5.A9F(r0, r1)
            java.lang.String r1 = r2.A0O
            java.lang.String r0 = "discovery_session_id"
            r5.AAJ(r0, r1)
            java.lang.String r1 = r2.A0P
            java.lang.String r0 = "search_session_id"
            r5.AAJ(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r3 = r0.A00
            goto L_0x01da
        L_0x016a:
            java.lang.Object r5 = r4.A02
            X.1Av r5 = (X.1Av) r5
            r3 = 1
            X.0s0 r2 = r5.A0h
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 188(0xbc, float:2.63E-43)
            X.AnonymousClass7TF.A1J(r5, r2, r1, r0, r3)
            X.0xa r0 = r5.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "translate_stickers"
            r1.E5T(r0, r3)
            r1.apply()
            java.lang.Object r0 = r4.A01
            X.27r r0 = (X.27r) r0
            X.29V r3 = r0.A0C
            X.0wc r1 = r3.A01
            java.lang.String r0 = "ig_camera_nux"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "TRANSLATE_TEXT_STICKER"
            X.JTO.A1Q(r5, r0)
            java.lang.String r1 = "CONTINUE"
            java.lang.String r0 = "nux_step"
            r5.AAJ(r0, r1)
            X.283 r2 = r3.A04
            java.lang.String r0 = X.JTP.A0p(r2)
            X.JTO.A1S(r5, r0)
            X.AnonymousClass7TE.A1V(r5, r2)
            r1 = 2
            java.lang.String r0 = "event_type"
            X.AnonymousClass7TE.A1W(r5, r0, r1)
            int r0 = r2.A01
            if (r0 == r1) goto L_0x01bd
            r1 = 1
        L_0x01bd:
            java.lang.String r0 = "camera_position"
            X.AnonymousClass7TE.A1W(r5, r0, r1)
            X.JTQ.A12(r5, r3)
            X.JTP.A1J(r5, r2)
            X.AnonymousClass7TH.A0U(r5)
            X.JVj r0 = X.C59725JVj.PRE_CAPTURE
            X.C51965G9l.A1A(r0, r5)
            X.JTS.A16(r5)
            X.JTU.A0x(r5, r2)
            java.lang.String r3 = X.DbS.A0k()
        L_0x01da:
            java.lang.String r0 = "nav_chain"
            goto L_0x02a7
        L_0x01de:
            java.lang.Object r5 = r4.A02
            X.Lgg r5 = (X.C64708Lgg) r5
            java.lang.Object r0 = r4.A01
            X.8RW r0 = (X.AnonymousClass8RW) r0
            int r4 = r0.A00
            java.util.HashMap r3 = r5.A0B
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            boolean r0 = r3.containsKey(r2)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0202
            java.lang.Object r0 = r3.remove(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0202
            float r1 = r0.floatValue()
        L_0x0202:
            r5.A00 = r1
            X.Jfo r0 = r5.A0A
            r0.A0M(r1)
            X.C64708Lgg.A02(r5, r1, r4)
            X.8RF r0 = r5.A09
            X.JTP.A1N(r0, r4)
            com.instagram.common.session.UserSession r0 = r5.A05
            X.29R r3 = X.JTO.A0b(r0)
            X.0wc r0 = r3.A02
            X.1Ln r2 = X.1Ln.A08(r0)
            X.4yP r1 = r3.A0J()
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x001e
            X.JTO.A1V(r2)
            java.lang.String r0 = "TIMELINE_SPEED_CANCEL_TAP"
            r2.A0r(r0)
            X.29R.A00(r2, r3)
            X.JTT.A1D(r2, r1, r3)
            r2.Cgf()
            return
        L_0x023b:
            java.lang.Object r7 = r4.A02
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel r7 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel) r7
            java.lang.Object r6 = r4.A01
            X.4DH r6 = (X.AnonymousClass4DH) r6
            java.lang.String r4 = "ad_toggle"
            r5 = 0
            boolean r0 = r7.A0D
            if (r0 != 0) goto L_0x0260
            r7.A0B = r5
            r7.A04()
            com.instagram.common.session.UserSession r0 = r7.A02()
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.Lg8 r0 = new X.Lg8
            r0.<init>(r5)
            r1.A00(r0)
            return
        L_0x0260:
            X.DU2 r0 = r7.A00
            if (r0 == 0) goto L_0x001e
            java.lang.String r2 = r0.getAccessToken()
            if (r2 == 0) goto L_0x001e
            r7.A0B = r5
            r7.A03 = r4
            X.6oS r1 = X.C318116oQ.A00(r7)
            r3 = 0
            r0 = 18
            X.MGE.A01(r7, r2, r1, r0)
            java.util.List r0 = r7.A06
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x028c
            java.util.List r0 = r7.A06
            java.lang.Object r0 = X.00k.A0O(r0, r5)
            com.instagram.pendingmedia.model.BrandedContentTag r0 = (com.instagram.pendingmedia.model.BrandedContentTag) r0
            if (r0 == 0) goto L_0x028c
            java.lang.String r3 = r0.A01
        L_0x028c:
            com.instagram.common.session.UserSession r0 = r7.A02()
            java.lang.String r2 = r7.A04
            X.0wc r1 = X.DbT.A0Q(r6, r0, r5)
            java.lang.String r0 = "instagram_bc_boost_code_access_token_disable"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)
            r0 = 527(0x20f, float:7.38E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbU.A1N(r5, r0, r4, r2)
            java.lang.String r0 = "sponsor_igid"
        L_0x02a7:
            r5.AAJ(r0, r3)
            r5.Cgf()
            return
        L_0x02ae:
            java.lang.Object r5 = r4.A02
            X.K8a r5 = (X.C61446K8a) r5
            com.instagram.common.session.UserSession r1 = r5.A06()
            java.lang.Object r2 = r4.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r0 = r2.getId()
            X.C64186LSt.A04(r5, r1, r0)
            java.util.List r0 = r5.A04
            r0.add(r2)
            com.instagram.common.session.UserSession r1 = r5.A06()
            java.lang.String r0 = r2.getId()
            X.C64186LSt.A01(r5, r1, r0)
            X.JTU.A19(r5)
            java.lang.String r4 = "continue"
            com.instagram.common.session.UserSession r3 = r5.A06()
            java.lang.Integer r2 = X.AnonymousClass05K.A0W
            com.instagram.common.session.UserSession r0 = r5.A06()
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "action_type"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r4)
            X.JVF.A04(r5, r3, r2, r1, r0)
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x001e
            X.C61446K8a.A01(r5)
            return
        L_0x02f3:
            java.lang.Object r5 = r4.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r0 = r4.A02
            X.6ZN r0 = (X.AnonymousClass6ZN) r0
            com.instagram.common.session.UserSession r4 = r0.A01
            if (r4 != 0) goto L_0x05ac
            java.lang.String r0 = "userSession"
            goto L_0x07fd
        L_0x0303:
            java.lang.Object r6 = r4.A02
            X.3uh r6 = (X.C255773uh) r6
            boolean r0 = r6.A1J()
            java.lang.Object r4 = r4.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r4 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r4
            if (r0 == 0) goto L_0x0340
            com.instagram.common.session.UserSession r0 = r4.A06
            java.util.List r3 = X.C64020LJh.A01(r0, r6)
            android.content.Context r7 = r4.requireContext()
            com.instagram.common.session.UserSession r8 = r4.A06
            com.instagram.model.reels.Reel r6 = r4.A07
            r6.getClass()
            r3.getClass()
            X.3BQ r5 = X.AnonymousClass3BQ.DASHBOARD
            r0 = 1
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0q(r8, r0)
            java.util.Iterator r2 = r3.iterator()
        L_0x0330:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x037b
            java.lang.String r0 = X.C51971G9r.A0v(r2)
            if (r0 == 0) goto L_0x0330
            r1.add(r0)
            goto L_0x0330
        L_0x0340:
            com.instagram.common.session.UserSession r2 = r4.A06
            r5 = 0
            X.0qQ.A0B(r2, r5)
            X.DUA r1 = r6.A05()
            r0 = 0
            r3 = r0
            X.1NY r2 = X.AnonymousClass7TG.A0a(r2)
            if (r1 == 0) goto L_0x0356
            java.lang.String r0 = r1.BrW()
        L_0x0356:
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "media/%s/delete_stitched_media_story_parts/"
            r2.A0K(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            X.1OC r5 = X.DbT.A0R(r3, r2, r1, r0, r5)
            X.0hq r2 = r4.mFragmentManager
            r2.getClass()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.F3H r1 = new X.F3H
            r1.<init>(r3, r2, r0)
            r0 = 25
            X.EDb r2 = new X.EDb
            r2.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r6, (java.lang.Object) r4)
            goto L_0x03bc
        L_0x037b:
            X.L8l r0 = X.JZV.A01(r7, r8, r6, r1)
            r11 = 0
            if (r0 == 0) goto L_0x03c2
            java.lang.String r11 = r0.A03
            java.util.List r13 = X.JZV.A05(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r0.A02
            int r16 = r0.getHeight()
            int r17 = r0.getWidth()
        L_0x0392:
            java.lang.String r9 = X.JTP.A0r(r6)
            X.Ki3 r7 = X.JZV.A02(r5)
            java.util.HashSet r14 = X.AnonymousClass7TE.A1F()
            java.util.HashSet r15 = new java.util.HashSet
            r15.<init>(r1)
            r10 = 0
            r12 = r10
            X.1OC r5 = X.AnonymousClass738.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.0hq r2 = r4.mFragmentManager
            r2.getClass()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.F3H r1 = new X.F3H
            r1.<init>(r10, r2, r0)
            r0 = 22
            X.Ufr r2 = new X.Ufr
            r2.<init>(r0, r4, r1, r3)
        L_0x03bc:
            r5.A00 = r2
            r4.schedule(r5)
            return
        L_0x03c2:
            r13 = r11
            r16 = 0
            r17 = 0
            goto L_0x0392
        L_0x03c8:
            java.lang.Object r1 = r4.A01
            X.LRa r1 = (X.C64159LRa) r1
            java.lang.Object r0 = r4.A02
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            com.instagram.common.session.UserSession r3 = r1.A0B
            java.lang.String r2 = r0.getId()
            X.4DH r1 = r1.A0A
            java.lang.String r0 = "FEED_COMPOSER"
            X.LTM.A04(r1, r3, r0, r2)
            return
        L_0x03de:
            java.lang.Object r3 = r4.A01
            X.LRa r3 = (X.C64159LRa) r3
            java.lang.Object r4 = r4.A02
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r6 = r4.getId()
            com.instagram.common.session.UserSession r2 = r3.A0B
            X.0Tu r5 = X.0Tu.A06
            r0 = 36599602467573339(0x82072500000e5b, double:3.209074203038839E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r5, r2, r0)
            int r15 = r0.intValue()
            r0 = 36881077444346224(0x83072500010170, double:3.3870801117587687E-306)
            java.lang.String r7 = X.182.A04(r5, r2, r0)
            java.lang.String r8 = r4.B8Q()
            r0 = 36318127490996097(0x81072500021781, double:3.031068294442634E-306)
            boolean r16 = X.182.A06(r5, r2, r0)
            X.4Cl r0 = r4.A03
            java.lang.String r11 = r0.Amu()
            java.util.List r14 = java.util.Collections.emptyList()
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r0 = com.instagram.model.fundraiser.FundraiserCampaignTypeEnum.IG_STANDALONE_FOR_CHARITY
            java.lang.String r12 = r0.toString()
            r9 = 0
            java.lang.String r10 = "FEED_COMPOSER"
            com.instagram.model.fundraiser.NewFundraiserInfo r5 = new com.instagram.model.fundraiser.NewFundraiserInfo
            r13 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3.A04(r5)
            java.lang.String r1 = r4.getId()
            X.4DH r0 = r3.A0A
            X.LTM.A03(r0, r2, r10, r1)
            return
        L_0x0437:
            java.lang.Object r0 = r4.A02
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r7 = X.LRB.A00(r0)
            java.lang.Object r0 = r4.A01
            X.KoA r0 = (X.C62896KoA) r0
            X.KeJ r0 = (X.C62346KeJ) r0
            com.instagram.user.model.User r5 = r0.A00
            X.MVW r6 = r0.A01
            X.6oS r0 = X.C51975G9x.A0R(r7, r5)
            r8 = 0
            r9 = 15
            X.MHK r4 = new X.MHK
            r4.<init>((java.lang.Object) r5, (java.lang.Object) r6, (java.lang.Object) r7, (X.AnonymousClass4D7) r8, (int) r9)
            goto L_0x0999
        L_0x0455:
            java.lang.Object r0 = r4.A02
            X.L9R r0 = (X.L9R) r0
            X.0eM r0 = r0.A04
            java.lang.Object r5 = r0.getValue()
            X.JhW r5 = (X.C60213JhW) r5
            java.lang.Object r0 = r4.A01
            X.Ko8 r0 = (X.C62894Ko8) r0
            X.KeD r0 = (X.C62340KeD) r0
            com.instagram.user.model.User r3 = r0.A00
            java.lang.String r2 = r0.A01
            X.AnonymousClass7TG.A1N(r3, r2)
            X.6oS r0 = X.C318116oQ.A00(r5)
            r1 = 0
            X.MGr r4 = new X.MGr
            r4.<init>(r3, r5, r2, r1)
            goto L_0x0999
        L_0x047a:
            java.lang.Object r0 = r4.A02
            X.L7N r0 = (X.L7N) r0
            X.0eM r0 = r0.A02
            X.2YL r5 = X.DbS.A0H(r0)
            java.lang.Object r0 = r4.A01
            X.HPm r0 = (X.C54707HPm) r0
            X.KdA r0 = (X.C62276KdA) r0
            com.instagram.user.model.User r3 = r0.A00
            X.6oS r0 = X.C51975G9x.A0R(r5, r3)
            r2 = 0
            r1 = 39
            X.MGD r4 = new X.MGD
            r4.<init>(r3, r5, r2, r1)
            goto L_0x0999
        L_0x049a:
            java.lang.Object r3 = r4.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.8sM r2 = X.C368278sM.DECLINE
            java.lang.Object r1 = r4.A01
            X.1Xj r1 = (X.1Xj) r1
            r0 = 0
            X.C64373Lap.A02(r2, r3, r1, r0)
            return
        L_0x04a9:
            r6.dismiss()
            java.lang.Object r2 = r4.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r4.A01
            X.818 r1 = (X.AnonymousClass818) r1
            X.8sM r0 = X.C368278sM.DECLINE
            X.C64071LLp.A00(r1, r0, r2)
            return
        L_0x04ba:
            java.lang.Object r0 = r4.A01
            X.DbS.A1U(r0)
            return
        L_0x04c0:
            java.lang.Object r1 = r4.A02
            X.KSq r1 = (X.C61941KSq) r1
            java.lang.Object r0 = r4.A01
            X.C51969G9p.A1M(r0)
            X.0eM r0 = r1.A0Y
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.FYp r0 = X.C50334FYp.A00(r0)
            android.content.Context r5 = r1.requireContext()
            X.0gy r4 = X.AnonymousClass07i.A00(r1)
            X.1Xj r10 = r1.A0C
            if (r10 != 0) goto L_0x04e3
            java.lang.String r0 = "editMedia"
            goto L_0x07fd
        L_0x04e3:
            r7 = 1
            X.KTh r3 = new X.KTh
            r3.<init>(r1, r7)
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.3gp r0 = r10.A1T()
            if (r0 == 0) goto L_0x04f9
            java.lang.String r9 = r0.A0d
            if (r9 != 0) goto L_0x04fb
        L_0x04f9:
            java.lang.String r9 = ""
        L_0x04fb:
            X.1Xy r0 = r10.A0C
            X.DTj r0 = r0.BFl()
            if (r0 == 0) goto L_0x0549
            java.lang.Boolean r0 = r0.Aa6()
            if (r0 == 0) goto L_0x0549
            boolean r8 = r0.booleanValue()
        L_0x050d:
            X.1NY r6 = X.AnonymousClass7TG.A0a(r2)
            java.lang.Object[] r1 = X.C51969G9p.A1b(r10)
            java.lang.String r0 = "media/%s/edit_media/"
            X.DbU.A1P(r6, r0, r1)
            X.1Xy r0 = r10.A0C
            java.lang.String r1 = r0.getTitle()
            java.lang.String r0 = "title"
            r6.A9m(r0, r1)
            java.lang.String r0 = "caption_text"
            r6.A9m(r0, r9)
            java.lang.String r0 = "igtv_ads_toggled_on"
            r6.A0H(r0, r8)
            java.lang.String r1 = "video_subtitles_enabled"
            java.lang.String r0 = "0"
            r6.A9m(r1, r0)
            java.lang.Class<X.K1b> r1 = X.C61290K1b.class
            java.lang.Class<X.LJl> r0 = X.C64024LJl.class
            X.1OC r1 = X.DbW.A0L(r6, r1, r0, r7)
            X.K1m r0 = new X.K1m
            r0.<init>(r2, r3)
            r1.A00 = r0
            X.1ES.A00(r5, r4, r1)
            return
        L_0x0549:
            r8 = 0
            goto L_0x050d
        L_0x054b:
            r3 = 0
            X.0qQ.A0B(r6, r3)
            java.lang.Object r0 = r4.A02
            X.Kag r0 = (X.C62130Kag) r0
            X.OQg r0 = r0.A00
            if (r0 != 0) goto L_0x0660
            java.lang.String r0 = "analyticsLogger"
            goto L_0x07fd
        L_0x055b:
            java.lang.Object r5 = r4.A02
            X.JYH r5 = (X.JYH) r5
            java.lang.Object r3 = r4.A01
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            r2 = 1
            X.630 r1 = r5.A01
            X.Lr4 r0 = new X.Lr4
            r0.<init>(r3, r5, r2)
            r1.A00(r0, r2)
            java.lang.String r2 = "ACCEPTANCE_NUX"
            r0 = 2
            goto L_0x058a
        L_0x0573:
            java.lang.Object r5 = r4.A02
            X.JYH r5 = (X.JYH) r5
            java.lang.Object r3 = r4.A01
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            r2 = 0
            X.630 r1 = r5.A01
            X.Lr4 r0 = new X.Lr4
            r0.<init>(r3, r5, r2)
            r1.A00(r0, r2)
            java.lang.String r2 = "ACCEPTANCE_NUX"
            r0 = 1
        L_0x058a:
            X.C70888OQg.A00(r0, r2)
            return
        L_0x058e:
            java.lang.Object r0 = r4.A02
            X.JYH r0 = (X.JYH) r0
            java.lang.Object r5 = r4.A01
            android.content.Context r5 = (android.content.Context) r5
            com.instagram.common.session.UserSession r4 = r0.A00
            X.2EG r3 = X.2EG.A2d
            X.0Tu r2 = X.0Tu.A05
            r0 = 36888847040447289(0x830e3600050339, double:3.3919936356187345E-306)
            java.lang.String r1 = X.182.A04(r2, r4, r0)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x05b4
            return
        L_0x05ac:
            X.2EG r3 = X.2EG.A2Q
            r0 = 3251(0xcb3, float:4.556E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
        L_0x05b4:
            X.Dbb.A0k(r5, r4, r3, r1)
            return
        L_0x05b8:
            java.lang.Object r0 = r4.A02
            X.K6q r0 = (X.C61419K6q) r0
            X.0eM r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            X.JjH r1 = (X.C60314JjH) r1
            java.lang.Object r0 = r4.A01
            X.MQX r0 = (X.MQX) r0
            X.Jyv r0 = (X.C61202Jyv) r0
            java.lang.String r6 = r0.A02
            java.lang.String r7 = r0.A01
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.L87 r0 = r1.A0A
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = r0.A00
            X.4Cq r0 = r5.A01
            r8 = 0
            r9 = 5
            X.MGN r4 = new X.MGN
            r4.<init>((java.lang.Object) r5, (java.lang.String) r6, (java.lang.String) r7, (X.AnonymousClass4D7) r8, (int) r9)
            goto L_0x0999
        L_0x05e1:
            java.lang.Object r0 = r4.A02
            X.K6q r0 = (X.C61419K6q) r0
            X.0eM r0 = r0.A07
            java.lang.Object r1 = r0.getValue()
            X.JjH r1 = (X.C60314JjH) r1
            java.lang.Object r0 = r4.A01
            X.MQX r0 = (X.MQX) r0
            X.Jyv r0 = (X.C61202Jyv) r0
            java.lang.String r6 = r0.A02
            java.lang.String r7 = r0.A01
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r0 = 4142(0x102e, float:5.804E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C60314JjH.A02(r1, r6, r0)
            X.L87 r0 = r1.A0A
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = r0.A00
            java.lang.String r8 = r0.A01
            X.4Cq r0 = r5.A01
            r9 = 0
            X.MGp r4 = new X.MGp
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0999
        L_0x0614:
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.lang.Object r0 = r4.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.27r r1 = X.27p.A01(r0)
            java.lang.String r0 = "RESUME_DRAFT_EXIT_DIALOG_DISCARD_EDITS"
            r1.A1l(r0)
            java.lang.Object r0 = r4.A01
            android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
            r0.onClick(r6, r5)
            return
        L_0x062d:
            java.lang.Object r0 = r4.A01
            androidx.fragment.app.FragmentActivity r2 = X.DbT.A0E(r0)
            r1 = 9692(0x25dc, float:1.3581E-41)
            r0 = 0
            r2.setResult(r1, r0)
            r2.finish()
            return
        L_0x063d:
            java.lang.Object r3 = r4.A02
            X.LpV r3 = (X.C65225LpV) r3
            com.instagram.common.session.UserSession r0 = r3.A05
            X.1Av r2 = X.1Au.A00(r0)
            java.lang.String r1 = r3.A08
            r0 = 0
            r2.A14(r1, r0)
            java.lang.Object r1 = r4.A01
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            X.M7J r0 = new X.M7J
            r0.<init>(r3, r1)
            X.11Z.A03(r0)
            if (r19 != 0) goto L_0x066e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0660:
            java.lang.String r2 = "SETTINGS"
            r0 = 4
            X.C70888OQg.A00(r0, r2)
            java.lang.Object r0 = r4.A01
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            r0.setChecked(r3)
        L_0x066e:
            r6.dismiss()
            return
        L_0x0672:
            java.lang.Object r0 = r4.A02
            X.LOL r0 = (X.LOL) r0
            X.L4J r5 = r0.A03
            com.instagram.common.session.UserSession r3 = r5.A01
            java.lang.String r2 = "VIDEO_COMPOSER"
            java.lang.Object r0 = r4.A01
            java.lang.String r1 = X.DbS.A0q(r0)
            X.0iw r0 = r5.A00
            X.LTM.A04(r0, r3, r2, r1)
            return
        L_0x0688:
            java.lang.Object r6 = r4.A02
            X.LOL r6 = (X.LOL) r6
            X.L4J r0 = r6.A03
            com.instagram.common.session.UserSession r5 = r0.A01
            java.lang.String r3 = "VIDEO_COMPOSER"
            java.lang.Object r2 = r4.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r1 = r2.getId()
            X.0iw r0 = r0.A00
            X.LTM.A03(r0, r5, r3, r1)
            X.L0z r0 = r6.A02
            X.KHV r0 = r0.A00
            X.L12 r0 = r0.A09
            X.LpT r0 = r0.A00
            X.MXh r1 = r0.A05
            X.4DH r0 = r0.A03
            r1.CuH(r0, r2)
            return
        L_0x06af:
            java.lang.Object r3 = r4.A02
            X.K66 r3 = (X.K66) r3
            X.27r r2 = X.JTP.A0X(r3)
            X.283 r0 = r2.A04
            X.JVj r1 = r0.A0C
            java.lang.String r0 = "CANT_LOAD_DRAFT_AUDIO_UNAVAILABLE_CONTINUE_EDITING"
            r2.A1Q(r1, r0)
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r0 = r3.A0T
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r1 = r4.A01
            X.5kq r1 = (X.C293505kq) r1
            java.lang.String r8 = r1.A0T
            X.KNs r0 = X.K66.A06(r3)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r7 = r0.A0j
            X.50r r6 = r1.A0H
            r4 = 0
            r9 = 1
            X.C243473Yx.A03(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x06de:
            X.6SR r1 = X.AnonymousClass6SR.A01()
            java.lang.String r0 = "add tag"
            r1.A0B = r0
            java.lang.Object r1 = r4.A02
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r1 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r1
            com.facebook.common.callercontext.CallerContext r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A10
            com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController r1 = r1.A02
            if (r1 != 0) goto L_0x06f4
            java.lang.String r0 = "brandedContentDisclosureController"
            goto L_0x07fd
        L_0x06f4:
            java.lang.Object r0 = r4.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.A01(r0)
            return
        L_0x06fc:
            java.lang.Object r0 = r4.A01
            java.util.Iterator r8 = X.C51966G9m.A1H(r0)
        L_0x0702:
            boolean r0 = r8.hasNext()
            r7 = 0
            if (r0 == 0) goto L_0x07a3
            java.lang.Object r2 = r8.next()
            com.instagram.common.gallery.Draft r2 = (com.instagram.common.gallery.Draft) r2
            java.lang.Object r6 = r4.A02
            com.instagram.creation.fragment.ManageDraftsFragment r6 = (com.instagram.creation.fragment.ManageDraftsFragment) r6
            com.instagram.common.session.UserSession r0 = r6.getSession()
            X.27r r1 = X.27p.A01(r0)
            java.lang.String r5 = r2.A04
            X.8xY r0 = X.C371088xY.DIALOG
            r1.A1E(r0, r5)
            com.instagram.common.session.UserSession r0 = r6.getSession()
            X.3Q2 r3 = X.JTQ.A0M(r0, r5)
            if (r3 == 0) goto L_0x0702
            X.1ud r2 = X.1ua.A0G
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            com.instagram.common.session.UserSession r0 = r6.getSession()
            X.1ua r0 = r2.A01(r1, r0)
            r0.A08(r3)
            com.instagram.common.session.UserSession r0 = r6.getSession()
            com.instagram.pendingmedia.store.PendingMediaStore r0 = X.28K.A00(r0)
            r0.A0A()
            com.instagram.pendingmedia.model.constants.ShareType r1 = r3.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r0 = com.instagram.pendingmedia.model.constants.ShareType.CLIPS_PANAVIDEO
            if (r1 != r0) goto L_0x076a
            com.instagram.common.session.UserSession r0 = r6.getSession()
            X.27r r0 = X.27p.A01(r0)
            r0.A1E(r7, r5)
            X.0eM r0 = r6.A05
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r1 = X.C51975G9x.A0R(r2, r5)
            r0 = 28
            X.MGE.A01(r2, r5, r1, r0)
        L_0x076a:
            boolean r0 = r3.A12()
            if (r0 == 0) goto L_0x0796
            boolean r0 = r3.A0x()
            if (r0 == 0) goto L_0x0796
            com.instagram.common.session.UserSession r1 = r6.getSession()
            X.JWV r0 = new X.JWV
            r0.<init>(r1)
            X.2YN r1 = X.JTO.A0L(r0, r6)
            java.lang.Class<X.JWW> r0 = X.JWW.class
            X.2YL r3 = r1.A00(r0)
            int r2 = java.lang.Integer.parseInt(r5)
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 23
            X.C66164MGb.A00(r3, r1, r2, r0)
        L_0x0796:
            com.instagram.common.session.UserSession r0 = r6.getSession()
            X.27r r0 = X.27p.A01(r0)
            r0.A1o(r5)
            goto L_0x0702
        L_0x07a3:
            java.lang.Object r4 = r4.A02
            com.instagram.creation.fragment.ManageDraftsFragment r4 = (com.instagram.creation.fragment.ManageDraftsFragment) r4
            com.instagram.common.session.UserSession r0 = r4.getSession()
            java.util.ArrayList r3 = X.JX7.A00(r0)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x07d4
            X.82p r0 = r4.A01
            if (r0 == 0) goto L_0x07cc
            com.instagram.creation.base.CreationSession r0 = X.JWE.A01(r0)
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x07cc
            X.DbT.A1J(r4)
        L_0x07c4:
            com.instagram.common.session.UserSession r0 = r4.getSession()
            X.JZM.A00(r0)
            return
        L_0x07cc:
            com.instagram.common.session.UserSession r0 = r4.getSession()
            X.C59888JbD.A00(r0)
            goto L_0x07c4
        L_0x07d4:
            X.K9A r2 = r4.A00
            if (r2 == 0) goto L_0x07fb
            java.util.ArrayList r1 = r2.A01
            r1.clear()
            java.util.ArrayList r0 = r2.A02
            r0.clear()
            r1.addAll(r3)
            X.K9A.A00(r2)
            boolean r0 = r4.A02
            r1 = r0 ^ 1
            r4.A02 = r1
            X.K9A r0 = r4.A00
            if (r0 == 0) goto L_0x07fb
            r0.A00 = r1
            X.K9A.A00(r0)
            com.instagram.creation.fragment.ManageDraftsFragment.A00(r4)
            goto L_0x07c4
        L_0x07fb:
            java.lang.String r0 = "adapter"
        L_0x07fd:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0805:
            java.lang.Object r0 = r4.A01
            X.KAa r0 = (X.C61495KAa) r0
            java.lang.Object r4 = r4.A02
            android.content.Context r4 = (android.content.Context) r4
            com.instagram.creation.fragment.EditMediaInfoFragment r0 = r0.A03
            com.instagram.common.session.UserSession r3 = r0.getSession()
            X.2EG r2 = X.2EG.A1H
            java.lang.String r0 = "https://www.facebook.com/policies_center/commerce"
            X.SUL r1 = new X.SUL
            r1.<init>(r4, r3, r2, r0)
            java.lang.String r0 = "edit_media_info"
            r1.A0S = r0
            r1.A0A()
            return
        L_0x0824:
            java.lang.Object r2 = r4.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r2 = (com.instagram.creation.fragment.EditMediaInfoFragment) r2
            java.lang.Object r4 = r4.A02
            X.1Xj r4 = (X.1Xj) r4
            java.util.List r1 = r2.A1C
            java.lang.String r0 = r4.A2n()
            r1.add(r0)
            java.util.List r3 = r2.A1B
            r3.remove(r4)
            X.1Xy r0 = r4.A0C
            com.instagram.user.model.User r0 = r0.BfH()
            if (r0 != 0) goto L_0x0848
            int r0 = r2.A00
            int r0 = r0 + -1
            r2.A00 = r0
        L_0x0848:
            X.3W1 r0 = r2.A0J
            if (r0 == 0) goto L_0x0870
            int r1 = r0.A03
            int r0 = r3.size()
            if (r1 < r0) goto L_0x085d
            X.3W1 r1 = r2.A0J
            int r0 = X.C51966G9m.A06(r3)
            r1.A0B(r0)
        L_0x085d:
            X.3W1 r0 = r2.A0J
            int r1 = r0.A02
            int r0 = r3.size()
            if (r1 < r0) goto L_0x0870
            X.3W1 r1 = r2.A0J
            int r0 = X.C51966G9m.A06(r3)
            r1.A0A(r0)
        L_0x0870:
            com.instagram.creation.fragment.EditMediaInfoFragment.A0H(r2)
            com.instagram.creation.fragment.EditMediaInfoFragment.A07(r2)
            return
        L_0x0877:
            java.lang.Object r2 = r4.A02
            X.Lgg r2 = (X.C64708Lgg) r2
            java.lang.Object r0 = r4.A01
            X.8RW r0 = (X.AnonymousClass8RW) r0
            int r1 = r0.A00
            X.8RF r0 = r2.A09
            X.JTP.A1N(r0, r1)
            return
        L_0x0887:
            java.lang.Object r6 = r4.A02
            X.8cq r6 = (X.C359448cq) r6
            java.lang.Object r5 = r4.A01
            X.JVj r5 = (X.C59725JVj) r5
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0v()
            com.instagram.common.session.UserSession r3 = r6.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36878659377758405(0x8304f2000100c5, double:3.3855509167118593E-306)
            java.lang.String r0 = X.182.A04(r2, r3, r0)
            goto L_0x08bd
        L_0x08a1:
            java.lang.Object r0 = r4.A02
            X.8cq r0 = (X.C359448cq) r0
            java.lang.Object r3 = r4.A01
            X.JVj r3 = (X.C59725JVj) r3
            java.lang.Boolean r2 = X.AnonymousClass7TE.A0v()
            goto L_0x08ca
        L_0x08ae:
            java.lang.Object r6 = r4.A02
            X.8cq r6 = (X.C359448cq) r6
            java.lang.Object r5 = r4.A01
            X.JVj r5 = (X.C59725JVj) r5
            r4 = 0
            r0 = 16
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x08bd:
            X.C359448cq.A03(r5, r6, r4, r0)
            return
        L_0x08c1:
            java.lang.Object r0 = r4.A02
            X.8cq r0 = (X.C359448cq) r0
            java.lang.Object r3 = r4.A01
            X.JVj r3 = (X.C59725JVj) r3
            r2 = 0
        L_0x08ca:
            X.27r r1 = r0.A06
            r0 = 232(0xe8, float:3.25E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A1N(r3, r2, r0)
            return
        L_0x08d6:
            java.lang.Object r0 = r4.A02
            X.JW7 r0 = (X.JW7) r0
            X.8H1 r2 = r0.A10
            java.lang.Object r0 = r4.A01
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            r2.A00 = r0
            X.Kha r1 = X.C62544Kha.CLIPS
            X.2Fj r0 = r2.A04
            X.JTQ.A0x(r0, r1)
            return
        L_0x08ea:
            r3 = -1
            boolean r1 = X.AnonymousClass7TF.A1S(r5, r3)
            java.lang.Integer r0 = X.AnonymousClass05K.A1F
            X.0xI r2 = X.C59882Jb5.A00(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "draft_saved"
            r2.A09(r0, r1)
            java.lang.Object r1 = r4.A02
            X.JWG r1 = (X.JWG) r1
            com.instagram.common.session.UserSession r0 = r1.A08
            X.DbU.A1R(r2, r0)
            r0 = -2
            if (r5 == r0) goto L_0x0919
            if (r5 == r3) goto L_0x0911
            return
        L_0x090d:
            java.lang.Object r1 = r4.A02
            X.JWG r1 = (X.JWG) r1
        L_0x0911:
            java.lang.Object r0 = r4.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.JWG.A07(r1, r0)
            return
        L_0x0919:
            X.JWG.A05(r1)
            return
        L_0x091d:
            java.lang.Object r2 = r4.A01
            X.KB5 r2 = (X.KB5) r2
            java.lang.Object r1 = r4.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            X.KB5.A05(r1, r2, r0)
            return
        L_0x092a:
            r6.dismiss()
            java.lang.Object r1 = r4.A01
            X.1IX r1 = (X.1IX) r1
            X.Kg3 r0 = X.C62453Kg3.CANCEL
            goto L_0x093a
        L_0x0934:
            java.lang.Object r1 = r4.A01
            X.1IX r1 = (X.1IX) r1
            X.Kg3 r0 = X.C62453Kg3.TRIGGER_MUTE
        L_0x093a:
            X.JTU.A1J(r0, r1)
            return
        L_0x093e:
            java.lang.Object r5 = r4.A02
            X.LN3 r5 = (X.LN3) r5
            java.lang.Object r3 = r4.A01
            X.Ock r1 = X.C71106Ock.A00
            com.instagram.common.session.UserSession r0 = r5.A03
            boolean r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x0954
            X.00N r0 = r5.A02
            r0.A04()
            return
        L_0x0954:
            X.4Cq r0 = r5.A07
            r2 = 0
            r1 = 34
            X.MGz r4 = new X.MGz
            r4.<init>((java.lang.Object) r3, (java.lang.Object) r5, (X.AnonymousClass4D7) r2, (int) r1)
            goto L_0x0999
        L_0x095f:
            java.lang.Object r1 = r4.A02
            X.6ZM r1 = (X.AnonymousClass6ZM) r1
            java.lang.Object r0 = r4.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.CuM(r0)
            return
        L_0x096b:
            java.lang.Object r5 = r4.A02
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.Object r3 = r4.A01
            X.0xx r0 = X.DbV.A0J(r5)
            r2 = 0
            r1 = 38
            goto L_0x0994
        L_0x0979:
            java.lang.Object r5 = r4.A02
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.Object r3 = r4.A01
            X.0xx r0 = X.DbV.A0J(r5)
            r2 = 0
            r1 = 39
            goto L_0x0994
        L_0x0987:
            java.lang.Object r5 = r4.A02
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            X.0xx r0 = X.DbV.A0J(r5)
            java.lang.Object r3 = r4.A01
            r2 = 0
            r1 = 35
        L_0x0994:
            X.MHC r4 = new X.MHC
            r4.<init>((java.lang.Object) r3, (java.lang.Object) r5, (X.AnonymousClass4D7) r2, (int) r1)
        L_0x0999:
            X.AnonymousClass7TE.A1Z(r4, r0)
            return
        L_0x099d:
            java.lang.Object r5 = r4.A02
            X.K8c r5 = (X.C61448K8c) r5
            java.lang.Object r4 = r4.A01
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            X.0xx r3 = X.DbV.A0J(r5)
            r2 = 0
            r1 = 34
            X.MHC r0 = new X.MHC
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            java.lang.String r1 = r4.getId()
            java.lang.String r0 = "remove_approval"
            X.C61448K8c.A00(r5, r0, r1)
            return
        L_0x09be:
            java.lang.Object r5 = r4.A02
            X.UZ3 r5 = (X.UZ3) r5
            com.instagram.common.session.UserSession r1 = r5.A06()
            java.lang.Object r0 = r4.A01
            java.lang.String r0 = X.DbS.A0q(r0)
            X.C64186LSt.A03(r5, r1, r0)
            java.lang.String r4 = "cancel"
            com.instagram.common.session.UserSession r3 = r5.A06()
            java.lang.Integer r2 = X.AnonymousClass05K.A0W
            com.instagram.common.session.UserSession r0 = r5.A06()
            java.lang.String r1 = r0.A06
            java.lang.String r0 = "action_type"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r4)
            X.JVF.A04(r5, r3, r2, r1, r0)
            return
        L_0x09e7:
            java.lang.Object r0 = r4.A02
            X.LCw r0 = (X.C63920LCw) r0
            X.MRZ r1 = r0.A00
            java.lang.Object r0 = r4.A01
            X.1Xj r0 = (X.1Xj) r0
            r1.D5U(r0)
            return
        L_0x09f5:
            java.lang.Object r5 = r4.A02
            X.K89 r5 = (X.K89) r5
            X.0eM r0 = r5.A02
            java.lang.Object r0 = r0.getValue()
            X.Jh4 r0 = (X.C60185Jh4) r0
            X.LTO r3 = r0.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r0 = r0.A01
            X.LTO.A03(r3, r0, r2, r1)
            java.lang.Object r4 = r4.A01
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            X.0eM r0 = r5.A01
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r2 = X.2EG.A1K
            java.lang.String r1 = "AppreciationCreatorInsightsFragment"
            java.lang.String r0 = "https://help.instagram.com/523408036294825"
            X.FH7.A08(r4, r3, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LV0.onClick(android.content.DialogInterface, int):void");
    }
}
