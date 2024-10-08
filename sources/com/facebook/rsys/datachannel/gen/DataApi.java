package com.facebook.rsys.datachannel.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class DataApi {
    public static 2LV CONVERTER = C22180Xwq.A00(39);

    public final class CProxy extends DataApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DataApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native DataTransport createTransport(String str, DataChannelConfig dataChannelConfig);

        public native int hashCode();

        public native void removeTransport(String str, DataTransport dataTransport);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DataApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract DataTransport createTransport(String str, DataChannelConfig dataChannelConfig);

    public abstract void removeTransport(String str, DataTransport dataTransport);
}
