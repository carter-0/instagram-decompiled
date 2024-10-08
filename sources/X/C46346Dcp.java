package X;

import java.util.Arrays;

/* renamed from: X.Dcp  reason: case insensitive filesystem */
public abstract class C46346Dcp {
    public static byte[] A00 = {-16, -30, -16, -16, -26, -20, -21, -36, -26, -31, -25, -22, -30, -46, -39, -44, -42, -46, -26, -25, -44, -27, -25, -46, -26, -25, -44, -25, -40, -46, -31, -44, -32, -40, 5, 3, -11, 2, -2, -15, -3, -11};

    public static String A00() {
        return A01(0, 10, 95);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 30);
        }
        return new String(copyOfRange);
    }
}
