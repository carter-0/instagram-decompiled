package X;

import com.instagram.camera.capture.IgCameraFocusView;

/* renamed from: X.7ky  reason: invalid class name and case insensitive filesystem */
public final class C340257ky extends C232922uf {
    public final /* synthetic */ IgCameraFocusView A00;

    public final void DmE(2cs r7) {
        0qQ.A0B(r7, 0);
        IgCameraFocusView igCameraFocusView = this.A00;
        float f = igCameraFocusView.A02;
        igCameraFocusView.A00 = (2.0f * f) - (((float) r7.A09.A00) * f);
        igCameraFocusView.invalidate();
    }

    public C340257ky(IgCameraFocusView igCameraFocusView) {
        this.A00 = igCameraFocusView;
    }

    public final void DmC(2cs r6) {
        IgCameraFocusView igCameraFocusView = this.A00;
        igCameraFocusView.A01 = false;
        igCameraFocusView.A04.A08(0.0d, true);
        igCameraFocusView.invalidate();
    }
}
