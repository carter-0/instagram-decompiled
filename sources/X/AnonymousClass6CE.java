package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6CE  reason: invalid class name */
public abstract class AnonymousClass6CE {
    public static final void A01(C286575Wy r11, Modifier modifier, AnonymousClass6CD r13, AnonymousClass6CC r14, String str, C62320sa r16, int i, int i2, boolean z) {
        A00((C287605aT) null, r11, modifier, (AnonymousClass6CG) null, r13, r14, str, r16, i, i2, false, z);
    }

    public static final void A02(C286575Wy r11, Modifier modifier, AnonymousClass6CC r13, String str, C62320sa r15) {
        A00((C287605aT) null, r11, modifier, (AnonymousClass6CG) null, AnonymousClass6CD.LARGE, r13, str, r15, 1573248, 408, false, false);
    }

    public static final void A03(C286575Wy r11, Modifier modifier, AnonymousClass6CC r13, String str, C62320sa r15) {
        A00((C287605aT) null, r11, modifier, (AnonymousClass6CG) null, AnonymousClass6CD.LARGE, r13, str, r15, 1572864, 408, false, false);
    }

    public static final void A04(C286575Wy r11, Modifier modifier, AnonymousClass6CC r13, String str, C62320sa r15) {
        A00((C287605aT) null, r11, modifier, (AnonymousClass6CG) null, AnonymousClass6CD.SMALL, r13, str, r15, 1573248, 408, false, false);
    }

    public static final void A05(C286575Wy r11, Modifier modifier, AnonymousClass6CC r13, String str, C62320sa r15, int i) {
        A00((C287605aT) null, r11, modifier, (AnonymousClass6CG) null, AnonymousClass6CD.LARGE, r13, str, r15, i, 408, false, false);
    }

    public static final void A06(C286575Wy r11, Modifier modifier, AnonymousClass6CC r13, String str, C62320sa r15, int i) {
        A00((C287605aT) null, r11, modifier, (AnonymousClass6CG) null, (AnonymousClass6CD) null, r13, str, r15, i, 472, false, false);
    }

    public static final void A08(C286575Wy r11, AnonymousClass6CD r12, AnonymousClass6CC r13, String str, C62320sa r15, int i, int i2) {
        A00((C287605aT) null, r11, (Modifier) null, (AnonymousClass6CG) null, r12, r13, str, r15, i, i2, false, false);
    }

    public static final void A09(C286575Wy r11, AnonymousClass6CC r12, String str, C62320sa r14, int i) {
        A00((C287605aT) null, r11, (Modifier) null, (AnonymousClass6CG) null, (AnonymousClass6CD) null, r12, str, r14, i, 476, false, false);
    }

