package org.webrtc;

import org.webrtc.Camera2Session;

public final /* synthetic */ class Camera2Session$CaptureSessionCallback$$ExternalSyntheticLambda0 implements VideoSink {
    public final /* synthetic */ Camera2Session.CaptureSessionCallback f$0;

    public /* synthetic */ Camera2Session$CaptureSessionCallback$$ExternalSyntheticLambda0(Camera2Session.CaptureSessionCallback captureSessionCallback) {
        this.f$0 = captureSessionCallback;
    }

    public final void onFrame(VideoFrame videoFrame) {
        this.f$0.m28lambda$onConfigured$0$orgwebrtcCamera2Session$CaptureSessionCallback(videoFrame);
    }
}
