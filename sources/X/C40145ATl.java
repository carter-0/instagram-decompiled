package X;

import android.graphics.Bitmap;

/* renamed from: X.ATl  reason: case insensitive filesystem */
public final class C40145ATl implements B2S {
    public final /* synthetic */ C344477rv A00;
    public final /* synthetic */ C39769A8j A01;
    public final /* synthetic */ C40139ATf A02;

    public final void CyI(Bitmap bitmap, long j) {
        this.A00.BQ8().EDi(0, this.A02);
        C39769A8j a8j = this.A01;
        XBR xbr = a8j.A00;
        xbr.D15(bitmap, "BasicPhotoCaptureCoordinator");
        C363808kN.A01(a8j.A01.A00, "BasicPhotoCaptureCoordinator", a8j.hashCode());
        xbr.D11();
    }

    public final void DCn(Exception exc) {
        this.A00.BQ8().EDi(0, this.A02);
        this.A01.A00(new C391719tX(10015, (Throwable) exc));
    }

    public final void DJq() {
    }

    public C40145ATl(C344477rv r1, C39769A8j a8j, C40139ATf aTf) {
        this.A01 = a8j;
        this.A00 = r1;
        this.A02 = aTf;
    }
}
