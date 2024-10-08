package com.instagram.direct.msys.reverb;

import X.OSF;
import com.facebook.simplejni.NativeHolder;
import java.util.List;
import java.util.Map;

public class ReverbErrors {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(Map map, List list);

    public native Map getMessageLevelErrors();

    public native List getTopLevelErrors();

    static {
        OSF.A00();
    }

    public ReverbErrors(Map map, List list) {
        this.mNativeHolder = initNativeHolder(map, list);
    }

    public ReverbErrors(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
