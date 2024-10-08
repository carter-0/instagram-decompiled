package X;

public final class WLH implements C21046XBn {
    public final C21046XBn A00;
    public final Object A01 = new Object();

    public final void APd(Object obj) {
        synchronized (this.A01) {
            this.A00.APd(obj);
        }
    }

    public final Object getState() {
        return this.A00.getState();
    }

    public WLH(C21046XBn xBn) {
        this.A00 = xBn;
    }
}
