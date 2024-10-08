package com.facebook.rsys.netobject.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class RawDataListener {
    public static 2LV CONVERTER = C22181Xwr.A00(23);

    public final class CProxy extends RawDataListener {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native RawDataListener createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void onDataReceived(String str, byte[] bArr);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof RawDataListener)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void onDataReceived(String str, byte[] bArr);
}
