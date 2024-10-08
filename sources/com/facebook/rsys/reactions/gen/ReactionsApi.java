package com.facebook.rsys.reactions.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class ReactionsApi {
    public static 2LV CONVERTER = C22181Xwr.A00(47);

    public final class CProxy extends ReactionsApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native ReactionsApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void sendEmoji(SendEmojiInputModel sendEmojiInputModel);

        public native void setAllowedGifDomains(ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof ReactionsApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void sendEmoji(SendEmojiInputModel sendEmojiInputModel);

    public abstract void setAllowedGifDomains(ArrayList arrayList);
}
