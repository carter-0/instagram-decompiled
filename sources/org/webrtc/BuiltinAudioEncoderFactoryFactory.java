package org.webrtc;

public class BuiltinAudioEncoderFactoryFactory implements AudioEncoderFactoryFactory {
    public static native long nativeCreateBuiltinAudioEncoderFactory();

    public long createNativeAudioEncoderFactory() {
        return nativeCreateBuiltinAudioEncoderFactory();
    }
}
