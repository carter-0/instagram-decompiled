package com.instagram.urlhandlers.igredirect;

import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbX;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

public final class TrustlyRedirectionActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public UserSession A00;

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "trustly_redirection_activity";
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.urlhandlers.igredirect.TrustlyRedirectionActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(949515333);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 2007588067;
        } else {
            String A0m = DbS.A0m(A0A);
            if (A0m == null) {
                finish();
                i = -1684974028;
            } else {
                String queryParameter = DbT.A09(A0m).getQueryParameter("establishData");
                if (queryParameter == null) {
                    finish();
                    i = 1226521263;
                } else {
                    UserSession A0U = DbS.A0U(A0A);
                    this.A00 = A0U;
                    if (A0U == null) {
                        finish();
                        i = 288564358;
                    } else {
                        DbU.A0w(this, AnonymousClass7TG.A0P("IgSessionManager.SESSION_TOKEN_KEY", A0U.A05, AnonymousClass7TE.A1L("establishData", queryParameter)), this.A00, ModalActivity.class, "open_trustly_lightbox");
                        finish();
                        i = 2127593727;
                    }
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
