package X;

/* renamed from: X.8w5  reason: invalid class name and case insensitive filesystem */
public final class C370258w5 implements Runnable {
    public final /* synthetic */ C354168Kx A00;
    public final /* synthetic */ C352218Cl A01;

    public C370258w5(C354168Kx r1, C352218Cl r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C354168Kx r2 = this.A00;
        AnonymousClass84L r3 = r2.A01;
        if (r3 == null) {
            r3 = AnonymousClass84K.A00(r2.A02, r2.A03);
        }
        if (r2.A01 == null) {
            r2.A01 = r3;
        }
        C352218Cl r0 = this.A01;
        r3.A01(r0.A06(), new C377269Le(r2, 22), r0.A09, r0.A06, r0.A07);
    }
}
