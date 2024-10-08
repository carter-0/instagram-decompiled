package X;

import java.util.Arrays;

public abstract class Py0 {
    public static byte[] A00 = {6, 7, 20, 11, 1, 7, 61, 11, 6, 111, 119, 112, 113, 122, 64, 113, 106, 114, 125, 122, 109, 119, 97, 119, 119, 109, 107, 106, 91, 109, 96, 67, 69, 86, 89, 68, 71, 86, 69, 82, 89, 84, 78, 68, 66, 84, 67, 95, 80, 92, 84};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(21, 10, 30);
    }
}
