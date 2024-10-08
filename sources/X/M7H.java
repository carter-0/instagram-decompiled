package X;

public final class M7H implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ K66 A01;

    public M7H(K66 k66, int i) {
        this.A01 = k66;
        this.A00 = i;
    }

    public final void run() {
        LBG lbg = this.A01.A06;
        if (lbg == null) {
            0qQ.A0F("viewHolder");
            throw AnonymousClass00P.createAndThrow();
        } else {
            lbg.A03.smoothScrollTo(0, this.A00);
        }
    }
}
