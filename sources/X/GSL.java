package X;

import androidx.compose.ui.Modifier;

public abstract class GSL {
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0231, code lost:
        if (r11 == 0) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r1 == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (r1 == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e2, code lost:
        if ((r4 & 1572864) == 1048576) goto L_0x01e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r24, androidx.compose.ui.Modifier r25, X.AnonymousClass2DO r26, X.AnonymousClass2DO r27, float r28, float r29, float r30, int r31, int r32, long r33, long r35, boolean r37, boolean r38) {
        /*
            r17 = r35
            r2 = r33
            r22 = r29
            r9 = r27
            r19 = r37
            r21 = r30
            r20 = r25
            r0 = 482325070(0x1cbfb24e, float:1.268541E-21)
            r10 = r24
            r10.ExV(r0)
            r7 = r32
            r0 = r32 & 1
            r23 = r28
            r8 = r31
            if (r0 == 0) goto L_0x0267
            r4 = r31 | 6
        L_0x0022:
            r0 = r32 & 2
            if (r0 == 0) goto L_0x025a
            r4 = r4 | 48
        L_0x0028:
            r15 = r32 & 4
            if (r15 == 0) goto L_0x024d
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x002e:
            r14 = r32 & 8
            if (r14 == 0) goto L_0x0242
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0034:
            r13 = r32 & 16
            if (r13 == 0) goto L_0x0235
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x003a:
            r0 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 & r31
            if (r0 != 0) goto L_0x004f
            r0 = r32 & 32
            if (r0 != 0) goto L_0x004c
            boolean r1 = r10.AGt(r2)
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r1 != 0) goto L_0x004e
        L_0x004c:
            r0 = 65536(0x10000, float:9.18355E-41)
        L_0x004e:
            r4 = r4 | r0
        L_0x004f:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r31 & r0
            if (r0 != 0) goto L_0x0066
            r0 = r32 & 64
            if (r0 != 0) goto L_0x0063
            r0 = r17
            boolean r1 = r10.AGt(r0)
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r1 != 0) goto L_0x0065
        L_0x0063:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x0065:
            r4 = r4 | r0
        L_0x0066:
            r5 = r7 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r5 != 0) goto L_0x007c
            r0 = r31 & r0
            if (r0 != 0) goto L_0x007d
            r0 = r21
            boolean r1 = r10.AGr(r0)
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r1 == 0) goto L_0x007c
            r0 = 8388608(0x800000, float:1.17549435E-38)
        L_0x007c:
            r4 = r4 | r0
        L_0x007d:
            r6 = r7 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r6 != 0) goto L_0x008d
            r0 = r0 & r31
            if (r0 != 0) goto L_0x008e
            r0 = r19
            int r0 = X.G9t.A0g(r10, r0)
        L_0x008d:
            r4 = r4 | r0
        L_0x008e:
            r11 = r7 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r38
            if (r11 != 0) goto L_0x009e
            r0 = r31 & r0
            if (r0 != 0) goto L_0x009f
            int r0 = X.G9t.A0h(r10, r1)
        L_0x009e:
            r4 = r4 | r0
        L_0x009f:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r4 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r12 != r0) goto L_0x00d0
            boolean r0 = r10.Bwn()
            if (r0 == 0) goto L_0x00d0
            r10.Evl()
        L_0x00b2:
            X.5Xd r1 = r10.ASQ()
            if (r1 == 0) goto L_0x00cf
            X.JC4 r0 = new X.JC4
            r33 = r2
            r35 = r17
            r37 = r19
            r24 = r0
            r25 = r20
            r27 = r9
            r29 = r22
            r30 = r21
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r37, r38)
            r1.A06 = r0
        L_0x00cf:
            return
        L_0x00d0:
            r10.Ewr()
            r0 = r31 & 1
            r12 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L_0x0204
            boolean r0 = r10.Aw3()
            if (r0 != 0) goto L_0x0204
            r10.Evl()
            r0 = r32 & 32
            if (r0 == 0) goto L_0x00e8
            r4 = r4 & r12
        L_0x00e8:
            r0 = r32 & 64
            if (r0 == 0) goto L_0x00f0
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r0
        L_0x00f0:
            r38 = r1
        L_0x00f2:
            boolean r0 = X.C51967G9n.A1S(r10)
            if (r0 == 0) goto L_0x0100
            r1 = 908569742(0x3627ac8e, float:2.498538E-6)
            java.lang.String r0 = "com.instagram.compose.ui.avatar.IgCircularAvatar (IgAvatar.kt:43)"
            X.0fL.A01(r1, r0)
        L_0x0100:
            r1 = r20
            r0 = r23
            androidx.compose.ui.Modifier r6 = X.C287205Zk.A0C(r1, r0)
            androidx.compose.ui.Alignment r1 = X.C287215Zl.A0E
            r12 = 0
            X.5RD r5 = X.C287675aa.A00(r1, r12)
            int r13 = X.C287425a7.A00(r10)
            r11 = r10
            X.5Wx r11 = (X.C286565Wx) r11
            X.5RM r0 = X.C286565Wx.A04(r11)
            androidx.compose.ui.Modifier r6 = X.C287435a8.A01(r10, r6)
            X.C51973G9u.A0y(r10, r11)
            X.C51971G9r.A12(r10, r5, r0)
            X.0sL r5 = X.C287485aD.A02
            boolean r0 = r11.A0K
            if (r0 != 0) goto L_0x0130
            boolean r0 = X.C51972G9s.A1Q(r10, r13)
            if (r0 != 0) goto L_0x0133
        L_0x0130:
            X.C51971G9r.A13(r10, r5, r13)
        L_0x0133:
            X.C51965G9l.A18(r10, r6)
            X.5dj r6 = X.C289515dj.A00
            if (r9 != 0) goto L_0x0180
            if (r38 != 0) goto L_0x0180
            r0 = 1340937368(0x4fed1498, float:7.9550996E9)
            X.5Qk r5 = X.C51965G9l.A0K(r10, r0)
            r0 = r23
            androidx.compose.ui.Modifier r13 = X.C287205Zk.A0C(r5, r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            X.5ZQ r1 = X.AnonymousClass5ZN.A00
            androidx.compose.ui.Modifier r0 = X.C304816Fi.A03(r13, r1, r0, r2)
            androidx.compose.ui.Modifier r1 = X.AnonymousClass6FZ.A01(r0, r1)
        L_0x0155:
            int r4 = X.C51965G9l.A03(r4)
            r0 = r26
            X.AnonymousClass6G3.A06(r10, r1, r0, r4)
            X.C286565Wx.A0L(r11, r12)
            r0 = 2121473875(0x7e731f53, float:8.079126E37)
            r10.ExS(r0)
            if (r19 == 0) goto L_0x0172
            androidx.compose.ui.Alignment r0 = X.C287215Zl.A07
            androidx.compose.ui.Modifier r0 = r6.AAz(r0, r5)
            A00(r10, r0, r12)
        L_0x0172:
            boolean r0 = X.C51971G9r.A1S(r10, r11, r12)
            if (r0 == 0) goto L_0x00b2
            r0 = -1906515265(0xffffffff8e5ce2bf, float:-2.7226268E-30)
            X.0fL.A00(r0)
            goto L_0x00b2
        L_0x0180:
            r0 = 1340196344(0x4fe1c5f8, float:7.5756954E9)
            r10.ExS(r0)
            float r0 = r28 * r21
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r14 = X.C287205Zk.A0C(r5, r0)
            X.5ZQ r13 = X.AnonymousClass5ZN.A00
            r0 = r22
            androidx.compose.ui.Modifier r14 = X.C304816Fi.A03(r14, r13, r0, r2)
            androidx.compose.ui.Modifier r0 = X.C287195Zj.A07(r14, r0)
            androidx.compose.ui.Modifier r13 = X.AnonymousClass6FZ.A01(r0, r13)
            if (r9 == 0) goto L_0x01bd
            r0 = 1340493076(0x4fe64d14, float:7.7276221E9)
            r10.ExS(r0)
            androidx.compose.ui.Modifier r1 = r6.AAz(r1, r13)
            int r0 = r4 >> 9
            r0 = r0 & 14
            r0 = r0 | 48
            X.AnonymousClass6G3.A06(r10, r1, r9, r0)
        L_0x01b3:
            X.C286565Wx.A0L(r11, r12)
            androidx.compose.ui.Alignment r0 = X.C287215Zl.A07
            androidx.compose.ui.Modifier r1 = r6.AAz(r0, r13)
            goto L_0x0155
        L_0x01bd:
            r0 = 1340651052(0x4fe8b62c, float:7.8085059E9)
            r10.ExS(r0)
            androidx.compose.ui.Modifier r16 = r6.AAz(r1, r13)
            r0 = 2121459819(0x7e72e86b, float:8.071999E37)
            r10.ExS(r0)
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r4
            r15 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 ^ r15
            r14 = 1048576(0x100000, float:1.469368E-39)
            if (r0 <= r14) goto L_0x01df
            r0 = r17
            boolean r0 = r10.AGt(r0)
            if (r0 != 0) goto L_0x01e4
        L_0x01df:
            r1 = r4 & r15
            r0 = 0
            if (r1 != r14) goto L_0x01e5
        L_0x01e4:
            r0 = 1
        L_0x01e5:
            java.lang.Object r14 = r10.ECw()
            if (r0 != 0) goto L_0x01ef
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r14 != r0) goto L_0x01fa
        L_0x01ef:
            r15 = 5
            X.GQ2 r14 = new X.GQ2
            r0 = r17
            r14.<init>(r0, r15)
            r10.FLL(r14)
        L_0x01fa:
            X.0sP r1 = X.C51965G9l.A0z(r11, r14)
            r0 = r16
            X.C289565do.A00(r10, r0, r1, r12)
            goto L_0x01b3
        L_0x0204:
            if (r15 == 0) goto L_0x0208
            X.5Qk r20 = androidx.compose.ui.Modifier.A00
        L_0x0208:
            if (r14 == 0) goto L_0x020b
            r9 = 0
        L_0x020b:
            if (r13 == 0) goto L_0x020f
            r22 = 1073741824(0x40000000, float:2.0)
        L_0x020f:
            r0 = r32 & 32
            if (r0 == 0) goto L_0x0218
            long r2 = X.C51966G9m.A0F(r10)
            r4 = r4 & r12
        L_0x0218:
            r0 = r32 & 64
            if (r0 == 0) goto L_0x0224
            long r17 = X.C51966G9m.A0B(r10)
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r0
        L_0x0224:
            if (r5 == 0) goto L_0x0229
            r21 = 1059481190(0x3f266666, float:0.65)
        L_0x0229:
            r0 = r19
            boolean r19 = X.C51966G9m.A1Q(r6, r0)
            r38 = 0
            if (r11 != 0) goto L_0x00f2
            goto L_0x00f0
        L_0x0235:
            r0 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003a
            r0 = r22
            int r0 = X.G9t.A03(r10, r0)
            r4 = r4 | r0
            goto L_0x003a
        L_0x0242:
            r0 = r8 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0034
            int r0 = X.G9t.A0H(r10, r9)
            r4 = r4 | r0
            goto L_0x0034
        L_0x024d:
            r0 = r8 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002e
            r0 = r20
            int r0 = X.G9t.A0Q(r10, r0)
            r4 = r4 | r0
            goto L_0x002e
        L_0x025a:
            r0 = r31 & 48
            if (r0 != 0) goto L_0x0028
            r0 = r26
            int r0 = X.G9t.A0F(r10, r0)
            r4 = r4 | r0
            goto L_0x0028
        L_0x0267:
            r0 = r31 & 6
            if (r0 != 0) goto L_0x0279
            r0 = r23
            boolean r0 = r10.AGr(r0)
            int r4 = X.C51970G9q.A05(r0)
            r4 = r4 | r31
            goto L_0x0022
        L_0x0279:
            r4 = r8
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GSL.A01(X.5Wy, androidx.compose.ui.Modifier, X.2DO, X.2DO, float, float, float, int, int, long, long, boolean, boolean):void");
    }

    public static final void A00(C286575Wy r5, Modifier modifier, int i) {
        int i2;
        r5.ExV(425148867);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r5, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1224269940, "com.instagram.compose.ui.avatar.ActiveBadge (IgAvatar.kt:80)");
            }
            C51969G9p.A14(r5, C287195Zj.A07(C304816Fi.A03(C287205Zk.A0C(modifier, 14.0f), AnonymousClass5ZN.A00, 2.0f, C51966G9m.A0A(r5)), 2.0f), AnonymousClass5aQ.A00(r5).A00);
            if (0fL.A02()) {
                0fL.A00(1264738174);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, modifier, i, 35);
        }
    }
}
