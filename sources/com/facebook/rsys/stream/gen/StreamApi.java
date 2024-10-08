package com.facebook.rsys.stream.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class StreamApi {
    public static 2LV CONVERTER = C22181Xwr.A00(60);

    public final class CProxy extends StreamApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native StreamApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native VideoStreamController createVideoStream(VideoStreamParams videoStreamParams);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof StreamApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract VideoStreamController createVideoStream(VideoStreamParams videoStreamParams);
}
