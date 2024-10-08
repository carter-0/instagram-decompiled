package com.instagram.urlhandlers.creatoractivation;

import X.0c9;
import X.0kg;
import X.0wb;
import X.AnonymousClass0iw;
import X.AnonymousClass7TG;
import X.DbS;
import X.DbT;
import X.F5I;
import X.FHB;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;
import java.io.IOException;
import java.util.HashMap;

public final class BloksPartnershipDeeplinkHandler extends UserSessionUrlHandlerActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.urlhandlers.creatoractivation.BloksPartnershipDeeplinkHandler, android.app.Activity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        HashMap hashMap;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1O(userSession, bundle2);
        String A0m = DbS.A0m(bundle2);
        if (A0m != null) {
            String queryParameter = DbT.A09(A0m).getQueryParameter("params");
            if (queryParameter != null) {
                try {
                    hashMap = F5I.A00(0c9.A04.A01(userSession, queryParameter));
                } catch (IOException unused) {
                    0wb.A01(0kg.A03, "BloksPartnershipDeeplinkHandler", "Failed to parse params from Uri");
                }
                FHB.A0D(this, this, userSession2, "com.bloks.www.igca.partnership.inapp.optin.flow", "BloksPartnershipDeeplinkHandler", hashMap);
            }
            hashMap = null;
            FHB.A0D(this, this, userSession2, "com.bloks.www.igca.partnership.inapp.optin.flow", "BloksPartnershipDeeplinkHandler", hashMap);
        }
        finish();
    }

    public final String getModuleName() {
        return "BloksPartnershipDeeplinkHandler";
    }
}
