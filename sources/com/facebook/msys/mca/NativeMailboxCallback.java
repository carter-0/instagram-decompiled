package com.facebook.msys.mca;

import X.C66595MYh;
import com.facebook.simplejni.NativeHolder;

public final class NativeMailboxCallback implements MailboxCallback {
    public NativeHolder mNativeHolder;

    public native void onCompletion(Object obj);

    static {
        C66595MYh.A00();
    }

    public NativeMailboxCallback(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
