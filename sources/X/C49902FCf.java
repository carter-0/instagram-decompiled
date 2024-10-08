package X;

import java.util.Arrays;

/* renamed from: X.FCf  reason: case insensitive filesystem */
public abstract class C49902FCf {
    public static byte[] A00 = {106, 114, 117, 116, Byte.MAX_VALUE, 69, 116, 111, 119, 120, Byte.MAX_VALUE, 104, 98, 116, 98, 98, 120, 126, Byte.MAX_VALUE, 78, 120, 117};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(12, 10, 105);
    }
}
