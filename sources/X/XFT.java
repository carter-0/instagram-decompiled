package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class XFT extends XFZ {
    public final SG9 A00;
    public final XFB A01;
    public final XFC A02;
    public final Executor A03;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.SG9, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XFT(XFB xfb, AnonymousClass6OF r4, Executor executor) {
        super(r4);
        0qQ.A0B(executor, 3);
        ? obj = new Object();
        XFC xfc = new XFC();
        this.A01 = xfb;
        this.A03 = executor;
        this.A00 = obj;
        this.A02 = xfc;
    }

    public static final void A00(AnonymousClass9JH r12, XFW xfw, XFV xfv, XFT xft, Q2X q2x, AnonymousClass6L8 r17, Throwable th, int i) {
        boolean z;
        XFT xft2 = xft;
        Q2X q2x2 = q2x;
        Throwable th2 = th;
        int i2 = i;
        if (i > 0) {
            z = true;
            q2x2.Cjz(SG9.A00(th2), xft.A00.A01(th2), i2);
        } else {
            z = false;
            q2x2.Dei();
        }
        AnonymousClass6L8 r8 = r17;
        ListenableFuture AUj = xft.A00.AUj(r12, q2x2, r8);
        0qQ.A0B(AUj, 0);
        xfw.A01.add(AUj);
        C255183ti.A04(new C21113XFd(r12, xfw, xfv, xft2, q2x2, r8, th2, i2, z), AUj, xft.A03);
    }

    public final ListenableFuture AUj(AnonymousClass9JH r8, Q2X q2x, AnonymousClass6L8 r10) {
        AnonymousClass9JH r2 = r8;
        AnonymousClass6L8 r6 = r10;
        AnonymousClass7TG.A1N(r8, r10);
        XFB xfb = this.A01;
        Q2X q2x2 = q2x;
        if (!xfb.A02 || xfb.A00 <= 0) {
            return this.A00.AUj(r8, q2x, r10);
        }
        return Q2T.A00(new XFU(r2, this, q2x2, new C379629Uq(r10), r6));
    }
}
