package com.instagram.urlhandlers.languagesettings;

import X.08y;
import X.09i;
import X.0Gl;
import X.0Tu;
import X.0qQ;
import X.182;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.C309516Yo;
import X.C47432E2e;
import X.C48025ERo;
import X.C49139Eq2;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbX;
import X.Dba;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class LanguageSettingsExternalUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.languagesettings.LanguageSettingsExternalUrlHandlerActivity, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        Fragment e2e;
        int A00 = AnonymousClass0fD.A00(977308490);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null || (A0m = DbS.A0m(A0A)) == null) {
            i = 420338447;
        } else {
            String host = DbT.A09(A0m).getHost();
            08y r4 = 09i.A0A;
            UserSession A002 = 0Gl.A00(r4.A05(this));
            if (0qQ.A0K(host, "app_language_setting")) {
                e2e = C49139Eq2.A00(A002);
            } else {
                if (182.A06(0Tu.A05, A002, 36318483973150865L)) {
                    if (0qQ.A0K(host, "languages_settings")) {
                        e2e = new C48025ERo();
                    } else if (0qQ.A0K(host, "content_language_settings")) {
                        0qQ.A0B(A002, 0);
                        e2e = new C47432E2e();
                        e2e.setArguments(DbV.A0A(A002));
                    }
                }
                i = -1454337972;
            }
            C309516Yo A0B = Dba.A0B(this, r4.A05(this));
            A0B.A0D(e2e);
            A0B.A04();
            i = -1403628920;
        }
        AnonymousClass0fD.A07(i, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
