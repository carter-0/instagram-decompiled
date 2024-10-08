package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.7py  reason: invalid class name and case insensitive filesystem */
public final class C343287py implements C343297pz {
    public final CameraCaptureSession A00;

    public final int AGa(CaptureRequest captureRequest, Handler handler, C343197pp r6) {
        C343327q2 r0;
        CameraCaptureSession cameraCaptureSession = this.A00;
        if (r6 != null) {
            r0 = new C343327q2(r6, this);
        } else {
            r0 = null;
        }
        return cameraCaptureSession.capture(captureRequest, r0, (Handler) null);
    }

    public final boolean CSu() {
        return false;
    }

    public final int Eia(CaptureRequest captureRequest, Handler handler, C343197pp r6) {
        C343327q2 r0;
        CameraCaptureSession cameraCaptureSession = this.A00;
        if (r6 != null) {
            r0 = new C343327q2(r6, this);
        } else {
            r0 = null;
        }
        return AnonymousClass0fG.A00(r0, cameraCaptureSession, captureRequest, (Handler) null);
    }

    public static void A00(CameraDevice cameraDevice, C340887lz r10, C341897nh r11, List list, List list2, Executor executor) {
        long j;
        C343307q0 r5 = new C343307q0(r10);
        r11.addArSurfaces(list);
        ArrayList arrayList = new ArrayList();
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            C343257pv r8 = (C343257pv) list2.get(i);
            OutputConfiguration outputConfiguration = new OutputConfiguration(r8.A02);
            outputConfiguration.setStreamUseCase(r8.A01);
            if (r8.A00 != 1) {
                j = 1;
            } else {
                j = 2;
            }
            outputConfiguration.setDynamicRangeProfile(j);
            arrayList.add(outputConfiguration);
        }
        List arSurfaces = r11.getArSurfaces();
        int size2 = arSurfaces.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(new OutputConfiguration((Surface) arSurfaces.get(i2)));
        }
        cameraDevice.createCaptureSession(new SessionConfiguration(0, arrayList, executor, r11.wrapSessionConfigurationCallback(r5)));
    }

    public static void A01(CameraDevice cameraDevice, C340887lz r9, C341897nh r10, List list, Executor executor, boolean z) {
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((C343257pv) list.get(i)).A02);
        }
        CameraDevice cameraDevice2 = cameraDevice;
        C340887lz r4 = r9;
        C341897nh r5 = r10;
        if (Build.VERSION.SDK_INT < 33 || !z) {
            cameraDevice.createCaptureSession(r10.addArSurfaces(arrayList), r10.wrapSessionConfigurationCallback(new C343307q0(r9)), (Handler) null);
            return;
        }
        A00(cameraDevice2, r4, r5, arrayList, list2, executor);
    }

    public final void A6w() {
        this.A00.abortCaptures();
    }

    public final void close() {
        AnonymousClass0fG.A01(this.A00);
    }

    public C343287py(CameraCaptureSession cameraCaptureSession) {
        this.A00 = cameraCaptureSession;
    }
}
