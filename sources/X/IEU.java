package X;

public final class IEU implements C3026164i {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C59660JSf A03;

    public final /* synthetic */ C287725af B1n(C287725af r9, C287725af r10, C287725af r11) {
        return CDd(r9, r10, r11, (((long) this.A00) * this.A01) - this.A02);
    }

    public final long AzR(C287725af r5, C287725af r6, C287725af r7) {
        return (((long) this.A00) * this.A01) - this.A02;
    }

    public final C287725af CDS(C287725af r18, C287725af r19, C287725af r20, long j) {
        C287725af r13 = r20;
        C59660JSf jSf = this.A03;
        long j2 = this.A02;
        long j3 = j + j2;
        long j4 = 0;
        if (j3 > 0) {
            long j5 = this.A01;
            j4 = j3 - (Math.min(j3 / j5, ((long) this.A00) - 1) * j5);
        }
        long j6 = this.A01;
        C287725af r12 = r18;
        C287725af r14 = r19;
        if (j3 > j6) {
            r13 = CDd(r12, r13, r14, j6 - j2);
        }
        return jSf.CDS(r12, r14, r13, j4);
    }

    public final C287725af CDd(C287725af r18, C287725af r19, C287725af r20, long j) {
        C287725af r13 = r20;
        C59660JSf jSf = this.A03;
        long j2 = this.A02;
        long j3 = j + j2;
        long j4 = 0;
        if (j3 > 0) {
            long j5 = this.A01;
            j4 = j3 - (Math.min(j3 / j5, ((long) this.A00) - 1) * j5);
        }
        long j6 = this.A01;
        C287725af r12 = r18;
        C287725af r14 = r19;
        if (j3 > j6) {
            r13 = CDd(r12, r13, r14, j6 - j2);
        }
        return jSf.CDd(r12, r14, r13, j4);
    }

    public final /* synthetic */ boolean CVL() {
        return false;
    }

    public IEU(C59660JSf jSf, int i, long j) {
        this.A00 = i;
        this.A03 = jSf;
        if (i >= 1) {
            this.A01 = ((long) (jSf.Aw8() + jSf.AzL())) * 1000000;
            this.A02 = j * 1000000;
            return;
        }
        throw AnonymousClass7TE.A0w("Iterations count can't be less than 1");
    }
}
