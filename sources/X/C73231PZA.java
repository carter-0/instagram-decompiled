package X;

/* renamed from: X.PZA  reason: case insensitive filesystem */
public final class C73231PZA implements Runnable {
    public final /* synthetic */ C71410Ok9 A00;
    public final /* synthetic */ C62320sa A01;

    public C73231PZA(C71410Ok9 ok9, C62320sa r2) {
        this.A00 = ok9;
        this.A01 = r2;
    }

    public final void run() {
        if (this.A00.A03.compareAndSet(true, false)) {
            this.A01.invoke();
        }
    }
}
