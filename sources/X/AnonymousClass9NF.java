package X;

import java.util.Arrays;

/* renamed from: X.9NF  reason: invalid class name */
public abstract class AnonymousClass9NF {
    public static byte[] A00 = {43, 42, 57, 38, 44, 42, 16, 38, 43, 37, 51, 37, 37, 63, 57, 56, 121, 58, 57, 49, 63, 56, 9, 55, 53, 34, 63, 32, 63, 34, 47, 121, 86, 64, 86, 86, 76, 74, 75, 122, 76, 65, 0, 6, 16, 7, 27, 20, 24, 16};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(42, 8, 57);
    }

    public static String A01() {
        return A02(32, 10, 105);
    }
}
