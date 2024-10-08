package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;

/* renamed from: X.6HY  reason: invalid class name */
public abstract class AnonymousClass6HY {
    public static final void A02(C287295Zu r12, C304836Fk r13, LazyListState lazyListState, C286575Wy r15, C287245Zp r16, Modifier modifier, 0sP r18, int i, int i2) {
        A00((AnonymousClass6HS) null, r12, r13, lazyListState, r15, r16, modifier, r18, i, i2, false, true);
    }

    public static final void A03(C304836Fk r11, LazyListState lazyListState, C286575Wy r13, Modifier modifier, 0sP r15, int i, int i2, boolean z) {
        A01((AnonymousClass6HS) null, (C287325Zx) null, r11, lazyListState, r13, (C287265Zr) null, modifier, r15, i, i2, false, z);
    }

    public static final void A04(LazyListState lazyListState, C286575Wy r12, Modifier modifier, 0sP r14, int i, int i2, boolean z) {
        A01((AnonymousClass6HS) null, (C287325Zx) null, (C304836Fk) null, lazyListState, r12, (C287265Zr) null, modifier, r14, i, i2, false, z);
    }

    public static final void A05(LazyListState lazyListState, C286575Wy r13, 0sP r14) {
        A01((AnonymousClass6HS) null, (C287325Zx) null, (C304836Fk) null, lazyListState, r13, (C287265Zr) null, (Modifier) null, r14, 12582912, 125, false, true);
    }

    public static final void A06(C286575Wy r12, Modifier modifier, 0sP r14) {
        A01((AnonymousClass6HS) null, (C287325Zx) null, (C304836Fk) null, (LazyListState) null, r12, (C287265Zr) null, modifier, r14, 12582918, 126, false, true);
    }

    public static final void A08(C286575Wy r10, 0sP r11) {
        A01((AnonymousClass6HS) null, (C287325Zx) null, (C304836Fk) null, (LazyListState) null, r10, (C287265Zr) null, (Modifier) null, r11, 0, 255, false, false);
    }

