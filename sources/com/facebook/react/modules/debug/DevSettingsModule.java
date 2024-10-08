package com.facebook.react.modules.debug;

import X.0qQ;
import X.C13946Tlt;
import X.QZK;
import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "DevSettings")
public final class DevSettingsModule extends NativeDevSettingsSpec {
    public final C13946Tlt devSupportManager;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DevSettingsModule(QZK qzk, C13946Tlt tlt) {
        super(qzk);
        0qQ.A0B(tlt, 2);
        this.devSupportManager = tlt;
    }

    public void addListener(String str) {
    }

    public void addMenuItem(String str) {
        0qQ.A0B(str, 0);
    }

    public void onFastRefresh() {
    }

    public void removeListeners(double d) {
    }

    public void setIsShakeToShowDevMenuEnabled(boolean z) {
    }

    public void openDebugger() {
    }

    public void reload() {
    }

    public void reloadWithReason(String str) {
    }

    public void setHotLoadingEnabled(boolean z) {
    }

    public void setIsDebuggingRemotely(boolean z) {
    }

    public void setProfilingEnabled(boolean z) {
    }

    public void toggleElementInspector() {
    }
}
