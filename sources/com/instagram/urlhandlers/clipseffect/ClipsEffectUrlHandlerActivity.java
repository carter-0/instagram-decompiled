package com.instagram.urlhandlers.clipseffect;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DU;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FFQ;
import X.FG7;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class ClipsEffectUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.urlhandlers.clipseffect.ClipsEffectUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1660153787);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 49830779;
        } else {
            AnonymousClass0wW A0W = DbT.A0W(A0A);
            0qQ.A0B(A0W, 0);
            this.A00 = A0W;
            if (!DbT.A1Z(this)) {
                FFQ.A03(A0A, this);
                finish();
                i = -789622189;
            } else {
                String A0m = DbS.A0m(A0A);
                if (A0m == null || A0m.length() == 0) {
                    finish();
                    i = -1625735516;
                } else {
                    UserSession session = getSession();
                    DbS.A1Z(session);
                    UserSession userSession = session;
                    0qQ.A0B(userSession, 0);
                    if (!FG7.A02(FG7.A00(userSession, A0m, (String) null, false), this, userSession, (AnonymousClass4DU) null, false)) {
                        finish();
                    }
                    i = -1028456847;
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }
}
