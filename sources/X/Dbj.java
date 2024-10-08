package X;

import java.util.Arrays;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public abstract class Dbj {
    public static byte[] A00 = {75, 74, 89, 70, 76, 74, 112, 70, 75, 45, 53, 50, 51, 56, 2, 51, 40, 48, 63, 56, 47, 36, 50, 36, 36, 62, 56, 57, 8, 62, 51, 81, 87, 65, 86, 74, 69, 73, 65, PublicSuffixDatabase.EXCEPTION_MARKER, 50, 37, 62, 49, 62, 52, 54, 35, 62, 56, 57, 8, 52, 56, 51, 50};

    public static String A01() {
        return A04(0, 9, 98);
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(copyOfRange);
    }

    public static String A00() {
        return A04(9, 12, 16);
    }

    public static String A02() {
        return A04(21, 10, 26);
    }

    public static String A03() {
        return A04(31, 8, 105);
    }
}
