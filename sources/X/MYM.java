package X;

import java.util.Arrays;

public abstract class MYM {
    public static byte[] A00 = {125, 126, -113, -126, 124, 126, 120, -126, 125, -54, -42, -42, -46, -43, -100, -111, -111, -46, -44, -53, -40, -61, -59, -37, -59, -57, -48, -42, -57, -44, -112, -53, -48, -43, -42, -61, -55, -44, -61, -49, -112, -59, -47, -49, -111, -46, -47, -50, -53, -59, -37, -29, -43, -29, -29, -39, -33, -34, -49, -39, -44, 126, 124, 110, 123, 119, 106, 118, 110};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 6);
        }
        return new String(copyOfRange);
    }
}
