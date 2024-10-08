package com.instagram.urlhandlers.qpinterstitial;

import X.08y;
import X.09i;
import X.2bK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass1Q2;
import X.AnonymousClass4UC;
import X.AnonymousClass7TE;
import X.C71242bt;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dbb;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Locale;

public final class QpinterstitialUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.qpinterstitial.QpinterstitialUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.qpinterstitial.QpinterstitialUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        AnonymousClass4UC r1;
        C71242bt r0;
        int A00 = AnonymousClass0fD.A00(419156790);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -135466116;
        } else {
            Bundle A0A = DbX.A0A(this);
            if (A0A == null || (A0m = DbS.A0m(A0A)) == null) {
                finish();
                i = -1943463678;
            } else {
                UserSession session = getSession();
                if (!(session instanceof UserSession)) {
                    FFQ.A01(this, A0A, session);
                } else {
                    UserSession userSession = session;
                    Uri A09 = DbT.A09(A0m);
                    String queryParameter = A09.getQueryParameter("surface_nux_id");
                    String queryParameter2 = A09.getQueryParameter("dismiss_last_qp");
                    if (queryParameter2 == null) {
                        queryParameter2 = "false";
                    }
                    boolean equals = queryParameter2.equals("true");
                    String queryParameter3 = A09.getQueryParameter("trigger");
                    2bK r5 = new 2bK(this, userSession);
                    Locale A02 = AnonymousClass1Q2.A02();
                    if (equals) {
                        if (queryParameter3 == null || queryParameter3.length() == 0 || !Dbb.A1b("IG4A_PREFETCH", queryParameter3, A02)) {
                            r1 = 2bK.A05;
                        } else {
                            r1 = 2bK.A04;
                        }
                        if (!(r1 == null || (r0 = 2bK.A06) == null)) {
                            r0.DbJ(r1);
                        }
                    }
                    if (!(queryParameter == null || queryParameter.length() == 0 || !queryParameter.equals(String.valueOf(QuickPromotionSurface.A0B.A00)))) {
                        if (queryParameter3 == null || queryParameter3.length() == 0 || !Dbb.A1b("IG4A_PREFETCH", queryParameter3, A02)) {
                            r5.A02();
                        } else {
                            r5.A03();
                        }
                    }
                    finish();
                }
                i = 823148103;
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
