package X;

public interface B32 {
    void capturePhoto();

    void finishCapturePhoto();

    void setCaptureContext(int i);

    void setCaptureDevicePosition(int i);

    void setCaptureDeviceSize(int i, int i2);

    void setEffectSafeAreaInsets(int i, int i2, int i3, int i4);

    void setPreviewViewInfo(int i, int i2, float f);

    void setRotation(int i);

    void setZoomFactor(float f);

    void startRecording();

    void stopRecording();
}
