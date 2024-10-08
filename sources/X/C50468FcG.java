package X;

/* renamed from: X.FcG  reason: case insensitive filesystem */
public final class C50468FcG implements G76 {
    public final int A00;
    public final Object A01;

    public C50468FcG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [X.G6n, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c5, code lost:
        r0.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d3, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00da, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActionClicked() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0156;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0006;
                case 5: goto L_0x0005;
                case 6: goto L_0x0160;
                case 7: goto L_0x0168;
                case 8: goto L_0x005f;
                case 9: goto L_0x0172;
                case 10: goto L_0x004e;
                case 11: goto L_0x019c;
                case 12: goto L_0x01c2;
                case 13: goto L_0x0005;
                case 14: goto L_0x00a6;
                case 15: goto L_0x00c9;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r4 = r14.A01
            X.NKR r4 = (X.NKR) r4
            X.NgL r3 = new X.NgL
            r3.<init>()
            X.0eE r0 = X.AnonymousClass0t1.A01
            X.0eM r6 = r4.A09
            com.instagram.user.model.User r7 = X.DbX.A0l(r0, r6)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            X.3t3 r1 = r4.A04
            r2 = 0
            if (r1 != 0) goto L_0x0024
            java.lang.String r0 = "threadId"
            goto L_0x00d3
        L_0x0024:
            r0 = 2204(0x89c, float:3.088E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.OXL.A02(r5, r1, r0)
            X.N4P r0 = r4.A03
            if (r0 == 0) goto L_0x003d
            java.util.Map r1 = r0.A0W
            if (r1 == 0) goto L_0x003d
            java.lang.String r0 = r7.getId()
            java.lang.String r2 = X.DbT.A11(r0, r1)
        L_0x003d:
            r0 = 1118(0x45e, float:1.567E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r5.putString(r0, r2)
            com.instagram.direct.capabilities.Capabilities r1 = r4.A00
            if (r1 != 0) goto L_0x0122
            java.lang.String r0 = "threadCapabilities"
            goto L_0x00d3
        L_0x004e:
            java.lang.Object r5 = r14.A01
            X.E3F r5 = (X.E3F) r5
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            X.0hq r3 = r5.mFragmentManager
            com.instagram.user.model.User r7 = r5.A05
            if (r7 != 0) goto L_0x0140
            java.lang.String r0 = "user"
            goto L_0x00d3
        L_0x005f:
            java.lang.Object r6 = r14.A01
            X.Dib r6 = (X.C46656Dib) r6
            com.instagram.common.session.UserSession r2 = r6.A0V
            java.lang.String r0 = "nme_profile_editing_banner"
            X.0xG r1 = X.DbS.A0O(r0)
            r0 = 1
            X.C319976rX.A0B(r1, r2, r0)
            com.instagram.common.session.UserSession r1 = r6.A0V
            X.F1D r0 = r6.A0e
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Integer r1 = X.C49020Enw.A00(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x01f1
            com.instagram.common.session.UserSession r3 = r6.A0V
            X.0Tu r2 = X.0Tu.A05
            r0 = 36880377366053186(0x83068200160142, double:3.3866373794272624E-306)
            java.lang.String r4 = X.182.A04(r2, r3, r0)
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            if (r0 == 0) goto L_0x0005
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0005
            androidx.fragment.app.FragmentActivity r3 = r6.getActivity()
            com.instagram.common.session.UserSession r2 = r6.A0V
            X.2EG r1 = X.2EG.A2y
            X.SUL r0 = new X.SUL
            r0.<init>(r3, r2, r1, r4)
            goto L_0x00c5
        L_0x00a6:
            java.lang.Object r4 = r14.A01
            X.EAq r4 = (X.C47630EAq) r4
            com.instagram.common.session.UserSession r3 = r4.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36884723871646278(0x830a7600020246, double:3.389386127066307E-306)
            java.lang.String r2 = X.182.A04(r2, r3, r0)
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0005
            android.content.Context r1 = r4.A01
            X.2EG r0 = X.2EG.A38
            X.SUL r0 = X.Dba.A0J(r1, r3, r0, r2)
        L_0x00c5:
            r0.A0A()
            return
        L_0x00c9:
            java.lang.Object r5 = r14.A01
            X.E73 r5 = (X.E73) r5
            X.0wc r3 = r5.A00
            if (r3 != 0) goto L_0x00db
            java.lang.String r0 = "logger"
        L_0x00d3:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00db:
            r2 = 0
            java.lang.String r1 = "click"
            java.lang.String r0 = "learn_how_it_works"
            X.AnonymousClass73V.A0A(r3, r2, r1, r0)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x0005
            java.lang.String r1 = "com.instagram.bullying.restrict.screens.learn_more"
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            X.DiU r4 = X.C46649DiU.A04(r1, r0)
            com.instagram.common.session.UserSession r3 = r5.getSession()
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321486155294136(0x810a33000025b8, double:3.0331923272689696E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            androidx.fragment.app.FragmentActivity r3 = r5.requireActivity()
            if (r0 == 0) goto L_0x023a
            r2 = 2131972343(0x7f1350f7, float:1.958169E38)
            com.instagram.common.session.UserSession r0 = r5.getSession()
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r0)
            java.lang.String r0 = "restrict_home"
            r1.A0R = r0
            X.DbZ.A19(r5, r1, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A0P = r0
            r4.A0E(r3, r1)
            return
        L_0x0122:
            r0 = 4340(0x10f4, float:6.082E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putParcelable(r0, r1)
            r3.setArguments(r5)
            X.7Pr r2 = X.DbX.A0f(r6)
            android.content.res.Resources r1 = X.DbV.A05(r4)
            r0 = 2131959003(0x7f131cdb, float:1.9554634E38)
            X.DbT.A1C(r1, r2, r0)
            X.DbY.A13(r4, r3, r2)
            return
        L_0x0140:
            X.0gy r4 = X.AnonymousClass07i.A00(r5)
            X.0eM r0 = r5.A0B
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r9 = "edit_links"
            r13 = 0
            r2 = 0
            r8 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            X.C46395DeI.A04(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0156:
            java.lang.Object r0 = r14.A01
            X.KFA r0 = (X.KFA) r0
            X.0sa r0 = r0.A00
            r0.invoke()
            return
        L_0x0160:
            java.lang.Object r0 = r14.A01
            X.OJw r0 = (X.C70750OJw) r0
            r0.A00()
            return
        L_0x0168:
            java.lang.Object r1 = r14.A01
            X.0sP r1 = (X.0sP) r1
            X.EOV r0 = X.EOV.A00
            r1.invoke(r0)
            return
        L_0x0172:
            java.lang.Object r0 = r14.A01
            X.Dib r0 = (X.C46656Dib) r0
            X.36V r1 = r0.A0c
            if (r1 == 0) goto L_0x0188
            android.net.Uri r2 = r0.A00
            if (r2 == 0) goto L_0x0188
            r5 = 0
            X.28D r3 = X.28D.A40
            r6 = 10004(0x2714, float:1.4019E-41)
            r4 = 0
            r1.Ewp(r2, r3, r4, r5, r6)
            return
        L_0x0188:
            X.C46656Dib.A0C(r0)
            androidx.fragment.app.FragmentActivity r2 = r0.getActivity()
            r1 = 2131975828(0x7f135e94, float:1.958876E38)
            r0 = 5352(0x14e8, float:7.5E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C59689JTv.A0F(r2, r0, r1)
            return
        L_0x019c:
            java.lang.Object r3 = r14.A01
            X.F3U r3 = (X.F3U) r3
            X.FBg r0 = r3.A06
            X.0wc r1 = X.C49882FBg.A00(r0)
            java.lang.String r0 = "ig_push_notification_settings_banner"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x01bc
            java.lang.String r1 = "click"
            java.lang.String r0 = "event_type"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x01bc:
            android.content.Context r0 = r3.A02
            X.AnonymousClass0oH.A00(r0)
            return
        L_0x01c2:
            java.lang.Object r5 = r14.A01
            X.E1k r5 = (X.C47416E1k) r5
            X.0eM r0 = r5.A05
            X.0lg r4 = X.DbT.A0X(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            r0 = 2131953813(0x7f130895, float:1.9544108E38)
            java.lang.String r1 = r5.getString(r0)
            r0 = 465(0x1d1, float:6.52E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            android.os.Bundle r2 = X.DbY.A0B(r0, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.requireActivity()
            r0 = 563(0x233, float:7.89E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.DbW.A0W(r1, r2, r4, r3, r0)
            X.DbU.A1K(r5, r0)
            return
        L_0x01f1:
            com.instagram.common.session.UserSession r0 = r6.A0V
            X.0qQ.A0B(r0, r2)
            X.2nI r5 = X.DbT.A0M(r6, r0)
            java.lang.String r1 = "node_id"
            java.lang.String r0 = "im_profile"
            java.util.Map r2 = X.AnonymousClass7TF.A0w(r1, r0)
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r3 = X.DbX.A0v()
            r0 = 3058(0xbf2, float:4.285E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = "entrypoint"
            r4.put(r0, r1)
            java.lang.String r1 = "individual_setting"
            java.lang.String r0 = "deeplink_destination"
            r4.put(r0, r1)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0227
            java.lang.String r0 = "deeplink_params"
            r4.put(r0, r2)
        L_0x0227:
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            X.FVM r1 = new X.FVM
            r1.<init>()
            java.lang.String r0 = "com.bloks.www.fxcal.settings.async"
            X.FBO r0 = X.FBO.A00(r1, r0, r4, r3)
            r0.A01(r2, r5)
            return
        L_0x023a:
            r2 = 2131972327(0x7f1350e7, float:1.9581658E38)
            com.instagram.common.session.UserSession r0 = r5.getSession()
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r0)
            java.lang.String r0 = "restrict_home"
            r1.A0R = r0
            X.DbZ.A19(r5, r1, r2)
            X.C46649DiU.A07(r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50468FcG.onActionClicked():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006a, code lost:
        X.AnonymousClass7TF.A1J(r0, r3, r2, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0088, code lost:
        r2.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBannerDismissed() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 1: goto L_0x0006;
                case 2: goto L_0x0020;
                case 3: goto L_0x0020;
                case 4: goto L_0x0005;
                case 5: goto L_0x002c;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0046;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x005f;
                case 14: goto L_0x006e;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r0 = r5.A01
            X.NIv r0 = (X.C68457NIv) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.Mtt r0 = (X.C67740Mtt) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.4kA r0 = X.AnonymousClass4k9.A00(r0)
            r4 = 1
            X.0s0 r3 = r0.A0M
            X.0YZ[] r2 = X.AnonymousClass4kA.A0c
            r1 = 29
            goto L_0x006a
        L_0x0020:
            java.lang.Object r0 = r5.A01
            X.1Av r0 = (X.1Av) r0
            r4 = 1
            X.0s0 r3 = r0.A3F
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 377(0x179, float:5.28E-43)
            goto L_0x006a
        L_0x002c:
            java.lang.Object r0 = r5.A01
            X.E1O r0 = (X.E1O) r0
            X.1Av r0 = r0.A03
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = "userPreferences"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x003e:
            r4 = 1
            X.0s0 r3 = r0.A3g
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 525(0x20d, float:7.36E-43)
            goto L_0x006a
        L_0x0046:
            java.lang.Object r0 = r5.A01
            X.E3F r0 = (X.E3F) r0
            X.0eM r0 = r0.A0B
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1Av r0 = X.1Au.A00(r0)
            r1 = 0
            X.0xY r2 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "should_show_edit_links_copy_profile_link_banner"
            r2.E5T(r0, r1)
            goto L_0x0088
        L_0x005f:
            java.lang.Object r0 = r5.A01
            X.1Av r0 = (X.1Av) r0
            r4 = 1
            X.0s0 r3 = r0.A5N
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 432(0x1b0, float:6.05E-43)
        L_0x006a:
            X.AnonymousClass7TF.A1J(r0, r3, r2, r1, r4)
            return
        L_0x006e:
            java.lang.Object r0 = r5.A01
            X.EAq r0 = (X.C47630EAq) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.1Am r1 = X.1Al.A01(r0)
            X.1An r0 = X.1An.A1t
            X.0xa r0 = r1.A03(r0)
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "PLAYCOUNT_WITH_REPLAY_BANNER_DISMISSED_BY_USER"
            r0 = 1
            r2.E5T(r1, r0)
        L_0x0088:
            r2.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50468FcG.onBannerDismissed():void");
    }
}
