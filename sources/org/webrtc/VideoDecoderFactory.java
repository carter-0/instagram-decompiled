package org.webrtc;

public interface VideoDecoderFactory {

    /* renamed from: org.webrtc.VideoDecoderFactory$-CC  reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static VideoCodecInfo[] $default$getSupportedCodecs(VideoDecoderFactory videoDecoderFactory) {
            return new VideoCodecInfo[0];
        }

        @Deprecated
        public static VideoDecoder $default$createDecoder(VideoDecoderFactory videoDecoderFactory, String str) {
            throw new UnsupportedOperationException("Deprecated and not implemented.");
        }

        public static VideoDecoder $default$createDecoder(VideoDecoderFactory videoDecoderFactory, VideoCodecInfo videoCodecInfo) {
            return videoDecoderFactory.createDecoder(videoCodecInfo.name);
        }
    }

    @Deprecated
    VideoDecoder createDecoder(String str);

    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    VideoCodecInfo[] getSupportedCodecs();
}
