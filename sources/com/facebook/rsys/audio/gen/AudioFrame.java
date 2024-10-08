package com.facebook.rsys.audio.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.AudioFrameData;
import com.facebook.simplejni.NativeHolder;

public abstract class AudioFrame {
    public static 2LV CONVERTER = C71546Omh.A00(1);

    public final class CProxy extends AudioFrame {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioFrame createFrame(AudioFrameData audioFrameData, AudioFrameMetadata audioFrameMetadata);

        public static native AudioFrame createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native AudioFrameData getAudioData();

        public native AudioFrameMetadata getMetadata();

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioFrame)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract AudioFrameData getAudioData();

    public abstract AudioFrameMetadata getMetadata();
}
