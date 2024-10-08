package com.instagram.urlhandlers.blokscommerceappeal;

import X.0Yt;
import X.0eP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C309516Yo;
import X.C46649DiU;
import X.C49891FBs;
import X.DbS;
import X.DbT;
import X.DbV;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class BloksCommerceAppealUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.urlhandlers.blokscommerceappeal.BloksCommerceAppealUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, bundle2);
        String string = bundle2.getString("original_url");
        if (string != null) {
            Uri A09 = DbT.A09(string);
            String queryParameter = A09.getQueryParameter("media_id");
            String queryParameter2 = A09.getQueryParameter("action");
            String queryParameter3 = A09.getQueryParameter("source");
            if (!(queryParameter == null || queryParameter2 == null || queryParameter3 == null)) {
                C309516Yo A0M = DbV.A0M(C49891FBs.A02(DbS.A0N(userSession), C46649DiU.A04("com.bloks.www.commerce.media_untagging_appeals", 0Yt.A02(new 0eP[]{AnonymousClass7TE.A1L("ig_media_id", queryParameter), AnonymousClass7TE.A1L("action", queryParameter2), AnonymousClass7TE.A1L("source", queryParameter3)}))), this, userSession);
                A0M.A0D = false;
                A0M.A04();
                return;
            }
        }
        finish();
    }
}
