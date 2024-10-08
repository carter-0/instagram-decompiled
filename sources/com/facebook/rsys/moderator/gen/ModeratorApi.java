package com.facebook.rsys.moderator.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.HashSet;

public abstract class ModeratorApi {
    public static 2LV CONVERTER = C22181Xwr.A00(13);

    public final class CProxy extends ModeratorApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native ModeratorApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void enableScreenShare(boolean z);

        public native int hashCode();

        public native void softMuteUser(String str);

        public native void softMuteUsers(HashSet hashSet);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof ModeratorApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void enableScreenShare(boolean z);

    public abstract void softMuteUser(String str);

    public abstract void softMuteUsers(HashSet hashSet);
}
