package com.facebook.rsys.stream.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class VideoCapturePropertiesListener {
    public static 2LV CONVERTER = C22181Xwr.A00(63);

    public final class CProxy extends VideoCapturePropertiesListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoCapturePropertiesListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onResolutionChanged(int i, int i2);

        public native void onTargetFpsChanged(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoCapturePropertiesListener)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onResolutionChanged(int i, int i2);

    public abstract void onTargetFpsChanged(int i);
}
