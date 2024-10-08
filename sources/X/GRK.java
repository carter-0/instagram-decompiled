package X;

public final class GRK implements C3026164i {
    public final long A00;
    public final C59660JSf A01;
    public final Integer A02;

    public final long AzR(C287725af r3, C287725af r4, C287725af r5) {
        return Long.MAX_VALUE;
    }

    public final boolean CVL() {
        return true;
    }

    public final C287725af CDS(C287725af r20, C287725af r21, C287725af r22, long j) {
        long j2;
        C287725af r12 = r22;
        C59660JSf jSf = this.A01;
        if (j <= 0) {
            j2 = 0;
        } else {
            long j3 = this.A00;
            long j4 = j / j3;
            if (this.A02 == AnonymousClass05K.A00 || j4 % 2 == 0) {
                j2 = j - (j4 * j3);
            } else {
                j2 = ((j4 + 1) * j3) - j;
            }
        }
        long j5 = this.A00;
        C287725af r10 = r20;
        C287725af r11 = r21;
        if (j > j5) {
            r12 = jSf.CDd(r10, r11, r12, j5);
        }
        return jSf.CDS(r10, r11, r12, j2);
    }

    public final C287725af CDd(C287725af r20, C287725af r21, C287725af r22, long j) {
        long j2;
        C287725af r12 = r22;
        C59660JSf jSf = this.A01;
        if (j <= 0) {
            j2 = 0;
        } else {
            long j3 = this.A00;
            long j4 = j / j3;
            if (this.A02 == AnonymousClass05K.A00 || j4 % 2 == 0) {
                j2 = j - (j4 * j3);
            } else {
                j2 = ((j4 + 1) * j3) - j;
            }
        }
        long j5 = this.A00;
        C287725af r10 = r20;
        C287725af r11 = r21;
        if (j > j5) {
            r12 = jSf.CDd(r10, r11, r12, j5);
        }
        return jSf.CDd(r10, r11, r12, j2);
    }

    public GRK(C59660JSf jSf, Integer num) {
        this.A01 = jSf;
        this.A02 = num;
        this.A00 = ((long) (jSf.Aw8() + jSf.AzL())) * 1000000;
    }

    public final /* synthetic */ C287725af B1n(C287725af r7, C287725af r8, C287725af r9) {
        return CDd(r7, r8, r9, Long.MAX_VALUE);
    }
}
