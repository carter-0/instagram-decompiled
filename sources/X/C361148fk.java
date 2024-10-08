package X;

/* renamed from: X.8fk  reason: invalid class name and case insensitive filesystem */
public final class C361148fk implements Runnable {
    public final /* synthetic */ C360668ex A00;
    public final /* synthetic */ C268654dm A01;

    public C361148fk(C360668ex r1, C268654dm r2) {
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
