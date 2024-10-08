package com.instagram.urlhandlers.reelstrends;

import X.08y;
import X.09i;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C55169HdL;
import X.C67231sQ;
import X.DbX;
import X.FFQ;
import X.HM8;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class ReelsTrendsUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.reelstrends.ReelsTrendsUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.reelstrends.ReelsTrendsUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(1775180273);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            A0A = AnonymousClass7TE.A0a();
        }
        UserSession session = getSession();
        if (!(session instanceof UserSession)) {
            FFQ.A00().A00(this, A0A, session);
        } else {
            C55169HdL.A00().A01(this, (C67231sQ) null, session, (HM8) null, (List) null);
            finish();
        }
        AnonymousClass0fD.A07(-1620074301, A00);
    }
}
