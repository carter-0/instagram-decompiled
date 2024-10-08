package X;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.AUq  reason: case insensitive filesystem */
public final class C40176AUq implements C343297pz {
    public final CameraExtensionSession A00;
    public final Executor A01;

    public final void A6w() {
    }

    public final boolean CSu() {
        return true;
    }

    public final int AGa(CaptureRequest captureRequest, Handler handler, C343197pp r6) {
        return this.A00.capture(captureRequest, this.A01, new AnonymousClass9XS(r6, this));
    }

    public final int Eia(CaptureRequest captureRequest, Handler handler, C343197pp r6) {
        return this.A00.setRepeatingRequest(captureRequest, this.A01, new AnonymousClass9XS(r6, this));
    }

    public final void close() {
        try {
            this.A00.close();
        } catch (CameraAccessException unused) {
            C340577lU.A02("Camera2ExtensionSession", "CameraAccessException on close()!");
        }
    }

    public C40176AUq(CameraExtensionSession cameraExtensionSession, Executor executor) {
        this.A00 = cameraExtensionSession;
        this.A01 = executor;
    }

    public static void A01(CameraDevice cameraDevice, C340887lz r6, List list, Executor executor, int i) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            A1C.add(new OutputConfiguration(((C343257pv) list.get(i2)).A02));
        }
        cameraDevice.createExtensionSession(new ExtensionSessionConfiguration(i, A1C, executor, new AnonymousClass9XT(r6, executor)));
    }
}
