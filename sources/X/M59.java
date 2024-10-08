package X;

public final class M59 implements Runnable {
    public final /* synthetic */ C313616gj A00;

    public M59(C313616gj r1) {
        this.A00 = r1;
    }

    public final void run() {
        LOI loi;
        C255773uh r0;
        C313616gj r1 = this.A00;
        if (C313616gj.A04(r1) && !r1.A0D && (loi = r1.A04) != null && loi.A04) {
            C313596gh r2 = r1.A0R;
            C305836Jt r12 = r1.A01;
            if (r12 != null) {
                r0 = r12.A02;
            } else {
                r0 = null;
            }
            C313426gQ r4 = r2.A03;
            if (r4 != null) {
                C273384mU r3 = r2.A02;
                if (r4.CPe(r0, r12)) {
                    C313416gP r22 = (C313416gP) r4;
                    AnonymousClass4MN r02 = r22.A0M;
                    if (r02 != null) {
                        r02.reset();
                    }
                    AnonymousClass3OB r13 = AnonymousClass3OB.IDLE;
                    AnonymousClass5MR r03 = r22.A12;
                    if (r03 != null) {
                        r03.A00 = r13;
                    }
                    C255773uh Au5 = r3.Au5();
                    if (Au5 != null) {
                        r4.E47(Au5, true);
                    }
                }
            }
        }
    }
}
