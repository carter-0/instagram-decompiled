package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.XFd  reason: case insensitive filesystem */
public final class C21113XFd implements 2IR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass9JH A01;
    public final /* synthetic */ XFW A02;
    public final /* synthetic */ XFV A03;
    public final /* synthetic */ XFT A04;
    public final /* synthetic */ Q2X A05;
    public final /* synthetic */ AnonymousClass6L8 A06;
    public final /* synthetic */ Throwable A07;
    public final /* synthetic */ boolean A08;

    public final void onFailure(Throwable th) {
        Throwable th2 = th;
        0qQ.A0B(th, 0);
        XFT xft = this.A04;
        Q2X q2x = this.A05;
        boolean z = this.A08;
        int i = this.A00;
        AnonymousClass9JH r5 = this.A01;
        AnonymousClass6L8 r10 = this.A06;
        XFV xfv = this.A03;
        XFW xfw = this.A02;
        Throwable th3 = this.A07;
        if (th instanceof CancellationException) {
            q2x.DeE();
            return;
        }
        if (z) {
            q2x.Cjy(i, SG9.A00(th3));
        }
        if (!(th instanceof RJZ)) {
            XFB xfb = xft.A01;
            if (i < xfb.A00) {
                long j = xfb.A01;
                if (j > 0) {
                    C22423Y3f y3f = new C22423Y3f(r5, xfw, xfv, xft, q2x, r10, th2, i);
                    xfw.A00 = y3f;
                    xft.A02.A00.postDelayed(y3f, j);
                    return;
                }
                XFT.A00(r5, xfw, xfv, xft, q2x, r10, th2, i + 1);
                return;
            }
        }
        q2x.DeO(th);
        xfv.A00.A01(th);
    }

    public C21113XFd(AnonymousClass9JH r1, XFW xfw, XFV xfv, XFT xft, Q2X q2x, AnonymousClass6L8 r6, Throwable th, int i, boolean z) {
        this.A03 = xfv;
        this.A08 = z;
        this.A05 = q2x;
        this.A00 = i;
        this.A04 = xft;
        this.A07 = th;
        this.A01 = r1;
        this.A06 = r6;
        this.A02 = xfw;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (obj == null) {
            XFV xfv = this.A03;
            String A002 = Pxd.A00(29);
            0qQ.A0B(A002, 1);
            xfv.A00.A01(new Exception(A002, (Throwable) null));
            return;
        }
        if (this.A08) {
            this.A05.Ck0(this.A00, SG9.A00(this.A07));
        }
        this.A03.A00.A00(obj);
    }
}
