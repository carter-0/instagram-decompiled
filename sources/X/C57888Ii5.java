package X;

/* renamed from: X.Ii5  reason: case insensitive filesystem */
public final class C57888Ii5 implements Runnable {
    public final /* synthetic */ HQS A00;
    public final /* synthetic */ C52872Ge6 A01;
    public final /* synthetic */ C245033cB A02;

    public C57888Ii5(HQS hqs, C52872Ge6 ge6, C245033cB r3) {
        this.A00 = hqs;
        this.A02 = r3;
        this.A01 = ge6;
    }

    public final void run() {
        HQS hqs = this.A00;
        int i = hqs.A00;
        if (i == -1) {
            if (this.A02 == C245033cB.RTL) {
                this.A01.fullScroll(66);
            }
            hqs.A00 = this.A01.getScrollX();
            return;
        }
        this.A01.setScrollX(i);
    }
}
