package X;

/* renamed from: X.9nr  reason: invalid class name and case insensitive filesystem */
public final class C388459nr extends C388479nt {
    public final int A00;
    public final int A01;

    public C388459nr(int i, int i2) {
        this.A01 = -1;
        this.A00 = -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C388459nr) {
                C388459nr r5 = (C388459nr) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
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

    public C388459nr() {
        this(-1, -1);
    }
}
