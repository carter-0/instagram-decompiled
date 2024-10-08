package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.XzK  reason: case insensitive filesystem */
public final class C22309XzK implements 2IR {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass9JH A01;
    public final /* synthetic */ XFW A02;
    public final /* synthetic */ Q2X A03;
    public final /* synthetic */ XFY A04;
    public final /* synthetic */ AnonymousClass6L8 A05;
    public final /* synthetic */ AnonymousClass6OE A06;
    public final /* synthetic */ Throwable A07;
    public final /* synthetic */ boolean A08;

    public final void onFailure(Throwable th) {
        Throwable th2 = th;
        0qQ.A0B(th, 0);
        AnonymousClass6OE r10 = this.A06;
        Q2X q2x = this.A03;
        boolean z = this.A08;
        int i = this.A00;
        AnonymousClass9JH r5 = this.A01;
        AnonymousClass6L8 r9 = this.A05;
        XFY xfy = this.A04;
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
            XFB xfb = r10.A02;
            if (i < xfb.A00) {
                long j = xfb.A01;
                if (j > 0) {
                    C22424Y3g y3g = new C22424Y3g(r5, xfw, q2x, xfy, r9, r10, th2, i);
                    xfw.A00 = y3g;
                    r10.A03.A00.postDelayed(y3g, j);
                    return;
                }
                AnonymousClass6OE.A01(r5, xfw, q2x, xfy, r9, r10, th2, i + 1);
                return;
            }
        }
        q2x.DeO(th);
        xfy.A00.A01(th);
    }

    public C22309XzK(AnonymousClass9JH r1, XFW xfw, Q2X q2x, XFY xfy, AnonymousClass6L8 r5, AnonymousClass6OE r6, Throwable th, int i, boolean z) {
        this.A04 = xfy;
        this.A06 = r6;
        this.A03 = q2x;
        this.A08 = z;
        this.A00 = i;
        this.A01 = r1;
        this.A05 = r5;
        this.A02 = xfw;
        this.A07 = th;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        XFY xfy = this.A04;
        if (obj == null) {
            String A002 = Pxd.A00(29);
            0qQ.A0B(A002, 1);
            xfy.A00.A01(new Exception(A002, (Throwable) null));
            return;
        }
        xfy.A00.A00(obj);
    }
}
