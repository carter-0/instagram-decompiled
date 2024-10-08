package com.instagram.urlhandlers.sharecollections;

import X.0qQ;
import X.AnonymousClass06Q;
import X.AnonymousClass7TG;
import X.C309516Yo;
import X.C50128FQl;
import X.C54665HMw;
import X.C55115HcO;
import X.C56344Hwv;
import X.DbS;
import X.DbT;
import X.HMH;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class ShareCollectionsUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final AnonymousClass06Q A00 = new C50128FQl(this, 29);

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.urlhandlers.sharecollections.ShareCollectionsUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        String queryParameter;
        AnonymousClass7TG.A1O(userSession, bundle2);
        String A0m = DbS.A0m(bundle2);
        if (A0m == null || (queryParameter = DbT.A09(A0m).getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) == null) {
            finish();
            return;
        }
        getSupportFragmentManager().A0s(this.A00);
        C309516Yo A0M = DbS.A0M(this, userSession);
        C55115HcO.A00();
        String str = userSession.A05;
        0qQ.A0B(str, 0);
        A0M.A0D(C56344Hwv.A01(HMH.COLLECTION_FEED, C54665HMw.MEDIA, str, queryParameter, "ig_direct_url_handler"));
        A0M.A04();
    }
}
