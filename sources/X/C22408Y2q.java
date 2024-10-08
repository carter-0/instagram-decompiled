package X;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: X.Y2q  reason: case insensitive filesystem */
public final /* synthetic */ class C22408Y2q implements Runnable {
    public /* synthetic */ CameraCaptureSession.StateCallback A00;
    public /* synthetic */ CameraCaptureSession A01;

    public /* synthetic */ C22408Y2q(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.A00 = stateCallback;
        this.A01 = cameraCaptureSession;
    }

    public final void run() {
        this.A00.onConfigured(this.A01);
    }
}
