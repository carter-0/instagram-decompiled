package X;

/* renamed from: X.Wiw  reason: case insensitive filesystem */
public final class C19985Wiw implements Runnable {
    public final /* synthetic */ U1T A00;

    public C19985Wiw(U1T u1t) {
        this.A00 = u1t;
    }

    public final void run() {
        U1T u1t = this.A00;
        u1t.A02 = true;
        u1t.invalidateSelf();
    }
}
