package X;

public final class NdH extends O93 {
    public final int A00;
    public final C53396GnT A01;
    public final N4t A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NdH) {
                NdH ndH = (NdH) obj;
                if (!(this.A06 == ndH.A06 && 0qQ.A0K(this.A02, ndH.A02) && this.A00 == ndH.A00 && 0qQ.A0K(this.A01, ndH.A01) && this.A05 == ndH.A05 && this.A04 == ndH.A04 && 0qQ.A0K(this.A03, ndH.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public NdH(C53396GnT gnT, N4t n4t, String str, int i, boolean z, boolean z2, boolean z3) {
        super(new 2HY(i, 19));
        this.A06 = z;
        this.A02 = n4t;
        this.A00 = i;
        this.A01 = gnT;
        this.A05 = z2;
        this.A04 = z3;
        this.A03 = str;
    }

    public final int hashCode() {
        int A052 = C51965G9l.A05(this.A06);
        return AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A07(this.A02, A052) + this.A00) * 31))) + AnonymousClass7TG.A0E(this.A03);
    }
}
