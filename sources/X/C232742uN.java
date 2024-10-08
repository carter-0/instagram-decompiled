package X;

/* renamed from: X.2uN  reason: invalid class name and case insensitive filesystem */
public final class C232742uN implements Runnable {
    public final /* synthetic */ C232722uK A00;

    public C232742uN(C232722uK r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3V3 r2;
        C232722uK r4 = this.A00;
        C263744Ne r0 = r4.A02;
        if (r0 != null && (r2 = r0.A08) != null && r4.A06 == AnonymousClass05K.A0N) {
            AnonymousClass3TN B5Y = r2.B5Y();
            if (B5Y != null) {
                B5Y.DkZ();
            }
            AnonymousClass3TN B5Y2 = r2.B5Y();
            if (B5Y2 != null) {
                B5Y2.removeCallbacks(r4.A0M);
            }
            AnonymousClass3TN B5Y3 = r2.B5Y();
            if (B5Y3 != null) {
                B5Y3.postDelayed(r4.A0M, 2000);
            }
        }
    }
}
