package X;

/* renamed from: X.N9u  reason: case insensitive filesystem */
public final class C68307N9u extends C69557No1 {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68307N9u) {
                C68307N9u n9u = (C68307N9u) obj;
                if (!(this.A01 == n9u.A01 && this.A00 == n9u.A00)) {
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

    public C68307N9u(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
