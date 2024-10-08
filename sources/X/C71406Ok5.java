package X;

import android.view.View;

/* renamed from: X.Ok5  reason: case insensitive filesystem */
public final class C71406Ok5 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C71406Ok5(NKY nky, int i) {
        this.A00 = i;
        if (15 - i != 0) {
            this.A01 = nky;
        } else {
            this.A01 = nky;
        }
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new C71406Ok5(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r0v46, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r3v18, types: [java.lang.Boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x061c, code lost:
        X.PU7.A00(r1, r2, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x061f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016f, code lost:
        if (r9 != true) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0245, code lost:
        if (r7 != null) goto L_0x015b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r53) {
        /*
            r52 = this;
            r3 = r52
            int r0 = r3.A00
            r4 = r53
            switch(r0) {
                case 0: goto L_0x053a;
                case 1: goto L_0x050a;
                case 2: goto L_0x04ec;
                case 3: goto L_0x0655;
                case 4: goto L_0x064b;
                case 5: goto L_0x0620;
                case 6: goto L_0x0610;
                case 7: goto L_0x0603;
                case 8: goto L_0x05f6;
                case 9: goto L_0x05c4;
                case 10: goto L_0x04b3;
                case 11: goto L_0x049b;
                case 12: goto L_0x0486;
                case 13: goto L_0x0467;
                case 14: goto L_0x0446;
                case 15: goto L_0x0367;
                case 16: goto L_0x035b;
                case 17: goto L_0x0590;
                case 18: goto L_0x032d;
                case 19: goto L_0x02a5;
                case 20: goto L_0x0286;
                case 21: goto L_0x010a;
                case 22: goto L_0x00ad;
                case 23: goto L_0x0050;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 468372134(0x1beacaa6, float:3.884301E-22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.Ni1 r3 = (X.C69247Ni1) r3
            X.4bN r0 = X.C69247Ni1.A00(r3)
            if (r0 == 0) goto L_0x0047
            X.1Xj r1 = r0.A02
            if (r1 == 0) goto L_0x0047
            java.lang.String r5 = r1.getId()
            if (r5 == 0) goto L_0x0047
            com.instagram.common.typedurl.ImageUrl r4 = r1.A1Q()
            if (r4 != 0) goto L_0x0030
            android.app.Activity r0 = r3.A03
            com.instagram.model.mediasize.ExtendedImageUrl r4 = r1.A1n(r0)
        L_0x0030:
            com.instagram.common.session.UserSession r3 = r3.A04
            java.lang.String r1 = ""
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.KWf r0 = new X.KWf
            r0.<init>(r3)
            r0.A00(r4, r5, r1)
        L_0x0040:
            r0 = 429972406(0x19a0dbb6, float:1.6632353E-23)
        L_0x0043:
            X.AnonymousClass0fD.A0C(r0, r2)
        L_0x0046:
            return
        L_0x0047:
            android.app.Activity r1 = r3.A03
            r0 = 2131961740(0x7f13278c, float:1.9560185E38)
            X.C59689JTv.A07(r1, r0)
            goto L_0x0040
        L_0x0050:
            r0 = -1635616914(0xffffffff9e82776e, float:-1.381368E-20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r3.A01
            X.Ni1 r3 = (X.C69247Ni1) r3
            X.OI5 r0 = r3.A00
            if (r0 == 0) goto L_0x065f
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r4 = r0.A08
            java.lang.String r9 = X.AnonymousClass7TF.A0f(r4)
            X.4bN r0 = X.C69247Ni1.A00(r3)
            if (r0 == 0) goto L_0x00ab
            X.1Xj r7 = r0.A02
        L_0x006d:
            com.instagram.clips.model.ClipsSpotlightModel r0 = X.C69247Ni1.A01(r3)
            if (r7 == 0) goto L_0x00a2
            if (r0 == 0) goto L_0x00a2
            com.instagram.user.model.User r0 = r0.A01
            com.instagram.model.direct.DirectShareTarget r8 = new com.instagram.model.direct.DirectShareTarget
            r8.<init>((com.instagram.user.model.User) r0)
            X.Mew r0 = r3.A05
            X.7Z7 r5 = r0.A00(r8)
            com.instagram.api.schemas.SocialContextType r6 = com.instagram.api.schemas.SocialContextType.SPOTLIGHT
            r12 = 0
            java.lang.String r10 = "clips_viewer_spotlight_reply"
            java.lang.String r11 = ""
            r5.ELU(r6, r7, r8, r9, r10, r11, r12)
            android.app.Activity r1 = r3.A03
            r0 = 2131973117(0x7f1353fd, float:1.958326E38)
            X.C59689JTv.A07(r1, r0)
            android.text.Editable r0 = r4.getText()
            r0.clear()
            r3.A0E()
        L_0x009e:
            r0 = -1176603848(0xffffffffb9de7338, float:-4.2428984E-4)
            goto L_0x0043
        L_0x00a2:
            android.app.Activity r1 = r3.A03
            r0 = 2131961740(0x7f13278c, float:1.9560185E38)
            X.C59689JTv.A07(r1, r0)
            goto L_0x009e
        L_0x00ab:
            r7 = 0
            goto L_0x006d
        L_0x00ad:
            r0 = 1307339582(0x4dec6b3e, float:4.958064E8)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.Ni1 r5 = (X.C69247Ni1) r5
            X.Meq r3 = r5.A06
            r1 = 0
            r0 = 0
            boolean r1 = r3.A0C(r1, r0)
            X.OI5 r6 = r5.A00
            if (r6 == 0) goto L_0x0669
            X.OZT r4 = r3.A03
            if (r4 == 0) goto L_0x00cc
            android.view.View r0 = r6.A01
            r4.A00 = r0
        L_0x00cc:
            if (r1 == 0) goto L_0x0106
            if (r4 == 0) goto L_0x00df
            android.widget.FrameLayout r0 = r4.A07
            android.view.ViewTreeObserver r3 = r0.getViewTreeObserver()
            r1 = 1
            X.Okj r0 = new X.Okj
            r0.<init>(r4, r1)
            r3.addOnGlobalLayoutListener(r0)
        L_0x00df:
            android.view.View r1 = r6.A00
            r0 = 4
            r1.setVisibility(r0)
            r4 = 2131238125(0x7f081ced, float:1.809252E38)
            X.OI5 r0 = r5.A00
            if (r0 == 0) goto L_0x0664
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r0.A07
            android.app.Activity r1 = r5.A03
            X.DbU.A13(r1, r3, r4)
            int r0 = X.2Yu.A05(r1)
            X.DbU.A14(r1, r3, r0)
            android.view.View r1 = r6.A03
            r0 = 21
            X.C71439Oke.A01(r1, r0, r5)
        L_0x0101:
            r0 = 130653729(0x7c99e21, float:3.0336058E-34)
            goto L_0x0043
        L_0x0106:
            r5.A0D()
            goto L_0x0101
        L_0x010a:
            r0 = 1454277910(0x56ae8516, float:9.5943311E13)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.Mep r1 = (X.C66906Mep) r1
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r1.A05
            r12 = 0
            if (r0 == 0) goto L_0x0283
            android.text.Editable r0 = r0.getText()
        L_0x011e:
            java.lang.String r46 = java.lang.String.valueOf(r0)
            X.4bN r0 = X.C66906Mep.A02(r1)
            if (r0 == 0) goto L_0x023a
            X.1Xj r13 = r0.A02
            if (r13 == 0) goto L_0x023a
            java.lang.String r4 = r13.getId()
            com.instagram.clips.model.ClipsReplyBarData r0 = r1.A0I
            java.lang.String r3 = r0.A07
            boolean r3 = X.0qQ.A0K(r4, r3)
            if (r3 != 0) goto L_0x0142
            boolean r3 = r1.A0S
            if (r3 == 0) goto L_0x0248
            boolean r3 = r1.A09
            if (r3 != 0) goto L_0x0248
        L_0x0142:
            com.instagram.common.session.UserSession r6 = r1.A0J
            X.C66908Mer.A00(r6)
            X.4DU r3 = r1.A0L
            X.0wc r5 = X.AnonymousClass0kN.A01(r3, r6)
            boolean r3 = r1.A0S
            if (r3 == 0) goto L_0x023f
            X.9JD r4 = X.C66906Mep.A00(r1)
            if (r4 == 0) goto L_0x021c
            java.lang.String r3 = r4.A03
            java.lang.String r7 = r4.A02
        L_0x015b:
            com.instagram.model.direct.DirectThreadKey r4 = r0.A03
            if (r4 == 0) goto L_0x0171
            X.2Dm r8 = X.2L2.A00(r6)
            X.3su r8 = r8.BRz(r4, r3)
            r10 = 1
            if (r8 == 0) goto L_0x0171
            boolean r9 = r8.A1S()
            r8 = 1
            if (r9 == r10) goto L_0x0172
        L_0x0171:
            r8 = 0
        L_0x0172:
            X.2FW r24 = X.2FW.A0W
            java.lang.String r10 = r6.A06
            java.lang.String r32 = "clip_viewer"
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r8)
            if (r4 == 0) goto L_0x01c6
            java.lang.String r8 = r0.A0A
            X.C71040OaD.A00(r5, r8, r12)
            X.7Zi r39 = X.C333527Zh.A00(r6)
            boolean r9 = r0.A0I
            r37 = 0
            X.3tI r11 = new X.3tI
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r12
            r25 = r12
            r26 = r12
            r27 = r12
            r29 = r7
            r30 = r12
            r31 = r3
            r33 = r10
            r34 = r12
            r35 = r12
            r36 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            java.lang.String r43 = "none"
            r40 = r11
            r42 = r46
            r44 = r8
            r45 = r9
            r41 = r4
            r39.EMr(r40, r41, r42, r43, r44, r45)
        L_0x01c6:
            com.instagram.model.direct.threadkey.impl.MsysThreadId r8 = r0.A04
            if (r8 == 0) goto L_0x021c
            java.lang.String r4 = r0.A0A
            X.C71040OaD.A00(r5, r4, r12)
            X.Mot r39 = X.C67497Mor.A00(r6)
            boolean r0 = r0.A0I
            r37 = 0
            X.3tI r11 = new X.3tI
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r12
            r25 = r12
            r26 = r12
            r27 = r12
            r29 = r7
            r30 = r12
            r31 = r3
            r33 = r10
            r34 = r12
            r35 = r12
            r36 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            java.lang.String r47 = "none"
            r40 = r12
            r41 = r12
            r42 = r11
            r43 = r12
            r44 = r8
            r45 = r12
            r48 = r4
            r49 = r12
            r50 = r12
            r51 = r0
            r39.EMq(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
        L_0x021c:
            android.view.View r0 = r1.A01
            if (r0 == 0) goto L_0x0224
            android.content.Context r12 = r0.getContext()
        L_0x0224:
            r0 = 2131973117(0x7f1353fd, float:1.958326E38)
            X.C59689JTv.A07(r12, r0)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r1.A05
            if (r0 == 0) goto L_0x0237
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0237
            r0.clear()
        L_0x0237:
            r1.A0E()
        L_0x023a:
            r0 = 2068205295(0x7b464eef, float:1.02967574E36)
            goto L_0x0043
        L_0x023f:
            java.lang.String r3 = r0.A08
            if (r3 == 0) goto L_0x021c
            java.lang.String r7 = r0.A06
            if (r7 != 0) goto L_0x015b
            goto L_0x021c
        L_0x0248:
            com.instagram.common.session.UserSession r4 = r1.A0J
            X.C66908Mer.A00(r4)
            X.4DU r3 = r1.A0L
            X.0wc r4 = X.AnonymousClass0kN.A01(r3, r4)
            java.lang.String r5 = r0.A0A
            java.lang.String r3 = r0.A05
            X.C71040OaD.A00(r4, r5, r3)
            X.Mew r3 = r1.A0K
            com.instagram.model.direct.DirectShareTarget r14 = r0.A02
            X.7Z7 r10 = r3.A00(r14)
            com.instagram.clips.intf.ClipsViewerSource r4 = r1.A0H
            com.instagram.clips.intf.ClipsViewerSource r3 = com.instagram.clips.intf.ClipsViewerSource.BLEND
            if (r4 != r3) goto L_0x027a
            com.instagram.api.schemas.SocialContextType r11 = com.instagram.api.schemas.SocialContextType.BLEND_MEDIA_SUGGESTED_BY
        L_0x026a:
            boolean r0 = r0.A0I
            java.lang.String r17 = "clips_viewer_reply_bar"
            r15 = r46
            r18 = r12
            r19 = r0
            r16 = r5
            r10.ELV(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x021c
        L_0x027a:
            boolean r3 = r0.A0F
            if (r3 == 0) goto L_0x0281
            com.instagram.api.schemas.SocialContextType r11 = com.instagram.api.schemas.SocialContextType.REEL_EXTERNAL_SHARE
            goto L_0x026a
        L_0x0281:
            r11 = 0
            goto L_0x026a
        L_0x0283:
            r0 = r12
            goto L_0x011e
        L_0x0286:
            r0 = -2105474980(0xffffffff8281005c, float:-1.8955053E-37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.Mep r0 = (X.C66906Mep) r0
            X.Meq r0 = r0.A0M
            if (r0 == 0) goto L_0x02a0
            X.C66907Meq.A00(r0)
            X.OZT r1 = r0.A03
            if (r1 == 0) goto L_0x02a0
            r0 = 0
            r1.A02(r0)
        L_0x02a0:
            r0 = 1260434352(0x4b20b3b0, float:1.053176E7)
            goto L_0x0043
        L_0x02a5:
            r0 = -374405067(0xffffffffe9af0835, float:-2.6450097E25)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r3.A01
            X.Mep r5 = (X.C66906Mep) r5
            X.Meq r6 = r5.A0M
            r3 = 0
            if (r6 == 0) goto L_0x02d0
            r1 = 0
            X.9JD r0 = X.C66906Mep.A00(r5)
            if (r0 == 0) goto L_0x02c0
            java.lang.Object r3 = r0.A00
            java.util.List r3 = (java.util.List) r3
        L_0x02c0:
            boolean r0 = r6.A0C(r3, r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            X.OZT r1 = r6.A03
            if (r1 == 0) goto L_0x02d0
            android.view.View r0 = r5.A00
            r1.A00 = r0
        L_0x02d0:
            r4 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r3, r4)
            if (r0 == 0) goto L_0x0329
            if (r6 == 0) goto L_0x02eb
            X.OZT r3 = r6.A03
            if (r3 == 0) goto L_0x02eb
            android.widget.FrameLayout r0 = r3.A07
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.Okj r0 = new X.Okj
            r0.<init>(r3, r4)
            r1.addOnGlobalLayoutListener(r0)
        L_0x02eb:
            android.view.ViewGroup r0 = r5.A02
            X.C66581MXm.A19(r0)
            androidx.fragment.app.FragmentActivity r4 = r5.A0G
            android.content.Context r1 = r4.getApplicationContext()
            r0 = 2131238125(0x7f081ced, float:1.809252E38)
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)
            android.content.Context r1 = r4.getApplicationContext()
            android.content.Context r0 = r4.getApplicationContext()
            int r0 = X.2Yu.A05(r0)
            int r1 = r1.getColor(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A03
            if (r0 == 0) goto L_0x0314
            r0.setImageDrawable(r3)
        L_0x0314:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A03
            if (r0 == 0) goto L_0x031b
            r0.setColorFilter(r1)
        L_0x031b:
            android.view.View r1 = r5.A01
            if (r1 == 0) goto L_0x0324
            r0 = 18
            X.C71439Oke.A01(r1, r0, r5)
        L_0x0324:
            r0 = 222611118(0xd44c6ae, float:6.0636315E-31)
            goto L_0x0043
        L_0x0329:
            r5.A0D()
            goto L_0x0324
        L_0x032d:
            r0 = -1563703603(0xffffffffa2cbc6cd, float:-5.523375E-18)
            int r2 = X.AnonymousClass0fD.A05(r0)
            android.content.Context r1 = r4.getContext()
            java.lang.Object r4 = r3.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r3 = r0.A02(r1)
            if (r3 == 0) goto L_0x0356
            com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.NKe r1 = new X.NKe
            r1.<init>()
            android.os.Bundle r0 = X.DbY.A09(r4)
            r1.setArguments(r0)
            r3.A0I(r1)
        L_0x0356:
            r0 = -1668743661(0xffffffff9c88fe13, float:-9.065402E-22)
            goto L_0x0043
        L_0x035b:
            java.lang.Object r0 = r3.A01
            X.NKY r0 = (X.NKY) r0
            X.7Pu r0 = r0.A02
            if (r0 == 0) goto L_0x0046
            r0.A07()
            return
        L_0x0367:
            r0 = -667239807(0xffffffffd83aba81, float:-8.2124076E14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r3.A01
            X.NKY r6 = (X.NKY) r6
            X.NHU r0 = r6.A09
            if (r0 == 0) goto L_0x0443
            X.OM1 r0 = r0.A00()
            java.lang.String r9 = r0.A00()
        L_0x037e:
            X.OEe r8 = r6.A0A
            java.lang.Integer r5 = X.O3X.A00(r9)
            r3 = 1
            X.0qQ.A0B(r5, r3)
            com.instagram.common.session.UserSession r7 = r8.A01
            X.0Tu r4 = X.0Tu.A05
            r0 = 36326910699059273(0x810f2200013849, double:3.036622830588927E-306)
            boolean r0 = X.182.A06(r4, r7, r0)
            if (r0 == 0) goto L_0x03c3
            X.0iw r0 = r8.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r7)
            java.lang.String r0 = "mwb_support_hub_triggered"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x03c3
            java.lang.String r1 = r8.A02
            java.lang.String r0 = "logger_session_id"
            r4.AAJ(r0, r1)
            java.lang.String r1 = "frx_flow"
            java.lang.String r0 = "hub_entry_point"
            r4.AAJ(r0, r1)
            java.lang.String r1 = X.O3Y.A00(r5)
            java.lang.String r0 = "hub_use_case_type"
            r4.AAJ(r0, r1)
            r4.Cgf()
        L_0x03c3:
            com.instagram.common.session.UserSession r5 = r6.A01
            android.content.Context r4 = r6.requireContext()
            java.lang.Integer r9 = X.O3X.A00(r9)
            X.OEe r0 = r6.A0A
            r15 = 0
            X.0qQ.A0B(r5, r15)
            r8 = 2
            X.AnonymousClass7TF.A1C(r9, r8, r0)
            r10 = 0
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>(r8)
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "logger_session_id"
            r7.put(r0, r1)
            r6.set(r3)
            java.lang.String r1 = "frx_flow"
            java.lang.String r0 = "hub_entry_point"
            r7.put(r0, r1)
            r6.set(r15)
            java.lang.String r1 = X.O3Y.A00(r9)
            java.lang.String r0 = "hub_use_case_type"
            r7.put(r0, r1)
            int r0 = r6.nextClearBit(r15)
            if (r0 < r8) goto L_0x066e
            X.0sm r21 = X.0Yt.A0E()
            java.util.Map r20 = X.0Yt.A0B(r7)
            r23 = 30
            r22 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r17 = "com.bloks.www.screen_controller.support_hub"
            X.ShW r1 = new X.ShW
            r18 = r10
            r19 = r10
            r25 = r3
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25)
            X.6Qj r0 = X.C48721Ej6.A00(r5, r15)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            r14 = 1060320051(0x3f333333, float:0.7)
            X.FRI r9 = new X.FRI
            r12 = r10
            r13 = r10
            r16 = r15
            r17 = r15
            r18 = r15
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.0qQ.A0B(r0, r3)
            r1.A02(r4, r9, r0)
            r0 = 2005688831(0x778c61ff, float:5.694603E33)
            goto L_0x0043
        L_0x0443:
            r9 = 0
            goto L_0x037e
        L_0x0446:
            java.lang.Object r1 = r3.A01
            X.Nhk r1 = (X.C69230Nhk) r1
            X.ExC r0 = r1.A05
            if (r0 != 0) goto L_0x0458
            java.lang.String r0 = "reportingLogger"
        L_0x0450:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0458:
            com.instagram.user.model.User r0 = r1.A03
            if (r0 != 0) goto L_0x045f
            java.lang.String r0 = "commenterUser"
            goto L_0x0450
        L_0x045f:
            X.PvX r0 = r1.A06
            if (r0 == 0) goto L_0x0046
            r0.De9()
            return
        L_0x0467:
            r0 = 2122736780(0x7e86648c, float:8.931931E37)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.NKU r0 = (X.NKU) r0
            X.NL4 r3 = r0.A08
            X.OFj r1 = r3.A00
            if (r1 == 0) goto L_0x0481
            boolean r0 = r1.A03
            r0 = r0 ^ 1
            r1.A03 = r0
            X.NL4.A00(r3)
        L_0x0481:
            r0 = -462218964(0xffffffffe473192c, float:-1.793749E22)
            goto L_0x0043
        L_0x0486:
            r0 = 1646380784(0x6221c6f0, float:7.460652E20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.OYt r0 = (X.C71018OYt) r0
            android.widget.PopupWindow r0 = r0.A01
            r0.dismiss()
            r0 = 2011201029(0x77e07e05, float:9.106488E33)
            goto L_0x0043
        L_0x049b:
            r0 = 743377663(0x2c4f0aff, float:2.9422573E-12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r3.A01
            X.OYt r1 = (X.C71018OYt) r1
            r0 = 1
            r1.A00 = r0
            android.widget.PopupWindow r0 = r1.A01
            r0.dismiss()
            r0 = -6849203(0xffffffffff977d4d, float:NaN)
            goto L_0x0043
        L_0x04b3:
            r0 = 1399328989(0x536810dd, float:9.9671533E11)
            int r2 = X.AnonymousClass0fD.A05(r0)
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = "Clearing reverb database"
            X.C59689JTv.A09(r1, r0)
            java.lang.Object r0 = r3.A01
            X.4mT r0 = (X.C273374mT) r0
            com.instagram.common.session.UserSession r0 = r0.getSession()
            X.MdY r0 = X.C66843Mdb.A01(r0)
            com.instagram.common.session.UserSession r0 = r0.A00
            X.NAP r5 = X.C66843Mdb.A00(r0)
            X.68L r4 = X.C66581MXm.A0I(r5)
            com.facebook.msys.mca.MailboxFutureImpl r3 = X.C66580MXl.A0G(r4)
            r1 = 35
            X.Oph r0 = new X.Oph
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r3)
            X.C66582MXn.A1D(r4, r0, r3)
            r0 = -1234647344(0xffffffffb668c6d0, float:-3.4686418E-6)
            goto L_0x0043
        L_0x04ec:
            r0 = -455695248(0xffffffffe4d6a470, float:-3.1675618E22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            com.instagram.ui.widget.expandingtextview.ExpandingEllipsizingTextView r4 = (com.instagram.ui.widget.expandingtextview.ExpandingEllipsizingTextView) r4
            r3 = 1
            X.NiL r1 = r4.A04
            X.NiL r0 = X.C69259NiL.EXPANDED
            if (r1 != r0) goto L_0x0506
            r4.A03(r3)
        L_0x0501:
            r0 = -1891413650(0xffffffff8f43516e, float:-9.629925E-30)
            goto L_0x0043
        L_0x0506:
            r4.A04(r3)
            goto L_0x0501
        L_0x050a:
            r0 = -1974508174(0xffffffff8a4f6572, float:-9.985767E-33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r3.A01
            com.instagram.ui.widget.dismissablecallout.DismissableCallout r4 = (com.instagram.ui.widget.dismissablecallout.DismissableCallout) r4
            X.2co r0 = X.C315596kB.A02
            X.5nL r3 = X.JTP.A0b(r4)
            float r1 = r4.getY()
            int r0 = r4.A00
            float r0 = (float) r0
            r3.A0T(r1, r0)
            r1 = 8
            r3.A03 = r1
            X.5nL r0 = r3.A0A()
            r0.A0H()
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r4.A03
            r0.setVisibility(r1)
            r0 = -464796450(0xffffffffe44bc4de, float:-1.5035499E22)
            goto L_0x0043
        L_0x053a:
            r0 = -462543107(0xffffffffe46e26fd, float:-1.7572538E22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r3.A01
            X.MjW r0 = (X.C67174MjW) r0
            X.MjG r0 = r0.A01
            X.Ma2 r7 = r0.A00
            com.instagram.common.session.UserSession r6 = r7.A0p()
            java.lang.Class<com.instagram.modal.ModalActivity> r5 = com.instagram.modal.ModalActivity.class
            X.4DH r4 = r7.A1J
            android.os.Bundle r3 = r4.requireArguments()
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            java.lang.String r0 = "direct_inbox_channel_discovery_suggestions"
            X.6W8 r0 = X.DbS.A0b(r1, r3, r6, r5, r0)
            X.DbU.A1K(r4, r0)
            X.Odl r4 = X.OPT.A01(r7)
            X.0Aj r3 = X.C71140Odl.A00(r4)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x058b
            X.C71140Odl.A04(r3, r4)
            java.lang.String r0 = "inbox_directory_sheet_rendered"
            X.C66582MXn.A19(r3, r0)
            java.lang.String r1 = "see_all_channels_button"
            java.lang.String r0 = "source"
            X.Dba.A1B(r3, r0, r1)
            java.lang.String r1 = r4.A00
            java.lang.String r0 = X.Dbe.A00()
            r3.AAJ(r0, r1)
            r3.Cgf()
        L_0x058b:
            r0 = 1635685675(0x617e952b, float:2.9351385E20)
            goto L_0x0043
        L_0x0590:
            java.lang.Object r3 = r3.A01
            X.NKe r3 = (X.C68486NKe) r3
            boolean r1 = r3.A03
            X.1Av r0 = r3.A02
            r2 = 2
            if (r1 == 0) goto L_0x059c
            r2 = 1
        L_0x059c:
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "zero_rating_video_autoplay_disabled"
            r1.E5Z(r0, r2)
            r1.apply()
            com.instagram.common.session.UserSession r0 = r3.getSession()
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            boolean r1 = r3.A03
            X.Osr r0 = new X.Osr
            r0.<init>(r1)
            r2.A00(r0)
            android.content.Context r0 = r3.requireContext()
            android.app.Activity r0 = (android.app.Activity) r0
            r0.onBackPressed()
            return
        L_0x05c4:
            java.lang.Object r6 = r3.A01
            android.content.Context r5 = r4.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r5)
            r1 = 2131626312(0x7f0e0948, float:1.8879857E38)
            r0 = 0
            android.view.View r4 = X.DbT.A0C(r2, r0, r1)
            X.Vl9 r3 = new X.Vl9
            r3.<init>(r5)
            r2 = 2131953181(0x7f13061d, float:1.9542826E38)
            r3.A02(r2)
            r3.A07(r4)
            r1 = 10
            X.Of3 r0 = new X.Of3
            r0.<init>(r1, r5, r4, r6)
            r3.A04(r0, r2)
            X.U5o r0 = r3.A00()
            X.AnonymousClass0fN.A00(r0)
            return
        L_0x05f6:
            java.lang.Object r0 = r3.A01
            X.NKf r0 = (X.C68487NKf) r0
            X.1a8 r2 = r0.A02
            X.1aU r1 = X.C68487NKf.A00(r0)
            r0 = 33
            goto L_0x061c
        L_0x0603:
            java.lang.Object r0 = r3.A01
            X.NKf r0 = (X.C68487NKf) r0
            X.1a8 r2 = r0.A02
            X.1aU r1 = X.C68487NKf.A00(r0)
            r0 = 32
            goto L_0x061c
        L_0x0610:
            java.lang.Object r0 = r3.A01
            X.NKf r0 = (X.C68487NKf) r0
            X.1a8 r2 = r0.A02
            X.1aU r1 = X.C68487NKf.A00(r0)
            r0 = 34
        L_0x061c:
            X.PU7.A00(r1, r2, r4, r0)
            return
        L_0x0620:
            java.lang.Object r2 = r3.A01
            X.4mT r2 = (X.C273374mT) r2
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = "Restoring from Occamadillo..."
            X.C59689JTv.A09(r1, r0)
            com.instagram.common.session.UserSession r0 = r2.getSession()
            X.NAa r4 = X.C70113NxT.A00(r0)
            X.68J r1 = r4.mMailboxApiHandleMetaProvider
            r0 = 0
            X.68L r3 = r1.ASa(r0)
            com.facebook.msys.mca.MailboxFutureImpl r2 = X.C66580MXl.A0G(r3)
            r1 = 39
            X.Oph r0 = new X.Oph
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r2)
            X.C66582MXn.A1E(r3, r0, r2)
            return
        L_0x064b:
            java.lang.Object r0 = r3.A01
            com.instagram.ui.widget.search.SearchController r0 = (com.instagram.ui.widget.search.SearchController) r0
            X.Pvw r0 = r0.A0G
            r0.DRz()
            return
        L_0x0655:
            java.lang.Object r0 = r3.A01
            com.instagram.ui.widget.search.SearchController r0 = (com.instagram.ui.widget.search.SearchController) r0
            X.Pvw r0 = r0.A0G
            r0.DRx()
            return
        L_0x065f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0664:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0669:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x066e:
            java.lang.String r0 = "Missing required params"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71406Ok5.onClick(android.view.View):void");
    }

    public C71406Ok5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C71406Ok5(C68487NKf nKf, int i) {
        this.A00 = i;
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                this.A01 = nKf;
                return;
            default:
                this.A01 = nKf;
                return;
        }
    }
}
