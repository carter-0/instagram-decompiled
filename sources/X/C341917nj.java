package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7nj  reason: invalid class name and case insensitive filesystem */
public final class C341917nj implements C341897nh {
    public final /* synthetic */ void EOp(HashMap hashMap) {
    }

    public final /* synthetic */ List addArSurfaces(List list) {
        return list;
    }

    public final /* synthetic */ void closeSession() {
    }

    public final /* synthetic */ void createSession(CameraDevice cameraDevice, int i) {
    }

    public final /* synthetic */ void onCameraClosed(CameraDevice cameraDevice) {
    }

    public final /* synthetic */ void onCameraDisconnected(CameraDevice cameraDevice) {
    }

    public final /* synthetic */ void onCameraError(CameraDevice cameraDevice, int i) {
    }

    public final /* synthetic */ void setCameraSessionActivated(C343297pz r1, C343187po r2) {
    }

    public final /* synthetic */ void setUseArCoreIfSupported(boolean z) {
    }

    public final /* synthetic */ void update() {
    }

    public final /* synthetic */ CameraCaptureSession.StateCallback wrapSessionConfigurationCallback(CameraCaptureSession.StateCallback stateCallback) {
        return stateCallback;
    }

    public final /* synthetic */ boolean CO8() {
        return false;
    }

    public final /* synthetic */ long getFrameTimestamp() {
        return 0;
    }

    public final /* synthetic */ Surface getPreviewSurface(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    public final /* synthetic */ int getPreviewTemplate() {
        return 1;
    }

    public final /* synthetic */ boolean getUseArCoreIfSupported() {
        return false;
    }

    public final /* synthetic */ boolean isARCoreEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isARCoreSupported() {
        return false;
    }

    public final /* synthetic */ boolean isCameraSessionActivated() {
        return false;
    }

    public final /* synthetic */ List getArSurfaces() {
        return Collections.emptyList();
    }

    public final /* synthetic */ SurfaceTexture getArSurfaceTexture(int i, Y9N y9n) {
        return null;
    }
}
