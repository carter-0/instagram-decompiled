package X;

public final class N2Y extends AnonymousClass0T0 {
    public final C266444Yx A00;
    public final C69260NiM A01;
    public final C69261NiN A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N2Y) {
                N2Y n2y = (N2Y) obj;
                if (!(this.A02 == n2y.A02 && this.A01 == n2y.A01 && 0qQ.A0K(this.A00, n2y.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02)) + AnonymousClass7TG.A0C(this.A00);
    }

    public N2Y(C266444Yx r1, C69260NiM niM, C69261NiN niN) {
        AnonymousClass7TG.A1O(niN, niM);
        this.A02 = niN;
        this.A01 = niM;
        this.A00 = r1;
    }
}
