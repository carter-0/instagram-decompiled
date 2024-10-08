package com.facebook.rsys.audio.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class AudioSource {
    public static 2LV CONVERTER = C71546Omh.A00(6);

    public final class CProxy extends AudioSource {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioSource createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int getAudioLevel();

        public native ArrayList getSinks();

        public native int hashCode();

        public native void notifyNewAudioFrame(AudioFrame audioFrame);

        public native void notifyNewAudioPosition(float f, float f2, float f3);

        public native void notifyNewEncodedAudioPacket(AudioEncodedPacket audioEncodedPacket);

        public native void setPlayoutEnabled(boolean z);

        public native void setPlayoutVolume(float f);

        public native void setSinks(ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioSource)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract int getAudioLevel();

    public abstract ArrayList getSinks();

    public abstract void notifyNewAudioFrame(AudioFrame audioFrame);

    public abstract void notifyNewAudioPosition(float f, float f2, float f3);

    public abstract void notifyNewEncodedAudioPacket(AudioEncodedPacket audioEncodedPacket);

    public abstract void setPlayoutEnabled(boolean z);

    public abstract void setPlayoutVolume(float f);

    public abstract void setSinks(ArrayList arrayList);
}
