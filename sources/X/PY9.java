package X;

public final class PY9 implements Runnable {
    public final /* synthetic */ C71087ObS A00;
    public final /* synthetic */ AnonymousClass9GD A01;

    public PY9(C71087ObS obS, AnonymousClass9GD r2) {
        this.A01 = r2;
        this.A00 = obS;
    }

    public final void run() {
        Object A0u;
        AnonymousClass9GD r2 = this.A01;
        boolean A0E = r2.A0E();
        C71087ObS obS = this.A00;
        if (A0E) {
            A0u = r2.A06();
        } else {
            A0u = AnonymousClass7TE.A0u();
        }
        obS.A05(A0u);
    }
}
