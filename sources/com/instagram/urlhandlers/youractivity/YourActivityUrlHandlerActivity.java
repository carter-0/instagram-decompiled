package com.instagram.urlhandlers.youractivity;

import X.08y;
import X.09i;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C273654mx;
import X.C46649DiU;
import X.C49891FBs;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dbb;
import X.FFQ;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;

public final class YourActivityUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.youractivity.YourActivityUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.youractivity.YourActivityUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0A;
        int A00 = AnonymousClass0fD.A00(496547428);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0A = DbT.A0A(intent)) == null) {
            finish();
            i = -350672374;
        } else {
            String A0m = DbS.A0m(A0A);
            if (A0m == null || A0m.length() == 0) {
                finish();
                i = 342559816;
            } else {
                AnonymousClass0wW session = getSession();
                if (!(session instanceof UserSession)) {
                    FFQ.A01(this, A0A, session);
                } else {
                    C46649DiU A04 = C46649DiU.A04(C273654mx.A00(132), AnonymousClass7TE.A1E());
                    IgBloksScreenConfig A0N = DbS.A0N(session);
                    A0N.A0U = "Your activity";
                    Dbb.A13(C49891FBs.A02(A0N, A04), this, session);
                }
                i = -621034905;
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
