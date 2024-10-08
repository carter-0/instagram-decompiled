package X;

public final class Q4R implements Runnable {
    public final /* synthetic */ Q3O A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C7310Q3m A02;
    public final /* synthetic */ Q37 A03;

    public Q4R(Q3O q3o, C307896Rx r2, C7310Q3m q3m, Q37 q37) {
        this.A00 = q3o;
        this.A03 = q37;
        this.A02 = q3m;
        this.A01 = r2;
    }

    public final void run() {
        Q3O q3o = this.A00;
        Object obj = q3o.A03;
        Q37 q37 = this.A03;
        C7310Q3m q3m = this.A02;
        C307896Rx r1 = this.A01;
        synchronized (obj) {
            for (C11015S5m s5m : Q3O.A00(q3o, r1, q3m, q37, AnonymousClass05K.A01)) {
                C307446Qd r4 = q3o.A01;
                r4.A0B(s5m.A00);
                Q4Q q4q = s5m.A01;
                if (q4q != null) {
                    C245983dn.A02("Tree operations are only supported from the UI Thread");
                    C3034368u r12 = q4q.A00;
                    if (!r4.A0N) {
                        C245983dn.A02("Tree operations are only supported from the UI Thread");
                        r4.A0G.add(r12);
                        C307446Qd.A02(r4);
                    }
                    r4.A0D(q4q.A01, q4q.A02);
                }
            }
        }
    }
}
