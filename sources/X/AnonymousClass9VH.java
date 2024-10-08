package X;

/* renamed from: X.9VH  reason: invalid class name */
public final class AnonymousClass9VH extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9VH) {
                AnonymousClass9VH r8 = (AnonymousClass9VH) obj;
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01 && this.A02 == r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        return (((this.A00 * 31) + this.A01) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public AnonymousClass9VH(int i, int i2, long j) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }
}
