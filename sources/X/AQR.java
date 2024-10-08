package X;

public final class AQR implements C371478yM {
    public final /* synthetic */ C371518yX A00;
    public final /* synthetic */ C41808B1n A01;
    public final /* synthetic */ C380699Ze A02;
    public final /* synthetic */ String A03;

    public final void DEV(C8993RKl rKl) {
        0qQ.A0B(rKl, 0);
        this.A01.Css(this.A03, rKl);
    }

    public AQR(C371518yX r1, C41808B1n b1n, C380699Ze r3, String str) {
        this.A00 = r1;
        this.A01 = b1n;
        this.A03 = str;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C371458yK r4 = (C371458yK) obj;
        if (r4 != null) {
            C371518yX r2 = this.A00;
            C371518yX r1 = r4.A04;
            r1.A00 = r2.A00;
            r1.A03 = r2.A03;
            r1.A02 = r2.A02;
            r1.A01 = r2.A01;
        }
        this.A01.Cst(this.A03);
        this.A02.A0A(r4);
    }
}
