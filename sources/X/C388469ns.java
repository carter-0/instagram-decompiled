package X;

/* renamed from: X.9ns  reason: invalid class name and case insensitive filesystem */
public final class C388469ns extends C388479nt {
    public final int A00;
    public final int A01;

    public C388469ns(int i, int i2) {
        this.A01 = -1;
        this.A00 = -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C388469ns) {
                C388469ns r5 = (C388469ns) obj;
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

    public C388469ns() {
        this(-1, -1);
    }
}
