package X;

/* renamed from: X.Am2  reason: case insensitive filesystem */
public final class C40956Am2 implements Runnable {
    public final /* synthetic */ C39769A8j A00;
    public final /* synthetic */ C344347ri A01;

    public C40956Am2(C39769A8j a8j, C344347ri r2) {
        this.A01 = r2;
        this.A00 = a8j;
    }

    public final void run() {
        C344347ri r7 = this.A01;
        C344477rv r6 = r7.A05;
        if (r6 == null) {
            this.A00.A00(new C391719tX(10015, "MediaGraphController is null."));
            return;
        }
        C345167t2 r5 = r7.A04;
        if (r5 != null) {
            r5.Ddr(new AVZ(false));
        }
        C344397rn r3 = r7.A06;
        if (r3 != null) {
            r3.EgY(false);
        }
        int i = r7.A03;
        int i2 = r7.A01;
        Integer valueOf = Integer.valueOf(i);
        C40139ATf aTf = new C40139ATf(r6.Abt(), Integer.valueOf(i2), Integer.valueOf(-r7.A02), valueOf, 2);
        r6.BQ8().A8c(aTf, 0);
        aTf.A00(new C40145ATl(r6, this.A00, aTf));
        r6.EF6((Long) null);
        if (r5 != null) {
            r5.Ddr(new C40186AVa(false));
        }
        if (r3 != null) {
            r3.EgY(true);
        }
    }
}
