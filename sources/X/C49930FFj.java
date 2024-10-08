package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.FFj  reason: case insensitive filesystem */
public abstract class C49930FFj {
    public static byte[] A00 = {88, 90, 90, 86, 76, 87, 77, 74, 22, 93, 80, 74, 88, 91, 85, 92, 102, 77, 86, 77, 73, 102, 77, 78, 86, 102, 95, 88, 90, 77, 86, 75, 22, 22, 20, 20, 24, 2, 25, 3, 4, 88, 16, 18, 25, 18, 5, 22, 3, 18, 40, 3, 0, 24, 40, 17, 22, 20, 3, 24, 5, 40, 3, 24, 3, 7, 40, 28, 18, 14, 88, 9, 8, 27, 4, 14, 8, 50, 4, 9, 118, 110, 105, 104, 99, 89, 104, 115, 107, 100, 99, 116, 109, 110, 118, 70, Byte.MAX_VALUE, 120, 122, 109, 118, 107, 54, 106, 124, 119, 125, 70, 109, 110, 118, 70, Byte.MAX_VALUE, 120, 122, 109, 118, 107, 70, 124, 119, 120, 123, 117, 124, 70, 110, 113, 120, 109, 106, 120, 105, 105, 54};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 83);
        }
        return new String(copyOfRange);
    }

    public static final 1OC A00(0lg r3, String str, String str2) {
        1NY A0L = DbZ.A0L(r3);
        A0L.A0A(A01(92, 43, 74));
        A0L.A0Q(C47346Dvg.class, F6Q.class);
        A0L.A9m(A01(71, 9, 62), str2);
        return DbT.A0T(A0L, A01(80, 12, 85), str);
    }

    public static final void A02(Context context, 1P0 r6, 0lg r7) {
        1NY A0L = DbZ.A0L(r7);
        A0L.A9m(A01(71, 9, 62), DbT.A0t(context, A0L, A01(33, 38, 36)));
        1OC A0S = DbU.A0S(A0L, C47315Dui.class, F4I.class);
        A0S.A00 = r6;
        1ES.A03(A0S);
    }
}
