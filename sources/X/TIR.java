package X;

public final class TIR implements Runnable {
    public final /* synthetic */ AnonymousClass07Z A00;
    public final /* synthetic */ 2Fk A01;
    public final /* synthetic */ C7580QKv A02;

    public TIR(AnonymousClass07Z r1, 2Fk r2, C7580QKv qKv) {
        this.A02 = qKv;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C7580QKv qKv = this.A02;
        AnonymousClass2gO r0 = qKv.A04;
        if (r0 != null) {
            2Fk r2 = this.A01;
            r2.A08(r0);
            r2.A06(this.A00, qKv.A04);
        }
    }
}
