package X;

public final class AiO implements Runnable {
    public final /* synthetic */ C2603145d A00;

    public AiO(C2603145d r1) {
        this.A00 = r1;
    }

    public final void run() {
        C2603145d r2 = this.A00;
        if (!AnonymousClass45S.A00(r2.A02)) {
            0qQ.A0B(AnonymousClass05K.A01, 0);
            C250773m2 r0 = r2.A00;
            if (r0 != null) {
                r0.onNetworkUnavailable();
            }
        }
    }
}
