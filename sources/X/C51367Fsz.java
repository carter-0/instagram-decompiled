package X;

/* renamed from: X.Fsz  reason: case insensitive filesystem */
public final class C51367Fsz implements Runnable {
    public final /* synthetic */ C47483E4i A00;
    public final /* synthetic */ Runnable A01;

    public C51367Fsz(C47483E4i e4i, Runnable runnable) {
        this.A00 = e4i;
        this.A01 = runnable;
    }

    public final void run() {
        if (this.A00.A06()) {
            this.A01.run();
        }
    }
}
