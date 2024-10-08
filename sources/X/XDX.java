package X;

import java.util.Arrays;

public abstract class XDX {
    public static byte[] A00 = {-49, -48, -31, -44, -50, -48, -54, -44, -49, -11, -25, -11, -11, -21, -15, -16, -31, -21, -26, -56, -58, -72, -59, -63, -76, -64, -72};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
        }
        return new String(copyOfRange);
    }
}
