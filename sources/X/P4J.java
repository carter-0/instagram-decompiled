package X;

public final class P4J implements C13756TgS {
    public final /* synthetic */ C67484Moe A00;
    public final /* synthetic */ AnonymousClass2Ep A01;
    public final /* synthetic */ boolean A02;

    public P4J(C67484Moe moe, AnonymousClass2Ep r2, boolean z) {
        this.A00 = moe;
        this.A01 = r2;
        this.A02 = z;
    }

    public final void onFailure() {
        OWM owm = OWM.A00;
        C67484Moe moe = this.A00;
        C70734OIr oIr = C67484Moe.A08;
        owm.A01(moe.A02, "inbox", this.A01.C6C());
    }

    public final void onSuccess() {
        C67484Moe moe = this.A00;
        C70734OIr oIr = C67484Moe.A08;
        C74515PwA pwA = moe.A03;
        AnonymousClass2Ep r1 = this.A01;
        pwA.FHL(r1, this.A02);
        OWM.A00.A02(moe.A02, "inbox", r1.C6C());
    }
}
