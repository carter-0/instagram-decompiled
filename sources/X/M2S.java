package X;

public final class M2S implements Runnable {
    public final /* synthetic */ C65164LoT A00;

    public M2S(C65164LoT loT) {
        this.A00 = loT;
    }

    public final void run() {
        C344207rU r1;
        C65164LoT loT = this.A00;
        C364988mL r2 = loT.A03;
        if (r2 != null && (r1 = loT.A0F.A00) != null) {
            loT.A03 = null;
            C345807u7 r0 = (C345807u7) r1.A02(C345807u7.A00);
            if (r0 != null) {
                r0.ECk(r2);
            }
            loT.A0E.A02.remove(loT);
        }
    }
}
