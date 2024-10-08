package X;

public final class IER implements AnonymousClass5b8 {
    public final int A00;
    public final long A01;
    public final JSe A02;
    public final Integer A03;

    public final /* bridge */ /* synthetic */ C3026164i FMw(C287805an r6) {
        return new IEU(this.A02.FMx(r6), this.A00, this.A01);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IER)) {
            return false;
        }
        IER ier = (IER) obj;
        if (ier.A00 == this.A00 && 0qQ.A0K(ier.A02, this.A02) && ier.A01 == this.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A02, this.A00 * 31) - 1532807697) * 31) + C51968G9o.A03(this.A01);
    }

    public IER(JSe jSe, Integer num, int i, long j) {
        this.A00 = i;
        this.A02 = jSe;
        this.A03 = num;
        this.A01 = j;
    }
}
