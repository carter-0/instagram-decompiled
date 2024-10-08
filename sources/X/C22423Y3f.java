package X;

/* renamed from: X.Y3f  reason: case insensitive filesystem */
public final class C22423Y3f implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass9JH A01;
    public final /* synthetic */ XFW A02;
    public final /* synthetic */ XFV A03;
    public final /* synthetic */ XFT A04;
    public final /* synthetic */ Q2X A05;
    public final /* synthetic */ AnonymousClass6L8 A06;
    public final /* synthetic */ Throwable A07;

    public C22423Y3f(AnonymousClass9JH r1, XFW xfw, XFV xfv, XFT xft, Q2X q2x, AnonymousClass6L8 r6, Throwable th, int i) {
        this.A02 = xfw;
        this.A04 = xft;
        this.A01 = r1;
        this.A06 = r6;
        this.A03 = xfv;
        this.A00 = i;
        this.A05 = q2x;
        this.A07 = th;
    }

    public final void run() {
        XFW xfw = this.A02;
        xfw.A00 = null;
        XFT xft = this.A04;
        AnonymousClass9JH r1 = this.A01;
        AnonymousClass6L8 r6 = this.A06;
        XFT.A00(r1, xfw, this.A03, xft, this.A05, r6, this.A07, this.A00 + 1);
    }
}
