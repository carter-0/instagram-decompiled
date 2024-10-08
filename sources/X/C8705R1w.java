package X;

/* renamed from: X.R1w  reason: case insensitive filesystem */
public final class C8705R1w extends AnonymousClass1K1 implements Runnable {
    public final Runnable A00;

    public final void run() {
        try {
            this.A00.run();
        } catch (Throwable th) {
            setException(th);
            throw th;
        }
    }

    public C8705R1w(Runnable runnable) {
        runnable.getClass();
        this.A00 = runnable;
    }

    public final String A07() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("task=[");
        return Pxg.A0r(this.A00, A1A);
    }
}
