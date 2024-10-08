package com.facebook.rsys.starrating.gen;

import X.2LV;
import X.C56915IHk;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class StarRatingApi {
    public static 2LV CONVERTER = new C56915IHk(1);

    public final class CProxy extends StarRatingApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native StarRatingApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void dismissStarRating();

        public native int hashCode();

        public native void onUserInteraction();

        public native void submitStarRating(int i, String str, Long l);

        public native void submitStarRatingShown(int i);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof StarRatingApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void dismissStarRating();

    public abstract void onUserInteraction();

    public abstract void submitStarRating(int i, String str, Long l);

    public abstract void submitStarRatingShown(int i);
}
