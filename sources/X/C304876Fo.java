package X;

/* renamed from: X.6Fo  reason: invalid class name and case insensitive filesystem */
public abstract class C304876Fo {
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0076, code lost:
        if (r3 == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a0, code lost:
        if (r12.AGw(r4) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C304806Fh r26, X.C287095Yz r27, X.C287605aT r28, X.C286575Wy r29, androidx.compose.ui.Modifier r30, X.AnonymousClass5S2 r31, X.C62320sa r32, X.C62320sa r33, X.0sL r34, X.C286705Xl[] r35, float r36, int r37, int r38, int r39, long r40, boolean r42) {
        /*
            r8 = r30
            r4 = r35
            r7 = r31
            r1 = r40
            r6 = r28
            r15 = r36
            r5 = r27
            r9 = r42
            r0 = 259302042(0xf74a29a, float:1.2061445E-29)
            r12 = r29
            r12.ExV(r0)
            r10 = r39
            r24 = r39 & 1
            r11 = r37
            if (r24 == 0) goto L_0x021e
            r14 = r37 | 6
        L_0x0022:
            r23 = r39 & 2
            if (r23 == 0) goto L_0x020b
            r14 = r14 | 48
        L_0x0028:
            r22 = r39 & 4
            if (r22 == 0) goto L_0x01f8
            r14 = r14 | 384(0x180, float:5.38E-43)
        L_0x002e:
            r21 = r39 & 8
            if (r21 == 0) goto L_0x01e7
            r14 = r14 | 3072(0xc00, float:4.305E-42)
        L_0x0034:
            r20 = r39 & 16
            if (r20 == 0) goto L_0x01d6
            r14 = r14 | 24576(0x6000, float:3.4438E-41)
        L_0x003a:
            r19 = r39 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r19 != 0) goto L_0x0050
            r0 = r37 & r0
            if (r0 != 0) goto L_0x0051
            r0 = r26
            boolean r3 = r12.AGu(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r3 == 0) goto L_0x0050
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x0050:
            r14 = r14 | r0
        L_0x0051:
            r18 = r39 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            if (r18 != 0) goto L_0x0065
            r0 = r37 & r0
            if (r0 != 0) goto L_0x0066
            boolean r3 = r12.AGu(r6)
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r3 == 0) goto L_0x0065
            r0 = 1048576(0x100000, float:1.469368E-39)
        L_0x0065:
            r14 = r14 | r0
        L_0x0066:
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r37 & r0
            if (r0 != 0) goto L_0x007b
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0078
            boolean r3 = r12.AGu(r5)
            r0 = 8388608(0x800000, float:1.17549435E-38)
            if (r3 != 0) goto L_0x007a
        L_0x0078:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x007a:
            r14 = r14 | r0
        L_0x007b:
            r13 = r10 & 256(0x100, float:3.59E-43)
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            if (r13 != 0) goto L_0x008f
            r0 = r37 & r3
            if (r0 != 0) goto L_0x0090
            boolean r0 = r12.AGv(r9)
            r3 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 == 0) goto L_0x008f
            r3 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x008f:
            r14 = r14 | r3
        L_0x0090:
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r0 = r37 & r0
            if (r0 != 0) goto L_0x00a5
            r0 = r10 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x00a2
            boolean r3 = r12.AGw(r4)
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r3 != 0) goto L_0x00a4
        L_0x00a2:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00a4:
            r14 = r14 | r0
        L_0x00a5:
            r3 = r10 & 1024(0x400, float:1.435E-42)
            r25 = r38
            if (r3 == 0) goto L_0x01c2
            r17 = r38 | 6
        L_0x00ad:
            r0 = r10 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01ae
            r17 = r17 | 48
        L_0x00b3:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r14 = r14 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r14 != r0) goto L_0x00f5
            r14 = r17 & 19
            r0 = 18
            if (r14 != r0) goto L_0x00f5
            boolean r0 = r12.Bwn()
            if (r0 == 0) goto L_0x00f5
            r12.Evl()
            r14 = r26
        L_0x00cd:
            X.5Xd r3 = r12.ASQ()
            if (r3 == 0) goto L_0x00f4
            X.JCt r0 = new X.JCt
            r18 = r7
            r19 = r32
            r20 = r33
            r21 = r34
            r22 = r4
            r23 = r15
            r24 = r11
            r26 = r10
            r27 = r1
            r29 = r9
            r13 = r0
            r15 = r5
            r16 = r6
            r17 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29)
            r3.A06 = r0
        L_0x00f4:
            return
        L_0x00f5:
            r12.Ewr()
            r0 = r37 & 1
            if (r0 == 0) goto L_0x0150
            boolean r0 = r12.Aw3()
            if (r0 != 0) goto L_0x0150
            r12.Evl()
            r14 = r26
        L_0x0107:
            r12.ASM()
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0118
            r3 = 3133706(0x2fd10a, float:4.391257E-39)
            java.lang.String r0 = "com.meta.compose.material.surface.Surface (Surface.kt:116)"
            X.0fL.A01(r3, r0)
        L_0x0118:
            int r0 = r4.length
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r4, r0)
            X.5Xl[] r13 = (X.C286705Xl[]) r13
            r3 = -803834022(0xffffffffd016775a, float:-1.00976169E10)
            X.6Fp r0 = new X.6Fp
            r26 = r0
            r27 = r14
            r28 = r5
            r29 = r6
            r30 = r8
            r31 = r7
            r35 = r15
            r36 = r1
            r38 = r9
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38)
            X.5PJ r3 = X.AnonymousClass5PI.A01(r12, r0, r3)
            r0 = 56
            X.C286715Xm.A01(r12, r3, r13, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00cd
            r0 = 437552973(0x1a14874d, float:3.0714978E-23)
            X.0fL.A00(r0)
            goto L_0x00cd
        L_0x0150:
            if (r24 == 0) goto L_0x0154
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
        L_0x0154:
            r14 = 0
            if (r23 == 0) goto L_0x0159
            r32 = r14
        L_0x0159:
            if (r22 == 0) goto L_0x015d
            r33 = r14
        L_0x015d:
            if (r21 == 0) goto L_0x0161
            X.5S2 r7 = X.AnonymousClass5S0.A00
        L_0x0161:
            if (r20 == 0) goto L_0x0165
            long r1 = X.AnonymousClass5RW.A07
        L_0x0165:
            if (r19 != 0) goto L_0x0169
            r14 = r26
        L_0x0169:
            if (r18 == 0) goto L_0x018c
            r0 = -1315924028(0xffffffffb19097c4, float:-4.2082053E-9)
            r12.ExS(r0)
            java.lang.Object r6 = r12.ECw()
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r6 != r0) goto L_0x0184
            X.5aS r6 = new X.5aS
            r6.<init>()
            r0 = r12
            X.5Wx r0 = (X.C286565Wx) r0
            r0.A0Q(r6)
        L_0x0184:
            X.5aT r6 = (X.C287605aT) r6
            r0 = r12
            X.5Wx r0 = (X.C286565Wx) r0
            X.C286565Wx.A0I(r0)
        L_0x018c:
            r0 = r10 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x019f
            X.4bM r5 = X.AnonymousClass5ZU.A00
            r0 = r12
            X.5Wx r0 = (X.C286565Wx) r0
            X.5RM r0 = X.C286565Wx.A04(r0)
            java.lang.Object r5 = X.C286615Xc.A01(r5, r0)
            X.5Yz r5 = (X.C287095Yz) r5
        L_0x019f:
            if (r13 == 0) goto L_0x01a2
            r9 = 1
        L_0x01a2:
            r0 = r10 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01a9
            r0 = 0
            X.5Xl[] r4 = new X.C286705Xl[r0]
        L_0x01a9:
            if (r3 == 0) goto L_0x0107
            r15 = 0
            goto L_0x0107
        L_0x01ae:
            r0 = r38 & 48
            if (r0 != 0) goto L_0x00b3
            r0 = r34
            boolean r16 = r12.AGw(r0)
            r0 = 16
            if (r16 == 0) goto L_0x01be
            r0 = 32
        L_0x01be:
            r17 = r17 | r0
            goto L_0x00b3
        L_0x01c2:
            r0 = r38 & 6
            if (r0 != 0) goto L_0x01d2
            boolean r16 = r12.AGr(r15)
            r0 = 2
            if (r16 == 0) goto L_0x01ce
            r0 = 4
        L_0x01ce:
            r17 = r38 | r0
            goto L_0x00ad
        L_0x01d2:
            r17 = r25
            goto L_0x00ad
        L_0x01d6:
            r0 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003a
            boolean r3 = r12.AGt(r1)
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x01e4
            r0 = 16384(0x4000, float:2.2959E-41)
        L_0x01e4:
            r14 = r14 | r0
            goto L_0x003a
        L_0x01e7:
            r0 = r11 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0034
            boolean r3 = r12.AGu(r7)
            r0 = 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x01f5
            r0 = 2048(0x800, float:2.87E-42)
        L_0x01f5:
            r14 = r14 | r0
            goto L_0x0034
        L_0x01f8:
            r0 = r11 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x002e
            r0 = r33
            boolean r3 = r12.AGw(r0)
            r0 = 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0208
            r0 = 256(0x100, float:3.59E-43)
        L_0x0208:
            r14 = r14 | r0
            goto L_0x002e
        L_0x020b:
            r0 = r37 & 48
            if (r0 != 0) goto L_0x0028
            r0 = r32
            boolean r3 = r12.AGw(r0)
            r0 = 16
            if (r3 == 0) goto L_0x021b
            r0 = 32
        L_0x021b:
            r14 = r14 | r0
            goto L_0x0028
        L_0x021e:
            r0 = r37 & 6
            if (r0 != 0) goto L_0x022e
            boolean r0 = r12.AGu(r8)
            r14 = 2
            if (r0 == 0) goto L_0x022a
            r14 = 4
        L_0x022a:
            r14 = r14 | r37
            goto L_0x0022
        L_0x022e:
            r14 = r11
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304876Fo.A00(X.6Fh, X.5Yz, X.5aT, X.5Wy, androidx.compose.ui.Modifier, X.5S2, X.0sa, X.0sa, X.0sL, X.5Xl[], float, int, int, int, long, boolean):void");
    }
}
