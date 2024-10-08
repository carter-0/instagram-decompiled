package X;

public abstract class HXP {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: X.MGA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: X.MGA} */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0163, code lost:
        if (r9 == r8) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0165, code lost:
        r21 = new X.MGA((java.lang.Object) r5, (X.AnonymousClass4D7) null, 13, r27);
        r3.FLL(r21);
        r21 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0175, code lost:
        X.C51968G9o.A1E(r3, r0, r9, r11);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r28, java.lang.String r29, int r30, long r31, boolean r33, boolean r34, boolean r35) {
        /*
            r0 = 24528450(0x1764642, float:4.5233472E-38)
            r3 = r28
            r3.ExV(r0)
            r2 = r30
            r0 = r30 & 6
            r20 = r33
            if (r0 != 0) goto L_0x01ea
            r0 = r20
            int r9 = X.G9t.A0Y(r3, r0)
            r9 = r9 | r30
        L_0x0018:
            r0 = r30 & 48
            r19 = r34
            if (r0 != 0) goto L_0x0025
            r0 = r19
            int r0 = X.G9t.A0Z(r3, r0)
            r9 = r9 | r0
        L_0x0025:
            r0 = r2 & 384(0x180, float:5.38E-43)
            r27 = r31
            if (r0 != 0) goto L_0x0032
            r0 = r27
            int r0 = X.G9t.A0D(r3, r0)
            r9 = r9 | r0
        L_0x0032:
            r0 = r2 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x003d
            r0 = r29
            int r0 = X.G9t.A0R(r3, r0)
            r9 = r9 | r0
        L_0x003d:
            r0 = r2 & 24576(0x6000, float:3.4438E-41)
            r18 = r35
            if (r0 != 0) goto L_0x004a
            r0 = r18
            int r0 = X.G9t.A0c(r3, r0)
            r9 = r9 | r0
        L_0x004a:
            r1 = r9 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r0) goto L_0x0072
            boolean r0 = r3.Bwn()
            if (r0 == 0) goto L_0x0072
            r3.Evl()
        L_0x0059:
            X.5Xd r0 = r3.ASQ()
            if (r0 == 0) goto L_0x0071
            X.J86 r3 = new X.J86
            r6 = r27
            r8 = r20
            r9 = r19
            r10 = r18
            r4 = r29
            r5 = r2
            r3.<init>(r4, r5, r6, r8, r9, r10)
            r0.A06 = r3
        L_0x0071:
            return
        L_0x0072:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0080
            r1 = 1774924715(0x69cb33ab, float:3.0706992E25)
            java.lang.String r0 = "com.instagram.compose.igds.components.navigation.actionbar.InstagramLogoTitle (InstagramLogoTitle.kt:86)"
            X.0fL.A01(r1, r0)
        L_0x0080:
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
            r1 = 0
            androidx.compose.ui.Alignment r0 = X.C287215Zl.A09
            androidx.compose.ui.Modifier r5 = X.C287205Zk.A02(r0, r7)
            X.5RD r8 = X.C51975G9x.A0L(r3)
            int r6 = X.C287425a7.A00(r3)
            r0 = r3
            X.5Wx r0 = (X.C286565Wx) r0
            X.5RM r4 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r3, r5)
            X.0sa r13 = X.C287485aD.A00
            X.C51973G9u.A0z(r3, r0, r13)
            X.0sL r12 = X.C287485aD.A03
            X.0sL r17 = X.C51969G9p.A0w(r3, r8, r4, r12)
            X.0sL r11 = X.C287485aD.A02
            boolean r4 = r0.A0K
            if (r4 != 0) goto L_0x00b3
            boolean r4 = X.C51972G9s.A1Q(r3, r6)
            if (r4 != 0) goto L_0x00b6
        L_0x00b3:
            X.C51971G9r.A13(r3, r11, r6)
        L_0x00b6:
            X.0sL r16 = X.C51966G9m.A1K(r3, r5)
            r6 = 0
            if (r35 != 0) goto L_0x01d3
            if (r34 == 0) goto L_0x01d3
            r4 = 626514398(0x2557d9de, float:1.8722094E-16)
            r3.ExS(r4)
            r4 = -1919452508(0xffffffff8d977aa4, float:-9.335618E-31)
            java.lang.Object r5 = X.C51967G9n.A0m(r3, r4)
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r5 != r8) goto L_0x00d9
            r4 = 1065353216(0x3f800000, float:1.0)
            X.5b4 r5 = X.C287705ad.A00(r4)
        L_0x00d6:
            r3.FLL(r5)
        L_0x00d9:
            X.5b4 r5 = (X.AnonymousClass5b4) r5
            X.C286565Wx.A0L(r0, r1)
            X.C286565Wx.A0L(r0, r1)
            X.5RD r4 = X.C51966G9m.A0a(r1)
            int r14 = X.C287425a7.A00(r3)
            X.5RM r15 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r3, r7)
            X.C51973G9u.A0z(r3, r0, r13)
            X.C287595aO.A00(r3, r4, r12)
            r4 = r17
            boolean r4 = X.C51965G9l.A1Y(r3, r0, r15, r4)
            if (r4 != 0) goto L_0x0105
            boolean r4 = X.C51972G9s.A1Q(r3, r14)
            if (r4 != 0) goto L_0x0108
        L_0x0105:
            X.C51971G9r.A13(r3, r11, r14)
        L_0x0108:
            r4 = r16
            X.C287595aO.A00(r3, r10, r4)
            r4 = 934028211(0x37ac23b3, float:2.0520622E-5)
            r3.ExS(r4)
            if (r34 == 0) goto L_0x01cf
            r12 = 1107296256(0x42000000, float:32.0)
            X.5Z4 r4 = X.C51966G9m.A0e(r3)
            X.5ZC r4 = r4.A00
            long r10 = r4.A04
            float r4 = X.AnonymousClass5Z5.A00(r10)
            float r4 = X.C51967G9n.A00(r12, r4)
            float r10 = java.lang.Math.max(r4, r6)
            r23 = 0
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A0B(r7, r6, r6, r6, r10)
            float r4 = X.C51975G9x.A00(r5)
            androidx.compose.ui.Modifier r12 = X.HRF.A00(r11, r4)
            long r16 = X.C51966G9m.A0H(r3)
            X.5Z4 r13 = X.C51966G9m.A0e(r3)
            r4 = 1065353216(0x3f800000, float:1.0)
            int r11 = r9 >> 9
            r15 = r11 & 14
            r11 = r3
            r14 = r29
            X.AnonymousClass5ZZ.A0M(r11, r12, r13, r14, r15, r16)
            if (r35 == 0) goto L_0x0178
            X.0gF r11 = X.C60340gF.A00
            r12 = 934044375(0x37ac62d7, float:2.0550024E-5)
            boolean r12 = X.C51967G9n.A1Z(r3, r5, r12)
            boolean r9 = X.C51973G9u.A1I(r9)
            r12 = r12 | r9
            java.lang.Object r9 = r3.ECw()
            if (r12 != 0) goto L_0x0165
            if (r9 != r8) goto L_0x0175
        L_0x0165:
            r24 = 13
            X.MGA r9 = new X.MGA
            r21 = r9
            r22 = r5
            r25 = r27
            r21.<init>((java.lang.Object) r22, (X.AnonymousClass4D7) r23, (int) r24, (long) r25)
            r3.FLL(r9)
        L_0x0175:
            X.C51968G9o.A1E(r3, r0, r9, r11)
        L_0x0178:
            X.C286565Wx.A0L(r0, r1)
            r8 = 934050823(0x37ac7c07, float:2.0561753E-5)
            r3.ExS(r8)
            X.5b5 r9 = r5.A04
            float r5 = X.C51975G9x.A01(r9)
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x019e
            r5 = 2131239336(0x7f0821a8, float:1.8094976E38)
            X.2DO r8 = X.C287975bA.A00(r3, r5, r1)
            float r5 = X.C51975G9x.A01(r9)
            float r4 = r4 - r5
            androidx.compose.ui.Modifier r4 = X.HRF.A00(r7, r4)
            X.AnonymousClass6G3.A03(r3, r4, r8)
        L_0x019e:
            X.C286565Wx.A0L(r0, r1)
            r3.ASN()
            r4 = -1919419159(0xffffffff8d97fce9, float:-9.366979E-31)
            r3.ExS(r4)
            if (r33 == 0) goto L_0x01c1
            r4 = 2131238074(0x7f081cba, float:1.8092416E38)
            X.2DO r5 = X.C287975bA.A00(r3, r4, r1)
            r4 = 1088421888(0x40e00000, float:7.0)
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A0B(r7, r4, r6, r6, r10)
            r8 = 0
            r7 = 26
            r6 = r1
            X.C288165bT.A00(r3, r4, r5, r6, r7, r8)
        L_0x01c1:
            boolean r0 = X.C51971G9r.A1S(r3, r0, r1)
            if (r0 == 0) goto L_0x0059
            r0 = 1628064077(0x610a494d, float:1.5943329E20)
            X.0fL.A00(r0)
            goto L_0x0059
        L_0x01cf:
            r4 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            goto L_0x0178
        L_0x01d3:
            r4 = 626473726(0x25573afe, float:1.8668265E-16)
            r3.ExS(r4)
            r4 = -1919453820(0xffffffff8d977584, float:-9.334384E-31)
            java.lang.Object r5 = X.C51967G9n.A0m(r3, r4)
            java.lang.Object r8 = X.AnonymousClass5XT.A00
            if (r5 != r8) goto L_0x00d9
            X.5b4 r5 = X.C287705ad.A00(r6)
            goto L_0x00d6
        L_0x01ea:
            r9 = r2
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HXP.A00(X.5Wy, java.lang.String, int, long, boolean, boolean, boolean):void");
    }
}
