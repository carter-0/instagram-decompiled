package com.facebook.rsys.networktraffic.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class NetworkTrafficProxy {
    public static 2LV CONVERTER = C22181Xwr.A00(25);

    public final class CProxy extends NetworkTrafficProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native NetworkTrafficProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onCallEnd();

        public native void onCallStart();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof NetworkTrafficProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onCallEnd();

    public abstract void onCallStart();
}
