package com.facebook.realtime.common.appstate;

import X.C67481td;
import X.C67501tf;

public class AppStateGetter implements C67481td, C67501tf {
    public final C67481td mAppForegroundStateGetter;
    public final C67501tf mAppNetworkStateGetter;

    public boolean isAppForegrounded() {
        return this.mAppForegroundStateGetter.isAppForegrounded();
    }

    public boolean isAppSuspended() {
        return this.mAppForegroundStateGetter.isAppSuspended();
    }

    public boolean isNetworkConnected() {
        return this.mAppNetworkStateGetter.isNetworkConnected();
    }

    public AppStateGetter(C67481td r1, C67501tf r2) {
        this.mAppForegroundStateGetter = r1;
        this.mAppNetworkStateGetter = r2;
    }
}
