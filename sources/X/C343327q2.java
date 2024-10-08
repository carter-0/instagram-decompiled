package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.7q2  reason: invalid class name and case insensitive filesystem */
public final class C343327q2 extends CameraCaptureSession.CaptureCallback {
    public final C343197pp A00;
    public final C343347q4 A01 = new C343347q4();
    public final C343337q3 A02 = new Object();
    public final /* synthetic */ C343287py A03;

    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        CaptureRequest captureRequest2 = captureRequest;
        long j3 = j;
        long j4 = j2;
        super.onCaptureStarted(cameraCaptureSession, captureRequest2, j3, j4);
        this.A00.D18(captureRequest2, this.A03, j3, j4);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.7q3] */
    public C343327q2(C343197pp r2, C343287py r3) {
        this.A03 = r3;
        this.A00 = r2;
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        C343337q3 r2 = this.A02;
        r2.A00 = totalCaptureResult;
        this.A00.D0w(this.A03, r2);
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        C343347q4 r2 = this.A01;
        r2.A00 = captureFailure.getReason();
        this.A00.D10(this.A03, r2);
    }
}
