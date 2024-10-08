package com.facebook.rsys.callmanager.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class Call {
    public static 2LV CONVERTER = C71546Omh.A00(19);

    public final class CProxy extends Call {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native Call createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native ApiBag getApis();

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof Call)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract ApiBag getApis();
}
