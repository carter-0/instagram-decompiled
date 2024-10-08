package X;

import java.util.Arrays;

public abstract class Dbh {
    public static byte[] A00 = {-22, -36, -22, -22, -32, -26, -27, -42, -32, -37, -49, -51, -65, -52, -56, -69, -57, -65};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(10, 8, 29);
    }
}
