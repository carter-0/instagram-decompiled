package X;

/* renamed from: X.5Zv  reason: invalid class name and case insensitive filesystem */
public final class C287305Zv implements C287295Zu {
    public final String toString() {
        return "Arrangement#End";
    }

    public final void ACQ(C268024cd r4, AnonymousClass5Q8 r5, int[] iArr, int[] iArr2, int i) {
        if (r5 == AnonymousClass5Q8.Ltr) {
            C287275Zs.A05(iArr, iArr2, i, false);
            return;
        }
        int i2 = 0;
        int length = iArr.length;
        while (true) {
            length--;
            if (-1 < length) {
                int i3 = iArr[length];
                iArr2[length] = i2;
                i2 += i3;
            } else {
                return;
            }
        }
    }

    public final /* synthetic */ float By0() {
        return 0.0f;
    }
}
