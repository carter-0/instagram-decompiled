package X;

import java.util.Arrays;

/* renamed from: X.MaN  reason: case insensitive filesystem */
public abstract class C66654MaN {
    public static byte[] A00 = {-2, -7, -13, -5, -2, -15, -3, -11, -57, -71, -57, -57, -67, -61, -62, -77, -67, -72, -67, -69, -83, -70, -74, -87, -75, -83};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 56);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(8, 10, 28);
    }
}
