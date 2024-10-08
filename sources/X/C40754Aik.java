package X;

/* renamed from: X.Aik  reason: case insensitive filesystem */
public final class C40754Aik implements Runnable {
    public final /* synthetic */ C3737296r A00;

    public C40754Aik(C3737296r r1) {
        this.A00 = r1;
    }

    public final void run() {
        C3737296r r0 = this.A00;
        synchronized (r0.A01) {
            r0.A00.D0c();
        }
    }
}
