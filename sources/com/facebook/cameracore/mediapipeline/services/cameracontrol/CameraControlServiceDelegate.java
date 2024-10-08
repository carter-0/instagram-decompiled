package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.C390659rd;
import X.C390679rf;

public interface CameraControlServiceDelegate {
    boolean canUpdateCaptureDevicePosition(C390679rf r1);

    long getExposureTime();

    int getIso();

    long getMaxExposureTime();

    int getMaxIso();

    long getMinExposureTime();

    int getMinIso();

    boolean isFocusModeSupported(C390659rd r1);

    boolean isLockExposureAndFocusSupported();

    void lockExposureAndFocus(long j, int i);

    void unlockExposureAndFocus();

    void updateCaptureDevicePosition(C390679rf r1);

    void updateFocusMode(C390659rd r1);
}
