package X;

import java.util.Arrays;

public abstract class Dbk {
    public static byte[] A00 = {-40, -54, -40, -40, -50, -44, -45, -60, -50, -55, -20, -25, -20, -24, -41, -21, -35, -35, -36, -41, -31, -36, -5, -7, -21, -8, -12, -25, -13, -21};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(22, 8, 111);
    }
}
