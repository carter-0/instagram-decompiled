package X;

import java.util.Arrays;

/* renamed from: X.9NE  reason: invalid class name */
public abstract class AnonymousClass9NE {
    public static byte[] A00 = {57, 58, 75, 62, 56, 58, 52, 62, 57, 40, 26, 40, 40, 30, 36, 35, 20, 30, 25, -24, -26, -43, -30, -25, -28, -43, -26, -39, -30, -41, -19, 55, 58, 50, 34, 41, 36, 38, 55, 50, 53, 34, 44, 39, 40, 49, 55, 44, 41, 44, 40, 53, 8, 6, -8, 5, 1, -12, 0, -8};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 94);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(9, 10, 87);
    }
}
