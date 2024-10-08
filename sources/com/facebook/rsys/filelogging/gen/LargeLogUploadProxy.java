package com.facebook.rsys.filelogging.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class LargeLogUploadProxy {
    public static 2LV CONVERTER = C22180Xwq.A00(49);

    public final class CProxy extends LargeLogUploadProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native LargeLogUploadProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void setStructuredLogger(McfReference mcfReference);

        public native void uploadConsoleLog(String str, String str2);

        public native void uploadOnDemand(byte[] bArr);

        public native void uploadRtcEventLog(String str, String str2);

        public native void uploadSdpLog(String str, String str2);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LargeLogUploadProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void setStructuredLogger(McfReference mcfReference);

    public abstract void uploadConsoleLog(String str, String str2);

    public abstract void uploadOnDemand(byte[] bArr);

    public abstract void uploadRtcEventLog(String str, String str2);

    public abstract void uploadSdpLog(String str, String str2);
}
