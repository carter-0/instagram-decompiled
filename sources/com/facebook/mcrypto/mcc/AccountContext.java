package com.facebook.mcrypto.mcc;

import X.0dV;
import com.facebook.simplejni.NativeHolder;

public class AccountContext {
    public final NativeHolder mNativeHolder;

    public native String getFacebookUserID();

    static {
        0dV.A0C("mcryptojni");
    }

    public AccountContext(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
