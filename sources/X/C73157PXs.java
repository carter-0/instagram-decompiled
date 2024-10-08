package X;

/* renamed from: X.PXs  reason: case insensitive filesystem */
public final /* synthetic */ class C73157PXs implements Runnable {
    public final /* synthetic */ 2X3 A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ C73157PXs(2X3 r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void run() {
        2X3 r1 = this.A00;
        try {
            this.A01.run();
        } finally {
            r1.A00();
        }
    }
}
