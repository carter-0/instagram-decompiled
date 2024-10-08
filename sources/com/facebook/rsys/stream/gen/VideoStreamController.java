package com.facebook.rsys.stream.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

public abstract class VideoStreamController {
    public static 2LV CONVERTER = C22181Xwr.A00(64);

    public final class CProxy extends VideoStreamController {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoStreamController createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int getError();

        public native void handleData(byte[] bArr);

        public native void handleFrame(RSVideoFrame rSVideoFrame);

        public native int hashCode();

        public native void setCapturePropertiesListener(VideoCapturePropertiesListener videoCapturePropertiesListener);

        public native void setEnable(boolean z);

        public native void setVideoStreamSendParams(VideoStreamSendParams videoStreamSendParams);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoStreamController)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract int getError();

    public abstract void handleData(byte[] bArr);

    public abstract void handleFrame(RSVideoFrame rSVideoFrame);

    public abstract void setCapturePropertiesListener(VideoCapturePropertiesListener videoCapturePropertiesListener);

    public abstract void setEnable(boolean z);

    public abstract void setVideoStreamSendParams(VideoStreamSendParams videoStreamSendParams);
}
