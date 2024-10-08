package org.webrtc;

public class VideoEncoderFallback extends WrappedNativeVideoEncoder {
    public final VideoEncoder fallback;
    public final VideoEncoder primary;

    public static native long nativeCreate(long j, VideoEncoder videoEncoder, VideoEncoder videoEncoder2);

    public long createNative(long j) {
        return nativeCreate(j, this.fallback, this.primary);
    }

    public boolean isHardwareEncoder() {
        return this.primary.isHardwareEncoder();
    }

    public VideoEncoderFallback(VideoEncoder videoEncoder, VideoEncoder videoEncoder2) {
        this.fallback = videoEncoder;
        this.primary = videoEncoder2;
    }
}
