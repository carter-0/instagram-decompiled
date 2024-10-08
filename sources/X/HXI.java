package X;

public abstract class HXI {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (X.C51972G9s.A1V(r12, r8, r11 & 512) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r13 == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        if (r13 == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        if (r13 == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0090, code lost:
        if (r13 == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x010a, code lost:
        if ((r10 & 128) != 0) goto L_0x010c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r22, androidx.compose.ui.Modifier r23, X.AnonymousClass5S2 r24, X.C56035Hri r25, X.0sL r26, X.0sK r27, int r28, int r29, long r30, long r32, long r34, boolean r36) {
        /*
            r4 = r34
            r0 = r32
            r2 = r30
            r7 = r24
            r21 = r36
            r8 = r25
            r15 = r23
            r30 = 0
            r6 = 4625855(0x4695bf, float:6.482204E-39)
            r12 = r22
            r12.ExV(r6)
            r10 = r29
            r6 = r29 & 1
            r11 = r28
            if (r6 == 0) goto L_0x01ad
            r9 = r28 | 6
        L_0x0022:
            r14 = r29 & 2
            if (r14 == 0) goto L_0x01a2
            r9 = r9 | 48
        L_0x0028:
            r6 = r11 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x003d
            r6 = r29 & 4
            if (r6 != 0) goto L_0x003a
            r6 = r11 & 512(0x200, float:7.175E-43)
            boolean r13 = X.C51972G9s.A1V(r12, r8, r6)
            r6 = 256(0x100, float:3.59E-43)
            if (r13 != 0) goto L_0x003c
        L_0x003a:
            r6 = 128(0x80, float:1.794E-43)
        L_0x003c:
            r9 = r9 | r6
        L_0x003d:
            r20 = r29 & 8
            if (r20 == 0) goto L_0x0195
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0043:
            r6 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0056
            r6 = r29 & 16
            if (r6 != 0) goto L_0x0053
            boolean r13 = r12.AGu(r7)
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r13 != 0) goto L_0x0055
        L_0x0053:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x0055:
            r9 = r9 | r6
        L_0x0056:
            r6 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 & r28
            if (r6 != 0) goto L_0x006b
            r6 = r29 & 32
            if (r6 != 0) goto L_0x0068
            boolean r13 = r12.AGt(r2)
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r13 != 0) goto L_0x006a
        L_0x0068:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x006a:
            r9 = r9 | r6
        L_0x006b:
            r6 = 1572864(0x180000, float:2.204052E-39)
            r6 = r6 & r28
            if (r6 != 0) goto L_0x0080
            r6 = r29 & 64
            if (r6 != 0) goto L_0x007d
            boolean r13 = r12.AGt(r0)
            r6 = 1048576(0x100000, float:1.469368E-39)
            if (r13 != 0) goto L_0x007f
        L_0x007d:
            r6 = 524288(0x80000, float:7.34684E-40)
        L_0x007f:
            r9 = r9 | r6
        L_0x0080:
            r6 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r6 & r28
            if (r6 != 0) goto L_0x0095
            r6 = r10 & 128(0x80, float:1.794E-43)
            if (r6 != 0) goto L_0x0092
            boolean r13 = r12.AGt(r4)
            r6 = 8388608(0x800000, float:1.17549435E-38)
            if (r13 != 0) goto L_0x0094
        L_0x0092:
            r6 = 4194304(0x400000, float:5.877472E-39)
        L_0x0094:
            r9 = r9 | r6
        L_0x0095:
            r13 = r10 & 256(0x100, float:3.59E-43)
            r6 = 100663296(0x6000000, float:2.4074124E-35)
            if (r13 != 0) goto L_0x00a5
            r6 = r28 & r6
            if (r6 != 0) goto L_0x00a6
            r6 = r26
            int r6 = X.G9t.A0M(r12, r6)
        L_0x00a5:
            r9 = r9 | r6
        L_0x00a6:
            r13 = 38347923(0x2492493, float:1.4777644E-37)
            r13 = r13 & r9
            r6 = 38347922(0x2492492, float:1.4777643E-37)
            if (r13 != r6) goto L_0x00d4
            boolean r6 = r12.Bwn()
            if (r6 == 0) goto L_0x00d4
            r12.Evl()
        L_0x00b8:
            X.5Xd r9 = r12.ASQ()
            if (r9 == 0) goto L_0x00d3
            X.JBX r6 = new X.JBX
            r22 = r6
            r28 = r11
            r29 = r10
            r30 = r2
            r32 = r0
            r34 = r4
            r36 = r21
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r32, r34, r36)
            r9.A06 = r6
        L_0x00d3:
            return
        L_0x00d4:
            r12.Ewr()
            r6 = r28 & 1
            r19 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -3670017(0xffffffffffc7ffff, float:NaN)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            if (r6 == 0) goto L_0x0157
            boolean r6 = r12.Aw3()
            if (r6 != 0) goto L_0x0157
            r12.Evl()
            r6 = r29 & 4
            if (r6 == 0) goto L_0x00f6
            r9 = r9 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00f6:
            r6 = r29 & 16
            if (r6 == 0) goto L_0x00fc
            r9 = r9 & r16
        L_0x00fc:
            r6 = r29 & 32
            if (r6 == 0) goto L_0x0102
            r9 = r9 & r17
        L_0x0102:
            r6 = r29 & 64
            if (r6 == 0) goto L_0x0108
            r9 = r9 & r18
        L_0x0108:
            r6 = r10 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x010e
        L_0x010c:
            r9 = r9 & r19
        L_0x010e:
            boolean r6 = X.C51967G9n.A1S(r12)
            if (r6 == 0) goto L_0x011c
            r13 = 2063496798(0x7afe765e, float:6.606221E35)
            java.lang.String r6 = "com.instagram.compose.igds.components.bottomsheet.IgdsModalBottomSheetLayout (ModalBottomSheet.kt:33)"
            X.0fL.A01(r13, r6)
        L_0x011c:
            X.4bM r6 = X.C304856Fm.A00
            X.5Xl r6 = X.C51969G9p.A0T(r6, r0)
            X.5Xl[] r28 = new X.C286705Xl[]{r6}
            int r13 = X.C51965G9l.A01(r9)
            r6 = 512(0x200, float:7.175E-43)
            int r29 = X.C51974G9v.A01(r13, r6, r9)
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r9
            r29 = r29 | r6
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r6 = r6 & r9
            r29 = r29 | r6
            r31 = r2
            r33 = r4
            r35 = r21
            r23 = r15
            r24 = r7
            r25 = r8
            X.I3G.A01(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35)
            boolean r6 = X.0fL.A02()
            if (r6 == 0) goto L_0x00b8
            r6 = -639950602(0xffffffffd9db20f6, float:-7.7099076E15)
            X.0fL.A00(r6)
            goto L_0x00b8
        L_0x0157:
            if (r14 == 0) goto L_0x015b
            X.5Qk r15 = androidx.compose.ui.Modifier.A00
        L_0x015b:
            r6 = r29 & 4
            if (r6 == 0) goto L_0x016b
            X.HLh r14 = X.C54624HLh.Hidden
            r13 = 0
            r8 = 6
            r6 = 14
            X.Hri r8 = X.I3G.A00(r12, r14, r13, r8, r6)
            r9 = r9 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x016b:
            if (r20 == 0) goto L_0x016f
            r21 = 1
        L_0x016f:
            r6 = r29 & 16
            if (r6 == 0) goto L_0x0177
            X.5S2 r7 = X.C56486HzI.A01
            r9 = r9 & r16
        L_0x0177:
            r6 = r29 & 32
            if (r6 == 0) goto L_0x0181
            long r2 = X.C51966G9m.A08(r12)
            r9 = r9 & r17
        L_0x0181:
            r6 = r29 & 64
            if (r6 == 0) goto L_0x018b
            long r0 = X.C51966G9m.A0H(r12)
            r9 = r9 & r18
        L_0x018b:
            r6 = r10 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x010e
            long r4 = X.C56486HzI.A00(r12)
            goto L_0x010c
        L_0x0195:
            r6 = r11 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0043
            r6 = r21
            int r6 = X.G9t.A0b(r12, r6)
            r9 = r9 | r6
            goto L_0x0043
        L_0x01a2:
            r6 = r28 & 48
            if (r6 != 0) goto L_0x0028
            int r6 = X.G9t.A0P(r12, r15)
            r9 = r9 | r6
            goto L_0x0028
        L_0x01ad:
            r6 = r28 & 6
            if (r6 != 0) goto L_0x01bb
            r6 = r27
            int r9 = X.C41848B3p.A01(r12, r6)
            r9 = r9 | r28
            goto L_0x0022
        L_0x01bb:
            r9 = r11
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HXI.A00(X.5Wy, androidx.compose.ui.Modifier, X.5S2, X.Hri, X.0sL, X.0sK, int, int, long, long, long, boolean):void");
    }
}
