package com.msys.mcf;

import X.0dV;
import com.facebook.simplejni.NativeHolder;

public class mcfMCFBridgejniDispatcher {
    public static native NativeHolder MCFURLCreateWithFileSystemPathNative(String str, boolean z);

    public static native NativeHolder MCFURLCreateWithStringNative(String str);

    static {
        0dV.A0C("mcfMCFBridgejni");
    }
}