    public static final void A0A(C286575Wy r11, AnonymousClass6CC r12, String str, C62320sa r14, int i, int i2) {
        A00((C287605aT) null, r11, (Modifier) null, (AnonymousClass6CG) null, AnonymousClass6CD.LARGE, r12, str, r14, i, i2, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        if (r13 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00fc, code lost:
        if (r8 != false) goto L_0x00fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C287605aT r21, X.C286575Wy r22, androidx.compose.ui.Modifier r23, X.AnonymousClass6CG r24, X.AnonymousClass6CD r25, X.AnonymousClass6CC r26, java.lang.String r27, X.C62320sa r28, int r29, int r30, boolean r31, boolean r32) {
        /*
            r11 = r24
            r8 = r32
            r9 = r31
            r4 = r26
            r0 = r21
            r6 = r25
            r12 = r23
            r10 = 0
            r20 = r28
            r1 = r20
            X.0qQ.A0B(r1, r10)
            r2 = 1
            r32 = r27
            r1 = r32
            X.0qQ.A0B(r1, r2)
            r1 = 528072151(0x1f79bdd7, float:5.2884833E-20)
            r3 = r22
            r3.ExV(r1)
            r1 = r30
            r5 = r30 & 1
            r2 = r29
            if (r5 == 0) goto L_0x01f8
            r5 = r29 | 6
        L_0x0030:
            r7 = r30 & 2
            if (r7 == 0) goto L_0x01e5
            r5 = r5 | 48
        L_0x0036:
            r19 = r30 & 4
            if (r19 == 0) goto L_0x01d4
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x003c:
            r18 = r30 & 8
            if (r18 == 0) goto L_0x01c3
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0042:
            r17 = r30 & 16
            if (r17 == 0) goto L_0x01b2
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0048:
            r7 = 196608(0x30000, float:2.75506E-40)
            r7 = r7 & r29
            if (r7 != 0) goto L_0x005d
            r7 = r30 & 32
            if (r7 != 0) goto L_0x005a
            boolean r13 = r3.AGu(r4)
            r7 = 131072(0x20000, float:1.83671E-40)
            if (r13 != 0) goto L_0x005c
        L_0x005a:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x005c:
            r5 = r5 | r7
        L_0x005d:
            r16 = r30 & 64
            r7 = 1572864(0x180000, float:2.204052E-39)
            if (r16 != 0) goto L_0x0071
            r7 = r7 & r29
            if (r7 != 0) goto L_0x0072
            boolean r13 = r3.AGu(r6)
            r7 = 524288(0x80000, float:7.34684E-40)
            if (r13 == 0) goto L_0x0071
            r7 = 1048576(0x100000, float:1.469368E-39)
        L_0x0071:
            r5 = r5 | r7
        L_0x0072:
            r13 = r1 & 128(0x80, float:1.794E-43)
            r14 = 12582912(0xc00000, float:1.7632415E-38)
            if (r13 != 0) goto L_0x0086
            r7 = r29 & r14
            if (r7 != 0) goto L_0x0087
            boolean r7 = r3.AGv(r8)
            r14 = 4194304(0x400000, float:5.877472E-39)
            if (r7 == 0) goto L_0x0086
            r14 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0086:
            r5 = r5 | r14
        L_0x0087:
            r14 = r1 & 256(0x100, float:3.59E-43)
            r15 = 100663296(0x6000000, float:2.4074124E-35)
            if (r14 != 0) goto L_0x009b
            r7 = r29 & r15
            if (r7 != 0) goto L_0x009c
            boolean r7 = r3.AGu(r11)
            r15 = 33554432(0x2000000, float:9.403955E-38)
            if (r7 == 0) goto L_0x009b
            r15 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x009b:
            r5 = r5 | r15
        L_0x009c:
            r7 = 38347923(0x2492493, float:1.4777644E-37)
            r15 = r5 & r7
            r7 = 38347922(0x2492492, float:1.4777643E-37)
            if (r15 != r7) goto L_0x00d0
            boolean r7 = r3.Bwn()
            if (r7 == 0) goto L_0x00d0
            r3.Evl()
        L_0x00af:
            X.5Xd r5 = r3.ASQ()
            if (r5 == 0) goto L_0x00cf
            X.JBY r3 = new X.JBY
            r13 = r3
            r14 = r0
            r15 = r12
            r16 = r11
            r17 = r6
            r18 = r4
            r19 = r32
            r21 = r2
            r22 = r1
            r23 = r9
            r24 = r8
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5.A06 = r3
        L_0x00cf:
            return
        L_0x00d0:
            r3.Ewr()
            r7 = r29 & 1
            r15 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r7 == 0) goto L_0x0172
            boolean r7 = r3.Aw3()
            if (r7 != 0) goto L_0x0172
            r3.Evl()
            r7 = r30 & 32
            if (r7 == 0) goto L_0x00e8
            r5 = r5 & r15
        L_0x00e8:
            r3.ASM()
            boolean r7 = X.0fL.A02()
            if (r7 == 0) goto L_0x00f9
            r10 = -312158701(0xffffffffed64d613, float:-4.4263364E27)
            java.lang.String r7 = "com.instagram.compose.igds.components.button.IgdsButton (IgdsButton.kt:68)"
            X.0fL.A01(r10, r7)
        L_0x00f9:
            if (r9 != 0) goto L_0x00fe
            r10 = 0
            if (r8 == 0) goto L_0x00ff
        L_0x00fe:
            r10 = 1
        L_0x00ff:
            float r7 = r4.Axc()
            androidx.compose.ui.Modifier r18 = X.C288245bb.A00(r0, r12, r7, r10)
            float r24 = r4.CoN(r6)
            X.6Fj r16 = r4.E1Z(r6)
            int r7 = r5 >> 18
            r10 = r7 & 14
            int r7 = r5 >> 12
            r7 = r7 & 112(0x70, float:1.57E-43)
            r10 = r10 | r7
            X.5S2 r19 = r4.AD5(r3, r6, r10)
            long r28 = r4.AD4(r8)
            X.6Fh r14 = r4.AE1()
            r10 = 14
            X.9LZ r7 = new X.9LZ
            r7.<init>(r4, r10)
            r10 = 2046615546(0x79fcdffa, float:1.641252E35)
            X.5PJ r22 = X.AnonymousClass5PI.A01(r3, r7, r10)
            r13 = -1030072133(0xffffffffc29a58bb, float:-77.1733)
            X.6CH r10 = new X.6CH
            r7 = r32
            r10.<init>(r11, r4, r7, r9)
            X.5PJ r23 = X.AnonymousClass5PI.A01(r3, r10, r13)
            r25 = r5 & 14
            int r7 = r5 >> 3
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r25 = r25 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            int r5 = r5 >> 9
            r7 = r7 & r5
            r25 = r25 | r7
            r5 = r5 & 14
            r5 = r5 | 432(0x1b0, float:6.05E-43)
            r27 = 2
            r21 = 0
            r26 = r5
            r30 = r9
            r31 = r8
            r15 = r0
            r17 = r3
            X.AnonymousClass6CI.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31)
            boolean r5 = X.0fL.A02()
            if (r5 == 0) goto L_0x00af
            r5 = 94588147(0x5a34cf3, float:1.5356713E-35)
            X.0fL.A00(r5)
            goto L_0x00af
        L_0x0172:
            if (r19 == 0) goto L_0x0176
            X.5Qk r12 = androidx.compose.ui.Modifier.A00
        L_0x0176:
            if (r18 == 0) goto L_0x0199
            r0 = -1719072954(0xffffffff99890746, float:-1.4168406E-23)
            r3.ExS(r0)
            java.lang.Object r0 = r3.ECw()
            java.lang.Object r7 = X.AnonymousClass5XT.A00
            if (r0 != r7) goto L_0x0191
            X.5aS r0 = new X.5aS
            r0.<init>()
            r7 = r3
            X.5Wx r7 = (X.C286565Wx) r7
            r7.A0Q(r0)
        L_0x0191:
            X.5aT r0 = (X.C287605aT) r0
            r7 = r3
            X.5Wx r7 = (X.C286565Wx) r7
            X.C286565Wx.A0L(r7, r10)
        L_0x0199:
            if (r17 == 0) goto L_0x019c
            r9 = 1
        L_0x019c:
            r7 = r30 & 32
            if (r7 == 0) goto L_0x01a5
            X.6CB r4 = X.AnonymousClass6CA.A01(r3)
            r5 = r5 & r15
        L_0x01a5:
            if (r16 == 0) goto L_0x01a9
            X.6CD r6 = X.AnonymousClass6CD.SMALL
        L_0x01a9:
            if (r13 == 0) goto L_0x01ac
            r8 = 0
        L_0x01ac:
            if (r14 == 0) goto L_0x00e8
            X.6CF r11 = X.AnonymousClass6CF.A00
            goto L_0x00e8
        L_0x01b2:
            r7 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0048
            boolean r13 = r3.AGv(r9)
            r7 = 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L_0x01c0
            r7 = 16384(0x4000, float:2.2959E-41)
        L_0x01c0:
            r5 = r5 | r7
            goto L_0x0048
        L_0x01c3:
            r7 = r2 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0042
            boolean r13 = r3.AGu(r0)
            r7 = 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x01d1
            r7 = 2048(0x800, float:2.87E-42)
        L_0x01d1:
            r5 = r5 | r7
            goto L_0x0042
        L_0x01d4:
            r7 = r2 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x003c
            boolean r13 = r3.AGu(r12)
            r7 = 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x01e2
            r7 = 256(0x100, float:3.59E-43)
        L_0x01e2:
            r5 = r5 | r7
            goto L_0x003c
        L_0x01e5:
            r7 = r29 & 48
            if (r7 != 0) goto L_0x0036
            r7 = r32
            boolean r13 = r3.AGu(r7)
            r7 = 16
            if (r13 == 0) goto L_0x01f5
            r7 = 32
        L_0x01f5:
            r5 = r5 | r7
            goto L_0x0036
        L_0x01f8:
            r5 = r29 & 6
            if (r5 != 0) goto L_0x020a
            r5 = r20
            boolean r7 = r3.AGw(r5)
            r5 = 2
            if (r7 == 0) goto L_0x0206
            r5 = 4
        L_0x0206:
            r5 = r5 | r29
            goto L_0x0030
        L_0x020a:
            r5 = r2
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6CE.A00(X.5aT, X.5Wy, androidx.compose.ui.Modifier, X.6CG, X.6CD, X.6CC, java.lang.String, X.0sa, int, int, boolean, boolean):void");
    }

    public static final void A07(C286575Wy r11, Modifier modifier, AnonymousClass6CC r13, C62320sa r14) {
        A00((C287605aT) null, r11, modifier, (AnonymousClass6CG) null, (AnonymousClass6CD) null, r13, "Follow", r14, 438, 472, false, false);
    }
}
