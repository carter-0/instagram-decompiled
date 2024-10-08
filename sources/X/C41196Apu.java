package X;

/* renamed from: X.Apu  reason: case insensitive filesystem */
public final class C41196Apu implements Runnable {
    public final /* synthetic */ A7O A00;
    public final /* synthetic */ C41809B1o A01;
    public final /* synthetic */ AH4 A02;
    public final /* synthetic */ boolean A03;

    public C41196Apu(A7O a7o, C41809B1o b1o, AH4 ah4, boolean z) {
        this.A02 = ah4;
        this.A03 = z;
        this.A00 = a7o;
        this.A01 = b1o;
    }

    public final void run() {
        AH4 ah4 = this.A02;
        ah4.A0B.EF6((Long) null);
        boolean z = this.A03;
        C40161AUb aUb = ah4.A09;
        A7O a7o = this.A00;
        C41809B1o b1o = this.A01;
        if (z) {
            C40089AQu aQu = new C40089AQu(b1o, ah4);
            A3F a3f = new A3F(b1o);
            aUb.ACk("LiteCameraController must be initialized before taking photo.");
            ((C345677tu) aUb.A00.Ape(C345677tu.A00)).EzW(a7o, aQu, a3f);
            return;
        }
        aUb.A06(a7o, new C40090AQv(b1o, ah4));
    }
}
