package org.webrtc;

import org.webrtc.CameraVideoCapturer;

public final /* synthetic */ class CameraCapturer$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ CameraCapturer f$0;
    public final /* synthetic */ CameraVideoCapturer.CameraSwitchHandler f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ CameraCapturer$$ExternalSyntheticLambda3(CameraCapturer cameraCapturer, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        this.f$0 = cameraCapturer;
        this.f$1 = cameraSwitchHandler;
        this.f$2 = str;
    }

    public final void run() {
        this.f$0.m31lambda$switchCamera$3$orgwebrtcCameraCapturer(this.f$1, this.f$2);
    }
}
