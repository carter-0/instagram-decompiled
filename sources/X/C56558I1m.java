package X;

/* renamed from: X.I1m  reason: case insensitive filesystem */
public final class C56558I1m {
    public static final C56558I1m A04 = new C56558I1m(0, 0, 0, 0);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56558I1m) {
                C56558I1m i1m = (C56558I1m) obj;
                if (!(this.A01 == i1m.A01 && this.A03 == i1m.A03 && this.A02 == i1m.A02 && this.A00 == i1m.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public final String toString() {
        return 002.A0w("IntRect.fromLTRB(", ", ", ", ", ", ", ')', this.A01, this.A03, this.A02, this.A00);
    }

    public C56558I1m(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }
}
