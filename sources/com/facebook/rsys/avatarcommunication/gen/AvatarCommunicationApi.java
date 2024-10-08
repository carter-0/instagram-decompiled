package com.facebook.rsys.avatarcommunication.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class AvatarCommunicationApi {
    public static 2LV CONVERTER = C22180Xwq.A00(9);

    public final class CProxy extends AvatarCommunicationApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native AvatarCommunicationApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native McfReference createAvatarsDataProviderDelegate(String str);

        public native int hashCode();

        public native void sendUsingAvatars(boolean z);

        public native void setAvatarPostCallMimicryUpsellEligibility(boolean z);

        public native void setAvatarsLoadState(int i);

        public native void setCodecAvatarSurveyEligibility(boolean z);

        public native void setListener(AvatarCommunicationListener avatarCommunicationListener);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof AvatarCommunicationApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract McfReference createAvatarsDataProviderDelegate(String str);

    public abstract void sendUsingAvatars(boolean z);

    public abstract void setAvatarPostCallMimicryUpsellEligibility(boolean z);

    public abstract void setAvatarsLoadState(int i);

    public abstract void setCodecAvatarSurveyEligibility(boolean z);

    public abstract void setListener(AvatarCommunicationListener avatarCommunicationListener);
}
