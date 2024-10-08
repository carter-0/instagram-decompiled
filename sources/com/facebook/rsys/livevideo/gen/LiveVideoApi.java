package com.facebook.rsys.livevideo.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class LiveVideoApi {
    public static 2LV CONVERTER = C71546Omh.A00(42);

    public final class CProxy extends LiveVideoApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native LiveVideoApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void acknowledgeLiveStream();

        public native void cancelCreatedNotStartedBroadcast();

        public native void createBroadcast(int i, int i2, String str, ArrayList arrayList, String str2, boolean z, ArrayList arrayList2);

        public native void endBroadcast();

        public native int hashCode();

        public native void startBroadcast(ArrayList arrayList);

        public native void subscribeToBroadcast(Long l);

        public native void syncUnsubscribe();

        public native void updateBroadcastId(Long l);

        public native void updateLiveStream(Long l, int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LiveVideoApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void acknowledgeLiveStream();

    public abstract void cancelCreatedNotStartedBroadcast();

    public abstract void createBroadcast(int i, int i2, String str, ArrayList arrayList, String str2, boolean z, ArrayList arrayList2);

    public abstract void endBroadcast();

    public abstract void startBroadcast(ArrayList arrayList);

    public abstract void subscribeToBroadcast(Long l);

    public abstract void syncUnsubscribe();

    public abstract void updateBroadcastId(Long l);

    public abstract void updateLiveStream(Long l, int i);
}
