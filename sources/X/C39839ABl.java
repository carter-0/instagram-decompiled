package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.Map;

/* renamed from: X.ABl  reason: case insensitive filesystem */
public abstract class C39839ABl {
    public static final Map A00 = AnonymousClass7TE.A1E();

    public static CameraExtensionCharacteristics A00(CameraManager cameraManager, String str) {
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        Map map = A00;
        CameraExtensionCharacteristics cameraExtensionCharacteristics = (CameraExtensionCharacteristics) map.get(str);
        if (cameraExtensionCharacteristics != null) {
            return cameraExtensionCharacteristics;
        }
        try {
            cameraManager.getClass();
            CameraExtensionCharacteristics cameraExtensionCharacteristics2 = cameraManager.getCameraExtensionCharacteristics(str);
            map.put(str, cameraExtensionCharacteristics2);
            return cameraExtensionCharacteristics2;
        } catch (CameraAccessException e) {
            throw new RuntimeException(002.A0R("Could not get Camera Extension Characteristics for Camera ID: ", str), e);
        }
    }
}
