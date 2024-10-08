package X;

import android.graphics.Bitmap;

/* renamed from: X.AQu  reason: case insensitive filesystem */
public final class C40089AQu implements B3L {
    public final /* synthetic */ C41809B1o A00;
    public final /* synthetic */ AH4 A01;

    public final void CyH(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        AH4.A00(this.A01);
        this.A00.CyH(bitmap);
    }

    public final void D0x(Exception exc) {
        0qQ.A0B(exc, 0);
        AH4.A00(this.A01);
        this.A00.D0x(exc);
    }

    public C40089AQu(C41809B1o b1o, AH4 ah4) {
        this.A01 = ah4;
        this.A00 = b1o;
    }

    public final void D0v() {
        AH4.A00(this.A01);
        ((ARU) this.A00).A00.A04.A00.A02().A02(C16612Uy8.PHOTO_CAPTURE_ERROR, "CAPTURE", "onCaptureCancelled");
    }
}
