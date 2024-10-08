package com.instagram.debug.devoptions.section.msys;

import X.MZA;
import android.widget.CompoundButton;
import com.facebook.advancedcryptotransport.AppInstallContext;
import com.instagram.common.session.UserSession;

public final class ArmadilloMsysOptions$getItems$4 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ UserSession $userSession;

    public ArmadilloMsysOptions$getItems$4(UserSession userSession) {
        this.$userSession = userSession;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AppInstallContext.sShouldFailSendWithEmptyDeviceListEncryptionError = z;
        if (z) {
            MZA.A00(this.$userSession).A00("Enabled next send fail with empty device list error from dev settings");
        }
    }
}
