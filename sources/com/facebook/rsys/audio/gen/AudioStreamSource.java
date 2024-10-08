package com.facebook.rsys.audio.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class AudioStreamSource {
    public static 2LV CONVERTER = C22180Xwq.A00(6);

    public final class CProxy extends AudioStreamSource {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioStreamSource createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native AudioFrame getAudioFrame(int i, int i2);

        public native int getAudioLevel();

        public native int hashCode();

        public native void setPlayoutEnabled(boolean z);

        public native void setPlayoutVolume(float f);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioStreamSource)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract AudioFrame getAudioFrame(int i, int i2);

    public abstract int getAudioLevel();

    public abstract void setPlayoutEnabled(boolean z);

    public abstract void setPlayoutVolume(float f);
}
