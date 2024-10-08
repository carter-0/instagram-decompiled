package X;

public final class TB1 implements Runnable {
    public final /* synthetic */ S2H A00;

    public TB1(S2H s2h) {
        this.A00 = s2h;
    }

    public final void run() {
        S2H s2h = this.A00;
        while (true) {
            try {
                TRV trv = (TRV) s2h.A01.remove();
                synchronized (s2h) {
                    s2h.A02.remove(trv.A00);
                }
            } catch (InterruptedException unused) {
                Pxe.A1F();
            }
        }
    }
}
