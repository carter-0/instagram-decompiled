package com.instagram.debug.devoptions.debughead.data.provider;

import X.0qQ;
import X.AnonymousClass00P;
import com.instagram.debug.devoptions.debughead.data.delegates.AppStartupDelegate;

public final class DebugHeadAppStartupListener {
    public AppStartupDelegate delegate;

    public final void onEndStartup(long j, String str) {
        0qQ.A0B(str, 1);
        getDelegate().onEndStartup(j, str);
    }

    public final void setAppStartupDelegate(AppStartupDelegate appStartupDelegate) {
        0qQ.A0B(appStartupDelegate, 0);
        this.delegate = appStartupDelegate;
    }

    public final void setDelegate(AppStartupDelegate appStartupDelegate) {
        0qQ.A0B(appStartupDelegate, 0);
        this.delegate = appStartupDelegate;
    }

    public final AppStartupDelegate getDelegate() {
        AppStartupDelegate appStartupDelegate = this.delegate;
        if (appStartupDelegate != null) {
            return appStartupDelegate;
        }
        0qQ.A0F("delegate");
        throw AnonymousClass00P.createAndThrow();
    }
}
