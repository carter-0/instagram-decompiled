package X;

import java.util.Arrays;

/* renamed from: X.Mfo  reason: case insensitive filesystem */
public abstract class C66955Mfo {
    public static byte[] A00 = {-124, -123, -106, -119, -125, -123, Byte.MAX_VALUE, -119, -124, -37, -42, -48, -40, -37, -50, -38, -46, -109, -123, -109, -109, -119, -113, -114, Byte.MAX_VALUE, -119, -124, -20, -22, -36, -23, -27, -40, -28, -36};

    public static String A01() {
        return A02(0, 9, 22);
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(17, 10, 22);
    }
}
