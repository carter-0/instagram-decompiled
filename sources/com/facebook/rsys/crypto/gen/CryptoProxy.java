package com.facebook.rsys.crypto.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class CryptoProxy {
    public static 2LV CONVERTER = C71546Omh.A00(31);

    public final class CProxy extends CryptoProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CryptoProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void setApi(CryptoApi cryptoApi);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CryptoProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void setApi(CryptoApi cryptoApi);
}
