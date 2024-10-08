package X;

public abstract class HZK {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v87, resolved type: X.Ix5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v3, resolved type: X.Ix5} */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r1.AGu(r10) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0164, code lost:
        if ((r0 & 384) == 256) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017f, code lost:
        if (r2 == X.AnonymousClass5XT.A00) goto L_0x0181;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r60, androidx.compose.ui.Modifier r61, X.C304786Ff r62, java.lang.String r63, java.lang.String r64, float r65, float r66, float r67, int r68, int r69, long r70, long r72) {
        /*
            r27 = r66
            r26 = r67
            r16 = r72
            r57 = r64
            r18 = r70
            r73 = r63
            r10 = r62
            r29 = r61
            r0 = -1884307382(0xffffffff8fafc04a, float:-1.73304E-29)
            r1 = r60
            r1.ExV(r0)
            r9 = r69
            r0 = r69 & 1
            r28 = r65
            r8 = r68
            if (r0 == 0) goto L_0x0332
            r0 = r68 | 6
        L_0x0024:
            r4 = r69 & 2
            if (r4 == 0) goto L_0x0325
            r0 = r0 | 48
        L_0x002a:
            r2 = r8 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x003d
            r2 = r69 & 4
            if (r2 != 0) goto L_0x003a
            boolean r3 = r1.AGu(r10)
            r2 = 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x003c
        L_0x003a:
            r2 = 128(0x80, float:1.794E-43)
        L_0x003c:
            r0 = r0 | r2
        L_0x003d:
            r25 = r69 & 8
            if (r25 == 0) goto L_0x0318
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0043:
            r24 = r69 & 16
            if (r24 == 0) goto L_0x0305
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0049:
            r23 = r69 & 32
            r2 = 196608(0x30000, float:2.75506E-40)
            if (r23 != 0) goto L_0x0059
            r2 = r68 & r2
            if (r2 != 0) goto L_0x005a
            r2 = r57
            int r2 = X.G9t.A0T(r1, r2)
        L_0x0059:
            r0 = r0 | r2
        L_0x005a:
            r22 = r69 & 64
            r2 = 1572864(0x180000, float:2.204052E-39)
            if (r22 != 0) goto L_0x0070
            r2 = r68 & r2
            if (r2 != 0) goto L_0x0071
            r2 = r16
            boolean r3 = r1.AGt(r2)
            r2 = 524288(0x80000, float:7.34684E-40)
            if (r3 == 0) goto L_0x0070
            r2 = 1048576(0x100000, float:1.469368E-39)
        L_0x0070:
            r0 = r0 | r2
        L_0x0071:
            r13 = r9 & 128(0x80, float:1.794E-43)
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r13 != 0) goto L_0x0087
            r2 = r68 & r2
            if (r2 != 0) goto L_0x0088
            r2 = r27
            boolean r3 = r1.AGr(r2)
            r2 = 4194304(0x400000, float:5.877472E-39)
            if (r3 == 0) goto L_0x0087
            r2 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0087:
            r0 = r0 | r2
        L_0x0088:
            r12 = r9 & 256(0x100, float:3.59E-43)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r12 != 0) goto L_0x009e
            r2 = r68 & r3
            if (r2 != 0) goto L_0x009f
            r2 = r26
            boolean r2 = r1.AGr(r2)
            r3 = 33554432(0x2000000, float:9.403955E-38)
            if (r2 == 0) goto L_0x009e
            r3 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x009e:
            r0 = r0 | r3
        L_0x009f:
            r2 = 38347923(0x2492493, float:1.4777644E-37)
            r3 = r0 & r2
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r3 != r2) goto L_0x00d8
            boolean r2 = r1.Bwn()
            if (r2 == 0) goto L_0x00d8
            r1.Evl()
        L_0x00b2:
            X.5Xd r1 = r1.ASQ()
            if (r1 == 0) goto L_0x00d7
            X.JBa r0 = new X.JBa
            r30 = r0
            r31 = r29
            r32 = r10
            r33 = r73
            r34 = r57
            r35 = r28
            r36 = r27
            r37 = r26
            r38 = r8
            r39 = r9
            r40 = r18
            r42 = r16
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42)
            r1.A06 = r0
        L_0x00d7:
            return
        L_0x00d8:
            r1.Ewr()
            r2 = r68 & 1
            if (r2 == 0) goto L_0x024a
            boolean r2 = r1.Aw3()
            if (r2 != 0) goto L_0x024a
            int r0 = X.C51971G9r.A06(r1, r9, r0)
        L_0x00e9:
            boolean r2 = X.C51967G9n.A1S(r1)
            if (r2 == 0) goto L_0x00f7
            r3 = 1435487098(0x558fcb7a, float:1.9763011E13)
            java.lang.String r2 = "com.instagram.creator.agent.settings.improveai.CircularProgressIndicator (CircularProgressIndicator.kt:39)"
            X.0fL.A01(r3, r2)
        L_0x00f7:
            r14 = 0
            int r2 = (r65 > r14 ? 1 : (r65 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x0104
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r65 > r2 ? 1 : (r65 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0104
            r14 = 1073741824(0x40000000, float:2.0)
        L_0x0104:
            r13 = 1135869952(0x43b40000, float:360.0)
            float r13 = r13 * r65
            r38 = 0
            long r23 = X.C51966G9m.A0B(r1)
            X.4cd r3 = X.C51968G9o.A0Y(r1)
            r2 = r26
            float r22 = r3.F06(r2)
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            X.5RD r6 = X.C51966G9m.A0a(r38)
            int r5 = X.C287425a7.A00(r1)
            r12 = r1
            X.5Wx r12 = (X.C286565Wx) r12
            X.5RM r2 = X.C286565Wx.A04(r12)
            androidx.compose.ui.Modifier r3 = X.C287435a8.A01(r1, r4)
            X.0sa r11 = X.C287485aD.A00
            X.C51973G9u.A0z(r1, r12, r11)
            X.0sL r7 = X.C287485aD.A03
            X.0sL r21 = X.C51969G9p.A0w(r1, r6, r2, r7)
            X.0sL r6 = X.C287485aD.A02
            boolean r2 = r12.A0K
            if (r2 != 0) goto L_0x0144
            boolean r2 = X.C51972G9s.A1Q(r1, r5)
            if (r2 != 0) goto L_0x0147
        L_0x0144:
            X.C51971G9r.A13(r1, r6, r5)
        L_0x0147:
            X.0sL r20 = X.C51966G9m.A1K(r1, r3)
            X.5dj r15 = X.C289515dj.A00
            r2 = 1173550262(0x45f2f4b6, float:7774.589)
            r1.ExS(r2)
            r2 = r0 & 896(0x380, float:1.256E-42)
            r2 = r2 ^ 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r2 <= r5) goto L_0x0161
            boolean r2 = r1.AGu(r10)
            if (r2 != 0) goto L_0x0166
        L_0x0161:
            r3 = r0 & 384(0x180, float:5.38E-43)
            r2 = 0
            if (r3 != r5) goto L_0x0167
        L_0x0166:
            r2 = 1
        L_0x0167:
            boolean r3 = X.C51975G9x.A1R(r1, r14, r13, r2)
            r2 = r22
            boolean r5 = X.C51966G9m.A1S(r1, r2, r3)
            r2 = r23
            boolean r3 = X.C51966G9m.A1T(r1, r2, r5)
            java.lang.Object r2 = r1.ECw()
            if (r3 != 0) goto L_0x0181
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r2 != r3) goto L_0x0195
        L_0x0181:
            X.Ix5 r2 = new X.Ix5
            r30 = r2
            r31 = r10
            r32 = r14
            r33 = r13
            r34 = r22
            r35 = r23
            r30.<init>(r31, r32, r33, r34, r35)
            r1.FLL(r2)
        L_0x0195:
            X.0sP r13 = X.C51965G9l.A0z(r12, r2)
            int r2 = r0 >> 3
            r5 = r2 & 14
            r3 = r29
            X.C289565do.A00(r1, r3, r13, r5)
            androidx.compose.ui.Modifier r5 = X.C51965G9l.A0L(r15, r4)
            X.5RD r3 = X.C51968G9o.A0X(r1)
            int r14 = X.C287425a7.A00(r1)
            X.5RM r13 = X.C286565Wx.A04(r12)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r1, r5)
            X.C51973G9u.A0z(r1, r12, r11)
            X.C287595aO.A00(r1, r3, r7)
            r3 = r21
            boolean r3 = X.C51965G9l.A1Y(r1, r12, r13, r3)
            if (r3 != 0) goto L_0x01ca
            boolean r3 = X.C51972G9s.A1Q(r1, r14)
            if (r3 != 0) goto L_0x01cd
        L_0x01ca:
            X.C51971G9r.A13(r1, r6, r14)
        L_0x01cd:
            r3 = r20
            X.C287595aO.A00(r1, r5, r3)
            long r45 = X.C51966G9m.A0H(r1)
            X.5ZE r3 = X.AnonymousClass5aQ.A01(r1)
            X.5Z4 r5 = r3.A04
            r31 = 0
            r54 = 0
            r40 = 1
            r49 = 0
            int r3 = r0 >> 9
            r42 = r3 & 14
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r42 = r42 | r2
            r43 = 6
            r44 = 15346(0x3bf2, float:2.1504E-41)
            r30 = r1
            r32 = r5
            r33 = r31
            r34 = r31
            r35 = r31
            r36 = r73
            r37 = r31
            r39 = r38
            r41 = r38
            r47 = r18
            r51 = r38
            X.AnonymousClass5ZZ.A03(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r47, r49, r51)
            long r66 = X.C51966G9m.A0M(r1)
            X.5Z4 r53 = X.C51966G9m.A0b(r1)
            r2 = r27
            androidx.compose.ui.Modifier r52 = X.C51967G9n.A0D(r4, r2)
            int r0 = r0 >> 15
            r63 = r0 & 14
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            r63 = r63 | r0
            r65 = 15344(0x3bf0, float:2.1502E-41)
            r51 = r1
            r55 = r54
            r56 = r54
            r58 = r54
            r60 = r38
            r62 = r38
            r68 = r16
            r72 = r38
            r59 = r38
            r61 = r40
            r64 = r43
            r70 = r49
            X.AnonymousClass5ZZ.A03(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r68, r70, r72)
            boolean r0 = X.C51971G9r.A1R(r1)
            if (r0 == 0) goto L_0x00b2
            r0 = -108685625(0xfffffffff98596c7, float:-8.67042E34)
            X.0fL.A00(r0)
            goto L_0x00b2
        L_0x024a:
            if (r4 == 0) goto L_0x024e
            X.5Qk r29 = androidx.compose.ui.Modifier.A00
        L_0x024e:
            r2 = r69 & 4
            if (r2 == 0) goto L_0x02e1
            r11 = 0
            X.5Yw r2 = X.AnonymousClass5aQ.A00(r1)
            long r6 = r2.A0P
            X.5Yw r2 = X.AnonymousClass5aQ.A00(r1)
            long r4 = r2.A0O
            r2 = 387213555(0x171468f3, float:4.7953844E-25)
            boolean r2 = X.C51967G9n.A1U(r1, r2)
            if (r2 == 0) goto L_0x0270
            r3 = 1771971037(0x699e21dd, float:2.3896274E25)
            java.lang.String r2 = "com.instagram.creator.agent.settings.improveai.rememberSweepingGradientBrush (CircularProgressIndicator.kt:94)"
            X.0fL.A01(r3, r2)
        L_0x0270:
            r2 = 675405870(0x2841e02e, float:1.0762263E-14)
            r1.ExS(r2)
            boolean r2 = r1.AGt(r6)
            boolean r3 = X.C51970G9q.A1U(r2)
            r14 = 32
            boolean r2 = r1.AGt(r4)
            boolean r2 = X.C51970G9q.A1U(r2)
            r2 = r2 | r3
            java.lang.Object r10 = r1.ECw()
            if (r2 != 0) goto L_0x0293
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r10 != r2) goto L_0x02cb
        L_0x0293:
            int r3 = X.C285595Rx.A00(r6)
            int r2 = X.C285595Rx.A00(r4)
            r15 = 1056964608(0x3f000000, float:0.5)
            int r2 = X.2eL.A03(r15, r3, r2)
            long r2 = (long) r2
            long r2 = r2 << r14
            long r20 = X.AnonymousClass5RW.A01
            r10 = 0
            X.0eP r10 = X.C51975G9x.A0s(r10, r2)
            r14 = 1048576000(0x3e800000, float:0.25)
            X.0eP r14 = X.C51975G9x.A0s(r14, r4)
            X.0eP r5 = X.C51975G9x.A0s(r15, r2)
            r4 = 1061158912(0x3f400000, float:0.75)
            X.0eP r6 = X.C51975G9x.A0s(r4, r6)
            r4 = 1065353216(0x3f800000, float:1.0)
            X.0eP r2 = X.C51975G9x.A0s(r4, r2)
            X.0eP[] r2 = new X.0eP[]{r10, r14, r5, r6, r2}
            X.Gex r10 = X.C304796Fg.A02(r2)
            r1.FLL(r10)
        L_0x02cb:
            X.6Ff r10 = (X.C304786Ff) r10
            r3 = r1
            X.5Wx r3 = (X.C286565Wx) r3
            boolean r2 = X.C51967G9n.A1b(r3, r11)
            if (r2 == 0) goto L_0x02dc
            r2 = -545387531(0xffffffffdf7e0bf5, float:-1.8305994E19)
            X.0fL.A00(r2)
        L_0x02dc:
            X.C286565Wx.A0L(r3, r11)
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x02e1:
            java.lang.String r3 = ""
            if (r25 == 0) goto L_0x02e7
            r73 = r3
        L_0x02e7:
            if (r24 == 0) goto L_0x02ef
            r2 = 26
            long r18 = X.AnonymousClass5Z7.A01(r2)
        L_0x02ef:
            if (r23 == 0) goto L_0x02f3
            r57 = r3
        L_0x02f3:
            if (r22 == 0) goto L_0x02fb
            r2 = 12
            long r16 = X.AnonymousClass5Z7.A01(r2)
        L_0x02fb:
            if (r13 == 0) goto L_0x02ff
            r27 = 1082130432(0x40800000, float:4.0)
        L_0x02ff:
            if (r12 == 0) goto L_0x00e9
            r26 = 1094713344(0x41400000, float:12.0)
            goto L_0x00e9
        L_0x0305:
            r2 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0049
            r2 = r18
            boolean r3 = r1.AGt(r2)
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0315
            r2 = 16384(0x4000, float:2.2959E-41)
        L_0x0315:
            r0 = r0 | r2
            goto L_0x0049
        L_0x0318:
            r2 = r8 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0043
            r2 = r73
            int r2 = X.G9t.A0R(r1, r2)
            r0 = r0 | r2
            goto L_0x0043
        L_0x0325:
            r2 = r68 & 48
            if (r2 != 0) goto L_0x002a
            r2 = r29
            int r2 = X.G9t.A0P(r1, r2)
            r0 = r0 | r2
            goto L_0x002a
        L_0x0332:
            r0 = r68 & 6
            if (r0 != 0) goto L_0x0344
            r0 = r28
            boolean r0 = r1.AGr(r0)
            int r0 = X.C51970G9q.A05(r0)
            r0 = r0 | r68
            goto L_0x0024
        L_0x0344:
            r0 = r8
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HZK.A00(X.5Wy, androidx.compose.ui.Modifier, X.6Ff, java.lang.String, java.lang.String, float, float, float, int, int, long, long):void");
    }
}
