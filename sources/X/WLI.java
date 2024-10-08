package X;

public final class WLI implements C21046XBn {
    public final C21046XBn A00;
    public final C20889X2t A01;

    public final void APd(Object obj) {
        this.A01.accept(obj);
    }

    public final Object getState() {
        return this.A00.getState();
    }

    public WLI(C21046XBn xBn, X6A... x6aArr) {
        C20889X2t wl9;
        this.A00 = xBn;
        C20889X2t wl8 = new WL8(this);
        int i = 2;
        do {
            wl9 = new WL9(wl8, this, x6aArr[i]);
            i--;
            wl8 = wl9;
        } while (i >= 0);
        this.A01 = wl9;
        int i2 = 0;
        do {
            x6aArr[i2].D5h(this);
            i2++;
        } while (i2 < 3);
    }
}
