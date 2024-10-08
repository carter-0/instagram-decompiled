package com.facebook.rsys.turnallocation.gen;

import X.2LV;
import X.C71545Omg;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public abstract class TurnAllocationProxy {
    public static 2LV CONVERTER = new C71545Omg(11);

    public final class CProxy extends TurnAllocationProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native TurnAllocationProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native void allocate(int i, String str, String str2, String str3, String str4, TurnAllocationCallback turnAllocationCallback);

        public native void allocateMultipleRelays(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, TurnAllocationCallback turnAllocationCallback);

        public native int hashCode();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof TurnAllocationProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void allocate(int i, String str, String str2, String str3, String str4, TurnAllocationCallback turnAllocationCallback);

    public abstract void allocateMultipleRelays(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, TurnAllocationCallback turnAllocationCallback);
}
