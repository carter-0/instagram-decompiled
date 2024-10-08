package X;

public final class WG8 implements X93 {
    public long A00;
    public WG9 A01;
    public Long A02;
    public W1n A03;
    public final C364928mF A04 = C364928mF.A01;
    public final C14967UHf A05 = new C14967UHf(this);
    public volatile boolean A06;
    public volatile boolean A07 = false;

    public final void EwI(WG9 wg9) {
        this.A07 = false;
        this.A06 = true;
        this.A01 = wg9;
        this.A04.A00(this.A05);
    }

    public final void stop() {
        this.A07 = true;
        this.A06 = false;
    }

    public final W1n CE7() {
        return this.A03;
    }

    public final void DGm() {
    }

    public final void DGq() {
        this.A04.A00(this.A05);
    }

    public final void EqE(W1n w1n) {
        this.A03 = w1n;
    }
}
