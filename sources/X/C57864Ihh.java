package X;

/* renamed from: X.Ihh  reason: case insensitive filesystem */
public final class C57864Ihh implements Runnable {
    public final /* synthetic */ AnonymousClass3W1 A00;
    public final /* synthetic */ AnonymousClass3VD A01;

    public C57864Ihh(AnonymousClass3W1 r1, AnonymousClass3VD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass3W1 r1 = this.A00;
        if (r1.A20) {
            this.A01.A00();
            r1.A0k(false);
        }
        AnonymousClass3VD r2 = this.A01;
        Runnable runnable = r2.A02;
        if (runnable != null) {
            r2.A07.removeCallbacks(runnable);
            r2.A02 = null;
        }
    }
}
