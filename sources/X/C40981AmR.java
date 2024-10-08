package X;

/* renamed from: X.AmR  reason: case insensitive filesystem */
public final /* synthetic */ class C40981AmR implements Runnable {
    public final AXA A00;
    public final C3734495k A01;

    public C40981AmR(AXA axa, C3734495k r2) {
        this.A00 = axa;
        this.A01 = r2;
    }

    public final void run() {
        AXA axa = this.A00;
        C3734495k r2 = this.A01;
        if (axa.A01 == AXA.A03) {
            synchronized (axa) {
                axa.A00 = null;
                axa.A01 = r2;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("provide() can be called only once.");
    }
}
