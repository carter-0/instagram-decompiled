package com.instagram.urlhandlers.broadcastchannelcontrols;

import X.08y;
import X.09i;
import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C309516Yo;
import X.C66580MXl;
import X.C68473NJl;
import X.C69939Nuf;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dba;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

public final class BroadcastChannelControlsUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.broadcastchannelcontrols.BroadcastChannelControlsUrlHandlerActivity, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        int A00 = AnonymousClass0fD.A00(1060307549);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null || (A0m = DbS.A0m(A0A)) == null || A0m.length() == 0) {
            finish();
            i = 1527633395;
        } else {
            08y r4 = 09i.A0A;
            if (!(r4.A05(this) instanceof UserSession)) {
                finish();
                i = 953010238;
            } else {
                UserSession A05 = r4.A05(this);
                0qQ.A0C(A05, AnonymousClass000.A00(2));
                UserSession userSession = A05;
                String queryParameter = DbT.A09(A0m).getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                if (!(queryParameter == null || queryParameter.length() == 0)) {
                    C68473NJl A002 = C69939Nuf.A00(userSession, C66580MXl.A0g(queryParameter), "qp_deeplink");
                    C309516Yo A0B = Dba.A0B(this, r4.A05(this));
                    A0B.A0D(A002);
                    A0B.A04();
                }
                i = 287290709;
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
