package X;

public final class JJS extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JJS(int i, Object obj, Object obj2) {
        super(3);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static AnonymousClass5PJ A00(C286575Wy r1, Object obj, Object obj2, int i, int i2) {
        return AnonymousClass5PI.A01(r1, new JJS(i, obj, obj2), i2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x094b, code lost:
        r0.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0ba2, code lost:
        if (r1.BUi() == null) goto L_0x0ba4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0d2a, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r30, java.lang.Object r31, java.lang.Object r32) {
        /*
            r29 = this;
            r1 = r29
            r7 = r32
            r3 = r30
            r0 = r31
            int r2 = r1.A00
            switch(r2) {
                case 0: goto L_0x004d;
                case 1: goto L_0x00b3;
                case 2: goto L_0x0119;
                case 3: goto L_0x0154;
                case 4: goto L_0x016c;
                case 5: goto L_0x019b;
                case 6: goto L_0x021b;
                case 7: goto L_0x027e;
                case 8: goto L_0x02b8;
                case 9: goto L_0x02f2;
                case 10: goto L_0x033a;
                case 11: goto L_0x0491;
                case 12: goto L_0x04a5;
                case 13: goto L_0x04dc;
                case 14: goto L_0x050b;
                case 15: goto L_0x0540;
                case 16: goto L_0x05a5;
                case 17: goto L_0x060d;
                case 18: goto L_0x0726;
                case 19: goto L_0x075f;
                case 20: goto L_0x07b9;
                case 21: goto L_0x07f2;
                case 22: goto L_0x0829;
                case 23: goto L_0x084a;
                case 24: goto L_0x0883;
                case 25: goto L_0x08e2;
                case 26: goto L_0x0917;
                case 27: goto L_0x0950;
                case 28: goto L_0x097a;
                case 29: goto L_0x09b9;
                case 30: goto L_0x0c23;
                case 31: goto L_0x0cd6;
                case 32: goto L_0x0d19;
                default: goto L_0x000d;
            }
        L_0x000d:
            r2 = 0
            X.0qQ.A0B(r3, r2)
            java.lang.Object r2 = r1.A02
            X.0sK r2 = (X.0sK) r2
            java.lang.Object r6 = r2.invoke(r3, r0, r7)
            X.JQw r6 = (X.C59628JQw) r6
            X.0sP r5 = r6.Ay2()
            X.J6D r0 = X.J6D.A00
            r6.EUO(r0)
            java.lang.Object r4 = r1.A01
            X.0sP[] r4 = (X.0sP[]) r4
            int r3 = r4.length
            java.util.ArrayList r2 = X.DbS.A0v(r3)
            r1 = 0
        L_0x002e:
            if (r1 >= r3) goto L_0x003c
            r0 = r4[r1]
            java.lang.Object r0 = r0.invoke(r6)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x002e
        L_0x003c:
            r1 = 29
            X.J6L r0 = new X.J6L
            r0.<init>(r2, r1)
            java.lang.Object r0 = r0.invoke(r5)
            X.0sP r0 = (X.0sP) r0
            r6.EUO(r0)
            return r6
        L_0x004d:
            X.5Wy r0 = (X.C286575Wy) r0
            boolean r5 = X.C51972G9s.A1b(r7, r3)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0061
            r3 = -1953441351(0xffffffff8b90d9b9, float:-5.5794375E-32)
            java.lang.String r2 = "com.instagram.direct.fragment.recipientpicker.aistudio.AiRecipientPogRow.<anonymous> (AiStudioRecipientPickerScreen.kt:81)"
            X.0fL.A01(r3, r2)
        L_0x0061:
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            r3 = 1137180672(0x43c80000, float:400.0)
            r2 = 1120403456(0x42c80000, float:100.0)
            androidx.compose.ui.Modifier r11 = X.C287205Zk.A0G(r4, r3, r2)
            r6 = 0
            r2 = -1301569663(0xffffffffb26b9f81, float:-1.3715067E-8)
            r0.ExS(r2)
            java.lang.Object r4 = r1.A02
            X.62P r4 = (X.AnonymousClass62P) r4
            boolean r2 = r0.AGu(r4)
            java.lang.Object r3 = r1.A01
            X.0sP r3 = (X.0sP) r3
            boolean r2 = X.C51965G9l.A1Z(r0, r3, r2)
            java.lang.Object r1 = r0.ECw()
            if (r2 != 0) goto L_0x008c
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x0096
        L_0x008c:
            r2 = 48
            X.PqX r1 = new X.PqX
            r1.<init>((X.AnonymousClass62P) r4, (X.0sP) r3, (int) r2)
            r0.FLL(r1)
        L_0x0096:
            X.0sP r1 = (X.0sP) r1
            X.C51965G9l.A1X(r0, r5)
            r13 = 12582918(0xc00006, float:1.7632424E-38)
            r14 = 126(0x7e, float:1.77E-43)
            r7 = r6
            r8 = r6
            r9 = r0
            r10 = r6
            r12 = r1
            X.AnonymousClass6HY.A02(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 1360056332(0x5110d00c, float:3.8872859E10)
            goto L_0x0975
        L_0x00b3:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0D(r7)
            r2 = 16
            if (r3 != r2) goto L_0x00c3
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x00c3:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00d1
            r3 = -1414530935(0xffffffffabaff889, float:-1.250348E-12)
            java.lang.String r2 = "com.instagram.direct.fragment.recipientpicker.aistudio.IgdsPeopleCellItem.<anonymous> (AiStudioRecipientPickerScreen.kt:152)"
            X.0fL.A01(r3, r2)
        L_0x00d1:
            java.lang.Object r4 = r1.A02
            X.N4R r4 = (X.N4R) r4
            java.lang.Object r2 = r4.A02
            X.5Oz r2 = (X.C284945Oz) r2
            boolean r8 = X.C51971G9r.A1W(r2)
            r2 = -714150090(0xffffffffd56eef36, float:-1.64194482E13)
            r0.ExS(r2)
            java.lang.Object r3 = r1.A01
            boolean r2 = X.C51971G9r.A1U(r0, r3, r4)
            java.lang.Object r1 = r0.ECw()
            if (r2 != 0) goto L_0x00f3
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x00fd
        L_0x00f3:
            r2 = 49
            X.PqX r1 = new X.PqX
            r1.<init>((int) r2, (java.lang.Object) r3, (java.lang.Object) r4)
            r0.FLL(r1)
        L_0x00fd:
            X.0sP r1 = (X.0sP) r1
            X.C51965G9l.A1V(r0)
            r3 = 0
            r9 = 1
            r6 = 3072(0xc00, float:4.305E-42)
            r7 = 20
            r2 = r0
            r4 = r3
            r5 = r1
            X.HXJ.A00(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 1171689677(0x45d690cd, float:6866.1)
            goto L_0x0975
        L_0x0119:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0D(r7)
            r2 = 16
            if (r3 != r2) goto L_0x0129
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x0129:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0137
            r3 = 583742241(0x22cb3321, float:5.5077395E-18)
            java.lang.String r2 = "com.instagram.direct.privacy.threaddeletion.ui.ThreadDeletionFragment.ThreadList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ThreadDeletionFragment.kt:181)"
            X.0fL.A01(r3, r2)
        L_0x0137:
            java.lang.Object r4 = r1.A02
            X.H0f r4 = (X.C54136H0f) r4
            java.lang.Object r1 = r1.A01
            X.Nof r1 = (X.C69597Nof) r1
            X.MdG r1 = (X.C66824MdG) r1
            com.instagram.common.typedurl.ImageUrl r3 = r1.A00
            com.instagram.common.typedurl.ImageUrl r2 = r1.A01
            r1 = 0
            r4.A06(r0, r3, r2, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = -918393342(0xffffffffc9426e02, float:-796384.1)
            goto L_0x0975
        L_0x0154:
            X.3Nk r3 = (X.C240983Nk) r3
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.3s3 r7 = (X.C254173s3) r7
            X.AnonymousClass7TG.A1T(r3, r0, r7)
            java.lang.Object r2 = r1.A02
            X.HnE r2 = (X.C55779HnE) r2
            X.4GN r2 = r2.A01
            java.lang.Object r1 = r1.A01
            X.1Xj r1 = (X.1Xj) r1
            r2.DKG(r3, r7, r1, r0)
            goto L_0x0d28
        L_0x016c:
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            android.view.View r0 = (android.view.View) r0
            X.0iw r7 = (X.AnonymousClass0iw) r7
            X.AnonymousClass7TG.A1T(r3, r0, r7)
            java.lang.Object r4 = r1.A01
            X.41J r4 = (X.AnonymousClass41J) r4
            java.lang.Object r2 = r1.A02
            X.1Xj r2 = (X.1Xj) r2
            X.1Xy r1 = r2.A0C
            com.instagram.api.schemas.BoostUpsellBannerPayloadSchema r1 = r1.Ah4()
            if (r1 == 0) goto L_0x0196
            X.UzE r1 = X.C16678UzE.CTD_BOOST_UPSELL_POST_BANNER
            java.lang.String r8 = r1.toString()
        L_0x018b:
            r9 = 0
            r5 = r0
            r6 = r2
            r7 = r3
            r10 = r9
            r11 = r9
            r4.DaZ(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0d28
        L_0x0196:
            java.lang.String r8 = r7.getModuleName()
            goto L_0x018b
        L_0x019b:
            X.0sL r3 = (X.0sL) r3
            X.5Wy r0 = (X.C286575Wy) r0
            int r8 = X.AnonymousClass7TE.A0M(r7)
            r7 = 0
            X.0qQ.A0B(r3, r7)
            r2 = r8 & 6
            if (r2 != 0) goto L_0x01b0
            int r2 = X.C41848B3p.A01(r0, r3)
            r8 = r8 | r2
        L_0x01b0:
            r4 = r8 & 19
            r2 = 18
            if (r4 != r2) goto L_0x01bc
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x01bc:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x01ca
            r4 = -699994603(0xffffffffd646ee15, float:-5.4681464E13)
            java.lang.String r2 = "com.instagram.friendmap.view.compose.AudienceListSearchBar.<anonymous> (FriendMapAudienceListScreen.kt:86)"
            X.0fL.A01(r4, r2)
        L_0x01ca:
            java.lang.Object r4 = r1.A01
            X.4gU r4 = (X.C270284gU) r4
            java.lang.Object r2 = r4.getValue()
            X.GqG r2 = (X.C53545GqG) r2
            boolean r6 = r2.A06
            java.lang.Object r2 = r4.getValue()
            X.GqG r2 = (X.C53545GqG) r2
            boolean r5 = r2.A05
            r2 = 1055400616(0x3ee822a8, float:0.4533894)
            r0.ExS(r2)
            java.lang.Object r4 = r1.A02
            boolean r1 = r0.AGu(r4)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x01f4
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x01fe
        L_0x01f4:
            r1 = 25
            X.Inj r2 = new X.Inj
            r2.<init>(r4, r1)
            r0.FLL(r2)
        L_0x01fe:
            X.0sa r2 = (X.C62320sa) r2
            X.C51965G9l.A1X(r0, r7)
            int r1 = r8 << 6
            r1 = r1 & 896(0x380, float:1.256E-42)
            r7 = r0
            r8 = r2
            r9 = r3
            r10 = r1
            r11 = r6
            r12 = r5
            X.I6R.A05(r7, r8, r9, r10, r11, r12)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 585062133(0x22df56f5, float:6.053634E-18)
            goto L_0x0975
        L_0x021b:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0D(r7)
            r2 = 16
            if (r3 != r2) goto L_0x022b
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x022b:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0239
            r3 = 84393537(0x507be41, float:6.3826136E-36)
            java.lang.String r2 = "com.instagram.friendmap.view.compose.CustomAudienceUserList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FriendMapAudienceListScreen.kt:195)"
            X.0fL.A01(r3, r2)
        L_0x0239:
            r2 = -684990180(0xffffffffd72be11c, float:-1.88983326E14)
            r0.ExS(r2)
            java.lang.Object r4 = r1.A01
            boolean r2 = r0.AGu(r4)
            java.lang.Object r3 = r1.A02
            X.JwK r3 = (X.C61082JwK) r3
            boolean r1 = X.C51966G9m.A1U(r0, r3, r2)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0257
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0260
        L_0x0257:
            r1 = 42
            X.J6S r2 = X.J6S.A00(r4, r3, r1)
            r0.FLL(r2)
        L_0x0260:
            X.0sP r2 = (X.0sP) r2
            boolean r7 = X.C51968G9o.A1Y(r0)
            boolean r1 = r3.A01
            r4 = 0
            r8 = 28
            r3 = r0
            r5 = r4
            r6 = r2
            r9 = r1
            r10 = r7
            X.HXJ.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 1851026325(0x6e546b95, float:1.643522E28)
            goto L_0x0975
        L_0x027e:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0D(r7)
            r2 = 16
            if (r3 != r2) goto L_0x028e
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x028e:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x029c
            r3 = -136833758(0xfffffffff7d81522, float:-8.7653496E33)
            java.lang.String r2 = "com.instagram.friendmap.view.compose.FriendMapEmojiSelectorContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FriendMapEmojiSelectorContent.kt:126)"
            X.0fL.A01(r3, r2)
        L_0x029c:
            java.lang.Object r4 = r1.A01
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r1.A02
            X.0sP r3 = (X.0sP) r3
            androidx.compose.ui.Modifier r2 = X.C51969G9p.A0U()
            r1 = 384(0x180, float:5.38E-43)
            X.C56590I2u.A02(r0, r2, r4, r3, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 927187558(0x3743c266, float:1.1668168E-5)
            goto L_0x0975
        L_0x02b8:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0D(r7)
            r2 = 16
            if (r3 != r2) goto L_0x02c8
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x02c8:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x02d6
            r3 = 2125364219(0x7eae7bfb, float:1.1596471E38)
            java.lang.String r2 = "com.instagram.friendmap.view.compose.FriendMapEmojiSelectorContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FriendMapEmojiSelectorContent.kt:143)"
            X.0fL.A01(r3, r2)
        L_0x02d6:
            java.lang.Object r4 = r1.A01
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r1.A02
            X.0sP r3 = (X.0sP) r3
            androidx.compose.ui.Modifier r2 = X.C51969G9p.A0U()
            r1 = 384(0x180, float:5.38E-43)
            X.C56590I2u.A02(r0, r2, r4, r3, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 2080065551(0x7bfb480f, float:2.609456E36)
            goto L_0x0975
        L_0x02f2:
            X.5Wy r0 = (X.C286575Wy) r0
            boolean r2 = X.G9w.A1a(r7)
            if (r2 == 0) goto L_0x0302
            r3 = -1149826198(0xffffffffbb770b6a, float:-0.0037696012)
            java.lang.String r2 = "com.instagram.friendmap.view.compose.FriendMapSettingsScreen.<anonymous>.<anonymous> (FriendMapSettingsScreen.kt:148)"
            X.0fL.A01(r3, r2)
        L_0x0302:
            java.lang.Object r4 = r1.A02
            X.GqH r4 = (X.C53546GqH) r4
            r2 = 1634231394(0x61686462, float:2.6792987E20)
            r0.ExS(r2)
            java.lang.Object r3 = r1.A01
            boolean r1 = r0.AGw(r3)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x031c
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0326
        L_0x031c:
            r1 = 34
            X.Inj r2 = new X.Inj
            r2.<init>(r3, r1)
            r0.FLL(r2)
        L_0x0326:
            X.0sa r2 = (X.C62320sa) r2
            boolean r1 = X.C51968G9o.A1Y(r0)
            X.I51.A03(r0, r4, r2, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 609796911(0x2458c32f, float:4.700286E-17)
            goto L_0x0975
        L_0x033a:
            X.5Wy r0 = (X.C286575Wy) r0
            boolean r2 = X.G9w.A1a(r7)
            if (r2 == 0) goto L_0x034a
            r3 = -111046393(0xfffffffff9619107, float:-7.320052E34)
            java.lang.String r2 = "com.instagram.friendmap.view.compose.FriendMapSettingsScreen.<anonymous>.<anonymous> (FriendMapSettingsScreen.kt:152)"
            X.0fL.A01(r3, r2)
        L_0x034a:
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            r2 = 2131165196(0x7f07000c, float:1.7944602E38)
            r3 = 0
            float r2 = X.C287645aX.A01(r0, r2)
            r9 = 0
            androidx.compose.ui.Modifier r7 = X.C51967G9n.A0F(r4, r2)
            java.lang.Object r4 = r1.A02
            X.GqH r4 = (X.C53546GqH) r4
            java.lang.Object r2 = r1.A01
            X.5RD r6 = X.C51969G9p.A0Z(r0, r3)
            int r8 = X.C287425a7.A00(r0)
            r1 = r0
            X.5Wx r1 = (X.C286565Wx) r1
            X.5RM r5 = X.C286565Wx.A04(r1)
            androidx.compose.ui.Modifier r7 = X.C287435a8.A01(r0, r7)
            X.C51973G9u.A0y(r0, r1)
            X.C51971G9r.A12(r0, r6, r5)
            X.0sL r6 = X.C287485aD.A02
            boolean r5 = r1.A0K
            if (r5 != 0) goto L_0x0384
            boolean r5 = X.C51972G9s.A1Q(r0, r8)
            if (r5 != 0) goto L_0x0387
        L_0x0384:
            X.C51971G9r.A13(r0, r6, r8)
        L_0x0387:
            X.C51965G9l.A18(r0, r7)
            X.4A5 r7 = X.AnonymousClass4A5.MUTUAL_FOLLOWS
            r5 = -1338837887(0xffffffffb032f481, float:-6.5103484E-10)
            boolean r5 = X.C51967G9n.A1Z(r0, r2, r5)
            java.lang.Object r6 = r0.ECw()
            if (r5 != 0) goto L_0x039d
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r6 != r5) goto L_0x03a3
        L_0x039d:
            r5 = 15
            X.J6i r6 = X.C59100J6i.A01(r0, r2, r5)
        L_0x03a3:
            X.0sP r10 = X.C51965G9l.A0z(r1, r6)
            r11 = 6
            r12 = 4
            r6 = r0
            r8 = r4
            X.I51.A02(r6, r7, r8, r9, r10, r11, r12)
            X.4A5 r7 = X.AnonymousClass4A5.CLOSE_FRIENDS
            r5 = -1338830784(0xffffffffb0331040, float:-6.5142913E-10)
            boolean r6 = X.C51967G9n.A1Z(r0, r2, r5)
            java.lang.Object r5 = r0.ECw()
            if (r6 != 0) goto L_0x03c1
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r5 != r6) goto L_0x03cb
        L_0x03c1:
            r6 = 35
            X.Inj r5 = new X.Inj
            r5.<init>(r2, r6)
            r0.FLL(r5)
        L_0x03cb:
            X.0sa r9 = X.C51965G9l.A0y(r1, r5, r3)
            r5 = -1338832927(0xffffffffb03307e1, float:-6.513102E-10)
            boolean r5 = X.C51967G9n.A1Z(r0, r2, r5)
            java.lang.Object r6 = r0.ECw()
            if (r5 != 0) goto L_0x03e0
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r6 != r5) goto L_0x03e6
        L_0x03e0:
            r5 = 16
            X.J6i r6 = X.C59100J6i.A01(r0, r2, r5)
        L_0x03e6:
            X.0sP r10 = X.C51965G9l.A0z(r1, r6)
            r6 = r0
            r12 = r3
            X.I51.A02(r6, r7, r8, r9, r10, r11, r12)
            r5 = -1338829114(0xffffffffb03316c6, float:-6.5152184E-10)
            r0.ExS(r5)
            boolean r5 = r4.A06
            if (r5 == 0) goto L_0x0439
            X.4A5 r7 = X.AnonymousClass4A5.ALLOWLIST
            r5 = -1338822150(0xffffffffb03331fa, float:-6.519084E-10)
            boolean r6 = X.C51967G9n.A1Z(r0, r2, r5)
            java.lang.Object r5 = r0.ECw()
            if (r6 != 0) goto L_0x040c
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r5 != r6) goto L_0x0416
        L_0x040c:
            r6 = 36
            X.Inj r5 = new X.Inj
            r5.<init>(r2, r6)
            r0.FLL(r5)
        L_0x0416:
            X.0sa r9 = X.C51965G9l.A0y(r1, r5, r3)
            r5 = -1338824383(0xffffffffb0332941, float:-6.5178446E-10)
            boolean r5 = X.C51967G9n.A1Z(r0, r2, r5)
            java.lang.Object r6 = r0.ECw()
            if (r5 != 0) goto L_0x042b
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r6 != r5) goto L_0x0431
        L_0x042b:
            r5 = 17
            X.J6i r6 = X.C59100J6i.A01(r0, r2, r5)
        L_0x0431:
            X.0sP r10 = X.C51965G9l.A0z(r1, r6)
            r6 = r0
            X.I51.A02(r6, r7, r8, r9, r10, r11, r12)
        L_0x0439:
            X.C286565Wx.A0L(r1, r3)
            r5 = -1338819354(0xffffffffb0333ce6, float:-6.520636E-10)
            r0.ExS(r5)
            boolean r5 = r4.A05
            if (r5 == 0) goto L_0x0486
            X.4A5 r7 = X.AnonymousClass4A5.BLOCKLIST
            r5 = -1338812390(0xffffffffb033581a, float:-6.524502E-10)
            boolean r6 = X.C51967G9n.A1Z(r0, r2, r5)
            java.lang.Object r5 = r0.ECw()
            if (r6 != 0) goto L_0x0459
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r5 != r6) goto L_0x0463
        L_0x0459:
            r6 = 37
            X.Inj r5 = new X.Inj
            r5.<init>(r2, r6)
            r0.FLL(r5)
        L_0x0463:
            X.0sa r9 = X.C51965G9l.A0y(r1, r5, r3)
            r5 = -1338814623(0xffffffffb0334f61, float:-6.5232625E-10)
            boolean r5 = X.C51967G9n.A1Z(r0, r2, r5)
            java.lang.Object r6 = r0.ECw()
            if (r5 != 0) goto L_0x0478
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r6 != r5) goto L_0x047e
        L_0x0478:
            r5 = 18
            X.J6i r6 = X.C59100J6i.A01(r0, r2, r5)
        L_0x047e:
            X.0sP r10 = X.C51965G9l.A0z(r1, r6)
            r6 = r0
            X.I51.A02(r6, r7, r8, r9, r10, r11, r12)
        L_0x0486:
            boolean r0 = X.C51971G9r.A1S(r0, r1, r3)
            if (r0 == 0) goto L_0x0d28
            r0 = -1034759371(0xffffffffc252d335, float:-52.706257)
            goto L_0x0975
        L_0x0491:
            boolean r0 = X.AnonymousClass7TE.A1a(r3)
            if (r0 == 0) goto L_0x049e
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            goto L_0x0d28
        L_0x049e:
            java.lang.Object r0 = r1.A02
            X.C51965G9l.A1W(r0, r7)
            goto L_0x0d28
        L_0x04a5:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0E(r7)
            r2 = 16
            if (r3 != r2) goto L_0x04b5
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x04b5:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x04c3
            r3 = 2100539773(0x7d33b17d, float:1.4928336E37)
            java.lang.String r2 = "com.instagram.invite.view.ContactList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InviteContactContent.kt:174)"
            X.0fL.A01(r3, r2)
        L_0x04c3:
            java.lang.Object r2 = r1.A01
            X.Gn4 r2 = (X.C53374Gn4) r2
            java.lang.String r3 = r2.A02
            java.lang.Object r2 = r1.A02
            X.GS7 r2 = (X.GS7) r2
            r1 = 0
            X.I6S.A03(r0, r2, r3, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 1377724680(0x521e6908, float:1.70091741E11)
            goto L_0x0975
        L_0x04dc:
            X.5Wy r0 = (X.C286575Wy) r0
            boolean r2 = X.G9w.A1a(r7)
            if (r2 == 0) goto L_0x04ec
            r3 = -299312853(0xffffffffee28d92b, float:-1.3064005E28)
            java.lang.String r2 = "com.instagram.invite.view.InviteContactContent.<anonymous>.<anonymous>.<anonymous> (InviteContactContent.kt:96)"
            X.0fL.A01(r3, r2)
        L_0x04ec:
            java.lang.Object r2 = r1.A02
            X.62P r2 = (X.AnonymousClass62P) r2
            java.lang.Object r3 = r1.A01
            android.view.View r3 = (android.view.View) r3
            r5 = 0
            r9 = 0
            r7 = 3144(0xc48, float:4.406E-42)
            r8 = 20
            r4 = r0
            r6 = r2
            r10 = r9
            X.HZZ.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 1334310437(0x4f87f625, float:4.562111E9)
            goto L_0x0975
        L_0x050b:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0E(r7)
            r2 = 16
            if (r3 != r2) goto L_0x051b
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x051b:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0529
            r3 = 1131083653(0x436af785, float:234.96687)
            java.lang.String r2 = "com.instagram.newsfeed.fragment.ActivityFeed.<anonymous>.<anonymous>.<anonymous> (NewsfeedYouComposeFragment.kt:979)"
            X.0fL.A01(r3, r2)
        L_0x0529:
            java.lang.Object r3 = r1.A01
            X.4UC r3 = (X.AnonymousClass4UC) r3
            java.lang.Object r2 = r1.A02
            X.2bv r2 = (X.2bv) r2
            r1 = 0
            X.I30.A01(r0, r2, r3, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 150542828(0x8f919ec, float:1.4992237E-33)
            goto L_0x0975
        L_0x0540:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0D(r7)
            r2 = 16
            if (r3 != r2) goto L_0x0550
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x0550:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x055e
            r3 = 846779533(0x3278d48d, float:1.4483828E-8)
            java.lang.String r2 = "com.instagram.opal.impl.ui.OpalAudienceSelectorContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OpalAudienceSelectorFragment.kt:339)"
            X.0fL.A01(r3, r2)
        L_0x055e:
            r2 = -1414337656(0xffffffffabb2eb88, float:-1.2713034E-12)
            r0.ExS(r2)
            java.lang.Object r4 = r1.A01
            boolean r2 = r0.AGu(r4)
            java.lang.Object r3 = r1.A02
            X.JOQ r3 = (X.JOQ) r3
            boolean r1 = X.C51966G9m.A1U(r0, r3, r2)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x057c
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x0586
        L_0x057c:
            r1 = 39
            X.MPB r2 = new X.MPB
            r2.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r3)
            r0.FLL(r2)
        L_0x0586:
            X.0sP r2 = (X.0sP) r2
            boolean r6 = X.C51968G9o.A1Y(r0)
            X.GqO r3 = (X.C53553GqO) r3
            com.instagram.opal.impl.data.OpalAudienceSelectorRepository$OpalAudience r1 = r3.A00
            boolean r1 = r1.A05
            r4 = 0
            r7 = 4
            r3 = r0
            r5 = r2
            r8 = r1
            X.C56328Hwf.A00(r3, r4, r5, r6, r7, r8)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 381268933(0x16b9b3c5, float:3.0001813E-25)
            goto L_0x0975
        L_0x05a5:
            java.lang.String r3 = (java.lang.String) r3
            int r8 = X.AnonymousClass7TE.A0M(r0)
            X.HLK r7 = (X.HLK) r7
            r6 = 0
            X.0qQ.A0B(r3, r6)
            r0 = 2
            r5 = 1
            X.0qQ.A0B(r7, r0)
            java.lang.Object r9 = r1.A02
            X.EO2 r9 = (X.EO2) r9
            android.view.MotionEvent r4 = r9.A00
            r15 = 0
            if (r4 == 0) goto L_0x0601
            java.lang.Object r2 = r1.A01
            android.view.View r2 = (android.view.View) r2
            com.instagram.common.session.UserSession r0 = r9.A07()
            X.1Xj r1 = X.DbV.A0U(r0, r3)
            if (r1 == 0) goto L_0x0601
            if (r2 == 0) goto L_0x0601
            X.2uE r0 = r9.A01
            if (r0 != 0) goto L_0x05dd
            java.lang.String r0 = "peekMediaController"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x05dd:
            r0.Dsa(r4, r2, r1, r8)
            int r0 = r7.ordinal()
            if (r0 == r6) goto L_0x0605
            if (r0 != r5) goto L_0x0608
            java.lang.String r12 = "reel_media"
        L_0x05ea:
            r0 = 3532(0xdcc, float:4.95E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r0)
            java.lang.String r13 = X.EO2.A01(r9)
            java.lang.String r14 = r9.A05
            if (r14 != 0) goto L_0x05fa
            java.lang.String r14 = ""
        L_0x05fa:
            com.instagram.common.session.UserSession r10 = r9.A07()
            X.C49049EoT.A00(r9, r10, r11, r12, r13, r14, r15)
        L_0x0601:
            r9.A00 = r15
            goto L_0x0d28
        L_0x0605:
            java.lang.String r12 = "post_media"
            goto L_0x05ea
        L_0x0608:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x060d:
            X.0sL r3 = (X.0sL) r3
            X.5Wy r0 = (X.C286575Wy) r0
            int r17 = X.AnonymousClass7TE.A0M(r7)
            r5 = 0
            X.0qQ.A0B(r3, r5)
            r2 = r17 & 14
            if (r2 != 0) goto L_0x0623
            int r2 = X.C41848B3p.A01(r0, r3)
            r17 = r17 | r2
        L_0x0623:
            r4 = r17 & 91
            r2 = 18
            if (r4 != r2) goto L_0x062f
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x062f:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x063d
            r4 = -1741291242(0xffffffff98360116, float:-2.3523497E-24)
            java.lang.String r2 = "com.instagram.potato.reply.PotatoReplySheetFormField.<anonymous> (PotatoReplySheetFormField.kt:53)"
            X.0fL.A01(r4, r2)
        L_0x063d:
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
            long r6 = X.C51966G9m.A0C(r0)
            X.AnonymousClass5aQ.A02(r0)
            X.5ZQ r2 = X.AnonymousClass5ZM.A02
            androidx.compose.ui.Modifier r6 = X.C304766Fd.A01(r8, r2, r6)
            r4 = 1110441984(0x42300000, float:44.0)
            r2 = 2143289344(0x7fc00000, float:NaN)
            androidx.compose.ui.Modifier r2 = X.C287205Zk.A0I(r6, r2, r4, r2, r2)
            androidx.compose.ui.Modifier r9 = X.C287195Zj.A05(r2)
            androidx.compose.ui.Alignment r2 = X.C287215Zl.A0B
            java.lang.Object r6 = r1.A02
            X.5Oz r6 = (X.C284945Oz) r6
            java.lang.Object r7 = r1.A01
            X.5RD r10 = X.C287675aa.A00(r2, r5)
            int r13 = X.C287425a7.A00(r0)
            r4 = r0
            X.5Wx r4 = (X.C286565Wx) r4
            X.5RM r1 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r9 = X.C287435a8.A01(r0, r9)
            X.0sa r12 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r4, r12)
            X.0sL r11 = X.C287485aD.A03
            X.0sL r16 = X.C51969G9p.A0w(r0, r10, r1, r11)
            X.0sL r10 = X.C287485aD.A02
            boolean r1 = r4.A0K
            if (r1 != 0) goto L_0x068a
            boolean r1 = X.C51972G9s.A1Q(r0, r13)
            if (r1 != 0) goto L_0x068d
        L_0x068a:
            X.C51971G9r.A13(r0, r10, r13)
        L_0x068d:
            X.0sL r9 = X.C51966G9m.A1K(r0, r9)
            X.5dj r13 = X.C289515dj.A00
            r1 = -1649819391(0xffffffff9da9c101, float:-4.493349E-21)
            r0.ExS(r1)
            java.lang.String r1 = X.C51966G9m.A1A(r6)
            int r1 = r1.length()
            if (r1 != 0) goto L_0x06b5
            androidx.compose.ui.Modifier r15 = r13.AAz(r2, r8)
            r1 = 2131969710(0x7f1346ae, float:1.957635E38)
            java.lang.String r14 = X.C288035bG.A00(r0, r1)
            long r1 = X.C51966G9m.A0M(r0)
            X.AnonymousClass5ZZ.A0f(r0, r15, r14, r1)
        L_0x06b5:
            X.C286565Wx.A0L(r4, r5)
            r1 = r17 & 14
            X.C51967G9n.A1P(r0, r3, r1)
            androidx.compose.ui.Alignment r1 = X.C287215Zl.A0A
            androidx.compose.ui.Modifier r2 = r13.AAz(r1, r8)
            X.5RD r1 = X.C51966G9m.A0a(r5)
            int r8 = X.C287425a7.A00(r0)
            X.5RM r3 = X.C286565Wx.A04(r4)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r0, r2)
            X.C51973G9u.A0z(r0, r4, r12)
            X.C287595aO.A00(r0, r1, r11)
            r1 = r16
            boolean r1 = X.C51965G9l.A1Y(r0, r4, r3, r1)
            if (r1 != 0) goto L_0x06e7
            boolean r1 = X.C51972G9s.A1Q(r0, r8)
            if (r1 != 0) goto L_0x06ea
        L_0x06e7:
            X.C51971G9r.A13(r0, r10, r8)
        L_0x06ea:
            X.C287595aO.A00(r0, r2, r9)
            java.lang.String r1 = X.C51966G9m.A1A(r6)
            int r1 = r1.length()
            boolean r3 = X.AnonymousClass7TF.A1R(r1)
            r1 = -714671534(0xffffffffd566fa52, float:-1.58726745E13)
            boolean r2 = X.C51967G9n.A1Y(r0, r7, r1)
            java.lang.Object r1 = r0.ECw()
            if (r2 != 0) goto L_0x070a
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x0714
        L_0x070a:
            r2 = 16
            X.MJ4 r1 = new X.MJ4
            r1.<init>(r2, r7, r6)
            r0.FLL(r1)
        L_0x0714:
            X.0sa r1 = X.C51965G9l.A0y(r4, r1, r5)
            X.C56332Hwj.A01(r0, r1, r5, r5, r3)
            boolean r0 = X.C51971G9r.A1R(r0)
            if (r0 == 0) goto L_0x0d28
            r0 = -388439904(0xffffffffe8d8e0a0, float:-8.193398E24)
            goto L_0x0975
        L_0x0726:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0D(r7)
            r2 = 16
            if (r3 != r2) goto L_0x0736
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x0736:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0744
            r3 = -1004717258(0xffffffffc41d3b36, float:-628.9252)
            java.lang.String r2 = "com.instagram.settings2.core.view.SettingsScreen.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:61)"
            X.0fL.A01(r3, r2)
        L_0x0744:
            java.lang.Object r2 = r1.A02
            X.GnT r2 = (X.C53396GnT) r2
            java.lang.Object r3 = r2.A03
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r1.A01
            X.0sP r2 = (X.0sP) r2
            r1 = 0
            X.C52744Gbw.A05(r0, r3, r2, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = -1942993884(0xffffffff8c304424, float:-1.3579052E-31)
            goto L_0x0975
        L_0x075f:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0D(r7)
            r2 = 16
            if (r3 != r2) goto L_0x076f
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x076f:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x077d
            r3 = -475177403(0xffffffffe3ad5e45, float:-6.396159E21)
            java.lang.String r2 = "com.instagram.settings2.core.view.SettingsScreen.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:65)"
            X.0fL.A01(r3, r2)
        L_0x077d:
            java.lang.Object r2 = r1.A02
            X.GnT r2 = (X.C53396GnT) r2
            java.lang.String r5 = r2.A06
            r2 = 2131972797(0x7f1352bd, float:1.9582612E38)
            java.lang.String r11 = X.C304346Dc.A00(r0, r2)
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            r6 = 0
            androidx.compose.ui.Modifier r3 = X.C51966G9m.A0T(r2)
            r2 = 1108344832(0x42100000, float:36.0)
            androidx.compose.ui.Modifier r4 = X.C287205Zk.A05(r3, r2)
            r3 = 1098907648(0x41800000, float:16.0)
            r2 = 1092616192(0x41200000, float:10.0)
            androidx.compose.ui.Modifier r8 = X.C287195Zj.A0B(r4, r3, r2, r3, r2)
            java.lang.Object r1 = r1.A01
            X.0sP r1 = (X.0sP) r1
            r13 = 384(0x180, float:5.38E-43)
            r14 = 48
            r7 = r0
            r9 = r6
            r10 = r5
            r12 = r1
            X.C52751Gc3.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 668998842(0x27e01cba, float:6.2203635E-15)
            goto L_0x0975
        L_0x07b9:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0D(r7)
            r2 = 16
            if (r3 != r2) goto L_0x07c9
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x07c9:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x07d7
            r3 = -1076178607(0xffffffffbfdad151, float:-1.7095128)
            java.lang.String r2 = "com.instagram.settings2.core.view.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:114)"
            X.0fL.A01(r3, r2)
        L_0x07d7:
            java.lang.Object r2 = r1.A02
            X.JwC r2 = (X.C61074JwC) r2
            java.lang.Object r3 = r2.A02
            X.XRY r3 = (X.XRY) r3
            java.lang.Object r2 = r1.A01
            X.JwL r2 = (X.C61083JwL) r2
            r1 = 0
            X.C52741Gbt.A00(r0, r2, r3, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 1955941700(0x74954d44, float:9.463127E31)
            goto L_0x0975
        L_0x07f2:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0D(r7)
            r2 = 16
            if (r3 != r2) goto L_0x0802
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x0802:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0810
            r3 = -60597108(0xfffffffffc635c8c, float:-4.722114E36)
            java.lang.String r2 = "com.instagram.settings2.core.view.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:174)"
            X.0fL.A01(r3, r2)
        L_0x0810:
            java.lang.Object r4 = r1.A01
            X.JwL r4 = (X.C61083JwL) r4
            r3 = 0
            java.lang.Object r2 = r1.A02
            X.0sP r2 = (X.0sP) r2
            r1 = 48
            X.C52744Gbw.A01(r0, r4, r2, r1, r3)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = 608962710(0x244c0896, float:4.424272E-17)
            goto L_0x0975
        L_0x0829:
            com.instagram.model.shopping.productfeed.ProductTileMedia r3 = (com.instagram.model.shopping.productfeed.ProductTileMedia) r3
            X.C51965G9l.A1U(r7)
            if (r3 == 0) goto L_0x0848
            java.lang.String r2 = r3.A02
        L_0x0832:
            java.lang.Object r0 = r1.A01
            com.instagram.model.shopping.productfeed.ProductFeedItem r0 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r0
            java.lang.String r0 = r0.getId()
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x0d28
            java.lang.Object r0 = r1.A02
            X.UAP r0 = (X.UAP) r0
            r0.A00 = r3
            goto L_0x0d28
        L_0x0848:
            r2 = 0
            goto L_0x0832
        L_0x084a:
            X.4Yx r3 = (X.C266444Yx) r3
            X.4Yx r0 = (X.C266444Yx) r0
            r2 = 2
            X.0qQ.A0B(r7, r2)
            java.lang.Object r6 = r1.A02
            java.lang.Object r1 = r1.A01
            X.UOF r1 = (X.UOF) r1
            X.3uh r5 = r1.A01
            X.0qQ.A0B(r5, r2)
            if (r3 == 0) goto L_0x0d28
            r1 = 3
            X.JdR r4 = new X.JdR
            r4.<init>(r1, r7, r6, r5)
            java.util.List r2 = r3.A00
            X.HiD r1 = new X.HiD
            r1.<init>(r4)
            r2.add(r1)
            if (r0 == 0) goto L_0x0d28
            r1 = 5
            X.JdP r2 = new X.JdP
            r2.<init>(r1, r5, r6)
            java.util.List r1 = r0.A00
            X.HiD r0 = new X.HiD
            r0.<init>(r2)
            r1.add(r0)
            goto L_0x0d28
        L_0x0883:
            X.5Wy r0 = (X.C286575Wy) r0
            int r2 = X.AnonymousClass7TE.A0M(r7)
            r7 = 0
            X.0qQ.A0B(r3, r7)
            r3 = r2 & 81
            r2 = 16
            if (r3 != r2) goto L_0x0899
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x0899:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x08a7
            r3 = -1827174437(0xffffffff931787db, float:-1.9125861E-27)
            java.lang.String r2 = "com.instagram.user.userlist.ui.LikesListScreen.<anonymous>.<anonymous>.<anonymous> (LikesListComposeFragment.kt:296)"
            X.0fL.A01(r3, r2)
        L_0x08a7:
            java.lang.Object r3 = r1.A02
            X.Drt r3 = (X.C47178Drt) r3
            boolean r2 = r3.A0B
            r6 = 0
            if (r2 == 0) goto L_0x08b2
            r6 = 1090519040(0x41000000, float:8.0)
        L_0x08b2:
            java.lang.String r5 = r3.A07
            java.lang.Object r4 = r1.A01
            X.0sP r4 = (X.0sP) r4
            X.5Qk r1 = androidx.compose.ui.Modifier.A00
            r8 = 0
            androidx.compose.ui.Modifier r3 = X.C51966G9m.A0T(r1)
            r2 = 1098907648(0x41800000, float:16.0)
            r1 = 0
            androidx.compose.ui.Modifier r10 = X.C287195Zj.A0B(r3, r2, r6, r2, r1)
            r1 = 2131972797(0x7f1352bd, float:1.9582612E38)
            java.lang.String r13 = X.C288035bG.A00(r0, r1)
            r16 = 48
            r9 = r0
            r11 = r8
            r12 = r5
            r14 = r4
            r15 = r7
            X.C52751Gc3.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = -1777724683(0xffffffff960a12f5, float:-1.1153533E-25)
            goto L_0x0975
        L_0x08e2:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0E(r7)
            r2 = 16
            if (r3 != r2) goto L_0x08f2
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x08f2:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0900
            r3 = -710511898(0xffffffffd5a672e6, float:-2.28765519E13)
            java.lang.String r2 = "com.instagram.user.userlist.ui.LikesListScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LikesListComposeFragment.kt:317)"
            X.0fL.A01(r3, r2)
        L_0x0900:
            java.lang.Object r3 = r1.A01
            X.F3m r3 = (X.C49723F3m) r3
            java.lang.Object r2 = r1.A02
            X.0sa r2 = (X.C62320sa) r2
            r1 = 8
            X.C56670I6z.A05(r0, r3, r2, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = -1588930814(0xffffffffa14ad702, float:-6.8724823E-19)
            goto L_0x0975
        L_0x0917:
            X.5Wy r0 = (X.C286575Wy) r0
            int r3 = X.C51968G9o.A0D(r7)
            r2 = 16
            if (r3 != r2) goto L_0x0927
            boolean r2 = r0.Bwn()
            if (r2 != 0) goto L_0x094b
        L_0x0927:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0935
            r3 = -1916230311(0xffffffff8dc8a559, float:-1.2365758E-30)
            java.lang.String r2 = "com.instagram.wonderwall.ui.compose.screens.WallFeedStaggeredGrid.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WallFeedScreen.kt:117)"
            X.0fL.A01(r3, r2)
        L_0x0935:
            java.lang.Object r3 = r1.A02
            com.instagram.wonderwall.model.WallInfo r3 = (com.instagram.wonderwall.model.WallInfo) r3
            java.lang.Object r2 = r1.A01
            X.Ghf r2 = (X.C53047Ghf) r2
            r1 = 0
            X.C56355Hx6.A00(r0, r3, r2, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = -2057048635(0xffffffff8563edc5, float:-1.071716E-35)
            goto L_0x0975
        L_0x094b:
            r0.Evl()
            goto L_0x0d28
        L_0x0950:
            X.5Wy r0 = (X.C286575Wy) r0
            boolean r2 = X.G9w.A1a(r7)
            if (r2 == 0) goto L_0x0960
            r3 = 389364397(0x17353aad, float:5.8558313E-25)
            java.lang.String r2 = "com.instagram.wonderwall.ui.compose.screens.WallFeedStaggeredGrid.<anonymous>.<anonymous> (WallFeedScreen.kt:146)"
            X.0fL.A01(r3, r2)
        L_0x0960:
            java.lang.Object r3 = r1.A02
            com.instagram.wonderwall.model.WallInfo r3 = (com.instagram.wonderwall.model.WallInfo) r3
            java.lang.Object r2 = r1.A01
            X.Ghf r2 = (X.C53047Ghf) r2
            r1 = 0
            X.C56355Hx6.A01(r0, r3, r2, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d28
            r0 = -922060093(0xffffffffc90a7ac3, float:-567212.2)
        L_0x0975:
            X.0fL.A00(r0)
            goto L_0x0d28
        L_0x097a:
            X.Hrm r3 = (X.C56039Hrm) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r2 = r1.A01
            if (r2 == 0) goto L_0x0990
            r0 = 12
            X.IwH r2 = X.C58708IwH.A01(r2, r0)
            X.Vcq r0 = r3.A00
            if (r0 == 0) goto L_0x09b1
            r0.A00 = r2
        L_0x0990:
            java.lang.Object r1 = r1.A02
            r0 = 27
            X.Ivx r3 = X.C58688Ivx.A00(r1, r3, r0)
            java.lang.String r0 = "IMPLEMENTATION"
            java.lang.Class<X.HtH> r1 = X.C56129HtH.class
            X.HtH r0 = X.C250563lf.A0B(r0)
            X.0eP[] r2 = X.DbW.A1b(r1, r0)
            java.lang.Object r1 = r3.invoke()
            X.3mp r1 = (X.C251263mp) r1
            r0 = 0
            X.9d7 r6 = new X.9d7
            r6.<init>(r1, r2, r0)
            return r6
        L_0x09b1:
            java.lang.String r1 = "Can't add lifecycle callbacks outside the Screen's content callback"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x09b9:
            X.2WF r3 = (X.AnonymousClass2WF) r3
            com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView r0 = (com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView) r0
            X.HPk r7 = (X.C54705HPk) r7
            r10 = 0
            boolean r9 = X.AnonymousClass7TF.A1U(r10, r3, r0)
            java.lang.Object r6 = r1.A02
            X.GTj r6 = (X.C52457GTj) r6
            android.content.Context r2 = r3.A00()
            android.app.Activity r15 = X.C52457GTj.A00(r2, r6)
            java.util.Map r2 = r6.A08
            r28 = r2
            java.lang.String r2 = r6.A07
            r27 = r2
            r3 = r28
            java.lang.Object r2 = r3.get(r2)
            X.GDy r2 = (X.C52078GDy) r2
            if (r2 == 0) goto L_0x09e4
            r2.A06 = r9
        L_0x09e4:
            X.3OA r8 = r6.A05
            boolean r2 = r8.A07()
            r5 = 0
            if (r2 == 0) goto L_0x0b90
            com.instagram.common.session.UserSession r4 = r6.A03
            X.2nI r13 = r6.A02
            java.lang.Object r1 = r1.A01
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Object r1 = r1.A03
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            if (r1 == 0) goto L_0x0b8d
            java.lang.Object r12 = r1.get()
            X.6Rm r12 = (X.C307786Rm) r12
        L_0x0a01:
            X.1Xj r1 = r6.A04
            if (r1 == 0) goto L_0x0b7d
            boolean r1 = r1.CeS()
            if (r1 != r9) goto L_0x0b7d
        L_0x0a0b:
            r17 = 1
        L_0x0a0d:
            X.Hk9 r1 = r6.A00
            if (r1 == 0) goto L_0x0b79
            X.JQA r1 = r1.A00
            r26 = r1
        L_0x0a15:
            X.6Q5 r11 = r6.A01
            X.AnonymousClass7TF.A1C(r4, r9, r13)
            com.instagram.showreelnative.ui.common.ShowreelNativeMediaView r1 = r0.A03
            if (r1 == 0) goto L_0x0a3d
            r0.removeView(r1)
            r0.A03 = r5
            r0.A05 = r5
            if (r17 == 0) goto L_0x0a3d
            X.0Tu r3 = X.0Tu.A05
            r1 = 36315769556438554(0x81050000280e1a, double:3.0295771271338036E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0a3d
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A01
            if (r1 == 0) goto L_0x0a3d
            r0.removeView(r1)
            r0.A01 = r5
        L_0x0a3d:
            X.0Tu r3 = X.0Tu.A05
            r1 = 36315769555521037(0x810500001a0e0d, double:3.029577126553562E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0a4d
            r0.setVisibility(r10)
        L_0x0a4d:
            X.0Tu r14 = X.0Tu.A06
            r1 = 2342155883962172735(0x2081025e0028053f, double:4.059544271365515E-152)
            boolean r16 = X.182.A06(r14, r4, r1)
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r1 = r0.A02
            if (r1 != 0) goto L_0x0b29
            if (r15 == 0) goto L_0x0b61
            r1 = 36315593460157856(0x8104d700000da0, double:3.0294657631368074E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0b61
            if (r16 != 0) goto L_0x0b6e
            r14 = 2131629405(0x7f0e155d, float:1.888613E38)
            android.view.LayoutInflater r15 = r15.getLayoutInflater()
            X.0qQ.A07(r15)
            r2 = -1
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r2, r2)
            android.view.View r2 = X.2Su.A00(r15, r1, r5, r14)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.sponsored.serverrendered.IgShowreelView"
            X.0qQ.A0C(r2, r1)
            com.instagram.sponsored.serverrendered.IgShowreelView r2 = (com.instagram.sponsored.serverrendered.IgShowreelView) r2
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r14 = r2.A00
        L_0x0a88:
            r0.A02 = r14
            if (r14 == 0) goto L_0x0adc
            r0.addView(r14)
            r15 = 17
            r2 = -1
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r2, r2, r15)
            r14.setLayoutParams(r1)
            if (r11 == 0) goto L_0x0aa3
            X.JSn r1 = r14.getCompositionController()
            r1.ClL(r11)
        L_0x0aa3:
            java.lang.String r11 = r8.A0S
            java.lang.String r2 = r8.A0j
            X.6Q6 r1 = new X.6Q6
            r1.<init>(r11, r2)
            X.6Nn r11 = new X.6Nn
            r18 = r11
            r19 = r1
            r20 = r10
            r21 = r10
            r22 = r9
            r23 = r10
            r18.<init>(r19, r20, r21, r22, r23)
            java.lang.String r9 = "Required value was null."
            if (r16 == 0) goto L_0x0b47
            X.3xj r1 = r8.A06
            if (r1 == 0) goto L_0x0c19
            com.instagram.model.showreel.IgShowreelComposition r20 = r1.Bw9()
            if (r20 == 0) goto L_0x0c19
            r22 = r13
            r23 = r5
            r24 = r7
            r25 = r12
            r18 = r14
            r19 = r4
            r21 = r11
            r18.setShowreelAnimation(r19, r20, r21, r22, r23, r24, r25)
        L_0x0adc:
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r2 = r0.A02
            if (r2 == 0) goto L_0x0ae4
            r1 = r26
            r2.A02 = r1
        L_0x0ae4:
            if (r17 == 0) goto L_0x0b06
            r1 = 36315769556438554(0x81050000280e1a, double:3.0295771271338036E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0b06
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = new com.instagram.common.ui.widget.imageview.IgImageView
            r2.<init>(r1)
            boolean r1 = X.1KU.A07(r4)
            X.GIB.A00(r2, r1)
            r0.A01 = r2
            r0.addView(r2)
        L_0x0b06:
            r1 = 36313699379710148(0x81031e000208c4, double:3.028267939034827E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0b29
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r1 = r0.A02
            if (r1 == 0) goto L_0x0b29
            android.view.ViewParent r1 = r1.getParent()
            boolean r1 = X.0qQ.A0K(r1, r0)
            if (r1 != 0) goto L_0x0b29
            X.0wj r3 = X.0wj.A01
            r2 = 817894062(0x30c012ae, float:1.3975148E-9)
            java.lang.String r1 = "not attached view detected"
            X.DbT.A1Q(r3, r1, r2)
        L_0x0b29:
            r2 = r28
            r1 = r27
            java.lang.Object r3 = r2.get(r1)
            X.GDy r3 = (X.C52078GDy) r3
            if (r3 == 0) goto L_0x0b3c
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r0.A01
            boolean r1 = r6.A09
            r3.A04(r2, r1)
        L_0x0b3c:
            r2 = 7
            X.Iw2 r1 = new X.Iw2
            r1.<init>(r2, r6, r0)
            X.3eI r6 = X.C51965G9l.A0f(r1)
            return r6
        L_0x0b47:
            r1 = 36315593460223393(0x8104d700010da1, double:3.029465763178253E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0adc
            X.3xj r1 = r8.A06
            if (r1 == 0) goto L_0x0c1e
            com.instagram.model.showreel.IgShowreelComposition r1 = r1.Bw9()
            if (r1 == 0) goto L_0x0c1e
            r14.setShowreelAnimation(r4, r1, r11, r13)
            goto L_0x0adc
        L_0x0b61:
            if (r16 != 0) goto L_0x0b6e
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r14 = new com.instagram.showreel.composition.ui.IgShowreelCompositionView
            r14.<init>(r1)
            goto L_0x0a88
        L_0x0b6e:
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            X.HEV r14 = new X.HEV
            r14.<init>(r1)
            goto L_0x0a88
        L_0x0b79:
            r26 = r5
            goto L_0x0a15
        L_0x0b7d:
            X.3y4 r1 = r8.A0I
            if (r1 == 0) goto L_0x0b89
            X.XB5 r1 = r1.BUi()
            if (r1 == 0) goto L_0x0b89
            goto L_0x0a0b
        L_0x0b89:
            r17 = 0
            goto L_0x0a0d
        L_0x0b8d:
            r12 = r5
            goto L_0x0a01
        L_0x0b90:
            boolean r1 = r8.A08()
            if (r1 == 0) goto L_0x0bbf
            com.instagram.common.session.UserSession r3 = r6.A03
            X.3y4 r1 = r8.A0I
            if (r1 == 0) goto L_0x0ba4
            X.XB5 r1 = r1.BUi()
            r20 = 1
            if (r1 != 0) goto L_0x0ba6
        L_0x0ba4:
            r20 = 0
        L_0x0ba6:
            X.Hk9 r2 = r6.A00
            X.6Q5 r1 = r6.A01
            r14 = r0
            r16 = r2
            r17 = r1
            r18 = r3
            r19 = r8
            r14.A00(r15, r16, r17, r18, r19, r20)
            X.2nI r2 = r6.A02
            X.JQM r1 = r6.A06
            r0.setTransformation(r8, r3, r2, r1)
            goto L_0x0b29
        L_0x0bbf:
            boolean r1 = r8.A05()
            if (r1 == 0) goto L_0x0b29
            com.instagram.common.session.UserSession r3 = r6.A03
            boolean r1 = X.1KU.A07(r3)
            if (r1 == 0) goto L_0x0b29
            X.0qQ.A0B(r3, r10)
            com.instagram.showreelnative.ui.common.ShowreelNativeMediaView r2 = r0.A03
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r1 = r0.A02
            X.4cT[] r1 = new X.C267924cT[]{r2, r1}
            java.util.List r1 = X.0sr.A1P(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x0be0:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0bfb
            java.lang.Object r1 = r2.next()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0be0
            r0.removeView(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A01
            if (r1 == 0) goto L_0x0be0
            r0.removeView(r1)
            r0.A01 = r5
            goto L_0x0be0
        L_0x0bfb:
            r0.setVisibility(r10)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A01
            if (r1 != 0) goto L_0x0b29
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = new com.instagram.common.ui.widget.imageview.IgImageView
            r2.<init>(r1)
            boolean r1 = X.1KU.A07(r3)
            X.GIB.A00(r2, r1)
            r0.A01 = r2
            r0.addView(r2)
            goto L_0x0b29
        L_0x0c19:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0c1e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0c23:
            X.Gau r0 = (X.C52682Gau) r0
            X.6Sh r7 = (X.C307996Sh) r7
            r2 = 1
            int r6 = X.DbW.A02(r2, r0, r7)
            java.lang.Object r5 = r1.A02
            X.Gx4 r5 = (X.C53960Gx4) r5
            java.util.Map r3 = r5.A08
            java.lang.String r2 = r5.A06
            java.lang.Object r4 = r3.get(r2)
            X.GDy r4 = (X.C52078GDy) r4
            if (r4 == 0) goto L_0x0c44
            X.IZD r3 = r5.A04
            r2 = 0
            X.0qQ.A0B(r3, r2)
            r4.A04 = r3
        L_0x0c44:
            java.lang.Object r9 = r1.A01
            X.Hmt r9 = (X.C55758Hmt) r9
            java.util.concurrent.atomic.AtomicReference r1 = r9.A02
            r1.set(r7)
            java.lang.Object r8 = r7.A02
            X.6S6 r8 = (X.AnonymousClass6S6) r8
            if (r8 == 0) goto L_0x0c74
            X.6SE r3 = r8.A01
            if (r3 == 0) goto L_0x0c61
            X.6Rm r1 = r9.A00
            X.6Qd r2 = X.C307476Qg.A02(r1)
            r1 = -1
            r2.A0C(r3, r1)
        L_0x0c61:
            X.6SH r1 = r8.A00
            java.util.List r3 = r1.A02
            if (r3 == 0) goto L_0x0c74
            X.GY7 r2 = r9.A01
            monitor-enter(r2)
            java.util.List r1 = r2.A00     // Catch:{ all -> 0x0c70 }
            r1.removeAll(r3)     // Catch:{ all -> 0x0c70 }
            goto L_0x0c73
        L_0x0c70:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0c73:
            monitor-exit(r2)
        L_0x0c74:
            X.3dH r8 = r7.A01
            X.5uS r7 = r0.A01
            if (r7 == 0) goto L_0x0cbd
            X.3dH r1 = r7.A00
            boolean r1 = X.0qQ.A0K(r1, r8)
            if (r1 != 0) goto L_0x0cbd
            android.view.ViewTreeObserver r3 = r7.getViewTreeObserver()
            r2 = 3
            X.IDv r1 = new X.IDv
            r1.<init>(r2, r7, r0)
            r3.addOnGlobalLayoutListener(r1)
            X.IZD r1 = r0.A03
            if (r1 == 0) goto L_0x0cd4
            X.6LP r1 = r1.A00
            if (r1 == 0) goto L_0x0c9d
            r1.A08()
            r1.A04()
        L_0x0c9d:
            r7.setRenderTree(r8)
            if (r1 == 0) goto L_0x0ca8
            r1.A05()
            r1.A06()
        L_0x0ca8:
            X.IZD r1 = r0.A03
            if (r1 == 0) goto L_0x0cb3
            X.JQM r1 = r1.A03
            if (r1 == 0) goto L_0x0cb3
            r1.DO2()
        L_0x0cb3:
            int r1 = r0.A00
            if (r1 == r6) goto L_0x0cbd
            r0.A00 = r6
            r1 = 0
            r0.setBackground(r1)
        L_0x0cbd:
            X.IZD r0 = r5.A04
            X.JQM r0 = r0.A03
            if (r0 != 0) goto L_0x0cc8
            X.JSd r0 = r5.A05
            r0.Dym()
        L_0x0cc8:
            r1 = 44
            X.Ivl r0 = new X.Ivl
            r0.<init>(r4, r1)
            X.3eI r6 = X.C51965G9l.A0f(r0)
            return r6
        L_0x0cd4:
            r1 = 0
            goto L_0x0c9d
        L_0x0cd6:
            X.4um r3 = (X.C277274um) r3
            android.view.View r0 = (android.view.View) r0
            long r4 = X.AnonymousClass7TE.A0R(r7)
            X.AnonymousClass7TG.A1N(r3, r0)
            java.lang.Object r6 = r1.A02
            X.GJn r6 = (X.C52222GJn) r6
            r2 = 2131443698(0x7f0b3ff2, float:1.8509471E38)
            android.widget.TextView r9 = X.AnonymousClass7TG.A0R(r0, r2)
            java.lang.Object r10 = r1.A01
            X.3Y5 r10 = (X.AnonymousClass3Y5) r10
            r8 = 2131953385(0x7f1306e9, float:1.954324E38)
            long r6 = r6.A00
            r1 = 0
            X.5F4 r0 = new X.5F4
            r0.<init>(r1, r6)
            long r0 = X.C229632nm.A07(r0, r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = X.C244013aV.A0F(r10, r0, r8)
            r9.setText(r0)
            java.lang.CharSequence r0 = r9.getText()
            r9.setContentDescription(r0)
            X.GKi r0 = X.C52241GKi.A00
            X.4uo r6 = r3.A00(r0)
            return r6
        L_0x0d19:
            r2 = 0
            X.0qQ.A0B(r3, r2)
            java.lang.Object r2 = r1.A02
            X.HpI r2 = (X.C55897HpI) r2
            X.0sK r2 = r2.A0G
            java.lang.Object r1 = r1.A01
            r2.invoke(r3, r1, r0)
        L_0x0d28:
            X.0gF r6 = X.C60340gF.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JJS.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
