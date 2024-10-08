package com.facebook.rsys.turnallocation.gen;

import X.2LV;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class TurnAllocationCallback {
    public static 2LV CONVERTER = new C71545Omg(10);

    public final class CProxy extends TurnAllocationCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TurnAllocationCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void error(String str, int i);

        public native int hashCode();

        public native void success(String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TurnAllocationCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void error(String str, int i);

    public abstract void success(String str);
}
