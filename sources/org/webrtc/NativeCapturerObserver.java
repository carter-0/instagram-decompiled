package org.webrtc;

import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;

public class NativeCapturerObserver implements CapturerObserver {
    public final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;

    public void onCapturerStarted(boolean z) {
        this.nativeAndroidVideoTrackSource.setState(z);
    }

    public void onCapturerStopped() {
        this.nativeAndroidVideoTrackSource.setState(false);
    }

    public void onFrameCaptured(VideoFrame videoFrame) {
        VideoProcessor.FrameAdaptationParameters adaptFrame = this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
        if (adaptFrame != null) {
            VideoFrame.Buffer cropAndScale = videoFrame.buffer.cropAndScale(adaptFrame.cropX, adaptFrame.cropY, adaptFrame.cropWidth, adaptFrame.cropHeight, adaptFrame.scaleWidth, adaptFrame.scaleHeight);
            this.nativeAndroidVideoTrackSource.onFrameCaptured(new VideoFrame(cropAndScale, videoFrame.rotation, adaptFrame.timestampNs));
            cropAndScale.release();
        }
    }

    public NativeCapturerObserver(long j) {
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j);
    }
}
