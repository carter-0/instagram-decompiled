package X;

/* renamed from: X.PY4  reason: case insensitive filesystem */
public final class C73169PY4 implements Runnable {
    public final /* synthetic */ NCR A00;
    public final /* synthetic */ boolean A01;

    public C73169PY4(NCR ncr, boolean z) {
        this.A01 = z;
        this.A00 = ncr;
    }

    public final void run() {
        boolean z = this.A01;
        NCR ncr = this.A00;
        if (z != ncr.A05) {
            if (!z) {
                ncr.A06 = false;
                ncr.A09.A00.A04();
            }
            ncr.A05 = z;
        }
    }
}
