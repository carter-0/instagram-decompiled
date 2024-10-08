package com.facebook.rsys.photobooth.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class PhotoboothApi {
    public static 2LV CONVERTER = C71546Omh.A00(69);

    public final class CProxy extends PhotoboothApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native PhotoboothApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void cancelPhotoboothSession();

        public native int hashCode();

        public native void sendSnapshotNotification();

        public native void startPhotoboothSession();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof PhotoboothApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void cancelPhotoboothSession();

    public abstract void sendSnapshotNotification();

    public abstract void startPhotoboothSession();
}
