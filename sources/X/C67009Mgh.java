package X;

import java.util.Arrays;

/* renamed from: X.Mgh  reason: case insensitive filesystem */
public abstract class C67009Mgh {
    public static byte[] A00 = {-51, -50, -33, -46, -52, -50, -56, -46, -51, -71, -85, -71, -71, -81, -75, -76, -91, -81, -86, -61, -63, -77, -64, -68, -81, -69, -77};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(19, 8, 12);
    }
}
