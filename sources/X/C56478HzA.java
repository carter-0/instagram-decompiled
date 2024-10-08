package X;

/* renamed from: X.HzA  reason: case insensitive filesystem */
public abstract class C56478HzA {
    public static final char[] A00;
    public static final char[] A01;

    public static String A00(byte[] bArr) {
        char[] cArr = new char[(r7 * 2)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            int i2 = i + 1;
            cArr[i] = A00[b2];
            i = i2 + 1;
            cArr[i2] = A01[b2];
        }
        return new String(cArr, 0, i);
    }

    static {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[256];
        A00 = cArr2;
        char[] cArr3 = new char[256];
        A01 = cArr3;
        byte b = 0;
        int i = 0;
        do {
            cArr2[i] = cArr[(i >> 4) & 15];
            cArr3[i] = cArr[i & 15];
            i++;
        } while (i < 256);
        int i2 = 0;
        do {
            i2++;
        } while (i2 <= 70);
        byte b2 = 0;
        do {
            b2 = (byte) (b2 + 1);
        } while (b2 < 10);
        do {
            b = (byte) (b + 1);
        } while (b < 6);
    }
}
