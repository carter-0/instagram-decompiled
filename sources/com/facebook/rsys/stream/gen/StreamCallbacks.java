package com.facebook.rsys.stream.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class StreamCallbacks {
    public static 2LV CONVERTER = C22181Xwr.A00(61);

    public final class CProxy extends StreamCallbacks {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native StreamCallbacks createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onFailure(int i);

        public native void onSuccess();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof StreamCallbacks)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onFailure(int i);

    public abstract void onSuccess();
}
