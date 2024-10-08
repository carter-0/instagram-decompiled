package com.facebook.rsys.crypto.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class CryptoApi {
    public static 2LV CONVERTER = C71546Omh.A00(28);

    public final class CProxy extends CryptoApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CryptoApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void ackNewDeviceNotifications(ArrayList arrayList);

        public native void ackUiDisplayedParticipantIds(ArrayList arrayList);

        public native int hashCode();

        public native void setE2eeMode(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CryptoApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void ackNewDeviceNotifications(ArrayList arrayList);

    public abstract void ackUiDisplayedParticipantIds(ArrayList arrayList);

    public abstract void setE2eeMode(int i);
}
