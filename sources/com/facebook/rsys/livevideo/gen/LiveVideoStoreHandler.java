package com.facebook.rsys.livevideo.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class LiveVideoStoreHandler {
    public static 2LV CONVERTER = C22180Xwq.A00(66);

    public final class CProxy extends LiveVideoStoreHandler {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native LiveVideoStoreHandler createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void liveStreamStateUpdated(long j, int i, LiveStreamOptInInfo liveStreamOptInInfo);

        public native void liveVideoMetadataUpdated(long j, LiveVideoMetadata liveVideoMetadata);

        public native void roomsBroadcastDataLoaded(long j, String str, int i, Integer num, String str2);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LiveVideoStoreHandler)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void liveStreamStateUpdated(long j, int i, LiveStreamOptInInfo liveStreamOptInInfo);

    public abstract void liveVideoMetadataUpdated(long j, LiveVideoMetadata liveVideoMetadata);

    public abstract void roomsBroadcastDataLoaded(long j, String str, int i, Integer num, String str2);
}
