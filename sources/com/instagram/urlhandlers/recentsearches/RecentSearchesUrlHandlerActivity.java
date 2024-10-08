package com.instagram.urlhandlers.recentsearches;

import X.09i;
import X.0qQ;
import X.1WK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C14407Tva;
import X.C15398Uc1;
import X.C309516Yo;
import X.DbU;
import X.DbW;
import X.DbX;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class RecentSearchesUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.urlhandlers.recentsearches.RecentSearchesUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1299366931);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 1161485310;
        } else {
            AnonymousClass0wW A04 = 09i.A0A.A04(A0A);
            this.A00 = A04;
            if (A04 == null || !(A04 instanceof UserSession)) {
                1WK A003 = FFQ.A00();
                AnonymousClass0wW r0 = this.A00;
                0qQ.A0A(r0);
                A003.A00(this, A0A, r0);
                finish();
            } else {
                C309516Yo A0Q = DbU.A0Q(this, A04);
                A0Q.A0D = false;
                C15398Uc1 uc1 = new C15398Uc1();
                A0A.putSerializable("edit_searches_type", C14407Tva.BLENDED);
                A0A.putString("argument_parent_module_name", "recent_searches_url");
                DbW.A0x(A0A, uc1, A0Q);
            }
            i = -1383026753;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
