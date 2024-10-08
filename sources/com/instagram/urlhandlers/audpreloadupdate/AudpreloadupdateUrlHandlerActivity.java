package com.instagram.urlhandlers.audpreloadupdate;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C314826iu;
import X.C49872FAt;
import X.DbX;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class AudpreloadupdateUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.audpreloadupdate.AudpreloadupdateUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.audpreloadupdate.AudpreloadupdateUrlHandlerActivity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0fD.A00(2126438295);
        super.onCreate(bundle);
        C49872FAt fAt = C49872FAt.A00;
        UserSession session = getSession();
        0qQ.A0C(session, AnonymousClass000.A00(2));
        fAt.A00(this, (C314826iu) null, session);
        AnonymousClass0fD.A07(-496711921, A00);
    }
}
