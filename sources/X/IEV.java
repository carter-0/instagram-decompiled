package X;

public final class IEV implements C3026164i {
    public final long A00;
    public final C3026164i A01;

    public final /* synthetic */ C287725af B1n(C287725af r7, C287725af r8, C287725af r9) {
        return CDd(r7, r8, r9, AzR(r7, r8, r9));
    }

    public final C287725af CDS(C287725af r10, C287725af r11, C287725af r12, long j) {
        C287725af r4 = r10;
        long j2 = this.A00;
        if (j < j2) {
            return r4;
        }
        return this.A01.CDS(r4, r11, r12, j - j2);
    }

    public final C287725af CDd(C287725af r7, C287725af r8, C287725af r9, long j) {
        C287725af r3 = r9;
        long j2 = this.A00;
        if (j < j2) {
            return r3;
        }
        return this.A01.CDd(r7, r8, r3, j - j2);
    }

    public final long AzR(C287725af r5, C287725af r6, C287725af r7) {
        return this.A01.AzR(r5, r6, r7) + this.A00;
    }

    public final boolean CVL() {
        return this.A01.CVL();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IEV)) {
            return false;
        }
        IEV iev = (IEV) obj;
        if (iev.A00 == this.A00) {
            return C51971G9r.A1Z(iev.A01, this.A01, false);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + C51968G9o.A03(this.A00);
    }

    public IEV(C3026164i r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
