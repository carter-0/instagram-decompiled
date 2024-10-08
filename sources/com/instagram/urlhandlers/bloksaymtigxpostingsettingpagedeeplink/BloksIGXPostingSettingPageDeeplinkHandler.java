package com.instagram.urlhandlers.bloksaymtigxpostingsettingpagedeeplink;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C46649DiU;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dbb;
import X.FFQ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class BloksIGXPostingSettingPageDeeplinkHandler extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.bloksaymtigxpostingsettingpagedeeplink.BloksIGXPostingSettingPageDeeplinkHandler, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.bloksaymtigxpostingsettingpagedeeplink.BloksIGXPostingSettingPageDeeplinkHandler, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0A;
        int A00 = AnonymousClass0fD.A00(1086912739);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0A = DbT.A0A(intent)) == null) {
            finish();
            i = -771535739;
        } else {
            AnonymousClass0wW session = getSession();
            if (!(session instanceof UserSession)) {
                FFQ.A01(this, A0A, session);
            } else {
                String A0m = DbS.A0m(A0A);
                if (A0m == null) {
                    finish();
                    i = -950434789;
                } else {
                    Uri A09 = DbT.A09(A0m);
                    HashMap A1E = AnonymousClass7TE.A1E();
                    String queryParameter = A09.getQueryParameter("entrypoint");
                    String A0p = DbS.A0p(queryParameter);
                    A1E.put("entrypoint", queryParameter);
                    String queryParameter2 = A09.getQueryParameter("account_id");
                    0qQ.A0C(queryParameter2, A0p);
                    A1E.put("account_id", queryParameter2);
                    Dbb.A13(C46649DiU.A02(session, "com.bloks.www.fxcal.settings.post.account", A1E), this, session);
                }
            }
            i = 1364416575;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
