package com.facebook.rsys.camera.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class CameraStallHandler {
    public static 2LV CONVERTER = C22180Xwq.A00(26);

    public final class CProxy extends CameraStallHandler {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CameraStallHandler createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onCameraStallDetected();

        public native void onCameraStallRecovered();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CameraStallHandler)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onCameraStallDetected();

    public abstract void onCameraStallRecovered();
}
