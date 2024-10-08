package com.facebook.wamsys.wcc;

import X.0dV;
import com.facebook.simplejni.NativeHolder;

public class XMPPStats {
    public final NativeHolder mNativeHolder;

    public native int getCompressedBytes();

    public native int getEncodedBytes();

    public native int getEncryptedBytes();

    static {
        0dV.A0C("wamsysjni");
    }

    public XMPPStats(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
