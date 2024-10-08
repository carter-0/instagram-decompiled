package com.instagram.urlhandlers.viewleadsformedia;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbY;
import X.FFQ;
import X.W2F;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class ViewLeadsForMediaUrlHandlerActivity extends BaseFragmentActivity {
    public UserSession A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.viewleadsformedia.ViewLeadsForMediaUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.urlhandlers.viewleadsformedia.ViewLeadsForMediaUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        Bundle A0A;
        int A002 = AnonymousClass0fD.A00(-1656060454);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || (A0A = DbT.A0A(intent)) == null) {
            finish();
            i = 426999905;
        } else {
            this.A00 = DbS.A0U(A0A);
            String A0m = DbS.A0m(A0A);
            if (A0m == null || A0m.length() == 0) {
                finish();
            } else {
                String lastPathSegment = DbT.A09(A0m).getLastPathSegment();
                if (lastPathSegment == null) {
                    lastPathSegment = "";
                }
                if (!DbT.A1Z(this)) {
                    FFQ.A03(A0A, this);
                } else {
                    AnonymousClass0wW session = getSession();
                    0qQ.A0B(session, 1);
                    W2F.A01(this, session, "com.bloks.www.ig.smb.services.lead_gen.lead_gen_info", DbY.A0m("lead_gen_info_id", lastPathSegment));
                }
            }
            i = 1620645778;
        }
        AnonymousClass0fD.A07(i, A002);
    }
}
