package org.webrtc;

import org.webrtc.CameraVideoCapturer;

public final /* synthetic */ class CameraCapturer$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ CameraCapturer f$0;
    public final /* synthetic */ CameraVideoCapturer.CameraSwitchHandler f$1;

    public /* synthetic */ CameraCapturer$$ExternalSyntheticLambda4(CameraCapturer cameraCapturer, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        this.f$0 = cameraCapturer;
        this.f$1 = cameraSwitchHandler;
    }

    public final void run() {
        this.f$0.m30lambda$switchCamera$2$orgwebrtcCameraCapturer(this.f$1);
    }
}
