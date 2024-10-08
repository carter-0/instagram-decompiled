package com.instagram.urlhandlers.directinboxhandler;

import X.08y;
import X.09i;
import X.0Gl;
import X.0qQ;
import X.1as;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C273624mt;
import X.C309516Yo;
import X.DbS;
import X.DbX;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class DirectInboxHandlerUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.directinboxhandler.DirectInboxHandlerUrlHandlerActivity, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(1017706635);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        08y r1 = 09i.A0A;
        if (r1.A05(this) == null || !(r1.A05(this) instanceof UserSession)) {
            FFQ.A02(this, A0A, r1);
        } else {
            UserSession A002 = 0Gl.A00(r1.A05(this));
            C273624mt A09 = 1as.A04.A02.A09((String) null, (String) null, false);
            C309516Yo A0M = DbS.A0M(this, A002);
            0qQ.A0A(A09);
            A0M.A0B((Bundle) null, A09);
            A0M.A0D = false;
            A0M.A04();
        }
        AnonymousClass0fD.A07(301500098, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
