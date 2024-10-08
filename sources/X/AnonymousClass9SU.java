package X;

import java.util.ArrayList;

/* renamed from: X.9SU  reason: invalid class name */
public final class AnonymousClass9SU {
    public static final AnonymousClass9SU A00 = new Object();
    public static final int[][] A01 = {new int[]{1, 0}, new int[]{-1, 0}, new int[]{0, 1}, new int[]{0, -1}};

    private final void A00(int[][] iArr, int i, int i2, int i3) {
        int length = iArr.length;
        int length2 = iArr[0].length;
        if (i >= 0 && i < length2 && i2 >= 0 && i2 < length) {
            int[] iArr2 = iArr[i2];
            if (iArr2[i] == 255) {
                iArr2[i] = i3;
                int[][] iArr3 = A01;
                int i4 = 0;
                do {
                    int[] iArr4 = iArr3[i4];
                    A00(iArr, iArr4[0] + i, iArr4[1] + i2, i3);
                    i4++;
                } while (i4 < 4);
            }
        }
    }

    public final 0eP A01(int[][] iArr, int i) {
        int length = iArr[0].length;
        ArrayList arrayList = new ArrayList(r7);
        for (int[] clone : iArr) {
            arrayList.add(clone.clone());
        }
        int[][] iArr2 = (int[][]) arrayList.toArray(new int[0][]);
        for (int i2 = 0; i2 < r7; i2++) {
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr3 = iArr2[i2];
                int i4 = 255;
                if (iArr3[i3] <= i) {
                    i4 = 0;
                }
                iArr3[i3] = i4;
            }
        }
        int length2 = iArr2[0].length;
        ArrayList arrayList2 = new ArrayList(r7);
        for (int[] clone2 : iArr2) {
            arrayList2.add(clone2.clone());
        }
        int[][] iArr4 = (int[][]) arrayList2.toArray(new int[0][]);
        int i5 = 0;
        for (int i6 = 0; i6 < r7; i6++) {
            for (int i7 = 0; i7 < length2; i7++) {
                if (iArr4[i6][i7] == 255) {
                    i5++;
                    A00(iArr4, i7, i6, i5);
                }
            }
        }
        return new 0eP(Integer.valueOf(i5), iArr4);
    }
}
