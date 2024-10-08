package X;

/* renamed from: X.NZq  reason: case insensitive filesystem */
public final class C68858NZq extends C69603Nol {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68858NZq) {
                C68858NZq nZq = (C68858NZq) obj;
                if (!(this.A01 == nZq.A01 && this.A00 == nZq.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C68858NZq(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
