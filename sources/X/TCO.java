package X;

public final class TCO implements Runnable {
    public final /* synthetic */ C10823Ryj A00;

    public TCO(C10823Ryj ryj) {
        this.A00 = ryj;
    }

    public final void run() {
        C10823Ryj ryj = this.A00;
        synchronized (ryj) {
            if (!ryj.A01) {
                ryj.A06.invoke(S9C.A00("Location request timed out", 3));
                0fW.A01(ryj.A03, ryj.A04);
                ryj.A01 = true;
            }
        }
    }
}
