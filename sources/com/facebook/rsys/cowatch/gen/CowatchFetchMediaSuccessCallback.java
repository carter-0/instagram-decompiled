package com.facebook.rsys.cowatch.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class CowatchFetchMediaSuccessCallback {

    public final class CProxy extends CowatchFetchMediaSuccessCallback {
        public final NativeHolder mNativeHolder;

        public static native CowatchFetchMediaSuccessCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onSuccess(CowatchMediaInfoModel cowatchMediaInfoModel);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchFetchMediaSuccessCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onSuccess(CowatchMediaInfoModel cowatchMediaInfoModel);
}
