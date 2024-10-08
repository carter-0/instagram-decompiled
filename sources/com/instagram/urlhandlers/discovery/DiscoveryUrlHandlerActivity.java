package com.instagram.urlhandlers.discovery;

import X.09i;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TG;
import X.C14398TvR;
import X.C14452Twa;
import X.C15272UZa;
import X.C253063q9;
import X.C309516Yo;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class DiscoveryUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    public final AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [X.Twa, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int i;
        C309516Yo r6;
        Fragment uZa;
        int A002 = AnonymousClass0fD.A00(-527476069);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 257018858;
        } else {
            AnonymousClass0wW A04 = 09i.A0A.A04(A0A);
            0qQ.A0B(A04, 0);
            this.A00 = A04;
            super.onCreate(bundle);
            String string = A0A.getString("original_url");
            if (!(string == null || string.length() == 0)) {
                if (!(getSession() instanceof UserSession)) {
                    FFQ.A03(A0A, this);
                } else {
                    UserSession session = getSession();
                    DbS.A1Z(session);
                    UserSession userSession = session;
                    0qQ.A0B(userSession, 0);
                    Uri A09 = DbT.A09(string);
                    String valueOf = String.valueOf(A09.getPath());
                    String queryParameter = A09.getQueryParameter("q");
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    if ("/search".equals(valueOf)) {
                        r6 = new C309516Yo(this, userSession);
                        C14398TvR.A00();
                        uZa = new Object().A03(userSession);
                    } else if ("/search/keyword".equals(valueOf)) {
                        r6 = new C309516Yo(this, userSession);
                        C14398TvR.A00();
                        new Object();
                        String A0j = AnonymousClass7TG.A0j();
                        String str = null;
                        uZa = new C15272UZa();
                        Bundle A003 = C14452Twa.A00(A0j, queryParameter);
                        A003.putString("argument_prior_module", (String) null);
                        A003.putString("argument_prior_serp_session_id", (String) null);
                        A003.putString("argument_prior_query_text", (String) null);
                        A003.putString("argument_entity_page_id", "0");
                        A003.putBoolean("argument_new_search_session", false);
                        A003.putString("serp_source", (String) null);
                        A003.putString("hcm_serp_source", (String) null);
                        if (C253063q9.A02(queryParameter)) {
                            str = "search_result";
                        }
                        A003.putString("HashtagFeedFragment.ARGUMENT_ENTRY_TRIGGER", str);
                        uZa.setArguments(A003);
                    }
                    r6.A0D(uZa);
                    r6.A04();
                    i = -1144119084;
                }
            }
            finish();
            i = -1144119084;
        }
        AnonymousClass0fD.A07(i, A002);
    }
}
