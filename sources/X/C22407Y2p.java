package X;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: X.Y2p  reason: case insensitive filesystem */
public final /* synthetic */ class C22407Y2p implements Runnable {
    public /* synthetic */ CameraCaptureSession.StateCallback A00;
    public /* synthetic */ CameraCaptureSession A01;

    public /* synthetic */ C22407Y2p(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.A00 = stateCallback;
        this.A01 = cameraCaptureSession;
    }

    public final void run() {
        this.A00.onConfigureFailed(this.A01);
    }
}
