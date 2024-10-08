package com.facebook.react.modules.debug;

import X.0qQ;
import X.C13946Tlt;
import X.QZK;
import com.facebook.fbreact.specs.NativeDevMenuSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "DevMenu")
public final class DevMenuModule extends NativeDevMenuSpec {
    public final C13946Tlt devSupportManager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DevMenuModule(QZK qzk, C13946Tlt tlt) {
        super(qzk);
        0qQ.A0B(tlt, 2);
        this.devSupportManager = tlt;
    }

    public void setProfilingEnabled(boolean z) {
    }

    public void debugRemotely(boolean z) {
    }

    public void reload() {
    }

    public void setHotLoadingEnabled(boolean z) {
    }

    public void show() {
    }
}
