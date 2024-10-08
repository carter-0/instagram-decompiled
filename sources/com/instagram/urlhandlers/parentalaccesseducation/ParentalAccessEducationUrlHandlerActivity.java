package com.instagram.urlhandlers.parentalaccesseducation;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C309516Yo;
import X.C47442E2o;
import X.DbS;
import X.Dba;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class ParentalAccessEducationUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(-693727510);
        super.onCreate(bundle);
        AnonymousClass0wW A0S = DbS.A0S(this);
        AnonymousClass0wW r0 = null;
        if (A0S instanceof UserSession) {
            r0 = A0S;
        }
        C309516Yo A0B = Dba.A0B(this, r0);
        A0B.A0B((Bundle) null, new C47442E2o());
        A0B.A04();
        AnonymousClass0fD.A07(-1297950089, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
