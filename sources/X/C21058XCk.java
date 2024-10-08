package X;

import java.util.Arrays;

/* renamed from: X.XCk  reason: case insensitive filesystem */
public abstract class C21058XCk {
    public static byte[] A00 = {-16, -15, 2, -11, -17, -15, -21, -11, -16, -5, -13, -6, -7, -16, -22, -7, 0, -8, -19, -16, -3, -47, -61, -47, -47, -57, -51, -52, -67, -57, -62, 15, 13, -1, 12, 8, -5, 7, -1};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 90);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(21, 10, 4);
    }
}
