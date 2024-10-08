package com.instagram.barcelona.common.ui.feed;

public abstract class FeedCarouselPinchModifierKt {
    /* JADX WARNING: type inference failed for: r14v1, types: [X.4D7, X.Ikx] */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r7 == 0) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cd A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0153 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0064 A[EDGE_INSN: B:60:0x0064->B:19:0x0064 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x005e A[EDGE_INSN: B:62:0x005e->B:17:0x005e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass6GK r15, X.AnonymousClass4D7 r16, X.0sP r17) {
        /*
            r5 = r16
            r2 = r15
            r3 = r17
            boolean r0 = r5 instanceof X.C58065Ikx
            if (r0 == 0) goto L_0x0154
            r14 = r5
            X.Ikx r14 = (X.C58065Ikx) r14
            int r4 = r14.A04
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x0154
            int r4 = r4 - r1
            r14.A04 = r4
        L_0x0017:
            java.lang.Object r15 = r14.A08
            X.1Hj r13 = X.1Hj.A02
            int r0 = r14.A04
            r12 = 1065353216(0x3f800000, float:1.0)
            r11 = 3
            r10 = 2
            r9 = 0
            r8 = 1
            if (r0 == 0) goto L_0x008f
            if (r0 == r8) goto L_0x007c
            if (r0 == r10) goto L_0x00ce
            if (r0 != r11) goto L_0x015b
            float r1 = r14.A01
            int r7 = r14.A03
            int r6 = r14.A02
            float r5 = r14.A00
            java.lang.Object r4 = r14.A07
            X.6Ft r4 = (X.C304926Ft) r4
            java.lang.Object r3 = r14.A06
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r0 = r14.A05
            X.6GK r2 = X.C51965G9l.A0O(r0, r15)
        L_0x0041:
            X.6Ft r15 = (X.C304926Ft) r15
            java.util.List r0 = r15.A03
            r17 = r0
            int r16 = r17.size()
            r15 = 0
        L_0x004c:
            r0 = r16
            if (r15 >= r0) goto L_0x0064
            r0 = r17
            X.GPU r0 = X.C51965G9l.A0P(r0, r15)
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0061
            if (r7 != 0) goto L_0x0064
        L_0x005e:
            X.0gF r13 = X.C60340gF.A00
        L_0x0060:
            return r13
        L_0x0061:
            int r15 = r15 + 1
            goto L_0x004c
        L_0x0064:
            java.util.List r0 = r4.A03
            r16 = r0
            int r15 = r16.size()
            r4 = 0
        L_0x006d:
            if (r4 >= r15) goto L_0x005e
            r0 = r16
            X.GPU r0 = X.C51965G9l.A0P(r0, r4)
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x00b4
            int r4 = r4 + 1
            goto L_0x006d
        L_0x007c:
            float r1 = r14.A01
            int r7 = r14.A03
            int r6 = r14.A02
            float r5 = r14.A00
            java.lang.Object r3 = r14.A06
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r0 = r14.A05
            X.6GK r2 = X.C51965G9l.A0O(r0, r15)
            goto L_0x00b4
        L_0x008f:
            X.0eS.A00(r15)
            X.5RG r0 = r2.CEf()
            float r1 = r0.C8x()
            r7 = 0
            r14.A05 = r2
            r14.A06 = r3
            r14.A00 = r12
            r14.A02 = r9
            r14.A03 = r9
            r14.A01 = r1
            r14.A04 = r8
            X.GWN r0 = X.GWN.Main
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r2, r0, r14, r9)
            if (r0 == r13) goto L_0x0060
            r6 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x00b4:
            r14.A05 = r2
            r14.A06 = r3
            r0 = 0
            r14.A07 = r0
            r14.A00 = r5
            r14.A02 = r6
            r14.A03 = r7
            r14.A01 = r1
            r14.A04 = r10
            X.GWN r0 = X.GWN.Main
            java.lang.Object r15 = r2.AD0(r0, r14)
            if (r15 != r13) goto L_0x00e0
            return r13
        L_0x00ce:
            float r1 = r14.A01
            int r7 = r14.A03
            int r6 = r14.A02
            float r5 = r14.A00
            java.lang.Object r3 = r14.A06
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r0 = r14.A05
            X.6GK r2 = X.C51965G9l.A0O(r0, r15)
        L_0x00e0:
            r4 = r15
            X.6Ft r4 = (X.C304926Ft) r4
            float r17 = X.I29.A01(r4, r8)
            float r16 = X.I29.A01(r4, r9)
            r15 = 0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0138
            int r0 = (r16 > r15 ? 1 : (r16 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0138
            float r17 = r17 / r16
        L_0x00f6:
            if (r6 != 0) goto L_0x0112
            java.util.List r0 = r4.A03
            int r0 = r0.size()
            if (r0 <= r8) goto L_0x0101
            r7 = 1
        L_0x0101:
            float r5 = r5 * r17
            float r15 = X.I29.A01(r4, r9)
            float r0 = X.AnonymousClass7TE.A00(r12, r5)
            float r0 = r0 * r15
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x011d
            r7 = 1
            r6 = 1
        L_0x0112:
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x011d
            java.lang.Float r0 = X.C51965G9l.A0q(r5)
            r3.invoke(r0)
        L_0x011d:
            if (r7 == 0) goto L_0x013b
            java.util.List r0 = r4.A03
            r17 = r0
            int r16 = r17.size()
            r15 = 0
        L_0x0128:
            r0 = r16
            if (r15 >= r0) goto L_0x013b
            r0 = r17
            X.GPU r0 = X.C51965G9l.A0P(r0, r15)
            r0.A01()
            int r15 = r15 + 1
            goto L_0x0128
        L_0x0138:
            r17 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00f6
        L_0x013b:
            X.GWN r0 = X.GWN.Final
            r14.A05 = r2
            r14.A06 = r3
            r14.A07 = r4
            r14.A00 = r5
            r14.A02 = r6
            r14.A03 = r7
            r14.A01 = r1
            r14.A04 = r11
            java.lang.Object r15 = r2.AD0(r0, r14)
            if (r15 != r13) goto L_0x0041
            return r13
        L_0x0154:
            X.Ikx r14 = new X.Ikx
            r14.<init>(r5)
            goto L_0x0017
        L_0x015b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.common.ui.feed.FeedCarouselPinchModifierKt.A00(X.6GK, X.4D7, X.0sP):java.lang.Object");
    }
}
