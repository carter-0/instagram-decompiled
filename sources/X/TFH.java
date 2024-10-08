package X;

public final class TFH implements Runnable {
    public final C11990Sk9 A00;
    public final /* synthetic */ C12005SkO A01;

    public TFH(C12005SkO skO, C11990Sk9 sk9) {
        this.A01 = skO;
        this.A00 = sk9;
    }

    public final void run() {
        C11990Sk9 sk9 = this.A00;
        sk9.A0G.A00();
        synchronized (sk9.A0I) {
            C12005SkO skO = this.A01;
            synchronized (skO) {
                if (skO.A0H.A00.contains(new S48(sk9, C10061Rly.A00))) {
                    try {
                        C11990Sk9.A02(skO.A03, sk9, 5);
                    } catch (Throwable th) {
                        throw new RuntimeException("Unexpected exception thrown by non-Glide code", th);
                    }
                }
                skO.A01();
            }
        }
    }
}
