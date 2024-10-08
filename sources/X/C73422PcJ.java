package X;

/* renamed from: X.PcJ  reason: case insensitive filesystem */
public final class C73422PcJ implements Runnable, C65051aA {
    public Thread A00;
    public final C318286oh A01;
    public final Runnable A02;

    public final void dispose() {
        if (this.A00 == Thread.currentThread()) {
            C318286oh r1 = this.A01;
            if (r1 instanceof C318276og) {
                C318276og r12 = (C318276og) r1;
                if (!r12.A01) {
                    r12.A01 = true;
                    r12.A00.shutdown();
                    return;
                }
                return;
            }
        }
        this.A01.dispose();
    }

    public C73422PcJ(C318286oh r1, Runnable runnable) {
        this.A02 = runnable;
        this.A01 = r1;
    }

    public final void run() {
        this.A00 = Thread.currentThread();
        try {
            this.A02.run();
        } finally {
            dispose();
            this.A00 = null;
        }
    }
}
