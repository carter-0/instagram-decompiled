package X;

public final class Wj9 implements Runnable {
    public final /* synthetic */ U10 A00;

    public Wj9(U10 u10) {
        this.A00 = u10;
    }

    public final void run() {
        U10 u10 = this.A00;
        u10.A03 = System.currentTimeMillis();
        u10.A04 = false;
        u10.invalidateSelf();
    }
}
