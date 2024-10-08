package X;

import java.util.concurrent.Executor;

public final class XFU implements C13503TbU {
    public final /* synthetic */ AnonymousClass9JH A00;
    public final /* synthetic */ XFT A01;
    public final /* synthetic */ Q2X A02;
    public final /* synthetic */ C379629Uq A03;
    public final /* synthetic */ AnonymousClass6L8 A04;

    public XFU(AnonymousClass9JH r1, XFT xft, Q2X q2x, C379629Uq r4, AnonymousClass6L8 r5) {
        this.A01 = xft;
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = q2x;
    }

    public final /* bridge */ /* synthetic */ Object ACq(Q2R q2r) {
        XFT xft = this.A01;
        AnonymousClass9JH r2 = this.A00;
        AnonymousClass6L8 r7 = this.A04;
        XFV xfv = new XFV(q2r);
        Q2Q q2q = new Q2Q(0sr.A1P(new Q2X[]{this.A03, this.A02}));
        XFW xfw = new XFW(xft.A02);
        XFT.A00(r2, xfw, xfv, xft, q2q, r7, (Throwable) null, 0);
        C21112XFc xFc = new C21112XFc(xfw);
        Executor executor = xft.A03;
        AnonymousClass5AD r0 = q2r.A01;
        if (r0 != null) {
            r0.addListener(xFc, executor);
        }
        return C60340gF.A00;
    }
}
