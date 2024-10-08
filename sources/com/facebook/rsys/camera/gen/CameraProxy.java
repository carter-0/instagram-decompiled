package com.facebook.rsys.camera.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class CameraProxy {
    public static 2LV CONVERTER = C71546Omh.A00(26);

    public final class CProxy extends CameraProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CameraProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native ArrayList createAvailableCameras();

        public native int hashCode();

        public native void release();

        public native void setApi(CameraApi cameraApi);

        public native void setCamera(Camera camera);

        public native void setCameraMode(int i);

        public native void setCameraOn(boolean z, int i);

        public native void setTargetCaptureResolution(int i, int i2);

        public native int setTargetCaptureSettings(int i, int i2, int i3);

        public native void setTargetFps(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CameraProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract ArrayList createAvailableCameras();

    public abstract void release();

    public abstract void setApi(CameraApi cameraApi);

    public abstract void setCamera(Camera camera);

    public abstract void setCameraMode(int i);

    public abstract void setCameraOn(boolean z, int i);

    public abstract void setTargetCaptureResolution(int i, int i2);

    public abstract int setTargetCaptureSettings(int i, int i2, int i3);

    public abstract void setTargetFps(int i);
}
