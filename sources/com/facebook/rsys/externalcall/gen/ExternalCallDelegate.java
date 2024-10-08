package com.facebook.rsys.externalcall.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class ExternalCallDelegate {
    public static 2LV CONVERTER = C71546Omh.A00(38);

    public final class CProxy extends ExternalCallDelegate {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native ExternalCallDelegate createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onExternalCallStarted();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof ExternalCallDelegate)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onExternalCallStarted();
}
