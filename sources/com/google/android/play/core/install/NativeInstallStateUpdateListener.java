package com.google.android.play.core.install;

import X.2Jf;

public final class NativeInstallStateUpdateListener implements 2Jf {
    public final /* bridge */ /* synthetic */ void Dmy(Object obj) {
        onStateUpdate((InstallState) null);
    }

    public native void onStateUpdate(InstallState installState);
}
