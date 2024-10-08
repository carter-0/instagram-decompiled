package com.facebook.rsys.mediastats.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class MediaStatsApi {
    public static 2LV CONVERTER = C71546Omh.A00(44);

    public final class CProxy extends MediaStatsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MediaStatsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void fetchAudioLevels(ArrayList arrayList, AudioLevelsCallback audioLevelsCallback);

        public native int hashCode();

        public native void registerListener(MediaStatsListener mediaStatsListener);

        public native void unregisterListener(MediaStatsListener mediaStatsListener);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MediaStatsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void fetchAudioLevels(ArrayList arrayList, AudioLevelsCallback audioLevelsCallback);

    public abstract void registerListener(MediaStatsListener mediaStatsListener);

    public abstract void unregisterListener(MediaStatsListener mediaStatsListener);
}
