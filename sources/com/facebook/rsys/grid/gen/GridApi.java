package com.facebook.rsys.grid.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class GridApi {
    public static 2LV CONVERTER = C22180Xwq.A00(51);

    public final class CProxy extends GridApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native GridApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void performPinningAction(String str, int i);

        public native void unpinAll();

        public native void updateMaxPeersVisible(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof GridApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void performPinningAction(String str, int i);

    public abstract void unpinAll();

    public abstract void updateMaxPeersVisible(int i);
}
