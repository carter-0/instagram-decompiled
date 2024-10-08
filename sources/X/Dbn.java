package X;

import java.util.Arrays;

public abstract class Dbn {
    public static byte[] A00 = {30, 2, 2, 6, 5, 76, 89, 89, 6, 4, 31, 0, 23, 21, 15, 21, 19, 24, 2, 19, 4, 88, 31, 24, 5, 2, 23, 17, 4, 23, 27, 88, 21, 25, 27, 89, 6, 25, 26, 31, 21, 15, 87, 65, 87, 87, 77, 75, 74, 123, 77, 64, 9, 15, 25, 14, 18, 29, 17, 25};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 109);
        }
        return new String(copyOfRange);
    }
}
