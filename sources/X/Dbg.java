package X;

import java.util.Arrays;

public abstract class Dbg {
    public static byte[] A00 = {53, 52, 39, 56, 50, 52, 14, 56, 53, 83, 69, 83, 83, 73, 79, 78, Byte.MAX_VALUE, 73, 68, 11, 13, 27, 12, 16, 31, 19, 27};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 105);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(9, 10, 73);
    }

    public static String A01() {
        return A02(19, 8, 23);
    }
}
