package X;

/* renamed from: X.Y3g  reason: case insensitive filesystem */
public final class C22424Y3g implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass9JH A01;
    public final /* synthetic */ XFW A02;
    public final /* synthetic */ Q2X A03;
    public final /* synthetic */ XFY A04;
    public final /* synthetic */ AnonymousClass6L8 A05;
    public final /* synthetic */ AnonymousClass6OE A06;
    public final /* synthetic */ Throwable A07;

    public C22424Y3g(AnonymousClass9JH r1, XFW xfw, Q2X q2x, XFY xfy, AnonymousClass6L8 r5, AnonymousClass6OE r6, Throwable th, int i) {
        this.A02 = xfw;
        this.A06 = r6;
        this.A01 = r1;
        this.A05 = r5;
        this.A04 = xfy;
        this.A00 = i;
        this.A03 = q2x;
        this.A07 = th;
    }

    public final void run() {
        XFW xfw = this.A02;
        xfw.A00 = null;
        AnonymousClass6OE r6 = this.A06;
        AnonymousClass9JH r1 = this.A01;
        AnonymousClass6L8 r5 = this.A05;
        AnonymousClass6OE.A01(r1, xfw, this.A03, this.A04, r5, r6, this.A07, this.A00 + 1);
    }
}
