package com.facebook.rsys.cowatch.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class CowatchLoggingApi {

    public final class CProxy extends CowatchLoggingApi {
        public final NativeHolder mNativeHolder;

        public static native CowatchLoggingApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native int hashCode();

        public native void logEvent(int i, String str, String str2);

        public native void logImpressions(ArrayList arrayList, String str);

        public native void logVideoSelect(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z);

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchLoggingApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void logEvent(int i, String str, String str2);

    public abstract void logImpressions(ArrayList arrayList, String str);

    public abstract void logVideoSelect(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z);
}
