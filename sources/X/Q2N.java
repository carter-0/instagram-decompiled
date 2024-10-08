package X;

import java.util.Arrays;

public abstract class Q2N {
    public static byte[] A00 = {1, 0, 19, 12, 6, 0, 58, 12, 1, 63, 41, 63, 63, 37, 35, 34, 19, 37, 40, 111, 105, Byte.MAX_VALUE, 104, 116, 123, 119, Byte.MAX_VALUE};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(9, 10, 127);
    }
}
