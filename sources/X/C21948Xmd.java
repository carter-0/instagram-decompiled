package X;

import java.util.Arrays;

/* renamed from: X.Xmd  reason: case insensitive filesystem */
public abstract class C21948Xmd {
    public static final float[][] A00 = {new float[]{0.08f, 0.12f, 0.08f}, new float[]{0.12f, 0.2f, 0.12f}, new float[]{0.08f, 0.12f, 0.08f}};
    public static final int[][] A01 = {new int[]{-1, 0}, new int[]{1, 0}, new int[]{0, -1}, new int[]{0, 1}, new int[]{0, 0}, new int[]{-1, -1}, new int[]{-1, 1}, new int[]{1, -1}, new int[]{1, 1}};

    public static final float[] A00(float[] fArr, int i, int i2) {
        float[] fArr2 = fArr;
        float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
        0qQ.A07(copyOf);
        int i3 = 0;
        while (true) {
            int i4 = i2;
            if (i3 >= i4) {
                return copyOf;
            }
            int i5 = 0;
            while (true) {
                int i6 = i;
                if (i5 >= i6) {
                    break;
                }
                int i7 = (i3 * i) + i5;
                float f = 0.0f;
                int[] iArr = {1, 1};
                int[][] iArr2 = A01;
                int i8 = 0;
                do {
                    int[] iArr3 = iArr2[i8];
                    int i9 = iArr3[0];
                    int i10 = i3 + i9;
                    int i11 = iArr3[1];
                    int i12 = i5 + i11;
                    if (i10 >= 0 && i10 < i4 && i12 >= 0 && i12 < i6) {
                        f += fArr[(i10 * i) + i12] * A00[iArr[0] + i9][iArr[1] + i11];
                    }
                    i8++;
                } while (i8 < 9);
                copyOf[i7] = f;
                i5++;
            }
            i3++;
        }
    }
}
