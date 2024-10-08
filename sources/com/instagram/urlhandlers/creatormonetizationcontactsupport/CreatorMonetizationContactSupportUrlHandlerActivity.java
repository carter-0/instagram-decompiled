package com.instagram.urlhandlers.creatormonetizationcontactsupport;

import X.002;
import X.0Aj;
import X.0Gl;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0kN;
import X.AnonymousClass0wW;
import X.AnonymousClass3M3;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C309516Yo;
import X.C46649DiU;
import X.DbS;
import X.DbT;
import X.DbX;
import X.Dba;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

public final class CreatorMonetizationContactSupportUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.creatormonetizationcontactsupport.CreatorMonetizationContactSupportUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(856093463);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -335449001;
        } else {
            String A0m = DbS.A0m(A0A);
            if (A0m == null) {
                finish();
                i = 37164553;
            } else {
                this.A00 = DbT.A0W(A0A);
                Uri A09 = DbT.A09(A0m);
                AnonymousClass0wW r0 = this.A00;
                if (r0 != null) {
                    UserSession A003 = 0Gl.A00(r0);
                    String queryParameter = A09.getQueryParameter("product");
                    if ("igtv_ads".equals(queryParameter) || "badges".equals(queryParameter) || "bonuses".equals(queryParameter) || "branded_content".equals(queryParameter) || "fan_club".equals(queryParameter) || "affiliate".equals(queryParameter) || "gifts".equals(queryParameter)) {
                        AnonymousClass3M3 A02 = C46649DiU.A02(A003, "com.instagram.pro_home.monetization_platform.support.contact_support_screen", new HashMap(AnonymousClass7TF.A0w("product", queryParameter)));
                        C309516Yo A0B = Dba.A0B(this, A003);
                        A0B.A0B((Bundle) null, A02);
                        A0B.A04();
                        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01((AnonymousClass0iw) null, A003), "ig_creator_monetization_support_inbox");
                        DbS.A1H(A0e, "contact_support");
                        DbS.A1J(A0e, "enter");
                        A0e.AAJ("client_extra", 002.A0R("help_center_article_", queryParameter));
                        A0e.Cgf();
                    }
                    i = -944634354;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
