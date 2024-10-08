package X;

/* renamed from: X.XqD  reason: case insensitive filesystem */
public final class C22003XqD {
    public static final C22003XqD A00 = new Object();

    public static final double[] A00(double d) {
        double d2 = d * d;
        double d3 = d2 * d;
        double d4 = d * 0.5d;
        return new double[]{(((-0.5d * d3) + d2) - d4) * 1.0d, (((1.5d * d3) - (2.5d * d2)) + 1.0d) * 1.0d, ((-1.5d * d3) + (2.0d * d2) + d4) * 1.0d, ((d3 * 0.5d) - (d2 * 0.5d)) * 1.0d};
    }

    public final float[] A01(float[] fArr, int i, int i2, int i3, int i4) {
        int i5 = i3;
        double d = ((double) i) / ((double) i5);
        int i6 = i4;
        double d2 = ((double) i2) / ((double) i6);
        float[] fArr2 = new float[(i3 * i4)];
        for (int i7 = 0; i7 < i6; i7++) {
            for (int i8 = 0; i8 < i5; i8++) {
                double d3 = ((double) i8) * d;
                double d4 = ((double) i7) * d2;
                int i9 = (int) d3;
                int i10 = i9;
                int i11 = (int) d4;
                double[] A002 = A00(d3 - ((double) i9));
                double[] A003 = A00(d4 - ((double) i11));
                double d5 = 0.0d;
                int i12 = 0;
                do {
                    int i13 = 0;
                    do {
                        int i14 = (i10 - 1) + i12;
                        int i15 = i - 1;
                        if (i14 < 0) {
                            i14 = 0;
                        } else if (i14 > i15) {
                            i14 = i15;
                        }
                        int i16 = (i11 - 1) + i13;
                        int i17 = i2 - 1;
                        if (i16 < 0) {
                            i16 = 0;
                        } else if (i16 > i17) {
                            i16 = i17;
                        }
                        d5 += ((double) fArr[(i16 * i) + i14]) * A002[i12] * A003[i13];
                        i13++;
                    } while (i13 < 4);
                    i12++;
                } while (i12 < 4);
                fArr2[(i7 * i3) + i8] = (float) d5;
            }
        }
        return fArr2;
    }
}
