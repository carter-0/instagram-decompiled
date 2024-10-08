package com.facebook.rsys.base.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class FeatureHolder {
    public static 2LV CONVERTER = C22180Xwq.A00(13);

    public final class CProxy extends FeatureHolder {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native FeatureHolder createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native boolean hasBeenBound();

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof FeatureHolder)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract boolean hasBeenBound();
}
