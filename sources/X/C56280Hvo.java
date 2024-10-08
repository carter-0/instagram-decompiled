package X;

/* renamed from: X.Hvo  reason: case insensitive filesystem */
public abstract class C56280Hvo {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        if (r3 == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if ((r62 & 16) != 0) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x04a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r55, X.C56547I1b r56, X.AnonymousClass3E6 r57, X.C52961GgE r58, X.C62320sa r59, X.0sP r60, int r61, int r62) {
        /*
            r7 = r58
            r24 = r60
            r8 = 0
            r58 = r57
            r57 = r59
            r1 = r57
            r0 = r58
            X.AnonymousClass7TF.A1B(r1, r8, r0)
            r34 = 3
            r59 = r56
            r1 = r59
            r0 = r34
            X.0qQ.A0B(r1, r0)
            r1 = 254330289(0xf28c5b1, float:8.3211135E-30)
            r0 = r55
            r0.ExV(r1)
            r55 = r62
            r1 = r62 & 1
            r14 = r61
            if (r1 == 0) goto L_0x050f
            r2 = r61 | 6
        L_0x002d:
            r4 = r62 & 2
            if (r4 == 0) goto L_0x0502
            r2 = r2 | 48
        L_0x0033:
            r1 = r62 & 4
            if (r1 == 0) goto L_0x04f5
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x0039:
            r1 = r62 & 8
            if (r1 == 0) goto L_0x04e8
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x003f:
            r1 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0052
            r1 = r62 & 16
            if (r1 != 0) goto L_0x004f
            boolean r3 = r0.AGw(r7)
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r3 != 0) goto L_0x0051
        L_0x004f:
            r1 = 8192(0x2000, float:1.14794E-41)
        L_0x0051:
            r2 = r2 | r1
        L_0x0052:
            r3 = r2 & 9363(0x2493, float:1.312E-41)
            r1 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r1) goto L_0x007f
            boolean r1 = r0.Bwn()
            if (r1 == 0) goto L_0x007f
            r0.Evl()
        L_0x0061:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x007e
            r56 = 11
            X.J9z r0 = new X.J9z
            r48 = r0
            r49 = r7
            r50 = r24
            r51 = r59
            r52 = r57
            r53 = r58
            r54 = r14
            r48.<init>(r49, r50, r51, r52, r53, r54, r55, r56)
            r1.A06 = r0
        L_0x007e:
            return
        L_0x007f:
            r0.Ewr()
            r1 = r61 & 1
            r9 = -57345(0xffffffffffff1fff, float:NaN)
            if (r1 == 0) goto L_0x04b2
            boolean r1 = r0.Aw3()
            if (r1 != 0) goto L_0x04b2
            r0.Evl()
            r1 = r62 & 16
            if (r1 == 0) goto L_0x0097
        L_0x0096:
            r2 = r2 & r9
        L_0x0097:
            boolean r1 = X.C51967G9n.A1S(r0)
            if (r1 == 0) goto L_0x00a5
            r3 = 1519662623(0x5a94361f, float:2.08589017E16)
            java.lang.String r1 = "com.instagram.creation.genai.memu.sticker.edit.MemuStickerEditScreen (MemuStickerEditScreen.kt:82)"
            X.0fL.A01(r3, r1)
        L_0x00a5:
            X.0eE r3 = X.AnonymousClass0t1.A01
            X.4bM r33 = X.C286955Yl.A00
            r1 = r33
            java.lang.Object r1 = r0.AJO(r1)
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            com.instagram.user.model.User r38 = r3.A01(r1)
            java.util.List r45 = X.AnonymousClass7TE.A1I(r38)
            com.instagram.api.schemas.StoryPromptType r37 = com.instagram.api.schemas.StoryPromptType.IMAGINE_ME
            r32 = 0
            java.lang.String r40 = ""
            java.lang.Integer r31 = X.AnonymousClass05K.A00
            com.instagram.reels.prompt.model.PromptStickerModel r30 = new com.instagram.reels.prompt.model.PromptStickerModel
            r35 = r30
            r36 = r32
            r39 = r31
            r41 = r40
            r42 = r32
            r43 = r32
            r44 = r32
            r46 = r8
            r47 = r8
            r48 = r8
            r49 = r8
            r50 = r8
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            r1 = 2131165213(0x7f07001d, float:1.7944637E38)
            float r29 = X.C287645aX.A01(r0, r1)
            r1 = 2131165226(0x7f07002a, float:1.7944663E38)
            float r28 = X.C287645aX.A01(r0, r1)
            r1 = 2131165213(0x7f07001d, float:1.7944637E38)
            float r27 = X.C287645aX.A01(r0, r1)
            r1 = 2131165205(0x7f070015, float:1.794462E38)
            float r26 = X.C287645aX.A01(r0, r1)
            r25 = 1073741824(0x40000000, float:2.0)
            float r26 = r26 / r25
            r1 = 2131165630(0x7f0701be, float:1.7945483E38)
            float r23 = X.C287645aX.A01(r0, r1)
            r1 = 2131165196(0x7f07000c, float:1.7944602E38)
            float r22 = X.C287645aX.A01(r0, r1)
            r1 = 2131165190(0x7f070006, float:1.794459E38)
            float r21 = X.C287645aX.A01(r0, r1)
            float r20 = X.C287645aX.A00(r0)
            r1 = 2131165218(0x7f070022, float:1.7944647E38)
            float r19 = X.C287645aX.A01(r0, r1)
            r49 = -16226561(0xffffffffff0866ff, double:NaN)
            r18 = 32
            long r49 = r49 << r18
            long r3 = X.AnonymousClass5RW.A01
            X.5Z4 r9 = X.C51966G9m.A0e(r0)
            r1 = 2131165213(0x7f07001d, float:1.7944637E38)
            float r3 = X.C287645aX.A01(r0, r1)
            r1 = 2131165217(0x7f070021, float:1.7944645E38)
            float r1 = X.C287645aX.A01(r0, r1)
            r51 = 0
            long r5 = A00(r0, r3)
            float r3 = r3 + r1
            long r3 = A00(r0, r3)
            X.5Z4 r43 = X.AnonymousClass5Z4.A00((X.C291805hu) null, (X.C289645dx) null, r9, (X.C268454dQ) null, (X.AnonymousClass5ZD) null, (X.C291825hw) null, 0, 0, 0, 16646141, 0, r5, 0, r3)
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            X.5RD r9 = X.C51966G9m.A0a(r8)
            int r6 = X.C287425a7.A00(r0)
            r3 = r0
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r1 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r0, r4)
            X.0sa r13 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r3, r13)
            X.0sL r12 = X.C287485aD.A03
            X.0sL r17 = X.C51969G9p.A0w(r0, r9, r1, r12)
            X.0sL r11 = X.C287485aD.A02
            boolean r1 = r3.A0K
            if (r1 != 0) goto L_0x0174
            boolean r1 = X.C51972G9s.A1Q(r0, r6)
            if (r1 != 0) goto L_0x0177
        L_0x0174:
            X.C51971G9r.A13(r0, r11, r6)
        L_0x0177:
            X.0sL r15 = X.C51966G9m.A1K(r0, r5)
            X.5dj r16 = X.C289515dj.A00
            androidx.compose.ui.Modifier r1 = X.C51966G9m.A0U(r4)
            X.5Yw r5 = X.AnonymousClass5aQ.A00(r0)
            long r5 = r5.A09
            androidx.compose.ui.Modifier r5 = X.C51966G9m.A0X(r1, r5)
            r1 = r58
            androidx.compose.ui.Modifier r5 = X.HY2.A00(r0, r5, r1)
            X.5Zr r10 = X.C287215Zl.A00
            X.5a0 r1 = X.C287275Zs.A02
            X.5RD r1 = X.C291495hO.A01(r1, r0, r10)
            int r9 = X.C287425a7.A00(r0)
            X.5RM r6 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r0, r5)
            X.C51973G9u.A0z(r0, r3, r13)
            X.C287595aO.A00(r0, r1, r12)
            r1 = r17
            boolean r1 = X.C51965G9l.A1Y(r0, r3, r6, r1)
            if (r1 != 0) goto L_0x01b9
            boolean r1 = X.C51972G9s.A1Q(r0, r9)
            if (r1 != 0) goto L_0x01bc
        L_0x01b9:
            X.C51971G9r.A13(r0, r11, r9)
        L_0x01bc:
            X.C287595aO.A00(r0, r5, r15)
            androidx.compose.ui.Alignment r1 = X.C287215Zl.A0C
            X.5RD r1 = X.C287675aa.A00(r1, r8)
            int r9 = X.C287425a7.A00(r0)
            X.5RM r6 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r0, r4)
            X.C51973G9u.A0z(r0, r3, r13)
            X.C287595aO.A00(r0, r1, r12)
            r1 = r17
            boolean r1 = X.C51965G9l.A1Y(r0, r3, r6, r1)
            if (r1 != 0) goto L_0x01e5
            boolean r1 = X.C51972G9s.A1Q(r0, r9)
            if (r1 != 0) goto L_0x01e8
        L_0x01e5:
            X.C51971G9r.A13(r0, r11, r9)
        L_0x01e8:
            X.C287595aO.A00(r0, r5, r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r1.intValue()
            r1 = 955502427(0x38f3cf5b, float:1.1625766E-4)
            boolean r1 = X.C51967G9n.A1U(r0, r1)
            if (r1 == 0) goto L_0x0203
            r5 = 190805486(0xb5f75ee, float:4.3036958E-32)
            java.lang.String r1 = "com.instagram.creation.genai.memu.sticker.edit.MemuStickerEditScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MemuStickerEditScreen.kt:122)"
            X.0fL.A01(r5, r1)
        L_0x0203:
            java.lang.String r46 = r7.A0E()
            X.4bM r1 = X.AnonymousClass5YA.A01
            X.4cd r6 = X.C51966G9m.A0j(r0, r1)
            float r25 = r25 * r27
            float r5 = r28 - r25
            float r5 = r6.F06(r5)
            int r6 = (int) r5
            r5 = 2147483647(0x7fffffff, float:NaN)
            long r38 = X.AnonymousClass5SF.A04(r8, r6, r8, r5)
            java.lang.Object r5 = r0.AJO(r1)
            X.4cd r5 = (X.C268024cd) r5
            X.4bM r1 = X.AnonymousClass5YA.A03
            java.lang.Object r1 = r0.AJO(r1)
            X.5Uu r1 = (X.C286305Uu) r1
            X.0sn r47 = X.0sn.A00
            X.5hx r42 = new X.5hx
            r44 = r1
            r45 = r5
            r48 = r47
            r42.<init>(r43, r44, r45, r46, r47, r48)
            X.5iJ r1 = new X.5iJ
            r35 = r1
            r36 = r42
            r37 = r34
            r40 = r8
            r35.<init>(r36, r37, r38, r40)
            boolean r5 = X.0fL.A02()
            if (r5 == 0) goto L_0x0251
            r5 = -1761400058(0xffffffff97032b06, float:-4.2382686E-25)
            X.0fL.A00(r5)
        L_0x0251:
            X.C286565Wx.A0L(r3, r8)
            X.5iM r1 = r1.A01
            boolean r1 = r1.A0B
            if (r1 == 0) goto L_0x04a0
            X.5Oz r9 = r7.A00
            java.lang.Object r5 = r9.getValue()
            X.0qQ.A0B(r5, r8)
            X.5Oz r1 = r7.A01
            r56 = r1
            r1.Epw(r5)
        L_0x026a:
            long r5 = X.C51965G9l.A09(r0)
            r1 = r29
            androidx.compose.ui.Modifier r5 = X.C51969G9p.A0X(r4, r1, r5)
            r1 = r28
            androidx.compose.ui.Modifier r5 = X.C287205Zk.A0D(r5, r1)
            X.5RD r1 = X.C51970G9q.A0Z(r0, r10)
            int r6 = X.C287425a7.A00(r0)
            X.5RM r10 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r0, r5)
            X.C51973G9u.A0z(r0, r3, r13)
            X.C287595aO.A00(r0, r1, r12)
            r1 = r17
            boolean r1 = X.C51965G9l.A1Y(r0, r3, r10, r1)
            if (r1 != 0) goto L_0x029e
            boolean r1 = X.C51972G9s.A1Q(r0, r6)
            if (r1 != 0) goto L_0x02a1
        L_0x029e:
            X.C51971G9r.A13(r0, r11, r6)
        L_0x02a1:
            X.C287595aO.A00(r0, r5, r15)
            X.5Tl r42 = X.C51966G9m.A0i(r9)
            X.5hw r45 = X.C291825hw.A02
            r48 = 8355838(0x7f7ffe, float:1.1709023E-38)
            r44 = r32
            r46 = r34
            r47 = r8
            X.5Z4 r41 = X.AnonymousClass5Z4.A00((X.C291805hu) null, (X.C289645dx) null, r43, (X.C268454dQ) null, r44, r45, r46, 0, r47, r48, r49, r51, 0, 0)
            X.5Yw r1 = X.AnonymousClass5aQ.A00(r0)
            long r5 = r1.A14
            r49 = r5
            X.5Z4 r1 = X.AnonymousClass5Z4.A00((X.C291805hu) null, (X.C289645dx) null, r43, (X.C268454dQ) null, r44, r45, r46, 0, r47, r48, r49, r51, 0, 0)
            X.5ZB r1 = r1.A02
            X.IGz r12 = new X.IGz
            r12.<init>(r1)
            X.5Yw r1 = X.AnonymousClass5aQ.A00(r0)
            long r5 = r1.A0v
            X.6Fe r9 = new X.6Fe
            r9.<init>(r5)
            r10 = 7
            X.I23 r6 = new X.I23
            r5 = r32
            r1 = r34
            r6.<init>(r5, r1, r8, r10)
            r1 = -914127225(0xffffffffc9838687, float:-1077456.9)
            boolean r5 = X.C51967G9n.A1Z(r0, r7, r1)
            r13 = r2 & 112(0x70, float:1.57E-43)
            r1 = r18
            boolean r1 = X.AnonymousClass7TF.A1S(r13, r1)
            r5 = r5 | r1
            java.lang.Object r10 = r0.ECw()
            if (r5 != 0) goto L_0x02f9
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r10 != r1) goto L_0x0305
        L_0x02f9:
            r5 = 24
            X.J6k r10 = new X.J6k
            r1 = r24
            r10.<init>((int) r5, (java.lang.Object) r7, (java.lang.Object) r1)
            r0.FLL(r10)
        L_0x0305:
            X.0sP r11 = X.C51965G9l.A0z(r3, r10)
            X.I4S r5 = new X.I4S
            r10 = r32
            r5.<init>(r11, r10, r10)
            r1 = r59
            androidx.compose.ui.Modifier r10 = X.C51970G9q.A0U(r4, r1)
            r1 = r28
            androidx.compose.ui.Modifier r11 = X.C287205Zk.A0D(r10, r1)
            r1 = 0
            float r22 = r22 + r26
            r10 = r22
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A0B(r11, r1, r10, r1, r1)
            r10 = r27
            androidx.compose.ui.Modifier r39 = X.C287195Zj.A09(r11, r10, r1)
            r10 = -914169851(0xffffffffc982e005, float:-1072128.6)
            boolean r10 = X.C51967G9n.A1Z(r0, r7, r10)
            java.lang.Object r11 = r0.ECw()
            if (r10 != 0) goto L_0x033c
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            if (r11 != r10) goto L_0x0342
        L_0x033c:
            r10 = 28
            X.MP4 r11 = X.C51969G9p.A0z(r0, r7, r10)
        L_0x0342:
            X.0sP r44 = X.C51965G9l.A0z(r3, r11)
            r48 = 1
            r50 = 6
            r51 = 45336(0xb118, float:6.3529E-41)
            r10 = 0
            r35 = r32
            r36 = r5
            r37 = r6
            r38 = r0
            r40 = r9
            r43 = r12
            r45 = r32
            r46 = r32
            r47 = r34
            r49 = r8
            r52 = r8
            r53 = r8
            r54 = r8
            X.I5J.A00(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r5 = r21
            androidx.compose.ui.Modifier r12 = X.C287195Zj.A0B(r4, r1, r5, r1, r1)
            X.4bM r5 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A01
            java.lang.Object r11 = r0.AJO(r5)
            android.content.Context r11 = (android.content.Context) r11
            r41 = 248(0xf8, float:3.48E-43)
            java.lang.String r6 = "memu_sticker_edit_screen"
            X.7jB r9 = new X.7jB
            r34 = r9
            r35 = r11
            r36 = r30
            r37 = r32
            r38 = r6
            r39 = r8
            r40 = r8
            r34.<init>(r35, r36, r37, r38, r39, r40, r41)
            X.2DO r9 = X.C287995bC.A00(r9, r0)
            X.AnonymousClass6G3.A03(r0, r12, r9)
            r11 = r20
            r9 = r19
            androidx.compose.ui.Modifier r35 = X.C287195Zj.A0B(r4, r1, r11, r1, r9)
            r9 = 2131099912(0x7f060108, float:1.781219E38)
            long r39 = X.C289505di.A00(r0, r9)
            r37 = 384(0x180, float:5.38E-43)
            r34 = r0
            r36 = r1
            r38 = r8
            X.C56618I4t.A02(r34, r35, r36, r37, r38, r39)
            r9 = r23
            androidx.compose.ui.Modifier r11 = X.C287205Zk.A0D(r4, r9)
            r9 = r19
            androidx.compose.ui.Modifier r35 = X.C287195Zj.A0B(r11, r1, r1, r1, r9)
            r9 = 2131965999(0x7f13382f, float:1.9568824E38)
            java.lang.String r37 = X.C288035bG.A00(r0, r9)
            X.5Yw r9 = X.AnonymousClass5aQ.A00(r0)
            long r11 = r9.A14
            X.5Z4 r36 = X.C51966G9m.A0h(r0)
            r38 = r11
            X.AnonymousClass5ZZ.A0X(r34, r35, r36, r37, r38)
            r0.ASN()
            r9 = r26
            float r9 = -r9
            androidx.compose.ui.Modifier r9 = X.C56164Htt.A00(r4, r1, r9)
            java.lang.Object r11 = r0.AJO(r5)
            android.content.Context r11 = (android.content.Context) r11
            r5 = r33
            r0.AJO(r5)
            X.KWK r12 = new X.KWK
            r5 = r30
            r12.<init>(r11, r5, r6, r8)
            X.2DO r5 = X.C287995bC.A00(r12, r0)
            X.AnonymousClass6G3.A03(r0, r9, r5)
            r0.ASN()
            r0.ASN()
            r5 = r23
            androidx.compose.ui.Modifier r6 = X.C287205Zk.A0D(r4, r5)
            androidx.compose.ui.Alignment r5 = X.C287215Zl.A06
            r4 = r16
            androidx.compose.ui.Modifier r5 = r4.AAz(r5, r6)
            r4 = 1099956224(0x41900000, float:18.0)
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A0B(r5, r1, r1, r1, r4)
            r1 = r58
            androidx.compose.ui.Modifier r26 = X.HY2.A00(r0, r4, r1)
            r1 = 2131966097(0x7f133891, float:1.9569022E38)
            java.lang.String r28 = X.C288035bG.A00(r0, r1)
            long r29 = X.G9w.A05(r0)
            X.5Z4 r27 = X.C51966G9m.A0c(r0)
            r25 = r0
            X.AnonymousClass5ZZ.A0X(r25, r26, r27, r28, r29)
            X.IQN r6 = X.IQN.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            X.JwM r4 = new X.JwM
            r1 = r31
            r4.<init>((X.C59496JLu) r6, (java.lang.Integer) r1, (java.lang.Integer) r5)
            java.lang.String r1 = X.C51971G9r.A0q(r56)
            boolean r35 = X.C51966G9m.A1X(r1)
            r1 = 1888404998(0x708ec606, float:3.5349014E29)
            boolean r1 = X.C51974G9v.A1X(r0, r1, r2)
            java.lang.Object r5 = r0.ECw()
            if (r1 != 0) goto L_0x044e
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r5 != r1) goto L_0x045a
        L_0x044e:
            r2 = 36
            X.Ivh r5 = new X.Ivh
            r1 = r57
            r5.<init>(r1, r2)
            r0.FLL(r5)
        L_0x045a:
            X.0sa r28 = X.C51965G9l.A0y(r3, r5, r8)
            r1 = 1888406294(0x708ecb16, float:3.535391E29)
            r0.ExS(r1)
            r1 = r18
            if (r13 != r1) goto L_0x0469
            r10 = 1
        L_0x0469:
            boolean r1 = X.C51966G9m.A1U(r0, r7, r10)
            java.lang.Object r2 = r0.ECw()
            if (r1 != 0) goto L_0x0477
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x047f
        L_0x0477:
            r2 = 37
            r1 = r24
            X.IwQ r2 = X.C58717IwQ.A01(r0, r1, r7, r2)
        L_0x047f:
            X.0sa r29 = X.C51965G9l.A0y(r3, r2, r8)
            r34 = 116(0x74, float:1.63E-43)
            r26 = r4
            r27 = r32
            r30 = r32
            r31 = r32
            r33 = r8
            X.C56576I2g.A01(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r1 = X.C51967G9n.A1R(r0)
            if (r1 == 0) goto L_0x0061
            r1 = 716342201(0x2ab283b9, float:3.1710553E-13)
            X.0fL.A00(r1)
            goto L_0x0061
        L_0x04a0:
            X.5Oz r1 = r7.A01
            r56 = r1
            java.lang.Object r1 = r56.getValue()
            X.0qQ.A0B(r1, r8)
            X.5Oz r9 = r7.A00
            r9.Epw(r1)
            goto L_0x026a
        L_0x04b2:
            if (r4 == 0) goto L_0x04b6
            X.J2N r24 = X.J2N.A00
        L_0x04b6:
            r1 = r62 & 16
            if (r1 == 0) goto L_0x0097
            android.content.Context r3 = X.C51975G9x.A0A(r0)
            android.app.Application r3 = (android.app.Application) r3
            com.instagram.common.session.UserSession r1 = X.C51968G9o.A0h(r0)
            X.H6J r7 = new X.H6J
            r7.<init>(r3, r1)
            X.07g r6 = X.C51975G9x.A0P(r0)
            if (r6 == 0) goto L_0x0520
            r5 = 0
            X.2YQ r4 = X.C51975G9x.A0Q(r6)
            java.lang.Class<X.GgE> r3 = X.C52961GgE.class
            r1 = -1439476281(0xffffffffaa3355c7, float:-1.5928154E-13)
            r0.ExT(r1)
            X.2YL r1 = X.C54765HRx.A00(r7, r6, r4, r3, r5)
            X.2YL r7 = X.C51975G9x.A0O(r1, r0)
            X.GgE r7 = (X.C52961GgE) r7
            goto L_0x0096
        L_0x04e8:
            r1 = r14 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x003f
            r1 = r59
            int r1 = X.G9t.A0R(r0, r1)
            r2 = r2 | r1
            goto L_0x003f
        L_0x04f5:
            r1 = r14 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0039
            r1 = r58
            int r1 = X.G9t.A0G(r0, r1)
            r2 = r2 | r1
            goto L_0x0039
        L_0x0502:
            r1 = r61 & 48
            if (r1 != 0) goto L_0x0033
            r1 = r24
            int r1 = X.G9t.A0F(r0, r1)
            r2 = r2 | r1
            goto L_0x0033
        L_0x050f:
            r1 = r61 & 6
            if (r1 != 0) goto L_0x051d
            r1 = r57
            int r2 = X.C41848B3p.A01(r0, r1)
            r2 = r2 | r61
            goto L_0x002d
        L_0x051d:
            r2 = r14
            goto L_0x002d
        L_0x0520:
            java.lang.IllegalStateException r0 = X.G9w.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56280Hvo.A01(X.5Wy, X.I1b, X.3E6, X.GgE, X.0sa, X.0sP, int, int):void");
    }

    public static final long A00(C286575Wy r3, float f) {
        if (C51967G9n.A1U(r3, 773244363)) {
            0fL.A01(310196351, "com.instagram.creation.genai.memu.sticker.edit.dpToSp (MemuStickerEditScreen.kt:66)");
        }
        long FH9 = ((C268034ce) r3.AJO(AnonymousClass5YA.A01)).FH9(f);
        if (0fL.A02()) {
            0fL.A00(1492616034);
        }
        C51965G9l.A1V(r3);
        return FH9;
    }
}
