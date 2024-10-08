package com.facebook.rsys.videosubscriptions.gen;

import X.2LV;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class VideoSubscriptionsApi {
    public static 2LV CONVERTER = new C71545Omg(17);

    public final class CProxy extends VideoSubscriptionsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoSubscriptionsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void updateSubscriptions(VideoSubscriptions videoSubscriptions);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoSubscriptionsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void updateSubscriptions(VideoSubscriptions videoSubscriptions);
}
