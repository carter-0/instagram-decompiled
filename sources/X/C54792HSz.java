package X;

/* renamed from: X.HSz  reason: case insensitive filesystem */
public abstract class C54792HSz {
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r36, com.instagram.common.typedurl.ImageUrl r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, X.C62320sa r42, float r43, int r44, int r45, boolean r46, boolean r47) {
        /*
            r29 = r41
            r25 = r47
            r28 = r42
            r6 = 0
            r47 = r37
            r0 = r47
            X.0qQ.A0B(r0, r6)
            r1 = 1093006036(0x4125f2d4, float:10.371784)
            r0 = r36
            r0.ExV(r1)
            r10 = r45
            r1 = r45 & 1
            r8 = r44
            if (r1 == 0) goto L_0x03d6
            r1 = r44 | 6
        L_0x0020:
            r2 = r45 & 2
            r32 = r38
            if (r2 == 0) goto L_0x03c9
            r1 = r1 | 48
        L_0x0028:
            r2 = r45 & 4
            r31 = r39
            if (r2 == 0) goto L_0x03bc
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0030:
            r2 = r45 & 8
            r30 = r40
            if (r2 == 0) goto L_0x03af
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0038:
            r2 = r45 & 16
            r26 = r46
            if (r2 == 0) goto L_0x03a2
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0040:
            r7 = r45 & 32
            r16 = 196608(0x30000, float:2.75506E-40)
            if (r7 == 0) goto L_0x0395
            r1 = r1 | r16
        L_0x0048:
            r3 = r45 & 64
            r2 = 1572864(0x180000, float:2.204052E-39)
            r27 = r43
            if (r3 != 0) goto L_0x005a
            r2 = r44 & r2
            if (r2 != 0) goto L_0x005b
            r2 = r27
            int r2 = X.G9t.A04(r0, r2)
        L_0x005a:
            r1 = r1 | r2
        L_0x005b:
            r3 = r10 & 128(0x80, float:1.794E-43)
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r3 != 0) goto L_0x006b
            r2 = r44 & r2
            if (r2 != 0) goto L_0x006c
            r2 = r25
            int r2 = X.G9t.A0f(r0, r2)
        L_0x006b:
            r1 = r1 | r2
        L_0x006c:
            r5 = r10 & 256(0x100, float:3.59E-43)
            r2 = 100663296(0x6000000, float:2.4074124E-35)
            if (r5 != 0) goto L_0x007c
            r2 = r44 & r2
            if (r2 != 0) goto L_0x007d
            r2 = r29
            int r2 = X.G9t.A0W(r0, r2)
        L_0x007c:
            r1 = r1 | r2
        L_0x007d:
            r2 = 38347923(0x2492493, float:1.4777644E-37)
            r4 = r1 & r2
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            if (r4 != r2) goto L_0x00b5
            boolean r2 = r0.Bwn()
            if (r2 == 0) goto L_0x00b5
            r0.Evl()
        L_0x0090:
            X.5Xd r1 = r0.ASQ()
            if (r1 == 0) goto L_0x00b4
            X.JBL r0 = new X.JBL
            r11 = r0
            r12 = r47
            r13 = r32
            r14 = r31
            r15 = r30
            r16 = r29
            r17 = r28
            r18 = r27
            r19 = r8
            r20 = r10
            r21 = r26
            r22 = r25
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1.A06 = r0
        L_0x00b4:
            return
        L_0x00b5:
            if (r7 == 0) goto L_0x00b9
            X.IpD r28 = X.C58270IpD.A00
        L_0x00b9:
            r2 = r25
            boolean r25 = X.C51966G9m.A1Q(r3, r2)
            if (r5 == 0) goto L_0x00c3
            r29 = 0
        L_0x00c3:
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00d1
            r3 = 1701751529(0x656eaae9, float:7.0442247E22)
            java.lang.String r2 = "com.instagram.aistudio.editor.TemplateDetailsCard (TemplateDetailsCard.kt:57)"
            X.0fL.A01(r3, r2)
        L_0x00d1:
            android.content.res.Resources r2 = X.C51975G9x.A0B(r0)
            android.util.DisplayMetrics r3 = r2.getDisplayMetrics()
            int r2 = r3.widthPixels
            float r7 = (float) r2
            float r2 = r3.density
            float r7 = r7 / r2
            r2 = -1862789735(0xffffffff90f81599, float:-9.785203E-29)
            java.lang.Object r2 = X.C51967G9n.A0m(r0, r2)
            java.lang.Object r24 = X.AnonymousClass5XT.A00
            r3 = r24
            if (r2 != r3) goto L_0x00f5
            r2 = 1065353216(0x3f800000, float:1.0)
            X.5b4 r2 = X.C287705ad.A00(r2)
            r0.FLL(r2)
        L_0x00f5:
            X.5b4 r2 = (X.AnonymousClass5b4) r2
            X.5Wx r3 = X.C51965G9l.A0H(r0, r6)
            X.0lg r11 = X.C51969G9p.A0j(r0)
            X.0Tu r9 = X.DbS.A0J(r11, r6)
            r4 = 37168500952072661(0x840c8e001501d5, double:3.5688478954065365E-306)
            float r11 = X.C51965G9l.A00(r9, r11, r4)
            r4 = -1862784424(0xffffffff90f82a58, float:-9.7883993E-29)
            boolean r4 = X.C51967G9n.A1Z(r0, r2, r4)
            boolean r4 = X.C51966G9m.A1S(r0, r11, r4)
            java.lang.Object r5 = r0.ECw()
            if (r4 != 0) goto L_0x0121
            r4 = r24
            if (r5 != r4) goto L_0x012b
        L_0x0121:
            r9 = 0
            r4 = 2
            X.JUx r5 = new X.JUx
            r5.<init>(r2, r9, r11, r4)
            r0.FLL(r5)
        L_0x012b:
            X.0sL r5 = X.C51965G9l.A10(r3, r5)
            r38 = r1 & 14
            r4 = r47
            X.C286645Xf.A04(r0, r4, r5)
            X.5Qk r9 = androidx.compose.ui.Modifier.A00
            X.5Zp r23 = X.C287215Zl.A04
            r4 = r23
            androidx.compose.ui.Modifier r4 = X.C287205Zk.A01(r4, r9)
            r22 = 1
            androidx.compose.foundation.layout.FillElement r11 = X.C287205Zk.A02
            androidx.compose.ui.Modifier r39 = r4.Ezh(r11)
            r41 = 1082130432(0x40800000, float:4.0)
            X.5ZQ r40 = X.AnonymousClass5ZN.A00()
            long r42 = X.AnonymousClass5RV.A00
            r44 = r42
            r46 = r22
            androidx.compose.ui.Modifier r4 = X.C56169Hty.A01(r39, r40, r41, r42, r44, r46)
            if (r26 != 0) goto L_0x0391
            if (r25 == 0) goto L_0x0391
            float r2 = X.C51975G9x.A00(r2)
        L_0x0160:
            androidx.compose.ui.Modifier r12 = X.HRI.A00(r4, r2, r2)
            long r4 = X.C51966G9m.A08(r0)
            X.5ZQ r2 = X.AnonymousClass5ZN.A00()
            androidx.compose.ui.Modifier r5 = X.C304766Fd.A01(r12, r2, r4)
            r4 = 1107296256(0x42000000, float:32.0)
            r2 = 1103101952(0x41c00000, float:24.0)
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A0B(r5, r4, r4, r4, r2)
            X.5RD r12 = X.C51966G9m.A0a(r6)
            int r5 = X.C287425a7.A00(r0)
            X.5RM r2 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r4)
            X.0sa r15 = X.C287485aD.A00
            X.C51973G9u.A0z(r0, r3, r15)
            X.0sL r13 = X.C287485aD.A03
            X.0sL r21 = X.C51969G9p.A0w(r0, r12, r2, r13)
            X.0sL r12 = X.C287485aD.A02
            boolean r2 = r3.A0K
            if (r2 != 0) goto L_0x019f
            boolean r2 = X.C51972G9s.A1Q(r0, r5)
            if (r2 != 0) goto L_0x01a2
        L_0x019f:
            X.C51971G9r.A13(r0, r12, r5)
        L_0x01a2:
            X.0sL r20 = X.C51966G9m.A1K(r0, r4)
            androidx.compose.ui.Modifier r5 = r9.Ezh(r11)
            r19 = 0
            r4 = 1099956224(0x41900000, float:18.0)
            r2 = 0
            androidx.compose.ui.Modifier r5 = X.C287195Zj.A0B(r5, r2, r4, r2, r2)
            X.5Zr r18 = X.C287215Zl.A00
            X.5Zx r14 = X.C287275Zs.A07
            r17 = 48
            r11 = r18
            r4 = r17
            X.5RD r4 = X.C291495hO.A02(r14, r0, r11, r4)
            int r14 = X.C287425a7.A00(r0)
            X.5RM r11 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r0, r5)
            X.C51973G9u.A0z(r0, r3, r15)
            X.C287595aO.A00(r0, r4, r13)
            r4 = r21
            boolean r4 = X.C51965G9l.A1Y(r0, r3, r11, r4)
            if (r4 != 0) goto L_0x01e1
            boolean r4 = X.C51972G9s.A1Q(r0, r14)
            if (r4 != 0) goto L_0x01e4
        L_0x01e1:
            X.C51971G9r.A13(r0, r12, r14)
        L_0x01e4:
            r4 = r20
            X.C287595aO.A00(r0, r5, r4)
            androidx.compose.ui.Modifier r4 = X.C51966G9m.A0W(r9)
            float r7 = r7 * r27
            androidx.compose.ui.Modifier r5 = X.C287205Zk.A0D(r4, r7)
            r4 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.Modifier r7 = X.C54739HQw.A00(r5, r4, r6)
            X.5Yw r4 = X.AnonymousClass5aQ.A00(r0)
            long r4 = r4.A0f
            androidx.compose.ui.Modifier r4 = X.C51966G9m.A0X(r7, r4)
            r40 = 0
            r38 = r38 | r16
            r16 = 1099956224(0x41900000, float:18.0)
            r39 = 94
            r33 = r0
            r34 = r47
            r35 = r19
            r36 = r19
            r37 = r19
            r42 = r22
            r43 = r6
            X.2DN r5 = X.1zC.A02(r33, r34, r35, r36, r37, r38, r39, r40, r42, r43)
            X.AnonymousClass6G3.A03(r0, r4, r5)
            r4 = 1460462580(0x570ce3f4, float:1.54910679E14)
            r0.ExS(r4)
            if (r32 == 0) goto L_0x023f
            r4 = 1102053376(0x41b00000, float:22.0)
            androidx.compose.ui.Modifier r34 = X.C287195Zj.A0B(r9, r2, r4, r2, r2)
            X.5Z4 r35 = X.C51965G9l.A0S(r0)
            long r38 = X.C51966G9m.A0H(r0)
            int r37 = X.C51965G9l.A03(r1)
            r36 = r32
            X.AnonymousClass5ZZ.A0O(r33, r34, r35, r36, r37, r38)
        L_0x023f:
            X.C286565Wx.A0L(r3, r6)
            r4 = 1460474255(0x570d118f, float:1.55106553E14)
            r0.ExS(r4)
            if (r29 == 0) goto L_0x0268
            r5 = 1098907648(0x41800000, float:16.0)
            r4 = 1092616192(0x41200000, float:10.0)
            androidx.compose.ui.Modifier r34 = X.C287195Zj.A0B(r9, r2, r5, r2, r4)
            r5 = 2131952771(0x7f130483, float:1.9541994E38)
            r4 = r29
            java.lang.String r36 = X.G9w.A0h(r0, r4, r5)
            X.5Z4 r35 = X.C51966G9m.A0c(r0)
            long r38 = X.C51966G9m.A0M(r0)
            r37 = r17
            X.AnonymousClass5ZZ.A0N(r33, r34, r35, r36, r37, r38)
        L_0x0268:
            X.C286565Wx.A0L(r3, r6)
            r4 = 1460491588(0x570d5544, float:1.55397353E14)
            r0.ExS(r4)
            if (r31 == 0) goto L_0x028c
            r4 = 1098907648(0x41800000, float:16.0)
            androidx.compose.ui.Modifier r34 = X.C287195Zj.A0B(r9, r2, r4, r2, r4)
            X.5Z4 r35 = X.C51966G9m.A0c(r0)
            long r38 = X.C51966G9m.A0H(r0)
            int r2 = r1 >> 6
            r2 = r2 & 14
            r37 = r2 | 48
            r36 = r31
            X.AnonymousClass5ZZ.A0N(r33, r34, r35, r36, r37, r38)
        L_0x028c:
            X.C286565Wx.A0L(r3, r6)
            r2 = 1460505324(0x570d8aec, float:1.55627804E14)
            r0.ExS(r2)
            if (r26 == 0) goto L_0x032f
            long r4 = X.C51966G9m.A0C(r0)
            r2 = 1112014848(0x42480000, float:50.0)
            androidx.compose.ui.Modifier r2 = X.C51969G9p.A0X(r9, r2, r4)
            r7 = 1090519040(0x41000000, float:8.0)
            androidx.compose.ui.Modifier r11 = X.C287195Zj.A08(r2, r7)
            r2 = 1460514869(0x570db035, float:1.55787943E14)
            r0.ExS(r2)
            boolean r2 = X.C51975G9x.A1O(r1)
            java.lang.Object r5 = r0.ECw()
            if (r2 != 0) goto L_0x02bb
            r2 = r24
            if (r5 != r2) goto L_0x02c6
        L_0x02bb:
            r4 = 6
            X.MM7 r5 = new X.MM7
            r2 = r28
            r5.<init>(r2, r4)
            r0.FLL(r5)
        L_0x02c6:
            X.0sa r14 = X.C51965G9l.A0y(r3, r5, r6)
            r5 = r19
            r2 = r22
            androidx.compose.ui.Modifier r4 = X.C287635aW.A05(r11, r5, r5, r14, r2)
            r2 = r18
            X.6Fc r5 = X.C287275Zs.A02(r2, r7)
            r2 = r23
            X.5RD r2 = X.C287395a4.A00(r5, r0, r2)
            int r7 = X.C287425a7.A00(r0)
            X.5RM r5 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r4)
            X.C51973G9u.A0z(r0, r3, r15)
            X.C287595aO.A00(r0, r2, r13)
            r2 = r21
            boolean r2 = X.C51965G9l.A1Y(r0, r3, r5, r2)
            if (r2 != 0) goto L_0x02fe
            boolean r2 = X.C51972G9s.A1Q(r0, r7)
            if (r2 != 0) goto L_0x0301
        L_0x02fe:
            X.C51971G9r.A13(r0, r12, r7)
        L_0x0301:
            r2 = r20
            X.C287595aO.A00(r0, r4, r2)
            r2 = r16
            androidx.compose.ui.Modifier r7 = X.C287205Zk.A0C(r9, r2)
            r2 = 2131238245(0x7f081d65, float:1.8092763E38)
            X.2DO r2 = X.C287975bA.A00(r0, r2, r6)
            long r4 = X.C51966G9m.A0G(r0)
            X.C288165bT.A02(r0, r7, r2, r4)
            r2 = 2131961425(0x7f132651, float:1.9559547E38)
            java.lang.String r7 = X.C304346Dc.A00(r0, r2)
            X.5Z4 r2 = X.C51966G9m.A0f(r0)
            long r4 = X.C51966G9m.A0H(r0)
            X.AnonymousClass5ZZ.A0r(r0, r2, r7, r4)
            r0.ASN()
        L_0x032f:
            X.C286565Wx.A0L(r3, r6)
            r0.ASN()
            r2 = -430349545(0xffffffffe6596317, float:-2.5664535E23)
            r0.ExS(r2)
            if (r30 == 0) goto L_0x0383
            X.5a0 r2 = X.C287275Zs.A02
            X.5RD r2 = X.G9w.A0K(r2, r0)
            int r7 = X.C287425a7.A00(r0)
            X.5RM r5 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r4 = X.C287435a8.A01(r0, r9)
            X.C51973G9u.A0z(r0, r3, r15)
            X.C287595aO.A00(r0, r2, r13)
            r2 = r21
            boolean r2 = X.C51965G9l.A1Y(r0, r3, r5, r2)
            if (r2 != 0) goto L_0x0363
            boolean r2 = X.C51972G9s.A1Q(r0, r7)
            if (r2 != 0) goto L_0x0366
        L_0x0363:
            X.C51971G9r.A13(r0, r12, r7)
        L_0x0366:
            r2 = r20
            X.C287595aO.A00(r0, r4, r2)
            long r17 = X.C51966G9m.A0A(r0)
            int r1 = r1 >> 9
            r15 = r1 & 14
            r16 = 26
            r11 = r0
            r12 = r19
            r13 = r30
            r14 = r6
            r19 = r6
            X.HT0.A00(r11, r12, r13, r14, r15, r16, r17, r19)
            r0.ASN()
        L_0x0383:
            boolean r1 = X.C51971G9r.A1S(r0, r3, r6)
            if (r1 == 0) goto L_0x0090
            r1 = 433360239(0x19d48d6f, float:2.1977411E-23)
            X.0fL.A00(r1)
            goto L_0x0090
        L_0x0391:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0160
        L_0x0395:
            r2 = r44 & r16
            if (r2 != 0) goto L_0x0048
            r2 = r28
            int r2 = X.G9t.A0J(r0, r2)
            r1 = r1 | r2
            goto L_0x0048
        L_0x03a2:
            r2 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x0040
            r2 = r26
            int r2 = X.G9t.A0c(r0, r2)
            r1 = r1 | r2
            goto L_0x0040
        L_0x03af:
            r2 = r8 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0038
            r2 = r30
            int r2 = X.G9t.A0R(r0, r2)
            r1 = r1 | r2
            goto L_0x0038
        L_0x03bc:
            r2 = r8 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0030
            r2 = r31
            int r2 = X.G9t.A0Q(r0, r2)
            r1 = r1 | r2
            goto L_0x0030
        L_0x03c9:
            r2 = r44 & 48
            if (r2 != 0) goto L_0x0028
            r2 = r32
            int r2 = X.G9t.A0P(r0, r2)
            r1 = r1 | r2
            goto L_0x0028
        L_0x03d6:
            r1 = r44 & 6
            if (r1 != 0) goto L_0x03e4
            r1 = r47
            int r1 = X.G9t.A0O(r0, r1)
            r1 = r1 | r44
            goto L_0x0020
        L_0x03e4:
            r1 = r8
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54792HSz.A00(X.5Wy, com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.0sa, float, int, int, boolean, boolean):void");
    }
}
