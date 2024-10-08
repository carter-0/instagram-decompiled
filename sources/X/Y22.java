package X;

public final class Y22 implements Runnable {
    public final /* synthetic */ AnonymousClass3V9 A00;

    public Y22(AnonymousClass3V9 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3W1 r0;
        AnonymousClass3V9 r2 = this.A00;
        if (AnonymousClass3V9.A08(r2) || ((r0 = r2.A02) != null && r0.A2S)) {
            Runnable runnable = r2.A08;
            if (runnable != null) {
                r2.A0G.removeCallbacks(runnable);
                r2.A08 = null;
                return;
            }
            return;
        }
        if (AnonymousClass3V9.A00(r2).A00 == AnonymousClass05K.A01) {
            r2.A0G(AnonymousClass05K.A0C);
        }
        Runnable runnable2 = r2.A08;
        if (runnable2 != null) {
            r2.A0G.removeCallbacks(runnable2);
            r2.A08 = null;
        }
        if (!AnonymousClass3V9.A00(r2).A06) {
            AnonymousClass3V9.A04(r2);
        }
    }
}
