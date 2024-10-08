package X;

import android.hardware.camera2.CameraDevice;

/* renamed from: X.7ox  reason: invalid class name and case insensitive filesystem */
public final class C342657ox extends CameraDevice.StateCallback implements C340897m0 {
    public CameraDevice A00;
    public C346357v2 A01;
    public Boolean A02;
    public final C340627lZ A03;
    public final C340647lb A04;
    public final C340667ld A05;

    public final void ADv() {
        this.A03.A00();
    }

    public final /* bridge */ /* synthetic */ Object Bny() {
        Boolean bool = this.A02;
        if (bool == null) {
            throw new IllegalStateException("Open Camera operation hasn't completed yet.");
        } else if (bool.booleanValue()) {
            CameraDevice cameraDevice = this.A00;
            cameraDevice.getClass();
            return cameraDevice;
        } else {
            throw this.A01;
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.7v2, java.lang.RuntimeException] */
    public final void onDisconnected(CameraDevice cameraDevice) {
        if (this.A00 == null) {
            this.A02 = false;
            this.A01 = new RuntimeException("Could not open camera. Operation disconnected.");
            this.A03.A01();
            return;
        }
        C340667ld r0 = this.A05;
        if (r0 != null) {
            r0.D98(cameraDevice);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.7v2, java.lang.RuntimeException] */
    public final void onError(CameraDevice cameraDevice, int i) {
        AnonymousClass0fJ r0 = AnonymousClass0fJ.$redex_init_class;
        if (0BU.A04()) {
            0BU.A02(cameraDevice);
        }
        if (this.A00 == null) {
            this.A02 = false;
            this.A01 = new RuntimeException(002.A0O("Could not open camera. Operation error: ", i));
            this.A03.A01();
            return;
        }
        C340667ld r02 = this.A05;
        if (r02 != null) {
            r02.DCd(cameraDevice, i);
        }
    }

    public final void onOpened(CameraDevice cameraDevice) {
        AnonymousClass0fJ r0 = AnonymousClass0fJ.$redex_init_class;
        if (0BU.A04()) {
            0BU.A03(cameraDevice);
        }
        this.A02 = true;
        this.A00 = cameraDevice;
        this.A03.A01();
    }

    public C342657ox(C340647lb r4, C340667ld r5) {
        this.A04 = r4;
        this.A05 = r5;
        C340627lZ r2 = new C340627lZ();
        this.A03 = r2;
        r2.A02(0);
    }

    public final void onClosed(CameraDevice cameraDevice) {
        super.onClosed(cameraDevice);
        this.A00 = null;
        C340647lb r0 = this.A04;
        if (r0 != null) {
            r0.onCameraClosed(cameraDevice);
        }
    }
}
