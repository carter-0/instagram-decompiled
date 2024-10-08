package X;

public final class Y20 implements Runnable {
    public final /* synthetic */ Y56 A00;

    public Y20(Y56 y56) {
        this.A00 = y56;
    }

    public final void run() {
        Y56 y56 = this.A00;
        y56.A00.release();
        Y56.A01(y56);
    }
}
