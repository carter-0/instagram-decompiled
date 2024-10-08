package com.instagram.urlhandlers.bloksfbpagecreationdeeplink;

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
import X.FUY;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;

public final class BloksFbPageCreationDeeplinkHandler extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.urlhandlers.bloksfbpagecreationdeeplink.BloksFbPageCreationDeeplinkHandler, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        return Dbb.A0M(DbX.A0A(this));
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.urlhandlers.bloksfbpagecreationdeeplink.BloksFbPageCreationDeeplinkHandler, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0A;
        HashMap hashMap;
        int A00 = AnonymousClass0fD.A00(-1935873419);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0A = DbT.A0A(intent)) == null) {
            finish();
            i = 1560359797;
        } else {
            UserSession session = getSession();
            if (session != null) {
                if (!(session instanceof UserSession)) {
                    FFQ.A01(this, A0A, session);
                    finish();
                    i = 255638762;
                } else {
                    String A0m = DbS.A0m(A0A);
                    if (A0m == null) {
                        finish();
                        i = -1741940637;
                    } else {
                        UserSession userSession = session;
                        String queryParameter = DbT.A09(A0m).getQueryParameter("params");
                        if (queryParameter != null) {
                            try {
                                hashMap = F5I.A01(userSession, queryParameter);
                            } catch (IOException e) {
                                0KC.A0F("BloksFbPageCreationDeeplinkHandler", "IOException while parseParams()", e);
                            }
                            FHB.A0D(this, new FUY(), userSession, "com.bloks.www.ig.ccp_onboarding.fb_page_creation_screen.action", "BloksFbPageCreationDeeplinkHandler", hashMap);
                        }
                        hashMap = null;
                        FHB.A0D(this, new FUY(), userSession, "com.bloks.www.ig.ccp_onboarding.fb_page_creation_screen.action", "BloksFbPageCreationDeeplinkHandler", hashMap);
                    }
                }
            }
            finish();
            i = -2039164049;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
