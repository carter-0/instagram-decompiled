package com.facebook.rsys.transport.gen;

import X.2LV;
import X.C22179Xwp;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class SignalingTransportCallbackExt {
    public static 2LV CONVERTER = new C22179Xwp(2);

    public final class CProxy extends SignalingTransportCallbackExt {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native SignalingTransportCallbackExt createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void sendAttemptCallbackExt(SendMessageAttemptStats sendMessageAttemptStats);

        public native void sendCompleteCallbackExt(SendMessageStats sendMessageStats);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportCallbackExt)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void sendAttemptCallbackExt(SendMessageAttemptStats sendMessageAttemptStats);

    public abstract void sendCompleteCallbackExt(SendMessageStats sendMessageStats);
}
