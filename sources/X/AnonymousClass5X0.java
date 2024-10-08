package X;

import java.util.Arrays;

/* renamed from: X.5X0  reason: invalid class name */
public final class AnonymousClass5X0 {
    public int A00;
    public int[] A01 = new int[10];

    public final void A00(int i) {
        int i2 = this.A00;
        int[] iArr = this.A01;
        int length = iArr.length;
        if (i2 >= length) {
            iArr = Arrays.copyOf(iArr, length * 2);
            0qQ.A07(iArr);
            this.A01 = iArr;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr[i3] = i;
    }
}
