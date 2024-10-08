package X;

public final class Wi4 implements Runnable {
    public final /* synthetic */ U1E A00;

    public Wi4(U1E u1e) {
        this.A00 = u1e;
    }

    public final void run() {
        U1E u1e = this.A00;
        u1e.unscheduleSelf(u1e.A0B);
        u1e.invalidateSelf();
    }
}
