package X;

/* renamed from: X.S2r  reason: case insensitive filesystem */
public final class C10959S2r {
    public int A00;
    public int A01;
    public C10643Rvc A02;
    public C10643Rvc A03;
    public final C10331RqU A04 = new Object();

    public final void A00() {
        while (true) {
            C10643Rvc rvc = this.A03;
            if (rvc != null) {
                this.A03 = rvc.A01;
                C10331RqU rqU = this.A04;
                rvc.A01 = rqU.A00;
                rqU.A00 = rvc;
            } else {
                this.A02 = null;
                this.A01 = 0;
                this.A00 = 0;
                return;
            }
        }
    }
}
