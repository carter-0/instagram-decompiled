package com.facebook.rsys.transport.gen;

import X.2LV;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class SignalingTransportCallback {
    public static 2LV CONVERTER = new C71545Omg(6);

    public final class CProxy extends SignalingTransportCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native SignalingTransportCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void sendFailureCallback();

        public native void sendSuccessCallback();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void sendFailureCallback();

    public abstract void sendSuccessCallback();
}
