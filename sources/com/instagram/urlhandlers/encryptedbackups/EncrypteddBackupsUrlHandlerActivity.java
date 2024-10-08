package com.instagram.urlhandlers.encryptedbackups;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass65D;
import X.AnonymousClass65E;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C309516Yo;
import X.C69184Nga;
import X.C69271NiX;
import X.C69901Nu3;
import X.C72203OyT;
import X.DbS;
import X.DbT;
import X.DbV;
import X.J9J;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class EncrypteddBackupsUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.urlhandlers.encryptedbackups.EncrypteddBackupsUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1O(userSession, bundle2);
        String A0m = DbS.A0m(bundle2);
        if (A0m == null || A0m.length() == 0) {
            finish();
            return;
        }
        Uri A09 = DbT.A09(A0m);
        if (0qQ.A0K(A09.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), "settings")) {
            C309516Yo A0M = DbS.A0M(this, userSession);
            A0M.A0D(new C69184Nga());
            DbV.A1O(A0M);
            return;
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        Integer num = AnonymousClass05K.A15;
        A0a.putString("BUNDLE_ENTRY_POINT", "UNKNOWN");
        A0a.putString("BUNDLE_SURFACE", C69271NiX.FULLSCREEN_MODAL.toString());
        AnonymousClass65E A00 = AnonymousClass65D.A00(userSession);
        C72203OyT A002 = C69901Nu3.A00(userSession, num);
        A002.A06(new J9J(6, A09, this, A00, A0a, userSession2, A002));
    }
}
