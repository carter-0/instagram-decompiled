package com.facebook.rsys.avatarcommunication.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class AvatarCommunicationProxy {
    public static 2LV CONVERTER = C22180Xwq.A00(12);

    public final class CProxy extends AvatarCommunicationProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AvatarCommunicationProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void fetchAvatarPresetAssets();

        public native void fetchCodecAvatarSurveyEligibility();

        public native int hashCode();

        public native void onAvatarsUsedInCall();

        public native void setApi(AvatarCommunicationApi avatarCommunicationApi);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AvatarCommunicationProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void fetchAvatarPresetAssets();

    public abstract void fetchCodecAvatarSurveyEligibility();

    public abstract void onAvatarsUsedInCall();

    public abstract void setApi(AvatarCommunicationApi avatarCommunicationApi);
}
