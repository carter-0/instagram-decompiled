package com.facebook.rsys.audio.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class AudioDeviceModule {
    public static 2LV CONVERTER = C22180Xwq.A00(1);

    public final class CProxy extends AudioDeviceModule {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioDeviceModule createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void startPlayout();

        public native void startRecording();

        public native void stopPlayout();

        public native void stopRecording();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioDeviceModule)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void startPlayout();

    public abstract void startRecording();

    public abstract void stopPlayout();

    public abstract void stopRecording();
}
