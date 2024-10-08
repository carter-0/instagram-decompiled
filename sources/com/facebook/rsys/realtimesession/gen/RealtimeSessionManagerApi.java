package com.facebook.rsys.realtimesession.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class RealtimeSessionManagerApi {
    public static 2LV CONVERTER = C22181Xwr.A00(50);

    public final class CProxy extends RealtimeSessionManagerApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native RealtimeSessionManagerApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void useFromCppOnly();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof RealtimeSessionManagerApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void useFromCppOnly();
}
