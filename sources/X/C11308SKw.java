package X;

import java.util.Arrays;

/* renamed from: X.SKw  reason: case insensitive filesystem */
public abstract class C11308SKw {
    public static void A01(long j, int i, byte[] bArr) {
        int i2 = 0;
        do {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        } while (i2 < 4);
    }

    public static byte[] A02(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        long A00 = (A00(bArr3, 0) >> 0) & 67108863 & 67108863;
        long A002 = (A00(bArr3, 3) >> 2) & 67108863 & 67108611;
        long A003 = (A00(bArr3, 6) >> 4) & 67108863 & 67092735;
        long A004 = (A00(bArr3, 9) >> 6) & 67108863 & 66076671;
        long A005 = (A00(bArr3, 12) >> 8) & 67108863 & 1048575;
        long j = A002 * 5;
        long j2 = A003 * 5;
        long j3 = A004 * 5;
        long j4 = A005 * 5;
        byte[] bArr4 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i = 0;
        while (true) {
            byte[] bArr5 = bArr2;
            int length = bArr5.length;
            if (i < length) {
                int A04 = Pxh.A04(length, i, 16);
                System.arraycopy(bArr5, i, bArr4, 0, A04);
                bArr4[A04] = 1;
                if (A04 != 16) {
                    Arrays.fill(bArr4, A04 + 1, 17, (byte) 0);
                }
                long A006 = j9 + ((A00(bArr4, 0) >> 0) & 67108863);
                long A007 = j5 + ((A00(bArr4, 3) >> 2) & 67108863);
                long A008 = j6 + ((A00(bArr4, 6) >> 4) & 67108863);
                long A009 = j7 + ((A00(bArr4, 9) >> 6) & 67108863);
                long A0010 = j8 + (((A00(bArr4, 12) >> 8) & 67108863) | ((long) (bArr4[16] << 24)));
                long j10 = (A006 * A00) + (A007 * j4) + (A008 * j3) + (A009 * j2) + (A0010 * j);
                long j11 = (A006 * A002) + (A007 * A00) + (A008 * j4) + (A009 * j3) + (A0010 * j2) + (j10 >> 26);
                long j12 = (A006 * A003) + (A007 * A002) + (A008 * A00) + (A009 * j4) + (A0010 * j3) + (j11 >> 26);
                long j13 = (A006 * A004) + (A007 * A003) + (A008 * A002) + (A009 * A00) + (A0010 * j4) + (j12 >> 26);
                long j14 = (A006 * A005) + (A007 * A004) + (A008 * A003) + (A009 * A002) + (A0010 * A00) + (j13 >> 26);
                long j15 = (j10 & 67108863) + ((j14 >> 26) * 5);
                j5 = (j11 & 67108863) + (j15 >> 26);
                i += 16;
                j6 = j12 & 67108863;
                j7 = j13 & 67108863;
                j8 = j14 & 67108863;
                j9 = j15 & 67108863;
            } else {
                long j16 = j6 + (j5 >> 26);
                long j17 = j16 >> 26;
                long j18 = j16 & 67108863;
                long j19 = j7 + j17;
                long j20 = j19 >> 26;
                long j21 = j19 & 67108863;
                long j22 = j8 + j20;
                long j23 = j22 >> 26;
                long j24 = j22 & 67108863;
                long j25 = j9 + (j23 * 5);
                long j26 = j25 >> 26;
                long j27 = j25 & 67108863;
                long j28 = (j5 & 67108863) + j26;
                long j29 = j27 + 5;
                long j30 = (j29 >> 26) + j28;
                long j31 = j18 + (j30 >> 26);
                long j32 = j21 + (j31 >> 26);
                long j33 = (j24 + (j32 >> 26)) - 67108864;
                long j34 = j33 >> 63;
                long j35 = j27 & j34;
                long j36 = j28 & j34;
                long j37 = j18 & j34;
                long j38 = j21 & j34;
                long j39 = j24 & j34;
                long j40 = j34 ^ -1;
                long j41 = (j30 & 67108863 & j40) | j36;
                long j42 = (j31 & 67108863 & j40) | j37;
                long j43 = (j32 & 67108863 & j40) | j38;
                long A0011 = ((j35 | (j29 & 67108863 & j40) | (j41 << 26)) & 4294967295L) + A00(bArr3, 16);
                long A0012 = (((j41 >> 6) | (j42 << 20)) & 4294967295L) + A00(bArr3, 20) + (A0011 >> 32);
                long A0013 = (((j42 >> 12) | (j43 << 14)) & 4294967295L) + A00(bArr3, 24) + (A0012 >> 32);
                byte[] bArr6 = new byte[16];
                A01(A0011 & 4294967295L, 0, bArr6);
                A01(A0012 & 4294967295L, 4, bArr6);
                A01(A0013 & 4294967295L, 8, bArr6);
                A01(((((j43 >> 18) | (((j33 & j40) | j39) << 8)) & 4294967295L) + A00(bArr3, 28) + (A0013 >> 32)) & 4294967295L, 12, bArr6);
                return bArr6;
            }
        }
    }

    public static long A00(byte[] bArr, int i) {
        return ((long) Pxk.A02(bArr, i)) & 4294967295L;
    }
}
