package X;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: X.Y2n  reason: case insensitive filesystem */
public final /* synthetic */ class C22405Y2n implements Runnable {
    public /* synthetic */ CameraCaptureSession.StateCallback A00;
    public /* synthetic */ CameraCaptureSession A01;

    public /* synthetic */ C22405Y2n(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.A00 = stateCallback;
        this.A01 = cameraCaptureSession;
    }

    public final void run() {
        this.A00.onClosed(this.A01);
    }
}
