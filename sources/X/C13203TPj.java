package X;

/* renamed from: X.TPj  reason: case insensitive filesystem */
public final class C13203TPj implements C13970TmY {
    public int A00;
    public long A01;
    public SRX A02;
    public boolean A03;
    public final C13198TPe A04;
    public final YCT A05;

    public final void close() {
        this.A03 = true;
    }

    public final long E6C(C13198TPe tPe, long j) {
        SRX srx;
        SRX srx2;
        if (j < 0) {
            throw Pxg.A0b("byteCount < 0: ", j);
        } else if (!this.A03) {
            SRX srx3 = this.A02;
            if (srx3 != null && (srx3 != (srx2 = this.A04.A01) || this.A00 != srx2.A01)) {
                throw AnonymousClass7TE.A0z("Peek source is invalid because upstream source was used");
            } else if (j == 0) {
                return 0;
            } else {
                if (!this.A05.EHK(this.A01 + 1)) {
                    return -1;
                }
                if (this.A02 == null && (srx = this.A04.A01) != null) {
                    this.A02 = srx;
                    this.A00 = srx.A01;
                }
                C13198TPe tPe2 = this.A04;
                long j2 = tPe2.A00;
                long j3 = this.A01;
                long min = Math.min(j, j2 - j3);
                tPe2.A0I(tPe, j3, min);
                this.A01 += min;
                return min;
            }
        } else {
            throw Pxh.A0a();
        }
    }

    public final C11291SJy Ezn() {
        return this.A05.Ezn();
    }

    public C13203TPj(YCT yct) {
        int i;
        this.A05 = yct;
        C13198TPe AEA = yct.AEA();
        this.A04 = AEA;
        SRX srx = AEA.A01;
        this.A02 = srx;
        if (srx != null) {
            i = srx.A01;
        } else {
            i = -1;
        }
        this.A00 = i;
    }
}
