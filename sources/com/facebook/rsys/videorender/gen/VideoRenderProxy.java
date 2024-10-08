package com.facebook.rsys.videorender.gen;

import X.2LV;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.simplejni.NativeHolder;

public abstract class VideoRenderProxy {
    public static 2LV CONVERTER = new C71545Omg(16);

    public final class CProxy extends VideoRenderProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoRenderProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void renderFrame(RSVideoFrame rSVideoFrame, Object obj, int i);

        public native void setApi(VideoRenderApi videoRenderApi);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoRenderProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void renderFrame(RSVideoFrame rSVideoFrame, Object obj, int i);

    public abstract void setApi(VideoRenderApi videoRenderApi);
}
