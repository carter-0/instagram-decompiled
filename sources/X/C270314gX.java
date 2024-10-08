package X;

/* renamed from: X.4gX  reason: invalid class name and case insensitive filesystem */
public final class C270314gX extends C270324gY {
    public static int[] A00 = new int[2];

    public static void A00(int[] iArr, float f, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i2 - i;
        int i9 = i4 - i3;
        if (i5 == -1) {
            i6 = (int) ((((float) i9) * f) + 0.5f);
            i7 = (int) ((((float) i8) / f) + 0.5f);
            if (i6 > i8) {
                if (i7 > i9) {
                    return;
                }
            }
            iArr[0] = i6;
            iArr[1] = i9;
            return;
        } else if (i5 != 0) {
            i7 = (int) ((((float) i8) * f) + 0.5f);
        } else {
            i6 = (int) ((((float) i9) * f) + 0.5f);
            iArr[0] = i6;
            iArr[1] = i9;
            return;
        }
        iArr[0] = i8;
        iArr[1] = i7;
    }

    public final void A0C() {
        this.A09 = false;
        C22054Xuf xuf = this.A04;
        xuf.A01();
        xuf.A0B = false;
        C22054Xuf xuf2 = this.A03;
        xuf2.A01();
        xuf2.A0B = false;
        this.A05.A0B = false;
    }

    public final String toString() {
        return 002.A0R("HorizontalRun ", this.A02.A0n);
    }
}
