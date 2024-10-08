package X;

import java.util.Arrays;

/* renamed from: X.9NJ  reason: invalid class name */
public abstract class AnonymousClass9NJ {
    public static byte[] A00 = {17, 16, 3, 28, 22, 16, 42, 28, 17, 60, 32, 32, 36, 39, 110, 123, 123, 36, 38, 61, 34, 53, 55, 45, 55, 49, 58, 32, 49, 38, 122, 61, 58, 39, 32, 53, 51, 38, 53, 57, 122, 55, 59, 57, 123, 36, 59, 56, 61, 55, 45, 108, 122, 108, 108, 118, 112, 113, 64, 118, 123, 61, 59, 45, 58, 38, 41, 37, 45};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(copyOfRange);
    }
}
