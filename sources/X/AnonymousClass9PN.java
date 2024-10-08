package X;

import java.util.Arrays;

/* renamed from: X.9PN  reason: invalid class name */
public abstract class AnonymousClass9PN {
    public static byte[] A00 = {-24, -23, -6, -19, -25, -23, -29, -19, -24, -29, -43, -29, -29, -39, -33, -34, -49, -39, -44, -36, -38, -52, -39, -43, -56, -44, -52};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 71);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(19, 8, 32);
    }

    public static String A01() {
        return A02(9, 10, 41);
    }
}
