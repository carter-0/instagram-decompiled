package com.facebook.rsys.tslog.gen;

import X.2LV;
import X.C22179Xwp;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class TslogStreamApi {
    public static 2LV CONVERTER = new C22179Xwp(7);

    public final class CProxy extends TslogStreamApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TslogStreamApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native TslogCounterApi createCounter(String str, int i);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TslogStreamApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract TslogCounterApi createCounter(String str, int i);
}
