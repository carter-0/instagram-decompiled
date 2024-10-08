package X;

import java.util.Arrays;

public abstract class SS3 {
    public static int[] A00 = new int[10];
    public static final byte[] A01 = {0, 0, 0, 1};
    public static final float[] A02 = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object A03 = Pxe.A0p();

    public static int A00(byte[] bArr, int i) {
        int i2;
        synchronized (A03) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 < i - 2) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = i;
                        break;
                    }
                }
                if (i3 < i) {
                    int[] iArr = A00;
                    int length = iArr.length;
                    if (length <= i4) {
                        iArr = Arrays.copyOf(iArr, length * 2);
                        A00 = iArr;
                    }
                    iArr[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = A00[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0072, code lost:
        if (r8[r11 - 3] == 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        if (r8[r11 - 2] == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007d, code lost:
        if (r8[r2] == 1) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008d, code lost:
        if (r8[r2] != 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a3, code lost:
        if (r9[2] != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a8, code lost:
        if (r9[1] != false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(byte[] r8, boolean[] r9, int r10, int r11) {
        /*
            int r5 = r11 - r10
            r7 = 0
            r4 = 1
            boolean r0 = X.Pxf.A1R(r5)
            X.C11366SPh.A02(r0)
            if (r5 == 0) goto L_0x00ab
            boolean r0 = r9[r7]
            if (r0 == 0) goto L_0x001b
            r9[r7] = r7
            r9[r4] = r7
            r0 = 2
            r9[r0] = r7
            int r10 = r10 + -3
            return r10
        L_0x001b:
            r3 = 2
            if (r5 <= r4) goto L_0x0046
            boolean r0 = r9[r4]
            if (r0 == 0) goto L_0x002e
            byte r0 = r8[r10]
            if (r0 != r4) goto L_0x002e
            r9[r7] = r7
            r9[r4] = r7
            r9[r3] = r7
            int r10 = r10 - r3
            return r10
        L_0x002e:
            if (r5 <= r3) goto L_0x0046
            boolean r0 = r9[r3]
            if (r0 == 0) goto L_0x0046
            byte r0 = r8[r10]
            if (r0 != 0) goto L_0x0046
            int r0 = r10 + 1
            byte r0 = r8[r0]
            if (r0 != r4) goto L_0x0046
            r9[r7] = r7
            r9[r4] = r7
            r9[r3] = r7
            int r10 = r10 - r4
            return r10
        L_0x0046:
            int r2 = r11 + -1
            int r6 = r10 + 2
        L_0x004a:
            if (r6 >= r2) goto L_0x006c
            byte r1 = r8[r6]
            r0 = r1 & 254(0xfe, float:3.56E-43)
            if (r0 != 0) goto L_0x0069
            int r10 = r6 + -2
            byte r0 = r8[r10]
            if (r0 != 0) goto L_0x0067
            int r0 = r6 + -1
            byte r0 = r8[r0]
            if (r0 != 0) goto L_0x0067
            if (r1 != r4) goto L_0x0067
            r9[r7] = r7
            r9[r4] = r7
            r9[r3] = r7
            return r10
        L_0x0067:
            int r6 = r6 + -2
        L_0x0069:
            int r6 = r6 + 3
            goto L_0x004a
        L_0x006c:
            if (r5 <= r3) goto L_0x009f
            int r0 = r11 + -3
            byte r0 = r8[r0]
            if (r0 != 0) goto L_0x007f
        L_0x0074:
            int r0 = r11 + -2
            byte r0 = r8[r0]
            if (r0 != 0) goto L_0x007f
        L_0x007a:
            byte r1 = r8[r2]
            r0 = 1
            if (r1 == r4) goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            r9[r7] = r0
            if (r5 <= r4) goto L_0x009a
            int r0 = r11 + -2
            byte r0 = r8[r0]
            if (r0 != 0) goto L_0x008f
        L_0x008a:
            byte r1 = r8[r2]
            r0 = 1
            if (r1 == 0) goto L_0x0090
        L_0x008f:
            r0 = 0
        L_0x0090:
            r9[r4] = r0
            byte r0 = r8[r2]
            if (r0 != 0) goto L_0x0097
            r7 = 1
        L_0x0097:
            r9[r3] = r7
            return r11
        L_0x009a:
            boolean r0 = r9[r3]
            if (r0 == 0) goto L_0x008f
            goto L_0x008a
        L_0x009f:
            if (r5 != r3) goto L_0x00a6
            boolean r0 = r9[r3]
            if (r0 == 0) goto L_0x007f
            goto L_0x0074
        L_0x00a6:
            boolean r0 = r9[r4]
            if (r0 == 0) goto L_0x007f
            goto L_0x007a
        L_0x00ab:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SS3.A01(byte[], boolean[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
        if (r0 == 2) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C10852RzC A02(byte[] r37, int r38, int r39) {
        /*
            X.SRU r5 = new X.SRU
            r2 = r37
            r1 = r38
            r0 = r39
            r5.<init>(r2, r1, r0)
            r0 = 4
            r5.A05(r0)
            r23 = 3
            r0 = r23
            int r2 = r5.A03(r0)
            r5.A04()
            r13 = 2
            int r26 = r5.A03(r13)
            boolean r39 = r5.A06()
            r0 = 5
            int r27 = r5.A03(r0)
            r28 = 0
            r1 = 0
        L_0x002b:
            r0 = 32
            r4 = 1
            if (r1 >= r0) goto L_0x003c
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x0039
            int r4 = r4 << r1
            r28 = r28 | r4
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x003c:
            r3 = 6
            int[] r0 = new int[r3]
            r22 = r0
            r1 = 0
        L_0x0042:
            r7 = 8
            if (r1 >= r3) goto L_0x004f
            int r0 = r5.A03(r7)
            r22[r1] = r0
            int r1 = r1 + 1
            goto L_0x0042
        L_0x004f:
            int r32 = r5.A03(r7)
            r3 = 0
            r1 = 0
        L_0x0055:
            if (r3 >= r2) goto L_0x006a
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x005f
            int r1 = r1 + 89
        L_0x005f:
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x0067
            int r1 = r1 + 8
        L_0x0067:
            int r3 = r3 + 1
            goto L_0x0055
        L_0x006a:
            r5.A05(r1)
            if (r2 <= 0) goto L_0x0076
            int r0 = 8 - r2
            int r0 = r0 * 2
            r5.A05(r0)
        L_0x0076:
            X.SRU.A00(r5)
            int r21 = X.SRU.A00(r5)
            r1 = r23
            r0 = r21
            if (r0 != r1) goto L_0x0086
            r5.A04()
        L_0x0086:
            int r33 = X.SRU.A00(r5)
            int r34 = X.SRU.A00(r5)
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x00b8
            int r10 = X.SRU.A00(r5)
            int r9 = X.SRU.A00(r5)
            int r8 = X.SRU.A00(r5)
            int r6 = X.SRU.A00(r5)
            r0 = r21
            if (r0 == r4) goto L_0x00ab
            r3 = 1
            if (r0 != r13) goto L_0x00ac
        L_0x00ab:
            r3 = 2
        L_0x00ac:
            r1 = 1
            if (r0 != r4) goto L_0x00b0
            r1 = 2
        L_0x00b0:
            int r10 = r10 + r9
            int r3 = r3 * r10
            int r33 = r33 - r3
            int r8 = r8 + r6
            int r1 = r1 * r8
            int r34 = r34 - r1
        L_0x00b8:
            int r30 = X.SRU.A00(r5)
            int r31 = X.SRU.A00(r5)
            int r20 = X.SRU.A00(r5)
            boolean r0 = r5.A06()
            r1 = r2
            if (r0 == 0) goto L_0x00cc
            r1 = 0
        L_0x00cc:
            r38 = -1
            r19 = -1
        L_0x00d0:
            X.SRU.A00(r5)
            if (r1 > r2) goto L_0x00e5
            int r3 = X.SRU.A00(r5)
            r0 = r19
            int r19 = java.lang.Math.max(r3, r0)
            X.SRU.A00(r5)
            int r1 = r1 + 1
            goto L_0x00d0
        L_0x00e5:
            X.SRU.A00(r5)
            X.SRU.A00(r5)
            X.SRU.A00(r5)
            X.SRU.A00(r5)
            X.SRU.A00(r5)
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x0135
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x0135
            r2 = 0
        L_0x0101:
            r1 = 0
        L_0x0102:
            boolean r0 = r5.A06()
            r6 = 1
            if (r0 != 0) goto L_0x011b
            X.SRU.A00(r5)
        L_0x010c:
            r0 = r23
            if (r2 != r0) goto L_0x0111
            r6 = 3
        L_0x0111:
            int r1 = r1 + r6
            r0 = 6
            if (r1 < r0) goto L_0x0102
            int r2 = r2 + 1
            r0 = 4
            if (r2 >= r0) goto L_0x0135
            goto L_0x0101
        L_0x011b:
            r3 = 64
            int r0 = r2 << 1
            int r0 = r0 + 4
            int r0 = r4 << r0
            int r3 = java.lang.Math.min(r3, r0)
            if (r2 <= r4) goto L_0x012c
            X.SRU.A00(r5)
        L_0x012c:
            r0 = 0
        L_0x012d:
            if (r0 >= r3) goto L_0x010c
            X.SRU.A00(r5)
            int r0 = r0 + 1
            goto L_0x012d
        L_0x0135:
            r5.A05(r13)
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x014a
            r5.A05(r7)
            X.SRU.A00(r5)
            X.SRU.A00(r5)
            r5.A04()
        L_0x014a:
            int r18 = X.SRU.A00(r5)
            r0 = 0
            int[] r12 = new int[r0]
            int[] r9 = new int[r0]
            r0 = -1
            r11 = -1
            r17 = 0
        L_0x0157:
            r2 = r18
            r1 = r17
            if (r1 >= r2) goto L_0x0233
            if (r17 == 0) goto L_0x01e7
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x01e7
            int r15 = r0 + r11
            boolean r3 = r5.A06()
            int r1 = X.SRU.A00(r5)
            int r2 = r1 + 1
            int r1 = r3 * 2
            int r3 = 1 - r1
            int r3 = r3 * r2
            int r6 = r15 + 1
            boolean[] r2 = new boolean[r6]
            r1 = 0
        L_0x017b:
            if (r1 > r15) goto L_0x018f
            boolean r8 = r5.A06()
            if (r8 != 0) goto L_0x018c
            boolean r8 = r5.A06()
            r2[r1] = r8
        L_0x0189:
            int r1 = r1 + 1
            goto L_0x017b
        L_0x018c:
            r2[r1] = r4
            goto L_0x0189
        L_0x018f:
            int[] r10 = new int[r6]
            int[] r14 = new int[r6]
            int r16 = r11 + -1
            r6 = 0
        L_0x0196:
            if (r16 < 0) goto L_0x01a6
            r1 = r9[r16]
            int r1 = r1 + r3
            if (r1 >= 0) goto L_0x01a3
            int r8 = r0 + r16
            int r6 = X.Pxg.A0B(r10, r2, r8, r6, r1)
        L_0x01a3:
            int r16 = r16 + -1
            goto L_0x0196
        L_0x01a6:
            if (r3 >= 0) goto L_0x01ac
            int r6 = X.Pxg.A0B(r10, r2, r15, r6, r3)
        L_0x01ac:
            r1 = 0
        L_0x01ad:
            if (r1 >= r0) goto L_0x01bb
            r8 = r12[r1]
            int r8 = r8 + r3
            if (r8 >= 0) goto L_0x01b8
            int r6 = X.Pxg.A0B(r10, r2, r1, r6, r8)
        L_0x01b8:
            int r1 = r1 + 1
            goto L_0x01ad
        L_0x01bb:
            int[] r16 = java.util.Arrays.copyOf(r10, r6)
            int r8 = r0 + -1
            r1 = 0
        L_0x01c2:
            if (r8 < 0) goto L_0x01d0
            r10 = r12[r8]
            int r10 = r10 + r3
            if (r10 <= 0) goto L_0x01cd
            int r1 = X.Pxg.A0B(r14, r2, r8, r1, r10)
        L_0x01cd:
            int r8 = r8 + -1
            goto L_0x01c2
        L_0x01d0:
            if (r3 <= 0) goto L_0x01d6
            int r1 = X.Pxg.A0B(r14, r2, r15, r1, r3)
        L_0x01d6:
            r8 = 0
        L_0x01d7:
            if (r8 >= r11) goto L_0x0227
            r10 = r9[r8]
            int r10 = r10 + r3
            if (r10 <= 0) goto L_0x01e4
            int r12 = r0 + r8
            int r1 = X.Pxg.A0B(r14, r2, r12, r1, r10)
        L_0x01e4:
            int r8 = r8 + 1
            goto L_0x01d7
        L_0x01e7:
            int r0 = X.SRU.A00(r5)
            int r11 = X.SRU.A00(r5)
            int[] r12 = new int[r0]
            r1 = 0
        L_0x01f2:
            if (r1 >= r0) goto L_0x020b
            if (r1 <= 0) goto L_0x0209
            int r2 = r1 + -1
            r3 = r12[r2]
        L_0x01fa:
            int r2 = X.SRU.A00(r5)
            int r2 = r2 + 1
            int r3 = r3 - r2
            r12[r1] = r3
            r5.A04()
            int r1 = r1 + 1
            goto L_0x01f2
        L_0x0209:
            r3 = 0
            goto L_0x01fa
        L_0x020b:
            int[] r9 = new int[r11]
            r1 = 0
        L_0x020e:
            if (r1 >= r11) goto L_0x022f
            if (r1 <= 0) goto L_0x0225
            int r2 = r1 + -1
            r3 = r9[r2]
        L_0x0216:
            int r2 = X.SRU.A00(r5)
            int r2 = r2 + 1
            int r3 = r3 + r2
            r9[r1] = r3
            r5.A04()
            int r1 = r1 + 1
            goto L_0x020e
        L_0x0225:
            r3 = 0
            goto L_0x0216
        L_0x0227:
            int[] r9 = java.util.Arrays.copyOf(r14, r1)
            r12 = r16
            r0 = r6
            r11 = r1
        L_0x022f:
            int r17 = r17 + 1
            goto L_0x0157
        L_0x0233:
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x024a
            int r2 = X.SRU.A00(r5)
            r1 = 0
        L_0x023e:
            if (r1 >= r2) goto L_0x024a
            int r0 = r20 + 4
            int r0 = r0 + 1
            r5.A05(r0)
            int r1 = r1 + 1
            goto L_0x023e
        L_0x024a:
            r5.A05(r13)
            r0 = 1065353216(0x3f800000, float:1.0)
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x02ed
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x0274
            int r2 = r5.A03(r7)
            r1 = 255(0xff, float:3.57E-43)
            if (r2 != r1) goto L_0x02d8
            r1 = 16
            int r2 = r5.A03(r1)
            int r1 = r5.A03(r1)
            if (r2 == 0) goto L_0x0274
            if (r1 == 0) goto L_0x0274
            float r0 = (float) r2
            float r1 = (float) r1
            float r0 = r0 / r1
        L_0x0274:
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x027d
            r5.A04()
        L_0x027d:
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x02d5
            r1 = r23
            r5.A05(r1)
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x028f
            r13 = 1
        L_0x028f:
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x02d3
            int r2 = r5.A03(r7)
            int r1 = r5.A03(r7)
            r5.A05(r7)
            int r38 = X.SRQ.A00(r2)
            int r2 = X.SRQ.A01(r1)
        L_0x02a8:
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x02b4
            X.SRU.A00(r5)
            X.SRU.A00(r5)
        L_0x02b4:
            r5.A04()
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x02bf
            int r34 = r34 * 2
        L_0x02bf:
            r36 = r38
            r38 = r2
        L_0x02c3:
            X.RzC r23 = new X.RzC
            r24 = r22
            r25 = r0
            r29 = r21
            r35 = r19
            r37 = r13
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return r23
        L_0x02d3:
            r2 = -1
            goto L_0x02a8
        L_0x02d5:
            r2 = -1
            r13 = -1
            goto L_0x02a8
        L_0x02d8:
            float[] r3 = A02
            r1 = 17
            if (r2 >= r1) goto L_0x02e1
            r0 = r3[r2]
            goto L_0x0274
        L_0x02e1:
            java.lang.String r1 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r2 = X.002.A0O(r1, r2)
            java.lang.String r1 = "NalUnitUtil"
            X.STH.A03(r1, r2)
            goto L_0x0274
        L_0x02ed:
            r36 = -1
            r13 = -1
            goto L_0x02c3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SS3.A02(byte[], int, int):X.RzC");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        if (r2 != 1) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bf, code lost:
        if ((r18 & 16) == 0) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C10842Rz2 A03(byte[] r26, int r27, int r28) {
        /*
            X.SRU r5 = new X.SRU
            r2 = r26
            r1 = r27
            r0 = r28
            r5.<init>(r2, r1, r0)
            r10 = 8
            int r4 = r5.A03(r10)
            int r18 = r5.A03(r10)
            int r19 = r5.A03(r10)
            int r20 = X.SRU.A00(r5)
            r1 = 86
            r0 = 44
            r14 = 244(0xf4, float:3.42E-43)
            r13 = 122(0x7a, float:1.71E-43)
            r12 = 110(0x6e, float:1.54E-43)
            r7 = 100
            r6 = 3
            r15 = 16
            r3 = 1
            if (r4 == r7) goto L_0x0190
            if (r4 == r12) goto L_0x0190
            if (r4 == r13) goto L_0x0190
            if (r4 == r14) goto L_0x0190
            if (r4 == r0) goto L_0x0190
            r0 = 83
            if (r4 == r0) goto L_0x0190
            if (r4 == r1) goto L_0x0190
            r0 = 118(0x76, float:1.65E-43)
            if (r4 == r0) goto L_0x0190
            r0 = 128(0x80, float:1.794E-43)
            if (r4 == r0) goto L_0x0190
            r0 = 138(0x8a, float:1.93E-43)
            if (r4 == r0) goto L_0x0190
            r2 = 1
            r23 = 0
            r24 = 0
        L_0x004e:
            X.SRU.A00(r5)
            int r0 = X.SRU.A00(r5)
            if (r0 != 0) goto L_0x0174
            X.SRU.A00(r5)
        L_0x005a:
            X.SRU.A00(r5)
            r5.A04()
            int r0 = X.SRU.A00(r5)
            int r8 = r0 + 1
            int r0 = X.SRU.A00(r5)
            int r0 = r0 + 1
            boolean r1 = r5.A06()
            int r16 = 2 - r1
            int r0 = r16 * r0
            if (r1 != 0) goto L_0x0079
            r5.A04()
        L_0x0079:
            r5.A04()
            int r21 = r8 * 16
            int r22 = r0 * 16
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x00ab
            int r11 = X.SRU.A00(r5)
            int r10 = X.SRU.A00(r5)
            int r9 = X.SRU.A00(r5)
            int r8 = X.SRU.A00(r5)
            r1 = 1
            if (r2 == 0) goto L_0x00a2
            if (r2 == r6) goto L_0x009f
            r1 = 2
            r0 = 2
            if (r2 == r3) goto L_0x00a0
        L_0x009f:
            r0 = 1
        L_0x00a0:
            int r16 = r0 * r16
        L_0x00a2:
            int r11 = r11 + r10
            int r11 = r11 * r1
            int r21 = r21 - r11
            int r9 = r9 + r8
            int r9 = r9 * r16
            int r22 = r22 - r9
        L_0x00ab:
            r0 = 44
            if (r4 == r0) goto L_0x00bb
            r0 = 86
            if (r4 == r0) goto L_0x00bb
            if (r4 == r7) goto L_0x00bb
            if (r4 == r12) goto L_0x00bb
            if (r4 == r13) goto L_0x00bb
            if (r4 != r14) goto L_0x00c1
        L_0x00bb:
            r0 = r18 & 16
            r28 = 0
            if (r0 != 0) goto L_0x00c3
        L_0x00c1:
            r28 = 16
        L_0x00c3:
            boolean r0 = r5.A06()
            r25 = -1
            if (r0 == 0) goto L_0x0235
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x0170
            r0 = 8
            int r1 = r5.A03(r0)
            r0 = 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L_0x015c
            int r0 = r5.A03(r15)
            int r1 = r5.A03(r15)
            if (r0 == 0) goto L_0x0170
            if (r1 == 0) goto L_0x0170
            float r0 = (float) r0
            float r1 = (float) r1
            float r0 = r0 / r1
        L_0x00ea:
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x00f3
            r5.A04()
        L_0x00f3:
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x0158
            r5.A05(r6)
            boolean r1 = r5.A06()
            if (r1 != 0) goto L_0x0103
            r3 = 2
        L_0x0103:
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x0155
            r6 = 8
            int r2 = r5.A03(r6)
            int r1 = r5.A03(r6)
            r5.A05(r6)
            int r25 = X.SRQ.A00(r2)
            int r27 = X.SRQ.A01(r1)
        L_0x011e:
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x012a
            X.SRU.A00(r5)
            X.SRU.A00(r5)
        L_0x012a:
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x0135
            r1 = 65
            r5.A05(r1)
        L_0x0135:
            boolean r7 = r5.A06()
            if (r7 == 0) goto L_0x01e9
            int r1 = X.SRU.A00(r5)
            int r2 = r1 + 1
            r1 = 8
            r5.A05(r1)
            r1 = 0
        L_0x0147:
            if (r1 >= r2) goto L_0x01e4
            X.SRU.A00(r5)
            X.SRU.A00(r5)
            r5.A04()
            int r1 = r1 + 1
            goto L_0x0147
        L_0x0155:
            r27 = -1
            goto L_0x011e
        L_0x0158:
            r27 = -1
            r3 = -1
            goto L_0x011e
        L_0x015c:
            float[] r2 = A02
            r0 = 17
            if (r1 >= r0) goto L_0x0165
            r0 = r2[r1]
            goto L_0x00ea
        L_0x0165:
            java.lang.String r0 = "Unexpected aspect_ratio_idc value: "
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.String r0 = "NalUnitUtil"
            X.STH.A03(r0, r1)
        L_0x0170:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00ea
        L_0x0174:
            if (r0 != r3) goto L_0x005a
            r5.A04()
            X.SRU.A00(r5)
            X.SRU.A00(r5)
            int r0 = X.SRU.A00(r5)
            long r8 = (long) r0
            r10 = 0
        L_0x0185:
            long r0 = (long) r10
            int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 >= 0) goto L_0x005a
            X.SRU.A00(r5)
            int r10 = r10 + 1
            goto L_0x0185
        L_0x0190:
            int r2 = X.SRU.A00(r5)
            if (r2 != r6) goto L_0x0199
            r5.A04()
        L_0x0199:
            int r23 = X.SRU.A00(r5)
            int r24 = X.SRU.A00(r5)
            r5.A04()
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x004e
            if (r2 != r6) goto L_0x01ae
            r10 = 12
        L_0x01ae:
            r9 = 0
        L_0x01af:
            boolean r0 = r5.A06()
            if (r0 == 0) goto L_0x01df
            r0 = 6
            r8 = 64
            if (r9 >= r0) goto L_0x01bc
            r8 = 16
        L_0x01bc:
            r17 = 8
            r1 = 0
        L_0x01bf:
            int r16 = X.SRU.A00(r5)
            int r11 = r16 % 2
            r0 = 1
            if (r11 != 0) goto L_0x01c9
            r0 = -1
        L_0x01c9:
            int r11 = r16 + 1
            int r11 = r11 / 2
            int r0 = r0 * r11
            int r0 = r0 + r17
            int r0 = r0 + 256
            int r0 = r0 % 256
            if (r0 == 0) goto L_0x01d8
            r17 = r0
        L_0x01d8:
            int r1 = r1 + 1
            if (r1 >= r8) goto L_0x01df
            if (r0 == 0) goto L_0x01d8
            goto L_0x01bf
        L_0x01df:
            int r9 = r9 + 1
            if (r9 >= r10) goto L_0x004e
            goto L_0x01af
        L_0x01e4:
            r1 = 20
            r5.A05(r1)
        L_0x01e9:
            boolean r6 = r5.A06()
            if (r6 == 0) goto L_0x020e
            int r1 = X.SRU.A00(r5)
            int r2 = r1 + 1
            r1 = 8
            r5.A05(r1)
            r1 = 0
        L_0x01fb:
            if (r1 >= r2) goto L_0x0209
            X.SRU.A00(r5)
            X.SRU.A00(r5)
            r5.A04()
            int r1 = r1 + 1
            goto L_0x01fb
        L_0x0209:
            r1 = 20
            r5.A05(r1)
        L_0x020e:
            if (r7 != 0) goto L_0x0212
            if (r6 == 0) goto L_0x0215
        L_0x0212:
            r5.A04()
        L_0x0215:
            r5.A04()
            boolean r1 = r5.A06()
            if (r1 == 0) goto L_0x023a
            r5.A04()
            X.SRU.A00(r5)
            X.SRU.A00(r5)
            X.SRU.A00(r5)
            X.SRU.A00(r5)
            int r28 = X.SRU.A00(r5)
            X.SRU.A00(r5)
            goto L_0x023a
        L_0x0235:
            r0 = 1065353216(0x3f800000, float:1.0)
            r3 = -1
            r27 = -1
        L_0x023a:
            X.Rz2 r15 = new X.Rz2
            r17 = r4
            r26 = r3
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SS3.A03(byte[], int, int):X.Rz2");
    }
}
