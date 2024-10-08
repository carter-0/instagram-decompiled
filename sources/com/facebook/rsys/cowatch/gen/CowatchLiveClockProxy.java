package com.facebook.rsys.cowatch.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class CowatchLiveClockProxy {

    public final class CProxy extends CowatchLiveClockProxy {
        public final NativeHolder mNativeHolder;

        public static native CowatchLiveClockProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native long getCurrentTimeMs();

        public native int hashCode();

        public native void start();

        public native void stop();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchLiveClockProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract long getCurrentTimeMs();

    public abstract void start();

    public abstract void stop();
}
