package X;

import java.util.Arrays;

/* renamed from: X.Dbu  reason: case insensitive filesystem */
public abstract class C46326Dbu {
    public static byte[] A00 = {-85, -84, -67, -80, -86, -84, -90, -80, -85, -82, -96, -82, -82, -92, -86, -87, -102, -92, -97, -122, -124, 118, -125, Byte.MAX_VALUE, 114, 126, 118};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(9, 10, 45);
    }
}
