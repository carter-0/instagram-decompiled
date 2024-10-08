package com.facebook.instagram.msys;

import X.0dV;
import X.AnonymousClass66Y;
import com.facebook.msys.mcs.DasmConfigCreator;
import com.facebook.simplejni.NativeHolder;
import com.mcftypeholder.McfTypeHolder;

public class InstagramDasmConfigCreator extends DasmConfigCreator {
    public static InstagramDasmConfigCreator sInstance;

    private native NativeHolder createDasmConfigNativeHolder();

    public native NativeHolder initNativeHolder();

    static {
        0dV.A0C("InstagramDasmConfigCreator-jni");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.facebook.msys.mcs.DasmConfigCreator, com.facebook.instagram.msys.InstagramDasmConfigCreator] */
    public static InstagramDasmConfigCreator getInstance() {
        InstagramDasmConfigCreator instagramDasmConfigCreator = sInstance;
        if (instagramDasmConfigCreator != null) {
            return instagramDasmConfigCreator;
        }
        ? dasmConfigCreator = new DasmConfigCreator();
        sInstance = dasmConfigCreator;
        return dasmConfigCreator;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.mcftypeholder.McfTypeHolder, X.66Y] */
    public AnonymousClass66Y createDasmConfig() {
        McfTypeHolder mcfTypeHolder = McfTypeHolder.$redex_init_class;
        return new McfTypeHolder(30166406, createDasmConfigNativeHolder());
    }
}
