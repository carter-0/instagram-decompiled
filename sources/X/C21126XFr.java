package X;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* renamed from: X.XFr  reason: case insensitive filesystem */
public final class C21126XFr extends CameraCaptureSession.StateCallback {
    public CameraCaptureSession.StateCallback A00;

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onActive(cameraCaptureSession);
        }
    }

    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
        }
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            try {
                stateCallback.onClosed(cameraCaptureSession);
            } catch (Throwable unused) {
            }
            this.A00 = null;
        }
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onConfigureFailed(cameraCaptureSession);
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onConfigured(cameraCaptureSession);
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            try {
                stateCallback.onReady(cameraCaptureSession);
            } catch (RuntimeException unused) {
            }
        }
    }

    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        CameraCaptureSession.StateCallback stateCallback = this.A00;
        if (stateCallback != null) {
            stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
        }
    }
}
