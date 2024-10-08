package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import java.util.HashSet;
import java.util.concurrent.Callable;

/* renamed from: X.Arx  reason: case insensitive filesystem */
public final /* synthetic */ class C41317Arx implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C340777lo A01;

    public /* synthetic */ C41317Arx(C340777lo r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final Object call() {
        C340777lo r2 = this.A01;
        int i = this.A00;
        r2.A02.A06("Number of cameras must be loaded on background thread.");
        HashSet A1F = AnonymousClass7TE.A1F();
        CameraManager cameraManager = r2.A01;
        cameraManager.getClass();
        int i2 = 0;
        for (String cameraCharacteristics : cameraManager.getCameraIdList()) {
            CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(cameraCharacteristics);
            Number number = (Number) cameraCharacteristics2.get(CameraCharacteristics.LENS_FACING);
            if (number != null) {
                int intValue = number.intValue();
                int i3 = 1;
                if (intValue == 1) {
                    i3 = 0;
                }
                if (i3 == i) {
                    A1F.addAll(cameraCharacteristics2.getPhysicalCameraIds());
                    i2++;
                }
            }
        }
        if (!A1F.isEmpty()) {
            i2 = A1F.size();
        }
        return Integer.valueOf(i2);
    }
}
