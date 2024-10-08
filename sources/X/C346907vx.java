package X;

/* renamed from: X.7vx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C346907vx implements Runnable {
    public final /* synthetic */ C346847vr A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ C346907vx(C346847vr r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void run() {
        C346847vr r2 = this.A00;
        Runnable runnable = this.A01;
        0qQ.A0B(r2, 0);
        if (r2.A03.offer(runnable)) {
            r2.A00();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables");
    }
}
