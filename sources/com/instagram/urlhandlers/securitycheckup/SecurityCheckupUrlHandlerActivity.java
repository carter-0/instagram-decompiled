package com.instagram.urlhandlers.securitycheckup;

import X.00y;
import X.08y;
import X.09i;
import X.0hq;
import X.0qQ;
import X.1ES;
import X.1NY;
import X.1OC;
import X.1P0;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TG;
import X.C48105EVx;
import X.C49814F8b;
import X.C50128FQl;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbX;
import X.DbZ;
import X.DwC;
import X.FFQ;
import X.H4J;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class SecurityCheckupUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "security_checkup_url_handler_activity";
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Integer A0l;
        int A00 = AnonymousClass0fD.A00(197213394);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            08y r5 = 09i.A0A;
            if (r5.A05(this) != null) {
                if (!(r5.A05(this) instanceof UserSession)) {
                    FFQ.A02(this, A0A, r5);
                    finish();
                    i = 73026374;
                } else {
                    String A0m = DbS.A0m(A0A);
                    if (A0m != null) {
                        AnonymousClass0wW A05 = r5.A05(this);
                        Uri A09 = DbT.A09(A0m);
                        C50128FQl.A00(getSupportFragmentManager(), this, 26);
                        String queryParameter = A09.getQueryParameter("use_case");
                        if (queryParameter == null) {
                            A0l = Integer.valueOf(C48105EVx.PROACTIVE.A00);
                        } else {
                            A0l = 00y.A0l(queryParameter);
                        }
                        1NY A0L = DbZ.A0L(A05);
                        A0L.A0A("security_checkup/start/");
                        A0L.A09(A0l, "use_case");
                        1OC A0S = DbU.A0S(A0L, DwC.class, C49814F8b.class);
                        0hq A0F = DbT.A0F(this);
                        AnonymousClass0wW A052 = r5.A05(this);
                        0qQ.A0C(A052, AnonymousClass000.A00(333));
                        AnonymousClass7TG.A1U(A0F, this, A052);
                        1P0 h4j = new H4J(A0F);
                        h4j.A00 = A0F;
                        h4j.A01 = this;
                        h4j.A02 = A052;
                        A0S.A00 = h4j;
                        1ES.A03(A0S);
                        i = 1569514612;
                    } else {
                        finish();
                        i = -1839206357;
                    }
                }
                AnonymousClass0fD.A07(i, A00);
            }
        }
        finish();
        i = 1481416160;
        AnonymousClass0fD.A07(i, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
