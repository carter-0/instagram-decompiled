package com.facebook.rsys.netobject.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class NetObjectSessionCallback {
    public static 2LV CONVERTER = C22181Xwr.A00(20);

    public final class CProxy extends NetObjectSessionCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native NetObjectSessionCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onCreated(NetObjectSession netObjectSession);

        public native void onError();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof NetObjectSessionCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onCreated(NetObjectSession netObjectSession);

    public abstract void onError();
}
