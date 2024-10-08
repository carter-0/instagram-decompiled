package X;

public final class S6L {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6L) {
                S6L s6l = (S6L) obj;
                if (!(this.A01 == s6l.A01 && 0qQ.A0K(this.A03, s6l.A03) && this.A00 == s6l.A00 && this.A02 == s6l.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A03, this.A01 * 31) + this.A00) * 31) + this.A02;
    }

    public S6L(int i, String str, int i2, int i3) {
        this.A01 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A02 = i3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BSCHomeTab(tabTitleRes=");
        A1A.append(this.A01);
        A1A.append(", fragmentId=");
        A1A.append(this.A03);
        A1A.append(", tabHintRes=");
        A1A.append(this.A00);
        A1A.append(", viewModelId=");
        return C51975G9x.A0j(A1A, this.A02);
    }
}
