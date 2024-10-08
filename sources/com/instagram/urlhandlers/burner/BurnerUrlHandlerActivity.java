package com.instagram.urlhandlers.burner;

import X.0qQ;
import X.C309516Yo;
import X.Dba;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsFragment;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class BurnerUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        C309516Yo A0B = Dba.A0B(this, userSession);
        A0B.A0D(new BurnerSendSettingsFragment());
        A0B.A04();
    }
}
