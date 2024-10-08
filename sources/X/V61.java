package X;

import android.util.Pair;

public abstract class V61 {
    public static final Pair A00(float f, int i, int i2, int i3, boolean z) {
        int i4;
        int A05;
        int A052;
        int i5;
        int i6;
        if (f <= 0.0f) {
            float f2 = (float) i3;
            A05 = JTO.A05((float) i, f2) * i3;
            A052 = JTO.A05((float) i2, f2) * i3;
        } else {
            if (z) {
                if (((double) AnonymousClass7TE.A00(f, 1.7777778f)) < 0.001d) {
                    float f3 = (float) i2;
                    int i7 = 9;
                    int i8 = i3;
                    while (true) {
                        i6 = i7;
                        i7 = i8;
                        if (i8 <= 0) {
                            break;
                        }
                        i8 = i6 % i8;
                    }
                    int i9 = (i3 / i6) * 9;
                    A052 = JTO.A05(f3, (float) i9) * i9;
                    A05 = (A052 * 16) / 9;
                } else if (((double) AnonymousClass7TE.A00(f, 0.5625f)) < 0.001d) {
                    float f4 = (float) i;
                    int i10 = 9;
                    int i11 = i3;
                    while (true) {
                        i5 = i10;
                        i10 = i11;
                        if (i11 <= 0) {
                            break;
                        }
                        i11 = i5 % i11;
                    }
                    int i12 = (i3 / i5) * 9;
                    A05 = JTO.A05(f4, (float) i12) * i12;
                    A052 = (A05 * 16) / 9;
                }
            }
            int i13 = 16;
            int i14 = i3;
            while (true) {
                i4 = i13;
                i13 = i14;
                if (i14 <= 0) {
                    break;
                }
                i14 = i4 % i14;
            }
            int i15 = (i3 / i4) * 16;
            float f5 = (float) i15;
            A05 = JTO.A05((float) i, f5) * i15;
            A052 = JTO.A05((float) i2, f5) * i15;
            if (f < 1.0f) {
                A052 = JTO.A05(((float) A05) / f, f5) * i15;
            } else {
                A05 = JTO.A05(((float) A052) * f, f5) * i15;
            }
        }
        Pair create = Pair.create(Integer.valueOf(A05), Integer.valueOf(A052));
        0qQ.A07(create);
        return create;
    }
}
