package com.instagram.urlhandlers.hackedaccountsupport;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass3M3;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C46649DiU;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dba;
import X.Fl4;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

public final class HackedAccountSupportUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.hackedaccountsupport.HackedAccountSupportUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.urlhandlers.hackedaccountsupport.HackedAccountSupportUrlHandlerActivity, android.content.Context, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        String A0m;
        int A00 = AnonymousClass0fD.A00(597402918);
        super.onCreate(bundle);
        09i.A0A.A03(new Fl4(7));
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            DbS.A1A(A0A, "IgSessionManager.LOGGED_OUT_TOKEN");
        }
        HashMap A1E = AnonymousClass7TE.A1E();
        if (!(A0A == null || (A0m = DbS.A0m(A0A)) == null)) {
            Dba.A0u(DbT.A09(A0m), "source", A1E);
        }
        C46649DiU A04 = C46649DiU.A04("com.instagram.account_security.hacked_accounts_support.support_form", A1E);
        IgBloksScreenConfig A0N = DbS.A0N(getSession());
        A0N.A0k = false;
        A0N.A0P = AnonymousClass05K.A01;
        AnonymousClass3M3 A0C = A04.A0C(this, A0N);
        C309516Yo A0M = DbS.A0M(this, getSession());
        A0M.A0E = true;
        0qQ.A0A(A0C);
        A0M.A0D(A0C);
        A0M.A04();
        AnonymousClass0fD.A07(1502984438, A00);
    }
}
