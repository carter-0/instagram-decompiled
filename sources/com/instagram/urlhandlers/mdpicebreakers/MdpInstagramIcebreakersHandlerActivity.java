package com.instagram.urlhandlers.mdpicebreakers;

import X.0qQ;
import X.1WK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C309516Yo;
import X.DbT;
import X.DbU;
import X.Dba;
import X.ESS;
import X.FFQ;
import X.OyN;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment;

public final class MdpInstagramIcebreakersHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.mdpicebreakers.MdpInstagramIcebreakersHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1331721345);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle bundleExtra = intent.getBundleExtra("com.instagram.url.extra.BUNDLE");
        if (bundleExtra == null) {
            i = -1860075691;
        } else {
            UserSession A0W = DbT.A0W(bundleExtra);
            this.A00 = A0W;
            if (A0W == null) {
                i = 1039593486;
            } else {
                if (!(A0W instanceof UserSession)) {
                    1WK A003 = FFQ.A00();
                    AnonymousClass0wW r1 = this.A00;
                    0qQ.A0A(r1);
                    A003.A00(this, getIntent().getBundleExtra("com.instagram.url.extra.BUNDLE"), r1);
                } else {
                    UserSession userSession = A0W;
                    0qQ.A0A(userSession);
                    OyN A004 = OyN.A00(userSession);
                    0qQ.A07(A004);
                    synchronized (A004) {
                        A004.A05 = null;
                    }
                    A004.A05();
                    String stringExtra = intent.getStringExtra("entrypoint");
                    if ("business_hub".equals(stringExtra) || "pro_home".equals(stringExtra) || "inbox_tool".equals(stringExtra)) {
                        C309516Yo A0B = Dba.A0B(this, this.A00);
                        A0B.A0F = true;
                        A0B.A0B((Bundle) null, new DirectIceBreakerSettingFragment());
                        A0B.A04();
                    } else {
                        C309516Yo A0B2 = Dba.A0B(this, this.A00);
                        A0B2.A0F = true;
                        A0B2.A0B((Bundle) null, new ESS());
                        A0B2.A04();
                        C309516Yo A0Q = DbU.A0Q(this, this.A00);
                        A0Q.A0B((Bundle) null, new DirectIceBreakerSettingFragment());
                        A0Q.A04();
                    }
                }
                i = -2090218155;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
