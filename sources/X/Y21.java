package X;

public final class Y21 implements Runnable {
    public final /* synthetic */ AnonymousClass3V9 A00;

    public Y21(AnonymousClass3V9 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3V9 r2 = this.A00;
        if (AnonymousClass3V9.A08(r2)) {
            Runnable runnable = r2.A07;
            if (runnable != null) {
                r2.A0G.removeCallbacks(runnable);
                r2.A07 = null;
                return;
            }
            return;
        }
        if (AnonymousClass3V9.A00(r2).A00 == AnonymousClass05K.A0C) {
            r2.A0G(AnonymousClass05K.A01);
        }
        Runnable runnable2 = r2.A07;
        if (runnable2 != null) {
            r2.A0G.removeCallbacks(runnable2);
            r2.A07 = null;
        }
        if (!AnonymousClass3V9.A00(r2).A02) {
            AnonymousClass3V9.A06(r2);
        }
    }
}
