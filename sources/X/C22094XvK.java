package X;

import java.util.Random;

/* renamed from: X.XvK  reason: case insensitive filesystem */
public final class C22094XvK implements Y8A {
    public final Random A00;
    public final int[] A01;
    public final int[] A02;

    public C22094XvK(Random random, int[] iArr) {
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
