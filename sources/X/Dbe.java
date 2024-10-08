package X;

import java.util.Arrays;

public abstract class Dbe {
    public static byte[] A00 = {115, 116, -123, 120, 114, 116, 110, 120, 115, -116, -124, -117, -118, -127, 123, -118, -111, -119, 126, -127, -114, -95, -109, -95, -95, -105, -99, -100, -115, -105, -110, -39, -41, -55, -42, -46, -59, -47, -55, -74, -91, -78, -87, -90, -87, -93, -95, -76, -87, -81, -82, -97, -93, -81, -92, -91};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 11);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(21, 10, 35);
    }

    public static String A01() {
        return A02(31, 8, 89);
    }
}
