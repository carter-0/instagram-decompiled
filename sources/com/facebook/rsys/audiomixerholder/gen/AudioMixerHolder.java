package com.facebook.rsys.audiomixerholder.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class AudioMixerHolder {
    public static 2LV CONVERTER = C22180Xwq.A00(8);

    public final class CProxy extends AudioMixerHolder {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioMixerHolder createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native boolean isGeneric();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioMixerHolder)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract boolean isGeneric();
}
