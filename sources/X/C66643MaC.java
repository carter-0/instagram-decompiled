package X;

import java.util.Arrays;

/* renamed from: X.MaC  reason: case insensitive filesystem */
public abstract class C66643MaC {
    public static byte[] A00 = {28, 4, 3, 2, 9, 51, 2, 25, 1, 14, 9, 30, 98, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 78, 120, 117, 12, 10, 28, 11, 23, 24, 20, 28};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(12, 10, 74);
    }
}
