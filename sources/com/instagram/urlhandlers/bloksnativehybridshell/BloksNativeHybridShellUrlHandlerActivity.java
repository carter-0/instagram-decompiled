package com.instagram.urlhandlers.bloksnativehybridshell;

import X.0qQ;
import X.1WK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C227812jx;
import X.C309516Yo;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FFQ;
import android.os.Bundle;
import com.facebook.endtoend.EndToEnd;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class BloksNativeHybridShellUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.urlhandlers.bloksnativehybridshell.BloksNativeHybridShellUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        int A002 = AnonymousClass0fD.A00(815493102);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null || (A0m = DbS.A0m(A0A)) == null || A0m.length() == 0 || !EndToEnd.isRunningEndToEndTest()) {
            finish();
            i = -1412012386;
        } else {
            AnonymousClass0wW A0W = DbT.A0W(A0A);
            this.A00 = A0W;
            if (!(A0W instanceof UserSession)) {
                1WK A003 = FFQ.A00();
                AnonymousClass0wW r0 = this.A00;
                0qQ.A0A(r0);
                A003.A00(this, A0A, r0);
                i = -1293062968;
            } else {
                C309516Yo A0M = DbS.A0M(this, A0W);
                A0M.A0D(new C227812jx());
                A0M.A04();
                i = 2053595211;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
