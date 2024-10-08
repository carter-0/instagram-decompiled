package X;

/* renamed from: X.AmV  reason: case insensitive filesystem */
public final class C40985AmV implements Runnable {
    public final /* synthetic */ C379809Vj A00;
    public final /* synthetic */ C268654dm A01;

    public C40985AmV(C379809Vj r1, C268654dm r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C268654dm r3 = this.A01;
        Throwable A012 = r3.A01();
        if (A012 != null) {
            this.A00.A00.A02(new C268664dn(A012));
        }
        C361098ff r1 = (C361098ff) r3.A00();
        if (r1 != null) {
            this.A00.A00.A00(r1);
        }
    }
}
