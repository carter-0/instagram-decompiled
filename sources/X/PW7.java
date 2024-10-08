package X;

public final class PW7 implements Runnable {
    public final /* synthetic */ C72939PPx A00;

    public PW7(C72939PPx pPx) {
        this.A00 = pPx;
    }

    public final void run() {
        C72939PPx pPx = this.A00;
        boolean z = pPx.A0A;
        0Jv r0 = pPx.A05;
        if (z) {
            if (r0 != null) {
                C72939PPx.A04(pPx, r0, "Timeout");
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (r0 != null) {
            C72939PPx.A03(pPx, r0, "Timeout");
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
