package X;

public final class Y2A implements Runnable {
    public final /* synthetic */ XDD A00;

    public Y2A(XDD xdd) {
        this.A00 = xdd;
    }

    public final void run() {
        try {
            XDD xdd = this.A00;
            xdd.A02.onComplete();
            xdd.A03.dispose();
        } catch (Throwable th) {
            this.A00.A03.dispose();
            throw th;
        }
    }
}
