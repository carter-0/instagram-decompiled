package com.facebook.rsys.callmanager.gen;

import X.2LV;
import X.C71546Omh;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

public class ApiBag {
    public static 2LV CONVERTER = C71546Omh.A00(18);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    public static native ApiBag createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(Map map, CallApi callApi);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native Map getApis();

    public native CallApi getCall();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ApiBag)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public ApiBag(Map map, CallApi callApi) {
        map.getClass();
        callApi.getClass();
        this.mNativeHolder = initNativeHolder(map, callApi);
    }

    public ApiBag(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
