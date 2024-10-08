package com.facebook.rsys.video.gen;

import X.2LV;
import X.C22179Xwp;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.UserStreamInfo;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

public abstract class MediaProcessor {
    public static 2LV CONVERTER = new C22179Xwp(8);

    public final class CProxy extends MediaProcessor {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native MediaProcessor createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native boolean processFrame(RSVideoFrame rSVideoFrame, UserStreamInfo userStreamInfo);

        public native void setFrameCallback(UserStreamInfo userStreamInfo, ProcessedFrameCallbacks processedFrameCallbacks);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof MediaProcessor)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract boolean processFrame(RSVideoFrame rSVideoFrame, UserStreamInfo userStreamInfo);

    public abstract void setFrameCallback(UserStreamInfo userStreamInfo, ProcessedFrameCallbacks processedFrameCallbacks);
}
