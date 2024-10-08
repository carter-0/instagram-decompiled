package com.facebook.cameracore.mediapipeline.services.captureevent;

import X.AnonymousClass6e9;
import X.B32;
import com.facebook.jni.HybridData;

public class CaptureEventInputWrapper implements B32 {
    public final AnonymousClass6e9 mCaptureEventInput;
    public final HybridData mHybridData;

    public static native HybridData initHybrid(int i, int i2, int i3, int i4, float f);

    public native void capturePhoto();

    public native void finishCapturePhoto();

    public native void setCaptureContext(int i);

    public native void setCaptureDevicePosition(int i);

    public native void setCaptureDeviceSize(int i, int i2);

    public native void setEffectSafeAreaInsets(int i, int i2, int i3, int i4);

    public native void setPreviewViewInfo(int i, int i2, float f);

    public native void setRotation(int i);

    public native void setZoomFactor(float f);

    public native void startRecording();

    public native void stopRecording();

    public CaptureEventInputWrapper(AnonymousClass6e9 r6) {
        this.mCaptureEventInput = r6;
        this.mHybridData = initHybrid(r6.Bp4(), r6.Bp2(), r6.Bp1(), r6.Bp3(), r6.CHe());
        r6.A8v(this);
    }
}
