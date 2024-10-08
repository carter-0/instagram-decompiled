package com.instagram.urlhandlers.businesssuitehub;

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
import X.DbX;
import X.Dba;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

public final class MetaBusinessSuiteHubUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.businesssuitehub.MetaBusinessSuiteHubUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.businesssuitehub.MetaBusinessSuiteHubUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(-772057558);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -1684370951;
        } else {
            if (!DbT.A1Z(this)) {
                FFQ.A03(A0A, this);
            }
            if (DbS.A0m(A0A) == null) {
                finish();
                i = -1396329327;
            } else {
                String string = A0A.getString("entry_ref");
                if (string == null) {
                    string = "";
                }
                AnonymousClass0wW session = getSession();
                HashMap A0f = Dba.A0f("entry_ref", string);
                C309516Yo A0M = DbS.A0M(this, session);
                C46649DiU A04 = C46649DiU.A04("com.instagram.hubs.meta_business_suite.mbs_hub.MBSHubScreen", A0f);
                IgBloksScreenConfig A0N = DbS.A0N(session);
                A0N.A0k = false;
                A0M.A0D(C49891FBs.A02(A0N, A04));
                A0M.A0D = false;
                A0M.A04();
                i = -2142741207;
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
