package X;

/* renamed from: X.WnL  reason: case insensitive filesystem */
public final class C20221WnL implements Runnable {
    public final /* synthetic */ C15964Ulg A00;
    public final /* synthetic */ C15381Ube A01;

    public C20221WnL(C15964Ulg ulg, C15381Ube ube) {
        this.A01 = ube;
        this.A00 = ulg;
    }

    public final void run() {
        C15381Ube ube = this.A01;
        C18806W2y w2y = ube.A0c;
        C15964Ulg ulg = this.A00;
        int i = ulg.A00;
        C18806W2y.A01(w2y, i, false);
        C18806W2y.A05(w2y, "FEED_REQUEST_FAIL", i);
        if (ulg.A03) {
            C321676uZ r0 = ube.A02;
            if (r0 != null) {
                r0.A00.A07(AnonymousClass000.A00(363));
                C321676uZ r02 = ube.A02;
                if (r02 != null) {
                    r02.D3U();
                    return;
                }
            }
            0qQ.A0F("gridPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
