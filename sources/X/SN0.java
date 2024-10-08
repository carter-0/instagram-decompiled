package X;

public abstract class SN0 {
    public static long A00;
    public static boolean A01;
    public static final Object A02 = Pxe.A0p();
    public static final Object A03 = Pxe.A0p();

    public static long A01(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        byte b5 = b & true;
        int i2 = b;
        if (b5 == true) {
            i2 = (b & Byte.MAX_VALUE) + 128;
        }
        byte b6 = b2 & true;
        int i3 = b2;
        if (b6 == true) {
            i3 = (b2 & Byte.MAX_VALUE) + 128;
        }
        byte b7 = b3 & true;
        int i4 = b3;
        if (b7 == true) {
            i4 = (b3 & Byte.MAX_VALUE) + 128;
        }
        byte b8 = b4 & true;
        int i5 = b4;
        if (b8 == true) {
            i5 = (b4 & Byte.MAX_VALUE) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static long A00(byte[] bArr, int i) {
        long A012 = A01(bArr, i);
        long A013 = A01(bArr, i + 4);
        if (A012 == 0 && A013 == 0) {
            return 0;
        }
        return ((A012 - 2208988800L) * 1000) + ((A013 * 1000) / 4294967296L);
    }
}
