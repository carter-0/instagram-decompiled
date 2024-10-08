package com.facebook.rsys.mediastats.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

public abstract class AudioLevelsCallback {
    public static 2LV CONVERTER = C22181Xwr.A00(0);

    public final class CProxy extends AudioLevelsCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AudioLevelsCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void complete(Map map);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AudioLevelsCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void complete(Map map);
}
