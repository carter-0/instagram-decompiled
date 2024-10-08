package X;

/* renamed from: X.AmN  reason: case insensitive filesystem */
public final class C40977AmN implements Runnable {
    public final /* synthetic */ C365588nM A00;
    public final /* synthetic */ C10893Rzt A01;

    public C40977AmN(C365588nM r1, C10893Rzt rzt) {
        this.A00 = r1;
        this.A01 = rzt;
    }

    public final void run() {
        2JF r2 = this.A00.A00;
        synchronized (r2) {
            2JF.A02(r2, this.A01, true);
            2JF.A01(r2);
        }
    }
}
