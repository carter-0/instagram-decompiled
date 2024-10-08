package X;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.9XR  reason: invalid class name */
public final class AnonymousClass9XR extends CameraCaptureSession.CaptureCallback {
    public final C343347q4 A00 = new C343347q4();
    public final C343337q3 A01 = new Object();
    public final /* synthetic */ C22257XyF A02;
    public final /* synthetic */ C343187po A03;
    public final /* synthetic */ C343297pz A04;

    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        CaptureRequest captureRequest2 = captureRequest;
        long j3 = j;
        long j4 = j2;
        super.onCaptureStarted(cameraCaptureSession, captureRequest2, j3, j4);
        this.A03.D18(captureRequest2, this.A04, j3, j4);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.7q3] */
    public AnonymousClass9XR(C22257XyF xyF, C343187po r3, C343297pz r4) {
        this.A02 = xyF;
        this.A03 = r3;
        this.A04 = r4;
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        C343337q3 r2 = this.A01;
        r2.A00 = totalCaptureResult;
        this.A03.D0w(this.A04, r2);
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        C343347q4 r2 = this.A00;
        r2.A00 = captureFailure.getReason();
        this.A03.D10(this.A04, r2);
    }
}
