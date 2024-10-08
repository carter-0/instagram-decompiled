package X;

/* renamed from: X.Sfk  reason: case insensitive filesystem */
public final class C11749Sfk implements YA4 {
    public SJM A00;
    public C21505XdL A01;
    public C13900TjN A02;

    public final void AJP(C11389SRd sRd) {
        long j;
        long j2;
        C21505XdL xdL = this.A01;
        C11366SPh.A00(xdL);
        synchronized (xdL) {
            long j3 = xdL.A00;
            if (j3 != -9223372036854775807L) {
                j = j3 + xdL.A01;
            } else {
                j = xdL.A00();
            }
        }
        C21505XdL xdL2 = this.A01;
        synchronized (xdL2) {
            j2 = xdL2.A01;
        }
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            SJM sjm = this.A00;
            if (j2 != sjm.A0O) {
                SOW sow = new SOW(sjm);
                sow.A0M = j2;
                SJM A0O = Pxe.A0O(sow);
                this.A00 = A0O;
                this.A02.AWO(A0O);
            }
            int A06 = Pxe.A06(sRd);
            this.A02.EJf(sRd, A06);
            this.A02.EJm((S4h) null, 1, A06, 0, j);
        }
    }

    public final void CMT(C21505XdL xdL, YBZ ybz, SR8 sr8) {
        this.A01 = xdL;
        sr8.A03();
        SR8.A02(sr8);
        C13900TjN FHV = ybz.FHV(sr8.A00, 5);
        this.A02 = FHV;
        FHV.AWO(this.A00);
    }
}
