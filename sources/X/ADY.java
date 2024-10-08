package X;

import java.util.ArrayList;

public final class ADY {
    public static final ADY A00 = new Object();
    public static final int[][] A01 = {new int[]{1, 0}, new int[]{-1, 0}, new int[]{0, 1}, new int[]{0, -1}};

    public final 0eP A00(int[][] iArr, int i) {
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
        ArrayList arrayList2 = new ArrayList(r13);
        for (int[] clone2 : iArr2) {
            arrayList2.add(clone2.clone());
        }
        int[][] iArr4 = (int[][]) arrayList2.toArray(new int[0][]);
        int i5 = 0;
        for (int i6 = 0; i6 < r13; i6++) {
            for (int i7 = 0; i7 < length2; i7++) {
                if (iArr4[i6][i7] == 255) {
                    i5++;
                    int length3 = iArr4.length;
                    int length4 = iArr4[0].length;
                    01W r5 = new 01W();
                    r5.add(AnonymousClass7TF.A0x(Integer.valueOf(i7), i6));
                    while (!r5.isEmpty()) {
                        0eP r1 = (0eP) r5.removeFirst();
                        int A0M = AnonymousClass7TE.A0M(r1.A00);
                        int A0M2 = AnonymousClass7TE.A0M(r1.A01);
                        if (A0M >= 0 && A0M < length4 && A0M2 >= 0 && A0M2 < length3) {
                            int[] iArr5 = iArr4[A0M2];
                            if (iArr5[A0M] == 255) {
                                iArr5[A0M] = i5;
                                int[][] iArr6 = A01;
                                int i8 = 0;
                                do {
                                    int[] iArr7 = iArr6[i8];
                                    r5.add(AnonymousClass7TF.A0x(Integer.valueOf(iArr7[0] + A0M), iArr7[1] + A0M2));
                                    i8++;
                                } while (i8 < 4);
                            }
                        }
                    }
                }
            }
        }
        return AnonymousClass7TE.A1L(Integer.valueOf(i5), iArr4);
    }
}
