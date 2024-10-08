package X;

/* renamed from: X.Ht3  reason: case insensitive filesystem */
public final class C56116Ht3 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56116Ht3)) {
            return false;
        }
        C56116Ht3 ht3 = (C56116Ht3) obj;
        return this.A01 == ht3.A01 && this.A03 == ht3.A03 && this.A02 == ht3.A02 && this.A00 == ht3.A00;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public final String toString() {
        return 002.A0w("InsetsValues(left=", ", top=", ", right=", ", bottom=", ')', this.A01, this.A03, this.A02, this.A00);
    }

    public C56116Ht3(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
