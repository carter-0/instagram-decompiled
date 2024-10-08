package com.facebook.rsys.calltag.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class CallTagApi {
    public static 2LV CONVERTER = C71546Omh.A00(22);

    public final class CProxy extends CallTagApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CallTagApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void updateCallTags(String str, long j, String str2);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallTagApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void updateCallTags(String str, long j, String str2);
}
