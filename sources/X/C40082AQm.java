package X;

/* renamed from: X.AQm  reason: case insensitive filesystem */
public final class C40082AQm implements C341737nR {
    public final /* synthetic */ AD9 A00;
    public final /* synthetic */ C41827B2i A01;
    public final /* synthetic */ B16 A02;
    public final /* synthetic */ C341627nG A03;

    public C40082AQm(AD9 ad9, C41827B2i b2i, B16 b16, C341627nG r4) {
        this.A03 = r4;
        this.A02 = b16;
        this.A00 = ad9;
        this.A01 = b2i;
    }

    public final void onError(Throwable th) {
        C341627nG r1 = this.A03;
        r1.A0A = this.A01;
        r1.A04(new C382309dU(th));
        this.A02.onFinished();
    }

    public final void onSuccess() {
        this.A03.A05(this.A00, this.A01, this.A02);
    }
}
