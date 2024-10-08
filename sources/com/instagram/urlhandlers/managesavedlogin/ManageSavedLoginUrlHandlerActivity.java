package com.instagram.urlhandlers.managesavedlogin;

import X.1WK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C227812jx;
import X.C309516Yo;
import X.DbT;
import X.DbX;
import X.Dba;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class ManageSavedLoginUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.managesavedlogin.ManageSavedLoginUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(-165347228);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -1322208378;
        } else {
            AnonymousClass0wW A0W = DbT.A0W(A0A);
            this.A00 = A0W;
            if (A0W instanceof UserSession) {
                C309516Yo A0B = Dba.A0B(this, A0W);
                A0B.A0F = true;
                DbT.A15();
                A0B.A0D(new C227812jx());
                A0B.A04();
            } else {
                1WK A003 = FFQ.A00();
                AnonymousClass0wW r0 = this.A00;
                if (r0 != null) {
                    A003.A00(this, A0A, r0);
                    finish();
                } else {
                    IllegalStateException A0y = AnonymousClass7TE.A0y();
                    AnonymousClass0fD.A07(1200094852, A002);
                    throw A0y;
                }
            }
            i = 815399725;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
