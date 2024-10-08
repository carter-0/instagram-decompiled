package X;

import android.hardware.camera2.CameraDevice;

/* renamed from: X.7lc  reason: invalid class name and case insensitive filesystem */
public final class C340657lc implements C340667ld {
    public final /* synthetic */ C340597lW A00;

    public C340657lc(C340597lW r1) {
        this.A00 = r1;
    }

    public final void D98(CameraDevice cameraDevice) {
        C340597lW r2 = this.A00;
        C341897nh r0 = r2.A0C;
        if (r0 != null) {
            r0.onCameraDisconnected(cameraDevice);
        }
        C340597lW.A04(r2, "Camera has been disconnected.", 2);
    }

    public final void DCd(CameraDevice cameraDevice, int i) {
        String str;
        int i2;
        C340597lW r2 = this.A00;
        C341897nh r0 = r2.A0C;
        if (r0 != null) {
            r0.onCameraError(cameraDevice, i);
        }
        if (i == 1) {
            str = "Camera in use by higher priority component.";
        } else if (i == 2) {
            str = "There are too many open camera devices.";
        } else if (i == 3) {
            str = "Camera disabled, device policy error.";
        } else if (i == 4 || i == 5) {
            i2 = 100;
            str = AnonymousClass000.A00(2134);
            C340597lW.A04(r2, str, i2);
        } else {
            str = "Unknown camera error.";
        }
        i2 = 1;
        C340597lW.A04(r2, str, i2);
    }
}
