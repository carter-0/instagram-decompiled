package org.webrtc;

public final /* synthetic */ class VideoSource$$ExternalSyntheticLambda0 implements VideoSink {
    public final /* synthetic */ NativeAndroidVideoTrackSource f$0;

    public /* synthetic */ VideoSource$$ExternalSyntheticLambda0(NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource) {
        this.f$0 = nativeAndroidVideoTrackSource;
    }

    public final void onFrame(VideoFrame videoFrame) {
        this.f$0.onFrameCaptured(videoFrame);
    }
}
