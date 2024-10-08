package X;

public final class M2R implements Runnable {
    public final /* synthetic */ C65164LoT A00;

    public M2R(C65164LoT loT) {
        this.A00 = loT;
    }

    public final void run() {
        C65164LoT loT = this.A00;
        JWJ jwj = loT.A0F;
        jwj.A02.removeCallbacks(loT.A0J);
        C364988mL r2 = loT.A03;
        loT.A03 = null;
        loT.A02 = null;
        AnonymousClass80G r0 = loT.A05;
        if (r0 != null) {
            r0.A09 = null;
        }
        loT.A05 = null;
        loT.A0N = 0;
        loT.A0M = 0;
        if (r2 != null && jwj.A00 != null) {
            r2.A0C(new M6M(r2, loT));
            loT.A0E.A02.remove(loT);
        }
    }
}
