package X;

import java.util.Arrays;

/* renamed from: X.Dbt  reason: case insensitive filesystem */
public abstract class C46325Dbt {
    public static byte[] A00 = {-61, -60, -43, -56, -62, -60, -66, -56, -61, 16, 2, 16, 16, 6, 12, 11, -4, 6, 1, 17, 15, 1, 14, 10, -3, 9, 1};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new String(copyOfRange);
    }
}
