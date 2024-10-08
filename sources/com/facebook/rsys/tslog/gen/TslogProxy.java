package com.facebook.rsys.tslog.gen;

import X.2LV;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class TslogProxy {
    public static 2LV CONVERTER = new C71545Omg(9);

    public final class CProxy extends TslogProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TslogProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void setApi(TslogApi tslogApi);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TslogProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void setApi(TslogApi tslogApi);
}
