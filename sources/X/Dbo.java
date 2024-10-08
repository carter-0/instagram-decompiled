package X;

import java.util.Arrays;

public abstract class Dbo {
    public static byte[] A00 = {111, 110, 125, 98, 104, 110, 84, 98, 111, 116, 98, 116, 116, 110, 104, 105, 88, 110, 99, 26, 28, 10, 29, 1, 14, 2, 10};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(9, 10, 121);
    }
}
