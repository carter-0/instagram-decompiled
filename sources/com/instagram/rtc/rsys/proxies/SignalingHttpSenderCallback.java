package com.instagram.rtc.rsys.proxies;

import X.2LV;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

public abstract class SignalingHttpSenderCallback {
    public static 2LV CONVERTER = new C71545Omg(30);

    public final class CProxy extends SignalingHttpSenderCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native SignalingHttpSenderCallback createFromMcfType(McfReference mcfReference);

        public static native void gotHttpResponseJson(SignalingHttpSenderCallback signalingHttpSenderCallback, String str, int i);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void gotHttpResponse(Map map, int i);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof SignalingHttpSenderCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void gotHttpResponse(Map map, int i);
}
