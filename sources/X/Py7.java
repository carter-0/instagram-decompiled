package X;

import java.util.Arrays;

public abstract class Py7 {
    public static byte[] A00 = {67, 66, 81, 78, 68, 66, 120, 78, 67, 26, 2, 5, 4, 15, 53, 4, 31, 7, 8, 15, 24, 10, 28, 10, 10, 16, 22, 23, 38, 16, 29};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(21, 10, 17);
    }
}
