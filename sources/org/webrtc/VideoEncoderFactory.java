package org.webrtc;

public interface VideoEncoderFactory {

    /* renamed from: org.webrtc.VideoEncoderFactory$-CC  reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static VideoEncoderSelector $default$getEncoderSelector(VideoEncoderFactory videoEncoderFactory) {
            return null;
        }

        public static VideoCodecInfo[] $default$getImplementations(VideoEncoderFactory videoEncoderFactory) {
            return videoEncoderFactory.getSupportedCodecs();
        }
    }

    VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo);

    VideoEncoderSelector getEncoderSelector();

    VideoCodecInfo[] getImplementations();

    VideoCodecInfo[] getSupportedCodecs();

    public interface VideoEncoderSelector {
        VideoCodecInfo onAvailableBitrate(int i);

        void onCurrentEncoder(VideoCodecInfo videoCodecInfo);

        VideoCodecInfo onEncoderBroken();

        VideoCodecInfo onResolutionChange(int i, int i2);

        /* renamed from: org.webrtc.VideoEncoderFactory$VideoEncoderSelector$-CC  reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static VideoCodecInfo $default$onResolutionChange(VideoEncoderSelector videoEncoderSelector, int i, int i2) {
                return null;
            }
        }
    }
}
