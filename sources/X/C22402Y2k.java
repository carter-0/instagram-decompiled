package X;

import android.hardware.camera2.CameraDevice;

/* renamed from: X.Y2k  reason: case insensitive filesystem */
public final /* synthetic */ class C22402Y2k implements Runnable {
    public /* synthetic */ CameraDevice.StateCallback A00;
    public /* synthetic */ CameraDevice A01;

    public /* synthetic */ C22402Y2k(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.A00 = stateCallback;
        this.A01 = cameraDevice;
    }

    public final void run() {
        this.A00.onClosed(this.A01);
    }
}
