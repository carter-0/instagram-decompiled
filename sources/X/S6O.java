package X;

public final class S6O {
    public final int A00;
    public final int A01;
    public final AnonymousClass2Ta A02;
    public final C276544tV A03;

    public S6O(AnonymousClass2Ta r2, C276544tV r3, int i, int i2) {
        0qQ.A0B(r2, 2);
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = i;
        this.A00 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof S6O) {
                S6O s6o = (S6O) obj;
                if (!0qQ.A0K(this.A03, s6o.A03) || !0qQ.A0K(this.A02, s6o.A02) || this.A01 != s6o.A01 || this.A00 != s6o.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A03)) + this.A01) * 31) + this.A00;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SignalLayoutResult(model=");
        A1A.append(this.A03);
        A1A.append(", layoutResult=");
        A1A.append(this.A02);
        A1A.append(", widthSpec=");
        A1A.append(this.A01);
        A1A.append(", heightSpec=");
        return C51975G9x.A0j(A1A, this.A00);
    }
}
