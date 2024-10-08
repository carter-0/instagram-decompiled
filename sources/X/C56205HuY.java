package X;

/* renamed from: X.HuY  reason: case insensitive filesystem */
public abstract class C56205HuY {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: X.IxY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: X.IxY} */
    /* JADX WARNING: type inference failed for: r21v1, types: [X.JLF, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b8, code lost:
        if (r2 == X.AnonymousClass5XT.A00) goto L_0x01ba;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r30, X.C59964JcX r31, X.LRW r32, X.0sP r33, int r34) {
        /*
            r0 = 0
            r10 = r31
            r12 = r32
            r1 = r33
            boolean r32 = X.C51973G9u.A1b(r10, r12, r1)
            r2 = 1749041410(0x68404102, float:3.6315742E24)
            r1 = r30
            r1.ExV(r2)
            r9 = r34
            r2 = r34 & 6
            if (r2 != 0) goto L_0x0203
            int r4 = X.C41848B3p.A01(r1, r10)
            r4 = r4 | r34
        L_0x001f:
            r2 = r34 & 48
            if (r2 != 0) goto L_0x0028
            int r2 = X.G9t.A0F(r1, r12)
            r4 = r4 | r2
        L_0x0028:
            r2 = r9 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0033
            r2 = r33
            int r2 = X.G9t.A0G(r1, r2)
            r4 = r4 | r2
        L_0x0033:
            r3 = r4 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r3 != r2) goto L_0x0053
            boolean r2 = r1.Bwn()
            if (r2 == 0) goto L_0x0053
            r1.Evl()
        L_0x0042:
            X.5Xd r2 = r1.ASQ()
            if (r2 == 0) goto L_0x0052
            r1 = 12
        L_0x004a:
            r0 = r33
            X.JGN r0 = X.JGN.A01(r10, r12, r0, r9, r1)
            r2.A06 = r0
        L_0x0052:
            return
        L_0x0053:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0061
            r3 = -742614858(0xffffffffd3bc98b6, float:-1.62003183E12)
            java.lang.String r2 = "com.instagram.aistudio.home.view.section.AiHomeIcebreakerSection (AiHomeIcebreakerSection.kt:50)"
            X.0fL.A01(r3, r2)
        L_0x0061:
            java.lang.Object r7 = r10.A02
            X.Gll r7 = (X.C53299Gll) r7
            java.lang.Object r2 = r10.A01
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r2.iterator()
        L_0x0071:
            boolean r2 = r5.hasNext()
            r15 = 1
            if (r2 == 0) goto L_0x008f
            java.lang.Object r3 = r5.next()
            r2 = r3
            X.GmB r2 = (X.C53325GmB) r2
            java.lang.String r2 = r2.A02
            if (r2 == 0) goto L_0x0071
            boolean r2 = X.00l.A0W(r2)
            if (r2 != 0) goto L_0x0071
            r2 = r16
            r2.add(r3)
            goto L_0x0071
        L_0x008f:
            r2 = 602813920(0x23ee35e0, float:2.5826829E-17)
            r1.ExS(r2)
            boolean r2 = r16.isEmpty()
            if (r2 == 0) goto L_0x00e1
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            X.5RD r3 = X.C51969G9p.A0Z(r1, r0)
            int r6 = X.C287425a7.A00(r1)
            r5 = r1
            X.5Wx r5 = (X.C286565Wx) r5
            X.5RM r2 = X.C286565Wx.A04(r5)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r1, r4)
            X.C51973G9u.A0y(r1, r5)
            X.C51971G9r.A12(r1, r3, r2)
            X.0sL r3 = X.C287485aD.A02
            boolean r2 = r5.A0K
            if (r2 != 0) goto L_0x00c2
            boolean r2 = X.C51972G9s.A1Q(r1, r6)
            if (r2 != 0) goto L_0x00c5
        L_0x00c2:
            X.C51971G9r.A13(r1, r3, r6)
        L_0x00c5:
            X.C51965G9l.A18(r1, r4)
            r1.ASN()
            boolean r0 = X.C51967G9n.A1b(r5, r0)
            if (r0 == 0) goto L_0x00d7
            r0 = -947346504(0xffffffffc788a3b8, float:-69959.44)
            X.0fL.A00(r0)
        L_0x00d7:
            X.5Xd r2 = r1.ASQ()
            if (r2 == 0) goto L_0x0052
            r1 = 11
            goto L_0x004a
        L_0x00e1:
            X.5Wx r5 = X.C51965G9l.A0H(r1, r0)
            r2 = 602823461(0x23ee5b25, float:2.5842613E-17)
            r1.ExS(r2)
            X.4bM r11 = X.C286955Yl.A00
            java.lang.Object r6 = r1.AJO(r11)
            X.0lg r6 = (X.0lg) r6
            X.0Tu r8 = X.0Tu.A05
            r2 = 36325145468547721(0x810d8700113289, double:3.0355064917054085E-306)
            boolean r2 = X.182.A06(r8, r6, r2)
            if (r2 == 0) goto L_0x01f2
            r8 = 2
        L_0x0101:
            X.C286565Wx.A0L(r5, r0)
            r2 = 602832992(0x23ee8060, float:2.585838E-17)
            r1.ExS(r2)
            X.4bM r2 = X.AnonymousClass5YA.A01
            java.lang.Object r11 = r1.AJO(r2)
            X.4ce r11 = (X.C268034ce) r11
            r6 = 1117782016(0x42a00000, float:80.0)
            X.5Z4 r2 = X.C51966G9m.A0b(r1)
            X.5ZC r2 = r2.A00
            long r2 = r2.A04
            float r13 = r11.Ezu(r2)
            X.5Z4 r2 = X.C51966G9m.A0e(r1)
            X.5ZC r2 = r2.A00
            long r2 = r2.A04
            float r3 = r11.Ezu(r2)
            float r2 = (float) r8
            float r3 = r3 * r2
            float r13 = r13 + r3
            r2 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 * r2
            float r6 = r6 + r13
            X.C286565Wx.A0L(r5, r0)
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            X.5RD r11 = X.C51969G9p.A0Z(r1, r0)
            int r14 = X.C287425a7.A00(r1)
            X.5RM r2 = X.C286565Wx.A04(r5)
            androidx.compose.ui.Modifier r13 = X.C287435a8.A01(r1, r3)
            X.C51973G9u.A0y(r1, r5)
            X.C51971G9r.A12(r1, r11, r2)
            X.0sL r11 = X.C287485aD.A02
            boolean r2 = r5.A0K
            if (r2 != 0) goto L_0x015a
            boolean r2 = X.C51972G9s.A1Q(r1, r14)
            if (r2 != 0) goto L_0x015d
        L_0x015a:
            X.C51971G9r.A13(r1, r11, r14)
        L_0x015d:
            X.C51965G9l.A18(r1, r13)
            java.lang.String r13 = r7.A03
            long r23 = X.C51966G9m.A0H(r1)
            X.5Z4 r20 = X.C51966G9m.A0e(r1)
            r22 = 5
            r2 = 1098907648(0x41800000, float:16.0)
            r11 = 1096810496(0x41600000, float:14.0)
            androidx.compose.ui.Modifier r19 = X.C287195Zj.A09(r3, r2, r11)
            r11 = 256(0x100, float:3.59E-43)
            r17 = 0
            r21 = r13
            r18 = r1
            X.AnonymousClass5ZZ.A0P(r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.Modifier r3 = X.C51966G9m.A0T(r3)
            androidx.compose.ui.Modifier r23 = X.C287205Zk.A08(r3, r6)
            r3 = 1082130432(0x40800000, float:4.0)
            X.6Fj r6 = new X.6Fj
            r6.<init>(r2, r3, r2, r3)
            r25 = 1090519040(0x41000000, float:8.0)
            X.6Fc r18 = X.C287275Zs.A01(r25)
            X.IFQ r21 = new X.IFQ
            r21.<init>()
            r3 = -2045411335(0xffffffff86157ff9, float:-2.8117805E-35)
            r2 = r16
            boolean r2 = X.C51967G9n.A1Z(r1, r2, r3)
            r3 = r4 & 896(0x380, float:1.256E-42)
            if (r3 == r11) goto L_0x01a7
            r15 = 0
        L_0x01a7:
            boolean r3 = X.C51973G9u.A1T(r1, r7, r12, r2, r15)
            boolean r2 = r1.AGs(r8)
            r3 = r3 | r2
            java.lang.Object r2 = r1.ECw()
            if (r3 != 0) goto L_0x01ba
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r2 != r3) goto L_0x01ce
        L_0x01ba:
            X.IxY r2 = new X.IxY
            r26 = r2
            r27 = r12
            r28 = r16
            r29 = r33
            r30 = r7
            r31 = r8
            r26.<init>(r27, r28, r29, r30, r31, r32)
            r1.FLL(r2)
        L_0x01ce:
            X.0sP r24 = X.C51965G9l.A0z(r5, r2)
            r26 = 1772544(0x1b0c00, float:2.483863E-39)
            r27 = 404(0x194, float:5.66E-43)
            r20 = r17
            r28 = r0
            r29 = r0
            r19 = r6
            r22 = r1
            X.C56165Htu.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r0 = X.C51967G9n.A1R(r1)
            if (r0 == 0) goto L_0x0042
            r0 = 23850965(0x16befd5, float:4.3334754E-38)
            X.0fL.A00(r0)
            goto L_0x0042
        L_0x01f2:
            java.lang.Object r6 = r1.AJO(r11)
            X.0lg r6 = (X.0lg) r6
            r2 = 36606620445119970(0x820d87000f15e2, double:3.2135124002984555E-306)
            int r8 = X.DbS.A04(r8, r6, r2)
            goto L_0x0101
        L_0x0203:
            r4 = r9
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56205HuY.A00(X.5Wy, X.JcX, X.LRW, X.0sP, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: X.IoN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: X.IoN} */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0171, code lost:
        if (r5 == X.AnonymousClass5XT.A00) goto L_0x0173;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0296  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r47, X.C53325GmB r48, X.C53299Gll r49, X.LRW r50, java.lang.String r51, X.0sP r52, int r53, int r54, int r55) {
        /*
            r1 = 110883455(0x69bf27f, float:5.8660836E-35)
            r0 = r47
            r0.ExV(r1)
            r7 = r55
            r1 = r55 & 6
            r47 = r52
            if (r1 != 0) goto L_0x031d
            r1 = r47
            int r1 = X.C41848B3p.A01(r0, r1)
            r1 = r1 | r55
        L_0x0018:
            r2 = r55 & 48
            r8 = r48
            if (r2 != 0) goto L_0x0023
            int r2 = X.G9t.A0F(r0, r8)
            r1 = r1 | r2
        L_0x0023:
            r2 = r7 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x002e
            r2 = r49
            int r2 = X.G9t.A0G(r0, r2)
            r1 = r1 | r2
        L_0x002e:
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            r48 = r50
            if (r2 != 0) goto L_0x003b
            r2 = r48
            int r2 = X.G9t.A0H(r0, r2)
            r1 = r1 | r2
        L_0x003b:
            r2 = r7 & 24576(0x6000, float:3.4438E-41)
            r34 = r53
            if (r2 != 0) goto L_0x0048
            r2 = r34
            int r2 = X.G9t.A09(r0, r2)
            r1 = r1 | r2
        L_0x0048:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r55 & r2
            r32 = r51
            if (r2 != 0) goto L_0x0057
            r2 = r32
            int r2 = X.G9t.A0T(r0, r2)
            r1 = r1 | r2
        L_0x0057:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r55 & r2
            r22 = r54
            if (r2 != 0) goto L_0x0066
            r2 = r22
            int r2 = X.G9t.A0B(r0, r2)
            r1 = r1 | r2
        L_0x0066:
            r2 = 599187(0x92493, float:8.3964E-40)
            r3 = r1 & r2
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r3 != r2) goto L_0x0097
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x0097
            r0.Evl()
        L_0x0079:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x0096
            X.J9V r0 = new X.J9V
            r9 = r0
            r10 = r8
            r11 = r49
            r12 = r48
            r13 = r32
            r14 = r47
            r15 = r34
            r16 = r22
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r1.A06 = r0
        L_0x0096:
            return
        L_0x0097:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00a5
            r3 = 214878175(0xccec7df, float:3.1859619E-31)
            java.lang.String r2 = "com.instagram.aistudio.home.view.section.HomeIceBreakerItem (AiHomeIcebreakerSection.kt:114)"
            X.0fL.A01(r3, r2)
        L_0x00a5:
            X.5ZQ r21 = X.AnonymousClass5ZN.A00()
            X.0lg r5 = X.C51969G9p.A0j(r0)
            float r10 = X.C51972G9s.A01(r0)
            X.0Tu r4 = X.0Tu.A05
            r2 = 37169570398142967(0x840d87000901f7, double:3.569524217407712E-306)
            float r2 = X.C51965G9l.A00(r4, r5, r2)
            float r10 = r10 * r2
            r15 = 1098907648(0x41800000, float:16.0)
            r2 = 515219736(0x1eb5a118, float:1.9230747E-20)
            r0.ExS(r2)
            X.4bM r11 = X.AnonymousClass5YA.A01
            X.4cd r18 = X.C51966G9m.A0j(r0, r11)
            java.lang.String r14 = r8.A02
            r38 = r14
            java.lang.String r20 = ""
            if (r14 != 0) goto L_0x00d5
            r14 = r20
        L_0x00d5:
            r2 = 957195292(0x390da41c, float:1.3507943E-4)
            boolean r2 = X.C51967G9n.A1U(r0, r2)
            if (r2 == 0) goto L_0x00e6
            r3 = -234730478(0xfffffffff2024c12, float:-2.580801E30)
            java.lang.String r2 = "com.instagram.aistudio.home.view.section.getDynamicIcebreakerWidth (AiHomeIcebreakerSection.kt:191)"
            X.0fL.A01(r3, r2)
        L_0x00e6:
            r4 = 0
            r13 = 1
            X.I0i r12 = X.C54750HRi.A00(r0)
            r2 = 458200079(0x1b4f940f, float:1.7170479E-22)
            r0.ExS(r2)
            r2 = r22
            if (r2 != r13) goto L_0x029e
            X.5Z4 r2 = X.C51966G9m.A0h(r0)
            X.62f r2 = X.C56535I0i.A00(r12, r2, r14)
            long r2 = r2.A02
            int r9 = X.C51965G9l.A04(r2)
            r3 = r0
            X.5Wx r3 = (X.C286565Wx) r3
            boolean r2 = X.C51967G9n.A1b(r3, r4)
            if (r2 == 0) goto L_0x0113
            r2 = -1850583597(0xffffffff91b255d3, float:-2.8136341E-28)
        L_0x0110:
            X.0fL.A00(r2)
        L_0x0113:
            X.C286565Wx.A0L(r3, r4)
            r2 = r18
            float r5 = r2.Ezw(r9)
            X.C286565Wx.A0L(r3, r4)
            r0.AJO(r11)
            r14 = 1073741824(0x40000000, float:2.0)
            float r2 = r14 * r15
            float r5 = r5 + r2
            float r9 = java.lang.Math.min(r5, r10)
            X.5Qk r11 = androidx.compose.ui.Modifier.A00
            r19 = 1082130432(0x40800000, float:4.0)
            r33 = 0
            r2 = 0
            boolean r30 = X.C51975G9x.A1M(r19)
            long r26 = X.AnonymousClass5RV.A00
            r23 = r11
            r24 = r21
            r25 = r19
            r28 = r26
            androidx.compose.ui.Modifier r12 = X.C56169Hty.A01(r23, r24, r25, r26, r28, r30)
            long r5 = X.C51966G9m.A08(r0)
            r10 = r21
            androidx.compose.ui.Modifier r5 = X.C304766Fd.A01(r12, r10, r5)
            androidx.compose.ui.Modifier r9 = X.C287205Zk.A0D(r5, r9)
            r5 = 515239650(0x1eb5eee2, float:1.926292E-20)
            boolean r6 = X.C51974G9v.A1X(r0, r5, r1)
            r5 = r48
            boolean r6 = X.G9t.A1a(r0, r8, r5, r6)
            boolean r5 = X.C51974G9v.A1W(r1)
            r6 = r6 | r5
            boolean r5 = X.C51974G9v.A1T(r1)
            r6 = r6 | r5
            java.lang.Object r5 = r0.ECw()
            if (r6 != 0) goto L_0x0173
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r5 != r6) goto L_0x0189
        L_0x0173:
            X.IoN r5 = new X.IoN
            r23 = r5
            r24 = r48
            r25 = r47
            r26 = r8
            r27 = r32
            r28 = r34
            r29 = r4
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r0.FLL(r5)
        L_0x0189:
            androidx.compose.ui.Modifier r5 = X.G9w.A0C(r0, r3, r9, r5)
            androidx.compose.ui.Modifier r6 = X.C287195Zj.A09(r5, r15, r2)
            X.5a0 r5 = X.C287275Zs.A02
            X.5RD r10 = X.G9w.A0L(r5, r0)
            int r13 = X.C287425a7.A00(r0)
            X.5RM r5 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r0, r6)
            X.0sa r9 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r3, r9)
            X.0sL r6 = X.C287485aD.A03
            X.0sL r18 = X.C51969G9p.A0w(r0, r10, r5, r6)
            X.0sL r5 = X.C287485aD.A02
            boolean r10 = r3.A0K
            if (r10 != 0) goto L_0x01ba
            boolean r10 = X.C51972G9s.A1Q(r0, r13)
            if (r10 != 0) goto L_0x01bd
        L_0x01ba:
            X.C51971G9r.A13(r0, r5, r13)
        L_0x01bd:
            X.0sL r17 = X.C51966G9m.A1K(r0, r12)
            java.lang.String r13 = r8.A06
            X.Kp1 r12 = r8.A00
            java.lang.String r29 = r12.A01()
            java.lang.String r10 = r8.A05
            r21 = r10
            r10 = r49
            int r10 = r10.A00
            java.lang.Integer r27 = java.lang.Integer.valueOf(r10)
            com.instagram.api.schemas.IGAIAgentType r25 = r12.A00()
            r10 = r49
            X.Kiw r10 = r10.A01
            int r16 = r1 >> 9
            r35 = r16 & 14
            r12 = 196608(0x30000, float:2.75506E-40)
            r35 = r35 | r12
            r12 = r16 & 112(0x70, float:1.57E-43)
            r35 = r35 | r12
            r16 = 3670016(0x380000, float:5.142788E-39)
            int r12 = r1 << 3
            r12 = r12 & r16
            r35 = r35 | r12
            r37 = 512(0x200, float:7.175E-43)
            java.lang.String r31 = "home"
            r23 = r0
            r24 = r48
            r26 = r10
            r28 = r13
            r30 = r21
            r36 = r4
            X.HT3.A00(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.5Zp r12 = X.C287215Zl.A04
            X.5Zu r10 = X.C287275Zs.A01
            r16 = 48
            r4 = r16
            X.5RD r13 = X.C287395a4.A02(r10, r0, r12, r4)
            int r12 = X.C287425a7.A00(r0)
            X.5RM r10 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r11)
            X.C51973G9u.A0z(r0, r3, r9)
            X.C287595aO.A00(r0, r13, r6)
            r6 = r18
            boolean r3 = X.C51965G9l.A1Y(r0, r3, r10, r6)
            if (r3 != 0) goto L_0x0230
            boolean r3 = X.C51972G9s.A1Q(r0, r12)
            if (r3 != 0) goto L_0x0233
        L_0x0230:
            X.C51971G9r.A13(r0, r5, r12)
        L_0x0233:
            r3 = r17
            X.C287595aO.A00(r0, r4, r3)
            java.lang.String r3 = r8.A03
            X.2DN r6 = X.C51975G9x.A0W(r0, r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            X.GS6 r5 = new X.GS6
            r5.<init>(r15, r15, r14, r3)
            r3 = r19
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A0B(r11, r2, r2, r3, r2)
            r3 = 432(0x1b0, float:6.05E-43)
            X.GRY.A02(r0, r4, r6, r5, r3)
            r4 = 2131952622(0x7f1303ee, float:1.9541692E38)
            r3 = r21
            java.lang.String r6 = X.C51968G9o.A14(r0, r3, r4)
            long r3 = X.C51966G9m.A0M(r0)
            X.5Z4 r5 = X.C51966G9m.A0b(r0)
            r41 = 2
            X.AnonymousClass5ZZ.A0v(r0, r5, r6, r3)
            r0.ASN()
            if (r38 != 0) goto L_0x026d
            r38 = r20
        L_0x026d:
            long r45 = X.C51966G9m.A0H(r0)
            X.5Z4 r37 = X.C51966G9m.A0h(r0)
            r3 = r19
            androidx.compose.ui.Modifier r36 = X.C287195Zj.A0B(r11, r2, r3, r2, r2)
            r39 = 5
            int r1 = r1 >> 18
            r1 = r1 & 14
            r1 = r1 | 384(0x180, float:5.38E-43)
            r44 = 11128(0x2b78, float:1.5594E-41)
            r35 = r0
            r40 = r22
            r42 = r16
            r43 = r1
            X.AnonymousClass5ZZ.A0B(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            boolean r1 = X.C51967G9n.A1R(r0)
            if (r1 == 0) goto L_0x0079
            r1 = 184163223(0xafa1b97, float:2.4084502E-32)
            X.0fL.A00(r1)
            goto L_0x0079
        L_0x029e:
            X.5Wx r3 = X.C51965G9l.A0H(r0, r4)
            int r6 = r14.length()
            int r17 = r6 / r54
            r2 = 458209465(0x1b4fb8b9, float:1.7182326E-22)
            r0.ExS(r2)
            r5 = 0
            r16 = 0
        L_0x02b1:
            if (r5 >= r6) goto L_0x0301
            int r2 = r14.codePointAt(r5)
            char r2 = (char) r2
            r9 = 458213004(0x1b4fc68c, float:1.7186793E-22)
            r0.ExS(r9)
            r9 = 32
            if (r2 != r9) goto L_0x02fb
            r2 = r17
            if (r5 < r2) goto L_0x02f9
            int r2 = r6 - r16
            int r2 = r2 - r13
            if (r5 <= r2) goto L_0x02f4
            int r2 = r16 + 1
            int r5 = r6 - r13
            int r2 = java.lang.Math.min(r2, r5)
            java.lang.String r5 = r14.substring(r2, r6)
        L_0x02d7:
            X.0qQ.A07(r5)
            X.5Z4 r2 = X.C51966G9m.A0h(r0)
            X.62f r2 = X.C56535I0i.A00(r12, r2, r5)
            long r5 = r2.A02
            long r5 = r5 >> r9
            int r9 = (int) r5
            X.C286565Wx.A0L(r3, r4)
            boolean r2 = X.C51967G9n.A1b(r3, r4)
            if (r2 == 0) goto L_0x0113
            r2 = 781647696(0x2e96ff50, float:6.866563E-11)
            goto L_0x0110
        L_0x02f4:
            java.lang.String r5 = r14.substring(r4, r5)
            goto L_0x02d7
        L_0x02f9:
            r16 = r5
        L_0x02fb:
            X.C286565Wx.A0L(r3, r4)
            int r5 = r5 + 1
            goto L_0x02b1
        L_0x0301:
            X.C286565Wx.A0L(r3, r4)
            X.5Z4 r2 = X.C51966G9m.A0h(r0)
            X.62f r2 = X.C56535I0i.A00(r12, r2, r14)
            long r5 = r2.A02
            int r9 = X.C51965G9l.A04(r5)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x0113
            r2 = -1712466463(0xffffffff99edd5e1, float:-2.459161E-23)
            goto L_0x0110
        L_0x031d:
            r1 = r7
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56205HuY.A01(X.5Wy, X.GmB, X.Gll, X.LRW, java.lang.String, X.0sP, int, int, int):void");
    }
}
