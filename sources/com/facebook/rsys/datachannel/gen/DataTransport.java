package com.facebook.rsys.datachannel.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class DataTransport {
    public static 2LV CONVERTER = C22180Xwq.A00(42);

    public final class CProxy extends DataTransport {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DataTransport createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void sendData(byte[] bArr);

        public native void sendDataWithParams(DataChannelMessageParams dataChannelMessageParams, byte[] bArr);

        public native void setListener(DataTransportListener dataTransportListener);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DataTransport)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void sendData(byte[] bArr);

    public abstract void sendDataWithParams(DataChannelMessageParams dataChannelMessageParams, byte[] bArr);

    public abstract void setListener(DataTransportListener dataTransportListener);
}
