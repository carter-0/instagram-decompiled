package com.instagram.urlhandlers.smbsupportlinksetup;

import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C309516Yo;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbX;
import X.Dba;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class SmbSupportLinkSetupUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.smbsupportlinksetup.SmbSupportLinkSetupUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A002 = AnonymousClass0fD.A00(-1530529355);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            AnonymousClass0wW A0W = DbT.A0W(A0A);
            this.A00 = A0W;
            String A0j = AnonymousClass7TG.A0j();
            String stringExtra = getIntent().getStringExtra("entrypoint");
            if (!(A0W instanceof UserSession)) {
                FFQ.A01(this, A0A, A0W);
            } else if (stringExtra != null) {
                0qQ.A0B(A0W, 0);
                DbU.A0v();
                Bundle A0a = AnonymousClass7TE.A0a();
                Dba.A0v(A0a, stringExtra, A0j);
                AnonymousClass4DH r0 = new AnonymousClass4DH();
                r0.setArguments(A0a);
                C309516Yo A0M = DbV.A0M(r0, this, A0W);
                A0M.A0D = false;
                A0M.A04();
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = 1363828683;
            }
            AnonymousClass0fD.A07(-810881708, A002);
            return;
        }
        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
        i = -2022586262;
        AnonymousClass0fD.A07(i, A002);
        throw illegalStateException;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
