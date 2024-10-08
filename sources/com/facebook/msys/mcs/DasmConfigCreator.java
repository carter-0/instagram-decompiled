package com.facebook.msys.mcs;

import X.AnonymousClass66Y;
import com.facebook.simplejni.NativeHolder;

public abstract class DasmConfigCreator {
    public final NativeHolder mNativeHolder = initNativeHolder();

    public abstract AnonymousClass66Y createDasmConfig();

    public abstract NativeHolder initNativeHolder();
}
