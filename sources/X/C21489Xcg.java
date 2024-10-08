package X;

/* renamed from: X.Xcg  reason: case insensitive filesystem */
public final class C21489Xcg {
    public int A00;
    public long A01;
    public C21300XTx A02;
    public C21300XTx A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public final synchronized void A00() {
        this.A01 = 0;
        this.A00 = 0;
        this.A06 = false;
        this.A05 = false;
        this.A02 = null;
        this.A03 = null;
        this.A04 = true;
    }

    public final synchronized void A01(long j) {
        C21300XTx xTx = this.A03;
        if (!(xTx == null && (xTx = this.A02) == null) && this.A06) {
            xTx.A00 = j;
            this.A06 = false;
            this.A01 += j - xTx.A02;
        }
    }
}
