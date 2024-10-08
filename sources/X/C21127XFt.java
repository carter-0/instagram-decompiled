package X;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import com.google.ar.core.SharedCamera;

/* renamed from: X.XFt  reason: case insensitive filesystem */
public final class C21127XFt extends CameraDevice.StateCallback {
    public final /* synthetic */ CameraDevice.StateCallback A00;
    public final /* synthetic */ Handler A01;
    public final /* synthetic */ SharedCamera A02;

    public C21127XFt(CameraDevice.StateCallback stateCallback, Handler handler, SharedCamera sharedCamera) {
        this.A02 = sharedCamera;
        this.A01 = handler;
        this.A00 = stateCallback;
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.A01.post(new C22402Y2k(this.A00, cameraDevice));
        SharedCamera.A07(cameraDevice, this.A02);
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.A01.post(new C22401Y2j(this.A00, cameraDevice));
        SharedCamera.A08(cameraDevice, this.A02);
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        AnonymousClass0fJ r0 = AnonymousClass0fJ.$redex_init_class;
        if (0BU.A04()) {
            0BU.A02(cameraDevice);
        }
        this.A01.post(new Y3Q(this.A00, cameraDevice, i));
        SharedCamera sharedCamera = this.A02;
        sharedCamera.A00.removeCallbacksAndMessages((Object) null);
        sharedCamera.A00.getLooper().quit();
        sharedCamera.A00 = null;
    }

    public final void onOpened(CameraDevice cameraDevice) {
        AnonymousClass0fJ r0 = AnonymousClass0fJ.$redex_init_class;
        if (0BU.A04()) {
            0BU.A03(cameraDevice);
        }
        SharedCamera sharedCamera = this.A02;
        XnA xnA = sharedCamera.A02;
        xnA.A01 = cameraDevice;
        this.A01.post(new C22403Y2l(this.A00, cameraDevice));
        SharedCamera.A09(cameraDevice, sharedCamera);
        xnA.A00 = SharedCamera.A00(sharedCamera);
        xnA.A02 = SharedCamera.A01(sharedCamera);
    }
}
