package com.facebook.rsys.transport.gen;

import X.2LV;
import X.C22179Xwp;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public class StatusUpdate {
    public static 2LV CONVERTER = new C22179Xwp(5);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native StatusUpdate createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native int getSessionsCount();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StatusUpdate)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public StatusUpdate(int i) {
        this.mNativeHolder = initNativeHolder(i);
    }

    public StatusUpdate(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
