package com.msys;

import X.0dV;
import com.facebook.msys.mci.AuthData;
import com.facebook.simplejni.NativeHolder;

public class msysInfraMnsMCFBridgejniDispatcher {
    public static native NativeHolder MCIAccountIdentifierCreateWithAuthDataNative(AuthData authData);

    static {
        0dV.A0C("msysInfraMnsMCFBridgejni");
    }
}
