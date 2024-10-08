package com.facebook.rsys.camera.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class CameraApi {
    public static 2LV CONVERTER = C71546Omh.A00(24);

    public final class CProxy extends CameraApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CameraApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void declineVideoPrompt();

        public native void enableCamera(boolean z);

        public native void handleCameraEviction(String str);

        public native void handleFrame(RSVideoFrame rSVideoFrame);

        public native int hashCode();

        public native void setActiveCamera(Camera camera);

        public native void setCameraAccess(boolean z);

        public native void setCameraList(ArrayList arrayList);

        public native void setCameraStallHandler(CameraStallHandler cameraStallHandler);

        public native void setCameraState(int i);

        public native void setTargetStreamInfo(StreamInfo streamInfo);

        public native void stopDualCamera(boolean z);

        public native void switchCamera();

        public native void switchInput(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CameraApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void declineVideoPrompt();

    public abstract void enableCamera(boolean z);

    public abstract void handleCameraEviction(String str);

    public abstract void handleFrame(RSVideoFrame rSVideoFrame);

    public abstract void setActiveCamera(Camera camera);

    public abstract void setCameraAccess(boolean z);

    public abstract void setCameraList(ArrayList arrayList);

    public abstract void setCameraStallHandler(CameraStallHandler cameraStallHandler);

    public abstract void setCameraState(int i);

    public abstract void setTargetStreamInfo(StreamInfo streamInfo);

    public abstract void stopDualCamera(boolean z);

    public abstract void switchCamera();

    public abstract void switchInput(int i);
}
