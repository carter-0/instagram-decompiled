package org.webrtc;

import org.webrtc.VideoDecoder;

public class VideoDecoderWrapper {
    public static native void nativeOnDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);

    public static VideoDecoder.Callback createDecoderCallback(long j) {
        return new VideoDecoderWrapper$$ExternalSyntheticLambda0(j);
    }
}
