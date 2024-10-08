package X;

import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public abstract class Py2 {
    public static byte[] A00 = {70, 71, 84, 75, 65, 71, 125, 75, 70, 50, 36, 50, 50, 40, 46, 47, 30, 40, 37, 53, 51, 37, 50, 46, PublicSuffixDatabase.EXCEPTION_MARKER, 45, 37};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A01(9, 10, 6);
    }
}
