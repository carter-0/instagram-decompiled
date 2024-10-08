package com.instagram.urlhandlers.clipslane;

import X.1WK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C49167EqY;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class ClipsLaneUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.clipslane.ClipsLaneUrlHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        String queryParameter;
        int A002 = AnonymousClass0fD.A00(-415733683);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            this.A00 = DbT.A0W(A0A);
            String A0m = DbS.A0m(A0A);
            if (!(A0m == null || A0m.length() == 0)) {
                UserSession userSession = this.A00;
                if (!(userSession instanceof UserSession)) {
                    A0A.putBoolean("ARGUMENT_SHOW_LOGIN_FOR_CONTENT_DIALOG", true);
                    1WK A003 = FFQ.A00();
                    AnonymousClass0wW r0 = this.A00;
                    if (r0 != null) {
                        A003.A00(this, A0A, r0);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    DbS.A1Z(userSession);
                    UserSession userSession2 = userSession;
                    Uri A09 = DbT.A09(A0m);
                    String queryParameter2 = A09.getQueryParameter("media_ids");
                    if (!(queryParameter2 == null || (queryParameter = A09.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) == null)) {
                        C49167EqY.A00(userSession2, queryParameter2, queryParameter);
                    }
                    AnonymousClass0fD.A07(-876645422, A002);
                    return;
                }
            }
            finish();
            AnonymousClass0fD.A07(-876645422, A002);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A07(-1541373784, A002);
        throw A0y;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
