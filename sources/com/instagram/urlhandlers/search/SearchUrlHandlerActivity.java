package com.instagram.urlhandlers.search;

import X.08y;
import X.09i;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C14137TqX;
import X.C14398TvR;
import X.C309516Yo;
import X.DbS;
import X.Dba;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class SearchUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Twa, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(2123990378);
        super.onCreate(bundle);
        08y r2 = 09i.A0A;
        UserSession A05 = r2.A05(this);
        DbS.A1Z(A05);
        C14398TvR.A00();
        C14137TqX A03 = new Object().A03(A05);
        C309516Yo A0B = Dba.A0B(this, r2.A05(this));
        A0B.A0D(A03);
        A0B.A04();
        AnonymousClass0fD.A07(-603874631, A00);
    }

    public final AnonymousClass0wW getSession() {
        return 09i.A0A.A05(this);
    }
}
