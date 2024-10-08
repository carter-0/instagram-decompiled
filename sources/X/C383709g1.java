package X;

import com.facebook.rsys.camera.gen.CameraStallHandler;
import com.instagram.rtc.rsys.camera.IgLiteCameraProxy;

/* renamed from: X.9g1  reason: invalid class name and case insensitive filesystem */
public final class C383709g1 extends CameraStallHandler {
    public final /* synthetic */ IgLiteCameraProxy A00;

    public C383709g1(IgLiteCameraProxy igLiteCameraProxy) {
        this.A00 = igLiteCameraProxy;
    }

    public final void onCameraStallDetected() {
        C71004OWb.A00.A00("IgLiteCameraProxy", "Camera Stall Detected");
        IgLiteCameraProxy igLiteCameraProxy = this.A00;
        igLiteCameraProxy.A03().pause();
        igLiteCameraProxy.A03().EIx();
    }

    public final void onCameraStallRecovered() {
        C71004OWb.A00.A00("IgLiteCameraProxy", "Camera Stall Recovered");
    }
}
