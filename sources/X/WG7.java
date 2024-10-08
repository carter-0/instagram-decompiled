package X;

public final class WG7 implements X93 {
    public WG9 A00;
    public W1n A01;
    public volatile boolean A02;

    public final void DGq() {
    }

    public final void stop() {
        this.A00 = null;
        this.A02 = false;
    }

    public final W1n CE7() {
        return this.A01;
    }

    public final void DGm() {
        if (this.A00 != null && this.A02) {
            WG9 wg9 = this.A00;
            System.nanoTime();
            if (Thread.currentThread() == wg9.A01) {
                wg9.A03.A0I(this);
            } else {
                WG9.A00(wg9, this, 3);
            }
        }
    }

    public final void EqE(W1n w1n) {
        this.A01 = w1n;
    }

    public final void EwI(WG9 wg9) {
        this.A00 = wg9;
        this.A02 = true;
    }
}
