package X;

public abstract class HZ1 {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r6.AGt(r20) == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r1 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0184, code lost:
        if (r9 == 0) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r22, androidx.compose.ui.Modifier r23, java.lang.String r24, java.lang.String r25, float r26, int r27, int r28, long r29, long r31) {
        /*
            r8 = r25
            r4 = r24
            r18 = r31
            r20 = r29
            r5 = r23
            r0 = -708215461(0xffffffffd5c97d5b, float:-2.76925294E13)
            r6 = r22
            r6.ExV(r0)
            r2 = r28
            r11 = r28 & 1
            r3 = r27
            if (r11 == 0) goto L_0x01af
            r7 = r27 | 6
        L_0x001c:
            r0 = r28 & 2
            r22 = r26
            if (r0 == 0) goto L_0x01a2
            r7 = r7 | 48
        L_0x0024:
            r0 = r3 & 896(0x380, float:1.256E-42)
            if (r0 != 0) goto L_0x0039
            r0 = r28 & 4
            if (r0 != 0) goto L_0x0036
            r0 = r20
            boolean r1 = r6.AGt(r0)
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L_0x0038
        L_0x0036:
            r0 = 128(0x80, float:1.794E-43)
        L_0x0038:
            r7 = r7 | r0
        L_0x0039:
            r0 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x004e
            r0 = r28 & 8
            if (r0 != 0) goto L_0x004b
            r0 = r18
            boolean r1 = r6.AGt(r0)
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 != 0) goto L_0x004d
        L_0x004b:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x004d:
            r7 = r7 | r0
        L_0x004e:
            r10 = r28 & 16
            if (r10 == 0) goto L_0x0194
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0054:
            r9 = r28 & 32
            if (r9 == 0) goto L_0x0188
            r0 = 196608(0x30000, float:2.75506E-40)
        L_0x005a:
            r7 = r7 | r0
        L_0x005b:
            r0 = 374491(0x5b6db, float:5.24774E-40)
            r1 = r7 & r0
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r0) goto L_0x0087
            boolean r0 = r6.Bwn()
            if (r0 == 0) goto L_0x0087
            r6.Evl()
        L_0x006e:
            X.5Xd r1 = r6.ASQ()
            if (r1 == 0) goto L_0x0086
            X.J9k r0 = new X.J9k
            r9 = r22
            r10 = r3
            r11 = r2
            r12 = r20
            r14 = r18
            r6 = r5
            r7 = r4
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r14)
            r1.A06 = r0
        L_0x0086:
            return
        L_0x0087:
            r6.Ewr()
            r0 = r27 & 1
            if (r0 == 0) goto L_0x0168
            boolean r0 = r6.Aw3()
            if (r0 != 0) goto L_0x0168
            int r7 = X.C51971G9r.A06(r6, r2, r7)
            r0 = r28 & 8
            if (r0 == 0) goto L_0x009e
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x009e:
            r1 = r8
        L_0x009f:
            boolean r0 = X.C51967G9n.A1S(r6)
            if (r0 == 0) goto L_0x00ad
            r8 = -629102664(0xffffffffda80a7b8, float:-1.81066029E16)
            java.lang.String r0 = "com.instagram.creator.achievements.modules.views.ProgressBarWithLabel (ProgressBarWithLabel.kt:33)"
            X.0fL.A01(r8, r0)
        L_0x00ad:
            X.5RD r12 = X.C51976G9y.A0D(r6, r7)
            r9 = 0
            int r11 = X.C287425a7.A00(r6)
            r8 = r6
            X.5Wx r8 = (X.C286565Wx) r8
            X.5RM r0 = X.C286565Wx.A04(r8)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r6, r5)
            X.0sa r15 = X.C287485aD.A00
            X.C51973G9u.A0z(r6, r8, r15)
            X.0sL r14 = X.C287485aD.A03
            X.0sL r17 = X.C51969G9p.A0w(r6, r12, r0, r14)
            X.0sL r13 = X.C287485aD.A02
            boolean r0 = r8.A0K
            if (r0 != 0) goto L_0x00d8
            boolean r0 = X.C51972G9s.A1Q(r6, r11)
            if (r0 != 0) goto L_0x00db
        L_0x00d8:
            X.C51971G9r.A13(r6, r13, r11)
        L_0x00db:
            X.0sL r16 = X.C51966G9m.A1K(r6, r10)
            r0 = 649881995(0x26bc698b, float:1.3073728E-15)
            r6.ExS(r0)
            if (r4 != 0) goto L_0x00e9
            if (r1 == 0) goto L_0x0144
        L_0x00e9:
            X.5a0 r11 = X.C287275Zs.A04
            androidx.compose.ui.Modifier r10 = X.C51969G9p.A0U()
            r0 = 1082130432(0x40800000, float:4.0)
            androidx.compose.ui.Modifier r10 = X.C51967G9n.A0C(r10, r0)
            X.5RD r0 = X.G9w.A0K(r11, r6)
            int r12 = X.C287425a7.A00(r6)
            X.5RM r11 = X.C286565Wx.A04(r8)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r6, r10)
            X.C51973G9u.A0z(r6, r8, r15)
            X.C287595aO.A00(r6, r0, r14)
            r0 = r17
            boolean r0 = X.C51965G9l.A1Y(r6, r8, r11, r0)
            if (r0 != 0) goto L_0x0119
            boolean r0 = X.C51972G9s.A1Q(r6, r12)
            if (r0 != 0) goto L_0x011c
        L_0x0119:
            X.C51971G9r.A13(r6, r13, r12)
        L_0x011c:
            r0 = r16
            X.C287595aO.A00(r6, r10, r0)
            r0 = 1814681689(0x6c29d859, float:8.2132055E26)
            r6.ExS(r0)
            if (r4 == 0) goto L_0x0130
            X.5Z4 r0 = X.C51966G9m.A0b(r6)
            X.AnonymousClass5ZZ.A0h(r6, r0, r4)
        L_0x0130:
            X.C286565Wx.A0L(r8, r9)
            r0 = 1814685058(0x6c29e582, float:8.215691E26)
            r6.ExS(r0)
            if (r1 == 0) goto L_0x013e
            X.C51975G9x.A15(r6, r1)
        L_0x013e:
            X.C286565Wx.A0L(r8, r9)
            r6.ASN()
        L_0x0144:
            X.C286565Wx.A0L(r8, r9)
            r8 = 0
            r0 = r7 & 112(0x70, float:1.57E-43)
            int r10 = X.C51969G9p.A04(r7, r0)
            r11 = 1
            r7 = r6
            r9 = r22
            r12 = r20
            r14 = r18
            X.HZ0.A00(r7, r8, r9, r10, r11, r12, r14)
            boolean r0 = X.C51967G9n.A1R(r6)
            if (r0 == 0) goto L_0x0165
            r0 = -928455705(0xffffffffc8a8e3e7, float:-345887.22)
            X.0fL.A00(r0)
        L_0x0165:
            r8 = r1
            goto L_0x006e
        L_0x0168:
            if (r11 == 0) goto L_0x016c
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
        L_0x016c:
            r0 = r28 & 4
            if (r0 == 0) goto L_0x0176
            long r20 = X.C51966G9m.A0N(r6)
            r7 = r7 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0176:
            r0 = r28 & 8
            if (r0 == 0) goto L_0x0180
            long r18 = X.C51966G9m.A0C(r6)
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0180:
            if (r10 == 0) goto L_0x0183
            r4 = 0
        L_0x0183:
            r1 = 0
            if (r9 != 0) goto L_0x009f
            goto L_0x009e
        L_0x0188:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r27
            if (r0 != 0) goto L_0x005b
            int r0 = X.G9t.A0T(r6, r8)
            goto L_0x005a
        L_0x0194:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r27
            if (r0 != 0) goto L_0x0054
            int r0 = X.G9t.A0S(r6, r4)
            r7 = r7 | r0
            goto L_0x0054
        L_0x01a2:
            r0 = r27 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0024
            r0 = r22
            int r0 = X.G9t.A00(r6, r0)
            r7 = r7 | r0
            goto L_0x0024
        L_0x01af:
            r0 = r27 & 14
            if (r0 != 0) goto L_0x01bb
            int r7 = X.G9t.A0O(r6, r5)
            r7 = r7 | r27
            goto L_0x001c
        L_0x01bb:
            r7 = r3
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HZ1.A00(X.5Wy, androidx.compose.ui.Modifier, java.lang.String, java.lang.String, float, int, int, long, long):void");
    }
}
