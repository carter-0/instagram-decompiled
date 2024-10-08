package X;

public final class IEP implements AnonymousClass5b9 {
    public final long A00;
    public final AnonymousClass5b9 A01;

    public final C3026164i FMw(C287805an r5) {
        return new IEV(this.A01.FMw(r5), this.A00);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IEP)) {
            return false;
        }
        IEP iep = (IEP) obj;
        if (iep.A00 == this.A00) {
            return C51971G9r.A1Z(iep.A01, this.A01, false);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + C51968G9o.A03(this.A00);
    }

    public IEP(AnonymousClass5b9 r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
