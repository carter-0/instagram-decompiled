package X;

public final /* synthetic */ class Y1Z implements Runnable {
    public final /* synthetic */ C21486Xcd A00;

    public /* synthetic */ Y1Z(C21486Xcd xcd) {
        this.A00 = xcd;
    }

    public final void run() {
        C21486Xcd xcd = this.A00;
        0qQ.A0B(xcd, 0);
        synchronized (xcd.A01) {
            if (!xcd.A00) {
                xcd.A02.invoke();
                xcd.A00();
            }
        }
    }
}
