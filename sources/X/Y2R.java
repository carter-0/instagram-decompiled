package X;

public final class Y2R implements Runnable {
    public final /* synthetic */ C21181XIa A00;
    public final /* synthetic */ boolean A01;

    public Y2R(C21181XIa xIa, boolean z) {
        this.A00 = xIa;
        this.A01 = z;
    }

    public final void run() {
        try {
            C21181XIa xIa = this.A00;
            int i = 9;
            if (this.A01) {
                i = 3;
            }
            xIa.A00(i);
        } catch (RuntimeException e) {
            0KC.A0J("PeriodicEventHandler", "Exception happened within maybeLog", e);
        }
    }
}
