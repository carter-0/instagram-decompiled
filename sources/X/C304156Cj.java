package X;

/* renamed from: X.6Cj  reason: invalid class name and case insensitive filesystem */
public abstract class C304156Cj {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        if (r3 == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
        if ((r25 & 64) != 0) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r19, androidx.compose.ui.Modifier r20, java.lang.String r21, X.C62320sa r22, int r23, int r24, int r25, long r26, boolean r28, boolean r29) {
        /*
            r6 = r29
            r0 = r26
            r15 = r28
            r4 = r20
            r5 = 0
            r28 = r22
            r2 = r28
            X.0qQ.A0B(r2, r5)
            r2 = -212567576(0xfffffffff35479e8, float:-1.6834099E31)
            r8 = r19
            r8.ExV(r2)
            r17 = r25
            r2 = r25 & 1
            r7 = r24
            if (r2 == 0) goto L_0x01e8
            r9 = r24 | 6
        L_0x0022:
            r2 = r25 & 2
            r27 = r23
            if (r2 == 0) goto L_0x01d5
            r9 = r9 | 48
        L_0x002a:
            r2 = r25 & 4
            r29 = r21
            if (r2 == 0) goto L_0x01c2
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0032:
            r13 = r25 & 8
            if (r13 == 0) goto L_0x01b1
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0038:
            r12 = r25 & 16
            if (r12 == 0) goto L_0x01a0
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x003e:
            r11 = r25 & 32
            r2 = 196608(0x30000, float:2.75506E-40)
            if (r11 != 0) goto L_0x0052
            r2 = r2 & r24
            if (r2 != 0) goto L_0x0053
            boolean r3 = r8.AGv(r6)
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r3 == 0) goto L_0x0052
            r2 = 131072(0x20000, float:1.83671E-40)
        L_0x0052:
            r9 = r9 | r2
        L_0x0053:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 & r24
            if (r2 != 0) goto L_0x0068
            r2 = r25 & 64
            if (r2 != 0) goto L_0x0065
            boolean r3 = r8.AGt(r0)
            r2 = 1048576(0x100000, float:1.469368E-39)
            if (r3 != 0) goto L_0x0067
        L_0x0065:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x0067:
            r9 = r9 | r2
        L_0x0068:
            r3 = 599187(0x92493, float:8.3964E-40)
            r3 = r3 & r9
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r3 != r2) goto L_0x0098
            boolean r2 = r8.Bwn()
            if (r2 == 0) goto L_0x0098
            r8.Evl()
        L_0x007a:
            X.5Xd r3 = r8.ASQ()
            if (r3 == 0) goto L_0x0097
            X.DPi r2 = new X.DPi
            r18 = r0
            r20 = r15
            r21 = r6
            r14 = r28
            r15 = r27
            r16 = r7
            r11 = r2
            r12 = r4
            r13 = r29
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r20, r21)
            r3.A06 = r2
        L_0x0097:
            return
        L_0x0098:
            r8.Ewr()
            r2 = r24 & 1
            r10 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r2 == 0) goto L_0x0173
            boolean r2 = r8.Aw3()
            if (r2 != 0) goto L_0x0173
            r8.Evl()
            r2 = r25 & 64
            if (r2 == 0) goto L_0x00b0
        L_0x00af:
            r9 = r9 & r10
        L_0x00b0:
            r8.ASM()
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x00c1
            r3 = 1425554104(0x54f83ab8, float:8.5290962E12)
            java.lang.String r2 = "com.instagram.barcelona.feed.post.ui.PostIconButton (PostIconButton.kt:32)"
            X.0fL.A01(r3, r2)
        L_0x00c1:
            r21 = 0
            X.5aV r2 = new X.5aV
            r2.<init>(r5)
            int r10 = r9 >> 9
            r23 = 2
            r19 = r4
            r20 = r2
            r24 = r15
            r18 = r8
            androidx.compose.ui.Modifier r2 = X.C288235ba.A01(r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.ui.Alignment r3 = X.C287215Zl.A09
            X.5RD r14 = X.C287675aa.A00(r3, r5)
            int r16 = X.C287425a7.A00(r8)
            r12 = r8
            X.5Wx r12 = (X.C286565Wx) r12
            X.5RM r13 = X.C286565Wx.A04(r12)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r8, r2)
            X.0sa r3 = X.C287485aD.A00
            r8.ExX()
            boolean r2 = r12.A0K
            if (r2 == 0) goto L_0x016f
            r8.AMT(r3)
        L_0x00f9:
            X.0sL r2 = X.C287485aD.A03
            X.C287595aO.A00(r8, r14, r2)
            X.0sL r2 = X.C287485aD.A05
            X.C287595aO.A00(r8, r13, r2)
            X.0sL r3 = X.C287485aD.A02
            boolean r2 = r12.A0K
            if (r2 != 0) goto L_0x0117
            java.lang.Object r13 = r8.ECw()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            boolean r2 = X.0qQ.A0K(r13, r2)
            if (r2 != 0) goto L_0x0121
        L_0x0117:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r8.FLL(r2)
            r8.ABr(r2, r3)
        L_0x0121:
            X.0sL r2 = X.C287485aD.A04
            X.C287595aO.A00(r8, r11, r2)
            int r11 = r9 >> 3
            r3 = r11 & 14
            r2 = r27
            X.2DO r20 = X.C287975bA.A00(r8, r2, r3)
            r2 = 1595095397(0x5f133965, float:1.0608621E19)
            r8.ExS(r2)
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            if (r6 == 0) goto L_0x0144
            int r2 = r9 >> 15
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 6
            androidx.compose.ui.Modifier r3 = X.HVL.A00(r8, r3, r2, r0)
        L_0x0144:
            X.C286565Wx.A0L(r12, r5)
            X.5bM r21 = X.C288075bK.A05
            r2 = r11 & 112(0x70, float:1.57E-43)
            r9 = r2 | 24576(0x6000, float:3.4438E-41)
            r2 = r10 & 7168(0x1c00, float:1.0045E-41)
            r9 = r9 | r2
            r19 = r3
            r22 = r29
            r23 = r9
            r24 = r5
            r25 = r0
            X.C288165bT.A06(r18, r19, r20, r21, r22, r23, r24, r25)
            r2 = 1
            X.C286565Wx.A0L(r12, r2)
            boolean r2 = X.0fL.A02()
            if (r2 == 0) goto L_0x007a
            r2 = 830769527(0x31848977, float:3.8573336E-9)
            X.0fL.A00(r2)
            goto L_0x007a
        L_0x016f:
            r8.FMk()
            goto L_0x00f9
        L_0x0173:
            if (r13 == 0) goto L_0x0177
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
        L_0x0177:
            if (r12 == 0) goto L_0x017a
            r15 = 1
        L_0x017a:
            if (r11 == 0) goto L_0x017d
            r6 = 0
        L_0x017d:
            r2 = r25 & 64
            if (r2 == 0) goto L_0x00b0
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r8)
            long r0 = r0.A0n
            X.4bM r3 = X.AnonymousClass6CK.A00
            r2 = r8
            X.5Wx r2 = (X.C286565Wx) r2
            X.5RM r2 = X.C286565Wx.A04(r2)
            java.lang.Object r2 = X.C286615Xc.A01(r3, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            long r0 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (r0 & 63)], X.AnonymousClass5RW.A03(r0), X.AnonymousClass5RW.A02(r0), X.AnonymousClass5RW.A01(r0), r2)
            goto L_0x00af
        L_0x01a0:
            r2 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L_0x003e
            boolean r3 = r8.AGv(r15)
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x01ae
            r2 = 16384(0x4000, float:2.2959E-41)
        L_0x01ae:
            r9 = r9 | r2
            goto L_0x003e
        L_0x01b1:
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0038
            boolean r3 = r8.AGu(r4)
            r2 = 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x01bf
            r2 = 2048(0x800, float:2.87E-42)
        L_0x01bf:
            r9 = r9 | r2
            goto L_0x0038
        L_0x01c2:
            r2 = r7 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0032
            r2 = r29
            boolean r3 = r8.AGu(r2)
            r2 = 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x01d2
            r2 = 256(0x100, float:3.59E-43)
        L_0x01d2:
            r9 = r9 | r2
            goto L_0x0032
        L_0x01d5:
            r2 = r24 & 48
            if (r2 != 0) goto L_0x002a
            r2 = r27
            boolean r3 = r8.AGs(r2)
            r2 = 16
            if (r3 == 0) goto L_0x01e5
            r2 = 32
        L_0x01e5:
            r9 = r9 | r2
            goto L_0x002a
        L_0x01e8:
            r2 = r24 & 6
            if (r2 != 0) goto L_0x01fa
            r2 = r28
            boolean r2 = r8.AGw(r2)
            r9 = 2
            if (r2 == 0) goto L_0x01f6
            r9 = 4
        L_0x01f6:
            r9 = r9 | r24
            goto L_0x0022
        L_0x01fa:
            r9 = r7
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304156Cj.A00(X.5Wy, androidx.compose.ui.Modifier, java.lang.String, X.0sa, int, int, int, long, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        if (r11 == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        if ((r7 & 128) != 0) goto L_0x00c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r14, androidx.compose.ui.Modifier r15, java.lang.String r16, X.C62320sa r17, X.C62320sa r18, int r19, int r20, int r21, long r22, boolean r24, boolean r25) {
        /*
            r5 = r25
            r6 = r24
            r1 = r22
            r3 = r15
            r4 = 0
            r7 = 3
            r25 = r16
            r0 = r25
            X.0qQ.A0B(r0, r7)
            r0 = 1972033308(0x758ad71c, float:3.520019E32)
            r9 = r14
            r14.ExV(r0)
            r7 = r21
            r0 = r21 & 1
            r24 = r17
            r8 = r20
            if (r0 == 0) goto L_0x021b
            r10 = r20 | 6
        L_0x0023:
            r0 = r21 & 2
            r23 = r18
            if (r0 == 0) goto L_0x0208
            r10 = r10 | 48
        L_0x002b:
            r0 = r21 & 4
            r22 = r19
            if (r0 == 0) goto L_0x01f5
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x0033:
            r0 = r21 & 8
            if (r0 == 0) goto L_0x01e2
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x0039:
            r15 = r21 & 16
            if (r15 == 0) goto L_0x01d1
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
        L_0x003f:
            r14 = r21 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r14 != 0) goto L_0x0053
            r0 = r0 & r20
            if (r0 != 0) goto L_0x0054
            boolean r11 = r9.AGv(r6)
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r11 == 0) goto L_0x0053
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x0053:
            r10 = r10 | r0
        L_0x0054:
            r13 = r21 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r13 != 0) goto L_0x0068
            r0 = r0 & r20
            if (r0 != 0) goto L_0x0069
            boolean r11 = r9.AGv(r5)
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r11 == 0) goto L_0x0068
            r0 = 1048576(0x100000, float:1.469368E-39)
        L_0x0068:
            r10 = r10 | r0
        L_0x0069:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 & r20
            if (r0 != 0) goto L_0x007e
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x007b
            boolean r11 = r9.AGt(r1)
            r0 = 8388608(0x800000, float:1.17549435E-38)
            if (r11 != 0) goto L_0x007d
        L_0x007b:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x007d:
            r10 = r10 | r0
        L_0x007e:
            r0 = 4793491(0x492493, float:6.717112E-39)
            r11 = r10 & r0
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r11 != r0) goto L_0x00af
            boolean r0 = r9.Bwn()
            if (r0 == 0) goto L_0x00af
            r9.Evl()
        L_0x0091:
            X.5Xd r4 = r9.ASQ()
            if (r4 == 0) goto L_0x00ae
            X.DPj r0 = new X.DPj
            r13 = r1
            r15 = r6
            r16 = r5
            r9 = r23
            r10 = r22
            r11 = r8
            r12 = r7
            r5 = r0
            r6 = r3
            r7 = r25
            r8 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r16)
            r4.A06 = r0
        L_0x00ae:
            return
        L_0x00af:
            r9.Ewr()
            r0 = r20 & 1
            r12 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r0 == 0) goto L_0x01a4
            boolean r0 = r9.Aw3()
            if (r0 != 0) goto L_0x01a4
            r9.Evl()
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00c7
        L_0x00c6:
            r10 = r10 & r12
        L_0x00c7:
            r9.ASM()
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00d8
            r11 = -190294406(0xfffffffff4a8567a, float:-1.0669676E32)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.PostIconButton (PostIconButton.kt:65)"
            X.0fL.A01(r11, r0)
        L_0x00d8:
            r0 = -1730234206(0xffffffff98deb8a2, float:-5.7572086E-24)
            r9.ExS(r0)
            java.lang.Object r12 = r9.ECw()
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r12 != r0) goto L_0x00f1
            X.5aS r12 = new X.5aS
            r12.<init>()
            r0 = r9
            X.5Wx r0 = (X.C286565Wx) r0
            r0.A0Q(r12)
        L_0x00f1:
            X.5aT r12 = (X.C287605aT) r12
            r11 = r9
            X.5Wx r11 = (X.C286565Wx) r11
            X.C286565Wx.A0L(r11, r4)
            X.5aV r0 = new X.5aV
            r0.<init>(r4)
            r13 = r3
            r14 = r0
            r15 = r23
            r16 = r24
            r17 = r6
            androidx.compose.ui.Modifier r12 = X.C288235ba.A00(r12, r13, r14, r15, r16, r17)
            androidx.compose.ui.Alignment r0 = X.C287215Zl.A09
            X.5RD r14 = X.C287675aa.A00(r0, r4)
            int r16 = X.C287425a7.A00(r9)
            X.5RM r13 = X.C286565Wx.A04(r11)
            androidx.compose.ui.Modifier r12 = X.C287435a8.A01(r9, r12)
            X.0sa r15 = X.C287485aD.A00
            r9.ExX()
            boolean r0 = r11.A0K
            if (r0 == 0) goto L_0x01a0
            r9.AMT(r15)
        L_0x0128:
            X.0sL r0 = X.C287485aD.A03
            X.C287595aO.A00(r9, r14, r0)
            X.0sL r0 = X.C287485aD.A05
            X.C287595aO.A00(r9, r13, r0)
            X.0sL r13 = X.C287485aD.A02
            boolean r0 = r11.A0K
            if (r0 != 0) goto L_0x0146
            java.lang.Object r14 = r9.ECw()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            boolean r0 = X.0qQ.A0K(r14, r0)
            if (r0 != 0) goto L_0x0150
        L_0x0146:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r9.FLL(r0)
            r9.ABr(r0, r13)
        L_0x0150:
            X.0sL r0 = X.C287485aD.A04
            X.C287595aO.A00(r9, r12, r0)
            int r14 = r10 >> 6
            r12 = r14 & 14
            r0 = r22
            X.2DO r15 = X.C287975bA.A00(r9, r0, r12)
            r0 = 1595128677(0x5f13bb65, float:1.0645213E19)
            r9.ExS(r0)
            X.5Qk r13 = androidx.compose.ui.Modifier.A00
            if (r5 == 0) goto L_0x0173
            int r0 = r10 >> 18
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | 6
            androidx.compose.ui.Modifier r13 = X.HVL.A00(r9, r13, r0, r1)
        L_0x0173:
            X.C286565Wx.A0L(r11, r4)
            X.5bM r16 = X.C288075bK.A05
            r0 = r14 & 112(0x70, float:1.57E-43)
            r12 = r0 | 24576(0x6000, float:3.4438E-41)
            int r0 = r10 >> 12
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 | r0
            r14 = r13
            r17 = r25
            r18 = r12
            r19 = r4
            r20 = r1
            r13 = r9
            X.C288165bT.A06(r13, r14, r15, r16, r17, r18, r19, r20)
            r0 = 1
            X.C286565Wx.A0L(r11, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0091
            r0 = 912930399(0x366a365f, float:3.4900365E-6)
            X.0fL.A00(r0)
            goto L_0x0091
        L_0x01a0:
            r9.FMk()
            goto L_0x0128
        L_0x01a4:
            if (r15 == 0) goto L_0x01a8
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
        L_0x01a8:
            if (r14 == 0) goto L_0x01ab
            r6 = 1
        L_0x01ab:
            if (r13 == 0) goto L_0x01ae
            r5 = 0
        L_0x01ae:
            r0 = r7 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x00c7
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r9)
            long r0 = r0.A0n
            X.4bM r11 = X.AnonymousClass6CK.A00
            r2 = r9
            X.5Wx r2 = (X.C286565Wx) r2
            X.5RM r2 = X.C286565Wx.A04(r2)
            java.lang.Object r2 = X.C286615Xc.A01(r11, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            long r1 = X.C285595Rx.A02(X.AnonymousClass5RX.A0K[(int) (r0 & 63)], X.AnonymousClass5RW.A03(r0), X.AnonymousClass5RW.A02(r0), X.AnonymousClass5RW.A01(r0), r2)
            goto L_0x00c6
        L_0x01d1:
            r0 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003f
            boolean r11 = r14.AGu(r3)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L_0x01df
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x01df:
            r10 = r10 | r0
            goto L_0x003f
        L_0x01e2:
            r0 = r8 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0039
            r0 = r25
            boolean r11 = r14.AGu(r0)
            r0 = 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x01f2
            r0 = 2048(0x800, float:2.87E-42)
        L_0x01f2:
            r10 = r10 | r0
            goto L_0x0039
        L_0x01f5:
            r0 = r8 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0033
            r0 = r22
            boolean r11 = r14.AGs(r0)
            r0 = 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0205
            r0 = 256(0x100, float:3.59E-43)
        L_0x0205:
            r10 = r10 | r0
            goto L_0x0033
        L_0x0208:
            r0 = r20 & 48
            if (r0 != 0) goto L_0x002b
            r0 = r23
            boolean r11 = r14.AGw(r0)
            r0 = 16
            if (r11 == 0) goto L_0x0218
            r0 = 32
        L_0x0218:
            r10 = r10 | r0
            goto L_0x002b
        L_0x021b:
            r0 = r20 & 6
            if (r0 != 0) goto L_0x022d
            r0 = r24
            boolean r0 = r14.AGw(r0)
            r10 = 2
            if (r0 == 0) goto L_0x0229
            r10 = 4
        L_0x0229:
            r10 = r10 | r20
            goto L_0x0023
        L_0x022d:
            r10 = r8
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304156Cj.A01(X.5Wy, androidx.compose.ui.Modifier, java.lang.String, X.0sa, X.0sa, int, int, int, long, boolean, boolean):void");
    }
}
