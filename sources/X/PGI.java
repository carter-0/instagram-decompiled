package X;

public final class PGI implements C3270679g {
    public final /* synthetic */ C72579PBk A00;
    public final /* synthetic */ NYI A01;

    public PGI(C72579PBk pBk, NYI nyi) {
        this.A00 = pBk;
        this.A01 = nyi;
    }

    public final void D9s() {
        C72579PBk pBk = this.A00;
        AnonymousClass7DU r1 = pBk.A00;
        if (r1 != null) {
            r1.DA8(this.A01, pBk);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
