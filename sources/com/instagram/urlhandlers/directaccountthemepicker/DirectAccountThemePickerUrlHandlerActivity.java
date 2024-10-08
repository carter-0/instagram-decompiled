package com.instagram.urlhandlers.directaccountthemepicker;

import X.0Gl;
import X.0qQ;
import X.1vm;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C309516Yo;
import X.C41845B3m;
import X.C42766Bi1;
import X.C45926DFg;
import X.C48823Ekl;
import X.C51966G9m;
import X.C58736Iwj;
import X.C71567On2;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbX;
import X.NJN;
import X.OAO;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Locale;
import java.util.Map;

public final class DirectAccountThemePickerUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public String A00;
    public final UserSession A01 = 0Gl.A00(DbS.A0S(this));

    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "DirectAccountThemePickerUrlHandlerActivity";
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.urlhandlers.directaccountthemepicker.DirectAccountThemePickerUrlHandlerActivity, java.lang.Object, android.app.Activity] */
    public static final void A00(DirectAccountThemePickerUrlHandlerActivity directAccountThemePickerUrlHandlerActivity, boolean z) {
        ? r4 = directAccountThemePickerUrlHandlerActivity;
        UserSession userSession = r4.A01;
        boolean z2 = z;
        C58736Iwj iwj = new C58736Iwj(27, r4, z2);
        0qQ.A0B(userSession, 0);
        C71567On2.A00(new C45926DFg(iwj, 12), new PandoGraphQLRequest(C41845B3m.A05(), "NMEIGBrandedThreadsConfigInfoQuery", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42766Bi1.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "ig_branded_threads_session_user_info", AnonymousClass7TE.A1C()), 1vm.A01(userSession), iwj, 14);
        if (!z2) {
            r4.finish();
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.directaccountthemepicker.DirectAccountThemePickerUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        String str;
        int A002 = AnonymousClass0fD.A00(1338274503);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null || (A0m = DbS.A0m(A0A)) == null) {
            finish();
            i = -194984146;
        } else {
            Uri A09 = DbT.A09(A0m);
            A09.getHost();
            String queryParameter = A09.getQueryParameter("entrypoint");
            this.A00 = queryParameter;
            if (queryParameter != null) {
                str = AnonymousClass7TF.A0j(queryParameter);
            } else {
                str = null;
            }
            if (C51966G9m.A1a(str, DbT.A12(Locale.ROOT, "IG_BENEFITS_CENTER"))) {
                NJN njn = new NJN();
                njn.A00 = new OAO(this);
                UserSession userSession = this.A01;
                C309516Yo A0P = DbU.A0P((Bundle) null, njn, this, userSession);
                A0P.A0D = false;
                A0P.A04();
                String str2 = this.A00;
                0qQ.A0B(userSession, 0);
                C48823Ekl.A00(this, userSession, "branded_chat_interstitial", "impression", "form", str2, (Map) null);
            } else {
                A00(this, false);
            }
            i = -803395493;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
