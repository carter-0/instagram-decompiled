package X;

public final class Y2h implements Runnable {
    public final /* synthetic */ C264544Qh A00;
    public final /* synthetic */ C265144Ss A01;

    public Y2h(C264544Qh r1, C265144Ss r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        boolean z = this.A00.A0U;
        C265144Ss r1 = this.A01;
        if (z) {
            C265144Ss.A06(r1, false);
        } else {
            C265144Ss.A05(r1, false);
        }
    }
}
