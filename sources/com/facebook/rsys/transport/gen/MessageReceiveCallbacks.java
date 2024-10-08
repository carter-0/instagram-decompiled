package com.facebook.rsys.transport.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class MessageReceiveCallbacks {
    public static 2LV CONVERTER = C22181Xwr.A00(67);

    public final class CProxy extends MessageReceiveCallbacks {
        public static long A00;
        public final NativeHolder mNativeHolder;

        public static native MessageReceiveCallbacks createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onError(int i, String str);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MessageReceiveCallbacks)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onError(int i, String str);
}
