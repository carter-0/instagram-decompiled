package X;

public final class Y7S extends C22462Y4t {
    public boolean A00;
    public final /* synthetic */ C22456Y4n A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Y7S(C22456Y4n y4n) {
        super(y4n);
        this.A01 = y4n;
    }

    public final long E6C(C13198TPe tPe, long j) {
        if (j < 0) {
            throw Pxg.A0b("byteCount < 0: ", j);
        } else if (!this.A00) {
            if (!this.A00) {
                long E6C = super.E6C(tPe, j);
                if (E6C != -1) {
                    return E6C;
                }
                this.A00 = true;
                A00();
            }
            return -1;
        } else {
            throw Pxh.A0a();
        }
    }

    public final void close() {
        if (!this.A00) {
            if (!this.A00) {
                A00();
            }
            this.A00 = true;
        }
    }
}
