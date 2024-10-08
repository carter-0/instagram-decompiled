package X;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import com.google.ar.core.SharedCamera;

public final class XFs extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ CameraCaptureSession.StateCallback A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ SharedCamera A02;

    public XFs(CameraCaptureSession.StateCallback stateCallback, Handler handler, SharedCamera sharedCamera) {
        this.A02 = sharedCamera;
        this.A01 = handler;
        this.A00 = stateCallback;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.A01.post(new C22404Y2m(this.A00, cameraCaptureSession));
        SharedCamera.A02(cameraCaptureSession, this.A02);
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.A01.post(new C22405Y2n(this.A00, cameraCaptureSession));
        SharedCamera.A03(cameraCaptureSession, this.A02);
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.A01.post(new C22407Y2p(this.A00, cameraCaptureSession));
        SharedCamera.A04(cameraCaptureSession, this.A02);
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        SharedCamera sharedCamera = this.A02;
        this.A01.post(new C22408Y2q(this.A00, cameraCaptureSession));
        SharedCamera.A05(cameraCaptureSession, sharedCamera);
        if (sharedCamera.A02.A01 != null) {
            SharedCamera.A0A(sharedCamera);
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.A01.post(new C22406Y2o(this.A00, cameraCaptureSession));
        SharedCamera.A06(cameraCaptureSession, this.A02);
    }
}
