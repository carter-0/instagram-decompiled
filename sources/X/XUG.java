package X;

import java.util.Arrays;

public abstract class XUG {
    public static C21376XZj A00(C11389SRd sRd) {
        sRd.A0P(1);
        int A06 = sRd.A06();
        long j = ((long) sRd.A01) + ((long) A06);
        int i = A06 / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long A0B = sRd.A0B();
            if (A0B == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = A0B;
            jArr2[i2] = sRd.A0B();
            sRd.A0P(2);
            i2++;
        }
        sRd.A0P((int) (j - ((long) sRd.A01)));
        return new C21376XZj(jArr, jArr2);
    }
}
