package X;

/* renamed from: X.5qz  reason: invalid class name and case insensitive filesystem */
public final class C296995qz {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj instanceof C296995qz) {
            C296995qz r4 = (C296995qz) obj;
            if (r4.A01 == this.A01 && r4.A00 == this.A00) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C296995qz(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
