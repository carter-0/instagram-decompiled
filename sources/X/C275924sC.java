package X;

/* renamed from: X.4sC  reason: invalid class name and case insensitive filesystem */
public final class C275924sC implements Runnable {
    public final /* synthetic */ AnonymousClass3TT A00;

    public C275924sC(AnonymousClass3TT r1) {
        this.A00 = r1;
    }

    public final void run() {
        Integer num;
        AnonymousClass3TT r2 = this.A00;
        AnonymousClass3W1 r0 = r2.A04;
        if (r0 != null && !AnonymousClass3TT.A03(r2, r0)) {
            AnonymousClass3W1 r02 = r2.A04;
            if (r02 != null) {
                num = r02.A15;
            } else {
                num = null;
            }
            if (num == AnonymousClass05K.A00) {
                AnonymousClass3TT.A02(r2, AnonymousClass05K.A01);
            }
        }
        Runnable runnable = r2.A05;
        if (runnable != null) {
            r2.A08.removeCallbacks(runnable);
        }
        r2.A05 = null;
    }
}
