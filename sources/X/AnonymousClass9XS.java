package X;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: X.9XS  reason: invalid class name */
public final class AnonymousClass9XS extends CameraExtensionSession.ExtensionCaptureCallback {
    public C343197pp A00;
    public final C343347q4 A01 = new C343347q4();
    public final C343337q3 A02 = new Object();
    public final /* synthetic */ C40176AUq A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.7q3] */
    public AnonymousClass9XS(C343197pp r2, C40176AUq aUq) {
        this.A03 = aUq;
        this.A00 = r2;
    }

    public final void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        C343197pp r2 = this.A00;
        if (r2 != null) {
            r2.D10(this.A03, this.A01);
        }
    }

    public final void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i) {
        C343197pp r0 = this.A00;
        if (r0 != null) {
            r0.DPR(i);
        }
    }

    public final void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C343337q3 r2 = this.A02;
        r2.A00 = totalCaptureResult;
        C343197pp r1 = this.A00;
        if (r1 != null) {
            r1.D0w(this.A03, r2);
        }
    }

    public final void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        C343197pp r2 = this.A00;
        if (r2 != null) {
            r2.D0w(this.A03, this.A02);
        }
    }

    public final void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        C343197pp r0 = this.A00;
        if (r0 != null) {
            r0.D18(captureRequest, this.A03, j, 0);
        }
    }
}
