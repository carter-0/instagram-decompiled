package com.facebook.rsys.networktraffic.gen;

import X.2LV;
import X.C12068SmN;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class NetworkTrafficApi {
    public static 2LV CONVERTER = new C12068SmN(3);

    public final class CProxy extends NetworkTrafficApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native NetworkTrafficApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onHttpEventComplete(long j, HttpStats httpStats);

        public native void onHttpEventResponse(long j);

        public native void onHttpEventStart(long j);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof NetworkTrafficApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onHttpEventComplete(long j, HttpStats httpStats);

    public abstract void onHttpEventResponse(long j);

    public abstract void onHttpEventStart(long j);
}
