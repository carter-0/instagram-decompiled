package X;

import java.util.Arrays;
import java.util.Random;

/* renamed from: X.5N6  reason: invalid class name */
public final class AnonymousClass5N6 implements AnonymousClass5N7 {
    public final Random A00;
    public final int[] A01;
    public final int[] A02;

    public final AnonymousClass5N6 AHz(int i, int i2) {
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            Random random = this.A00;
            iArr[i3] = random.nextInt(this.A02.length + 1);
            int i4 = i3 + 1;
            int nextInt = random.nextInt(i4);
            iArr2[i3] = iArr2[nextInt];
            iArr2[nextInt] = i3 + i;
            i3 = i4;
        }
        Arrays.sort(iArr);
        int[] iArr3 = this.A02;
        int length = iArr3.length + i2;
        int[] iArr4 = new int[length];
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            if (i5 >= i2 || i6 != iArr[i5]) {
                int i8 = i6 + 1;
                int i9 = iArr3[i6];
                iArr4[i7] = i9;
                if (i9 >= i) {
                    iArr4[i7] = i9 + i2;
                }
                i6 = i8;
            } else {
                iArr4[i7] = iArr2[i5];
                i5++;
            }
        }
        return new AnonymousClass5N6(new Random(this.A00.nextLong()), iArr4);
    }

    public AnonymousClass5N6(Random random, int[] iArr) {
        this.A02 = iArr;
        this.A00 = random;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        this.A01 = iArr2;
        for (int i = 0; i < length; i++) {
            iArr2[iArr[i]] = i;
        }
    }
}
