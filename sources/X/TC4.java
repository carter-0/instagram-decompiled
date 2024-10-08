package X;

public final /* synthetic */ class TC4 implements Runnable {
    public final /* synthetic */ SHY A00;

    public /* synthetic */ TC4(SHY shy) {
        this.A00 = shy;
    }

    public final void run() {
        SHY shy = this.A00;
        synchronized (shy) {
            shy.A01 = null;
            if (shy.A02) {
                Runnable runnable = shy.A00;
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        shy.A03.Ew3("OxygenInstallSDK_UNEXPECTED_THREAD_EXCEPTION", e);
                    }
                }
                SHY.A00(shy);
            }
        }
    }
}
