package com.instagram.rtc.rsys.proxies;

import X.2LV;
import X.C56915IHk;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class IGRTCFeatureProvider {
    public static 2LV CONVERTER = new C56915IHk(3);

    public final class CProxy extends IGRTCFeatureProvider {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native IGRTCFeatureProvider createFeatureProvider(IGRTCFeatureProviderProxy iGRTCFeatureProviderProxy);

        public static native IGRTCFeatureProvider createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native McfReference getRawFeatureProvider();

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof IGRTCFeatureProvider)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract McfReference getRawFeatureProvider();
}
