package X;

import androidx.compose.ui.Modifier;
import com.google.common.collect.ImmutableList;

/* renamed from: X.I2j  reason: case insensitive filesystem */
public abstract class C56579I2j {
    public static final void A01(C286575Wy r11, ImmutableList immutableList, HM3 hm3, 0sL r14, int i, boolean z) {
        int i2;
        C56151Htd htd;
        C56152Hte hte;
        HM3 hm32 = hm3;
        0qQ.A0B(hm3, 0);
        ImmutableList immutableList2 = immutableList;
        0sL r3 = r14;
        AnonymousClass7TG.A1P(immutableList, r14);
        C286575Wy r10 = r11;
        r11.ExV(1895268213);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r11, hm3) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r11, immutableList);
        }
        boolean z2 = z;
        if ((i & 896) == 0) {
            i2 |= G9t.A0a(r11, z2);
        }
        if ((i & 7168) == 0) {
            i2 |= G9t.A0H(r11, r14);
        }
        if ((i2 & 5851) != 1170 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(463597893, "com.instagram.creation.genai.themes.ui.AiThemesAnimatedContentForStates (AiThemesScreen.kt:176)");
            }
            boolean contains = immutableList.contains(hm3);
            if (z2) {
                htd = I74.A00(GQC.A00(180, 140), 0.0f);
            } else {
                htd = C56151Htd.A00;
            }
            if (z2) {
                hte = I74.A04(GQC.A00(140, 0), 0.0f);
            } else {
                hte = C56152Hte.A00;
            }
            C56663I6s.A07(htd, hte, r10, (Modifier) null, (String) null, AnonymousClass5PI.A01(r10, JJR.A00(r14, 2), 1699125837), 196608, 18, contains);
            if (0fL.A02()) {
                0fL.A00(-1682285559);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ImmutableList immutableList3 = immutableList2;
            HM3 hm33 = hm32;
            0sL r7 = r3;
            ASQ.A06 = new J8U(r7, hm33, immutableList3, i3, 6, z2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r24, androidx.compose.ui.Modifier r25, X.C56496HzS r26, X.C53390GnN r27, X.C53032GhN r28, X.C55473HiH r29, X.C62320sa r30, int r31, int r32) {
        /*
            r11 = r25
            r1 = -843098488(0xffffffffcdbf5688, float:-4.01264896E8)
            r0 = r24
            r0.ExV(r1)
            r17 = r32
            r6 = r32 & 1
            r1 = r31
            if (r6 == 0) goto L_0x01b6
            r3 = r31 | 6
        L_0x0014:
            r2 = r32 & 2
            r8 = r27
            if (r2 == 0) goto L_0x01ab
            r3 = r3 | 48
        L_0x001c:
            r2 = r32 & 4
            r4 = r28
            if (r2 == 0) goto L_0x01a0
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0024:
            r2 = r32 & 8
            r13 = r29
            if (r2 == 0) goto L_0x0195
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x002c:
            r2 = r32 & 16
            r14 = r26
            if (r2 == 0) goto L_0x0187
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0034:
            r2 = r32 & 32
            r32 = r30
            if (r2 == 0) goto L_0x0179
            r2 = 196608(0x30000, float:2.75506E-40)
        L_0x003c:
            r3 = r3 | r2
        L_0x003d:
            r5 = 374491(0x5b6db, float:5.24774E-40)
            r5 = r5 & r3
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r2) goto L_0x0069
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x0069
            r0.Evl()
        L_0x004f:
            X.5Xd r2 = r0.ASQ()
            if (r2 == 0) goto L_0x0068
            r18 = 8
            X.JAg r0 = new X.JAg
            r16 = r1
            r15 = r14
            r14 = r13
            r13 = r11
            r12 = r4
            r11 = r32
            r9 = r0
            r10 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r2.A06 = r0
        L_0x0068:
            return
        L_0x0069:
            if (r6 == 0) goto L_0x006d
            X.5Qk r11 = androidx.compose.ui.Modifier.A00
        L_0x006d:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x007b
            r5 = -551963152(0xffffffffdf19b5f0, float:-1.1076023E19)
            java.lang.String r2 = "com.instagram.creation.genai.themes.ui.MainContent (AiThemesScreen.kt:113)"
            X.0fL.A01(r5, r2)
        L_0x007b:
            X.0r6 r6 = r4.A0G
            X.2U7 r2 = X.C55409HhF.A01
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r5 = r2.next()
            r2 = 72
            X.4gU r24 = X.AnonymousClass6FW.A01(r0, r5, r6, r2)
            X.5Zr r2 = X.C287215Zl.A00
            X.5RD r3 = X.C51975G9x.A0M(r0, r2, r3)
            r12 = 0
            int r7 = X.C287425a7.A00(r0)
            r6 = r0
            X.5Wx r6 = (X.C286565Wx) r6
            X.5RM r2 = X.C286565Wx.A04(r6)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r0, r11)
            X.C51973G9u.A0y(r0, r6)
            X.C51971G9r.A12(r0, r3, r2)
            X.0sL r3 = X.C287485aD.A02
            boolean r2 = r6.A0K
            if (r2 != 0) goto L_0x00b5
            boolean r2 = X.C51972G9s.A1Q(r0, r7)
            if (r2 != 0) goto L_0x00b8
        L_0x00b5:
            X.C51971G9r.A13(r0, r3, r7)
        L_0x00b8:
            X.C51965G9l.A18(r0, r5)
            r2 = -184735981(0xfffffffff4fd2713, float:-1.6045454E32)
            java.lang.Object r5 = X.C51967G9n.A0m(r0, r2)
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r5 != r3) goto L_0x00ce
            X.HpC r5 = new X.HpC
            r5.<init>()
            r0.FLL(r5)
        L_0x00ce:
            X.HpC r5 = (X.C55891HpC) r5
            X.C286565Wx.A0L(r6, r12)
            java.lang.Object r2 = r0.ECw()
            java.lang.Object r2 = X.C51974G9v.A0Y(r0, r2, r3)
            X.6FV r2 = (X.AnonymousClass6FV) r2
            X.4Cq r6 = r2.A00
            X.05G r3 = r5.A0D
            r2 = 8
            X.4gU r26 = X.AnonymousClass6FW.A02(r0, r3, r2)
            X.Hke r2 = new X.Hke
            r2.<init>(r5, r6)
            r4.A03 = r2
            X.HM3 r15 = r8.A01
            X.HM3 r2 = X.HM3.Loading
            com.google.common.collect.ImmutableList r19 = com.google.common.collect.ImmutableList.of(r2)
            X.0qQ.A07(r19)
            com.instagram.common.session.UserSession r7 = r14.A00
            X.0Tu r6 = X.0Tu.A05
            r2 = 36326687360956328(0x810eee000437a8, double:3.036481590673314E-306)
            boolean r23 = X.182.A06(r6, r7, r2)
            r10 = 939614901(0x380162b5, float:3.0847925E-5)
            r9 = 43
            X.5PJ r21 = X.JG1.A00(r0, r8, r4, r9, r10)
            r22 = 3072(0xc00, float:4.305E-42)
            r18 = r0
            r20 = r15
            A01(r18, r19, r20, r21, r22, r23)
            X.4bM r9 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A03
            java.lang.Object r25 = r0.AJO(r9)
            X.HM3 r9 = X.HM3.Initial
            com.google.common.collect.ImmutableList r27 = com.google.common.collect.ImmutableList.of(r9)
            X.0qQ.A07(r27)
            boolean r31 = X.182.A06(r6, r7, r2)
            r10 = -37126612(0xfffffffffdc97e2c, float:-3.3478744E37)
            X.JA3 r9 = new X.JA3
            r20 = r8
            r21 = r32
            r22 = r4
            r23 = r5
            r18 = r9
            r19 = r12
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            X.5PJ r29 = X.AnonymousClass5PI.A01(r0, r9, r10)
            r30 = 3072(0xc00, float:4.305E-42)
            r26 = r0
            r28 = r15
            A01(r26, r27, r28, r29, r30, r31)
            X.HM3 r9 = X.HM3.Success
            X.HM3 r5 = X.HM3.GeneratingTheme
            com.google.common.collect.ImmutableList r27 = com.google.common.collect.ImmutableList.of(r9, r5)
            X.0qQ.A07(r27)
            boolean r31 = X.182.A06(r6, r7, r2)
            r3 = 1435151981(0x558aae6d, float:1.90602197E13)
            r2 = 16
            X.JG3 r2 = X.JG3.A00(r13, r4, r8, r2)
            X.5PJ r29 = X.AnonymousClass5PI.A01(r0, r2, r3)
            A01(r26, r27, r28, r29, r30, r31)
            boolean r2 = X.C51967G9n.A1R(r0)
            if (r2 == 0) goto L_0x004f
            r2 = 838075644(0x31f404fc, float:7.1019013E-9)
            X.0fL.A00(r2)
            goto L_0x004f
        L_0x0179:
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r31
            if (r2 != 0) goto L_0x003d
            r2 = r32
            int r2 = X.G9t.A0J(r0, r2)
            goto L_0x003c
        L_0x0187:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r31
            if (r2 != 0) goto L_0x0034
            int r2 = X.G9t.A0S(r0, r14)
            r3 = r3 | r2
            goto L_0x0034
        L_0x0195:
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x002c
            int r2 = X.G9t.A0R(r0, r13)
            r3 = r3 | r2
            goto L_0x002c
        L_0x01a0:
            r2 = r1 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0024
            int r2 = X.G9t.A0Q(r0, r4)
            r3 = r3 | r2
            goto L_0x0024
        L_0x01ab:
            r2 = r31 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x001c
            int r2 = X.G9t.A0P(r0, r8)
            r3 = r3 | r2
            goto L_0x001c
        L_0x01b6:
            r2 = r31 & 14
            if (r2 != 0) goto L_0x01c2
            int r3 = X.G9t.A0O(r0, r11)
            r3 = r3 | r31
            goto L_0x0014
        L_0x01c2:
            r3 = r1
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56579I2j.A00(X.5Wy, androidx.compose.ui.Modifier, X.HzS, X.GnN, X.GhN, X.HiH, X.0sa, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02b8, code lost:
        if (r2 == null) goto L_0x02ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r39, X.C56496HzS r40, X.C53032GhN r41, X.C55618Hkd r42, X.C55473HiH r43, X.C62320sa r44, int r45, boolean r46) {
        /*
            r22 = 0
            r3 = r41
            r41 = r43
            r1 = r42
            r0 = r41
            boolean r15 = X.C51973G9u.A1b(r1, r0, r3)
            r21 = 3
            r43 = r40
            r40 = r44
            r2 = r43
            r1 = r21
            r0 = r40
            X.DbW.A1N(r2, r1, r0)
            r1 = 1893659880(0x70def4e8, float:5.5201397E29)
            r0 = r39
            r0.ExV(r1)
            r6 = r45
            r1 = r45 & 14
            if (r1 != 0) goto L_0x02e3
            r1 = r42
            int r1 = X.G9t.A0O(r0, r1)
            r1 = r1 | r45
        L_0x0033:
            r2 = r45 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x003e
            r2 = r41
            int r2 = X.G9t.A0P(r0, r2)
            r1 = r1 | r2
        L_0x003e:
            r2 = r6 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0047
            int r2 = X.G9t.A0Q(r0, r3)
            r1 = r1 | r2
        L_0x0047:
            r2 = r6 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0052
            r2 = r43
            int r2 = X.G9t.A0R(r0, r2)
            r1 = r1 | r2
        L_0x0052:
            r20 = 57344(0xe000, float:8.0356E-41)
            r2 = r45 & r20
            r39 = r46
            if (r2 != 0) goto L_0x0062
            r2 = r39
            int r2 = X.G9t.A0c(r0, r2)
            r1 = r1 | r2
        L_0x0062:
            r19 = 458752(0x70000, float:6.42848E-40)
            r2 = r45 & r19
            if (r2 != 0) goto L_0x006f
            r2 = r40
            int r2 = X.G9t.A0J(r0, r2)
            r1 = r1 | r2
        L_0x006f:
            r4 = 374491(0x5b6db, float:5.24774E-40)
            r4 = r4 & r1
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r4 != r2) goto L_0x009e
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x009e
            r0.Evl()
        L_0x0081:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x009d
            X.JA0 r0 = new X.JA0
            r7 = r0
            r8 = r3
            r9 = r43
            r10 = r41
            r11 = r42
            r12 = r40
            r13 = r6
            r14 = r21
            r15 = r39
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r1.A06 = r0
        L_0x009d:
            return
        L_0x009e:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00ac
            r4 = 390553692(0x1747605c, float:6.442199E-25)
            java.lang.String r2 = "com.instagram.creation.genai.themes.ui.AiThemesScreen (AiThemesScreen.kt:51)"
            X.0fL.A01(r4, r2)
        L_0x00ac:
            X.0Ud r2 = r3.A0I
            r38 = r2
            r9 = 0
            X.HM3 r8 = X.HM3.Initial
            X.0sn r10 = X.0sn.A00
            r11 = 0
            X.GnN r5 = new X.GnN
            r7 = r5
            r12 = r15
            r7.<init>(r8, r9, r10, r11, r12)
            r4 = 72
            X.4gU r32 = X.AnonymousClass6FW.A01(r0, r5, r2, r4)
            r2 = -216028787(0xfffffffff31fa98d, float:-1.2649751E31)
            java.lang.Object r4 = X.C51967G9n.A0m(r0, r2)
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            java.lang.Object r18 = X.C51972G9s.A0k(r0, r4, r2)
            r2 = r18
            X.I1b r2 = (X.C56547I1b) r2
            r18 = r2
            r2 = r22
            X.5Wx r7 = X.C51965G9l.A0H(r0, r2)
            X.4bM r2 = X.AnonymousClass5YA.A02
            java.lang.Object r31 = r0.AJO(r2)
            java.lang.Object r2 = r32.getValue()
            X.GnN r2 = (X.C53390GnN) r2
            X.HM3 r4 = r2.A01
            r34 = 45
            X.JZr r2 = new X.JZr
            r29 = r2
            r30 = r18
            r33 = r9
            r29.<init>(r30, r31, r32, r33, r34)
            X.C286645Xf.A04(r0, r4, r2)
            X.5Qk r9 = androidx.compose.ui.Modifier.A00
            X.5RD r4 = X.C51966G9m.A0a(r22)
            int r11 = X.C287425a7.A00(r0)
            X.5RM r2 = X.C286565Wx.A04(r7)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r0, r9)
            X.0sa r10 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r7, r10)
            X.0sL r8 = X.C287485aD.A03
            X.0sL r17 = X.C51969G9p.A0w(r0, r4, r2, r8)
            X.0sL r2 = X.C287485aD.A02
            boolean r4 = r7.A0K
            if (r4 != 0) goto L_0x0123
            boolean r4 = X.C51972G9s.A1Q(r0, r11)
            if (r4 != 0) goto L_0x0126
        L_0x0123:
            X.C51971G9r.A13(r0, r2, r11)
        L_0x0126:
            X.0sL r16 = X.C51966G9m.A1K(r0, r5)
            r4 = -1746358571(0xffffffff97e8aed5, float:-1.5036782E-24)
            r0.ExS(r4)
            r4 = r43
            com.instagram.common.session.UserSession r5 = r4.A00
            X.0Tu r4 = X.0Tu.A05
            r11 = 36326687361087402(0x810eee000637aa, double:3.036481590756206E-306)
            boolean r11 = X.182.A06(r4, r5, r11)
            if (r11 == 0) goto L_0x0171
            java.lang.Object r11 = r32.getValue()
            X.GnN r11 = (X.C53390GnN) r11
            X.HM3 r13 = r11.A01
            X.HM3 r11 = X.HM3.Loading
            com.google.common.collect.ImmutableList r24 = com.google.common.collect.ImmutableList.of(r11)
            X.0qQ.A07(r24)
            r11 = 36326687360956328(0x810eee000437a8, double:3.036481590673314E-306)
            boolean r28 = X.182.A06(r4, r5, r11)
            r11 = 16
            X.JFu r12 = X.C59342JFu.A00(r3, r11)
            r11 = 527680016(0x1f73c210, float:5.1617776E-20)
            X.5PJ r26 = X.AnonymousClass5PI.A01(r0, r12, r11)
            r27 = 3072(0xc00, float:4.305E-42)
            r23 = r0
            r25 = r13
            A01(r23, r24, r25, r26, r27, r28)
        L_0x0171:
            r11 = r22
            X.C286565Wx.A0L(r7, r11)
            X.5RD r14 = X.C51968G9o.A0X(r0)
            int r13 = X.C287425a7.A00(r0)
            X.5RM r12 = X.C286565Wx.A04(r7)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r0, r9)
            X.C51973G9u.A0z(r0, r7, r10)
            X.C287595aO.A00(r0, r14, r8)
            r8 = r17
            boolean r7 = X.C51965G9l.A1Y(r0, r7, r12, r8)
            if (r7 != 0) goto L_0x019a
            boolean r7 = X.C51972G9s.A1Q(r0, r13)
            if (r7 != 0) goto L_0x019d
        L_0x019a:
            X.C51971G9r.A13(r0, r2, r13)
        L_0x019d:
            r2 = r16
            X.C287595aO.A00(r0, r11, r2)
            X.6Et r8 = X.C304676Et.A00
            r10 = 59
            X.Imy r7 = new X.Imy
            r2 = r42
            r7.<init>(r2, r10)
            r11 = 60
            X.Imy r10 = new X.Imy
            r10.<init>(r2, r11)
            java.lang.Object r2 = r32.getValue()
            X.GnN r2 = (X.C53390GnN) r2
            X.HM3 r11 = r2.A01
            X.HM3 r2 = X.HM3.Success
            boolean r28 = X.AnonymousClass7TF.A1W(r11, r2)
            int r2 = r1 >> 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r23 = r0
            r24 = r7
            r25 = r10
            r26 = r2
            r27 = r22
            r29 = r39
            X.C54918HYa.A00(r23, r24, r25, r26, r27, r28, r29)
            androidx.compose.ui.Modifier r24 = r8.A00(r9, r15)
            java.lang.Object r7 = r32.getValue()
            X.GnN r7 = (X.C53390GnN) r7
            r30 = 576(0x240, float:8.07E-43)
            r2 = r1 & 896(0x380, float:1.256E-42)
            r30 = r30 | r2
            int r2 = r1 << 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r30 = r30 | r2
            r2 = 32768(0x8000, float:4.5918E-41)
            r30 = r30 | r2
            int r2 = r1 << 3
            r2 = r2 & r20
            r30 = r30 | r2
            r1 = r1 & r19
            r30 = r30 | r1
            r25 = r43
            r26 = r7
            r27 = r3
            r28 = r41
            r29 = r40
            r31 = r22
            A00(r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.4bM r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A03
            java.lang.Object r8 = r0.AJO(r1)
            java.lang.Object r7 = r32.getValue()
            X.GnN r7 = (X.C53390GnN) r7
            X.5Oz r9 = r3.A09
            java.lang.Object r1 = r38.getValue()
            X.GnN r1 = (X.C53390GnN) r1
            X.HM3 r1 = r1.A01
            int r2 = r1.ordinal()
            r34 = 0
            if (r2 == r15) goto L_0x02c9
            r1 = 2
            if (r2 == r1) goto L_0x0236
            java.lang.String r1 = X.C53032GhN.A00(r3)
            boolean r1 = X.00l.A0W(r1)
            if (r1 != 0) goto L_0x0236
        L_0x0234:
            r34 = 1
        L_0x0236:
            r1 = 36326687361021865(0x810eee000537a9, double:3.03648159071476E-306)
            boolean r35 = X.182.A06(r4, r5, r1)
            java.lang.Object r1 = r32.getValue()
            X.GnN r1 = (X.C53390GnN) r1
            X.HM3 r2 = r1.A01
            X.HM3 r1 = X.HM3.GeneratingTheme
            boolean r37 = X.C51969G9p.A1a(r2, r1)
            r1 = 36326687361152939(0x810eee000737ab, double:3.0364815907976515E-306)
            boolean r33 = X.182.A06(r4, r5, r1)
            java.lang.Object r1 = r38.getValue()
            X.GnN r1 = (X.C53390GnN) r1
            X.HM3 r1 = r1.A01
            int r2 = r1.ordinal()
            r36 = 0
            if (r2 == r15) goto L_0x02a2
            r1 = 2
            if (r2 == r1) goto L_0x02a2
            r1 = 4
            if (r2 == r1) goto L_0x02a2
        L_0x026c:
            r1 = 61
            X.Imy r5 = new X.Imy
            r5.<init>(r3, r1)
            r1 = 62
            X.Imy r4 = new X.Imy
            r4.<init>(r3, r1)
            r2 = 43
            X.IwQ r1 = new X.IwQ
            r1.<init>(r2, r8, r3)
            r30 = 392(0x188, float:5.5E-43)
            r24 = r9
            r25 = r18
            r26 = r7
            r27 = r5
            r28 = r4
            r29 = r1
            r32 = r22
            X.HYY.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            boolean r1 = X.C51971G9r.A1R(r0)
            if (r1 == 0) goto L_0x0081
            r1 = -217801375(0xfffffffff3049d61, float:-1.0506824E31)
            X.0fL.A00(r1)
            goto L_0x0081
        L_0x02a2:
            java.lang.Object r1 = r38.getValue()
            X.GnN r1 = (X.C53390GnN) r1
            java.lang.Integer r1 = r1.A02
            if (r1 == 0) goto L_0x02ba
            int r2 = r1.intValue()
            r1 = r38
            X.Jvj r1 = X.C53390GnN.A00(r1, r2)
            java.lang.String r2 = r1.A05
            if (r2 != 0) goto L_0x02bc
        L_0x02ba:
            java.lang.String r2 = r3.A04
        L_0x02bc:
            java.lang.String r1 = X.C53032GhN.A00(r3)
            boolean r1 = X.C51966G9m.A1a(r2, r1)
            if (r1 != 0) goto L_0x026c
            r36 = 1
            goto L_0x026c
        L_0x02c9:
            java.lang.String r1 = X.C53032GhN.A00(r3)
            boolean r1 = X.C51966G9m.A1X(r1)
            if (r1 == 0) goto L_0x0236
            java.lang.Object r1 = r38.getValue()
            X.GnN r1 = (X.C53390GnN) r1
            java.util.List r1 = r1.A03
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 == 0) goto L_0x0236
            goto L_0x0234
        L_0x02e3:
            r1 = r6
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56579I2j.A02(X.5Wy, X.HzS, X.GhN, X.Hkd, X.HiH, X.0sa, int, boolean):void");
    }
}
