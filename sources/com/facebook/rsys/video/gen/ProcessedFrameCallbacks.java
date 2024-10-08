package com.facebook.rsys.video.gen;

import X.2LV;
import X.C22179Xwp;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

public abstract class ProcessedFrameCallbacks {
    public static 2LV CONVERTER = new C22179Xwp(9);

    public final class CProxy extends ProcessedFrameCallbacks {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native ProcessedFrameCallbacks createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onFrameReady(RSVideoFrame rSVideoFrame);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof ProcessedFrameCallbacks)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onFrameReady(RSVideoFrame rSVideoFrame);
}
