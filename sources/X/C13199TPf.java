package X;

/* renamed from: X.TPf  reason: case insensitive filesystem */
public final class C13199TPf implements C13972Tma {
    public boolean A00;
    public final /* synthetic */ C11256SHq A01;

    public C13199TPf(C11256SHq sHq) {
        this.A01 = sHq;
    }

    public final C11291SJy Ezn() {
        return this.A01.A05.Ezn();
    }

    public final void FNi(C13198TPe tPe, long j) {
        if (!this.A00) {
            C11256SHq sHq = this.A01;
            C13198TPe tPe2 = sHq.A03;
            tPe2.FNi(tPe, j);
            long j2 = tPe2.A00;
            if (j2 != 0) {
                SRX srx = tPe2.A01.A03;
                int i = srx.A00;
                if (i < 8192 && srx.A04) {
                    j2 -= (long) (i - srx.A01);
                }
                if (j2 > 0) {
                    sHq.A01(j2, false);
                    return;
                }
                return;
            }
            return;
        }
        throw JTO.A0u("closed");
    }

    public final void close() {
        if (!this.A00) {
            C11256SHq sHq = this.A01;
            sHq.A01(sHq.A03.A00, true);
            this.A00 = true;
            return;
        }
        throw JTO.A0u("closed");
    }

    public final void flush() {
        if (!this.A00) {
            C11256SHq sHq = this.A01;
            sHq.A01(sHq.A03.A00, false);
            return;
        }
        throw JTO.A0u("closed");
    }
}
