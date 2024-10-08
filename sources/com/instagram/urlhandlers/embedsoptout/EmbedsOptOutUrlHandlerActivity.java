package com.instagram.urlhandlers.embedsoptout;

import X.08y;
import X.09i;
import X.1QK;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0t1;
import X.AnonymousClass0wW;
import X.AnonymousClass2ZQ;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C71172bH;
import X.DbS;
import X.DbV;
import X.DbX;
import X.ESG;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class EmbedsOptOutUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.embedsoptout.EmbedsOptOutUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.embedsoptout.EmbedsOptOutUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(710920144);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        UserSession session = getSession();
        if (!(session instanceof UserSession)) {
            FFQ.A01(this, A0A, session);
            finish();
            i = 1402640774;
        } else if (AnonymousClass0t1.A01.A01(session).A0N() != AnonymousClass05K.A0C) {
            C309516Yo A0M = DbS.A0M(this, session);
            A0M.A0D(new ESG());
            DbV.A1O(A0M);
            i = 1889172697;
        } else {
            AnonymousClass2ZQ A002 = C71172bH.A00();
            if (A002 != null) {
                A002.Eng(1QK.A0C);
            }
            finish();
            i = -1607754715;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