    public static final void A09(C286575Wy r12, 0sP r13) {
        A01((AnonymousClass6HS) null, (C287325Zx) null, (C304836Fk) null, (LazyListState) null, r12, (C287265Zr) null, (Modifier) null, r13, 12582912, 127, false, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r4 == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0079, code lost:
        if (r4 == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r11.AGu(r10) == false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass6HS r20, X.C287295Zu r21, X.C304836Fk r22, androidx.compose.foundation.lazy.LazyListState r23, X.C286575Wy r24, X.C287245Zp r25, androidx.compose.ui.Modifier r26, X.0sP r27, int r28, int r29, boolean r30, boolean r31) {
        /*
            r5 = r31
            r9 = r25
            r2 = r21
            r3 = r22
            r10 = r23
            r1 = r20
            r8 = r26
            r0 = -1724297413(0xffffffff99394f3b, float:-9.580276E-24)
            r11 = r24
            r11.ExV(r0)
            r6 = r29
            r21 = r29 & 1
            r7 = r28
            if (r21 == 0) goto L_0x01d3
            r12 = r28 | 6
        L_0x0020:
            r0 = r28 & 48
            if (r0 != 0) goto L_0x0033
            r0 = r29 & 2
            if (r0 != 0) goto L_0x0030
            boolean r4 = r11.AGu(r10)
            r0 = 32
            if (r4 != 0) goto L_0x0032
        L_0x0030:
            r0 = 16
        L_0x0032:
            r12 = r12 | r0
        L_0x0033:
            r20 = r29 & 4
            if (r20 == 0) goto L_0x01c2
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x0039:
            r19 = r29 & 8
            r13 = r30
            if (r19 == 0) goto L_0x01b1
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x0041:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0054
            r0 = r29 & 16
            if (r0 != 0) goto L_0x0051
            boolean r4 = r11.AGu(r2)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r4 != 0) goto L_0x0053
        L_0x0051:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x0053:
            r12 = r12 | r0
        L_0x0054:
            r18 = r29 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r18 != 0) goto L_0x0068
            r0 = r0 & r28
            if (r0 != 0) goto L_0x0069
            boolean r4 = r11.AGu(r9)
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r4 == 0) goto L_0x0068
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x0068:
            r12 = r12 | r0
        L_0x0069:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 & r28
            if (r0 != 0) goto L_0x007e
            r0 = r29 & 64
            if (r0 != 0) goto L_0x007b
            boolean r4 = r11.AGu(r1)
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r4 != 0) goto L_0x007d
        L_0x007b:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x007d:
            r12 = r12 | r0
        L_0x007e:
            r15 = r6 & 128(0x80, float:1.794E-43)
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            if (r15 != 0) goto L_0x0092
            r0 = r28 & r4
            if (r0 != 0) goto L_0x0093
            boolean r0 = r11.AGv(r5)
            r4 = 4194304(0x400000, float:5.877472E-39)
            if (r0 == 0) goto L_0x0092
            r4 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0092:
            r12 = r12 | r4
        L_0x0093:
            r0 = r6 & 256(0x100, float:3.59E-43)
            r4 = 100663296(0x6000000, float:2.4074124E-35)
            r14 = r27
            if (r0 != 0) goto L_0x00a9
            r0 = r28 & r4
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r11.AGw(r14)
            r4 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 == 0) goto L_0x00a9
            r4 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x00a9:
            r12 = r12 | r4
        L_0x00aa:
            r0 = 38347923(0x2492493, float:1.4777644E-37)
            r4 = r12 & r0
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r4 != r0) goto L_0x00e5
            boolean r0 = r11.Bwn()
            if (r0 == 0) goto L_0x00e5
            r11.Evl()
            r4 = r13
        L_0x00be:
            X.5Xd r11 = r11.ASQ()
            if (r11 == 0) goto L_0x00e4
            r25 = 1
            X.JCA r0 = new X.JCA
            r15 = r0
            r16 = r9
            r17 = r3
            r18 = r1
            r19 = r2
            r20 = r8
            r21 = r10
            r22 = r14
            r23 = r7
            r24 = r6
            r26 = r5
            r27 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r11.A06 = r0
        L_0x00e4:
            return
        L_0x00e5:
            r11.Ewr()
            r0 = r28 & 1
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0176
            boolean r0 = r11.Aw3()
            if (r0 != 0) goto L_0x0176
            r11.Evl()
            r0 = r29 & 2
            if (r0 == 0) goto L_0x0101
            r12 = r12 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0101:
            r0 = r29 & 16
            if (r0 == 0) goto L_0x0107
            r12 = r12 & r16
        L_0x0107:
            r0 = r29 & 64
            if (r0 == 0) goto L_0x010d
            r12 = r12 & r17
        L_0x010d:
            r4 = r13
        L_0x010e:
            r11.ASM()
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x011f
            r13 = -357237069(0xffffffffeab4feb3, float:-1.09404715E26)
            java.lang.String r0 = "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)"
            X.0fL.A01(r13, r0)
        L_0x011f:
            r25 = 0
            r17 = 0
            r0 = r12 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r13 = r12 & 112(0x70, float:1.57E-43)
            r0 = r0 | r13
            r13 = r12 & 896(0x380, float:1.256E-42)
            r0 = r0 | r13
            r13 = r12 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r13
            r13 = 458752(0x70000, float:6.42848E-40)
            int r15 = r12 >> 3
            r13 = r13 & r15
            r0 = r0 | r13
            r13 = 3670016(0x380000, float:5.142788E-39)
            r13 = r13 & r15
            r0 = r0 | r13
            int r13 = r12 >> 15
            r27 = r13 & 14
            int r13 = r12 >> 9
            r13 = r13 & 112(0x70, float:1.57E-43)
            r27 = r27 | r13
            int r12 = r12 >> 18
            r12 = r12 & 896(0x380, float:1.256E-42)
            r27 = r27 | r12
            r28 = 896(0x380, float:1.256E-42)
            r21 = r17
            r22 = r9
            r23 = r8
            r24 = r14
            r26 = r0
            r29 = r4
            r30 = r25
            r31 = r5
            r15 = r1
            r16 = r2
            r18 = r3
            r19 = r10
            r20 = r11
            X.AnonymousClass6HZ.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00be
            r0 = -536298596(0xffffffffe008bb9c, float:-3.941056E19)
            X.0fL.A00(r0)
            goto L_0x00be
        L_0x0176:
            if (r21 == 0) goto L_0x017a
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
        L_0x017a:
            r0 = r29 & 2
            r4 = 0
            if (r0 == 0) goto L_0x0186
            r0 = 3
            androidx.compose.foundation.lazy.LazyListState r10 = X.C305066Gi.A00(r11, r4, r4, r4, r0)
            r12 = r12 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0186:
            if (r20 == 0) goto L_0x018e
            r0 = 0
            X.6Fj r3 = new X.6Fj
            r3.<init>(r0, r0, r0, r0)
        L_0x018e:
            if (r19 != 0) goto L_0x0191
            r4 = r13
        L_0x0191:
            r0 = r29 & 16
            if (r0 == 0) goto L_0x019b
            if (r4 != 0) goto L_0x01ae
            X.5Zu r2 = X.C287275Zs.A01
        L_0x0199:
            r12 = r12 & r16
        L_0x019b:
            if (r18 == 0) goto L_0x019f
            X.5Zp r9 = X.C287215Zl.A05
        L_0x019f:
            r0 = r29 & 64
            if (r0 == 0) goto L_0x01a9
            X.6IU r1 = X.C52385GQk.A00(r11)
            r12 = r12 & r17
        L_0x01a9:
            if (r15 == 0) goto L_0x010e
            r5 = 1
            goto L_0x010e
        L_0x01ae:
            X.5Zu r2 = X.C287275Zs.A00
            goto L_0x0199
        L_0x01b1:
            r0 = r7 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0041
            boolean r4 = r11.AGv(r13)
            r0 = 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x01bf
            r0 = 2048(0x800, float:2.87E-42)
        L_0x01bf:
            r12 = r12 | r0
            goto L_0x0041
        L_0x01c2:
            r0 = r7 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0039
            boolean r4 = r11.AGu(r3)
            r0 = 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x01d0
            r0 = 256(0x100, float:3.59E-43)
        L_0x01d0:
            r12 = r12 | r0
            goto L_0x0039
        L_0x01d3:
            r0 = r28 & 6
            if (r0 != 0) goto L_0x01e3
            boolean r0 = r11.AGu(r8)
            r12 = 2
            if (r0 == 0) goto L_0x01df
            r12 = 4
        L_0x01df:
            r12 = r12 | r28
            goto L_0x0020
        L_0x01e3:
            r12 = r7
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6HY.A00(X.6HS, X.5Zu, X.6Fk, androidx.compose.foundation.lazy.LazyListState, X.5Wy, X.5Zp, androidx.compose.ui.Modifier, X.0sP, int, int, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r1 == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0079, code lost:
        if (r1 == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r11.AGu(r13) == false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass6HS r20, X.C287325Zx r21, X.C304836Fk r22, androidx.compose.foundation.lazy.LazyListState r23, X.C286575Wy r24, X.C287265Zr r25, androidx.compose.ui.Modifier r26, X.0sP r27, int r28, int r29, boolean r30, boolean r31) {
        /*
            r6 = r31
            r10 = r25
            r3 = r21
            r4 = r22
            r13 = r23
            r2 = r20
            r9 = r26
            r0 = -740714857(0xffffffffd3d99697, float:-1.86906876E12)
            r11 = r24
            r11.ExV(r0)
            r7 = r29
            r21 = r29 & 1
            r8 = r28
            if (r21 == 0) goto L_0x01d5
            r12 = r28 | 6
        L_0x0020:
            r0 = r28 & 48
            if (r0 != 0) goto L_0x0033
            r0 = r29 & 2
            if (r0 != 0) goto L_0x0030
            boolean r1 = r11.AGu(r13)
            r0 = 32
            if (r1 != 0) goto L_0x0032
        L_0x0030:
            r0 = 16
        L_0x0032:
            r12 = r12 | r0
        L_0x0033:
            r20 = r29 & 4
            if (r20 == 0) goto L_0x01c4
            r12 = r12 | 384(0x180, float:5.38E-43)
        L_0x0039:
            r19 = r29 & 8
            r15 = r30
            if (r19 == 0) goto L_0x01b3
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x0041:
            r0 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0054
            r0 = r29 & 16
            if (r0 != 0) goto L_0x0051
            boolean r1 = r11.AGu(r3)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x0053
        L_0x0051:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x0053:
            r12 = r12 | r0
        L_0x0054:
            r18 = r29 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r18 != 0) goto L_0x0068
            r0 = r0 & r28
            if (r0 != 0) goto L_0x0069
            boolean r1 = r11.AGu(r10)
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r1 == 0) goto L_0x0068
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x0068:
            r12 = r12 | r0
        L_0x0069:
            r0 = 1572864(0x180000, float:2.204052E-39)
            r0 = r0 & r28
            if (r0 != 0) goto L_0x007e
            r0 = r29 & 64
            if (r0 != 0) goto L_0x007b
            boolean r1 = r11.AGu(r2)
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r1 != 0) goto L_0x007d
        L_0x007b:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x007d:
            r12 = r12 | r0
        L_0x007e:
            r1 = r7 & 128(0x80, float:1.794E-43)
            r5 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != 0) goto L_0x0092
            r0 = r28 & r5
            if (r0 != 0) goto L_0x0093
            boolean r0 = r11.AGv(r6)
            r5 = 4194304(0x400000, float:5.877472E-39)
            if (r0 == 0) goto L_0x0092
            r5 = 8388608(0x800000, float:1.17549435E-38)
        L_0x0092:
            r12 = r12 | r5
        L_0x0093:
            r0 = r7 & 256(0x100, float:3.59E-43)
            r5 = 100663296(0x6000000, float:2.4074124E-35)
            r14 = r27
            if (r0 != 0) goto L_0x00a9
            r0 = r28 & r5
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r11.AGw(r14)
            r5 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 == 0) goto L_0x00a9
            r5 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x00a9:
            r12 = r12 | r5
        L_0x00aa:
            r0 = 38347923(0x2492493, float:1.4777644E-37)
            r5 = r12 & r0
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r5 != r0) goto L_0x00e5
            boolean r0 = r11.Bwn()
            if (r0 == 0) goto L_0x00e5
            r11.Evl()
            r5 = r15
        L_0x00be:
            X.5Xd r1 = r11.ASQ()
            if (r1 == 0) goto L_0x00e4
            r25 = 0
            X.JCA r0 = new X.JCA
            r15 = r0
            r16 = r3
            r17 = r4
            r18 = r2
            r19 = r10
            r20 = r9
            r21 = r13
            r22 = r14
            r23 = r8
            r24 = r7
            r26 = r6
            r27 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r1.A06 = r0
        L_0x00e4:
            return
        L_0x00e5:
            r11.Ewr()
            r0 = r28 & 1
            r17 = -3670017(0xffffffffffc7ffff, float:NaN)
            r16 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0178
            boolean r0 = r11.Aw3()
            if (r0 != 0) goto L_0x0178
            r11.Evl()
            r0 = r29 & 2
            if (r0 == 0) goto L_0x0101
            r12 = r12 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0101:
            r0 = r29 & 16
            if (r0 == 0) goto L_0x0107
            r12 = r12 & r16
        L_0x0107:
            r0 = r29 & 64
            if (r0 == 0) goto L_0x010d
            r12 = r12 & r17
        L_0x010d:
            r5 = r15
        L_0x010e:
            r11.ASM()
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x011f
            r1 = -1806626199(0xffffffff94511269, float:-1.0555434E-26)
            java.lang.String r0 = "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)"
            X.0fL.A01(r1, r0)
        L_0x011f:
            r30 = 1
            r25 = 0
            r16 = 0
            r0 = r12 & 14
            r1 = r0 | 24576(0x6000, float:3.4438E-41)
            r0 = r12 & 112(0x70, float:1.57E-43)
            r1 = r1 | r0
            r0 = r12 & 896(0x380, float:1.256E-42)
            r1 = r1 | r0
            r0 = r12 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r0
            r0 = 458752(0x70000, float:6.42848E-40)
            int r15 = r12 >> 3
            r0 = r0 & r15
            r1 = r1 | r0
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r15
            r1 = r1 | r0
            r15 = 234881024(0xe000000, float:1.5777218E-30)
            int r0 = r12 << 9
            r15 = r15 & r0
            r1 = r1 | r15
            r15 = 1879048192(0x70000000, float:1.58456325E29)
            int r0 = r12 << 15
            r15 = r15 & r0
            r1 = r1 | r15
            int r0 = r12 >> 18
            r0 = r0 & 896(0x380, float:1.256E-42)
            r28 = 3200(0xc80, float:4.484E-42)
            r22 = r16
            r23 = r9
            r24 = r14
            r26 = r1
            r27 = r0
            r29 = r5
            r31 = r6
            r15 = r2
            r17 = r3
            r18 = r4
            r19 = r13
            r20 = r11
            r21 = r10
            X.AnonymousClass6HZ.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00be
            r0 = 404687590(0x181f0ae6, float:2.055577E-24)
            X.0fL.A00(r0)
            goto L_0x00be
        L_0x0178:
            if (r21 == 0) goto L_0x017c
            X.5Qk r9 = androidx.compose.ui.Modifier.A00
        L_0x017c:
            r0 = r29 & 2
            r5 = 0
            if (r0 == 0) goto L_0x0188
            r0 = 3
            androidx.compose.foundation.lazy.LazyListState r13 = X.C305066Gi.A00(r11, r5, r5, r5, r0)
            r12 = r12 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0188:
            if (r20 == 0) goto L_0x0190
            r0 = 0
            X.6Fj r4 = new X.6Fj
            r4.<init>(r0, r0, r0, r0)
        L_0x0190:
            if (r19 != 0) goto L_0x0193
            r5 = r15
        L_0x0193:
            r0 = r29 & 16
            if (r0 == 0) goto L_0x019d
            if (r5 != 0) goto L_0x01b0
            X.5Zx r3 = X.C287275Zs.A07
        L_0x019b:
            r12 = r12 & r16
        L_0x019d:
            if (r18 == 0) goto L_0x01a1
            X.5Zr r10 = X.C287215Zl.A02
        L_0x01a1:
            r0 = r29 & 64
            if (r0 == 0) goto L_0x01ab
            X.6IU r2 = X.C52385GQk.A00(r11)
            r12 = r12 & r17
        L_0x01ab:
            if (r1 == 0) goto L_0x010e
            r6 = 1
            goto L_0x010e
        L_0x01b0:
            X.5Zx r3 = X.C287275Zs.A06
            goto L_0x019b
        L_0x01b3:
            r0 = r8 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0041
            boolean r1 = r11.AGv(r15)
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x01c1
            r0 = 2048(0x800, float:2.87E-42)
        L_0x01c1:
            r12 = r12 | r0
            goto L_0x0041
        L_0x01c4:
            r0 = r8 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0039
            boolean r1 = r11.AGu(r4)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x01d2
            r0 = 256(0x100, float:3.59E-43)
        L_0x01d2:
            r12 = r12 | r0
            goto L_0x0039
        L_0x01d5:
            r0 = r28 & 6
            if (r0 != 0) goto L_0x01e5
            boolean r0 = r11.AGu(r9)
            r12 = 2
            if (r0 == 0) goto L_0x01e1
            r12 = 4
        L_0x01e1:
            r12 = r12 | r28
            goto L_0x0020
        L_0x01e5:
            r12 = r8
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6HY.A01(X.6HS, X.5Zx, X.6Fk, androidx.compose.foundation.lazy.LazyListState, X.5Wy, X.5Zr, androidx.compose.ui.Modifier, X.0sP, int, int, boolean, boolean):void");
    }

    public static final void A07(C286575Wy r11, Modifier modifier, 0sP r13, int i) {
        A01((AnonymousClass6HS) null, (C287325Zx) null, (C304836Fk) null, (LazyListState) null, r11, (C287265Zr) null, modifier, r13, i, 254, false, false);
    }
}
