package X;

/* renamed from: X.LDy  reason: case insensitive filesystem */
public final class C63938LDy {
    public long A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public final Runnable A04;
    public final /* synthetic */ C22371Y0z A05;

    public C63938LDy(C22371Y0z y0z) {
        this.A05 = y0z;
        this.A04 = new M8F(this, y0z);
    }

    public final void A00() {
        this.A05.A0B.removeCallbacks(this.A04);
        this.A02 = false;
    }
}
