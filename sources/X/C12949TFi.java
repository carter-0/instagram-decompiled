package X;

/* renamed from: X.TFi  reason: case insensitive filesystem */
public final /* synthetic */ class C12949TFi implements Runnable {
    public final /* synthetic */ C13167TNz A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ C12949TFi(C13167TNz tNz, Runnable runnable) {
        this.A00 = tNz;
        this.A01 = runnable;
    }

    public final void run() {
        C13167TNz tNz = this.A00;
        try {
            this.A01.run();
        } catch (RuntimeException e) {
            tNz.A01.handleException(e);
        } catch (Throwable th) {
            tNz.A00();
            throw th;
        }
        tNz.A00();
    }
}
