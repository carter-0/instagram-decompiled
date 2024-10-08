package X;

import java.util.Arrays;

/* renamed from: X.9NM  reason: invalid class name */
public abstract class AnonymousClass9NM {
    public static byte[] A00 = {12, 26, 12, 12, 22, 16, 17, 32, 22, 27, 56, 62, 40, 63, 35, 44, 32, 40};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }
}
