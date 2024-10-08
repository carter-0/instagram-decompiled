package com.instagram.urlhandlers.directthreaddeletion;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C309516Yo;
import X.C48860ElM;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class DirectThreadDeletionUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(-1266596411);
        super.onCreate(bundle);
        AnonymousClass0wW A0S = DbS.A0S(this);
        AnonymousClass0wW r0 = null;
        if (A0S instanceof UserSession) {
            r0 = A0S;
        }
        C309516Yo A0M = DbS.A0M(this, r0);
        A0M.A0B((Bundle) null, C48860ElM.A00("deeplink"));
        A0M.A0D = false;
        A0M.A0F = true;
        A0M.A04();
        AnonymousClass0fD.A07(2064046522, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
