package X;

public final class WOL implements X6M {
    public final /* synthetic */ C59721JVf A00;
    public final /* synthetic */ VZG A01;
    public final /* synthetic */ X3K A02;
    public final /* synthetic */ String A03;

    public WOL(C59721JVf jVf, VZG vzg, X3K x3k, String str) {
        this.A00 = jVf;
        this.A02 = x3k;
        this.A03 = str;
        this.A01 = vzg;
    }

    public final void DED() {
        VZG vzg = this.A01;
        VVM vvm = vzg.A01;
        VAC.A00(vvm, vvm.A00, "promote_client_token_cleared");
        ((VMZ) vzg.A03.getValue()).A00 = null;
        C18791W1x.A00(this.A00, vzg, this.A02);
    }

    public final void onSuccess() {
        C18791W1x.A02(this.A00, this.A02, this.A03);
    }
}
