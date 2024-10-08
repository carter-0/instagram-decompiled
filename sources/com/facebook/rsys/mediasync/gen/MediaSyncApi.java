package com.facebook.rsys.mediasync.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class MediaSyncApi {
    public static 2LV CONVERTER = C71546Omh.A00(55);

    public final class CProxy extends MediaSyncApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MediaSyncApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void localUpdate(int i);

        public native void refresh();

        public native void update(int i, String str, int i2, Long l, MediaSyncContent mediaSyncContent, int i3, String str2, Integer num, String str3, String str4);

        public native void updateMediaContent(String str, MediaSyncContent mediaSyncContent);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MediaSyncApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void localUpdate(int i);

    public abstract void refresh();

    public abstract void update(int i, String str, int i2, Long l, MediaSyncContent mediaSyncContent, int i3, String str2, Integer num, String str3, String str4);

    public abstract void updateMediaContent(String str, MediaSyncContent mediaSyncContent);
}
