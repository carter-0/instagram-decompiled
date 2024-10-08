package com.facebook.rsys.chatdtransportsender.gen;

import X.2LV;
import X.C22180Xwq;
import X.XYC;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.msys.mcs.SyncHandler;
import com.facebook.simplejni.NativeHolder;

public abstract class ChatDTransportSenderApi {
    public static 2LV CONVERTER = C22180Xwq.A00(28);

    public final class CProxy extends ChatDTransportSenderApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native ChatDTransportSenderApi createApiJni(SyncHandler syncHandler, int i, double d, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, int i4);

        public static native ChatDTransportSenderApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void activeConnection();

        public native void earlyConnection(int i);

        public native boolean hasChatDSender();

        public native int hashCode();

        public native void idleConnection();

        public native void send(ChatDTransportSenderSendInput chatDTransportSenderSendInput);

        public native boolean shouldCreateMqttTransport();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof ChatDTransportSenderApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        static {
            XYC.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void activeConnection();

    public abstract void earlyConnection(int i);

    public abstract boolean hasChatDSender();

    public abstract void idleConnection();

    public abstract void send(ChatDTransportSenderSendInput chatDTransportSenderSendInput);

    public abstract boolean shouldCreateMqttTransport();
}
