package X;

/* renamed from: X.5P9  reason: invalid class name */
public final class AnonymousClass5P9 {
    public int A00;
    public int A01;
    public int[] A02;
    public int[] A03 = new int[16];
    public int[] A04 = new int[16];

    public static final void A00(AnonymousClass5P9 r5, int i, int i2) {
        int[] iArr = r5.A04;
        int[] iArr2 = r5.A03;
        int[] iArr3 = r5.A02;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }

    public AnonymousClass5P9() {
        int i;
        int[] iArr = new int[16];
        int i2 = 0;
        do {
            i = i2 + 1;
            iArr[i2] = i;
            i2 = i;
        } while (i < 16);
        this.A02 = iArr;
    }
}
