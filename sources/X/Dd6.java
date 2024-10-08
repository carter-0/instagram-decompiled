package X;

import java.util.Arrays;

public abstract class Dd6 {
    public static byte[] A00 = {56, 57, 42, 53, 63, 57, 3, 53, 56, 46, 54, 49, 48, 59, 1, 48, 43, 51, 60, 59, 44, 98, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 78, 120, 117, 88, 91, 67, 115, 74, 77, 79, 115, 95, 88, 77, 94, 88, 115, 95, 88, 77, 88, 73, 115, 66, 77, 65, 73, 18, 20, 2, 21, 9, 6, 10, 2, 81, 66, 85, 78, 65, 78, 68, 70, 83, 78, 72, 73, 120, 68, 72, 67, 66};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(55, 8, 19);
    }

    public static String A01() {
        return A02(21, 10, 101);
    }
}
