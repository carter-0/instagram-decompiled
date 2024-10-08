package com.instagram.urlhandlers.avatareditor;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C50195FTb;
import X.C63556Kz5;
import X.DbS;
import X.DbX;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class AvatarEditorUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, com.instagram.urlhandlers.avatareditor.AvatarEditorUrlHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        String A0m;
        int A00 = AnonymousClass0fD.A00(-1554328575);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null || (A0m = DbS.A0m(A0A)) == null) {
            finish();
        } else {
            UserSession A0S = DbS.A0S(this);
            if (A0S instanceof UserSession) {
                C63556Kz5.A01.A02(this, new C50195FTb(this, 8), A0S, "ig_deeplink", "ig_deeplink", A0m);
            } else {
                FFQ.A01(this, A0A, A0S);
            }
        }
        AnonymousClass0fD.A07(-1772292641, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
