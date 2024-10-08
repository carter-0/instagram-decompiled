package X;

public final class TCN implements Runnable {
    public final /* synthetic */ C11346SOf A00;

    public TCN(C11346SOf sOf) {
        this.A00 = sOf;
    }

    public final void run() {
        C11346SOf sOf = this.A00;
        synchronized (sOf.A03) {
            C11346SOf.A01(sOf);
        }
    }
}
