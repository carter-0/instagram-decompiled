package X;

/* renamed from: X.N9t  reason: case insensitive filesystem */
public final class C68306N9t extends C69557No1 {
    public final int A00 = 2131961117;
    public final int A01 = 2131961118;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68306N9t) {
                C68306N9t n9t = (C68306N9t) obj;
                if (!(this.A01 == n9t.A01 && this.A00 == n9t.A00)) {
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
}
