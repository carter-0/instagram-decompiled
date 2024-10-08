package X;

import java.util.Arrays;

public abstract class Dbm {
    public static byte[] A00 = {-52, -51, -34, -47, -53, -51, -57, -47, -52, 30, 16, 30, 30, 20, 26, 25, 10, 20, 15, 14, 12, -2, 11, 7, -6, 6, -2};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 90);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(9, 10, 81);
    }

    public static String A01() {
        return A02(19, 8, 63);
    }
}
