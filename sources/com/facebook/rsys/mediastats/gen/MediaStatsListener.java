package com.facebook.rsys.mediastats.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class MediaStatsListener {
    public static 2LV CONVERTER = C22181Xwr.A00(1);

    public final class CProxy extends MediaStatsListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MediaStatsListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onMediaStats(ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MediaStatsListener)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onMediaStats(ArrayList arrayList);
}
