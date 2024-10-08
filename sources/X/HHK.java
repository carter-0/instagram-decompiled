package X;

public final class HHK extends C54715HPu {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HHK) {
                HHK hhk = (HHK) obj;
                if (!(Float.compare(this.A00, hhk.A00) == 0 && Float.compare(this.A01, hhk.A01) == 0 && this.A03 == hhk.A03 && this.A02 == hhk.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A00(G9w.A00(this.A00), this.A01) + this.A03) * 31) + this.A02;
    }

    public HHK(int i, int i2, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A03 = i;
        this.A02 = i2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Card(cornerRadius=");
        A1A.append(this.A00);
        A1A.append(", shadowRadius=");
        A1A.append(this.A01);
        A1A.append(", shadowColor=");
        A1A.append(this.A03);
        A1A.append(", backgroundColor=");
        return C51975G9x.A0j(A1A, this.A02);
    }
}
