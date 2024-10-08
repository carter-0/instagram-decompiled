package com.facebook.rsys.hdvideo.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

public abstract class HdVideoProxy {
    public static 2LV CONVERTER = C71546Omh.A00(41);

    public final class CProxy extends HdVideoProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native HdVideoProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native boolean getHdVideoUserPreference();

        public native int hashCode();

        public native void onVideoQualityChanged(Map map);

        public native void setApi(HdVideoApi hdVideoApi);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof HdVideoProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract boolean getHdVideoUserPreference();

    public abstract void onVideoQualityChanged(Map map);

    public abstract void setApi(HdVideoApi hdVideoApi);
}
