package com.instagram.urlhandlers.nido;

import X.AnonymousClass7TG;
import X.DbS;
import X.DbT;
import X.FFC;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class NidoExplainerDeeplinkHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, com.instagram.urlhandlers.nido.NidoExplainerDeeplinkHandlerActivity, android.app.Activity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        String queryParameter;
        AnonymousClass7TG.A1O(userSession, bundle2);
        String A0m = DbS.A0m(bundle2);
        if (A0m == null || A0m.length() == 0 || (queryParameter = DbT.A09(A0m).getQueryParameter("params")) == null || queryParameter.length() == 0) {
            finish();
        } else {
            FFC.A03(userSession, this, A0m);
        }
    }
}
