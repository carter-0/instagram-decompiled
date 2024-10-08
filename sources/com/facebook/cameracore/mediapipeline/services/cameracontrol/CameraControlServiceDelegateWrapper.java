package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.C390659rd;
import X.C390679rf;

public class CameraControlServiceDelegateWrapper {
    public final CameraControlServiceDelegate mDelegate;

    public boolean canUpdateCaptureDevicePosition(int i) {
        C390679rf r0;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i < 0 || i >= C390679rf.values().length) {
            r0 = C390679rf.Back;
        } else {
            r0 = C390679rf.values()[i];
        }
        return cameraControlServiceDelegate.canUpdateCaptureDevicePosition(r0);
    }

    public long getExposureTime() {
        return this.mDelegate.getExposureTime();
    }

    public int getIso() {
        return this.mDelegate.getIso();
    }

    public long getMaxExposureTime() {
        return this.mDelegate.getMaxExposureTime();
    }

    public int getMaxIso() {
        return this.mDelegate.getMaxIso();
    }

    public long getMinExposureTime() {
        return this.mDelegate.getMinExposureTime();
    }

    public int getMinIso() {
        return this.mDelegate.getMinIso();
    }

    public boolean isFocusModeSupported(int i) {
        C390659rd r0;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i < 0 || i >= C390659rd.values().length) {
            r0 = C390659rd.AutoFocus;
        } else {
            r0 = C390659rd.values()[i];
        }
        return cameraControlServiceDelegate.isFocusModeSupported(r0);
    }

    public boolean isLockExposureAndFocusSupported() {
        return this.mDelegate.isLockExposureAndFocusSupported();
    }

    public void lockExposureAndFocus(long j, int i) {
        this.mDelegate.lockExposureAndFocus(j, i);
    }

    public void unlockExposureAndFocus() {
        this.mDelegate.unlockExposureAndFocus();
    }

    public void updateCaptureDevicePosition(int i) {
        C390679rf r0;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i < 0 || i >= C390679rf.values().length) {
            r0 = C390679rf.Back;
        } else {
            r0 = C390679rf.values()[i];
        }
        cameraControlServiceDelegate.updateCaptureDevicePosition(r0);
    }

    public void updateFocusMode(int i) {
        C390659rd r0;
        CameraControlServiceDelegate cameraControlServiceDelegate = this.mDelegate;
        if (i < 0 || i >= C390659rd.values().length) {
            r0 = C390659rd.AutoFocus;
        } else {
            r0 = C390659rd.values()[i];
        }
        cameraControlServiceDelegate.updateFocusMode(r0);
    }

    public CameraControlServiceDelegateWrapper(CameraControlServiceDelegate cameraControlServiceDelegate) {
        this.mDelegate = cameraControlServiceDelegate;
    }
}
