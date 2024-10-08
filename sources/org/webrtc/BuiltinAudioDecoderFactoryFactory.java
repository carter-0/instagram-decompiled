package org.webrtc;

public class BuiltinAudioDecoderFactoryFactory implements AudioDecoderFactoryFactory {
    public static native long nativeCreateBuiltinAudioDecoderFactory();

    public long createNativeAudioDecoderFactory() {
        return nativeCreateBuiltinAudioDecoderFactory();
    }
}
