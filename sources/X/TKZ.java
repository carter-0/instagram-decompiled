package X;

public final class TKZ implements Runnable {
    public final /* synthetic */ SR5 A00;
    public final /* synthetic */ RQD A01;
    public final /* synthetic */ QDE A02;
    public final /* synthetic */ C13735Tg7 A03;
    public final /* synthetic */ C10440RsH A04;
    public final /* synthetic */ C11330SNj A05;

    public TKZ(SR5 sr5, RQD rqd, QDE qde, C13735Tg7 tg7, C10440RsH rsH, C11330SNj sNj) {
        this.A02 = qde;
        this.A01 = rqd;
        this.A04 = rsH;
        this.A03 = tg7;
        this.A00 = sr5;
        this.A05 = sNj;
    }

    public final void run() {
        QDE qde = this.A02;
        AnonymousClass2gB A002 = TPM.A00(qde.A06.A04(this.A01, Pxi.A0J(this.A04.A01)), qde, 3);
        A002.A09(new C11648Sdq(14, (Object) A002, (Object) this));
    }
}
