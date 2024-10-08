package X;

import androidx.compose.ui.Modifier;

public abstract class I2U {
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (X.182.A06(X.0Tu.A05, r12, 36321073838433343L) == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0211, code lost:
        if (r1.A0R == false) goto L_0x0213;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r34, androidx.compose.ui.Modifier r35, X.C335907dj r36, X.C333777a7 r37, X.C56030Hrc r38, int r39, int r40) {
        /*
            r18 = r35
            r11 = 0
            r1 = r36
            r4 = r38
            boolean r17 = X.AnonymousClass7TF.A1U(r11, r1, r4)
            r2 = -2060421713(0xffffffff853075af, float:-8.297095E-36)
            r0 = r34
            r0.ExV(r2)
            r38 = r40
            r2 = r40 & 1
            r7 = r39
            if (r2 == 0) goto L_0x02b2
            r2 = r39 | 6
        L_0x001d:
            r3 = r40 & 2
            r5 = 32
            if (r3 == 0) goto L_0x02a7
            r2 = r2 | 48
        L_0x0025:
            r3 = r40 & 4
            r8 = r37
            if (r3 == 0) goto L_0x029c
            r2 = r2 | 384(0x180, float:5.38E-43)
        L_0x002d:
            r9 = r40 & 8
            if (r9 == 0) goto L_0x028f
            r2 = r2 | 3072(0xc00, float:4.305E-42)
        L_0x0033:
            r6 = r2 & 5851(0x16db, float:8.199E-42)
            r3 = 1170(0x492, float:1.64E-42)
            if (r6 != r3) goto L_0x005e
            boolean r3 = r0.Bwn()
            if (r3 == 0) goto L_0x005e
            r0.Evl()
        L_0x0042:
            X.5Xd r2 = r0.ASQ()
            if (r2 == 0) goto L_0x005d
            r39 = 9
            X.JG8 r0 = new X.JG8
            r32 = r0
            r33 = r18
            r34 = r1
            r35 = r8
            r36 = r4
            r37 = r7
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            r2.A06 = r0
        L_0x005d:
            return
        L_0x005e:
            if (r9 == 0) goto L_0x0062
            X.5Qk r18 = androidx.compose.ui.Modifier.A00
        L_0x0062:
            boolean r3 = X.0fL.A02()
            if (r3 == 0) goto L_0x0070
            r6 = -1025426893(0xffffffffc2e13a33, float:-112.61367)
            java.lang.String r3 = "com.instagram.comments.mvvm.view.compose.CommentRowDetails (CommentRowDetails.kt:46)"
            X.0fL.A01(r6, r3)
        L_0x0070:
            X.4bM r15 = X.C286955Yl.A00
            java.lang.Object r12 = r0.AJO(r15)
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            r16 = 0
            r6 = 1094713344(0x41400000, float:12.0)
            r3 = r18
            androidx.compose.ui.Modifier r10 = X.C51967G9n.A0D(r3, r6)
            X.5RD r9 = X.C51969G9p.A0Z(r0, r11)
            int r13 = X.C287425a7.A00(r0)
            r3 = r0
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r6 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r0, r10)
            X.C51973G9u.A0y(r0, r3)
            X.C51971G9r.A12(r0, r9, r6)
            X.0sL r9 = X.C287485aD.A02
            boolean r6 = r3.A0K
            if (r6 != 0) goto L_0x00a7
            boolean r6 = X.C51972G9s.A1Q(r0, r13)
            if (r6 != 0) goto L_0x00aa
        L_0x00a7:
            X.C51971G9r.A13(r0, r9, r13)
        L_0x00aa:
            X.C51965G9l.A18(r0, r10)
            java.lang.Long r6 = r1.A0I
            r25 = r6
            com.instagram.user.model.User r6 = r1.A0C
            r39 = r6
            java.lang.String r6 = r1.A00
            r19 = r6
            if (r37 == 0) goto L_0x028b
            com.instagram.user.model.User r6 = r8.A0A
            if (r6 == 0) goto L_0x028b
            com.instagram.common.typedurl.ImageUrl r22 = r6.Bh3()
        L_0x00c3:
            boolean r14 = r1.A0b
            boolean r36 = r1.A05(r12)
            boolean r6 = r1.A0X
            if (r6 == 0) goto L_0x00dc
            X.0Tu r6 = X.0Tu.A05
            r9 = 36321073838433343(0x8109d30000243f, double:3.0329315764259374E-306)
            boolean r6 = X.182.A06(r6, r12, r9)
            r35 = 1
            if (r6 != 0) goto L_0x00de
        L_0x00dc:
            r35 = 0
        L_0x00de:
            r6 = 210235147(0xc87ef0b, float:2.0943912E-31)
            r0.ExS(r6)
            r6 = r2 & 112(0x70, float:1.57E-43)
            boolean r9 = X.AnonymousClass7TF.A1S(r6, r5)
            java.lang.Object r10 = r0.ECw()
            if (r9 != 0) goto L_0x00f4
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r10 != r9) goto L_0x00fa
        L_0x00f4:
            r9 = 20
            X.In8 r10 = X.C51970G9q.A0s(r0, r4, r9)
        L_0x00fa:
            X.0Ya r10 = X.C51965G9l.A12(r3, r10)
            r9 = 210237543(0xc87f867, float:2.0949545E-31)
            boolean r12 = X.C51972G9s.A1R(r0, r9, r6, r5)
            java.lang.Object r9 = r0.ECw()
            if (r12 != 0) goto L_0x010f
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            if (r9 != r12) goto L_0x0118
        L_0x010f:
            r12 = 3
            X.InT r9 = new X.InT
            r9.<init>(r4, r12)
            r0.FLL(r9)
        L_0x0118:
            X.0Ya r9 = X.C51965G9l.A12(r3, r9)
            com.instagram.user.model.FollowStatus r23 = com.instagram.user.model.FollowStatus.A08
            X.7df r12 = r1.A00
            X.0sP r10 = (X.0sP) r10
            X.0sK r9 = (X.0sK) r9
            r30 = 24640(0x6040, float:3.4528E-41)
            int r13 = r2 >> 6
            r13 = r13 & 14
            r13 = r13 | 3120(0xc30, float:4.372E-42)
            r32 = 4096(0x1000, float:5.74E-42)
            r26 = r19
            r27 = r10
            r28 = r16
            r29 = r9
            r31 = r13
            r33 = r17
            r34 = r14
            r37 = r11
            r19 = r0
            r20 = r12
            r21 = r8
            r24 = r39
            X.C54873HWg.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.7aK r9 = r1.A06
            r34 = r9
            X.7aK r10 = X.C333897aK.SHOW_TRANSLATION
            if (r9 != r10) goto L_0x0287
            java.lang.String r14 = r1.A0O
        L_0x0153:
            r9 = 210251626(0xc882f6a, float:2.0982654E-31)
            r0.ExS(r9)
            boolean r9 = X.AnonymousClass7TF.A1S(r6, r5)
            java.lang.Object r10 = r0.ECw()
            if (r9 != 0) goto L_0x0167
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r10 != r9) goto L_0x016d
        L_0x0167:
            r9 = 21
            X.In8 r10 = X.C51970G9q.A0s(r0, r4, r9)
        L_0x016d:
            X.0sP r26 = X.C51968G9o.A1A(r3, r10)
            r9 = 210253958(0xc883886, float:2.0988137E-31)
            boolean r9 = X.C51972G9s.A1R(r0, r9, r6, r5)
            java.lang.Object r10 = r0.ECw()
            if (r9 != 0) goto L_0x0182
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r10 != r9) goto L_0x0188
        L_0x0182:
            r9 = 22
            X.In8 r10 = X.C51970G9q.A0s(r0, r4, r9)
        L_0x0188:
            X.0sP r27 = X.C51968G9o.A1A(r3, r10)
            X.7fs r13 = r1.A03
            X.571 r9 = r1.A08
            r23 = r9
            boolean r9 = r1.A0V
            r32 = r9
            r9 = 210263532(0xc885dec, float:2.1010645E-31)
            boolean r9 = X.C51972G9s.A1R(r0, r9, r6, r5)
            java.lang.Object r10 = r0.ECw()
            if (r9 != 0) goto L_0x01a7
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r10 != r9) goto L_0x01ad
        L_0x01a7:
            r9 = 26
            X.Imy r10 = X.C51970G9q.A0r(r0, r4, r9)
        L_0x01ad:
            X.0sa r25 = X.C51968G9o.A19(r3, r10)
            X.7dd r10 = r1.A07
            r9 = 210268371(0xc8870d3, float:2.1022021E-31)
            boolean r5 = X.C51972G9s.A1R(r0, r9, r6, r5)
            java.lang.Object r9 = r0.ECw()
            if (r5 != 0) goto L_0x01c4
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r9 != r5) goto L_0x01ca
        L_0x01c4:
            r5 = 23
            X.In8 r9 = X.C51970G9q.A0s(r0, r4, r5)
        L_0x01ca:
            X.0sP r28 = X.C51968G9o.A1A(r3, r9)
            r29 = 1086586880(0x40c40000, float:6.125)
            r21 = r13
            r22 = r10
            r24 = r14
            r30 = r11
            r31 = r11
            r33 = r11
            X.C54875HWi.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r5 = 210271663(0xc887daf, float:2.102976E-31)
            r0.ExS(r5)
            if (r8 == 0) goto L_0x0279
            boolean r5 = r8.A0Y
            if (r5 == 0) goto L_0x01f1
            boolean r9 = r8.A0f
            r5 = r17
            if (r9 != r5) goto L_0x0279
        L_0x01f1:
            X.7fv r14 = r1.A02
            java.lang.Integer r9 = r1.A0H
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            boolean r27 = X.AnonymousClass7TF.A1W(r9, r5)
            X.7df r5 = X.C335867df.RESTRICT_SENSITIVITY_SCREEN
            boolean r28 = X.AnonymousClass7TF.A1W(r12, r5)
            X.7df r5 = X.C335867df.RESTRICT_PENDING_CONTENT
            boolean r29 = X.AnonymousClass7TF.A1W(r12, r5)
            X.7de r9 = r1.A05
            X.7de r5 = X.C335857de.HIDDEN_COMMENT
            if (r9 != r5) goto L_0x0213
            boolean r5 = r1.A0R
            r32 = 1
            if (r5 != 0) goto L_0x0215
        L_0x0213:
            r32 = 0
        L_0x0215:
            boolean r10 = r1.A0Z
            if (r13 == 0) goto L_0x021d
            java.lang.String r5 = r13.A04
            r16 = r5
        L_0x021d:
            boolean r9 = r1.A0U
            X.7df r5 = X.C335867df.APPROVED
            boolean r30 = X.AnonymousClass7TF.A1W(r12, r5)
            r5 = 1879048192(0x70000000, float:1.58456325E29)
            int r24 = r2 << 24
            r24 = r24 & r5
            r20 = r14
            r21 = r34
            r22 = r4
            r23 = r16
            r25 = r11
            r26 = r11
            r31 = r10
            r33 = r9
            A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            boolean r2 = r1.A0j
            if (r2 == 0) goto L_0x0279
            X.0eE r5 = X.AnonymousClass0t1.A01
            java.lang.Object r2 = r0.AJO(r15)
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            com.instagram.user.model.User r2 = r5.A01(r2)
            com.instagram.common.typedurl.ImageUrl r10 = r2.Bh3()
            java.lang.String r9 = r39.getUsername()
            r2 = 210308042(0xc890bca, float:2.1115287E-31)
            r0.ExS(r2)
            boolean r2 = X.C51972G9s.A1J(r6)
            java.lang.Object r5 = r0.ECw()
            if (r2 != 0) goto L_0x026a
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r5 != r2) goto L_0x0270
        L_0x026a:
            r2 = 27
            X.Imy r5 = X.C51968G9o.A1B(r0, r4, r2)
        L_0x0270:
            X.0Ya r2 = X.C51965G9l.A12(r3, r5)
            X.0sa r2 = (X.C62320sa) r2
            X.C54883HWq.A00(r0, r10, r9, r2, r11)
        L_0x0279:
            boolean r2 = X.C51971G9r.A1S(r0, r3, r11)
            if (r2 == 0) goto L_0x0042
            r2 = 1194555462(0x47337846, float:45944.273)
            X.0fL.A00(r2)
            goto L_0x0042
        L_0x0287:
            java.lang.String r14 = r1.A0J
            goto L_0x0153
        L_0x028b:
            r22 = r16
            goto L_0x00c3
        L_0x028f:
            r3 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r3 != 0) goto L_0x0033
            r3 = r18
            int r3 = X.G9t.A0R(r0, r3)
            r2 = r2 | r3
            goto L_0x0033
        L_0x029c:
            r3 = r7 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L_0x002d
            int r3 = X.G9t.A0Q(r0, r8)
            r2 = r2 | r3
            goto L_0x002d
        L_0x02a7:
            r3 = r39 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x0025
            int r3 = X.G9t.A0P(r0, r4)
            r2 = r2 | r3
            goto L_0x0025
        L_0x02b2:
            r2 = r39 & 14
            if (r2 != 0) goto L_0x02be
            int r2 = X.G9t.A0O(r0, r1)
            r2 = r2 | r39
            goto L_0x001d
        L_0x02be:
            r2 = r7
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I2U.A00(X.5Wy, androidx.compose.ui.Modifier, X.7dj, X.7a7, X.Hrc, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:176:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x042c  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r21, X.C337227fv r22, X.C333897aK r23, X.C56030Hrc r24, java.lang.String r25, int r26, int r27, int r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            r11 = r22
            r0 = -1130093522(0xffffffffbca4242e, float:-0.020036783)
            r1 = r21
            r1.ExV(r0)
            r10 = r28
            r0 = r28 & 1
            r8 = r26
            r20 = r29
            if (r0 == 0) goto L_0x0495
            r0 = r26 | 6
        L_0x0016:
            r2 = r28 & 2
            r19 = r30
            if (r2 == 0) goto L_0x0488
            r0 = r0 | 48
        L_0x001e:
            r2 = r28 & 4
            r18 = r31
            if (r2 == 0) goto L_0x047b
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0026:
            r2 = r28 & 8
            r17 = r32
            if (r2 == 0) goto L_0x046e
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x002e:
            r2 = r28 & 16
            r15 = r33
            if (r2 == 0) goto L_0x0460
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0036:
            r2 = r28 & 32
            r14 = r34
            if (r2 == 0) goto L_0x0454
            r2 = 196608(0x30000, float:2.75506E-40)
        L_0x003e:
            r0 = r0 | r2
        L_0x003f:
            r2 = r28 & 64
            r21 = r25
            if (r2 == 0) goto L_0x0446
            r2 = 1572864(0x180000, float:2.204052E-39)
        L_0x0047:
            r0 = r0 | r2
        L_0x0048:
            r2 = r10 & 128(0x80, float:1.794E-43)
            r13 = r35
            if (r2 == 0) goto L_0x043a
            r2 = 12582912(0xc00000, float:1.7632415E-38)
        L_0x0050:
            r0 = r0 | r2
        L_0x0051:
            r2 = r10 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x042c
            r2 = 100663296(0x6000000, float:2.4074124E-35)
        L_0x0057:
            r0 = r0 | r2
        L_0x0058:
            r2 = r10 & 512(0x200, float:7.175E-43)
            r16 = 1879048192(0x70000000, float:1.58456325E29)
            r6 = r24
            if (r2 == 0) goto L_0x0422
            r2 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0062:
            r0 = r0 | r2
        L_0x0063:
            r4 = r10 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x0412
            r12 = r27 | 6
        L_0x0069:
            r2 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r3 = r0 & r2
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r3 != r2) goto L_0x00a3
            r3 = r12 & 11
            r2 = 2
            if (r3 != r2) goto L_0x00a3
            boolean r2 = r1.Bwn()
            if (r2 == 0) goto L_0x00a3
            r1.Evl()
        L_0x0081:
            X.5Xd r1 = r1.ASQ()
            if (r1 == 0) goto L_0x00a2
            X.JCa r0 = new X.JCa
            r30 = r19
            r31 = r18
            r32 = r17
            r33 = r15
            r34 = r14
            r35 = r13
            r22 = r11
            r28 = r10
            r29 = r20
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r1.A06 = r0
        L_0x00a2:
            return
        L_0x00a3:
            if (r4 == 0) goto L_0x00a6
            r11 = 0
        L_0x00a6:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00b4
            r3 = 449957880(0x1ad1cff8, float:8.6776366E-23)
            java.lang.String r2 = "com.instagram.comments.mvvm.view.compose.CommentBottomOptions (CommentRowDetails.kt:123)"
            X.0fL.A01(r3, r2)
        L_0x00b4:
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
            X.5Zu r4 = X.C287275Zs.A01
            X.5Zp r2 = X.C287215Zl.A05
            r3 = 0
            X.5RD r5 = X.C287395a4.A02(r4, r1, r2, r3)
            int r9 = X.C287425a7.A00(r1)
            r2 = r1
            X.5Wx r2 = (X.C286565Wx) r2
            X.5RM r4 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r7 = X.C287435a8.A01(r1, r7)
            X.C51973G9u.A0y(r1, r2)
            X.C51971G9r.A12(r1, r5, r4)
            X.0sL r5 = X.C287485aD.A02
            boolean r4 = r2.A0K
            if (r4 != 0) goto L_0x00e0
            boolean r4 = X.C51972G9s.A1Q(r1, r9)
            if (r4 != 0) goto L_0x00e3
        L_0x00e0:
            X.C51971G9r.A13(r1, r5, r9)
        L_0x00e3:
            X.C51965G9l.A18(r1, r7)
            if (r11 == 0) goto L_0x01ec
            r4 = -2089587770(0xffffffff83736bc6, float:-7.1535E-37)
            r1.ExS(r4)
            java.lang.Integer r5 = r11.A03
            boolean r4 = r11.A0A
            if (r4 == 0) goto L_0x011f
            r0 = -2089509836(0xffffffff83749c34, float:-7.188447E-37)
            r1.ExS(r0)
            r31 = 2131968768(0x7f134300, float:1.957444E38)
            r29 = 0
            long r34 = X.C51966G9m.A0H(r1)
            r33 = 10
            r28 = r1
            r30 = r29
            r32 = r3
            X.C56254HvO.A00(r28, r29, r30, r31, r32, r33, r34)
        L_0x010e:
            X.C286565Wx.A0L(r2, r3)
        L_0x0111:
            boolean r0 = X.C51971G9r.A1S(r1, r2, r3)
            if (r0 == 0) goto L_0x0081
            r0 = 1094013340(0x4135519c, float:11.332424)
            X.0fL.A00(r0)
            goto L_0x0081
        L_0x011f:
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r5 == r4) goto L_0x0175
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            if (r5 == r4) goto L_0x0175
            java.lang.String r7 = r11.A07
            if (r7 == 0) goto L_0x01b0
            int r4 = r7.length()
            if (r4 == 0) goto L_0x01b0
            r4 = -2088896780(0xffffffff837df6f4, float:-7.4633506E-37)
            X.5Yw r4 = X.C51967G9n.A0a(r1, r4)
            long r4 = r4.A0E
            r9 = 1179547390(0x464e76fe, float:13213.748)
            r1.ExS(r9)
            r0 = r0 & r16
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r9 = X.AnonymousClass7TF.A1S(r0, r9)
            boolean r0 = X.C51973G9u.A1G(r12)
            r9 = r9 | r0
            java.lang.Object r0 = r1.ECw()
            if (r9 != 0) goto L_0x0157
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r0 != r9) goto L_0x0161
        L_0x0157:
            r9 = 15
            X.Ins r0 = new X.Ins
            r0.<init>(r9, r11, r6)
            r1.FLL(r0)
        L_0x0161:
            X.0sa r30 = X.C51965G9l.A0y(r2, r0, r3)
            r33 = 1
            r28 = r1
            r29 = r7
            r31 = r3
            r32 = r3
            r34 = r4
            X.C56254HvO.A00(r28, r29, r30, r31, r32, r33, r34)
            goto L_0x010e
        L_0x0175:
            r4 = -2089247514(0xffffffff83789ce6, float:-7.306076E-37)
            r1.ExS(r4)
            r31 = 2131968493(0x7f1341ed, float:1.9573882E38)
            r29 = 0
            long r34 = X.C51966G9m.A09(r1)
            r4 = 1179536190(0x464e4b3e, float:13202.811)
            r1.ExS(r4)
            r0 = r0 & r16
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r4 = X.AnonymousClass7TF.A1S(r0, r4)
            boolean r0 = X.C51973G9u.A1G(r12)
            r4 = r4 | r0
            java.lang.Object r0 = r1.ECw()
            if (r4 != 0) goto L_0x01a1
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r0 != r4) goto L_0x01ab
        L_0x01a1:
            r4 = 14
            X.Ins r0 = new X.Ins
            r0.<init>(r4, r11, r6)
            r1.FLL(r0)
        L_0x01ab:
            X.0sa r30 = X.C51965G9l.A0y(r2, r0, r3)
            goto L_0x01e1
        L_0x01b0:
            r4 = -2088619268(0xffffffff838232fc, float:-7.652419E-37)
            r1.ExS(r4)
            r31 = 2131961761(0x7f1327a1, float:1.9560228E38)
            r29 = 0
            long r34 = X.C51966G9m.A09(r1)
            r4 = 1179556549(0x464e9ac5, float:13222.692)
            r1.ExS(r4)
            r0 = r0 & r16
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r4)
            java.lang.Object r4 = r1.ECw()
            if (r0 != 0) goto L_0x01d7
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x01dd
        L_0x01d7:
            r0 = 19
            X.Imy r4 = X.C51968G9o.A1B(r1, r6, r0)
        L_0x01dd:
            X.0sa r30 = X.C51968G9o.A19(r2, r4)
        L_0x01e1:
            r33 = 2
            r28 = r1
            r32 = r3
            X.C56254HvO.A00(r28, r29, r30, r31, r32, r33, r34)
            goto L_0x010e
        L_0x01ec:
            if (r29 == 0) goto L_0x0208
            r0 = -2088357814(0xffffffff8386304a, float:-7.886899E-37)
            r1.ExS(r0)
            r31 = 2131969676(0x7f13468c, float:1.9576282E38)
            r29 = 0
            r34 = 0
            r33 = 14
            r28 = r1
            r30 = r29
            r32 = r3
            X.C56254HvO.A00(r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0111
        L_0x0208:
            r4 = -2088219368(0xffffffff83884d18, float:-8.011061E-37)
            r1.ExS(r4)
            if (r30 == 0) goto L_0x0267
            r4 = -2088237596(0xffffffff838805e4, float:-7.994714E-37)
            r1.ExS(r4)
            r5 = 2131972339(0x7f1350f3, float:1.9581683E38)
            r4 = 1179567141(0x464ec425, float:13233.036)
            r1.ExS(r4)
            r0 = r0 & r16
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r4 = X.AnonymousClass7TF.A1S(r0, r7)
            java.lang.Object r9 = r1.ECw()
            if (r4 != 0) goto L_0x0231
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r9 != r4) goto L_0x0237
        L_0x0231:
            r4 = 20
            X.Imy r9 = X.C51970G9q.A0r(r1, r6, r4)
        L_0x0237:
            X.0sa r4 = X.C51968G9o.A19(r2, r9)
            X.C56254HvO.A01(r4, r1, r5)
            r4 = 2131972338(0x7f1350f2, float:1.958168E38)
            r5 = 1179572453(0x464ed8e5, float:13238.224)
            r1.ExS(r5)
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r7)
            java.lang.Object r5 = r1.ECw()
            if (r0 != 0) goto L_0x0255
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r5 != r0) goto L_0x025b
        L_0x0255:
            r0 = 21
            X.Imy r5 = X.C51968G9o.A1B(r1, r6, r0)
        L_0x025b:
            X.0sa r0 = X.C51968G9o.A19(r2, r5)
            X.C56254HvO.A01(r0, r1, r4)
            X.C286565Wx.A0L(r2, r3)
            goto L_0x0111
        L_0x0267:
            if (r31 == 0) goto L_0x02c0
            r4 = -2087856234(0xffffffff838dd796, float:-8.336731E-37)
            r1.ExS(r4)
            r5 = 2131972337(0x7f1350f1, float:1.9581679E38)
            r4 = 1179579462(0x464ef446, float:13245.068)
            r1.ExS(r4)
            r0 = r0 & r16
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r4 = X.AnonymousClass7TF.A1S(r0, r7)
            java.lang.Object r9 = r1.ECw()
            if (r4 != 0) goto L_0x028a
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r9 != r4) goto L_0x0290
        L_0x028a:
            r4 = 22
            X.Imy r9 = X.C51970G9q.A0r(r1, r6, r4)
        L_0x0290:
            X.0sa r4 = X.C51968G9o.A19(r2, r9)
            X.C56254HvO.A01(r4, r1, r5)
            r4 = 2131972338(0x7f1350f2, float:1.958168E38)
            r5 = 1179585189(0x464f0aa5, float:13250.661)
            r1.ExS(r5)
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r7)
            java.lang.Object r5 = r1.ECw()
            if (r0 != 0) goto L_0x02ae
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r5 != r0) goto L_0x02b4
        L_0x02ae:
            r0 = 23
            X.Imy r5 = X.C51968G9o.A1B(r1, r6, r0)
        L_0x02b4:
            X.0sa r0 = X.C51968G9o.A19(r2, r5)
            X.C56254HvO.A01(r0, r1, r4)
            X.C286565Wx.A0L(r2, r3)
            goto L_0x0111
        L_0x02c0:
            if (r32 == 0) goto L_0x040a
            r4 = -2087430821(0xffffffff8394555b, float:-8.718255E-37)
            r1.ExS(r4)
            r12 = 2131972162(0x7f135042, float:1.9581324E38)
            r29 = 0
            r34 = 0
            r4 = 1179591261(0x464f225d, float:13256.591)
            r1.ExS(r4)
            r5 = r0 & r16
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r7 = X.AnonymousClass7TF.A1S(r5, r4)
            java.lang.Object r9 = r1.ECw()
            if (r7 != 0) goto L_0x02e7
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            if (r9 != r7) goto L_0x02ed
        L_0x02e7:
            r7 = 24
            X.Imy r9 = X.C51970G9q.A0r(r1, r6, r7)
        L_0x02ed:
            X.0sa r7 = X.C51968G9o.A19(r2, r9)
            r33 = 6
            X.C56254HvO.A01(r7, r1, r12)
            r7 = 1179593277(0x464f2a3d, float:13258.56)
            r1.ExS(r7)
            if (r15 == 0) goto L_0x0322
            r12 = 2131963370(0x7f132dea, float:1.9563491E38)
            r7 = 1179597187(0x464f3983, float:13262.378)
            r1.ExS(r7)
            boolean r9 = X.AnonymousClass7TF.A1S(r5, r4)
            java.lang.Object r7 = r1.ECw()
            if (r9 != 0) goto L_0x0315
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r7 != r9) goto L_0x031b
        L_0x0315:
            r7 = 25
            X.Imy r7 = X.C51970G9q.A0r(r1, r6, r7)
        L_0x031b:
            X.0sa r7 = X.C51968G9o.A19(r2, r7)
            X.C56254HvO.A01(r7, r1, r12)
        L_0x0322:
            X.C286565Wx.A0L(r2, r3)
            r7 = 1179599852(0x464f43ec, float:13264.98)
            r1.ExS(r7)
            if (r14 == 0) goto L_0x0351
            r12 = 2131956405(0x7f1312b5, float:1.9549365E38)
            r7 = 1179604165(0x464f54c5, float:13269.192)
            r1.ExS(r7)
            boolean r9 = X.AnonymousClass7TF.A1S(r5, r4)
            java.lang.Object r7 = r1.ECw()
            if (r9 != 0) goto L_0x0344
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r7 != r9) goto L_0x034a
        L_0x0344:
            r7 = 17
            X.Imy r7 = X.C51970G9q.A0r(r1, r6, r7)
        L_0x034a:
            X.0sa r7 = X.C51968G9o.A19(r2, r7)
            X.C56254HvO.A01(r7, r1, r12)
        L_0x0351:
            X.C286565Wx.A0L(r2, r3)
            r7 = 1179607168(0x464f6080, float:13272.125)
            r1.ExS(r7)
            if (r25 == 0) goto L_0x0408
            int r7 = r21.length()
            if (r7 == 0) goto L_0x0408
            r7 = 1179609053(0x464f67dd, float:13273.966)
            java.lang.Object r9 = X.C51967G9n.A0m(r1, r7)
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            java.lang.Object r9 = X.C51974G9v.A0Z(r1, r9, r7, r3)
            X.5Oz r12 = X.C51965G9l.A0J(r2, r9, r3)
            r31 = 2131966723(0x7f133b03, float:1.9570292E38)
            r9 = 1179612247(0x464f7457, float:13277.085)
            java.lang.Object r9 = X.C51967G9n.A0m(r1, r9)
            if (r9 != r7) goto L_0x0384
            r9 = 2
            X.Ivp r9 = X.C58680Ivp.A00(r1, r12, r9)
        L_0x0384:
            X.0sa r30 = X.C51965G9l.A0y(r2, r9, r3)
            r32 = 3072(0xc00, float:4.305E-42)
            r28 = r1
            X.C56254HvO.A00(r28, r29, r30, r31, r32, r33, r34)
            r9 = 1179615128(0x464f7f98, float:13279.898)
            java.lang.Object r9 = X.C51967G9n.A0m(r1, r9)
            if (r9 != r7) goto L_0x039d
            r9 = 3
            X.Ivp r9 = X.C58680Ivp.A00(r1, r12, r9)
        L_0x039d:
            X.0sa r30 = X.C51965G9l.A0y(r2, r9, r3)
            boolean r33 = X.C51971G9r.A1W(r12)
            r9 = 1179618810(0x464f8dfa, float:13283.494)
            r1.ExS(r9)
            boolean r12 = X.AnonymousClass7TF.A1S(r5, r4)
            java.lang.Object r9 = r1.ECw()
            if (r12 != 0) goto L_0x03b7
            if (r9 != r7) goto L_0x03bd
        L_0x03b7:
            r7 = 19
            X.In8 r9 = X.C51970G9q.A0s(r1, r6, r7)
        L_0x03bd:
            X.0sP r31 = X.C51968G9o.A1A(r2, r9)
            int r0 = r0 >> 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r32 = r0 | 6
            r0 = 1
            r29 = r21
            A02(r28, r29, r30, r31, r32, r33)
        L_0x03cd:
            X.C286565Wx.A0L(r2, r3)
            if (r13 == 0) goto L_0x010e
            int r7 = r23.ordinal()
            if (r7 == r3) goto L_0x0404
            if (r7 == r0) goto L_0x0400
            r0 = 2
            if (r7 != r0) goto L_0x04a6
            r7 = 2131973006(0x7f13538e, float:1.9583036E38)
        L_0x03e0:
            r0 = 1179635492(0x464fcf24, float:13299.785)
            boolean r0 = X.C51972G9s.A1R(r1, r0, r5, r4)
            java.lang.Object r4 = r1.ECw()
            if (r0 != 0) goto L_0x03f1
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x03f7
        L_0x03f1:
            r0 = 18
            X.Imy r4 = X.C51968G9o.A1B(r1, r6, r0)
        L_0x03f7:
            X.0sa r0 = X.C51968G9o.A19(r2, r4)
            X.C56254HvO.A01(r0, r1, r7)
            goto L_0x010e
        L_0x0400:
            r7 = 2131965491(0x7f133633, float:1.9567793E38)
            goto L_0x03e0
        L_0x0404:
            r7 = 2131973013(0x7f135395, float:1.958305E38)
            goto L_0x03e0
        L_0x0408:
            r0 = 1
            goto L_0x03cd
        L_0x040a:
            r0 = -2085935257(0xffffffff83ab2767, float:-1.0059523E-36)
            r1.ExS(r0)
            goto L_0x010e
        L_0x0412:
            r2 = r27 & 14
            if (r2 != 0) goto L_0x041e
            int r2 = X.G9t.A0O(r1, r11)
            r12 = r27 | r2
            goto L_0x0069
        L_0x041e:
            r12 = r27
            goto L_0x0069
        L_0x0422:
            r2 = r26 & r16
            if (r2 != 0) goto L_0x0063
            int r2 = X.G9t.A0X(r1, r6)
            goto L_0x0062
        L_0x042c:
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r26
            if (r2 != 0) goto L_0x0058
            r2 = r23
            int r2 = X.G9t.A0W(r1, r2)
            goto L_0x0057
        L_0x043a:
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r26
            if (r2 != 0) goto L_0x0051
            int r2 = X.G9t.A0f(r1, r13)
            goto L_0x0050
        L_0x0446:
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r26
            if (r2 != 0) goto L_0x0048
            r2 = r21
            int r2 = X.G9t.A0U(r1, r2)
            goto L_0x0047
        L_0x0454:
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r26
            if (r2 != 0) goto L_0x003f
            int r2 = X.G9t.A0d(r1, r14)
            goto L_0x003e
        L_0x0460:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r26
            if (r2 != 0) goto L_0x0036
            int r2 = X.G9t.A0c(r1, r15)
            r0 = r0 | r2
            goto L_0x0036
        L_0x046e:
            r2 = r8 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x002e
            r2 = r17
            int r2 = X.G9t.A0b(r1, r2)
            r0 = r0 | r2
            goto L_0x002e
        L_0x047b:
            r2 = r8 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0026
            r2 = r18
            int r2 = X.G9t.A0a(r1, r2)
            r0 = r0 | r2
            goto L_0x0026
        L_0x0488:
            r2 = r26 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x001e
            r2 = r19
            int r2 = X.G9t.A0Z(r1, r2)
            r0 = r0 | r2
            goto L_0x001e
        L_0x0495:
            r0 = r26 & 14
            if (r0 != 0) goto L_0x04a3
            r0 = r20
            int r0 = X.G9t.A0Y(r1, r0)
            r0 = r0 | r26
            goto L_0x0016
        L_0x04a3:
            r0 = r8
            goto L_0x0016
        L_0x04a6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I2U.A01(X.5Wy, X.7fv, X.7aK, X.Hrc, java.lang.String, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static final void A02(C286575Wy r13, String str, C62320sa r15, 0sP r16, int i, boolean z) {
        int i2;
        C286575Wy r7 = r13;
        r13.ExV(153531829);
        int i3 = i;
        C62320sa r10 = r15;
        if ((i & 14) == 0) {
            i2 = C41848B3p.A01(r13, r15) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 112) == 0) {
            i2 |= G9t.A0Z(r13, z2);
        }
        0sP r2 = r16;
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0G(r13, r2);
        }
        String str2 = str;
        if ((i3 & 7168) == 0) {
            i2 |= G9t.A0R(r13, str);
        }
        if ((i2 & 5851) != 1170 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-822799367, "com.instagram.comments.mvvm.view.compose.GifMoreMenu (CommentRowDetails.kt:228)");
            }
            int i4 = i2 << 6;
            C56261HvV.A00((C56838IEj) null, r7, (Modifier) null, (HL4) null, r10, new C74189PqV(C51966G9m.A16(r13), C51965G9l.A0r(r13), (Object) r2, str2, 24), C59316JEu.A00, (i4 & 896) | (i4 & 7168), 241, 0, z2, false);
            if (0fL.A02()) {
                0fL.A00(-1855287933);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8Z(r2, r10, str2, i3, 1, z2);
        }
    }
}
