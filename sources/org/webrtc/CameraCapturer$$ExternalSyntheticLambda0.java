package org.webrtc;

public final /* synthetic */ class CameraCapturer$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ CameraSession f$0;

    public /* synthetic */ CameraCapturer$$ExternalSyntheticLambda0(CameraSession cameraSession) {
        this.f$0 = cameraSession;
    }

    public final void run() {
        this.f$0.stop();
    }
}
