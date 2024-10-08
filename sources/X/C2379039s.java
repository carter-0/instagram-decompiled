package X;

/* renamed from: X.39s  reason: invalid class name and case insensitive filesystem */
public final class C2379039s implements Runnable {
    public final AnonymousClass38P A00;
    public final Runnable A01;

    public final void run() {
        try {
            this.A01.run();
            AnonymousClass38P r1 = this.A00;
            synchronized (r1.A01) {
                r1.A00();
            }
            return;
        } catch (Throwable th) {
            th = th;
        }
        throw th;
    }

    public C2379039s(AnonymousClass38P r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }
}
