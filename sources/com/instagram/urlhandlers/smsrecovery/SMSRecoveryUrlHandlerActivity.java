package com.instagram.urlhandlers.smsrecovery;

import X.0cp;
import X.1WK;
import X.AnonymousClass0BO;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbX;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Set;

public class SMSRecoveryUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.urlhandlers.smsrecovery.SMSRecoveryUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(2063933571);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 1409521070;
        } else {
            this.A00 = DbT.A0W(A0A);
            String A0m = DbS.A0m(A0A);
            if (A0m == null) {
                finish();
                i = 1985950037;
            } else {
                Uri A03 = 0cp.A03(A0m);
                Bundle A0a = AnonymousClass7TE.A0a();
                Set<String> queryParameterNames = A03.getQueryParameterNames();
                if (queryParameterNames.contains("token") && queryParameterNames.contains("utm_medium")) {
                    DbU.A1B(A03, A0a, "token");
                }
                A0A.putAll(A0a);
                A0A.putBoolean("smsrecovery", true);
                UserSession userSession = this.A00;
                if (userSession instanceof UserSession) {
                    UserSession userSession2 = userSession;
                    Bundle bundle2 = AnonymousClass0BO.A00(userSession2).AEO(this, (Uri) null, userSession2, "settings", false).A00;
                    if (bundle2 != null) {
                        bundle2.putAll(A0A);
                    }
                    FFQ.A00().A00(this, bundle2, this.A00);
                } else {
                    1WK A003 = FFQ.A00();
                    AnonymousClass0wW r0 = this.A00;
                    r0.getClass();
                    A003.A00(this, A0A, r0);
                }
                i = -167142681;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
