package X;

import android.hardware.camera2.CameraDevice;

public final /* synthetic */ class Y3Q implements Runnable {
    public /* synthetic */ int A00;
    public /* synthetic */ CameraDevice.StateCallback A01;
    public /* synthetic */ CameraDevice A02;

    public /* synthetic */ Y3Q(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice, int i) {
        this.A01 = stateCallback;
        this.A02 = cameraDevice;
        this.A00 = i;
    }

    public final void run() {
        this.A01.onError(this.A02, this.A00);
    }
}
