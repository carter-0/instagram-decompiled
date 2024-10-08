package X;

public final /* synthetic */ class THG implements Runnable {
    public final /* synthetic */ C635813i A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ THG(C635813i r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final void run() {
        boolean z;
        C635813i r0 = this.A00;
        Runnable runnable = this.A01;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        try {
            currentThread.setName((String) r0.get());
            z = true;
        } catch (SecurityException unused) {
            z = false;
        }
        try {
            runnable.run();
        } finally {
            if (z) {
                try {
                    currentThread.setName(name);
                } catch (SecurityException unused2) {
                }
            }
        }
    }
}
