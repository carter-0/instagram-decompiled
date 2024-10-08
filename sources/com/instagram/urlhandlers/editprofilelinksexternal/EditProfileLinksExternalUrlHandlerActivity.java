package com.instagram.urlhandlers.editprofilelinksexternal;

import X.08y;
import X.09i;
import X.0qQ;
import X.0xY;
import X.1Au;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C46447Df9;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbX;
import X.E3F;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class EditProfileLinksExternalUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.editprofilelinksexternal.EditProfileLinksExternalUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.editprofilelinksexternal.EditProfileLinksExternalUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        String str;
        int A00 = AnonymousClass0fD.A00(-620236549);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (!DbT.A1Z(this)) {
            FFQ.A03(A0A, this);
        } else {
            UserSession session = getSession();
            if (A0A != null) {
                str = DbS.A0m(A0A);
            } else {
                str = null;
            }
            boolean z = false;
            if (!(str == null || str.length() == 0)) {
                String queryParameter = DbT.A09(str).getQueryParameter("show_fb_page_link_dialog");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                z = queryParameter.equals("true");
            }
            if (z) {
                0qQ.A0C(session, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
                0xY A0p = AnonymousClass7TE.A0p(1Au.A00(session));
                A0p.E5T("should_show_facebook_page_link_dialog", true);
                A0p.apply();
            }
            C46447Df9.A03();
            0qQ.A0C(session, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
            Bundle A0a = AnonymousClass7TE.A0a();
            E3F e3f = new E3F();
            e3f.setArguments(A0a);
            DbV.A1O(DbU.A0P((Bundle) null, e3f, this, session));
        }
        AnonymousClass0fD.A07(-1576054632, A00);
    }
}
