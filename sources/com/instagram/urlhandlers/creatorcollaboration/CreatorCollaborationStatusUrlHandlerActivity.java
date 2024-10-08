package com.instagram.urlhandlers.creatorcollaboration;

import X.08y;
import X.09i;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.DbS;
import X.DbV;
import X.DbX;
import X.DbZ;
import X.E45;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class CreatorCollaborationStatusUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.creatorcollaboration.CreatorCollaborationStatusUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.creatorcollaboration.CreatorCollaborationStatusUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(-1194750258);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -511730266;
        } else {
            Bundle A0A = DbX.A0A(this);
            if (A0A == null) {
                finish();
                i = -902025417;
            } else if (DbS.A0m(A0A) == null) {
                finish();
                i = -1103546262;
            } else {
                AnonymousClass0wW session = getSession();
                if (!(session instanceof UserSession)) {
                    FFQ.A01(this, A0A, session);
                } else {
                    E45 e45 = new E45();
                    DbZ.A1B(e45, "args_entrypoint", "qp");
                    C309516Yo A0M = DbV.A0M(e45, this, session);
                    A0M.A0F = true;
                    A0M.A0D = false;
                    A0M.A04();
                }
                i = -2059034783;
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
