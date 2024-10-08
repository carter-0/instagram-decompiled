package com.facebook.rsys.videoeffectcommunication.gen;

import X.2LV;
import X.C22179Xwp;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class GetGroupEffectConfirmationCompletion {
    public static 2LV CONVERTER = new C22179Xwp(10);

    public final class CProxy extends GetGroupEffectConfirmationCompletion {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native GetGroupEffectConfirmationCompletion createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onConfirmation(boolean z);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof GetGroupEffectConfirmationCompletion)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onConfirmation(boolean z);
}
