package X;

public final class M2X implements Runnable {
    public final /* synthetic */ C64910LkA A00;

    public M2X(C64910LkA lkA) {
        this.A00 = lkA;
    }

    public final void run() {
        C344207rU r1;
        C64910LkA lkA = this.A00;
        C364988mL r2 = lkA.A02;
        if (r2 != null && (r1 = lkA.A08.A00) != null) {
            lkA.A02 = null;
            C345807u7 r0 = (C345807u7) r1.A02(C345807u7.A00);
            if (r0 != null) {
                r0.ECk(r2);
            }
            lkA.A07.A02.remove(lkA);
        }
    }
}
