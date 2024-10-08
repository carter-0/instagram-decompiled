package com.facebook.rsys.cowatch.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class CowatchFetchMediaFailureCallback {

    public final class CProxy extends CowatchFetchMediaFailureCallback {
        public final NativeHolder mNativeHolder;

        public static native CowatchFetchMediaFailureCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onFailure(String str, String str2, int i, String str3, String str4);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchFetchMediaFailureCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onFailure(String str, String str2, int i, String str3, String str4);
}
