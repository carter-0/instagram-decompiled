package X;

public final class XnI {
    public long A00 = -9223372036854775807L;
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C11389SRd A06 = new C11389SRd();
    public final C21505XdL A07 = new C21505XdL();

    public static long A00(C11389SRd sRd) {
        C11389SRd sRd2 = sRd;
        int i = sRd.A01;
        if (sRd.A00 - i < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        sRd2.A0R(bArr, 0, 9);
        sRd2.A0O(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = (long) b;
        long j2 = (long) b2;
        return (((j & 56) >> 3) << 30) | ((j & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }
}
