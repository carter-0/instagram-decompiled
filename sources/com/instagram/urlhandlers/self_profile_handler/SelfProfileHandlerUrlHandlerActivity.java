package com.instagram.urlhandlers.self_profile_handler;

import X.08y;
import X.09i;
import X.0Gl;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C46447Df9;
import X.C46548Dgp;
import X.DbS;
import X.DbU;
import X.DbX;
import X.DbY;
import X.Dbb;
import X.FFQ;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class SelfProfileHandlerUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.self_profile_handler.SelfProfileHandlerUrlHandlerActivity, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(-1026114275);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        08y r1 = 09i.A0A;
        if (r1.A05(this) == null || !(r1.A05(this) instanceof UserSession)) {
            FFQ.A02(this, A0A, r1);
        } else {
            UserSession A002 = 0Gl.A00(r1.A05(this));
            Fragment A003 = C46447Df9.A00(A002, C46548Dgp.A00(A002, "deep_link", "SelfProfileHandlerUrlHandlerActivity"));
            Bundle A08 = DbY.A08(A003);
            DbU.A1D(A08, A002);
            A003.setArguments(A08);
            Dbb.A13(A003, this, A002);
        }
        AnonymousClass0fD.A07(-445580309, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
