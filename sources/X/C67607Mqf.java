package X;

/* renamed from: X.Mqf  reason: case insensitive filesystem */
public final class C67607Mqf implements Runnable {
    public boolean A00;
    public final Runnable A01;

    public final void run() {
        if (!this.A00) {
            this.A01.run();
        }
    }

    public C67607Mqf(Runnable runnable) {
        this.A01 = runnable;
    }
}
