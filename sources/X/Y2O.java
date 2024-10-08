package X;

public final class Y2O implements Runnable {
    public final /* synthetic */ C296605qL A00;
    public final /* synthetic */ C21468Xc0 A01;

    public Y2O(C296605qL r1, C21468Xc0 xc0) {
        this.A01 = xc0;
        this.A00 = r1;
    }

    public final void run() {
        C21468Xc0 xc0 = this.A01;
        C296505qA r6 = xc0.A01;
        if (r6 != null) {
            C296605qL r0 = this.A00;
            C296575qI r7 = xc0.A00;
            if (r7 != null && r7.A02(r0)) {
                xc0.A05.A01(r6, r7, xc0.A07, (((double) xc0.A06.now()) - ((double) r6.A05)) / 1000.0d, xc0.A04.A04);
                xc0.A00();
            }
        }
    }
}
