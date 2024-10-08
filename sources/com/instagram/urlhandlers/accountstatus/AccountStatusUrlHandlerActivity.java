package com.instagram.urlhandlers.accountstatus;

import X.0qQ;
import X.1pl;
import X.AnonymousClass0iw;
import X.AnonymousClass7TG;
import X.C21270XRp;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.O3B;
import android.os.Bundle;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class AccountStatusUrlHandlerActivity extends UserSessionUrlHandlerActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.urlhandlers.accountstatus.AccountStatusUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1O(userSession, bundle2);
        String A0m = DbS.A0m(bundle2);
        if (A0m == null) {
            finish();
            return;
        }
        String queryParameter = DbT.A09(A0m).getQueryParameter("location");
        1pl A00 = O3B.A00();
        C21270XRp xRp = (C21270XRp) EnumHelper.A00(queryParameter, C21270XRp.A1F);
        0qQ.A07(xRp);
        DbV.A1O(DbU.A0P((Bundle) null, 1pl.A00(this, this, userSession2, xRp, A00, (String) null, (String) null).A03(), this, userSession));
    }

    public final String getModuleName() {
        return "account_status_url_handler";
    }
}
