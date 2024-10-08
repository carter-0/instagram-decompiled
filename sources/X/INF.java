package X;

public final class INF implements C51897G6n {
    public final /* synthetic */ ILM A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public final void onSuccess() {
    }

    public INF(ILM ilm, String str, String str2, String str3, boolean z) {
        this.A04 = z;
        this.A00 = ilm;
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    public final void onFailure(Throwable th) {
        boolean z = this.A04;
        ILM ilm = this.A00;
        if (z) {
            ilm.A02.invoke(new C64512LdE(this.A01, this.A03, this.A02, false));
            return;
        }
        ilm.A00.CqD(this.A01, ilm.A01.getModuleName(), this.A03, this.A02);
    }
}
