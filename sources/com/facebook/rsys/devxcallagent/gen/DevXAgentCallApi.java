package com.facebook.rsys.devxcallagent.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class DevXAgentCallApi {
    public static 2LV CONVERTER = C71546Omh.A00(34);

    public final class CProxy extends DevXAgentCallApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native DevXAgentCallApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native DevXAgentCallConfig copyCallConfig(String str);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DevXAgentCallApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract DevXAgentCallConfig copyCallConfig(String str);
}
