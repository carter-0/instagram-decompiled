package X;

public final class KMN extends C62762Km0 {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KMN) {
                KMN kmn = (KMN) obj;
                if (!(this.A01 == kmn.A01 && this.A00 == kmn.A00 && this.A02 == kmn.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, ((this.A01 * 31) + this.A00) * 31);
    }

    public KMN(int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Reorder(oldIndex=");
        A1A.append(this.A01);
        A1A.append(", newIndex=");
        A1A.append(this.A00);
        A1A.append(", isStarted=");
        return G9t.A1C(A1A, this.A02);
    }
}
