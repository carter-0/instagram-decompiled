package com.instagram.urlhandlers.achievements;

import X.08y;
import X.09i;
import X.0sr;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C229102mq;
import X.C54928HYk;
import X.C71172bH;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbX;
import X.DbZ;
import X.Dba;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class IgAchievementsUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.achievements.IgAchievementsUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.content.Context, com.instagram.urlhandlers.achievements.IgAchievementsUrlHandlerActivity, android.app.Activity] */
    public final void A0n(UserSession userSession, String str) {
        AnonymousClass7TG.A1N(userSession, str);
        if (C71172bH.A00() != null) {
            FragmentActivity A00 = C71172bH.A00();
            DbS.A1X(A00);
            FragmentActivity fragmentActivity = A00;
            if (!C229102mq.A00(fragmentActivity).A12() && !C229102mq.A00(fragmentActivity).A0G) {
                Uri A09 = DbT.A09(str);
                String A0h = DbZ.A0h(A09);
                String queryParameter = A09.getQueryParameter("challenge_id");
                String queryParameter2 = A09.getQueryParameter("show_earned");
                Dba.A12(C54928HYk.A00(DbV.A0m(queryParameter2), A0h, queryParameter, 0sr.A1N(A09.getQueryParameter("achievement_id"))), DbS.A0M(fragmentActivity, userSession));
            } else if (isFinishing() || isDestroyed()) {
                return;
            }
        } else {
            DbZ.A0v(this, DbT.A09(str));
        }
        finish();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.achievements.IgAchievementsUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(-45486667);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -1899852879;
        } else {
            Bundle A0A = DbX.A0A(this);
            if (A0A == null) {
                finish();
                i = 1361176575;
            } else {
                String A0m = DbS.A0m(A0A);
                if (A0m == null) {
                    finish();
                    i = 688662612;
                } else {
                    UserSession session = getSession();
                    if (!(session instanceof UserSession)) {
                        FFQ.A01(this, A0A, session);
                    } else {
                        A0n(session, A0m);
                    }
                    i = -1398019049;
                }
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
