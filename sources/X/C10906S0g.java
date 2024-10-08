package X;

/* renamed from: X.S0g  reason: case insensitive filesystem */
public final class C10906S0g {
    public final /* synthetic */ SQn A00;

    public C10906S0g(SQn sQn) {
        this.A00 = sQn;
    }

    public final void A00(RDH rdh) {
        SQn sQn = this.A00;
        synchronized (sQn) {
            sQn.A01 = rdh;
            sQn.A03 = false;
        }
    }
}
