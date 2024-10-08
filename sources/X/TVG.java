package X;

import android.hardware.camera2.CameraManager;

public final class TVG extends 0Yg implements C62320sa {
    public static final TVG A00 = new TVG();

    public TVG() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        CameraManager cameraManager;
        String[] cameraIdList;
        Object systemService = C60960kU.A00.getSystemService("camera");
        if (systemService instanceof CameraManager) {
            cameraManager = (CameraManager) systemService;
        } else {
            cameraManager = null;
        }
        boolean z = false;
        if (cameraManager != null && (cameraIdList = cameraManager.getCameraIdList()) != null) {
            int length = cameraIdList.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str = cameraIdList[i];
                0qQ.A0A(str);
                if (SUE.A08(cameraManager, str)) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }
}
