package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6Fl  reason: invalid class name and case insensitive filesystem */
public abstract class C304846Fl {
    public static final void A02(C286575Wy r10, Modifier modifier, 0sL r12) {
        A01((C304806Fh) null, r10, modifier, (AnonymousClass5S2) null, r12, 0.0f, 1572864, 62, 0, 0);
    }

    public static final void A03(C286575Wy r10, Modifier modifier, 0sL r12) {
        A01((C304806Fh) null, r10, modifier, (AnonymousClass5S2) null, r12, 0.0f, 1572870, 62, 0, 0);
    }

    public static final void A04(C286575Wy r10, 0sL r11) {
        A01((C304806Fh) null, r10, (Modifier) null, (AnonymousClass5S2) null, r11, 0.0f, 1572864, 63, 0, 0);
    }

    public static final void A05(C286575Wy r12, 0sL r13, long j) {
        A01((C304806Fh) null, r12, (Modifier) null, (AnonymousClass5S2) null, r13, 0.0f, 1572864, 59, j, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r7 == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r7 == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x009e, code lost:
        if (r11.AGu(r4) == false) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C304806Fh r33, X.C287095Yz r34, X.C287605aT r35, X.C286575Wy r36, androidx.compose.ui.Modifier r37, X.AnonymousClass5S2 r38, X.C62320sa r39, X.C62320sa r40, X.0sL r41, float r42, int r43, int r44, int r45, long r46, long r48, boolean r50) {
        /*
            r26 = r40
            r15 = r38
            r2 = r46
            r0 = r48
            r27 = r33
            r5 = r35
            r16 = r37
            r4 = r34
            r24 = r50
            r25 = r42
            r6 = 738859723(0x2c0a1acb, float:1.9625853E-12)
            r11 = r36
            r11.ExV(r6)
            r9 = r45
            r6 = r45 & 1
            r46 = r39
            r10 = r43
            if (r6 == 0) goto L_0x0277
            r8 = r43 | 6
        L_0x0028:
            r23 = r45 & 2
            if (r23 == 0) goto L_0x0264
            r8 = r8 | 48
        L_0x002e:
            r22 = r45 & 4
            if (r22 == 0) goto L_0x0251
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0034:
            r21 = r45 & 8
            if (r21 == 0) goto L_0x0240
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x003a:
            r6 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x004d
            r6 = r45 & 16
            if (r6 != 0) goto L_0x004a
            boolean r7 = r11.AGt(r2)
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r7 != 0) goto L_0x004c
        L_0x004a:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x004c:
            r8 = r8 | r6
        L_0x004d:
            r6 = 196608(0x30000, float:2.75506E-40)
            r6 = r43 & r6
            if (r6 != 0) goto L_0x0062
            r6 = r45 & 32
            if (r6 != 0) goto L_0x005f
            boolean r7 = r11.AGt(r0)
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r7 != 0) goto L_0x0061
        L_0x005f:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x0061:
            r8 = r8 | r6
        L_0x0062:
            r20 = r45 & 64
            r6 = 1572864(0x180000, float:2.204052E-39)
            if (r20 != 0) goto L_0x0078
            r6 = r43 & r6
            if (r6 != 0) goto L_0x0079
            r6 = r27
            boolean r7 = r11.AGu(r6)
            r6 = 524288(0x80000, float:7.34684E-40)
            if (r7 == 0) goto L_0x0078
            r6 = 1048576(0x100000, float:1.469368E-39)
        L_0x0078:
            r8 = r8 | r6
        L_0x0079:
            r14 = r9 & 128(0x80, float:1.794E-43)
            r7 = 12582912(0xc00000, float:1.7632415E-38)
            if (r14 != 0) goto L_0x008d
            r6 = r43 & r7
            if (r6 != 0) goto L_0x008e
            boolean r6 = r11.AGu(r5)
            r7 = 4194304(0x400000, float:5.877472E-39)
            if (r6 == 0) goto L_0x008d
            r7 = 8388608(0x800000, float:1.17549435E-38)
        L_0x008d:
            r8 = r8 | r7
        L_0x008e:
            r6 = 100663296(0x6000000, float:2.4074124E-35)
            r6 = r43 & r6
            if (r6 != 0) goto L_0x00a3
            r6 = r9 & 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x00a0
            boolean r7 = r11.AGu(r4)
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            if (r7 != 0) goto L_0x00a2
        L_0x00a0:
            r6 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00a2:
            r8 = r8 | r6
        L_0x00a3:
            r13 = r9 & 512(0x200, float:7.175E-43)
            r6 = 805306368(0x30000000, float:4.656613E-10)
            if (r13 != 0) goto L_0x00b9
            r6 = r43 & r6
            if (r6 != 0) goto L_0x00ba
            r6 = r24
            boolean r7 = r11.AGv(r6)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            if (r7 == 0) goto L_0x00b9
            r6 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x00b9:
            r8 = r8 | r6
        L_0x00ba:
            r12 = r9 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x022a
            r19 = r44 | 6
        L_0x00c0:
            r6 = r9 & 2048(0x800, float:2.87E-42)
            r45 = r41
            if (r6 == 0) goto L_0x0216
            r19 = r19 | 48
        L_0x00c8:
            r6 = 306783379(0x12492493, float:6.34695E-28)
            r7 = r8 & r6
            r6 = 306783378(0x12492492, float:6.3469493E-28)
            if (r7 != r6) goto L_0x010d
            r7 = r19 & 19
            r6 = 18
            if (r7 != r6) goto L_0x010d
            boolean r6 = r11.Bwn()
            if (r6 == 0) goto L_0x010d
            r11.Evl()
        L_0x00e1:
            X.5Xd r7 = r11.ASQ()
            if (r7 == 0) goto L_0x010c
            X.JCo r6 = new X.JCo
            r33 = r6
            r34 = r27
            r35 = r4
            r36 = r5
            r37 = r16
            r38 = r15
            r39 = r46
            r40 = r26
            r41 = r45
            r42 = r25
            r43 = r10
            r45 = r9
            r46 = r2
            r48 = r0
            r50 = r24
            r33.<init>(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r50)
            r7.A06 = r6
        L_0x010c:
            return
        L_0x010d:
            r11.Ewr()
            r6 = r43 & 1
            r18 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r7 = -57345(0xffffffffffff1fff, float:NaN)
            if (r6 == 0) goto L_0x01ac
            boolean r6 = r11.Aw3()
            if (r6 != 0) goto L_0x01ac
            r11.Evl()
            r6 = r9 & 16
            if (r6 == 0) goto L_0x012b
            r8 = r8 & r7
        L_0x012b:
            r6 = r9 & 32
            if (r6 == 0) goto L_0x0131
            r8 = r8 & r17
        L_0x0131:
            r6 = r9 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0137
            r8 = r8 & r18
        L_0x0137:
            r11.ASM()
            boolean r6 = X.0fL.A02()
            if (r6 == 0) goto L_0x0148
            r7 = 1750651843(0x6858d3c3, float:4.09575E24)
            java.lang.String r6 = "com.instagram.compose.igds.core.IgSurface (IgSurface.kt:62)"
            X.0fL.A01(r7, r6)
        L_0x0148:
            X.4bM r7 = X.C304856Fm.A00
            X.5RW r6 = new X.5RW
            r6.<init>(r0)
            X.5Xl r6 = r7.A02(r6)
            r40 = 0
            X.5Xl[] r36 = new X.C286705Xl[]{r6}
            int r12 = r8 >> 3
            r7 = r12 & 14
            int r6 = r8 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            r7 = r7 | r6
            r6 = r8 & 896(0x380, float:1.256E-42)
            r7 = r7 | r6
            r6 = r8 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r6
            r8 = r8 | r7
            r6 = 458752(0x70000, float:6.42848E-40)
            r6 = r6 & r12
            r8 = r8 | r6
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r12
            r8 = r8 | r6
            r6 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r12
            r8 = r8 | r6
            r6 = 234881024(0xe000000, float:1.5777218E-30)
            r12 = r12 & r6
            r8 = r8 | r12
            r39 = r19 & 14
            r6 = r19 & 112(0x70, float:1.57E-43)
            r39 = r39 | r6
            r31 = r16
            r32 = r15
            r33 = r46
            r34 = r26
            r35 = r45
            r37 = r25
            r38 = r8
            r41 = r2
            r43 = r24
            r28 = r4
            r29 = r5
            r30 = r11
            X.C304876Fo.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43)
            boolean r6 = X.0fL.A02()
            if (r6 == 0) goto L_0x00e1
            r6 = -1080620547(0xffffffffbf9709fd, float:-1.1799923)
            X.0fL.A00(r6)
            goto L_0x00e1
        L_0x01ac:
            if (r23 == 0) goto L_0x01b0
            X.5Qk r16 = androidx.compose.ui.Modifier.A00
        L_0x01b0:
            if (r22 == 0) goto L_0x01b4
            r26 = 0
        L_0x01b4:
            if (r21 == 0) goto L_0x01b8
            X.5S2 r15 = X.AnonymousClass5S0.A00
        L_0x01b8:
            r6 = r9 & 16
            if (r6 == 0) goto L_0x01c3
            X.5Yw r2 = X.AnonymousClass5aQ.A00(r11)
            long r2 = r2.A17
            r8 = r8 & r7
        L_0x01c3:
            r6 = r9 & 32
            if (r6 == 0) goto L_0x01cf
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r11)
            long r0 = r0.A0o
            r8 = r8 & r17
        L_0x01cf:
            if (r20 == 0) goto L_0x01d3
            r27 = 0
        L_0x01d3:
            if (r14 == 0) goto L_0x01f7
            r5 = 1137805955(0x43d18a83, float:419.08212)
            r11.ExS(r5)
            java.lang.Object r5 = r11.ECw()
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r5 != r6) goto L_0x01ee
            X.5aS r5 = new X.5aS
            r5.<init>()
            r6 = r11
            X.5Wx r6 = (X.C286565Wx) r6
            r6.A0Q(r5)
        L_0x01ee:
            X.5aT r5 = (X.C287605aT) r5
            r7 = r11
            X.5Wx r7 = (X.C286565Wx) r7
            r6 = 0
            X.C286565Wx.A0L(r7, r6)
        L_0x01f7:
            r6 = r9 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x020c
            X.4bM r6 = X.AnonymousClass5ZU.A00
            r4 = r11
            X.5Wx r4 = (X.C286565Wx) r4
            X.5RM r4 = X.C286565Wx.A04(r4)
            java.lang.Object r4 = X.C286615Xc.A01(r6, r4)
            X.5Yz r4 = (X.C287095Yz) r4
            r8 = r8 & r18
        L_0x020c:
            if (r13 == 0) goto L_0x0210
            r24 = 1
        L_0x0210:
            if (r12 == 0) goto L_0x0137
            r25 = 0
            goto L_0x0137
        L_0x0216:
            r6 = r44 & 48
            if (r6 != 0) goto L_0x00c8
            r6 = r45
            boolean r7 = r11.AGw(r6)
            r6 = 16
            if (r7 == 0) goto L_0x0226
            r6 = 32
        L_0x0226:
            r19 = r19 | r6
            goto L_0x00c8
        L_0x022a:
            r6 = r44 & 6
            if (r6 != 0) goto L_0x023c
            r6 = r25
            boolean r7 = r11.AGr(r6)
            r6 = 2
            if (r7 == 0) goto L_0x0238
            r6 = 4
        L_0x0238:
            r19 = r44 | r6
            goto L_0x00c0
        L_0x023c:
            r19 = r44
            goto L_0x00c0
        L_0x0240:
            r6 = r10 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x003a
            boolean r7 = r11.AGu(r15)
            r6 = 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x024e
            r6 = 2048(0x800, float:2.87E-42)
        L_0x024e:
            r8 = r8 | r6
            goto L_0x003a
        L_0x0251:
            r6 = r10 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0034
            r6 = r26
            boolean r7 = r11.AGw(r6)
            r6 = 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0261
            r6 = 256(0x100, float:3.59E-43)
        L_0x0261:
            r8 = r8 | r6
            goto L_0x0034
        L_0x0264:
            r6 = r43 & 48
            if (r6 != 0) goto L_0x002e
            r6 = r16
            boolean r7 = r11.AGu(r6)
            r6 = 16
            if (r7 == 0) goto L_0x0274
            r6 = 32
        L_0x0274:
            r8 = r8 | r6
            goto L_0x002e
        L_0x0277:
            r6 = r43 & 6
            if (r6 != 0) goto L_0x0289
            r6 = r46
            boolean r6 = r11.AGw(r6)
            r8 = 2
            if (r6 == 0) goto L_0x0285
            r8 = 4
        L_0x0285:
            r8 = r8 | r43
            goto L_0x0028
        L_0x0289:
            r8 = r10
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304846Fl.A00(X.6Fh, X.5Yz, X.5aT, X.5Wy, androidx.compose.ui.Modifier, X.5S2, X.0sa, X.0sa, X.0sL, float, int, int, int, long, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r9.AGt(r2) == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r10 == false) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C304806Fh r24, X.C286575Wy r25, androidx.compose.ui.Modifier r26, X.AnonymousClass5S2 r27, X.0sL r28, float r29, int r30, int r31, long r32, long r34) {
        /*
            r7 = r29
            r13 = r24
            r0 = r34
            r2 = r32
            r12 = r27
            r5 = r26
            r4 = 6
            r8 = r28
            X.0qQ.A0B(r8, r4)
            r4 = -264842950(0xfffffffff036d13a, float:-2.2631684E29)
            r9 = r25
            r9.ExV(r4)
            r17 = r31 & 1
            r6 = r30
            if (r17 == 0) goto L_0x0175
            r11 = r30 | 6
        L_0x0022:
            r16 = r31 & 2
            if (r16 == 0) goto L_0x0164
            r11 = r11 | 48
        L_0x0028:
            r4 = r6 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x003b
            r4 = r31 & 4
            if (r4 != 0) goto L_0x0038
            boolean r10 = r9.AGt(r2)
            r4 = 256(0x100, float:3.59E-43)
            if (r10 != 0) goto L_0x003a
        L_0x0038:
            r4 = 128(0x80, float:1.794E-43)
        L_0x003a:
            r11 = r11 | r4
        L_0x003b:
            r4 = r6 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x004e
            r4 = r31 & 8
            if (r4 != 0) goto L_0x004b
            boolean r10 = r9.AGt(r0)
            r4 = 2048(0x800, float:2.87E-42)
            if (r10 != 0) goto L_0x004d
        L_0x004b:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x004d:
            r11 = r11 | r4
        L_0x004e:
            r15 = r31 & 16
            if (r15 == 0) goto L_0x0153
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
        L_0x0054:
            r14 = r31 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r14 != 0) goto L_0x0068
            r4 = r30 & r4
            if (r4 != 0) goto L_0x0069
            boolean r10 = r9.AGr(r7)
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r10 == 0) goto L_0x0068
            r4 = 131072(0x20000, float:1.83671E-40)
        L_0x0068:
            r11 = r11 | r4
        L_0x0069:
            r10 = r31 & 64
            r4 = 1572864(0x180000, float:2.204052E-39)
            if (r10 != 0) goto L_0x007d
            r4 = r30 & r4
            if (r4 != 0) goto L_0x007e
            boolean r10 = r9.AGw(r8)
            r4 = 524288(0x80000, float:7.34684E-40)
            if (r10 == 0) goto L_0x007d
            r4 = 1048576(0x100000, float:1.469368E-39)
        L_0x007d:
            r11 = r11 | r4
        L_0x007e:
            r4 = 599187(0x92493, float:8.3964E-40)
            r10 = r11 & r4
            r4 = 599186(0x92492, float:8.39638E-40)
            if (r10 != r4) goto L_0x00b1
            boolean r4 = r9.Bwn()
            if (r4 == 0) goto L_0x00b1
            r9.Evl()
        L_0x0091:
            X.5Xd r9 = r9.ASQ()
            if (r9 == 0) goto L_0x00b0
            X.JAS r4 = new X.JAS
            r24 = r4
            r25 = r13
            r26 = r5
            r27 = r12
            r28 = r8
            r29 = r7
            r30 = r6
            r32 = r2
            r34 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r34)
            r9.A06 = r4
        L_0x00b0:
            return
        L_0x00b1:
            r9.Ewr()
            r4 = r30 & 1
            if (r4 == 0) goto L_0x012b
            boolean r4 = r9.Aw3()
            if (r4 != 0) goto L_0x012b
            r9.Evl()
            r4 = r31 & 4
            if (r4 == 0) goto L_0x00c7
            r11 = r11 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c7:
            r4 = r31 & 8
            if (r4 == 0) goto L_0x00cd
            r11 = r11 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00cd:
            r9.ASM()
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x00de
            r10 = -437194727(0xffffffffe5f0f019, float:-1.4222462E23)
            java.lang.String r4 = "com.instagram.compose.igds.core.IgSurface (IgSurface.kt:33)"
            X.0fL.A01(r10, r4)
        L_0x00de:
            r14 = 0
            r30 = 0
            int r4 = r11 << 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r23 = r4 | 6
            int r10 = r11 << 6
            r4 = r10 & 7168(0x1c00, float:1.0045E-41)
            r23 = r23 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r4 = r4 & r10
            r23 = r23 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r10
            r23 = r23 | r4
            r4 = 3670016(0x380000, float:5.142788E-39)
            r10 = r10 & r4
            r23 = r23 | r10
            int r4 = r11 >> 15
            r24 = r4 & 14
            r4 = r4 & 112(0x70, float:1.57E-43)
            r24 = r24 | r4
            r25 = 900(0x384, float:1.261E-42)
            r15 = r14
            r19 = r14
            r20 = r14
            r22 = r7
            r26 = r2
            r28 = r0
            r16 = r9
            r17 = r5
            r18 = r12
            r21 = r8
            A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30)
            boolean r4 = X.0fL.A02()
            if (r4 == 0) goto L_0x0091
            r4 = -1123428929(0xffffffffbd09d5bf, float:-0.03365111)
            X.0fL.A00(r4)
            goto L_0x0091
        L_0x012b:
            if (r17 == 0) goto L_0x012f
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
        L_0x012f:
            if (r16 == 0) goto L_0x0133
            X.5S2 r12 = X.AnonymousClass5S0.A00
        L_0x0133:
            r4 = r31 & 4
            if (r4 == 0) goto L_0x013f
            X.5Yw r2 = X.AnonymousClass5aQ.A00(r9)
            long r2 = r2.A17
            r11 = r11 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x013f:
            r4 = r31 & 8
            if (r4 == 0) goto L_0x014b
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r9)
            long r0 = r0.A0o
            r11 = r11 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x014b:
            if (r15 == 0) goto L_0x014e
            r13 = 0
        L_0x014e:
            if (r14 == 0) goto L_0x00cd
            r7 = 0
            goto L_0x00cd
        L_0x0153:
            r4 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0054
            boolean r10 = r9.AGu(r13)
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x0161
            r4 = 16384(0x4000, float:2.2959E-41)
        L_0x0161:
            r11 = r11 | r4
            goto L_0x0054
        L_0x0164:
            r4 = r30 & 48
            if (r4 != 0) goto L_0x0028
            boolean r10 = r9.AGu(r12)
            r4 = 16
            if (r10 == 0) goto L_0x0172
            r4 = 32
        L_0x0172:
            r11 = r11 | r4
            goto L_0x0028
        L_0x0175:
            r4 = r30 & 6
            if (r4 != 0) goto L_0x0185
            boolean r4 = r9.AGu(r5)
            r11 = 2
            if (r4 == 0) goto L_0x0181
            r11 = 4
        L_0x0181:
            r11 = r11 | r30
            goto L_0x0022
        L_0x0185:
            r11 = r6
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304846Fl.A01(X.6Fh, X.5Wy, androidx.compose.ui.Modifier, X.5S2, X.0sL, float, int, int, long, long):void");
    }
}
