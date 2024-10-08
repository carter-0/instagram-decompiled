package X;

/* renamed from: X.HvO  reason: case insensitive filesystem */
public abstract class C56254HvO {
    public static final void A01(C62320sa r8, C286575Wy r9, int i) {
        A00(r9, (String) null, r8, i, 0, 6, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r15.AGt(r13) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00db, code lost:
        if (r4 == 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r15, java.lang.String r16, X.C62320sa r17, int r18, int r19, int r20, long r21) {
        /*
            r13 = r21
            r8 = r16
            r9 = r18
            r0 = 915585137(0x3692b871, float:4.372611E-6)
            r15.ExV(r0)
            r11 = r20
            r7 = r20 & 1
            r10 = r19
            if (r7 == 0) goto L_0x00f4
            r1 = r19 | 6
        L_0x0016:
            r6 = r20 & 2
            if (r6 == 0) goto L_0x00e9
            r1 = r1 | 48
        L_0x001c:
            r0 = r10 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x002f
            r0 = r20 & 4
            if (r0 != 0) goto L_0x002c
            boolean r2 = r15.AGt(r13)
            r0 = 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x002e
        L_0x002c:
            r0 = 128(0x80, float:1.794E-43)
        L_0x002e:
            r1 = r1 | r0
        L_0x002f:
            r4 = r20 & 8
            r2 = r17
            if (r4 == 0) goto L_0x00de
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0037:
            r3 = r1 & 5851(0x16db, float:8.199E-42)
            r0 = 1170(0x492, float:1.64E-42)
            if (r3 != r0) goto L_0x0056
            boolean r0 = r15.Bwn()
            if (r0 == 0) goto L_0x0056
            r15.Evl()
            r7 = r2
        L_0x0047:
            X.5Xd r0 = r15.ASQ()
            if (r0 == 0) goto L_0x0055
            r12 = 0
            X.J9K r6 = new X.J9K
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.A06 = r6
        L_0x0055:
            return
        L_0x0056:
            r15.Ewr()
            r0 = r19 & 1
            r5 = -1
            if (r0 == 0) goto L_0x00ca
            boolean r0 = r15.Aw3()
            if (r0 != 0) goto L_0x00ca
            int r1 = X.C51971G9r.A06(r15, r11, r1)
        L_0x0068:
            r7 = r2
        L_0x0069:
            boolean r0 = X.C51967G9n.A1S(r15)
            if (r0 == 0) goto L_0x0077
            r2 = 615023126(0x24a88216, float:7.307876E-17)
            java.lang.String r0 = "com.instagram.comments.mvvm.view.compose.ActionText (CommentBottomRowActionText.kt:23)"
            X.0fL.A01(r2, r0)
        L_0x0077:
            r0 = -592622717(0xffffffffdcad4b83, float:-3.90225576E17)
            X.5Qk r6 = X.C51965G9l.A0K(r15, r0)
            r4 = 1082130432(0x40800000, float:4.0)
            r3 = 1098907648(0x41800000, float:16.0)
            r2 = 1094713344(0x41400000, float:12.0)
            r0 = 0
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A0B(r6, r0, r4, r3, r2)
            if (r7 == 0) goto L_0x0093
            androidx.compose.ui.Modifier r0 = X.C288235ba.A04(r15, r6, r7)
            androidx.compose.ui.Modifier r4 = r4.Ezh(r0)
        L_0x0093:
            r3 = r15
            X.5Wx r3 = (X.C286565Wx) r3
            r2 = 0
            X.C286565Wx.A0L(r3, r2)
            r0 = -592618446(0xffffffffdcad5c32, float:-3.90372326E17)
            r15.ExS(r0)
            if (r9 == r5) goto L_0x00c5
            java.lang.String r18 = X.C288035bG.A00(r15, r9)
        L_0x00a6:
            X.C286565Wx.A0L(r3, r2)
            X.5Z4 r17 = X.C51966G9m.A0f(r15)
            r0 = r1 & 896(0x380, float:1.256E-42)
            r16 = r4
            r19 = r0
            r20 = r13
            X.AnonymousClass5ZZ.A0L(r15, r16, r17, r18, r19, r20)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0047
            r0 = -2058671160(0xffffffff854b2bc8, float:-9.5530555E-36)
            X.0fL.A00(r0)
            goto L_0x0047
        L_0x00c5:
            if (r8 == 0) goto L_0x0103
            r18 = r8
            goto L_0x00a6
        L_0x00ca:
            if (r7 == 0) goto L_0x00cd
            r9 = -1
        L_0x00cd:
            if (r6 == 0) goto L_0x00d0
            r8 = 0
        L_0x00d0:
            r0 = r20 & 4
            if (r0 == 0) goto L_0x00da
            long r13 = X.C51966G9m.A0M(r15)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00da:
            r7 = 0
            if (r4 != 0) goto L_0x0069
            goto L_0x0068
        L_0x00de:
            r0 = r10 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x0037
            int r0 = X.G9t.A0H(r15, r2)
            r1 = r1 | r0
            goto L_0x0037
        L_0x00e9:
            r0 = r19 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x001c
            int r0 = X.G9t.A0P(r15, r8)
            r1 = r1 | r0
            goto L_0x001c
        L_0x00f4:
            r0 = r19 & 14
            if (r0 != 0) goto L_0x0100
            int r1 = X.G9t.A05(r15, r9)
            r1 = r1 | r19
            goto L_0x0016
        L_0x0100:
            r1 = r10
            goto L_0x0016
        L_0x0103:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56254HvO.A00(X.5Wy, java.lang.String, X.0sa, int, int, int, long):void");
    }
}
