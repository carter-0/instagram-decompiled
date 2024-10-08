package X;

public final class S6H {
    public int A00;
    public boolean A01;
    public final int A02;
    public final C8880RDx A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6H) {
                S6H s6h = (S6H) obj;
                if (!(this.A02 == s6h.A02 && this.A03 == s6h.A03 && this.A00 == s6h.A00 && this.A01 == s6h.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A02 * 31;
        return DbS.A06(this.A01, (AnonymousClass7TF.A07(this.A03, i) + this.A00) * 31);
    }

    public S6H(C8880RDx rDx, int i, int i2, boolean z) {
        this.A02 = i;
        this.A03 = rDx;
        this.A00 = i2;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BackgroundData(index=");
        A1A.append(this.A02);
        A1A.append(", expansionStyle=");
        A1A.append(this.A03);
        A1A.append(", visibleIndex=");
        A1A.append(this.A00);
        A1A.append(", isVisible=");
        return G9t.A1C(A1A, this.A01);
    }
}
