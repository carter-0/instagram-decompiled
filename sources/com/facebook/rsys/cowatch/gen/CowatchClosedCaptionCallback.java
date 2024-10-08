package com.facebook.rsys.cowatch.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class CowatchClosedCaptionCallback {

    public final class CProxy extends CowatchClosedCaptionCallback {
        public final NativeHolder mNativeHolder;

        public static native CowatchClosedCaptionCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onUpdate(ArrayList arrayList);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchClosedCaptionCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onUpdate(ArrayList arrayList);
}
