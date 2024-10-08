package com.instagram.urlhandlers.saved;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C309516Yo;
import X.C54177H1x;
import X.C55112HcL;
import X.C55115HcO;
import X.DbS;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class SavedUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(-685439384);
        super.onCreate(bundle);
        AnonymousClass0wW A0S = DbS.A0S(this);
        0qQ.A0C(A0S, AnonymousClass000.A00(2));
        C55115HcO.A00();
        0qQ.A0B(A0S, 0);
        C54177H1x A002 = C55112HcL.A00(A0S, (String) null, false, false, true);
        C309516Yo A0M = DbS.A0M(this, A0S);
        A0M.A0D = false;
        A0M.A0B((Bundle) null, A002);
        A0M.A04();
        AnonymousClass0fD.A07(1731044410, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
