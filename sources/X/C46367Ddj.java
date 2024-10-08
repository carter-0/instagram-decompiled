package X;

import java.util.Arrays;

/* renamed from: X.Ddj  reason: case insensitive filesystem */
public abstract class C46367Ddj {
    public static byte[] A00 = {108, 109, 126, 97, 107, 109, 87, 97, 108, 101, 115, 101, 101, Byte.MAX_VALUE, 121, 120, 73, Byte.MAX_VALUE, 114, 8, 11, 19, 35, 26, 29, 31, 35, 15, 8, 29, 14, 8, 35, 15, 8, 29, 8, 25, 35, 18, 29, 17, 25, 60, 58, 44, 59, 39, 40, 36, 44};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(43, 8, 30);
    }
}
