package com.facebook.react.bridge;

import X.C13431TaJ;
import X.C13566Tcm;
import X.C13568Tco;
import X.C13569Tcp;

public interface CatalystInstance extends C13566Tcm, C13568Tco, C13569Tcp {
    void callFunction(String str, String str2, NativeArray nativeArray);

    void destroy();

    JavaScriptModule getJSModule(Class cls);

    NativeModule getNativeModule(Class cls);

    void invokeCallback(int i, C13431TaJ taJ);

    void registerSegment(int i, String str);
}
