package com.instagram.urlhandlers.inject;

import X.08y;
import X.09i;
import X.0cp;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class InjectUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.inject.InjectUrlHandlerActivity, java.lang.Object, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        Uri A03;
        int A00 = AnonymousClass0fD.A00(1785553301);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            08y r1 = 09i.A0A;
            if (r1.A05(this) instanceof UserSession) {
                String A0m = DbS.A0m(A0A);
                if (!(A0m == null || (A03 = 0cp.A03(A0m)) == null || DbT.A0v(A03) == null)) {
                    A03.getQueryParameter("surface");
                }
            } else {
                FFQ.A02(this, A0A, r1);
            }
        }
        finish();
        AnonymousClass0fD.A07(-831597485, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
