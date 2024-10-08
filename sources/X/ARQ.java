package X;

public final class ARQ implements MTK {
    public final /* synthetic */ AH4 A00;

    public ARQ(AH4 ah4) {
        this.A00 = ah4;
    }

    public final void DoC(C39672A4m a4m) {
        AH4 ah4 = this.A00;
        String str = ah4.A0I;
        0qQ.A0B(str, 0);
        C352718Eo r1 = new C352718Eo();
        r1.A05 = AnonymousClass7TF.A0c();
        r1.A03 = str;
        C352728Ep A002 = r1.A00();
        B2N b2n = ah4.A03;
        if (b2n != null) {
            b2n.DjR(A002);
        }
        ah4.A07.EUn(a4m.A00, ah4.A06, new C40093AQy(ah4), A002, a4m.A01);
    }

    public final void onFailure(Exception exc) {
        B2N b2n = this.A00.A03;
        if (b2n != null) {
            b2n.onFailure(exc);
        }
    }
}
