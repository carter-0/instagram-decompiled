package X;

/* renamed from: X.Ht9  reason: case insensitive filesystem */
public final class C56121Ht9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C57544IcW A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56121Ht9) {
                C56121Ht9 ht9 = (C56121Ht9) obj;
                if (!(0qQ.A0K(this.A03, ht9.A03) && this.A00 == ht9.A00 && this.A02 == ht9.A02 && this.A01 == ht9.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass7TE.A0K(this.A03) + this.A00) * 31) + this.A02) * 31) + this.A01) * 31) - 2;
    }

    public C56121Ht9(C57544IcW icW, int i, int i2, int i3) {
        this.A03 = icW;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StackedPhotoStyleValues(photoVariant=");
        A1A.append(this.A03);
        A1A.append(", horizontalOffsetDp=");
        A1A.append(this.A00);
        A1A.append(", verticalOffsetDp=");
        A1A.append(this.A02);
        A1A.append(", photoSizeDp=");
        A1A.append(this.A01);
        A1A.append(", photoBoxClippingMarginDp=");
        return C51975G9x.A0j(A1A, -2);
    }
}
