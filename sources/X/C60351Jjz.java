package X;

/* renamed from: X.Jjz  reason: case insensitive filesystem */
public final class C60351Jjz extends C64124LOv {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60351Jjz)) {
            return false;
        }
        C60351Jjz jjz = (C60351Jjz) obj;
        return this.A01 == jjz.A01 && this.A00 == jjz.A00 && this.A03 == jjz.A03 && this.A02 == jjz.A02 && this.A00 == jjz.A00 && this.A01 == jjz.A01;
    }

    public C60351Jjz(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i3, i4, i5, i6);
        this.A01 = i;
        this.A00 = i2;
    }

    public final int hashCode() {
        return super.hashCode() + this.A01 + this.A00;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ViewportHint.Access(\n            |    pageOffset=");
        A1A.append(this.A01);
        A1A.append(",\n            |    indexInPage=");
        A1A.append(this.A00);
        C64124LOv.A00(this, ",\n            |    presentedItemsBefore=", A1A);
        return 0rw.A0u(AnonymousClass7TF.A0l(",\n            |)", A1A), "|");
    }
}
