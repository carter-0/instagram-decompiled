package X;

public final class Q0N implements Runnable {
    public final /* synthetic */ Q0M A00;
    public final /* synthetic */ AnonymousClass60p A01;

    public Q0N(Q0M q0m, AnonymousClass60p r2) {
        this.A01 = r2;
        this.A00 = q0m;
    }

    public final void run() {
        AnonymousClass60p r2 = this.A01;
        if (r2.A0F.getAndSet(false)) {
            C13709TfW tfW = r2.A01;
            if (tfW != null) {
                tfW.DCf(this.A00);
            }
            AnonymousClass60p.A01(r2);
        }
    }
}
