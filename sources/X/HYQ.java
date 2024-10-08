package X;

public abstract class HYQ {
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03f5, code lost:
        if (r4.A04 != r7) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00be, code lost:
        if (r2.AGw(r4) == false) goto L_0x00c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0480  */
    /* JADX WARNING: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r34, X.AnonymousClass3E6 r35, X.C56605I4e r36, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams r37, X.C362088hK r38, X.C52962GgF r39, java.lang.String r40, X.C62320sa r41, X.0sL r42, X.0sL r43, int r44, int r45, int r46, boolean r47, boolean r48) {
        /*
            r23 = r40
            r4 = r39
            r5 = 0
            r26 = r36
            r1 = r38
            r0 = r26
            boolean r7 = X.AnonymousClass7TF.A1U(r5, r1, r0)
            r1 = 4
            r12 = 2
            r39 = r35
            r0 = r39
            X.0qQ.A0B(r0, r1)
            r30 = r41
            r32 = r42
            r33 = r43
            r2 = r32
            r1 = r30
            r0 = r33
            X.C51974G9v.A1N(r2, r1, r0)
            r0 = 8
            r6 = r37
            X.0qQ.A0B(r6, r0)
            r0 = -1597371871(0xffffffffa0ca0a21, float:-3.4226834E-19)
            r2 = r34
            r2.ExV(r0)
            r0 = r46
            r3 = r46 & 1
            r1 = r44
            if (r3 == 0) goto L_0x0465
            r9 = r44 | 6
        L_0x0040:
            r3 = r46 & 2
            if (r3 == 0) goto L_0x0458
            r9 = r9 | 48
        L_0x0046:
            r11 = r46 & 4
            if (r11 == 0) goto L_0x044b
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r3 = r46 & 8
            r36 = r47
            if (r3 == 0) goto L_0x043e
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0054:
            r3 = r46 & 16
            if (r3 == 0) goto L_0x0431
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x005a:
            r8 = r46 & 32
            r3 = 196608(0x30000, float:2.75506E-40)
            if (r8 != 0) goto L_0x006a
            r3 = r3 & r44
            if (r3 != 0) goto L_0x006b
            r3 = r32
            int r3 = X.G9t.A0J(r2, r3)
        L_0x006a:
            r9 = r9 | r3
        L_0x006b:
            r8 = r46 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            if (r8 != 0) goto L_0x007b
            r3 = r3 & r44
            if (r3 != 0) goto L_0x007c
            r3 = r30
            int r3 = X.G9t.A0K(r2, r3)
        L_0x007b:
            r9 = r9 | r3
        L_0x007c:
            r8 = r0 & 128(0x80, float:1.794E-43)
            r3 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 != 0) goto L_0x008c
            r3 = r3 & r44
            if (r3 != 0) goto L_0x008d
            r3 = r33
            int r3 = X.G9t.A0L(r2, r3)
        L_0x008c:
            r9 = r9 | r3
        L_0x008d:
            r8 = r0 & 256(0x100, float:3.59E-43)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r8 != 0) goto L_0x009b
            r3 = r3 & r44
            if (r3 != 0) goto L_0x009c
            int r3 = X.G9t.A0M(r2, r6)
        L_0x009b:
            r9 = r9 | r3
        L_0x009c:
            r8 = r0 & 512(0x200, float:7.175E-43)
            r3 = 805306368(0x30000000, float:4.656613E-10)
            r37 = r48
            if (r8 != 0) goto L_0x00ae
            r3 = r3 & r44
            if (r3 != 0) goto L_0x00af
            r3 = r37
            int r3 = X.G9t.A0h(r2, r3)
        L_0x00ae:
            r9 = r9 | r3
        L_0x00af:
            r24 = r45
            r3 = r45 & 6
            if (r3 != 0) goto L_0x042d
            r3 = r0 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L_0x00c0
            boolean r8 = r2.AGw(r4)
            r3 = 4
            if (r8 != 0) goto L_0x00c1
        L_0x00c0:
            r3 = 2
        L_0x00c1:
            r10 = r45 | r3
        L_0x00c3:
            r3 = 306783379(0x12492493, float:6.34695E-28)
            r8 = r9 & r3
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r3) goto L_0x0105
            r3 = r10 & 3
            if (r3 != r12) goto L_0x0105
            boolean r3 = r2.Bwn()
            if (r3 == 0) goto L_0x0105
            r2.Evl()
        L_0x00da:
            X.5Xd r3 = r2.ASQ()
            if (r3 == 0) goto L_0x0104
            X.JCv r2 = new X.JCv
            r13 = r2
            r14 = r38
            r15 = r26
            r16 = r39
            r17 = r32
            r18 = r30
            r19 = r33
            r20 = r6
            r21 = r4
            r22 = r23
            r23 = r1
            r25 = r0
            r26 = r7
            r27 = r36
            r28 = r37
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r3.A06 = r2
        L_0x0104:
            return
        L_0x0105:
            r2.Ewr()
            r3 = r44 & 1
            if (r3 == 0) goto L_0x03db
            boolean r3 = r2.Aw3()
            if (r3 != 0) goto L_0x03db
            r2.Evl()
        L_0x0115:
            boolean r3 = X.C51967G9n.A1S(r2)
            if (r3 == 0) goto L_0x0123
            r8 = 2146627609(0x7ff2f019, float:NaN)
            java.lang.String r3 = "com.instagram.creation.genai.magicmod.screen.ui.MagicModScreen (MagicModScreen.kt:56)"
            X.0fL.A01(r8, r3)
        L_0x0123:
            X.0Ud r3 = r4.A09
            r22 = 0
            X.4gU r21 = X.AnonymousClass6FW.A02(r2, r3, r5)
            X.0Ud r3 = r4.A08
            X.4gU r20 = X.AnonymousClass6FW.A02(r2, r3, r5)
            X.5Qk r19 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r10 = X.C51966G9m.A0U(r19)
            X.0sP r8 = X.C287655aY.A00
            r3 = 4
            androidx.compose.ui.Modifier r8 = X.JJP.A00(r10, r8, r3)
            androidx.compose.ui.Alignment r11 = X.C287215Zl.A0E
            X.5RD r14 = X.C287675aa.A00(r11, r5)
            int r13 = X.C287425a7.A00(r2)
            r3 = r2
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r10 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r16 = X.C287435a8.A01(r2, r8)
            X.0sa r8 = X.C287485aD.A00
            X.C51973G9u.A0z(r2, r3, r8)
            X.0sL r15 = X.C287485aD.A03
            X.0sL r18 = X.C51969G9p.A0w(r2, r14, r10, r15)
            X.0sL r14 = X.C287485aD.A02
            boolean r10 = r3.A0K
            if (r10 != 0) goto L_0x016a
            boolean r10 = X.C51972G9s.A1Q(r2, r13)
            if (r10 != 0) goto L_0x016d
        L_0x016a:
            X.C51971G9r.A13(r2, r14, r13)
        L_0x016d:
            r10 = r16
            X.0sL r17 = X.C51966G9m.A1K(r2, r10)
            java.lang.Object r10 = r21.getValue()
            X.JV5 r10 = (X.JV5) r10
            java.lang.Object r10 = r10.A03
            X.HLp r10 = (X.C54632HLp) r10
            int r13 = r10.ordinal()
            if (r13 == r5) goto L_0x037e
            if (r13 == r7) goto L_0x0310
            r10 = 3
            if (r13 == r10) goto L_0x02bd
            r10 = 217869270(0xcfc6bd6, float:3.889165E-31)
            if (r13 != r12) goto L_0x047b
            r10 = 217918399(0xcfd2bbf, float:3.900715E-31)
            r2.ExS(r10)
            r13 = r19
            r10 = r39
            androidx.compose.ui.Modifier r10 = X.HY2.A00(r2, r13, r10)
            X.5RD r16 = X.C287675aa.A00(r11, r5)
            int r13 = X.C287425a7.A00(r2)
            X.5RM r11 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r2, r10)
            X.C51973G9u.A0z(r2, r3, r8)
            r8 = r16
            X.C287595aO.A00(r2, r8, r15)
            r8 = r18
            boolean r8 = X.C51965G9l.A1Y(r2, r3, r11, r8)
            if (r8 != 0) goto L_0x01c1
            boolean r8 = X.C51972G9s.A1Q(r2, r13)
            if (r8 != 0) goto L_0x01c4
        L_0x01c1:
            X.C51971G9r.A13(r2, r14, r13)
        L_0x01c4:
            r8 = r17
            X.C287595aO.A00(r2, r10, r8)
            java.lang.Object r8 = r21.getValue()
            X.JV5 r8 = (X.JV5) r8
            java.lang.Object r8 = r8.A00
            X.8hK r8 = (X.C362088hK) r8
            int r10 = r8.ordinal()
            if (r10 == r7) goto L_0x0289
            if (r10 == r5) goto L_0x021b
            r8 = 26030484(0x18d3194, float:5.186636E-38)
            if (r10 != r12) goto L_0x0476
            r8 = 26071948(0x18dd38c, float:5.2098775E-38)
            r2.ExS(r8)
            int r8 = r9 >> 3
            r10 = r8 & 14
            int r9 = r9 >> 12
            r8 = r9 & 112(0x70, float:1.57E-43)
            r10 = r10 | r8
            r8 = r9 & 896(0x380, float:1.256E-42)
            r10 = r10 | r8
            int r15 = X.C51972G9s.A04(r9, r10)
            r16 = 32
            r8 = r2
            r9 = r26
            r10 = r6
            r11 = r22
            r12 = r30
            r13 = r32
            r14 = r33
            X.C56601I3r.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0207:
            X.C286565Wx.A0L(r3, r5)
            r2.ASN()
        L_0x020d:
            boolean r3 = X.C51971G9r.A1S(r2, r3, r5)
            if (r3 == 0) goto L_0x00da
            r3 = 2070740598(0x7b6cfe76, float:1.2305431E36)
            X.0fL.A00(r3)
            goto L_0x00da
        L_0x021b:
            r8 = 807466457(0x3020f5d9, float:5.855703E-10)
            r2.ExS(r8)
            r8 = 26064292(0x18db5a4, float:5.205586E-38)
            r2.ExS(r8)
            com.instagram.creation.genai.magicmod.model.MagicModTopicInfo r8 = r6.A03
            if (r8 == 0) goto L_0x0286
            boolean r8 = r8.A04
            if (r8 != r7) goto L_0x0286
            r8 = 26067314(0x18dc172, float:5.20728E-38)
            boolean r8 = X.C51967G9n.A1Z(r2, r4, r8)
            java.lang.Object r10 = r2.ECw()
            if (r8 != 0) goto L_0x0240
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r10 != r8) goto L_0x0246
        L_0x0240:
            r8 = 37
            X.Imy r10 = X.C51970G9q.A0r(r2, r4, r8)
        L_0x0246:
            X.0Ya r10 = X.C51965G9l.A12(r3, r10)
            X.0sa r10 = (X.C62320sa) r10
        L_0x024c:
            X.C286565Wx.A0L(r3, r5)
            int r34 = r9 >> 3
            r11 = r34 & 14
            int r8 = r9 >> 6
            r8 = r8 & 112(0x70, float:1.57E-43)
            r11 = r11 | r8
            r8 = r9 & 896(0x380, float:1.256E-42)
            r11 = r11 | r8
            int r8 = r9 >> 18
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r11 = r11 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r34
            r11 = r11 | r8
            r8 = 458752(0x70000, float:6.42848E-40)
            r34 = r34 & r8
            r34 = r34 | r11
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r8 = r8 & r9
            r34 = r34 | r8
            r8 = 234881024(0xe000000, float:1.5777218E-30)
            r8 = r8 & r9
            r34 = r34 | r8
            r35 = 512(0x200, float:7.175E-43)
            r25 = r2
            r27 = r6
            r28 = r22
            r29 = r23
            r31 = r10
            X.C56446Hye.A00(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x0207
        L_0x0286:
            r10 = r30
            goto L_0x024c
        L_0x0289:
            r8 = 26031735(0x18d3677, float:5.1873373E-38)
            r2.ExS(r8)
            int r12 = r9 >> 3
            r11 = r12 & 14
            int r10 = r9 >> 6
            r8 = r10 & 112(0x70, float:1.57E-43)
            r11 = r11 | r8
            r8 = r9 & 896(0x380, float:1.256E-42)
            r11 = r11 | r8
            r8 = r10 & 7168(0x1c00, float:1.0045E-41)
            int r16 = X.C51973G9u.A03(r11, r8, r10)
            r8 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r8
            r16 = r16 | r12
            r17 = 64
            r8 = r2
            r9 = r26
            r10 = r6
            r11 = r22
            r12 = r23
            r13 = r30
            r14 = r32
            r15 = r33
            r18 = r36
            X.C56447Hyf.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0207
        L_0x02bd:
            r12 = 1
            r8 = 217890886(0xcfcc046, float:3.8942468E-31)
            r2.ExS(r8)
            r8 = 217895203(0xcfcd123, float:3.8952617E-31)
            boolean r11 = X.C51973G9u.A1S(r2, r4, r6, r8)
            r10 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r9
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r10 == r8) goto L_0x02d3
            r12 = 0
        L_0x02d3:
            r11 = r11 | r12
            java.lang.Object r10 = r2.ECw()
            if (r11 != 0) goto L_0x02de
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r10 != r8) goto L_0x02e6
        L_0x02de:
            r10 = 27
            r8 = r32
            X.J6W r10 = X.J6W.A00(r2, r6, r8, r4, r10)
        L_0x02e6:
            X.0sP r17 = X.C51965G9l.A0z(r3, r10)
            int r10 = r9 >> 3
            r11 = r10 & 14
            int r8 = r9 >> 15
            r8 = r8 & 112(0x70, float:1.57E-43)
            r11 = r11 | r8
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            int r9 = r9 >> 12
            r8 = 57344(0xe000, float:8.0356E-41)
            r9 = r9 & r8
            r10 = r10 | r9
            r19 = 32
            r11 = r2
            r12 = r39
            r13 = r26
            r14 = r6
            r15 = r22
            r16 = r30
            r18 = r10
            X.C56279Hvn.A01(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x020d
        L_0x0310:
            r10 = -1835694735(0xffffffff92958571, float:-9.436118E-28)
            r8 = r21
            java.lang.Object r8 = X.C51967G9n.A0n(r2, r8, r10)
            X.JV5 r8 = (X.JV5) r8
            java.lang.Object r12 = r8.A03
            r8 = 217879666(0xcfc9472, float:3.891609E-31)
            boolean r8 = X.C51967G9n.A1Z(r2, r4, r8)
            java.lang.Object r10 = r2.ECw()
            if (r8 != 0) goto L_0x032e
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r10 != r8) goto L_0x033a
        L_0x032e:
            r11 = 38
            X.MG0 r10 = new X.MG0
            r8 = r22
            r10.<init>(r4, r8, r11)
            r2.FLL(r10)
        L_0x033a:
            X.C51968G9o.A1E(r2, r3, r10, r12)
            java.lang.Object r8 = r21.getValue()
            X.JV5 r8 = (X.JV5) r8
            java.lang.Object r12 = r8.A00
            X.8hK r12 = (X.C362088hK) r12
            java.lang.Object r11 = r20.getValue()
            X.I12 r11 = (X.I12) r11
            r8 = 217887056(0xcfcb150, float:3.8933464E-31)
            boolean r8 = X.C51967G9n.A1Z(r2, r4, r8)
            java.lang.Object r10 = r2.ECw()
            if (r8 != 0) goto L_0x035e
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r10 != r8) goto L_0x0364
        L_0x035e:
            r8 = 36
            X.Imy r10 = X.C51970G9q.A0r(r2, r4, r8)
        L_0x0364:
            X.0Ya r10 = X.C51965G9l.A12(r3, r10)
            X.0sa r10 = (X.C62320sa) r10
            int r8 = r9 >> 21
            r19 = r8 & 112(0x70, float:1.57E-43)
            r20 = 16
            r13 = r2
            r14 = r11
            r15 = r6
            r16 = r12
            r17 = r22
            r18 = r10
            X.HYR.A00(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x020d
        L_0x037e:
            r10 = -1836018034(0xffffffff9290968e, float:-9.124792E-28)
            r8 = r21
            java.lang.Object r8 = X.C51967G9n.A0n(r2, r8, r10)
            X.JV5 r8 = (X.JV5) r8
            java.lang.Object r12 = r8.A03
            r8 = 217869272(0xcfc6bd8, float:3.8891654E-31)
            boolean r8 = X.C51967G9n.A1Z(r2, r4, r8)
            java.lang.Object r10 = r2.ECw()
            if (r8 != 0) goto L_0x039c
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r10 != r8) goto L_0x03a8
        L_0x039c:
            r11 = 37
            X.MG0 r10 = new X.MG0
            r8 = r22
            r10.<init>(r4, r8, r11)
            r2.FLL(r10)
        L_0x03a8:
            X.C51968G9o.A1E(r2, r3, r10, r12)
            java.lang.Object r8 = r21.getValue()
            X.JV5 r8 = (X.JV5) r8
            boolean r11 = r8.A01
            r8 = 217874261(0xcfc7f55, float:3.8903383E-31)
            boolean r8 = X.C51967G9n.A1Z(r2, r4, r8)
            java.lang.Object r10 = r2.ECw()
            if (r8 != 0) goto L_0x03c4
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r10 != r8) goto L_0x03ca
        L_0x03c4:
            r8 = 35
            X.Imy r10 = X.C51970G9q.A0r(r2, r4, r8)
        L_0x03ca:
            X.0Ya r10 = X.C51965G9l.A12(r3, r10)
            X.0sa r10 = (X.C62320sa) r10
            int r8 = r9 >> 12
            r9 = r8 & 896(0x380, float:1.256E-42)
            r8 = r30
            X.I6O.A05(r2, r10, r8, r9, r11)
            goto L_0x020d
        L_0x03db:
            if (r11 == 0) goto L_0x03df
            r23 = 0
        L_0x03df:
            r3 = r0 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0115
            android.content.Context r8 = X.C51975G9x.A0A(r2)
            android.app.Application r8 = (android.app.Application) r8
            com.instagram.common.session.UserSession r15 = X.C51970G9q.A0f(r2)
            com.instagram.creation.genai.magicmod.model.MagicModTopicInfo r4 = r6.A03
            if (r4 == 0) goto L_0x03f7
            boolean r3 = r4.A04
            r19 = 1
            if (r3 == r7) goto L_0x042a
        L_0x03f7:
            r19 = 0
            if (r4 != 0) goto L_0x042a
            r3 = 0
        L_0x03fc:
            X.H6n r11 = new X.H6n
            r16 = r26
            r17 = r38
            r18 = r3
            r20 = r37
            r13 = r11
            r14 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            X.07g r13 = X.C51975G9x.A0P(r2)
            if (r13 == 0) goto L_0x0480
            r10 = 0
            X.2YQ r8 = X.C51975G9x.A0Q(r13)
            java.lang.Class<X.GgF> r4 = X.C52962GgF.class
            r3 = -1439476281(0xffffffffaa3355c7, float:-1.5928154E-13)
            r2.ExT(r3)
            X.2YL r3 = X.C54765HRx.A00(r11, r13, r8, r4, r10)
            X.2YL r4 = X.C51975G9x.A0O(r3, r2)
            X.GgF r4 = (X.C52962GgF) r4
            goto L_0x0115
        L_0x042a:
            java.lang.String r3 = r4.A03
            goto L_0x03fc
        L_0x042d:
            r10 = r24
            goto L_0x00c3
        L_0x0431:
            r3 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x005a
            r3 = r39
            int r3 = X.G9t.A0I(r2, r3)
            r9 = r9 | r3
            goto L_0x005a
        L_0x043e:
            r3 = r1 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0054
            r3 = r36
            int r3 = X.G9t.A0b(r2, r3)
            r9 = r9 | r3
            goto L_0x0054
        L_0x044b:
            r3 = r1 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r23
            int r3 = X.G9t.A0Q(r2, r3)
            r9 = r9 | r3
            goto L_0x004c
        L_0x0458:
            r3 = r44 & 48
            if (r3 != 0) goto L_0x0046
            r3 = r26
            int r3 = X.G9t.A0F(r2, r3)
            r9 = r9 | r3
            goto L_0x0046
        L_0x0465:
            r3 = r44 & 6
            if (r3 != 0) goto L_0x0473
            r3 = r38
            int r9 = X.G9t.A0O(r2, r3)
            r9 = r9 | r44
            goto L_0x0040
        L_0x0473:
            r9 = r1
            goto L_0x0040
        L_0x0476:
            X.Wub r0 = X.C51972G9s.A0v(r2, r3, r8)
            throw r0
        L_0x047b:
            X.Wub r0 = X.C51972G9s.A0v(r2, r3, r10)
            throw r0
        L_0x0480:
            java.lang.IllegalStateException r0 = X.G9w.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HYQ.A00(X.5Wy, X.3E6, X.I4e, com.instagram.creation.genai.magicmod.model.MagicModLaunchParams, X.8hK, X.GgF, java.lang.String, X.0sa, X.0sL, X.0sL, int, int, int, boolean, boolean):void");
    }
}
