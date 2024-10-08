package com.instagram.urlhandlers.bloksaccountsetupigbackcatalogdeeplink;

import X.0KC;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dbb;
import X.F5I;
import X.FFQ;
import X.FHB;
import X.FUV;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;

public final class BloksAccountSetupIGBackCatalogDeeplinkHandler extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.urlhandlers.bloksaccountsetupigbackcatalogdeeplink.BloksAccountSetupIGBackCatalogDeeplinkHandler, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        return Dbb.A0M(DbX.A0A(this));
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.bloksaccountsetupigbackcatalogdeeplink.BloksAccountSetupIGBackCatalogDeeplinkHandler, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0A;
        HashMap hashMap;
        int A00 = AnonymousClass0fD.A00(-72525554);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0A = DbT.A0A(intent)) == null) {
            finish();
            i = 1118799131;
        } else {
            UserSession session = getSession();
            if (session != null) {
                if (!(session instanceof UserSession)) {
                    FFQ.A01(this, A0A, session);
                    finish();
                    i = 2042998312;
                } else {
                    String A0m = DbS.A0m(A0A);
                    if (A0m == null) {
                        finish();
                        i = 1381891047;
                    } else {
                        UserSession userSession = session;
                        String queryParameter = DbT.A09(A0m).getQueryParameter("params");
                        if (queryParameter != null) {
                            try {
                                hashMap = F5I.A01(userSession, queryParameter);
                            } catch (IOException e) {
                                0KC.A0F("BloksAccountSetupIGBackCatalogDeeplinkHandler", "IOException while parseParams()", e);
                            }
                            FHB.A0D(this, new FUV(), userSession, "com.bloks.www.ig.ccp_onboarding.account_setup_ig_back_catalog_landing_page_launcher", "BloksAccountSetupIGBackCatalogDeeplinkHandler", hashMap);
                        }
                        hashMap = null;
                        FHB.A0D(this, new FUV(), userSession, "com.bloks.www.ig.ccp_onboarding.account_setup_ig_back_catalog_landing_page_launcher", "BloksAccountSetupIGBackCatalogDeeplinkHandler", hashMap);
                    }
                }
            }
            finish();
            i = -438810386;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
