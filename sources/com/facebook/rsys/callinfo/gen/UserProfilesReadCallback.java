package com.facebook.rsys.callinfo.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class UserProfilesReadCallback {
    public static 2LV CONVERTER = C22180Xwq.A00(21);

    public final class CProxy extends UserProfilesReadCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native UserProfilesReadCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void complete(ArrayList arrayList);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof UserProfilesReadCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void complete(ArrayList arrayList);
}
