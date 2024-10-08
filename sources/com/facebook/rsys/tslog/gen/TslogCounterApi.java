package com.facebook.rsys.tslog.gen;

import X.2LV;
import X.C22179Xwp;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class TslogCounterApi {
    public static 2LV CONVERTER = new C22179Xwp(6);

    public final class CProxy extends TslogCounterApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TslogCounterApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void addSample(int i);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TslogCounterApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void addSample(int i);
}
