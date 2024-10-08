package com.instagram.urlhandlers.marketingactivationhub;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.DbS;
import X.DbU;
import X.DbX;
import X.Dbb;
import X.K4i;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class MarketingActivationHubExternalUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.marketingactivationhub.MarketingActivationHubExternalUrlHandlerActivity, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(562560330);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -1166472616;
        } else {
            UserSession A0S = DbS.A0S(this);
            0qQ.A0B(A0S, 1);
            DbU.A1D(A0A, A0S);
            K4i k4i = new K4i();
            k4i.setArguments(A0A);
            Dbb.A13(k4i, this, A0S);
            i = 76166030;
        }
        AnonymousClass0fD.A07(i, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
