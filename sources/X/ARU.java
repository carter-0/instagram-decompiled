package X;

import android.graphics.Bitmap;

public final class ARU implements C41809B1o {
    public final /* synthetic */ C39749A7p A00;

    public ARU(C39749A7p a7p) {
        this.A00 = a7p;
    }

    public final void CyH(Bitmap bitmap) {
        C18417VrM vrM = this.A00.A04;
        C15331Uag uag = vrM.A00;
        uag.A02().A02(C16612Uy8.PHOTO_CAPTURE_SUCCESS, "", (String) null);
        String str = uag.A0H;
        if (str == null) {
            0qQ.A0F("effectId");
            throw AnonymousClass00P.createAndThrow();
        }
        C18417VrM.A00(vrM, str);
        AnonymousClass7TE.A1Z(new MGZ((Object) bitmap, (Object) uag, (AnonymousClass4D7) null, 9), uag.A0N);
    }

    public final void D0x(Exception exc) {
        this.A00.A04.A00.A02().A02(C16612Uy8.PHOTO_CAPTURE_ERROR, "CAPTURE", String.valueOf(exc));
    }
}
