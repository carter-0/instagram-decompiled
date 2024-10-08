package com.facebook.react.modules.core;

import X.C13947Tm7;
import com.facebook.react.bridge.JavaScriptModule;

public interface JSTimers extends JavaScriptModule {
    void callIdleCallbacks(double d);

    void callTimers(C13947Tm7 tm7);

    void emitTimeDriftWarning(String str);
}
