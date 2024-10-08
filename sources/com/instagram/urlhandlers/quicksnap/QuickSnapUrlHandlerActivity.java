package com.instagram.urlhandlers.quicksnap;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C49086EpB;
import X.C71172bH;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbZ;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class QuickSnapUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.urlhandlers.quicksnap.QuickSnapUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        String A0m;
        int A00 = AnonymousClass0fD.A00(-1492126556);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (!(A0A == null || (A0m = DbS.A0m(A0A)) == null)) {
            UserSession A0S = DbS.A0S(this);
            if (A0S instanceof UserSession) {
                UserSession userSession = A0S;
                Uri A09 = DbT.A09(A0m);
                String host = A09.getHost();
                if (host != null && host.hashCode() == -1756943393 && host.equals("quick_snap_details")) {
                    if (C71172bH.A00() != null) {
                        String queryParameter = A09.getQueryParameter("media_id");
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                        0qQ.A0B(userSession, 1);
                        C49086EpB.A00(this, userSession, queryParameter, true);
                    } else {
                        DbZ.A0v(this, A09);
                    }
                }
            } else {
                FFQ.A01(this, A0A, A0S);
                AnonymousClass0fD.A07(-1106007620, A00);
            }
        }
        finish();
        AnonymousClass0fD.A07(-1106007620, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
