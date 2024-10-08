package X;

public final /* synthetic */ class M3Q implements Runnable {
    public final /* synthetic */ C60011JdK A00;

    public /* synthetic */ M3Q(C60011JdK jdK) {
        this.A00 = jdK;
    }

    public final void run() {
        K5H k5h = this.A00.A00;
        if (k5h.isResumed() && k5h.A0n != null) {
            k5h.registerLifecycleListener(k5h.A0n);
        }
    }
}
