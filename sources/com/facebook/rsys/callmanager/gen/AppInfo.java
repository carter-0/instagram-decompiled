package com.facebook.rsys.callmanager.gen;

import X.2LV;
import X.C22180Xwq;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

public class AppInfo {
    public static 2LV CONVERTER = C22180Xwq.A00(23);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native AppInfo createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, String str2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native String getAppId();

    public native String getDeviceId();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AppInfo)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public AppInfo(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AppInfo(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.mNativeHolder = initNativeHolder(str, str2);
    }
}
