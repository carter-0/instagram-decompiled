package X;

import android.hardware.camera2.CameraDevice;

/* renamed from: X.Y2j  reason: case insensitive filesystem */
public final /* synthetic */ class C22401Y2j implements Runnable {
    public /* synthetic */ CameraDevice.StateCallback A00;
    public /* synthetic */ CameraDevice A01;

    public /* synthetic */ C22401Y2j(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.A00 = stateCallback;
        this.A01 = cameraDevice;
    }

    public final void run() {
        this.A00.onDisconnected(this.A01);
    }
}
