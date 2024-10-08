package X;

import com.instagram.ui.widget.shutterbutton.ShutterButton;

public final class A8M {
    public final /* synthetic */ C39749A7p A00;

    public A8M(C39749A7p a7p) {
        this.A00 = a7p;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void A00(Exception exc) {
        C15331Uag uag = this.A00.A04.A00;
        uag.A02().A02(C16612Uy8.VIDEO_CAPTURE_ERROR, "CAPTURE", String.valueOf(exc));
        C17667Vby vby = uag.A06;
        if (vby == null) {
            0qQ.A0F("preCaptureUIController");
            throw AnonymousClass00P.createAndThrow();
        }
        ShutterButton shutterButton = vby.A01;
        if (shutterButton != null) {
            shutterButton.DnW("ar_ads");
        }
        ShutterButton shutterButton2 = vby.A01;
        if (shutterButton2 != null) {
            shutterButton2.setInnerCircleAlpha(0.0f);
        }
        AnonymousClass7TF.A16(vby.A00);
    }
}
