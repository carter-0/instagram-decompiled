package X;

/* renamed from: X.5dn  reason: invalid class name and case insensitive filesystem */
public abstract class C289555dn {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: X.9MM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: X.9MM} */
    /* JADX WARNING: type inference failed for: r0v35 */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0278, code lost:
        if (r1 == 256) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r9.AGu(r5) == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0289, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x028b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r22, androidx.compose.ui.Modifier r23, X.C289545dm r24, X.C289485df r25, float r26, int r27, int r28) {
        /*
            r20 = r26
            r5 = r24
            r21 = r23
            r6 = 0
            r8 = r25
            X.0qQ.A0B(r8, r6)
            r0 = 131249137(0x7d2b3f1, float:3.1703048E-34)
            r9 = r22
            r9.ExV(r0)
            r22 = r28
            r0 = r28 & 1
            r7 = r27
            if (r0 == 0) goto L_0x034e
            r0 = r27 | 6
        L_0x001e:
            r3 = r28 & 2
            if (r3 == 0) goto L_0x033b
            r0 = r0 | 48
        L_0x0024:
            r1 = r7 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0037
            r1 = r28 & 4
            if (r1 != 0) goto L_0x0034
            boolean r2 = r9.AGu(r5)
            r1 = 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0036:
            r0 = r0 | r1
        L_0x0037:
            r10 = r28 & 8
            if (r10 == 0) goto L_0x0328
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x003d:
            r2 = r0 & 1171(0x493, float:1.641E-42)
            r1 = 1170(0x492, float:1.64E-42)
            if (r2 != r1) goto L_0x0064
            boolean r1 = r9.Bwn()
            if (r1 == 0) goto L_0x0064
            r9.Evl()
        L_0x004c:
            X.5Xd r1 = r9.ASQ()
            if (r1 == 0) goto L_0x0063
            X.5dt r0 = new X.5dt
            r16 = r0
            r17 = r21
            r18 = r5
            r19 = r8
            r21 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x0061:
            r1.A06 = r0
        L_0x0063:
            return
        L_0x0064:
            r9.Ewr()
            r1 = r27 & 1
            if (r1 == 0) goto L_0x0172
            boolean r1 = r9.Aw3()
            if (r1 != 0) goto L_0x0172
            r9.Evl()
            r1 = r28 & 4
            if (r1 == 0) goto L_0x007a
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x007a:
            r9.ASM()
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x008b
            r2 = -1019803381(0xffffffffc337090b, float:-183.03532)
            java.lang.String r1 = "com.instagram.compose.igds.components.stepperdots.IgdsStepperDots (IgdsStepperDots.kt:46)"
            X.0fL.A01(r2, r1)
        L_0x008b:
            int r2 = r8.A01
            X.5dh r1 = r8.A02
            r24 = r1
            int r1 = r24.BI6()
            if (r1 < 0) goto L_0x02b9
            if (r1 >= r2) goto L_0x02b9
            float r14 = r5.A01
            r1 = r20
            int r1 = java.lang.Float.compare(r1, r14)
            if (r1 > 0) goto L_0x02b9
            r18 = 1065353216(0x3f800000, float:1.0)
            boolean r1 = r8.A07
            r19 = r1
            if (r1 == 0) goto L_0x00b1
            float r18 = r14 - r20
            r1 = 1073741824(0x40000000, float:2.0)
            float r18 = r18 / r1
        L_0x00b1:
            androidx.compose.ui.Alignment r1 = X.C287215Zl.A0E
            X.5RD r10 = X.C287675aa.A00(r1, r6)
            int r11 = X.C287425a7.A00(r9)
            r13 = r9
            X.5Wx r13 = (X.C286565Wx) r13
            X.5RM r4 = X.C286565Wx.A04(r13)
            r1 = r21
            androidx.compose.ui.Modifier r3 = X.C287435a8.A01(r9, r1)
            X.0sa r2 = X.C287485aD.A00
            r9.ExX()
            boolean r1 = r13.A0K
            if (r1 == 0) goto L_0x016d
            r9.AMT(r2)
        L_0x00d4:
            X.0sL r1 = X.C287485aD.A03
            X.C287595aO.A00(r9, r10, r1)
            X.0sL r1 = X.C287485aD.A05
            X.C287595aO.A00(r9, r4, r1)
            X.0sL r4 = X.C287485aD.A02
            boolean r1 = r13.A0K
            if (r1 != 0) goto L_0x00f2
            java.lang.Object r2 = r9.ECw()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x00fc
        L_0x00f2:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r9.FLL(r1)
            r9.ABr(r1, r4)
        L_0x00fc:
            X.0sL r1 = X.C287485aD.A04
            X.C287595aO.A00(r9, r3, r1)
            X.5dj r17 = X.C289515dj.A00
            r12 = 0
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            X.5dh r1 = r8.A05
            int r11 = r1.BI6()
            X.5dh r1 = r8.A03
            r23 = r1
            int r15 = r23.BI6()
            if (r11 > r15) goto L_0x01b9
        L_0x0119:
            int r1 = r24.BI6()
            if (r1 != r11) goto L_0x016a
            long r3 = r5.A02
        L_0x0121:
            if (r19 == 0) goto L_0x0168
            int r1 = r24.BI6()
            if (r11 == r1) goto L_0x0168
            X.5dh r1 = r8.A06
            int r10 = r1.BI6()
            X.5dh r1 = r8.A04
            int r2 = r1.BI6()
            r1 = r14
            if (r11 >= r10) goto L_0x0163
            int r10 = r10 - r11
        L_0x0139:
            float r1 = (float) r10
            float r1 = r18 * r1
            float r1 = r14 - r1
        L_0x013e:
            int r2 = r23.BI6()
            if (r11 != r2) goto L_0x0160
            r2 = 0
        L_0x0145:
            float r2 = r2 + r1
            float r12 = r12 + r2
            X.5d0 r2 = new X.5d0
            r2.<init>(r1)
            X.5RW r1 = new X.5RW
            r1.<init>(r3)
            X.0eP r3 = new X.0eP
            r3.<init>(r2, r1)
            r1 = r16
            r1.add(r3)
            if (r11 == r15) goto L_0x01b9
            int r11 = r11 + 1
            goto L_0x0119
        L_0x0160:
            float r2 = r5.A00
            goto L_0x0145
        L_0x0163:
            if (r11 <= r2) goto L_0x013e
            int r10 = r11 - r2
            goto L_0x0139
        L_0x0168:
            r1 = r14
            goto L_0x013e
        L_0x016a:
            long r3 = r5.A03
            goto L_0x0121
        L_0x016d:
            r9.FMk()
            goto L_0x00d4
        L_0x0172:
            if (r3 == 0) goto L_0x0176
            X.5Qk r21 = androidx.compose.ui.Modifier.A00
        L_0x0176:
            r1 = r28 & 4
            if (r1 == 0) goto L_0x01b3
            r1 = -42060677(0xfffffffffd7e347b, float:-2.1118525E37)
            r9.ExS(r1)
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x018e
            r2 = -836210718(0xffffffffce286fe2, float:-7.0647616E8)
            java.lang.String r1 = "com.instagram.compose.igds.components.stepperdots.<get-DEFAULT_DOT_CONFIG> (IgdsStepperDots.kt:143)"
            X.0fL.A01(r2, r1)
        L_0x018e:
            X.5Yw r1 = X.AnonymousClass5aQ.A00(r9)
            long r3 = r1.A0l
            X.5Yw r1 = X.AnonymousClass5aQ.A00(r9)
            long r1 = r1.A0w
            X.5dm r5 = new X.5dm
            r5.<init>(r3, r1)
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x01ab
            r1 = -826219137(0xffffffffcec0e57f, float:-1.61813286E9)
            X.0fL.A00(r1)
        L_0x01ab:
            r1 = r9
            X.5Wx r1 = (X.C286565Wx) r1
            X.C286565Wx.A0L(r1, r6)
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x01b3:
            if (r10 == 0) goto L_0x007a
            r20 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x01b9:
            X.4bM r10 = X.AnonymousClass5YA.A07
            X.5RM r1 = X.C286565Wx.A04(r13)
            java.lang.Object r1 = X.C286615Xc.A01(r10, r1)
            X.5Q8 r4 = X.AnonymousClass5Q8.Rtl
            if (r1 != r4) goto L_0x01ca
            X.00v.A10(r16)
        L_0x01ca:
            int r2 = r24.BI6()
            r1 = -473599424(0xffffffffe3c57240, float:-7.2844823E21)
            r9.ExS(r1)
            boolean r1 = r9.AGs(r2)
            java.lang.Object r3 = r9.ECw()
            r14 = 0
            if (r1 != 0) goto L_0x01e3
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r3 != r1) goto L_0x01eb
        L_0x01e3:
            r1 = 0
            X.5b4 r3 = X.C287705ad.A00(r1)
            r9.FLL(r3)
        L_0x01eb:
            X.C286565Wx.A0L(r13, r6)
            r1 = -473596989(0xffffffffe3c57bc3, float:-7.285853E21)
            r9.ExS(r1)
            int r1 = r8.A00
            if (r1 == 0) goto L_0x0238
            java.lang.Object r2 = r9.ECw()
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r2 != r1) goto L_0x020e
            X.19B r2 = X.19B.A00
            X.19S r11 = X.C286645Xf.A00(r9, r2)
            X.6FV r2 = new X.6FV
            r2.<init>(r11)
            r9.FLL(r2)
        L_0x020e:
            X.6FV r2 = (X.AnonymousClass6FV) r2
            X.4Cq r11 = r2.A00
            r2 = -473593058(0xffffffffe3c58b1e, float:-7.288066E21)
            r9.ExS(r2)
            boolean r15 = r9.AGw(r3)
            java.lang.Object r2 = r9.ECw()
            if (r15 != 0) goto L_0x0224
            if (r2 != r1) goto L_0x022e
        L_0x0224:
            r1 = 31
            X.MG7 r2 = new X.MG7
            r2.<init>(r3, r14, r1)
            r9.FLL(r2)
        L_0x022e:
            X.0sL r2 = (X.0sL) r2
            X.C286565Wx.A0L(r13, r6)
            X.19B r1 = X.19B.A00
            X.1Eo.A05(r1, r2, r11)
        L_0x0238:
            X.C286565Wx.A0L(r13, r6)
            X.5RM r1 = X.C286565Wx.A04(r13)
            java.lang.Object r1 = X.C286615Xc.A01(r10, r1)
            int r2 = r8.A00
            if (r1 != r4) goto L_0x0248
            int r2 = -r2
        L_0x0248:
            X.5Qk r10 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Alignment r4 = X.C287215Zl.A09
            r1 = r17
            androidx.compose.ui.Modifier r1 = r1.AAz(r4, r10)
            androidx.compose.ui.Modifier r4 = X.C287205Zk.A0D(r1, r12)
            r1 = -473580805(0xffffffffe3c5bafb, float:-7.294964E21)
            r9.ExS(r1)
            r1 = r16
            boolean r11 = r9.AGw(r1)
            boolean r1 = r9.AGs(r2)
            r11 = r11 | r1
            r1 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 ^ 384(0x180, float:5.38E-43)
            r10 = 256(0x100, float:3.59E-43)
            if (r1 <= r10) goto L_0x0275
            boolean r1 = r9.AGu(r5)
            if (r1 != 0) goto L_0x027a
        L_0x0275:
            r1 = r0 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r10) goto L_0x027b
        L_0x027a:
            r0 = 1
        L_0x027b:
            r11 = r11 | r0
            boolean r0 = r9.AGw(r3)
            r11 = r11 | r0
            java.lang.Object r0 = r9.ECw()
            if (r11 != 0) goto L_0x028b
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x029f
        L_0x028b:
            r25 = 1
            X.9MM r0 = new X.9MM
            r26 = r3
            r27 = r5
            r28 = r16
            r23 = r0
            r24 = r2
            r23.<init>(r24, r25, r26, r27, r28)
            r9.FLL(r0)
        L_0x029f:
            X.0sP r0 = (X.0sP) r0
            X.C286565Wx.A0L(r13, r6)
            X.C289565do.A00(r9, r4, r0, r6)
            r0 = 1
            X.C286565Wx.A0L(r13, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004c
            r0 = -2085622583(0xffffffff83afecc9, float:-1.0339939E-36)
            X.0fL.A00(r0)
            goto L_0x004c
        L_0x02b9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid input for IgdsStepperDots. Current index: "
            r1.append(r0)
            int r0 = r24.BI6()
            r1.append(r0)
            java.lang.String r0 = ". Total dots: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ". Max visible dots: "
            r1.append(r0)
            r0 = 5
            r1.append(r0)
            java.lang.String r0 = ". Min dot size "
            r1.append(r0)
            java.lang.String r0 = X.C289095d0.A00(r20)
            r1.append(r0)
            java.lang.String r0 = " vs. config dot size: "
            r1.append(r0)
            float r0 = r5.A01
            java.lang.String r0 = X.C289095d0.A00(r0)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "IgdsStepperDots"
            X.0wb.A03(r0, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x030f
            r0 = -428787870(0xffffffffe6713762, float:-2.8477799E23)
            X.0fL.A00(r0)
        L_0x030f:
            X.5Xd r1 = r9.ASQ()
            if (r1 == 0) goto L_0x0063
            r23 = 1
            X.J9B r0 = new X.J9B
            r16 = r0
            r17 = r5
            r18 = r8
            r19 = r21
            r21 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x0061
        L_0x0328:
            r1 = r7 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x003d
            r1 = r20
            boolean r2 = r9.AGr(r1)
            r1 = 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0338
            r1 = 2048(0x800, float:2.87E-42)
        L_0x0338:
            r0 = r0 | r1
            goto L_0x003d
        L_0x033b:
            r1 = r27 & 48
            if (r1 != 0) goto L_0x0024
            r1 = r21
            boolean r2 = r9.AGu(r1)
            r1 = 16
            if (r2 == 0) goto L_0x034b
            r1 = 32
        L_0x034b:
            r0 = r0 | r1
            goto L_0x0024
        L_0x034e:
            r0 = r27 & 6
            if (r0 != 0) goto L_0x035e
            boolean r1 = r9.AGw(r8)
            r0 = 2
            if (r1 == 0) goto L_0x035a
            r0 = 4
        L_0x035a:
            r0 = r0 | r27
            goto L_0x001e
        L_0x035e:
            r0 = r7
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C289555dn.A00(X.5Wy, androidx.compose.ui.Modifier, X.5dm, X.5df, float, int, int):void");
    }
}
