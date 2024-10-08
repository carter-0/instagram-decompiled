package X;

import java.util.Arrays;

public abstract class W3J {
    public static final int[] A00 = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] A01 = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] A02 = {67108863, 33554431};
    public static final int[] A03 = {26, 25};

    /* JADX WARNING: type inference failed for: r46v0, types: [long[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(long[] r46, long[] r47, long[] r48) {
        /*
            r5 = 0
            r2 = r47[r5]
            r0 = r48[r5]
            long r2 = r2 * r0
            r46[r5] = r2
            r44 = r47[r5]
            r4 = 1
            r2 = r48[r4]
            long r2 = r2 * r44
            r0 = r47[r4]
            r7 = r48[r5]
            long r0 = r0 * r7
            long r2 = r2 + r0
            r46[r4] = r2
            r42 = r47[r4]
            r24 = 2
            long r2 = r42 * r24
            r40 = r48[r4]
            long r2 = r2 * r40
            r4 = 2
            r0 = r48[r4]
            long r0 = r0 * r44
            long r2 = r2 + r0
            r0 = r47[r4]
            long r0 = r0 * r7
            long r2 = r2 + r0
            r46[r4] = r2
            r38 = r48[r4]
            long r2 = r42 * r38
            r36 = r47[r4]
            long r0 = r36 * r40
            long r2 = r2 + r0
            r4 = 3
            r0 = r48[r4]
            long r0 = r0 * r44
            long r2 = r2 + r0
            r0 = r47[r4]
            long r0 = r0 * r7
            long r2 = r2 + r0
            r46[r4] = r2
            long r5 = r36 * r38
            r34 = r48[r4]
            long r2 = r42 * r34
            r32 = r47[r4]
            long r0 = r32 * r40
            long r2 = r2 + r0
            long r2 = r2 * r24
            long r5 = r5 + r2
            r4 = 4
            r0 = r48[r4]
            long r0 = r0 * r44
            long r5 = r5 + r0
            r0 = r47[r4]
            long r0 = r0 * r7
            long r5 = r5 + r0
            r46[r4] = r5
            long r2 = r36 * r34
            long r0 = r32 * r38
            long r2 = r2 + r0
            r30 = r48[r4]
            long r0 = r42 * r30
            long r2 = r2 + r0
            r28 = r47[r4]
            long r0 = r28 * r40
            long r2 = r2 + r0
            r4 = 5
            r0 = r48[r4]
            long r0 = r0 * r44
            long r2 = r2 + r0
            r0 = r47[r4]
            long r0 = r0 * r7
            long r2 = r2 + r0
            r46[r4] = r2
            long r2 = r32 * r34
            r26 = r48[r4]
            long r0 = r42 * r26
            long r2 = r2 + r0
            r22 = r47[r4]
            long r0 = r22 * r40
            long r2 = r2 + r0
            long r2 = r2 * r24
            long r0 = r36 * r30
            long r2 = r2 + r0
            long r0 = r28 * r38
            long r2 = r2 + r0
            r4 = 6
            r0 = r48[r4]
            long r0 = r0 * r44
            long r2 = r2 + r0
            r0 = r47[r4]
            long r0 = r0 * r7
            long r2 = r2 + r0
            r46[r4] = r2
            long r2 = r32 * r30
            long r0 = r28 * r34
            long r2 = r2 + r0
            long r0 = r36 * r26
            long r2 = r2 + r0
            long r0 = r22 * r38
            long r2 = r2 + r0
            r20 = r48[r4]
            long r0 = r42 * r20
            long r2 = r2 + r0
            r18 = r47[r4]
            long r0 = r18 * r40
            long r2 = r2 + r0
            r4 = 7
            r0 = r48[r4]
            long r0 = r0 * r44
            long r2 = r2 + r0
            r0 = r47[r4]
            long r0 = r0 * r7
            long r2 = r2 + r0
            r46[r4] = r2
            long r5 = r28 * r30
            long r2 = r32 * r26
            long r0 = r22 * r34
            long r2 = r2 + r0
            r16 = r48[r4]
            long r0 = r42 * r16
            long r2 = r2 + r0
            r14 = r47[r4]
            long r0 = r14 * r40
            long r2 = r2 + r0
            long r2 = r2 * r24
            long r5 = r5 + r2
            long r0 = r36 * r20
            long r5 = r5 + r0
            long r0 = r18 * r38
            long r5 = r5 + r0
            r4 = 8
            r0 = r48[r4]
            long r0 = r0 * r44
            long r5 = r5 + r0
            r0 = r47[r4]
            long r0 = r0 * r7
            long r5 = r5 + r0
            r46[r4] = r5
            long r2 = r28 * r26
            long r0 = r22 * r30
            long r2 = r2 + r0
            long r0 = r32 * r20
            long r2 = r2 + r0
            long r0 = r18 * r34
            long r2 = r2 + r0
            long r0 = r36 * r16
            long r2 = r2 + r0
            long r0 = r14 * r38
            long r2 = r2 + r0
            r12 = r48[r4]
            long r0 = r42 * r12
            long r2 = r2 + r0
            r10 = r47[r4]
            long r0 = r10 * r40
            long r2 = r2 + r0
            r4 = 9
            r0 = r48[r4]
            long r44 = r44 * r0
            long r2 = r2 + r44
            r0 = r47[r4]
            long r0 = r0 * r7
            long r2 = r2 + r0
            r46[r4] = r2
            long r2 = r22 * r26
            long r0 = r32 * r16
            long r2 = r2 + r0
            long r0 = r14 * r34
            long r2 = r2 + r0
            r8 = r48[r4]
            long r42 = r42 * r8
            long r2 = r2 + r42
            r6 = r47[r4]
            long r40 = r40 * r6
            long r2 = r2 + r40
            long r2 = r2 * r24
            long r0 = r28 * r20
            long r2 = r2 + r0
            long r0 = r18 * r30
            long r2 = r2 + r0
            long r0 = r36 * r12
            long r2 = r2 + r0
            long r0 = r10 * r38
            long r2 = r2 + r0
            r0 = 10
            r46[r0] = r2
            long r2 = r22 * r20
            long r0 = r18 * r26
            long r2 = r2 + r0
            long r0 = r28 * r16
            long r2 = r2 + r0
            long r0 = r14 * r30
            long r2 = r2 + r0
            long r0 = r32 * r12
            long r2 = r2 + r0
            long r0 = r10 * r34
            long r2 = r2 + r0
            long r36 = r36 * r8
            long r2 = r2 + r36
            long r38 = r38 * r6
            long r2 = r2 + r38
            r0 = 11
            r46[r0] = r2
            long r4 = r18 * r20
            long r2 = r22 * r16
            long r0 = r14 * r26
            long r2 = r2 + r0
            long r32 = r32 * r8
            long r2 = r2 + r32
            long r34 = r34 * r6
            long r2 = r2 + r34
            long r2 = r2 * r24
            long r4 = r4 + r2
            long r0 = r28 * r12
            long r4 = r4 + r0
            long r0 = r10 * r30
            long r4 = r4 + r0
            r0 = 12
            r46[r0] = r4
            long r2 = r18 * r16
            long r0 = r14 * r20
            long r2 = r2 + r0
            long r0 = r22 * r12
            long r2 = r2 + r0
            long r0 = r10 * r26
            long r2 = r2 + r0
            long r28 = r28 * r8
            long r2 = r2 + r28
            long r30 = r30 * r6
            long r2 = r2 + r30
            r0 = 13
            r46[r0] = r2
            long r2 = r14 * r16
            long r22 = r22 * r8
            long r2 = r2 + r22
            long r26 = r26 * r6
            long r2 = r2 + r26
            long r2 = r2 * r24
            long r0 = r18 * r12
            long r2 = r2 + r0
            long r0 = r10 * r20
            long r2 = r2 + r0
            r0 = 14
            r46[r0] = r2
            long r2 = r14 * r12
            long r0 = r10 * r16
            long r2 = r2 + r0
            long r18 = r18 * r8
            long r2 = r2 + r18
            long r20 = r20 * r6
            long r2 = r2 + r20
            r0 = 15
            r46[r0] = r2
            long r1 = r10 * r12
            long r14 = r14 * r8
            long r16 = r16 * r6
            long r14 = r14 + r16
            long r14 = r14 * r24
            long r1 = r1 + r14
            r0 = 16
            r46[r0] = r1
            long r10 = r10 * r8
            long r12 = r12 * r6
            long r10 = r10 + r12
            r0 = 17
            r46[r0] = r10
            long r6 = r6 * r24
            long r6 = r6 * r8
            r0 = 18
            r46[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3J.A04(long[], long[], long[]):void");
    }

    public static void A05(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 0;
        do {
            jArr[i] = jArr2[i] - jArr3[i];
            i++;
        } while (i < 10);
    }

    public static void A06(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 0;
        do {
            jArr[i] = jArr2[i] + jArr3[i];
            i++;
        } while (i < 10);
    }

    public static void A00(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static void A01(long[] jArr) {
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j3 + (j2 << 1);
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j7 + (j6 << 1);
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j11 + (j10 << 1);
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j15 + (j14 << 1);
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j19 + (j18 << 1);
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j23 + (j22 << 1);
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j27 + (j26 << 1);
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j31 + (j30 << 1);
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j35 + (j34 << 1);
        jArr[0] = j36;
        jArr[0] = j36 + j34;
    }

    public static void A02(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = jArr2[0];
        long j3 = jArr2[1];
        long j4 = jArr2[2];
        long j5 = jArr2[3];
        long j6 = jArr2[4];
        long j7 = jArr2[5];
        long j8 = jArr2[6];
        long j9 = jArr2[7];
        long j10 = jArr2[8];
        long j11 = jArr2[9];
        long[] jArr3 = {j * j, j2 * 2 * jArr2[1], ((j3 * j3) + (jArr2[2] * j2)) * 2, ((j3 * j4) + (jArr2[3] * j2)) * 2, (j4 * j4) + (j3 * 4 * j5) + (j2 * 2 * jArr2[4]), ((j4 * j5) + (j3 * j6) + (jArr2[5] * j2)) * 2, ((j5 * j5) + (j4 * j6) + (jArr2[6] * j2) + (j3 * 2 * j7)) * 2, ((j5 * j6) + (j4 * j7) + (j3 * j8) + (jArr2[7] * j2)) * 2, (j6 * j6) + (((j4 * j8) + (jArr2[8] * j2) + (((j3 * j9) + (j5 * j7)) * 2)) * 2), ((j6 * j7) + (j5 * j8) + (j4 * j9) + (j3 * j10) + (j2 * jArr2[9])) * 2, ((j7 * j7) + (j6 * j8) + (j4 * j10) + (((j5 * j9) + (j3 * j11)) * 2)) * 2, ((j7 * j8) + (j6 * j9) + (j5 * j10) + (j4 * j11)) * 2, (j8 * j8) + (((j6 * j10) + (((j7 * j9) + (j5 * j11)) * 2)) * 2), ((j8 * j9) + (j7 * j10) + (j6 * j11)) * 2, ((j9 * j9) + (j8 * j10) + (j7 * 2 * j11)) * 2, ((j9 * j10) + (j8 * j11)) * 2, (j10 * j10) + (j9 * 4 * j11), j10 * 2 * j11, 2 * j11 * j11};
        A01(jArr3);
        A00(jArr3);
        System.arraycopy(jArr3, 0, jArr, 0, 10);
    }

    public static void A03(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        A04(jArr4, jArr2, jArr3);
        A01(jArr4);
        A00(jArr4);
        System.arraycopy(jArr4, 0, jArr, 0, 10);
    }

    public static byte[] A07(long[] jArr) {
        int[] iArr;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = 0;
            do {
                long j = copyOf[i3];
                int i4 = A03[i3 & 1];
                int i5 = -((int) (((j >> 31) & j) >> i4));
                copyOf[i3] = j + ((long) (i5 << i4));
                i3++;
                copyOf[i3] = copyOf[i3] - ((long) i5);
            } while (i3 < 9);
            long j2 = copyOf[9];
            int i6 = -((int) (((j2 >> 31) & j2) >> 25));
            copyOf[9] = j2 + ((long) (i6 << 25));
            copyOf[0] = copyOf[0] - (((long) i6) * 19);
        }
        long j3 = copyOf[0];
        int i7 = -((int) (((j3 >> 31) & j3) >> 26));
        copyOf[0] = j3 + ((long) (i7 << 26));
        copyOf[1] = copyOf[1] - ((long) i7);
        int i8 = 0;
        do {
            int i9 = 0;
            do {
                long j4 = copyOf[i9];
                int i10 = i9 & 1;
                int i11 = (int) (j4 >> A03[i10]);
                iArr = A02;
                copyOf[i9] = j4 & ((long) iArr[i10]);
                i9++;
                copyOf[i9] = copyOf[i9] + ((long) i11);
            } while (i9 < 9);
            i8++;
        } while (i8 < 2);
        long j5 = copyOf[9];
        copyOf[9] = j5 & 33554431;
        long j6 = copyOf[0] + (((long) ((int) (j5 >> 25))) * 19);
        copyOf[0] = j6;
        int i12 = ((((int) j6) - 67108845) >> 31) ^ -1;
        int i13 = 1;
        do {
            int i14 = (((int) copyOf[i13]) ^ iArr[i13 & 1]) ^ -1;
            int i15 = i14 & (i14 << 16);
            int i16 = i15 & (i15 << 8);
            int i17 = i16 & (i16 << 4);
            int i18 = i17 & (i17 << 2);
            i12 &= (i18 & (i18 << 1)) >> 31;
            i13++;
        } while (i13 < 10);
        copyOf[0] = j6 - ((long) (67108845 & i12));
        long j7 = (long) (33554431 & i12);
        copyOf[1] = copyOf[1] - j7;
        int i19 = 2;
        do {
            copyOf[i19] = copyOf[i19] - ((long) (67108863 & i12));
            int i20 = i19 + 1;
            copyOf[i20] = copyOf[i20] - j7;
            i19 += 2;
        } while (i19 < 10);
        int i21 = 0;
        do {
            copyOf[i21] = copyOf[i21] << A00[i21];
            i21++;
        } while (i21 < 10);
        byte[] bArr = new byte[32];
        do {
            int i22 = A01[i];
            long j8 = copyOf[i];
            bArr[i22] = (byte) ((int) (((long) bArr[i22]) | (j8 & 255)));
            int i23 = i22 + 1;
            bArr[i23] = (byte) ((int) (((long) bArr[i23]) | ((j8 >> 8) & 255)));
            int i24 = i22 + 2;
            bArr[i24] = (byte) ((int) (((long) bArr[i24]) | ((j8 >> 16) & 255)));
            int i25 = i22 + 3;
            bArr[i25] = (byte) ((int) (((long) bArr[i25]) | ((j8 >> 24) & 255)));
            i++;
        } while (i < 10);
        return bArr;
    }
}
