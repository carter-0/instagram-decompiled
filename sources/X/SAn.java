package X;

import java.util.Arrays;

public abstract class SAn {
    public static byte[] A00 = {117, 99, 117, 117, 111, 105, 104, 89, 111, 98, 15, 12, 20, 36, 29, 26, 24, 15, 20, 9, 36, 18, 31, 30, 21, 15, 18, 29, 18, 30, 9, 104, 110, 120, 111, 115, 124, 112, 120};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 39);
        }
        return new String(copyOfRange);
    }
}
