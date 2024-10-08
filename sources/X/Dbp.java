package X;

import java.util.Arrays;

public abstract class Dbp {
    public static byte[] A00 = {67, 66, 81, 78, 68, 66, 120, 78, 67, 93, 71, 96, 67, 91, 114, 85, 87, 113, 90, 85, 86, 88, 81, 80, 99, 117, 99, 99, 121, Byte.MAX_VALUE, 126, 79, 121, 116, 87, 84, 76, 101, 66, 64, 111, 74, 80, 83, 90, 96, 66, 79, 79, 65, 66, 64, 72, 113, 70, 82, 86, 70, 80, 87, 93, 94, 70, 118, 79, 72, 74, 118, 90, 93, 72, 91, 93, 118, 90, 93, 72, 93, 76, 118, 71, 72, 68, 76, 116, 114, 100, 115, 111, 96, 108, 100};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(24, 10, 18);
    }

    public static String A01() {
        return A02(84, 8, 3);
    }
}
