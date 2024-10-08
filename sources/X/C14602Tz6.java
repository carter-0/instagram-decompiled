package X;

/* renamed from: X.Tz6  reason: case insensitive filesystem */
public abstract class C14602Tz6 {
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A00(java.util.List r23, int r24, int r25, int r26, int r27, int r28, int r29) {
        /*
            r1 = 1
            r9 = 0
            r22 = 0
            r21 = 1
            if (r29 != 0) goto L_0x000c
            r22 = 1
            r21 = 0
        L_0x000c:
            int r10 = android.view.View.MeasureSpec.getMode(r24)
            int r8 = android.view.View.MeasureSpec.getMode(r25)
            r0 = 2
            int[] r6 = new int[r0]
            r6 = {-1, -1} // fill-array
            int r7 = android.view.View.MeasureSpec.getSize(r24)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x0024
            r6[r9] = r7
        L_0x0024:
            int r5 = android.view.View.MeasureSpec.getSize(r25)
            if (r8 != r0) goto L_0x002c
            r6[r1] = r5
        L_0x002c:
            if (r10 != r0) goto L_0x0031
            if (r8 != r0) goto L_0x0031
        L_0x0030:
            return r6
        L_0x0031:
            r20 = 0
            r19 = 0
            r18 = 0
            if (r22 == 0) goto L_0x003f
            r20 = r26
            r19 = r27
            r18 = r28
        L_0x003f:
            r17 = 0
            r16 = 0
            r15 = 0
            if (r21 == 0) goto L_0x004c
            r17 = r26
            r16 = r27
            r15 = r28
        L_0x004c:
            r11 = 0
            r4 = 0
            r2 = 0
            r3 = 0
        L_0x0050:
            r1 = r23
            int r0 = r1.size()
            if (r11 >= r0) goto L_0x00bf
            java.lang.Object r0 = r1.get(r11)
            X.Txy r0 = (X.C14538Txy) r0
            X.6SI r0 = r0.A00
            java.lang.Object r0 = r0.A00()
            X.6Sh r0 = (X.C307996Sh) r0
            X.3dH r13 = r0.A01
            r14 = 0
            if (r11 != 0) goto L_0x006c
            r14 = 1
        L_0x006c:
            int r0 = r1.size()
            int r0 = r0 + -1
            r12 = 0
            if (r11 == r0) goto L_0x0076
            r12 = 1
        L_0x0076:
            int r0 = r13.A01()
            if (r12 == 0) goto L_0x00eb
            if (r14 == 0) goto L_0x0080
            int r0 = r20 + r0
        L_0x0080:
            int r0 = r0 + r19
        L_0x0082:
            int r9 = java.lang.Math.max(r9, r0)
            int r4 = r4 + r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r1) goto L_0x0096
            if (r22 == 0) goto L_0x008f
            if (r4 >= r7) goto L_0x0093
        L_0x008f:
            if (r21 == 0) goto L_0x0096
            if (r9 < r7) goto L_0x0096
        L_0x0093:
            r0 = 0
            r6[r0] = r7
        L_0x0096:
            int r0 = r13.A00()
            if (r12 == 0) goto L_0x00e5
            if (r14 == 0) goto L_0x00a0
            int r0 = r0 + r17
        L_0x00a0:
            int r0 = r0 + r16
        L_0x00a2:
            int r2 = java.lang.Math.max(r2, r0)
            int r3 = r3 + r0
            if (r8 != r1) goto L_0x00b4
            if (r21 == 0) goto L_0x00ad
            if (r3 >= r5) goto L_0x00b1
        L_0x00ad:
            if (r22 == 0) goto L_0x00b4
            if (r2 < r5) goto L_0x00b4
        L_0x00b1:
            r0 = 1
            r6[r0] = r5
        L_0x00b4:
            r0 = 0
            r0 = r6[r0]
            r1 = -1
            if (r0 <= r1) goto L_0x00e1
            r0 = 1
            r0 = r6[r0]
            if (r0 <= r1) goto L_0x00e1
        L_0x00bf:
            if (r10 != 0) goto L_0x00d0
            if (r22 == 0) goto L_0x00c4
            r9 = r4
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            r6[r1] = r9
        L_0x00c7:
            if (r8 != 0) goto L_0x00f2
            if (r21 == 0) goto L_0x00cc
            r2 = r3
        L_0x00cc:
            r0 = 1
            r6[r0] = r2
            return r6
        L_0x00d0:
            r1 = 0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 != r0) goto L_0x00c7
            if (r22 == 0) goto L_0x00dc
            int r9 = java.lang.Math.min(r4, r7)
            goto L_0x00c5
        L_0x00dc:
            int r9 = java.lang.Math.min(r9, r7)
            goto L_0x00c5
        L_0x00e1:
            int r11 = r11 + 1
            goto L_0x0050
        L_0x00e5:
            if (r14 == 0) goto L_0x00e9
            int r0 = r0 + r17
        L_0x00e9:
            int r0 = r0 + r15
            goto L_0x00a2
        L_0x00eb:
            if (r14 == 0) goto L_0x00ef
            int r0 = r20 + r0
        L_0x00ef:
            int r0 = r0 + r18
            goto L_0x0082
        L_0x00f2:
            r1 = 1
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r0) goto L_0x0030
            if (r21 == 0) goto L_0x0100
            int r0 = java.lang.Math.min(r3, r5)
        L_0x00fd:
            r6[r1] = r0
            return r6
        L_0x0100:
            int r0 = java.lang.Math.min(r2, r5)
            goto L_0x00fd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14602Tz6.A00(java.util.List, int, int, int, int, int, int):int[]");
    }
}
