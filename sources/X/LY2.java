package X;

import android.view.View;

public final class LY2 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LY2(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new LY2(i, obj, obj2), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0855, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0858, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x08b6, code lost:
        r7 = "amountSortButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x08b9, code lost:
        r7 = "timeSortButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x08bc, code lost:
        r7 = "adapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x08be, code lost:
        X.0qQ.A0F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x08c5, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0165, code lost:
        if (X.182.A06(X.0Tu.A05, r12, 36313012185269849L) != false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0078, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x07f1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r32) {
        /*
            r31 = this;
            r4 = r31
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x064b;
                case 1: goto L_0x0623;
                case 2: goto L_0x05f9;
                case 3: goto L_0x05d2;
                case 4: goto L_0x05a5;
                case 5: goto L_0x0571;
                case 6: goto L_0x0536;
                case 7: goto L_0x0501;
                case 8: goto L_0x04cc;
                case 9: goto L_0x04a9;
                case 10: goto L_0x0492;
                case 11: goto L_0x044d;
                case 12: goto L_0x03e2;
                case 13: goto L_0x03a9;
                case 14: goto L_0x0370;
                case 15: goto L_0x02e0;
                case 16: goto L_0x07c6;
                case 17: goto L_0x0859;
                case 18: goto L_0x07fc;
                case 19: goto L_0x022e;
                case 20: goto L_0x076e;
                case 21: goto L_0x072f;
                case 22: goto L_0x06e9;
                case 23: goto L_0x06bf;
                case 24: goto L_0x01f7;
                case 25: goto L_0x007c;
                case 26: goto L_0x0678;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 1016618843(0x3c985f5b, float:0.018600157)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r4.A02
            instagram.features.clips.edit.ClipsEditMetadataController r8 = (instagram.features.clips.edit.ClipsEditMetadataController) r8
            com.instagram.common.session.UserSession r9 = r8.A0s
            X.K7V r7 = new X.K7V
            r7.<init>()
            android.os.Bundle r1 = X.JTP.A0F(r9)
            r7.setArguments(r1)
            X.27r r1 = X.27p.A01(r9)
            java.lang.String r6 = "instagram.features.clips.edit.ClipsEditMetadataController"
            java.lang.String r5 = "POST_SHARE_CONTROLS_SHARE_SHEET_AUDIENCE_ROW_TAP"
            X.29R r3 = r1.A09
            X.1Ln r2 = X.JTO.A0N(r3)
            boolean r1 = X.DbT.A1Y(r2)
            if (r1 == 0) goto L_0x0046
            X.JTO.A1V(r2)
            X.283 r1 = X.JTT.A0N(r2, r3, r5)
            X.JVj r1 = r1.A0C
            r2.A0d(r1)
            r2.A0n(r6)
            r2.Cgf()
        L_0x0046:
            X.7Pr r6 = X.DbS.A0W(r9)
            r6.A0T = r7
            android.content.Context r5 = r8.A0n
            r1 = 2131955221(0x7f130e15, float:1.9546963E38)
            X.DbZ.A0z(r5, r6, r1)
            r1 = 0
            X.DbS.A1S(r6, r1)
            java.lang.Object r3 = r4.A01
            r2 = 5
            X.Lyv r1 = new X.Lyv
            r1.<init>(r2, r3, r8)
            r6.A0U = r1
            X.7Pu r1 = r6.A00()
            r8.A0F = r1
            r1.A03(r5, r7)
            X.7Pu r2 = r8.A0F
            r7.A03 = r2
            X.KHW r1 = r7.A01
            if (r1 == 0) goto L_0x0075
            r1.A01 = r2
        L_0x0075:
            r1 = -394574571(0xffffffffe87b4515, float:-4.7463533E24)
        L_0x0078:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x007c:
            r0 = -991429208(0xffffffffc4e7fda8, float:-1855.9268)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A02
            instagram.features.clips.edit.ClipsEditMetadataController r2 = (instagram.features.clips.edit.ClipsEditMetadataController) r2
            X.0iw r1 = r2.A0r
            java.lang.String r1 = r1.getModuleName()
            X.28D r10 = X.28D.A0J
            com.instagram.common.session.UserSession r12 = r2.A0s
            X.C56246HvD.A00(r10, r12, r1)
            java.lang.Object r5 = r4.A01
            X.1Xj r5 = (X.1Xj) r5
            java.lang.String r6 = r5.A2U()
            if (r6 != 0) goto L_0x00b5
            X.0wb r8 = X.0wb.A01
            java.lang.String r7 = "Tap on People Tags: Media "
            java.lang.String r4 = r2.A13
            java.lang.String r3 = " has bestProgressiveVideoUrl field = "
            r1 = 1978(0x7ba, float:2.772E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r3 = X.002.A11(r7, r4, r3, r6, r1)
            java.lang.String r1 = "ClipsEditMetadataController"
            r8.Ew0(r1, r3)
        L_0x00b5:
            boolean r1 = r2.A0Z
            java.lang.String r9 = "Required value was null."
            if (r1 == 0) goto L_0x00d0
            X.0eM r1 = r2.A19
            java.lang.Object r1 = r1.getValue()
            X.JiL r1 = (X.C60264JiL) r1
            X.2Fj r1 = r1.A0A
            java.lang.Object r1 = r1.A02()
            if (r1 != 0) goto L_0x00e1
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x00d0:
            boolean r1 = r5.A4s()
            if (r1 == 0) goto L_0x00e4
            java.util.ArrayList r1 = r5.A3E()
            if (r1 != 0) goto L_0x00e1
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x00e1:
            java.util.List r1 = (java.util.List) r1
            goto L_0x00e6
        L_0x00e4:
            X.0sn r1 = X.0sn.A00
        L_0x00e6:
            X.0eM r8 = r2.A19
            java.lang.Object r3 = r8.getValue()
            X.JiL r3 = (X.C60264JiL) r3
            X.2Fj r3 = r3.A06
            java.lang.Object r15 = r3.A02()
            java.lang.String r15 = (java.lang.String) r15
            X.1Xy r3 = r5.A0C
            X.DSX r3 = r3.Aqj()
            if (r3 == 0) goto L_0x016b
            r3 = 1
            boolean r3 = X.C271174i4.A04(r12, r3)
            if (r3 == 0) goto L_0x016b
        L_0x0105:
            boolean r3 = r2.A0V
            if (r3 != 0) goto L_0x0179
            java.util.ArrayList r22 = instagram.features.clips.edit.ClipsEditMetadataController.A01(r5)
        L_0x010d:
            java.lang.Object r3 = r8.getValue()
            X.JiL r3 = (X.C60264JiL) r3
            X.3QO r13 = r3.A01
            java.lang.String r16 = r5.getId()
            if (r16 == 0) goto L_0x07f1
            boolean r3 = r5.A4q()
            if (r3 == 0) goto L_0x0168
            X.46h r3 = r5.A1O()
            if (r3 == 0) goto L_0x0168
            java.lang.String r19 = r3.getAssetId()
        L_0x012b:
            X.1Xy r3 = r5.A0C
            X.DSX r3 = r3.Aqj()
            if (r3 == 0) goto L_0x0159
            r3 = 1
            boolean r3 = X.C271174i4.A04(r12, r3)
            if (r3 == 0) goto L_0x0159
        L_0x013a:
            r4 = 1
        L_0x013b:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r4)
            X.1Xy r3 = r5.A0C
            java.util.List r3 = r3.getCoauthorProducers()
            if (r3 == 0) goto L_0x0186
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x014f:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0188
            X.DbY.A1W(r4, r3)
            goto L_0x014f
        L_0x0159:
            X.0Tu r7 = X.0Tu.A05
            r3 = 36313012185269849(0x81027e00070659, double:3.027833354503672E-306)
            boolean r3 = X.182.A06(r7, r12, r3)
            r4 = 0
            if (r3 == 0) goto L_0x013b
            goto L_0x013a
        L_0x0168:
            r19 = 0
            goto L_0x012b
        L_0x016b:
            X.0Tu r7 = X.0Tu.A05
            r3 = 36313012185269849(0x81027e00070659, double:3.027833354503672E-306)
            boolean r3 = X.182.A06(r7, r12, r3)
            if (r3 == 0) goto L_0x0179
            goto L_0x0105
        L_0x0179:
            java.lang.Object r3 = r8.getValue()
            X.JiL r3 = (X.C60264JiL) r3
            X.2Fj r3 = r3.A09
            java.util.List r22 = X.JTS.A0q(r3)
            goto L_0x010d
        L_0x0186:
            X.0sn r4 = X.0sn.A00
        L_0x0188:
            X.1Xy r3 = r5.A0C
            com.instagram.api.schemas.ClipsTrialDict r3 = r3.AoL()
            if (r3 == 0) goto L_0x01f5
            com.instagram.api.schemas.MediaTrialStatus r7 = r3.BzK()
        L_0x0194:
            com.instagram.api.schemas.MediaTrialStatus r3 = com.instagram.api.schemas.MediaTrialStatus.ACTIVE
            boolean r28 = X.AnonymousClass7TF.A1W(r7, r3)
            java.lang.String r20 = r5.getId()
            boolean r3 = r2.A0Z
            if (r3 == 0) goto L_0x01db
            java.lang.Object r3 = r8.getValue()
            X.JiL r3 = (X.C60264JiL) r3
            java.util.List r3 = r3.A04
        L_0x01aa:
            X.1Xy r5 = r5.A0C
            X.DSX r5 = r5.Aqj()
            boolean r26 = X.AnonymousClass7TF.A1V(r5)
            r11 = 0
            boolean r25 = X.C51970G9q.A1Y(r1)
            r18 = r11
            r21 = r1
            r23 = r4
            r24 = r3
            r27 = r25
            r29 = r25
            r30 = r25
            r17 = r6
            X.K67 r3 = X.C63211KtI.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            X.4DH r1 = r2.A0q
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
            X.DbZ.A18(r3, r1, r12)
            r1 = -483911378(0xffffffffe328192e, float:-3.1008674E21)
            goto L_0x0078
        L_0x01db:
            java.util.ArrayList r3 = r5.A39()
            if (r3 == 0) goto L_0x01f2
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x01f2
            java.util.ArrayList r3 = r5.A39()
            if (r3 != 0) goto L_0x01aa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x01f2:
            X.0sn r3 = X.0sn.A00
            goto L_0x01aa
        L_0x01f5:
            r7 = 0
            goto L_0x0194
        L_0x01f7:
            r0 = -1010822012(0xffffffffc3c01484, float:-384.16028)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.L7A r6 = new X.L7A
            r6.<init>(r1)
            X.4Cq r3 = r6.A02
            r5 = 0
            r2 = 37
            X.MFx r1 = new X.MFx
            r1.<init>(r6, r5, r2)
            X.AnonymousClass7TE.A1Z(r1, r3)
            java.lang.Object r3 = r4.A01
            android.content.Context r3 = (android.content.Context) r3
            r1 = 2131958218(0x7f1319ca, float:1.9553042E38)
            java.lang.String r2 = r3.getString(r1)
            r1 = 0
            X.Jf4 r1 = X.C59689JTv.A02(r3, r2, r5, r1)
            if (r1 == 0) goto L_0x0229
            r1.show()
        L_0x0229:
            r1 = -384462644(0xffffffffe91590cc, float:-1.1300858E25)
            goto L_0x0078
        L_0x022e:
            r0 = 1388871145(0x52c87de9, float:4.30552941E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r4.A01
            X.K7d r6 = (X.C61428K7d) r6
            java.lang.Object r8 = r4.A02
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            boolean r1 = X.C61428K7d.A00(r6)
            if (r1 != 0) goto L_0x029a
            X.Kgw r2 = r6.A04
            X.Kgw r1 = X.C62506Kgw.STICKER_EDITING
            if (r2 == r1) goto L_0x029a
            X.0eM r7 = r6.A0G
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r7)
            java.lang.String r3 = r8.getId()
            java.lang.String r2 = "UserPaySupporterListBottomSheetFragment"
            java.lang.String r1 = "user_pay_supporters_list"
            X.Dfc r9 = X.C46548Dgp.A01(r4, r3, r1, r2)
            X.0eM r1 = r6.A0E
            boolean r1 = X.AnonymousClass7TF.A1Z(r1)
            if (r1 == 0) goto L_0x02dd
            X.Kgw r2 = r6.A04
            X.Kgw r1 = X.C62506Kgw.SETTINGS
            if (r2 != r1) goto L_0x029f
            r1 = 1
        L_0x026a:
            r5 = 0
            if (r1 == 0) goto L_0x029f
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r7)
            X.FYn r4 = X.FCG.A00(r1)
            X.EZV r3 = X.EZV.BADGES_ESTIMATED_EARNINGS
            java.lang.String r2 = r8.getId()
            java.lang.String r1 = r6.A07
            r4.A01(r3, r2, r5, r1)
            X.6Yo r4 = X.DbZ.A0P(r6, r7)
            X.1a1 r3 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r7)
            com.instagram.profile.intf.UserDetailLaunchConfig r1 = r9.A04()
            androidx.fragment.app.Fragment r1 = r3.A02(r2, r1)
            r4.A0B(r5, r1)
            r4.A04()
        L_0x029a:
            r1 = -43755644(0xfffffffffd645784, float:-1.89699E37)
            goto L_0x0078
        L_0x029f:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r7)
            X.FYn r5 = X.FCG.A00(r1)
            X.EZV r4 = X.EZV.POST_LIVE
            java.lang.String r3 = r8.getId()
            java.lang.String r2 = r6.A08
            if (r2 != 0) goto L_0x02b5
            java.lang.String r7 = "mediaId"
            goto L_0x08be
        L_0x02b5:
            r1 = 0
            r5.A01(r4, r3, r2, r1)
            X.0lg r5 = X.DbT.A0X(r7)
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            X.1a1 r3 = X.C46447Df9.A02()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r7)
            com.instagram.profile.intf.UserDetailLaunchConfig r1 = r9.A04()
            android.os.Bundle r3 = r3.A01(r2, r1)
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()
            java.lang.String r1 = "profile"
            X.6W8 r1 = X.DbV.A0Y(r2, r3, r5, r4, r1)
            X.DbT.A1M(r6, r1)
            goto L_0x029a
        L_0x02dd:
            boolean r1 = r6.A0A
            goto L_0x026a
        L_0x02e0:
            r0 = -599228228(0xffffffffdc4880bc, float:-2.25746161E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A02
            X.LBM r5 = (X.LBM) r5
            X.0eM r3 = r5.A0A
            android.view.View r2 = X.AnonymousClass7TE.A0c(r3)
            if (r2 == 0) goto L_0x02f7
            r1 = 0
            r2.setClickable(r1)
        L_0x02f7:
            android.view.View r2 = X.AnonymousClass7TE.A0c(r3)
            if (r2 == 0) goto L_0x0303
            r1 = 1050253722(0x3e99999a, float:0.3)
            r2.setAlpha(r1)
        L_0x0303:
            X.0eM r1 = r5.A09
            java.lang.Object r3 = r1.getValue()
            X.Jhc r3 = (X.C60219Jhc) r3
            java.lang.Object r1 = r4.A01
            java.lang.String r9 = X.DbS.A0q(r1)
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r1 = r3.A06
            X.0Ud r5 = r1.A06
            X.JvD r1 = X.JTO.A0r(r5)
            r12 = 0
            if (r1 == 0) goto L_0x0332
            java.lang.String r4 = r1.A08
            if (r4 == 0) goto L_0x0332
            X.6oS r2 = X.C318116oQ.A00(r3)
            r11 = 21
            X.MFe r1 = new X.MFe
            r6 = r1
            r7 = r3
            r8 = r4
            r10 = r12
            r6.<init>((java.lang.Object) r7, (java.lang.String) r8, (java.lang.String) r9, (X.AnonymousClass4D7) r10, (int) r11)
            X.AnonymousClass7TE.A1Z(r1, r2)
        L_0x0332:
            X.JvD r4 = X.JTO.A0r(r5)
            if (r4 == 0) goto L_0x036b
            X.LDa r1 = r3.A04
            X.3mM r8 = r1.A00
            if (r8 == 0) goto L_0x036b
            X.6aI r5 = r3.A03
            if (r5 == 0) goto L_0x036b
            com.instagram.common.session.UserSession r7 = r3.A02
            java.lang.String r10 = r4.A09
            java.lang.String r1 = X.C61013JvD.A00(r4)
            long r17 = X.DbZ.A07(r1)
            X.6h4 r1 = r3.A07
            long r1 = r1.A00()
            double r15 = (double) r1
            com.instagram.api.schemas.LiveUserPaySupportTier r1 = r4.A04
            if (r1 == 0) goto L_0x035d
            java.lang.String r12 = r1.name()
        L_0x035d:
            r9 = 0
            X.0iw r1 = r3.A01
            X.0wc r6 = X.AnonymousClass0kN.A01(r1, r7)
            java.lang.String r11 = "comment"
            r13 = r9
            r14 = r9
            r5.A05(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17)
        L_0x036b:
            r1 = -226452817(0xfffffffff2809aaf, float:-5.0945385E30)
            goto L_0x0078
        L_0x0370:
            r0 = -1750811006(0xffffffff97a4be82, float:-1.0646343E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.LDK r1 = (X.LDK) r1
            X.0eM r1 = r1.A02
            java.lang.Object r3 = r1.getValue()
            X.JhG r3 = (X.C60197JhG) r3
            java.lang.Object r1 = r4.A01
            X.KoE r1 = (X.C62900KoE) r1
            X.Kf3 r1 = (X.C62392Kf3) r1
            com.instagram.user.model.UpcomingEvent r5 = r1.A00
            java.lang.String r4 = r1.A03
            X.AnonymousClass7TG.A1N(r5, r4)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 37
            X.C66169MGg.A01(r5, r3, r2, r1)
            X.6am r3 = r3.A01
            java.lang.String r2 = X.C18810W3l.A04(r5)
            java.lang.String r1 = "share_link"
            r3.A04(r5, r2, r1, r4)
            r1 = -1487057542(0xffffffffa75d4d7a, float:-3.0711911E-15)
            goto L_0x0078
        L_0x03a9:
            r0 = -968694217(0xffffffffc642e637, float:-12473.554)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.LDK r1 = (X.LDK) r1
            X.0eM r1 = r1.A02
            java.lang.Object r3 = r1.getValue()
            X.JhG r3 = (X.C60197JhG) r3
            java.lang.Object r1 = r4.A01
            X.KoE r1 = (X.C62900KoE) r1
            X.Kf3 r1 = (X.C62392Kf3) r1
            com.instagram.user.model.UpcomingEvent r5 = r1.A00
            java.lang.String r4 = r1.A03
            X.AnonymousClass7TG.A1N(r5, r4)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 38
            X.C66169MGg.A01(r5, r3, r2, r1)
            X.6am r3 = r3.A01
            java.lang.String r2 = X.C18810W3l.A04(r5)
            java.lang.String r1 = "share_as_story"
            r3.A04(r5, r2, r1, r4)
            r1 = 1774934921(0x69cb5b89, float:3.0730525E25)
            goto L_0x0078
        L_0x03e2:
            r0 = 1428799877(0x5529c185, float:1.16655391E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.LDK r1 = (X.LDK) r1
            X.0eM r1 = r1.A02
            java.lang.Object r3 = r1.getValue()
            X.JhG r3 = (X.C60197JhG) r3
            java.lang.Object r1 = r4.A01
            X.KoE r1 = (X.C62900KoE) r1
            X.Kf3 r1 = (X.C62392Kf3) r1
            com.instagram.user.model.UpcomingEvent r5 = r1.A00
            X.6oS r2 = X.C51975G9x.A0R(r3, r5)
            r1 = 36
            X.C66169MGg.A01(r5, r3, r2, r1)
            X.LMy r4 = r3.A02
            X.0eM r1 = r4.A05
            java.lang.Object r2 = r1.getValue()
            X.0wc r2 = (X.0wc) r2
            java.lang.String r1 = "upcoming_event_creation_reshare_action"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r1 = "reshare_as_post"
            X.DbS.A1J(r3, r1)
            java.lang.String r1 = r5.getId()
            java.lang.Long r2 = X.DbV.A0q(r1)
            java.lang.String r1 = "upcoming_event_id"
            r3.A9F(r1, r2)
            java.lang.String r2 = r4.A03
            java.lang.String r1 = "prior_module"
            r3.AAJ(r1, r2)
            java.lang.String r2 = r4.A02
            java.lang.String r1 = "creation_session_id"
            r3.AAJ(r1, r2)
            r1 = 1777(0x6f1, float:2.49E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 194(0xc2, float:2.72E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r3.AAJ(r1, r2)
            r3.Cgf()
            r1 = -1356527187(0xffffffffaf2509ad, float:-1.50101E-10)
            goto L_0x0078
        L_0x044d:
            r0 = -336975075(0xffffffffebea2b1d, float:-5.6618448E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            java.lang.Object r5 = r4.A02
            X.LDK r5 = (X.LDK) r5
            java.lang.Object r4 = r4.A01
            X.KoE r4 = (X.C62900KoE) r4
            com.instagram.common.session.UserSession r3 = r5.A01
            X.DbU.A1D(r6, r3)
            X.Kf3 r4 = (X.C62392Kf3) r4
            java.lang.String r2 = r4.A01
            java.lang.String r1 = "creation_session_id"
            r6.putString(r1, r2)
            com.instagram.user.model.UpcomingEvent r2 = r4.A00
            java.lang.String r1 = "upcoming_live"
            r6.putParcelable(r1, r2)
            java.lang.String r2 = r4.A02
            java.lang.String r1 = "prior_module_name"
            r6.putString(r1, r2)
            X.4DH r1 = r5.A00
            X.6Yo r2 = X.DbW.A0H(r1, r3)
            X.C2601144i.A00()
            X.K6B r1 = new X.K6B
            r1.<init>()
            X.DbW.A0x(r6, r1, r2)
            r1 = 1701394837(0x65693995, float:6.883585E22)
            goto L_0x0078
        L_0x0492:
            r0 = 1335139531(0x4f949ccb, float:4.9866071E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r4.A02
            X.Kcx r2 = (X.C62263Kcx) r2
            java.lang.Object r1 = r4.A01
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2.A0G(r1)
            r1 = -2082932328(0xffffffff83d8f998, float:-1.2752643E-36)
            goto L_0x0078
        L_0x04a9:
            r0 = 1711170541(0x65fe63ed, float:1.5016555E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r5 = X.LRB.A00(r1)
            java.lang.Object r3 = r4.A01
            boolean r1 = r3 instanceof X.M0V
            if (r1 == 0) goto L_0x04c7
            if (r3 == 0) goto L_0x04c7
            X.6oS r2 = X.C318116oQ.A00(r5)
            r1 = 26
            X.C66169MGg.A01(r3, r5, r2, r1)
        L_0x04c7:
            r1 = -503680963(0xffffffffe1fa703d, float:-5.774717E20)
            goto L_0x0078
        L_0x04cc:
            r0 = 42308308(0x28592d4, float:1.9626869E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r5 = X.LRB.A00(r1)
            java.lang.Object r4 = r4.A01
            boolean r1 = r4 instanceof X.M0V
            r7 = 0
            if (r1 == 0) goto L_0x04fc
            if (r4 == 0) goto L_0x04fc
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r1 = r5.A0C
            X.JvD r1 = X.JTQ.A0Q(r1)
            if (r1 == 0) goto L_0x04fc
            java.lang.String r6 = r1.A08
            if (r6 == 0) goto L_0x04fc
            X.6oS r1 = X.C318116oQ.A00(r5)
            r8 = 26
            X.MGk r3 = new X.MGk
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r3, r1)
        L_0x04fc:
            r1 = 406049126(0x1833d166, float:2.3240927E-24)
            goto L_0x0078
        L_0x0501:
            r0 = 1532462583(0x5b5785f7, float:6.0664416E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel r5 = X.LRB.A00(r1)
            java.lang.Object r4 = r4.A01
            boolean r1 = r4 instanceof X.M0V
            r7 = 0
            if (r1 == 0) goto L_0x0531
            if (r4 == 0) goto L_0x0531
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r1 = r5.A0C
            X.JvD r1 = X.JTQ.A0Q(r1)
            if (r1 == 0) goto L_0x0531
            java.lang.String r6 = r1.A08
            if (r6 == 0) goto L_0x0531
            X.6oS r1 = X.C318116oQ.A00(r5)
            r8 = 28
            X.MGk r3 = new X.MGk
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r3, r1)
        L_0x0531:
            r1 = -948494903(0xffffffffc7771dc9, float:-63261.785)
            goto L_0x0078
        L_0x0536:
            r0 = 734772725(0x2bcbbdf5, float:1.4476741E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.LGN r1 = (X.LGN) r1
            X.Ji1 r5 = r1.A01()
            boolean r1 = r5 instanceof com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel
            if (r1 == 0) goto L_0x056c
            com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel r5 = (com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel) r5
            if (r5 == 0) goto L_0x056c
            java.lang.Object r3 = r4.A01
            X.Knq r3 = (X.C62876Knq) r3
            r1 = 0
            X.0qQ.A0B(r3, r1)
            X.4Co r1 = r5.A00
            r2 = 1
            if (r1 == 0) goto L_0x0563
            boolean r1 = r1.isActive()
            if (r1 != r2) goto L_0x0563
            com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel.A04(r5)
        L_0x0563:
            X.6oS r2 = X.C318116oQ.A00(r5)
            r1 = 20
            X.C66169MGg.A01(r3, r5, r2, r1)
        L_0x056c:
            r1 = -635347421(0xffffffffda215e23, float:-1.13552439E16)
            goto L_0x0078
        L_0x0571:
            r0 = 1776982113(0x69ea9861, float:3.545103E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A02
            X.Iaw r5 = (X.C57452Iaw) r5
            android.widget.PopupWindow r1 = r5.A05
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L_0x05a0
            android.view.View r1 = r5.A04
            android.view.ViewPropertyAnimator r2 = r1.animate()
            r1 = -1020002304(0xffffffffc3340000, float:-180.0)
            android.view.ViewPropertyAnimator r1 = r2.rotationBy(r1)
            r1.start()
            java.lang.Object r3 = r4.A01
            X.7l3 r3 = (X.C340307l3) r3
            r2 = 1
            X.K05 r1 = new X.K05
            r1.<init>(r2, r3, r5)
            r3.EzI(r1)
        L_0x05a0:
            r1 = -2083500656(0xffffffff83d04d90, float:-1.2242949E-36)
            goto L_0x0078
        L_0x05a5:
            r0 = -1065380511(0xffffffffc07f9561, float:-3.9934924)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.LMb r1 = (X.C64083LMb) r1
            X.0eM r1 = r1.A02
            X.2YL r6 = X.DbS.A0H(r1)
            java.lang.Object r1 = r4.A01
            X.Ko3 r1 = (X.C62889Ko3) r1
            X.Kdx r1 = (X.C62325Kdx) r1
            boolean r5 = r1.A06
            X.6oS r4 = X.C318116oQ.A00(r6)
            r3 = 0
            r2 = 12
            X.MGB r1 = new X.MGB
            r1.<init>(r6, r3, r2, r5)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = -1954668283(0xffffffff8b7e2105, float:-4.8943462E-32)
            goto L_0x0078
        L_0x05d2:
            r0 = 3112408(0x2f7dd8, float:4.361413E-39)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.Jip r5 = X.C64083LMb.A00(r1)
            java.lang.Object r1 = r4.A01
            X.Ko3 r1 = (X.C62889Ko3) r1
            X.Kdx r1 = (X.C62325Kdx) r1
            boolean r4 = r1.A03
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            X.JTY r1 = new X.JTY
            r1.<init>(r5, r2, r4)
            X.AnonymousClass7TE.A1Z(r1, r3)
            r1 = 438363049(0x1a20e3a9, float:3.3271127E-23)
            goto L_0x0078
        L_0x05f9:
            r0 = 357264977(0x154b6e51, float:4.1082548E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.Jip r6 = X.C64083LMb.A00(r1)
            java.lang.Object r1 = r4.A01
            X.Ko3 r1 = (X.C62889Ko3) r1
            X.Kdx r1 = (X.C62325Kdx) r1
            boolean r1 = r1.A07
            r5 = r1 ^ 1
            X.6oS r4 = X.C318116oQ.A00(r6)
            r3 = 0
            r2 = 7
            X.MGK r1 = new X.MGK
            r1.<init>(r6, r3, r2, r5)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = -680563519(0xffffffffd76f6cc1, float:-2.63250374E14)
            goto L_0x0078
        L_0x0623:
            r0 = 73750915(0x4655983, float:2.6959922E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.Jip r6 = X.C64083LMb.A00(r1)
            java.lang.Object r1 = r4.A01
            X.Ko3 r1 = (X.C62889Ko3) r1
            X.Kdx r1 = (X.C62325Kdx) r1
            boolean r5 = r1.A05
            X.6oS r4 = X.C318116oQ.A00(r6)
            r3 = 0
            r2 = 6
            X.MGK r1 = new X.MGK
            r1.<init>(r6, r3, r2, r5)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = -1202057303(0xffffffffb85a0fa9, float:-5.1989835E-5)
            goto L_0x0078
        L_0x064b:
            r0 = 1653559995(0x628f52bb, float:1.3219229E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r4.A02
            X.LMb r1 = (X.C64083LMb) r1
            X.0eM r1 = r1.A02
            X.2YL r6 = X.DbS.A0H(r1)
            java.lang.Object r1 = r4.A01
            X.Ko3 r1 = (X.C62889Ko3) r1
            X.Kdy r1 = (X.C62326Kdy) r1
            boolean r5 = r1.A07
            X.6oS r4 = X.C318116oQ.A00(r6)
            r3 = 0
            r2 = 12
            X.MGB r1 = new X.MGB
            r1.<init>(r6, r3, r2, r5)
            X.AnonymousClass7TE.A1Z(r1, r4)
            r1 = 2095175082(0x7ce1d5aa, float:9.3808033E36)
            goto L_0x0078
        L_0x0678:
            r0 = -361000822(0xffffffffea7b908a, float:-7.6030737E25)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A02
            instagram.features.clips.edit.ClipsEditMetadataController r5 = (instagram.features.clips.edit.ClipsEditMetadataController) r5
            com.instagram.common.session.UserSession r3 = r5.A0s
            X.27r r6 = X.27p.A01(r3)
            java.lang.Object r0 = r4.A01
            X.1Xj r0 = (X.1Xj) r0
            r1 = 0
            java.lang.String r9 = r0.getId()
            X.JVj r7 = X.C59725JVj.POST_CAPTURE
            com.instagram.user.model.User r0 = X.DbT.A0j(r3)
            java.lang.String r10 = r0.getId()
            X.0iw r0 = r5.A0r
            java.lang.String r12 = r0.getModuleName()
            java.lang.String r8 = "REMOVE_LINK_BUTTON"
            r0 = 69
            java.lang.String r11 = X.C66579MXk.A00(r0)
            r6.A1U(r7, r8, r9, r10, r11, r12)
            X.0eM r0 = r5.A1A
            java.lang.Object r0 = r0.getValue()
            X.Jg0 r0 = (X.C60119Jg0) r0
            X.2Fj r0 = r0.A01
            r0.A0B(r1)
            r0 = -1376255687(0xffffffffadf80139, float:-2.8194879E-11)
            goto L_0x0855
        L_0x06bf:
            r0 = -48693887(0xfffffffffd18fd81, float:-1.2709933E37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r4.A02
            X.2YL r6 = (X.2YL) r6
            java.lang.Object r0 = r4.A01
            X.KmV r0 = (X.C62793KmV) r0
            X.KQ2 r0 = (X.KQ2) r0
            com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl$XdtAsyncGetCreatorInspirationHub$Sections r0 = r0.A00
            java.lang.String r5 = r0.A0E()
            X.6oS r4 = X.C51975G9x.A0R(r6, r5)
            r3 = 0
            r1 = 4
            X.IlT r0 = new X.IlT
            r0.<init>(r6, r5, r3, r1)
            X.AnonymousClass7TE.A1Z(r0, r4)
            r0 = 382505526(0x16cc9236, float:3.305025E-25)
            goto L_0x0855
        L_0x06e9:
            java.lang.Object r5 = r4.A01
            X.LRa r5 = (X.C64159LRa) r5
            java.lang.Object r6 = r4.A02
            X.DUz r6 = (X.C46322DUz) r6
            com.instagram.common.session.UserSession r8 = r5.A0B
            X.27r r1 = X.27p.A01(r8)
            X.80P r0 = X.AnonymousClass80P.ADD_FUNDRAISER
            r1.A1X(r0)
            java.lang.String r11 = r6.getFundraiserId()
            X.4DH r7 = r5.A0A
            java.lang.String r10 = "FEED_COMPOSER"
            java.lang.String r9 = "suggested_fundraiser_pill"
            r12 = 0
            X.LTM.A07(r7, r8, r9, r10, r11, r12)
            X.AE4 r1 = X.C59847JaN.A00(r8)
            java.lang.String r0 = "FUNDRAISER_SUGGESTION_TAPPED"
            r1.A04(r0)
            X.KOf r4 = r5.A0C
            java.lang.String r3 = r6.getFundraiserId()
            java.lang.String r2 = r6.getFundraiserTitle()
            java.lang.String r1 = r6.getFormattedGoalAmount()
            X.AnonymousClass7TG.A1U(r3, r2, r1)
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r0 = new com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel
            r0.<init>(r3, r2, r1, r12)
            r4.A04 = r0
            r5.A02()
            return
        L_0x072f:
            java.lang.Object r1 = r4.A01
            X.LRa r1 = (X.C64159LRa) r1
            java.lang.Object r3 = r4.A02
            com.instagram.model.fundraiser.NewFundraiserInfo r3 = (com.instagram.model.fundraiser.NewFundraiserInfo) r3
            com.instagram.common.session.UserSession r5 = r1.A0B
            X.4DH r9 = r1.A0A
            java.lang.String r11 = "draft_fundraiser_row"
            java.lang.String r8 = "FEED_COMPOSER"
            r13 = 0
            r10 = r5
            r12 = r8
            r14 = r13
            X.LTM.A07(r9, r10, r11, r12, r13, r14)
            X.AE4 r2 = X.C59847JaN.A00(r5)
            java.lang.String r0 = "FUNDRAISER_TAPPED"
            r2.A04(r0)
            androidx.fragment.app.FragmentActivity r4 = r9.requireActivity()
            java.lang.String r7 = r3.A01
            r7.getClass()
            java.lang.String r9 = r3.A07
            int r0 = r3.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r10 = r3.A05
            java.util.List r13 = r3.A08
            java.lang.String r11 = r3.A03
            X.KOf r0 = r1.A0C
            java.lang.String r12 = r0.A0E
            X.LTV.A07(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x076e:
            java.lang.Object r3 = r4.A01
            X.LRa r3 = (X.C64159LRa) r3
            java.lang.Object r4 = r4.A02
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            com.instagram.common.session.UserSession r6 = r3.A0B
            java.lang.String r1 = r4.getId()
            X.4DH r5 = r3.A0A
            java.lang.String r8 = "FEED_COMPOSER"
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "nonprofit_id"
            r10.put(r0, r1)
            java.lang.String r7 = "fundraiser_creation_nudge"
            r9 = 0
            X.LTM.A07(r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = r4.getId()
            X.LTM.A05(r5, r6, r8, r0)
            android.content.Context r1 = r5.requireContext()
            X.8ab r2 = X.DbS.A0Y(r1)
            r0 = 2131237569(0x7f081ac1, float:1.8091392E38)
            X.DbU.A16(r1, r2, r0)
            r0 = 2131952462(0x7f13034e, float:1.9541367E38)
            r2.A09(r0)
            r0 = 2131952461(0x7f13034d, float:1.9541365E38)
            r2.A08(r0)
            r1 = 2131956858(0x7f13147a, float:1.9550284E38)
            r0 = 56
            X.LV0 r0 = X.LV0.A00(r3, r4, r0)
            r2.A0J(r0, r1)
            r0 = 57
            X.LV0 r0 = X.LV0.A00(r3, r4, r0)
            X.DbX.A16(r0, r2)
            return
        L_0x07c6:
            java.lang.Object r6 = r4.A01
            X.LOO r6 = (X.LOO) r6
            java.lang.Object r5 = r4.A02
            X.M0i r5 = (X.C65816M0i) r5
            android.view.View r1 = r6.A00
            r0 = 8
            r1.setVisibility(r0)
            X.6gx r4 = r6.A02
            java.lang.String r3 = r6.A08
            X.3NV r0 = r6.A04
            java.lang.String r1 = r0.A01
            java.lang.String r0 = r6.A09
            r2 = 1
            r4.A0X(r3, r1, r0, r2)
            X.LGO r0 = r6.A03
            if (r0 == 0) goto L_0x07ea
            r0.A00()
        L_0x07ea:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 0
            r5.A02(r1, r0, r2)
            return
        L_0x07f1:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r9)
            r1 = 1232425067(0x4975506b, float:1004806.7)
            X.AnonymousClass0fD.A0C(r1, r0)
            throw r2
        L_0x07fc:
            r0 = 1620432204(0x6095d54c, float:8.637295E19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r4.A02
            X.K7d r5 = (X.C61428K7d) r5
            X.LFJ r1 = r5.A02
            java.lang.String r7 = "interactor"
            if (r1 == 0) goto L_0x08be
            java.lang.String r0 = "amount"
            r1.A00 = r0
            android.widget.TextView r1 = r5.A00
            if (r1 == 0) goto L_0x08b6
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r4 = r0.getResources()
            android.content.Context r3 = r0.getContext()
            int r0 = X.2Yu.A0D(r3)
            int r0 = r4.getColor(r0)
            r1.setTextColor(r0)
            android.widget.TextView r1 = r5.A01
            if (r1 == 0) goto L_0x08b9
            int r0 = X.2Yu.A08(r3)
            int r0 = r4.getColor(r0)
            r1.setTextColor(r0)
            X.LFJ r0 = r5.A02
            if (r0 == 0) goto L_0x08be
            X.2Fj r0 = r0.A00()
            java.lang.Object r1 = r0.A02()
            X.Jtp r1 = (X.C60931Jtp) r1
            if (r1 == 0) goto L_0x0852
            X.JlK r0 = r5.A03
            if (r0 == 0) goto L_0x08bc
            r0.A00(r1)
        L_0x0852:
            r0 = -874696342(0xffffffffcbdd316a, float:-2.8992212E7)
        L_0x0855:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0859:
            r0 = 1852466514(0x6e6a6552, float:1.8135495E28)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r4.A02
            X.K7d r6 = (X.C61428K7d) r6
            X.LFJ r1 = r6.A02
            java.lang.String r7 = "interactor"
            if (r1 == 0) goto L_0x08be
            java.lang.String r0 = "time"
            r1.A00 = r0
            android.widget.TextView r1 = r6.A01
            if (r1 == 0) goto L_0x08b9
            java.lang.Object r0 = r4.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r3 = r0.getResources()
            android.content.Context r2 = r0.getContext()
            int r0 = X.2Yu.A0D(r2)
            int r0 = r3.getColor(r0)
            r1.setTextColor(r0)
            android.widget.TextView r1 = r6.A00
            if (r1 == 0) goto L_0x08b6
            int r0 = X.2Yu.A08(r2)
            int r0 = r3.getColor(r0)
            r1.setTextColor(r0)
            X.LFJ r0 = r6.A02
            if (r0 == 0) goto L_0x08be
            X.2Fj r0 = r0.A00()
            java.lang.Object r1 = r0.A02()
            X.Jtp r1 = (X.C60931Jtp) r1
            if (r1 == 0) goto L_0x08af
            X.JlK r0 = r6.A03
            if (r0 == 0) goto L_0x08bc
            r0.A00(r1)
        L_0x08af:
            r0 = -693908162(0xffffffffd6a3cd3e, float:-9.0050952E13)
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x08b6:
            java.lang.String r7 = "amountSortButton"
            goto L_0x08be
        L_0x08b9:
            java.lang.String r7 = "timeSortButton"
            goto L_0x08be
        L_0x08bc:
            java.lang.String r7 = "adapter"
        L_0x08be:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LY2.onClick(android.view.View):void");
    }
}
