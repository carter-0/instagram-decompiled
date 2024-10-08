package X;

public final class WOK implements X6M {
    public final /* synthetic */ C59721JVf A00;
    public final /* synthetic */ VZG A01;
    public final /* synthetic */ X3K A02;

    public WOK(C59721JVf jVf, VZG vzg, X3K x3k) {
        this.A01 = vzg;
        this.A00 = jVf;
        this.A02 = x3k;
    }

    public final void DED() {
        VZG vzg = this.A01;
        VVM vvm = vzg.A01;
        VAC.A00(vvm, vvm.A00, "promote_client_token_cleared");
        ((VMZ) vzg.A03.getValue()).A00 = null;
        this.A02.DfU(C15417UcT.A00);
    }

    public final void onSuccess() {
        C18791W1x.A01(this.A00, this.A01, this.A02);
    }
}
