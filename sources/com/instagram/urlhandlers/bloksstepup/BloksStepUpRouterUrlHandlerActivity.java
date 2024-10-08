package com.instagram.urlhandlers.bloksstepup;

import X.08y;
import X.09i;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C46649DiU;
import X.C49891FBs;
import X.DbS;
import X.DbT;
import X.Dba;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class BloksStepUpRouterUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.bloksstepup.BloksStepUpRouterUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A002 = AnonymousClass0fD.A00(941041054);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        08y r1 = 09i.A0A;
        if (A0A != null) {
            UserSession A06 = r1.A06(A0A);
            this.A00 = A06;
            String stringExtra = intent.getStringExtra("flow_type");
            if (stringExtra != null) {
                String stringExtra2 = intent.getStringExtra("flow_params");
                String stringExtra3 = intent.getStringExtra("ref");
                String stringExtra4 = intent.getStringExtra("upl_session_id");
                HashMap A0f = Dba.A0f("flow_type", stringExtra);
                A0f.put("flow_params", stringExtra2);
                A0f.put("ref", stringExtra3);
                A0f.put("upl_session_id", stringExtra4);
                C309516Yo A0M = DbS.A0M(this, A06);
                C46649DiU A04 = C46649DiU.A04("com.bloks.www.bloks.universal_link.step_up.router", A0f);
                IgBloksScreenConfig A0N = DbS.A0N(A06);
                A0N.A0U = "";
                A0M.A0D(C49891FBs.A02(A0N, A04));
                A0M.A0D = false;
                A0M.A04();
                AnonymousClass0fD.A07(2001368951, A002);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 1803012069;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 1457067585;
        }
        AnonymousClass0fD.A07(i, A002);
        throw illegalStateException;
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
