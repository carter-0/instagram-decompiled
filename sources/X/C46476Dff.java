package X;

import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: X.Dff  reason: case insensitive filesystem */
public abstract class C46476Dff {
    public static byte[] A00 = {116, 117, 102, 121, 115, 117, 79, 121, 116, 36, 60, 59, 58, 49, 11, 58, PublicSuffixDatabase.EXCEPTION_MARKER, 57, 54, 49, 38, 65, 87, 65, 65, 91, 93, 92, 109, 91, 86, 68, 66, 84, 67, 95, 80, 92, 84};

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A02(21, 10, 87);
    }

    public static String A01() {
        return A02(31, 8, 84);
    }
}
