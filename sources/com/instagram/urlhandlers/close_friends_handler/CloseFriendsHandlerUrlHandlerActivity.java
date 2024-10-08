package com.instagram.urlhandlers.close_friends_handler;

import X.08y;
import X.09i;
import X.0Gl;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C62040KXc;
import X.DbS;
import X.DbX;
import X.Dbb;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class CloseFriendsHandlerUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.close_friends_handler.CloseFriendsHandlerUrlHandlerActivity, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(1603620394);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        08y r1 = 09i.A0A;
        if (r1.A05(this) == null || !(r1.A05(this) instanceof UserSession)) {
            FFQ.A02(this, A0A, r1);
        } else {
            Dbb.A13(new C62040KXc(), this, 0Gl.A00(r1.A05(this)));
        }
        AnonymousClass0fD.A07(-1951608794, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
