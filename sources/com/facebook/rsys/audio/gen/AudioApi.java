package com.facebook.rsys.audio.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class AudioApi {
    public static 2LV CONVERTER = C71546Omh.A00(0);

    public final class CProxy extends AudioApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void addSink(String str, int i, AudioSourceSink audioSourceSink);

        public native void enableAudio(ArrayList arrayList);

        public native void enableNoiseSuppression(boolean z);

        public native AudioFrame getAudioFrame(String str, int i, int i2, int i3);

        public native int getAudioLevel(String str, int i);

        public native void handleEncodedPacket(AudioEncodedPacket audioEncodedPacket);

        public native void handleFrame(AudioFrame audioFrame);

        public native int hashCode();

        public native void removeSink(String str, int i, AudioSourceSink audioSourceSink);

        public native void resetNsAecAlgorithms();

        public native void setAudioActivationState(int i);

        public native void setAudioInputRoute(AudioInputRoute audioInputRoute);

        public native void setAudioOutputRoute(AudioOutputRoute audioOutputRoute);

        public native void setPlaybackVolumeDeprecated(ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void addSink(String str, int i, AudioSourceSink audioSourceSink);

    public abstract void enableAudio(ArrayList arrayList);

    public abstract void enableNoiseSuppression(boolean z);

    public abstract AudioFrame getAudioFrame(String str, int i, int i2, int i3);

    public abstract int getAudioLevel(String str, int i);

    public abstract void handleEncodedPacket(AudioEncodedPacket audioEncodedPacket);

    public abstract void handleFrame(AudioFrame audioFrame);

    public abstract void removeSink(String str, int i, AudioSourceSink audioSourceSink);

    public abstract void resetNsAecAlgorithms();

    public abstract void setAudioActivationState(int i);

    public abstract void setAudioInputRoute(AudioInputRoute audioInputRoute);

    public abstract void setAudioOutputRoute(AudioOutputRoute audioOutputRoute);

    public abstract void setPlaybackVolumeDeprecated(ArrayList arrayList);
}
