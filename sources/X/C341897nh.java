package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.view.Surface;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.7nh  reason: invalid class name and case insensitive filesystem */
public interface C341897nh {
    public static final C341907ni A00 = new Object();
    public static final C341897nh A01 = new C341917nj();

    boolean CO8();

    void EOp(HashMap hashMap);

    List addArSurfaces(List list);

    void closeSession();

    void createSession(CameraDevice cameraDevice, int i);

    SurfaceTexture getArSurfaceTexture(int i, Y9N y9n);

    List getArSurfaces();

    long getFrameTimestamp();

    Surface getPreviewSurface(SurfaceTexture surfaceTexture);

    int getPreviewTemplate();

    boolean getUseArCoreIfSupported();

    boolean isARCoreEnabled();

    boolean isARCoreSupported();

    boolean isCameraSessionActivated();

    void onCameraClosed(CameraDevice cameraDevice);

    void onCameraDisconnected(CameraDevice cameraDevice);

    void onCameraError(CameraDevice cameraDevice, int i);

    void setCameraSessionActivated(C343297pz r1, C343187po r2);

    void setUseArCoreIfSupported(boolean z);

    void update();

    CameraCaptureSession.StateCallback wrapSessionConfigurationCallback(CameraCaptureSession.StateCallback stateCallback);
}
