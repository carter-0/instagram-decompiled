package X;

import java.util.Arrays;

/* renamed from: X.ABa  reason: case insensitive filesystem */
public abstract class C39829ABa {
    public static byte[] A00 = {-48, -62, -48, -48, -58, -52, -53, -68, -58, -63, 55, 53, 39, 52, 48, 35, 47, 39};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }
}
