package com.facebook.rsys.transport.gen;

import X.2LV;
import X.C22179Xwp;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class SignalingTransportProxy {
    public static 2LV CONVERTER = new C22179Xwp(3);

    public final class CProxy extends SignalingTransportProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native SignalingTransportProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onStatusUpdate(StatusUpdate statusUpdate);

        public native void sendSignalingMessage(SignalingMessage signalingMessage, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, int i);

        public native void setSink(SignalingTransportSink signalingTransportSink);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingTransportProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onStatusUpdate(StatusUpdate statusUpdate);

    public abstract void sendSignalingMessage(SignalingMessage signalingMessage, SignalingTransportCallback signalingTransportCallback, SignalingTransportCallbackExt signalingTransportCallbackExt, int i);

    public abstract void setSink(SignalingTransportSink signalingTransportSink);
}
