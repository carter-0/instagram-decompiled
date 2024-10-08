package X;

public final class MY0 {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(MY1.A00);
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new MMK(this, 20));
    public final boolean A06;
    public final boolean A07;

    public final void A00() {
        if (this.A06 && !this.A00) {
            JTO.A0E(this.A04).post((Runnable) this.A05.getValue());
        }
    }

    public MY0(int i, int i2, long j, boolean z, boolean z2) {
        this.A06 = z;
        this.A02 = i;
        this.A03 = j;
        this.A01 = i2;
        this.A07 = z2;
    }
}
