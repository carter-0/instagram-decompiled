package X;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: X.7q0  reason: invalid class name and case insensitive filesystem */
public final class C343307q0 extends CameraCaptureSession.StateCallback {
    public C343287py A00;
    public final /* synthetic */ C340887lz A01;

    public C343307q0(C340887lz r1) {
        this.A01 = r1;
    }

    private C343287py A00(CameraCaptureSession cameraCaptureSession) {
        C343287py r1 = this.A00;
        if (r1 != null && r1.A00 == cameraCaptureSession) {
            return r1;
        }
        C343287py r12 = new C343287py(cameraCaptureSession);
        this.A00 = r12;
        return r12;
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        C340887lz r2 = this.A01;
        A00(cameraCaptureSession);
        if (r2.A03 == 1) {
            r2.A03 = 0;
            r2.A05 = false;
            r2.A01.A01();
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C340887lz r3 = this.A01;
        C343287py A002 = A00(cameraCaptureSession);
        if (r3.A03 == 1) {
            r3.A03 = 0;
            r3.A05 = true;
            r3.A04 = A002;
            r3.A01.A01();
        }
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        super.onActive(cameraCaptureSession);
        C340887lz r0 = this.A01;
        A00(cameraCaptureSession);
        C340877ly r1 = r0.A00;
        if (r1 != null) {
            r1.A00.A0P.A00(new C341957no(), "camera_session_active", new C343357q5(r1));
        }
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        super.onClosed(cameraCaptureSession);
        C340887lz r3 = this.A01;
        C343287py A002 = A00(cameraCaptureSession);
        if (r3.A03 == 2) {
            r3.A03 = 0;
            r3.A05 = true;
            r3.A04 = A002;
            r3.A01.A01();
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        super.onReady(cameraCaptureSession);
        C340887lz r3 = this.A01;
        C343287py A002 = A00(cameraCaptureSession);
        if (r3.A03 == 3) {
            r3.A03 = 0;
            r3.A05 = true;
            r3.A04 = A002;
            r3.A01.A01();
        }
    }
}
