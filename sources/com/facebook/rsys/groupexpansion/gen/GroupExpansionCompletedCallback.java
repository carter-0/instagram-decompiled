package com.facebook.rsys.groupexpansion.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class GroupExpansionCompletedCallback {
    public static 2LV CONVERTER = C22180Xwq.A00(56);

    public final class CProxy extends GroupExpansionCompletedCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native GroupExpansionCompletedCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onFailure(int i);

        public native void onSuccess(String str, boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof GroupExpansionCompletedCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onFailure(int i);

    public abstract void onSuccess(String str, boolean z);
}
