package X;

public final /* synthetic */ class Y2L implements Runnable {
    public final /* synthetic */ C22041XuP A00;
    public final /* synthetic */ C21491Xci A01;

    public /* synthetic */ Y2L(C22041XuP xuP, C21491Xci xci) {
        this.A00 = xuP;
        this.A01 = xci;
    }

    public final void run() {
        try {
            C22041XuP.A08(this.A01);
        } catch (XGY e) {
            STH.A04("ExoPlayerImplInternal", AnonymousClass000.A00(1045), e);
            throw new RuntimeException(e);
        }
    }
}
