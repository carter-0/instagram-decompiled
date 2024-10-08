package com.facebook.rsys.videorender.gen;

import X.2LV;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.simplejni.NativeHolder;

public abstract class VideoRenderApi {
    public static 2LV CONVERTER = new C71545Omg(15);

    public final class CProxy extends VideoRenderApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoRenderApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native VideoRenderSurface createRenderSurface();

        public native int hashCode();

        public native void removeRenderTarget(String str, Object obj, StreamInfo streamInfo);

        public native void setDisplayResolution(String str, int i, int i2, int i3);

        public native void setPeerVideoSuppressed(boolean z, String str);

        public native void setRenderTarget(String str, Object obj, StreamInfo streamInfo);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoRenderApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract VideoRenderSurface createRenderSurface();

    public abstract void removeRenderTarget(String str, Object obj, StreamInfo streamInfo);

    public abstract void setDisplayResolution(String str, int i, int i2, int i3);

    public abstract void setPeerVideoSuppressed(boolean z, String str);

    public abstract void setRenderTarget(String str, Object obj, StreamInfo streamInfo);
}
