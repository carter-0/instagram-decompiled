package com.facebook.rsys.transport.gen;

import X.2LV;
import X.C22179Xwp;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class SignalingTransportSink {
    public static 2LV CONVERTER = new C22179Xwp(4);

    public final class CProxy extends SignalingTransportSink {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native SignalingTransportSink createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void signalingMessageReceived(SignalingMessage signalingMessage, MessageReceiveCallbacks messageReceiveCallbacks);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportSink)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void signalingMessageReceived(SignalingMessage signalingMessage, MessageReceiveCallbacks messageReceiveCallbacks);
}
