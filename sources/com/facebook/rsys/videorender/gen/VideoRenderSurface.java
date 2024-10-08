package com.facebook.rsys.videorender.gen;

import X.2LV;
import X.C22179Xwp;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class VideoRenderSurface {
    public static 2LV CONVERTER = new C22179Xwp(21);

    public final class CProxy extends VideoRenderSurface {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native VideoRenderSurface createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void addRenderItem(VideoRenderItem videoRenderItem);

        public native int hashCode();

        public native void removeRenderItem(String str, StreamInfo streamInfo);

        public native void setRenderItems(ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof VideoRenderSurface)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void addRenderItem(VideoRenderItem videoRenderItem);

    public abstract void removeRenderItem(String str, StreamInfo streamInfo);

    public abstract void setRenderItems(ArrayList arrayList);
}
