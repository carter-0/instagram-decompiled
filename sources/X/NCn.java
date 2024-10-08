package X;

import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.camera.gen.CameraProxy;

public abstract class NCn extends CameraProxy {
    public abstract CameraApi getApi();

    public abstract boolean isCameraCurrentlyFacingFront();

    public abstract boolean isSwitchCameraFacingSupported();

    public void blankOutAndDisableCamera() {
        getApi().enableCamera(false);
    }
}
