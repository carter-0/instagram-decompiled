package X;

public final /* synthetic */ class TEs implements Runnable {
    public final /* synthetic */ C283035Fv A00;
    public final /* synthetic */ C2379539x A01;

    public /* synthetic */ TEs(C283035Fv r1, C2379539x r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C283035Fv r2 = this.A00;
        C2379539x r1 = this.A01;
        if (!r2.A04.isCancelled()) {
            r1.A06(r2.A02.getForegroundInfoAsync());
        } else {
            r1.cancel(true);
        }
    }
}
