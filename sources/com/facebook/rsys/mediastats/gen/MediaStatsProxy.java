package com.facebook.rsys.mediastats.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class MediaStatsProxy {
    public static 2LV CONVERTER = C71546Omh.A00(45);

    public final class CProxy extends MediaStatsProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MediaStatsProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void setApi(MediaStatsApi mediaStatsApi);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MediaStatsProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void setApi(MediaStatsApi mediaStatsApi);
}
