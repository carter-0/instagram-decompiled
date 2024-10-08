package X;

import java.util.Arrays;

public abstract class Dbf {
    public static byte[] A00 = {47, 46, 61, 34, 40, 46, 20, 34, 47, 99, 123, 124, 125, 118, 76, 125, 102, 126, 113, 118, 97, 101, 115, 101, 101, Byte.MAX_VALUE, 121, 120, 73, Byte.MAX_VALUE, 114, 94, 88, 78, 89, 69, 74, 70, 78};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 66);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(21, 10, 84);
    }

    public static String A01() {
        return A02(31, 8, 105);
    }
}
