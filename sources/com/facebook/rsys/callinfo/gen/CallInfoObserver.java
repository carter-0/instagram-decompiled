package com.facebook.rsys.callinfo.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class CallInfoObserver {
    public static 2LV CONVERTER = C22180Xwq.A00(19);

    public final class CProxy extends CallInfoObserver {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CallInfoObserver createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onUpdate();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallInfoObserver)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onUpdate();
}
