package X;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: X.7oy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C342667oy implements Callable {
    public final /* synthetic */ C340597lW A00;
    public final /* synthetic */ C342657ox A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C342667oy(C340597lW r1, C342657ox r2, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = r2;
    }

    public final Object call() {
        C340597lW r0 = this.A00;
        String str = this.A02;
        C342657ox r2 = this.A01;
        CameraManager cameraManager = r0.A0M;
        cameraManager.getClass();
        cameraManager.openCamera(str, r2, (Handler) null);
        return r2;
    }
}
