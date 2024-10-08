package X;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import com.facebook.rsys.camera.gen.Camera;
import java.util.ArrayList;

public final class ADX {
    public static final ADX A00 = new Object();

    public final ArrayList A00(Context context) {
        Camera camera;
        C340277l0 r1;
        0qQ.A0B(context, 0);
        try {
            ArrayList arrayList = new ArrayList(2);
            if (AnonymousClass4x4.A00(context, false)) {
                r1 = C340277l0.CAMERA2;
            } else {
                r1 = C340277l0.CAMERA1;
            }
            C340607lX r12 = C340587lV.A00(context, (Handler) null, r1, false).A07;
            if (r12.CJf(1)) {
                arrayList.add(Camera.FRONT_FACING_CAMERA);
            }
            if (!r12.CJf(0)) {
                return arrayList;
            }
            arrayList.add(Camera.BACK_FACING_CAMERA);
            return arrayList;
        } catch (CameraAccessException e) {
            0wb.A03("CameraProxyUtil", AnonymousClass7TF.A0m("Exception while creating available cameras for camera proxy. Error: ", e));
            try {
                Object systemService = context.getSystemService("camera");
                0qQ.A0C(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                CameraManager cameraManager = (CameraManager) systemService;
                String[] cameraIdList = cameraManager.getCameraIdList();
                0qQ.A07(cameraIdList);
                ArrayList arrayList2 = new ArrayList(r4);
                for (String cameraCharacteristics : cameraIdList) {
                    Number number = (Number) cameraManager.getCameraCharacteristics(cameraCharacteristics).get(CameraCharacteristics.LENS_FACING);
                    if (number == null || number.intValue() != 1) {
                        camera = Camera.BACK_FACING_CAMERA;
                    } else {
                        camera = Camera.FRONT_FACING_CAMERA;
                    }
                    arrayList2.add(camera);
                }
                return AnonymousClass7TE.A1D(arrayList2);
            } catch (CameraAccessException e2) {
                0wb.A03("CameraProxyUtil", AnonymousClass7TF.A0m("Exception while creating available cameras for camera proxy. Error: ", e2));
                return AnonymousClass7TE.A1C();
            }
        }
    }
}
