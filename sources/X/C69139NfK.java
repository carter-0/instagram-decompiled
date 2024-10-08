package X;

import com.facebook.rsys.camera.gen.Camera;
import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.camera.gen.CameraProxy;
import java.util.ArrayList;

/* renamed from: X.NfK  reason: case insensitive filesystem */
public final class C69139NfK extends NCn {
    public CameraApi A00;
    public final CameraProxy A01;

    public final boolean isCameraCurrentlyFacingFront() {
        return false;
    }

    public final boolean isSwitchCameraFacingSupported() {
        return false;
    }

    public final void setApi(CameraApi cameraApi) {
        0qQ.A0B(cameraApi, 0);
        this.A00 = cameraApi;
        this.A01.setApi(cameraApi);
    }

    public final ArrayList createAvailableCameras() {
        ArrayList createAvailableCameras = this.A01.createAvailableCameras();
        0qQ.A07(createAvailableCameras);
        return createAvailableCameras;
    }

    public final CameraApi getApi() {
        CameraApi cameraApi = this.A00;
        if (cameraApi != null) {
            return cameraApi;
        }
        throw AnonymousClass7TE.A0z("setApi must be called");
    }

    public final void release() {
        this.A01.release();
    }

    public final void setCamera(Camera camera) {
        this.A01.setCamera(camera);
    }

    public final void setCameraMode(int i) {
        this.A01.setCameraMode(i);
    }

    public final void setCameraOn(boolean z, int i) {
        this.A01.setCameraOn(z, i);
    }

    public final void setTargetCaptureResolution(int i, int i2) {
        this.A01.setTargetCaptureResolution(i, i2);
    }

    public final int setTargetCaptureSettings(int i, int i2, int i3) {
        return this.A01.setTargetCaptureSettings(i, i2, i3);
    }

    public final void setTargetFps(int i) {
        this.A01.setTargetFps(i);
    }

    public C69139NfK(CameraProxy cameraProxy) {
        this.A01 = cameraProxy;
    }
}
