package org.webrtc;

public final /* synthetic */ class CameraCapturer$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ CameraSession f$0;

    public /* synthetic */ CameraCapturer$$ExternalSyntheticLambda1(CameraSession cameraSession) {
        this.f$0 = cameraSession;
    }

    public final void run() {
        this.f$0.stop();
    }
}
