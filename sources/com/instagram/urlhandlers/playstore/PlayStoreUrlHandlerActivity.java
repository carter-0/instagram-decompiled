package com.instagram.urlhandlers.playstore;

import X.0bY;
import X.0cp;
import X.0oI;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbW;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.base.activity.BaseFragmentActivity;
import java.util.List;

public final class PlayStoreUrlHandlerActivity extends BaseFragmentActivity {
    public final 0bY A00 = DbW.A0G();

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.urlhandlers.playstore.PlayStoreUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A19;
        int A002 = AnonymousClass0fD.A00(-181752981);
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            finish();
            i = 1413808573;
        } else {
            String string = bundleExtra.getString("original_url");
            if (string == null) {
                finish();
                i = -1652316878;
            } else {
                Uri A003 = 0cp.A00(this.A00, string);
                if (A003 == null || A003.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID) == null) {
                    finish();
                    i = 1569018623;
                } else {
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString("app_id", A003.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                    String queryParameter = A003.getQueryParameter("referrer");
                    if (queryParameter != null) {
                        List A0o = DbW.A0o(queryParameter, "\\W+");
                        if (A0o.size() >= 2 && (A19 = AnonymousClass7TE.A19(A0o, 0)) != null && A19.equalsIgnoreCase("utm_source")) {
                            A0a.putString("source", AnonymousClass7TE.A19(A0o, 1));
                        }
                    }
                    0oI.A07(this, A0a.getString("app_id"), A0a.getString("source"));
                    finish();
                    i = 967076366;
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
