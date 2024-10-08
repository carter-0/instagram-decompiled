package X;

import android.hardware.camera2.CameraDevice;

/* renamed from: X.Y2l  reason: case insensitive filesystem */
public final /* synthetic */ class C22403Y2l implements Runnable {
    public /* synthetic */ CameraDevice.StateCallback A00;
    public /* synthetic */ CameraDevice A01;

    public /* synthetic */ C22403Y2l(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.A00 = stateCallback;
        this.A01 = cameraDevice;
    }

    public final void run() {
        this.A00.onOpened(this.A01);
    }
}
