package X;

/* renamed from: X.IfS  reason: case insensitive filesystem */
public final class C57725IfS implements Runnable {
    public final /* synthetic */ C55965HqW A00;

    public C57725IfS(C55965HqW hqW) {
        this.A00 = hqW;
    }

    public final void run() {
        C55965HqW hqW = this.A00;
        hqW.A02.set(true);
        hqW.A01.run();
    }
}
