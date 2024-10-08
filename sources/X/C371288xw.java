package X;

import com.facebook.cameracore.mediapipeline.services.cameracontrol.CameraControlServiceDelegate;

/* renamed from: X.8xw  reason: invalid class name and case insensitive filesystem */
public final class C371288xw implements CameraControlServiceDelegate {
    public boolean A00;
    public boolean A01;
    public final C340307l3 A02;

    public final boolean canUpdateCaptureDevicePosition(C390679rf r4) {
        0qQ.A0B(r4, 0);
        int ordinal = r4.ordinal();
        if (ordinal == 1) {
            return this.A00;
        }
        if (ordinal == 0) {
            return this.A01;
        }
        return false;
    }

    public final long getExposureTime() {
        return 0;
    }

    public final int getIso() {
        return 0;
    }

    public final long getMaxExposureTime() {
        return 0;
    }

    public final int getMaxIso() {
        return 0;
    }

    public final long getMinExposureTime() {
        return 0;
    }

    public final int getMinIso() {
        return 0;
    }

    public final boolean isFocusModeSupported(C390659rd r2) {
        return false;
    }

    public final boolean isLockExposureAndFocusSupported() {
        return false;
    }

    public final void lockExposureAndFocus(long j, int i) {
    }

    public final void unlockExposureAndFocus() {
    }

    public final void updateCaptureDevicePosition(C390679rf r4) {
        C340307l3 r1;
        AnonymousClass8GD r0;
        0qQ.A0B(r4, 0);
        int ordinal = r4.ordinal();
        if (ordinal == 1) {
            r1 = this.A02;
            if (r1.CPy()) {
                r0 = new C364488lV();
            } else {
                return;
            }
        } else if (ordinal == 0) {
            r1 = this.A02;
            if (!r1.CPy()) {
                r0 = new C364478lU();
            } else {
                return;
            }
        } else {
            return;
        }
        r1.EzI(r0);
    }

    public final void updateFocusMode(C390659rd r1) {
    }

    public C371288xw(C340307l3 r2) {
        this.A02 = r2;
        r2.CJq(new C346527vK(this));
        r2.CJd(new C346517vJ(this));
    }
}
