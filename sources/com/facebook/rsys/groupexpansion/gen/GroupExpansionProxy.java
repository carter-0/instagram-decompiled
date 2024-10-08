package com.facebook.rsys.groupexpansion.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class GroupExpansionProxy {
    public static 2LV CONVERTER = C71546Omh.A00(39);

    public final class CProxy extends GroupExpansionProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native GroupExpansionProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void expand(String str, String str2, ArrayList arrayList, ArrayList arrayList2, int i, int i2, GroupExpansionCompletedCallback groupExpansionCompletedCallback);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof GroupExpansionProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void expand(String str, String str2, ArrayList arrayList, ArrayList arrayList2, int i, int i2, GroupExpansionCompletedCallback groupExpansionCompletedCallback);
}
