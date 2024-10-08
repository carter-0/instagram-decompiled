package X;

/* renamed from: X.SmF  reason: case insensitive filesystem */
public final class C12063SmF implements Y9I {
    public Throwable A00;
    public boolean A01;
    public boolean A02;

    public final synchronized void A00() {
        this.A01 = true;
    }

    public final synchronized void targetDestructed() {
        Throwable th;
        if (!this.A01 && (th = this.A00) != null) {
            throw Pxe.A0u("Unhandled exception in thread pool", th);
        }
    }
}
