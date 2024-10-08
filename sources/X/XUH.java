package X;

public abstract class XUH {
    public static long A00(C11389SRd sRd, int i, int i2) {
        sRd.A0O(i);
        int i3 = sRd.A00;
        if (i3 - sRd.A01 < 5) {
            return -9223372036854775807L;
        }
        int A01 = sRd.A01();
        if ((8388608 & A01) != 0 || ((2096896 & A01) >> 8) != i2 || (A01 & 32) == 0 || sRd.A05() < 7 || i3 - sRd.A01 < 7 || (sRd.A05() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        sRd.A0R(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
