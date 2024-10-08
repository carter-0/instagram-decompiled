package X;

/* renamed from: X.50c  reason: invalid class name and case insensitive filesystem */
public final class C2801050c implements Runnable {
    public final /* synthetic */ AnonymousClass3V9 A00;

    public C2801050c(AnonymousClass3V9 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3V9 r2 = this.A00;
        if (!AnonymousClass3V9.A08(r2) && AnonymousClass3V9.A00(r2).A00 == AnonymousClass05K.A01) {
            r2.A0G(AnonymousClass05K.A00);
        }
        Runnable runnable = r2.A09;
        if (runnable != null) {
            r2.A0G.removeCallbacks(runnable);
            r2.A09 = null;
        }
    }
}
