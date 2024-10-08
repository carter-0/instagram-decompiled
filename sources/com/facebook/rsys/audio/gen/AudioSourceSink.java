package com.facebook.rsys.audio.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class AudioSourceSink {
    public static 2LV CONVERTER = C71546Omh.A00(7);

    public final class CProxy extends AudioSourceSink {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioSourceSink createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onEncodedPacket(AudioEncodedPacket audioEncodedPacket);

        public native void onFrame(AudioFrame audioFrame);

        public native void onPositionUpdate(float f, float f2, float f3);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioSourceSink)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onEncodedPacket(AudioEncodedPacket audioEncodedPacket);

    public abstract void onFrame(AudioFrame audioFrame);

    public abstract void onPositionUpdate(float f, float f2, float f3);
}
