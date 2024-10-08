package X;

import java.util.List;

public abstract class I29 {
    public static final long A02(C304926Ft r7, boolean z) {
        long j;
        long j2 = 0;
        List list = r7.A03;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            GPU A0P = C51965G9l.A0P(list, i2);
            if (A0P.A0B && A0P.A0C) {
                if (z) {
                    j = A0P.A06;
                } else {
                    j = A0P.A07;
                }
                j2 = C289295dM.A07(j2, j);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return C289295dM.A04((float) i, j2);
    }

    public static final float A00(long j) {
        float A01 = C289295dM.A01(j);
        if (A01 == 0.0f && C289295dM.A02(j) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2((double) A01, (double) C289295dM.A02(j)))) * 180.0f) / 3.1415927f;
    }

    public static final float A01(C304926Ft r9, boolean z) {
        long j;
        long A02 = A02(r9, z);
        float f = 0.0f;
        if (AnonymousClass7TF.A1Q((A02 > 9205357640488583168L ? 1 : (A02 == 9205357640488583168L ? 0 : -1)))) {
            return 0.0f;
        }
        List list = r9.A03;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            GPU A0P = C51965G9l.A0P(list, i2);
            if (A0P.A0B && A0P.A0C) {
                if (z) {
                    j = A0P.A06;
                } else {
                    j = A0P.A07;
                }
                f += C289295dM.A00(C289295dM.A06(j, A02));
                i++;
            }
        }
        return f / ((float) i);
    }
}
