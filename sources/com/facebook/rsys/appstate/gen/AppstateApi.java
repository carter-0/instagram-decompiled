package com.facebook.rsys.appstate.gen;

import X.2LV;
import X.C56915IHk;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class AppstateApi {
    public static 2LV CONVERTER = new C56915IHk(0);

    public final class CProxy extends AppstateApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AppstateApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void setIsBackgrounded(boolean z);

        public native void setIsPictureInPicture(boolean z);

        public native void setIsScreenOff(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AppstateApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void setIsBackgrounded(boolean z);

    public abstract void setIsPictureInPicture(boolean z);

    public abstract void setIsScreenOff(boolean z);
}
