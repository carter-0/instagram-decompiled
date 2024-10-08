package com.facebook.rsys.callinfo.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class CallInfoReadCallback {
    public static 2LV CONVERTER = C22180Xwq.A00(20);

    public final class CProxy extends CallInfoReadCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native CallInfoReadCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void complete(CallInfo callInfo, ArrayList arrayList);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallInfoReadCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void complete(CallInfo callInfo, ArrayList arrayList);
}
