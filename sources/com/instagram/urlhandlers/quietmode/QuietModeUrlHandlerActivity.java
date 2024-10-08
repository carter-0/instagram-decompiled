package com.instagram.urlhandlers.quietmode;

import X.08y;
import X.09i;
import X.0cp;
import X.1We;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.DbS;
import X.DbU;
import X.DbW;
import X.DbX;
import X.DbZ;
import X.EWJ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class QuietModeUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, com.instagram.urlhandlers.quietmode.QuietModeUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        Uri A01;
        int A00 = AnonymousClass0fD.A00(-1903474680);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 1855730406;
        } else {
            08y r7 = 09i.A0A;
            if (!(!(r7.A05(this) instanceof UserSession) || (A0m = DbS.A0m(A0A)) == null || (A01 = 0cp.A01(DbW.A0G(), A0m)) == null)) {
                String A0h = DbZ.A0h(A01);
                if (A0h == null) {
                    A0h = "url";
                }
                UserSession A06 = r7.A06(A0A);
                1We r1 = 1We.A02;
                if (r1 != null) {
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString("entrypoint", A0h);
                    C309516Yo A0P = DbU.A0P(A0a, 1We.A00(r1).A00(A06, EWJ.IG_TS_ENTRY_POINT_STORIES), this, r7.A05(this));
                    A0P.A0D = false;
                    A0P.A04();
                    i = 744478757;
                }
            }
            finish();
            i = 744478757;
        }
        AnonymousClass0fD.A07(i, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
