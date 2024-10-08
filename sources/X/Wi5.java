package X;

public final class Wi5 implements Runnable {
    public final /* synthetic */ U1C A00;

    public Wi5(U1C u1c) {
        this.A00 = u1c;
    }

    public final void run() {
        U1C u1c = this.A00;
        u1c.unscheduleSelf(this);
        u1c.invalidateSelf();
    }
}
