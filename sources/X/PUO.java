package X;

public final class PUO implements Runnable {
    public final /* synthetic */ C70969OTq A00;

    public PUO(C70969OTq oTq) {
        this.A00 = oTq;
    }

    public final void run() {
        C70969OTq oTq = this.A00;
        if (!oTq.A08) {
            oTq.A00 = false;
            C71004OWb.A00.A00("ForegroundEligibilityStatus", "No longer safe to start foreground service");
        }
    }
}
