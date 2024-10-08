package com.facebook.rsys.livevideo.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class LiveVideoStore {
    public static 2LV CONVERTER = C22180Xwq.A00(65);

    public final class CProxy extends LiveVideoStore {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native LiveVideoStore createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void cancelCreatedNotStartedBroadcast(String str, String str2, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback);

        public native void createBroadcast(String str, String str2, int i, int i2, String str3, ArrayList arrayList, String str4, String str5, ArrayList arrayList2, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback, boolean z);

        public native void endBroadcast(String str, String str2, String str3, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback);

        public native int hashCode();

        public native void setHandler(LiveVideoStoreHandler liveVideoStoreHandler);

        public native void startBroadcast(String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, boolean z, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback);

        public native void startObservingLiveStreamMetadata(String str);

        public native void startObservingRoomBroadcast(String str);

        public native void stopObservingLiveStreamMetadata();

        public native void stopObservingRoomBroadcast();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LiveVideoStore)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void cancelCreatedNotStartedBroadcast(String str, String str2, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback);

    public abstract void createBroadcast(String str, String str2, int i, int i2, String str3, ArrayList arrayList, String str4, String str5, ArrayList arrayList2, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback, boolean z);

    public abstract void endBroadcast(String str, String str2, String str3, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback);

    public abstract void setHandler(LiveVideoStoreHandler liveVideoStoreHandler);

    public abstract void startBroadcast(String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, boolean z, LiveVideoBroadcastLifecycleCallback liveVideoBroadcastLifecycleCallback);

    public abstract void startObservingLiveStreamMetadata(String str);

    public abstract void startObservingRoomBroadcast(String str);

    public abstract void stopObservingLiveStreamMetadata();

    public abstract void stopObservingRoomBroadcast();
}
