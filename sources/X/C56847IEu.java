package X;

/* renamed from: X.IEu  reason: case insensitive filesystem */
public final class C56847IEu implements C287295Zu {
    public final int A00;

    public C56847IEu(int i) {
        this.A00 = i;
    }

    public final void ACQ(C268024cd r7, AnonymousClass5Q8 r8, int[] iArr, int[] iArr2, int i) {
        if (this.A00 != 0) {
            C287275Zs.A05(iArr, iArr2, i, false);
            return;
        }
        int i2 = 0;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = iArr[i2];
            iArr2[i3] = i4;
            i4 += i5;
            i2++;
            i3++;
        }
    }

    public final /* synthetic */ float By0() {
        return 0.0f;
    }

    public final String toString() {
        if (this.A00 != 0) {
            return "AbsoluteArrangement#Right";
        }
        return "AbsoluteArrangement#Left";
    }
}
