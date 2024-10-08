package X;

public final class THR implements Runnable {
    public final /* synthetic */ Q4D A00;
    public final /* synthetic */ C268654dm A01;

    public THR(Q4D q4d, C268654dm r2) {
        this.A00 = q4d;
        this.A01 = r2;
    }

    public final void run() {
        try {
            Object A002 = this.A01.A00();
            0qQ.A0A(A002);
            Q4D.A00((Q4E) A002);
        } catch (Exception unused) {
        }
        Throwable A012 = this.A01.A01();
        if (A012 == null) {
            A012 = DbW.A0c("Network failure for ", this.A00.A01);
        }
        this.A00.A00.A01(new C7313Q3p(), A012);
    }
}
