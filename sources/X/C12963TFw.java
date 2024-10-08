package X;

/* renamed from: X.TFw  reason: case insensitive filesystem */
public final /* synthetic */ class C12963TFw implements Runnable {
    public final /* synthetic */ S1A A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ C12963TFw(S1A s1a, Runnable runnable) {
        this.A00 = s1a;
        this.A01 = runnable;
    }

    public final void run() {
        S1A s1a = this.A00;
        try {
            this.A01.run();
        } catch (Throwable th) {
            s1a.A00.Ew3("OxygenInstallSDK_UNEXPECTED_THREAD_EXCEPTION", th);
        }
    }
}
