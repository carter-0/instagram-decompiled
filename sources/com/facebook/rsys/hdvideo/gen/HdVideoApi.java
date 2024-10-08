package com.facebook.rsys.hdvideo.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class HdVideoApi {
    public static 2LV CONVERTER = C71546Omh.A00(40);

    public final class CProxy extends HdVideoApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native HdVideoApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void setHdVideoUserPreference(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof HdVideoApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void setHdVideoUserPreference(boolean z);
}
