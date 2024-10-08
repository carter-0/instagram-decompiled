package X;

/* renamed from: X.Rsr  reason: case insensitive filesystem */
public final class C10476Rsr {
    public final C11204SFe A00;
    public final SO3 A01;

    /* JADX WARNING: type inference failed for: r0v6, types: [X.R2r, X.S0k] */
    public C10476Rsr(SO3 so3) {
        C11204SFe sFe;
        synchronized (RQ0.class) {
            C8507Qw3 qw3 = new C8507Qw3();
            R2r r2r = RQ0.A00;
            R2r r2r2 = r2r;
            if (r2r == null) {
                ? s0k = new S0k();
                RQ0.A00 = s0k;
                r2r2 = s0k;
            }
            sFe = (C11204SFe) r2r2.A00(qw3);
        }
        this.A01 = so3;
        this.A00 = sFe;
    }
}
