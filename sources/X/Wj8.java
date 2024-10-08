package X;

public final class Wj8 implements Runnable {
    public final /* synthetic */ U10 A00;

    public Wj8(U10 u10) {
        this.A00 = u10;
    }

    public final void run() {
        U10 u10 = this.A00;
        u10.A03 = -1;
        u10.A04 = false;
        u10.A00 = 1.0f;
        u10.invalidateSelf();
    }
}
